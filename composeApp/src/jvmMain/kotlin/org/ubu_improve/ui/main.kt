package org.ubu_improve.ui

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import org.jetbrains.compose.resources.painterResource
import ubu_improve.composeapp.generated.resources.Res
import ubu_improve.composeapp.generated.resources.wurzelavatar

var currentVersion: String = "0.1-Alpha"

fun main() = application {
    val icon = painterResource("wurzelavatar.png")
    Window(
        onCloseRequest = ::exitApplication,
        title = "ubu-improve",
        state = WindowState(),
        icon = icon
    ) {
        App()
    }
}