package org.ubu_improve.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import ubu_improve.composeapp.generated.resources.JetBrainsMono_Regular
import ubu_improve.composeapp.generated.resources.Res

val fontJetbrainsMono @Composable get () = FontFamily(Font(Res.font.JetBrainsMono_Regular))

val AppTypography @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White),
    displayMedium = TextStyle(color = Color.White),
    displaySmall = TextStyle(color = Color.White),
    headlineLarge = TextStyle(color = Color.White),
    headlineMedium = TextStyle(color = Color.White),
    headlineSmall = TextStyle(color = Color.White),
    titleLarge = TextStyle(color = Color.White),
    titleMedium = TextStyle(color = Color.White),
    titleSmall = TextStyle(color = Color.White),
    bodyLarge = TextStyle(color = Color.White),
    bodyMedium = TextStyle(color = Color.White),
    bodySmall = TextStyle(color = Color.White),
//    labelLarge = TextStyle(color = Color.White, fontFamily = FontFamily(Font(Res.font.jetbrains_mono)), fontWeight = FontWeight.Normal),
    labelLarge = TextStyle(color = Color.White, fontFamily = fontJetbrainsMono, fontSize = 13.sp),
    labelMedium = TextStyle(color = Color.White),
    labelSmall = TextStyle(color = Color.White)
)