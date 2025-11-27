package org.ubu_improve.ui.dialogs

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import org.jetbrains.compose.resources.Font
import org.ubu_improve.ui.SharpButton
import ubu_improve.composeapp.generated.resources.JetBrainsMono_Medium
import ubu_improve.composeapp.generated.resources.Res

@Composable
@Preview
fun exampleDialog(onOkRequest: () -> Unit, onDismissRequest: () -> Unit) {
    //val infoIcon = Image(painter = painterResource(Res.drawable.wurzelavatar), contentDescription = "Info Icon")
    Dialog(onDismissRequest = { onDismissRequest() }) {
        Card(modifier = Modifier.fillMaxWidth().height(400.dp).padding(5.dp), shape = RoundedCornerShape(5.dp),
        ) {
            Column(Modifier.fillMaxSize().padding(10.dp)){
                //CONTENT COLUMN
                Column (Modifier.fillMaxWidth().fillMaxHeight(0.8f).padding(15.dp).verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start){

                    //BOX FOR SHOW TITLE ON TOP
                    Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                        Text("TITLE ON THE TOP", fontSize = 22.sp, fontFamily = FontFamily(Font(Res.font.JetBrainsMono_Medium)))
                    }
                    Spacer(Modifier.height(30.dp))
                    //CONTENT COMES HERE
                    //Button1()
                    //Button2()
                    //etc
                }

                //BOTTOM ROW CENTERED
                Row(Modifier.fillMaxSize(), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.Center){
                    Row(){
                        SharpButton(onClick = { onOkRequest() }){
                            Text("OK")
                        }
                    }
                    Spacer(Modifier.width(20.dp))

                    Row {
                        SharpButton(onClick = { onDismissRequest() }){
                            Text("Cancel")
                        }
                    }
                }

            }
        }
    }
}