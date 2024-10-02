document.getElementById("loginForm").onsubmit = function(event) {
    event.preventDefault(); // Prevent form submission

    // Get the username and password input values
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    // Placeholder for login logic (this should connect to a backend for real verification)
    console.log("Attempting to login:", username);

    // Example verification process
    if (username === "provider@example.com" && password === "password") {
        // Redirect to provider dashboard or show success message
        alert("Login successful! Redirecting to your dashboard...");
        window.location.href = "provider.html"; // Redirect to the provider dashboard
    } else {
        alert("Invalid credentials. Please try again.");
    }
};
