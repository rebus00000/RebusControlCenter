package com.rebus.controlcenter.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val RebusColorScheme = darkColorScheme(
    primary = Blue,
    secondary = Accent,
    background = Background,
    surface = Card
)

@Composable
fun RebusTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = RebusColorScheme,
        typography = Typography,
        content = content
    )
}
