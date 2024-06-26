<!DOCTYPE html>
<html lang="en">
<head>
       <title>Form Validation</title>
</head>
<body>
    <h2>Registration</h2>
    <form id="registrationForm" onsubmit="return validateRegistration()">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <button type="submit">Register</button>
    </form>

    <h2>Login</h2>
    <form id="loginForm" onsubmit="return validateLogin()">
        <label for="loginEmail">Email:</label>
        <input type="email" id="loginEmail" name="loginEmail" required><br><br>

        <label for="loginPassword">Password:</label>
        <input type="password" id="loginPassword" name="loginPassword" required><br><br>

        <button type="submit">Login</button>
    </form>

    <script>
        function validateRegistration() {
            var name = document.getElementById('name').value<6;
            var email = document.getElementById('email').value;
            var password = document.getElementById('password').value;

            // Basic validation
            if (username.trim() === '' || email.trim() === '' || password.trim() === '') {
                alert('Please fill in all fields.');
                return false;
            }

            // Additional validation logic can be added here

            return true;
        }

        function validateLogin() {
            var loginEmail = document.getElementById('loginEmail').value;
            var loginPassword = document.getElementById('loginPassword').value;

            // Basic validation
            if (loginEmail.trim() === '' || loginPassword.trim() === '') {
                alert('Please fill in all fields.');
                return false;
            }

            // Additional validation logic can be added here

            return true;
        }
    </script>
</body>
</html>
