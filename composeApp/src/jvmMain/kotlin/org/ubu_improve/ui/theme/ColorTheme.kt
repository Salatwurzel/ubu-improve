package org.ubu_improve.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

class ColorTheme {
    val darkInner = Color(0xFF2e2e32)

    private val colorDarkPrimary = Color(0xFF282828)
    private val colorDarkPrimaryTest = Color(0xFF0071e3)
    private val colorDarkOnPrimary = Color(0xFFFFFFFF)
    private val colorLightTextPrimary = Color(0xFF00DB34)

    //ORIGINAL BACKGROUND:
    val colorDarkBackground = Color(0xFF1d1d20)
    val colorDarkBackgroundNew = Color(0xFF00DB34)

    val darkTheme = darkColorScheme(
        //BUTTON COLOR ETC
        primary = colorDarkPrimaryTest,
        //BUTTON TEXT COLOR ETC
        onPrimary = colorDarkOnPrimary,
        onPrimaryFixed = colorDarkOnPrimary,
        //
        background = colorDarkBackground,
        surface = colorDarkBackground,
        primaryFixed = colorLightTextPrimary,

        // ..
    )

    val darkInnerTheme = darkColorScheme(
        //BUTTON COLOR ETC
        primary = colorDarkPrimaryTest,
        //BUTTON TEXT COLOR ETC
        onPrimary = colorDarkOnPrimary,
        onPrimaryFixed = colorDarkOnPrimary,
        //
        background = colorDarkBackground,
        surface = colorDarkBackground,
        primaryFixed = colorLightTextPrimary,

        // ..
    )
}