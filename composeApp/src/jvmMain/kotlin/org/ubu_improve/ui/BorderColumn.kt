package org.ubu_improve.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.ubu_improve.ui.theme.AppTypography

@Composable
@Preview
fun BorderColumn(
    modifier: Modifier = Modifier
        .width(350.dp)
        .height(250.dp)
        .padding(horizontal = 25.dp, vertical = 15.dp)
    ,

    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    titleText: String,
    content: @Composable () -> Unit
){
    MaterialTheme(typography = AppTypography){
    Column(modifier = modifier, horizontalAlignment = horizontalAlignment){
        Row(Modifier.fillMaxWidth()){
            Title(" $titleText")
        }
        Column(Modifier.fillMaxSize().border(1.dp, Color.DarkGray).padding(5.dp)){
            Column(Modifier.fillMaxSize()){
                content()
            }
        }
    }
}}



@Composable
fun bla(){
    Column(){}
}