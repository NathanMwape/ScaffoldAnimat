package org.esisalama.mobile.scaffold

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.ExitToApp
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawerComposable() {
    Column {
        Image(painter = painterResource(id = R.drawable.paysage17), contentDescription = "",
            modifier = Modifier
                .requiredHeight(200.dp)
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.size(4.dp))
        Divider(thickness = 1.dp, color = Color.Gray)
        Spacer(modifier = Modifier.size(4.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.Person, contentDescription = "")
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = "Contact")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.Settings, contentDescription = "")
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = "Paramettre")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.Email, contentDescription = "")
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = "Commentaire")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "")
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = "Deconnexion")
        }



    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Affichage() {
    DrawerComposable()
}