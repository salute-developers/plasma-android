package com.sdds.playground.sandbox.chip

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.playground.sandbox.chip.SandboxChip.Shape
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

internal object SandboxChipSettingsProvider {

    @Composable
    fun style(size: SandboxChip.Size, state: SandboxChip.State): TextStyle {
        val color = contentColor(state)
        return when (size) {
            SandboxChip.Size.L -> StylesSaluteTheme.typography.bodyLNormal.copy(color = color)
            SandboxChip.Size.M -> StylesSaluteTheme.typography.bodyMNormal.copy(color = color)
            SandboxChip.Size.S -> StylesSaluteTheme.typography.bodySNormal.copy(color = color)
            SandboxChip.Size.XS -> StylesSaluteTheme.typography.bodyXsNormal.copy(color = color)
        }
    }

    @Composable
    fun contentColor(state: SandboxChip.State): Color {
        return when (state) {
            SandboxChip.State.Default -> StylesSaluteTheme.colors.textInversePrimary
            SandboxChip.State.Secondary -> StylesSaluteTheme.colors.textDefaultPrimary
            SandboxChip.State.Accent -> StylesSaluteTheme.colors.textOnDarkPrimary
        }
    }

    @Composable
    fun backgroundColor(state: SandboxChip.State): Color {
        return when (state) {
            SandboxChip.State.Default -> StylesSaluteTheme.colors.surfaceDefaultSolidDefault
            SandboxChip.State.Secondary -> StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary
            SandboxChip.State.Accent -> StylesSaluteTheme.colors.surfaceDefaultAccent
        }
    }

    @Composable
    fun pressedBackgroundColor(state: SandboxChip.State): Color {
        return when (state) {
            SandboxChip.State.Default -> StylesSaluteTheme.colors.surfaceDefaultSolidDefaultActive
            SandboxChip.State.Secondary -> StylesSaluteTheme.colors.surfaceDefaultTransparentSecondaryActive
            SandboxChip.State.Accent -> StylesSaluteTheme.colors.surfaceDefaultAccentActive
        }
    }

    @Composable
    fun shape(shape: Shape, size: SandboxChip.Size): CornerBasedShape {
        return when (shape) {
            Shape.Default -> {
                when (size) {
                    SandboxChip.Size.L -> RoundedCornerShape(12.dp)
                    SandboxChip.Size.M -> RoundedCornerShape(10.dp)
                    SandboxChip.Size.S -> RoundedCornerShape(8.dp)
                    SandboxChip.Size.XS -> RoundedCornerShape(6.dp)
                }
            }

            Shape.Pilled -> RoundedCornerShape(50)
        }
    }

    @Composable
    fun iconSize(size: SandboxChip.Size): Dp {
        return when (size) {
            SandboxChip.Size.L -> 24.dp
            SandboxChip.Size.M -> 24.dp
            SandboxChip.Size.S -> 16.dp
            SandboxChip.Size.XS -> 12.dp
        }
    }

    @Composable
    fun contentMargin(size: SandboxChip.Size): Dp {
        return when (size) {
            SandboxChip.Size.L -> 8.dp
            SandboxChip.Size.M -> 6.dp
            SandboxChip.Size.S -> 4.dp
            SandboxChip.Size.XS -> 2.dp
        }
    }

    @Composable
    fun endPadding(size: SandboxChip.Size, hasEndContent: Boolean): Dp {
        if (hasEndContent) {
            return when (size) {
                SandboxChip.Size.L -> 12.dp
                SandboxChip.Size.M -> 10.dp
                SandboxChip.Size.S -> 8.dp
                SandboxChip.Size.XS -> 6.dp
            }
        }
        return when (size) {
            SandboxChip.Size.L -> 16.dp
            SandboxChip.Size.M -> 14.dp
            SandboxChip.Size.S -> 12.dp
            SandboxChip.Size.XS -> 10.dp
        }
    }

    @Composable
    fun startPadding(size: SandboxChip.Size, hasStartContent: Boolean): Dp {
        if (hasStartContent) {
            return when (size) {
                SandboxChip.Size.L -> 14.dp
                SandboxChip.Size.M -> 12.dp
                SandboxChip.Size.S -> 10.dp
                SandboxChip.Size.XS -> 8.dp
            }
        }
        return when (size) {
            SandboxChip.Size.L -> 16.dp
            SandboxChip.Size.M -> 14.dp
            SandboxChip.Size.S -> 12.dp
            SandboxChip.Size.XS -> 10.dp
        }
    }
}
