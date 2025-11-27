package org.ubu_improve.ui.desktopOptions

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import org.ubu_improve.logic.switchToGnomeSoftwareWithFlatpak
import org.ubu_improve.ui.theme.ColorTheme
import org.ubu_improve.ui.SharpButton
import org.ubu_improve.ui.SharpButtonGray
import org.ubu_improve.ui.theme.AppTypography

val buttonFractionMaxSize = 0.775f
val infoIcon = "\uD83D\uDEC8"

@Composable
@Preview
fun desktopOptions() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography){
        Surface() {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {

                //BUTTON GNOME SOFTWARE
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Switch to Gnome-Software \n(with Flathub enabled)", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("$infoIcon Info")
                    }
                }

                //BUTTON TASKBAR
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Switch to a single Taskbar \n(like in Windows)", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier){
                        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd){
                            Text("\uD83D\uDEC8 Info")
                        }
                    }
                }




            }
        }
    }
}