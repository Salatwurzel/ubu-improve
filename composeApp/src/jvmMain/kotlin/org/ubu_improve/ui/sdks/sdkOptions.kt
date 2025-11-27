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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import org.ubu_improve.logic.installRustSDK
import org.ubu_improve.logic.switchToGnomeSoftwareWithFlatpak
import org.ubu_improve.ui.theme.ColorTheme
import org.ubu_improve.ui.SharpButton
import org.ubu_improve.ui.SharpButtonGray
import org.ubu_improve.ui.dialogs.dotnetDialog
import org.ubu_improve.ui.theme.AppTypography

private val buttonFractionMaxSize = 0.775f

private val infoIcon = "\uD83D\uDEC8"
private var showHelpDialogDotnet = mutableStateOf(false)
private var showHelpDialogKotlin = false
private var showHelpDialogRust = false

@Composable
@Preview
fun sdkOptions() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography){
        Surface() {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                //DOTNET SDK BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Install .NET", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {showHelpDialogDotnet.value = true}, modifier = Modifier.fillMaxWidth()){
                        Text("$infoIcon Info")
                    }
                }
                //KOTLIN SDK BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { switchToGnomeSoftwareWithFlatpak() }, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Install Kotlin + Java", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")
                    }
                }

                //RUST SDK BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = { installRustSDK() }, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Install Rust", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")
                    }
                }

                //ENDSTUFF TO SHOW/HIDE DIALOGS
                if (showHelpDialogDotnet.value == true){
                    dotnetDialog(onOkRequest = {showHelpDialogDotnet.value = false}, onDismissRequest = {})
                }

            }
        }
    }
}