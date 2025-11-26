package org.ubu_improve

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import org.ubu_improve.ui.App
import ubu_improve.composeapp.generated.resources.Res
import ubu_improve.composeapp.generated.resources.compose_multiplatform
import ubu_improve.composeapp.generated.resources.wurzelavatar

var currentVersion: String = "0.1-Alpha"

fun main() = application {
    val appIcon = org.jetbrains.compose.resources.painterResource(Res.drawable.wurzelavatar)
    Window(
        onCloseRequest = ::exitApplication,
        title = "ubu-improve",
        state = WindowState(),
        icon = appIcon
    ) {
        org.ubu_improve.ui.App()
    }
}