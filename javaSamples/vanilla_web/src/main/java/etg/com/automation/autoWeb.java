package etg.com.automation;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class autoWeb {
    public static void main(String[] args) {
        Scanner scans = new Scanner( System.in );
        System.out.println("Hola! Bienvenido a la automatizacion Web, como te llamas? ");
        String miFokinNombre = scans.nextLine();
        System.out.println("Hola, " + miFokinNombre + ", vamos a ingresar a un sitio web");
        System.out.println("Ingresa la URL: ");
        String urlStr = scans.nextLine();
    
        try {
            //Verificar la compatibilidad del escritorio para acceder a la web
            if (Desktop.isDesktopSupported()) {

            //Obtener instancia de nuestro escritorio
            Desktop etgDesktop = Desktop.getDesktop();

            //Ir a la URL
            etgDesktop.browse(new URI(urlStr));
            System.out.println("Ingresando al sitio web");
        } 
            else {
            System.out.println("El escritorio no es compatible we");
            }

            //Crear objeto URL
            URL url = new URL(urlStr);

            //Abrir conexion con el sitio web  
            HttpURLConnection conc = (HttpURLConnection) url.openConnection();
            conc.setRequestMethod("GET");

            //Obtener respuesta de la web
            int responseCode = conc.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conc.getInputStream()));
                String inputLine;
                StringBuilder cont = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    cont.append(inputLine);
                }

                //Cerrar conexiones
                in.close();
                conc.disconnect();

                //Imprimir contenido del sitio web
                System.out.println("Contenido del sitio");
                System.out.println(cont.toString());
            }
            else {
                System.out.println("No se pudo conectar al sitio" + responseCode);
            }
        } catch (Exception ex) {
            System.out.println("Ocurrio un problema: " + ex.getMessage());
        }
        finally {
            scans.close();
    
        }
    }
}
