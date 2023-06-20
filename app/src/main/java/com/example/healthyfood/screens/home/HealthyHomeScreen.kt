package com.example.healthyfood.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthyfood.R
import com.example.healthyfood.navigation.HealthyScreens
//import com.example.healthyfood.navigation.Screens

@Composable
fun Home(navController: NavController){
    MaterialTheme() {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = "HealthyFOOD",
                fontSize = 30.sp,
                style = MaterialTheme.typography.titleLarge,
                fontStyle = FontStyle.Italic)
            Text(text = "Cosamaloapan",
                fontSize = 20.sp,
                style = MaterialTheme.typography.titleMedium)

            Spacer(modifier = Modifier.height(18.dp))

            Image(
                painter = painterResource(R.drawable.logohealthy),
                contentDescription = "Logo",
                modifier = Modifier.height(130.dp)
            )
            Spacer(modifier = Modifier.height(18.dp))


            Text(text = "Ensaladas mas buena Que la novia de tu compa",
                textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(50.dp))


            Button(onClick = { navController.navigate(HealthyScreens.PersonalizadaScreen.name) }) {
                Icon(imageVector = Icons.Default.Edit, contentDescription = null)
                Spacer(modifier = Modifier.width(9.dp))
                Text(text = "Crea tu ensalada")
            }
            Spacer(modifier = Modifier.height(18.dp))


            /*Button(onClick = { navController.navigate(Screens.HomeScreen.url) }) {
                Icon(imageVector = Icons.Default.Edit, contentDescription = null)
                Spacer(modifier = Modifier.width(9.dp))
                Text(text = "Crea tu ensalada")
            }
            Spacer(modifier = Modifier.height(18.dp))*/



            Button(onClick = { navController.navigate(HealthyScreens.LoginScreen.name) }) {
                Icon(imageVector = Icons.Default.ExitToApp, contentDescription = null)
                Spacer(modifier = Modifier.width(9.dp))
                Text(text = "Salir")
            }
            Spacer(modifier = Modifier.height(18.dp))






        }
    }

}