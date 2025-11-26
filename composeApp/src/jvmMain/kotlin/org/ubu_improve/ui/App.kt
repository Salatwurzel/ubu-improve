package org.ubu_improve.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.ubu_improve.ui.theme.AppTypography
import org.ubu_improve.ui.theme.ColorTheme

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

                //MAIN COLUMN
                Column(Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally){
                    FlowRow(Modifier){
                        BorderColumn(titleText = "SYSTEM"){
                            org.ubu_improve.ui.systemOptions.SystemOptions()
                        }

                        BorderColumn(titleText = "DESKTOP"){
                            org.ubu_improve.ui.desktopOptions.desktopOptions()
                        }

                        BorderColumn(titleText = "3rd PARTY"){
                            org.ubu_improve.ui.thirdParty.thirdParty()
                        }

                        BorderColumn(titleText = "SDKs"){
                            org.ubu_improve.ui.sdks.sdks()
                        }
                    }
                }

                //BOTTOM BOX
                Box(Modifier.fillMaxWidth().fillMaxHeight()){
                    Column (Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Bottom){
                        //Text("BOTTOM ROW")
                    }

                    Column (Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom){
                        //Text("BOTTOM ROW")
                    }

                    Column (Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Bottom){
                        //Text("Version: $currentVersion")
                    }

                }
            }
        }
    }
}
