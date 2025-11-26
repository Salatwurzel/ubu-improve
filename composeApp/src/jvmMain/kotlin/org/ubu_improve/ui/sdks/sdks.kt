package org.ubu_improve.ui.sdks

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
import org.ubu_improve.logic.installRustSDK
import org.ubu_improve.logic.switchToGnomeSoftwareWithFlatpak
import org.ubu_improve.ui.theme.ColorTheme
import org.ubu_improve.ui.SharpButton
import org.ubu_improve.ui.SharpButtonGray
import org.ubu_improve.ui.theme.AppTypography

@Composable
@Preview
fun sdks() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography){
        Surface() {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                //DOTNET SDK BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Run dotnet installer", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")
                    }
                }
                //KOTLIN SDK BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Install Kotlin-SDK", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")
                    }
                }

                //RUST SDK BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { installRustSDK() }, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Install Rust-SDK", textAlign = TextAlign.Start)
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