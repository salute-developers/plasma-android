package com.sdds.playground.sandbox.chip

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.adjustBy
import com.sdds.playground.sandbox.chip.SandboxChip.Shape
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

internal object SandboxChipSettingsProvider {

    @Composable
    fun style(size: SandboxChip.Size, state: SandboxChip.State): TextStyle {
        val color = contentColor(state)
        return when (size) {
            SandboxChip.Size.L -> SddsServTheme.typography.bodyLNormal.copy(color = color)
            SandboxChip.Size.M -> SddsServTheme.typography.bodyMNormal.copy(color = color)
            SandboxChip.Size.S -> SddsServTheme.typography.bodySNormal.copy(color = color)
            SandboxChip.Size.XS -> SddsServTheme.typography.bodyXsNormal.copy(color = color)
        }
    }

    @Composable
    fun contentColor(state: SandboxChip.State): Color {
        return when (state) {
            SandboxChip.State.Default -> SddsServTheme.colors.textInversePrimary
            SandboxChip.State.Secondary -> SddsServTheme.colors.textDefaultPrimary
            SandboxChip.State.Accent -> SddsServTheme.colors.textOnDarkPrimary
        }
    }

    @Composable
    fun backgroundColor(state: SandboxChip.State): Brush {
        return SolidColor(
            when (state) {
                SandboxChip.State.Default -> SddsServTheme.colors.surfaceDefaultSolidDefault
                SandboxChip.State.Secondary -> SddsServTheme.colors.surfaceDefaultTransparentSecondary
                SandboxChip.State.Accent -> SddsServTheme.colors.surfaceDefaultAccent
            },
        )
    }

    @Composable
    fun pressedBackgroundColor(state: SandboxChip.State): Brush {
        return SolidColor(
            when (state) {
                SandboxChip.State.Default -> SddsServTheme.colors.surfaceDefaultSolidDefaultActive
                SandboxChip.State.Secondary -> SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive
                SandboxChip.State.Accent -> SddsServTheme.colors.surfaceDefaultAccentActive
            },
        )
    }

    @Composable
    fun shape(shape: Shape, size: SandboxChip.Size): CornerBasedShape {
        return when (shape) {
            Shape.Default -> {
                when (size) {
                    SandboxChip.Size.L -> SddsServTheme.shapes.roundM
                    SandboxChip.Size.M -> SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp)
                    SandboxChip.Size.S -> SddsServTheme.shapes.roundS
                    SandboxChip.Size.XS -> SddsServTheme.shapes.roundXs
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
