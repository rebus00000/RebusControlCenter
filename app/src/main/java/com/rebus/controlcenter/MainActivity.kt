package com.rebus.controlcenter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rebus.controlcenter.ui.screens.HomeScreen
import com.rebus.controlcenter.ui.theme.RebusTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RebusTheme {
                HomeScreen()
            }
        }
    }
}
