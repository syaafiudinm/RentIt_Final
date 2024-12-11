package com.example.rentit.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(onRegisterSuccess: () -> Unit, navHostController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    // Error messages states
    var nameError by remember { mutableStateOf("") }
    var emailError by remember { mutableStateOf("") }
    var passwordError by remember { mutableStateOf("") }

    // Form validation status
    var isFormValid by remember { mutableStateOf(false) }

    // Handle button click to trigger validation
    val handleRegisterClick = {
        // Run validation when the button is clicked
        val validationResult = validateForm(name, email, password)
        nameError = validationResult.nameError
        emailError = validationResult.emailError
        passwordError = validationResult.passwordError
        isFormValid = validationResult.isValid

        // If form is valid, call onRegisterSuccess and navigate to login screen
        if (isFormValid) {
            onRegisterSuccess() // Call your success handler
            navHostController.navigate("login")
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
                text = "Register",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Name Field
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Name") },
                singleLine = true,
                isError = nameError.isNotEmpty(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            if (nameError.isNotEmpty()) {
                Text(
                    text = nameError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.align(Alignment.Start)
                )
            }

            // Email Field
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                singleLine = true,
                isError = emailError.isNotEmpty(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
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
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                isError = passwordError.isNotEmpty(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            if (passwordError.isNotEmpty()) {
                Text(
                    text = passwordError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.align(Alignment.Start)
                )
            }

            Button(
                onClick = handleRegisterClick,  // Trigger validation when clicked
                enabled = true,  // Button will be enabled for testing
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black // Black button color
                )
            ) {
                Text(
                    text = "Register",
                    color = Color.White // White text color
                )
            }
            Text(
                text = "Apakah Anda sudah memiliki akun? Login di sini",
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .clickable { navHostController.navigate("login") }
            )
        }
    }
}

// Updated validation function
fun validateForm(name: String, email: String, password: String): ValidationRegisterResult {
    var isValid = true
    var nameError = ""
    var emailError = ""
    var passwordError = ""

    if (name.isEmpty()) {
        nameError = "Name is required"
        isValid = false
    }

    if (email.isEmpty() || !isValidRegisterEmail(email)) {
        emailError = "Valid email is required"
        isValid = false
    }

    if (password.length < 6) {
        passwordError = "Password must be at least 6 characters"
        isValid = false
    }

    return ValidationRegisterResult(nameError, emailError, passwordError, isValid)
}

// Helper function to validate email format
fun isValidRegisterEmail(email: String): Boolean {
    val emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$".toRegex()
    return email.matches(emailPattern)
}

// Data class to hold the validation result
data class ValidationRegisterResult(
    val nameError: String,
    val emailError: String,
    val passwordError: String,
    val isValid: Boolean
)
