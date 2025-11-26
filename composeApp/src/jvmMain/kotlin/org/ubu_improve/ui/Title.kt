package org.ubu_improve.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import ubu_improve.composeapp.generated.resources.JetBrainsMono_Medium
import ubu_improve.composeapp.generated.resources.Res

@Composable
@Preview
fun Title(text: String){
    Text(text = text,
        fontFamily = FontFamily(Font(Res.font.JetBrainsMono_Medium)),
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    )

}