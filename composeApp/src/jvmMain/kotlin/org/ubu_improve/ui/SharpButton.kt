package org.ubu_improve.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import org.ubu_improve.ui.theme.ColorTheme

val minWidth = 100.dp

@Composable
@Preview
fun SharpButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.widthIn(min = minWidth),
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = RoundedCornerShape(3.dp),
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    contentPadding: PaddingValues = PaddingValues(horizontal = 8.dp),
    content: @Composable (RowScope.() -> Unit),
){
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = colors,
        elevation = elevation,
        shape = shape,
        contentPadding = contentPadding,
    ) {
        content()
    }
}

@Composable
@Preview
fun SharpButtonGray(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.widthIn(min = minWidth),
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = RoundedCornerShape(3.dp),
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor = ColorTheme().colorDarkBackground),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    contentPadding: PaddingValues = PaddingValues(horizontal = 8.dp),
    content: @Composable (RowScope.() -> Unit),
){
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = colors,
        elevation = elevation,
        shape = shape,
        contentPadding = contentPadding,
    ) {
        content()
    }
}
