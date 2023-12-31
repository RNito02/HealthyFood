package com.example.healthyfood.screens.home

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.healthyfood.data.persistence.Task
//import edu.itsco.mytasks.data.persistence.Task
import com.example.healthyfood.navigation.Screens
//import edu.itsco.mytasks.ui.navigation.Screens
import com.example.healthyfood.ui.theme.HealthyFoodTheme
//import edu.itsco.mytasks.ui.theme.MyTasksTheme

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(viewModel: TaskViewModel, navHost: NavHostController) {
    val listTask: List<Task> by
    viewModel.allTask.observeAsState(listOf())
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Lista de Tareas")})
        },

        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = {
                    navHost.navigate(
                        route= Screens.AddTaskScreen.url)
                }){
                Text(text = "Add")
            }
        },

        floatingActionButtonPosition = FabPosition.Center
    ) {
        LazyColumn(modifier = Modifier
            .padding(it).fillMaxSize()){
            items(listTask){item ->
                ItemTask(item)
            }

        }
    }
}

@Composable
fun ItemTask(item: Task){
    ElevatedCard(
        modifier = Modifier
            .padding(
                horizontal = 8.dp, vertical = 4.dp
            )
            .fillMaxWidth()
    ){
        Row() {
            Icon(
                imageVector = Icons.Outlined.CheckCircle,
                contentDescription = "Paso 1"
            )
            Text(
                text = item.paso1,
                style = MaterialTheme.typography.titleSmall
            )
        }

        Row() {
            Icon(
                imageVector = Icons.Outlined.CheckCircle,
                contentDescription = "Paso 2"
            )
            Text(
                text = item.paso2,
                style = MaterialTheme.typography.titleSmall
            )
        }

        Row() {
            Icon(
                imageVector = Icons.Outlined.CheckCircle,
                contentDescription = "Paso 3"
            )
            Text(
                text = item.paso3,
                style = MaterialTheme.typography.titleSmall
            )
        }

        Row() {
            Icon(
                imageVector = Icons.Outlined.CheckCircle,
                contentDescription = "Paso 4"
            )
            Text(
                text = item.paso4,
                style = MaterialTheme.typography.titleSmall
            )
        }

        Row() {
            Icon(
                imageVector = Icons.Outlined.CheckCircle,
                contentDescription = "Paso 5"
            )
            Text(
                text = item.paso5,
                style = MaterialTheme.typography.titleSmall
            )
        }


    }
}

/*@Composable
@Preview(showBackground = true)
fun ItemTaskPreview(){
    ItemTask(Task(id = 0, title = "My Task",
        description = "", isCompleted = false))
}*/