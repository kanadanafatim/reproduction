package com.example.monapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.monapp.ui.theme.MonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MonAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        stringResource(R.string.titre) ,
                        stringResource(R.string.par1) ,
                        stringResource(R.string.par2)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(titre: String, par1: String, par2: String,modifier: Modifier = Modifier) {
   Column {
       Image(
           painter= painterResource(R.drawable.bg_compose_background),
           contentDescription=""
       )
       Text(
           text =  titre,
           fontSize = 24.sp,
           modifier = Modifier.padding(16.dp)
       )
       Text(
           text =  par1,
           modifier=Modifier.padding(start = 16.dp, end = 16.dp),
           textAlign = TextAlign.Justify
       )
       Text(
           text =  par2,
           modifier=Modifier.padding( 16.dp),
           textAlign = TextAlign.Justify
       )
       
   }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MonAppTheme {
        Greeting(
            stringResource(R.string.titre) ,
            stringResource(R.string.par1) ,
            stringResource(R.string.par2)
        )
    }
}