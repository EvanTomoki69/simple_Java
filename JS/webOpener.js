document.addEventListener('DOMContentLoaded', function() {
     // Get references to the input and button elements
     const urlInput = document.getElementById('urlInput');
     const openButton = document.getElementById('openButton');
 
     // Add an event listener to the button
     openButton.addEventListener('click', function() {
         // Get the URL from the input field
         let url = urlInput.value.trim();
 
         // Validate the URL
         if (url) {
             // Ensure the URL starts with https://
             if (!url.startsWith("https://")) {
                 url = "https://" + url;
             }
 
             // Open the URL in a new tab
             window.open(url, '_blank');
         } else {
             alert("Please enter a valid URL.");
         }
     });
 });
 