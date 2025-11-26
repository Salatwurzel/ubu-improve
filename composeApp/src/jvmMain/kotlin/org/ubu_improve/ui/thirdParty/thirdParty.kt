package org.ubu_improve.ui.thirdParty

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
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.ubu_improve.ui.theme.ColorTheme
import org.ubu_improve.ui.SharpButton
import org.ubu_improve.ui.SharpButtonGray
import org.ubu_improve.ui.theme.AppTypography

//BUTTON WITH QUESTION MARK AT THE END
//Row(Modifier.fillMaxWidth()){
//    SharpButton(onClick = {}, modifier = Modifier.fillMaxWidth(0.9f)){
//        Box(Modifier.fillMaxWidth()){
//            Text("BUTTON TEXT", textAlign = TextAlign.Start)
//        }
//    }
//    SharpButtonGray(onClick = {}, modifier = Modifier.fillMaxWidth()){
//        Text("?")
//    }
//}

@Composable
@Preview
fun thirdParty() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography){
        Surface() {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                //BUTTON UBUNTU_DEBULLSHIT
                Row(Modifier.fillMaxWidth()){
                    SharpButton(onClick = {}, modifier = Modifier.fillMaxWidth(0.9f)){
                        Box(Modifier.fillMaxWidth()){
                            Text("Start ubuntu-debullshit", textAlign = TextAlign.Start)
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