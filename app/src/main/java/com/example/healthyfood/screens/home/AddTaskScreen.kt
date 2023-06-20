package com.example.healthyfood.screens.home

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import com.example.healthyfood.ui.theme.HealthyFoodTheme
//import edu.itsco.mytasks.ui.theme.MyTasksTheme


import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@ExperimentalMaterial3Api
@Composable
fun AddScreen(navHost: NavHostController, viewModel: TaskViewModel) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Añadir pedido" ,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(all = 5.dp)
                    .fillMaxWidth())},

            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(7.dp)
            )
        )
    }, floatingActionButton = {
        ExtendedFloatingActionButton(
            onClick = { /*TODO*/ }
        ){
            Text("Añadir el pedido", style = MaterialTheme.typography.bodyLarge)
        }
    },
        floatingActionButtonPosition = FabPosition.Center
    ){
        Column(modifier= Modifier.padding(it)
        ) {
            TaskAdd()
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun TaskAdd(){
    var TitleTask by remember { mutableStateOf("") }
    var DescriptionTask by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .padding(all = 5.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
        ){
            OutlinedTextField(
                value = TitleTask,
                onValueChange = {
                    TitleTask= it
                } ,
                label = {
                    Row() {
                        Icon(
                            imageVector = Icons.Outlined.Add,
                            contentDescription = "Pedido realizado")
                        Text(
                            "Añadir Titulo",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text)
            )
        }

        Row(
        ) {
            OutlinedTextField(
                value = DescriptionTask,
                onValueChange = {
                    DescriptionTask= it
                } ,
                label = {
                    Row() {
                        Icon(imageVector = Icons.Outlined.Add,
                            contentDescription = "Pedido realizado")
                        Text("Añadir descripción",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text)
            )
        }
    }
}