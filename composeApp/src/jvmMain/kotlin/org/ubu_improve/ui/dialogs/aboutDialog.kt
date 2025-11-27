package org.ubu_improve.ui.dialogs

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import org.ubu_improve.ui.SharpButton
import ubu_improve.composeapp.generated.resources.JetBrainsMono_Medium
import ubu_improve.composeapp.generated.resources.Res
import ubu_improve.composeapp.generated.resources.wurzelavatar

@Composable
@Preview
fun aboutDialog(onDismissRequest: () -> Unit) {
    val infoIcon = Image(painter = painterResource(Res.drawable.wurzelavatar), contentDescription = "Info Icon")

    Dialog(onDismissRequest = { onDismissRequest() }) {
        ElevatedCard(modifier = Modifier.fillMaxWidth().height(400.dp).padding(10.dp), shape = RoundedCornerShape(5.dp),
        ) {
            Column(Modifier.fillMaxSize().padding()){
                //CONTENT COLUMN
                Column (Modifier.fillMaxWidth().fillMaxHeight(0.8f).padding(15.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start){
                    //SHOW TITLE ON TOP
                    Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                        Text("ABOUT UBU-IMPROVE", fontSize = 22.sp, fontFamily = FontFamily(Font(Res.font.JetBrainsMono_Medium)))
                    }
                    Spacer(Modifier.height(15.dp))
                    //CONTENT
                    Text("""
                        Version: 0.0.1
                        und so
                        Image(Res.drawable.wurzelavatar)
                        ${infoIcon}
                    """.trimIndent())
                }
                //CONTENT BOTTOM CENTER
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
                    SharpButton(onClick = { onDismissRequest() }){
                        Text("OK")
                    }
                }
            }
        }
    }
}