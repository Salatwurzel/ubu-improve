package org.ubu_improve.ui.systemOptions

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.ubu_improve.ui.SharpButton
import org.ubu_improve.ui.SharpButtonGray
import org.ubu_improve.ui.dialogs.aboutDialog
import org.ubu_improve.ui.theme.AppTypography
import org.ubu_improve.ui.theme.ColorTheme


val buttonFractionMaxSize = 0.775f

var kasjd = mutableStateOf(false)

@Composable
@Preview
fun SystemOptions() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography){
        Surface() {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                //
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = {kasjd.value = true}, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()){
                            Text("kljkljlkj")
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")
                    }
                }
                //TASKBAR BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = {}, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()) {
                            Text("TEST2")
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                        Text("?")
                    }
                }

                //INSTALL MS-FONTS BUTTON
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = {}, modifier = Modifier.fillMaxWidth(buttonFractionMaxSize)){
                        Box(Modifier.fillMaxWidth()) {
                            Text("Install Microsoft Fonts")
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                        Text("?")
                    }
                }
                if (kasjd.value == true){
                    aboutDialog { kasjd.value = false }
                }

            }
        }
    }
}