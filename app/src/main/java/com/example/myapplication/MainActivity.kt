package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import greet

class MainActivity : ComponentActivity() {
    var i = 10 //basic var having int value
//    var j //error since its not initialised
    var j = null
    var c = "Parth Sharma"
    var b:Int?  = null //this is one way to make the value null


    override fun onCreate(savedInstanceState: Bundle?) {
        var ar = arrayOf("Parth" , "Lakshay" , "Shashwat")
        for(i in ar){
            println(i)
        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Parth Sharma",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }

        }
    }
}

@Composable  // for the UI @Composable functions build UI
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val message = greet(name,21)
    Text(
        text = message,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}