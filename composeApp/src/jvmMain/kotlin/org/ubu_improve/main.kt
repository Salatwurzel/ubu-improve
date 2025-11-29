package org.ubu_improve

import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import org.ubu_improve.ui.App
import ubu_improve.composeapp.generated.resources.Res
import ubu_improve.composeapp.generated.resources.compose_multiplatform
import ubu_improve.composeapp.generated.resources.wurzelavatar
import kotlin.system.exitProcess

var currentVersion: String = "0.1-Alpha"

fun main() = application {
    Window(
        onCloseRequest = {
            exitProcess(0)
                         }
        ,
        title = "ubu-improve",
        state = WindowState(size = DpSize(760.dp, 630.dp)),
        icon = org.jetbrains.compose.resources.painterResource(Res.drawable.wurzelavatar),
    )
    {
        org.ubu_improve.ui.App()
    }
}

