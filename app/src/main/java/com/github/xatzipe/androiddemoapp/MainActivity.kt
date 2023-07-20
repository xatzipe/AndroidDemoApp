package com.github.xatzipe.androiddemoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.xatzipe.androiddemoapp.ui.theme.AndroidDemoAppTheme
import com.microsoft.appcenter.analytics.Analytics

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidDemoAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Analytics.trackEvent("Starting: ${BuildConfig.VERSION_NAME} (${BuildConfig.VERSION_CODE})")
                    Greeting("Version: ${BuildConfig.VERSION_NAME}. Code: ${BuildConfig.VERSION_CODE}")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidDemoAppTheme {
        Greeting("Android")
        Greeting(BuildConfig.VERSION_NAME)
        Greeting(BuildConfig.VERSION_CODE.toString())
    }
}