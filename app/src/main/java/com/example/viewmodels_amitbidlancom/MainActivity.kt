package com.example.viewmodels_amitbidlancom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.example.viewmodels_amitbidlancom.ui.theme.ViewModelsAmitbidlancomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ViewModelsAmitbidlancomTheme {
                // A surface container using the 'background' color from the theme
                Column {
                    HomeScreen()
                }
            }
        }
    }
}

