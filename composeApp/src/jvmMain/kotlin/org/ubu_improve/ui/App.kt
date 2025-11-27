@file:OptIn(ExperimentalLayoutApi::class)

package org.ubu_improve.ui

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.ubu_improve.currentVersion
import org.ubu_improve.ui.desktopOptions.desktopOptions
import org.ubu_improve.ui.sdks.sdkOptions
import org.ubu_improve.ui.systemOptions.SystemOptions
import org.ubu_improve.ui.theme.AppTypography
import org.ubu_improve.ui.theme.ColorTheme
import org.ubu_improve.ui.thirdParty.thirdParty

@Composable
@Preview
fun App() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography) {
        Surface {
            //BACKGROUND COLUMN
            Column(modifier = Modifier.fillMaxSize().padding(5.dp)) {
                //TOP BOX
                Box(Modifier.fillMaxWidth()){
                    Column (Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
                        LargeTitle("UBU-IMPROVE")
                        Text("Version: $currentVersion", fontSize = 10.sp)
                    }
                }

                Spacer(Modifier.height(25.dp))

                //MAIN COLUMN
                Column(Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally){
                    FlowRow(){
                        BorderColumn(titleText = "⚙\uFE0F SYSTEM"){
                            SystemOptions()
                        }

                        BorderColumn(titleText = "\uD83D\uDDA5\uFE0F DESKTOP"){
                            desktopOptions()
                        }

                        BorderColumn(titleText = "\uD83E\uDD49 3rd PARTY"){
                            thirdParty()
                        }

                        BorderColumn(titleText = "\uD83D\uDDDC\uFE0F SDKs"){
                            sdkOptions()
                        }
                    }
                }

                //BOTTOM BOX
                Box(Modifier.fillMaxWidth().fillMaxHeight()){
                    //BOTTOM LEFT COLUMN
                    Column (Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Bottom){

                    }
                    //BOTTOM CENTER COLUMN
                    Column (Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom){

                    }
                    //BOTTOM RIGHT COLUMN
                    Column (Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Bottom){

                    }

                }
            }
        }
    }
}
