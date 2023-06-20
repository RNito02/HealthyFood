package com.example.healthyfood.screens.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Card
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.RadioButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthyfood.R
import com.example.healthyfood.navigation.HealthyScreens
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HealthyPersonalizadaScreen(navController: NavController) {
    var paso1 by remember { mutableStateOf("")}
    var paso2 by remember { mutableStateOf("") }

        LazyColumn (
        modifier = Modifier
            .padding()
            .fillMaxSize(),
    ) {
            item {

        androidx.compose.material3.TopAppBar(

            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary),
            modifier = Modifier.fillMaxWidth(),
            title = {
                Text("HealthyFOOD",
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                )
            }
        )
        Spacer(modifier = Modifier.height(18.dp))


        MaterialTheme() {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logohealthy),
                    contentDescription = null,
                    modifier = Modifier.height(90.dp)
                )
                Spacer(modifier = Modifier.width(25.dp))
                Text(text = "Elige los ingredientes a tu gusto.",
                    fontSize = 22.sp)
            }

            Spacer(modifier = Modifier.height(18.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp)
            ) {
                Text(
                    text = "Chica $55",
                    fontStyle = FontStyle.Italic,
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Grande $70",
                    fontStyle = FontStyle.Italic,
                    fontSize = 18.sp
                )
            }

            Spacer(modifier = Modifier.height(18.dp))
            Card( backgroundColor = MaterialTheme.colorScheme.onTertiary)
            {
                Column() {
                    Text(
                        "Paso 1, Base",
                        fontSize = 22.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style= MaterialTheme.typography.titleLarge)
                    Text(
                        "Elige lo que gustes para tu base",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style= MaterialTheme.typography.titleSmall
                    )

                    Spacer(modifier = Modifier.height(13.dp))
                    val context1 = LocalContext.current
                    val paso1 = arrayListOf("Lechuga","Espinaca","Pasta")
                    paso1.forEach {option : String ->
                        var ischecked by remember { mutableStateOf(false) }
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Checkbox(checked=ischecked,
                                onCheckedChange ={ Toast.makeText(context1, option , Toast.LENGTH_LONG).show()
                                    ischecked = it })
                            Text(option)
                        }

                    }
            }
            }

            //paso 2
            Spacer(modifier = Modifier.height(20.dp))
            Card (backgroundColor = MaterialTheme.colorScheme.onTertiary)
            {
                Column() {
                    Text(
                        "Paso 2, Barra Fria",
                        fontSize = 22.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        "Grande 5 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "chica 3 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "Extra $7 c/u",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )

                    Spacer(modifier = Modifier.height(13.dp))
                    val context = LocalContext.current
                    val paso2 = arrayListOf("Aceituna","Aguacate","Apio","Arandano","Brocoli",
                        "Champiñones","Elote","Huevo Cosido","Pepino","Pimienton","Piña","Queso",
                        "Mozarrella","Queso Cottage","Tomate","Fresas","Manzana","Uva","Zanahoria")
                    paso2.forEach {option : String ->
                        var ischecked by remember { mutableStateOf(false) }
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Checkbox(checked=ischecked,
                                onCheckedChange ={ Toast.makeText(context, option , Toast.LENGTH_LONG).show()
                                    ischecked = it })
                            Text(option)
                        }

                    }
                }
            }

            //paso3
            Spacer(modifier = Modifier.height(20.dp))
            Card( backgroundColor = MaterialTheme.colorScheme.onTertiary)
            {
                Column() {
                    Text(
                        "Paso 3, Proteina",
                        fontSize = 22.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        "Grande 2 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "Chica 1 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "Extras $15 c/u",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )

                    Spacer(modifier = Modifier.height(13.dp))
                    val context3 = LocalContext.current
                    val paso3 = arrayListOf("Pollo a la parrilla","Pollo al limon","Pollo BBQ",
                        "Jamon de pavo","Queso Blanco","Salchicha","Atun")
                    paso3.forEach {option : String ->
                        var ischecked by remember { mutableStateOf(false) }
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Checkbox(checked=ischecked,
                                onCheckedChange ={ Toast.makeText(context3, option , Toast.LENGTH_LONG).show()
                                    ischecked = it })
                            Text(option)
                        }
                    }

                }

            }

            //paso4
            Spacer(modifier = Modifier.height(20.dp))
            Card( backgroundColor = MaterialTheme.colorScheme.onTertiary)
            {
                Column() {
                    Text(
                        "Paso 4, Toppings",
                        fontSize = 22.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        "Grande 4 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "Chica 2 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "Extras $7 c/u",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )

                    Spacer(modifier = Modifier.height(13.dp))
                    val context4 = LocalContext.current
                    val paso4 = arrayListOf("Ajonjoli","Almendra","Cacahuate","Chia","Crutones","Nuez",
                        "Queso Parmesano","Semilla de Girasol","Bolitas de Queso crema")
                    paso4.forEach {option : String ->
                        var ischecked by remember { mutableStateOf(false) }
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Checkbox(checked=ischecked,
                                onCheckedChange ={ Toast.makeText(context4, option , Toast.LENGTH_LONG).show()
                                    ischecked = it })
                            Text(option)
                        }
                    }

                }

            }

            //paso5
            Spacer(modifier = Modifier.height(20.dp))
            Card( backgroundColor = MaterialTheme.colorScheme.onTertiary)
            {
                Column() {
                    Text(
                        "Paso 5, Aderezos",
                        fontSize = 22.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        "Grande 2 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "Chica 1 ingredientes",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        "Extras $7 c/u",
                        fontSize = 13.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleSmall
                    )

                    Spacer(modifier = Modifier.height(13.dp))
                    val context5 = LocalContext.current
                    val paso5 = arrayListOf("Aguacate","Blue Cheese","Cesar","Honey Dijon","Italiano","Mil Islas")
                    paso5.forEach {option : String ->
                        var ischecked by remember { mutableStateOf(false) }
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Checkbox(checked=ischecked,
                                onCheckedChange ={ Toast.makeText(context5, option , Toast.LENGTH_LONG).show()
                                    ischecked = it })
                            Text(option)
                        }
                    }
                }

            }

            Spacer(modifier = Modifier.height(50.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Button(
                    onClick = { navController.navigate(HealthyScreens.HomeScreen.name)})
                {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    Spacer(modifier = Modifier.width(9.dp))
                    Text(text = "Atras")
                }

                

                Button(onClick = { navController.navigate(HealthyScreens.PersonalizadaScreen.name)},)
                {
                    Text(text = "Finalizar")
                    Spacer(modifier = Modifier.width(9.dp))
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null)

                }

            }

        }
        }
    }
}
