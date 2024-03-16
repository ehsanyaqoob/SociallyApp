package com.example.sociallyapp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun LoginPage() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f)) // Spacing at the top
        Image(
            painter = painterResource(id = R.drawable.login2),
            contentDescription = "login image",
            modifier = Modifier
                .size(250.dp)
                .padding(16.dp)
        )
        Text(
            text = "Welcome Back Dude!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Login into your Account",
            fontSize = 20.sp
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email address") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .padding(vertical = 8.dp),
            shape = RoundedCornerShape(16.dp) // Rounded corners
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .padding(vertical = 8.dp),
            shape = RoundedCornerShape(16.dp) // Rounded corners
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp)
        ) {
            Text(text = "Login")
        }
        Text(
            text = "Forgot your password",
            fontSize = 20.sp,
            modifier = Modifier
                .clickable { /* Handle click */ }
                .padding(vertical = 8.dp)
        )
        Text(
            text = "Or Sign in with",
            fontSize = 20.sp,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Google icon",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { /* Handle Google click */ }
            )
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Facebook icon",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { /* Handle Facebook click */ }
            )
            Image(
                painter = painterResource(id = R.drawable.applelogo),
                contentDescription = "Apple icon",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { /* Handle Apple click */ }
            )
        }
        Spacer(modifier = Modifier.weight(1f)) // Spacing at the bottom
    }
}
