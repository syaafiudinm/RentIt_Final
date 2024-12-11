package com.example.rentit.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(onLoginSuccess: () -> Unit, navHostController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    // Error messages states
    var emailError by remember { mutableStateOf("") }
    var passwordError by remember { mutableStateOf("") }

    // Form validation status
    var isFormValid by remember { mutableStateOf(false) }

    // Handle button click to trigger validation
    val handleLoginClick = {
        // Run validation when the button is clicked
        val validationResult = validateLoginForm(email, password)
        emailError = validationResult.emailError
        passwordError = validationResult.passwordError
        isFormValid = validationResult.isValid

        // If form is valid, call onLoginSuccess and navigate to next screen
        if (isFormValid) {
            onLoginSuccess() // Call your success handler
            navHostController.navigate("intro") // Navigate to next screen
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Email Field
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                isError = emailError.isNotEmpty(),
                singleLine = true
            )
            if (emailError.isNotEmpty()) {
                Text(
                    text = emailError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.align(Alignment.Start)
                )
            }

            // Password Field
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                visualTransformation = PasswordVisualTransformation(),
                isError = passwordError.isNotEmpty(),
                singleLine = true
            )
            if (passwordError.isNotEmpty()) {
                Text(
                    text = passwordError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.align(Alignment.Start)
                )
            }

            // Login Button
            Button(
                onClick = handleLoginClick,  // Trigger validation when clicked
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black
                )
            ) {
                Text(
                    text = "Login",
                    color = Color.White // White text color
                )
            }
            Text(
                text = "Apakah Anda belum memiliki akun? daftar di sini",
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .clickable { navHostController.navigate("register") }
            )
        }
    }
}

// Validation function for Login form
fun validateLoginForm(email: String, password: String): ValidationLoginResult {
    var isValid = true
    var emailError = ""
    var passwordError = ""

    if (email.isEmpty() || !isValidLoginEmail(email)) {
        emailError = "Valid email is required"
        isValid = false
    }

    if (password.isEmpty() || password.length < 6) {
        passwordError = "Password must be at least 6 characters"
        isValid = false
    }

    return ValidationLoginResult(emailError, passwordError, isValid)
}

// Helper function to validate email format
fun isValidLoginEmail(email: String): Boolean {
    val emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$".toRegex()
    return email.matches(emailPattern)
}

// Data class to hold the validation result
data class ValidationLoginResult(
    val emailError: String,
    val passwordError: String,
    val isValid: Boolean
)
