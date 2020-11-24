package com.zsqw123.jetpack.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.zsqw123.jetpack.compose.ui.ComposeSampleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

var str = "Coolapk"

@Composable
@Preview
fun Greeting() {
    var visibility = true
    Button(onClick = { visibility = !visibility }) {
        if (visibility) Text(text = "Hello $str!")
    }
}

//fun change() {
//    str = if (str == "Coolapk") "Github" else "Coolapk"
//    visibility = !visibility
//}