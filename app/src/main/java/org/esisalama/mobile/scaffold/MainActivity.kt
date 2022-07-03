package org.esisalama.mobile.scaffold

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.NativeCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.esisalama.mobile.scaffold.ui.theme.ScaffoldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScaffoldApp()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    val context = LocalContext.current
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {},
        topBar = {
                 TopAppBar(
                     title = { Text(text = "ButtonFloating")},
                     navigationIcon = {
                         IconButton(onClick = { scope.launch { scaffoldState.drawerState.open() } }) {
                             Icon(imageVector = Icons.Filled.Menu, contentDescription = "")
                         }
                     },
                     actions = {
                         IconButton(onClick = { Toast.makeText(context,"cliquer sur menu ", Toast.LENGTH_SHORT).show() }) {
                             Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "")
                         }
                     }
                 )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "")
            }
        },
        //floatingActionButtonPosition = FabPosition.Center
    isFloatingActionButtonDocked = true,
        bottomBar = {
            BottomAppBar (
                cutoutShape = MaterialTheme.shapes.small.copy(
                    CornerSize(percent = 50)
                )
            ){}
        },
        //contenus de l'application entier
        content = {

        }
    )
}

@Composable
fun AutoSlider() {
    
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {

    ScaffoldTheme {
        Greeting()
    }
}