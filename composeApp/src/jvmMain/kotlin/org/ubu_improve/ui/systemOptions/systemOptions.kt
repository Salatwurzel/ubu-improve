package org.ubu_improve.ui.systemOptions

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
import org.ubu_improve.ui.theme.ColorTheme
import org.ubu_improve.ui.SharpButton
import org.ubu_improve.ui.SharpButtonGray
import org.ubu_improve.ui.theme.AppTypography

@Composable
@Preview
fun SystemOptions() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography){
        Surface() {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = {}, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()){
                            Text("kljkljlkj", textAlign = TextAlign.Start)
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
                        Text("?")
                    }
                }

                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = {}, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()) {
                            Text("Install better Taskbar")
                        }
                    }
                    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                        Text("?")
                    }
                }

            }
        }
    }
}