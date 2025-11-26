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

@Composable
@Preview
fun desktopOptions() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography){
        Surface() {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
               //BUTTON GNOME SOFTWARE
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Switch to Gnome-Software", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")
                    }
                }
                //BUTTON TASKBAR
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Install better Taskbar", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")

                    }
                }



            }
        }
    }
}