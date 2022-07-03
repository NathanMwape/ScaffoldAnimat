package org.esisalama.mobile.scaffold

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun LaunchSceen() {
    Surface() {
        Box(contentAlignment = Alignment.BottomCenter ) {
            Image(
                painter = painterResource(id = R.drawable.paysage3), contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(text = "Screen Splash")
        }

    }
}

@Composable
fun ScaffoldApp() {
    //La  navigation principale
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
        //creattion du toast
    val context = LocalContext.current
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = { DrawerComposable()},
        topBar = {
            TopAppBar(
                title = { Text(text = "ScaffoldNavigation")},
                backgroundColor = MaterialTheme.colors.primary,
                actions = {
                    IconButton(onClick = { Toast.makeText(context, "clicker sur le menu",Toast.LENGTH_SHORT).show() }) {
                        Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                    }
                    IconButton(onClick = { Toast.makeText(context, "clicker sur le menu",Toast.LENGTH_SHORT).show() }) {
                        Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "")
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { scope.launch { scaffoldState.drawerState.open() }}) {
                        Icon(Icons.Default.Menu, contentDescription = "")
                    }
                }
            )
        },
        content = {
            LazyColumn( modifier = Modifier.padding(10.dp)) {
                item {
                    Divider(thickness = 3.dp, color = Color.Black)
                    Box(contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.paysage17), contentDescription = "")
                        Text(text =" Paysage 2", fontWeight = FontWeight.Bold)
                    }

                    Spacer(modifier = Modifier.padding(5.dp))
                    Divider(thickness = 3.dp, color = Color.Black)
                    Box(contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.paysage3), contentDescription = "",
                            contentScale = ContentScale.Crop)
                        Text(text =" Paysage 2", fontWeight = FontWeight.Bold, color = Color.White)
                    }

                    Spacer(modifier = Modifier.padding(5.dp))
                    Divider(thickness = 3.dp, color = Color.Black)
                    Box(contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.paysage5), contentDescription = "",
                            contentScale = ContentScale.Crop)
                        Text(text =" Paysage 3", fontWeight = FontWeight.Bold, color = Color.White)
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Divider(thickness = 3.dp, color = Color.Black)
                    Box(contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.paysage8),
                            contentDescription = "",
                            modifier = Modifier
                                .size(400.dp)
                                .fillMaxSize()
                                .clip(RectangleShape)
                                .border(
                                    3.dp, color = Color.Gray,
                                    RoundedCornerShape(60.dp)
                                ),
                            contentScale = ContentScale.Crop
                        )
                        Text(text =" Paysage 3", fontWeight = FontWeight.Bold, color = Color.White)

                    }

                }


            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription ="", tint = MaterialTheme.colors.background )
            }
        },
        bottomBar = {
        }

    )
}

@Composable
fun themeDeux() {
    Card (elevation = 4.dp, backgroundColor = Color.White){
        Spacer(modifier = Modifier.padding(5.dp))
        Divider(thickness = 3.dp, color = Color.Black)
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(3.dp)
                .border(3.dp, color = Color.Black, RoundedCornerShape(60.dp))
        ) {
            Image(painter = painterResource(id = R.drawable.paysage8),
                contentDescription = "",
                modifier = Modifier
                    .size(400.dp)
                    .fillMaxSize()
                    .clip(RectangleShape)
                    .border(
                        3.dp, color = Color.Black,
                        RoundedCornerShape(60.dp)
                    ),
                contentScale = ContentScale.Crop
            )
            Text(text =" Paysage 3", fontWeight = FontWeight.Bold, color = Color.White)
        }
    }
}


@Preview
@Composable
fun ScaffolThem() {
    ScaffoldApp()
}

@Preview(showSystemUi = true)
@Composable
fun DeuxiemTheme() {
    themeDeux()
}
@Preview
@Composable
fun ScreenLaunch() {
    LaunchSceen()
}