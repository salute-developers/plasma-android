package com.sdds.playground.sandbox.chip

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.adjustBy
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

internal object SandboxEmbeddedChipSettingsProvider {

    @Composable
    fun style(size: SandboxEmbeddedChip.Size, state: SandboxEmbeddedChip.State): TextStyle {
        val color = contentColor(state)
        return when (size) {
            SandboxEmbeddedChip.Size.L -> SddsServTheme.typography.bodyLNormal.copy(color = color)
            SandboxEmbeddedChip.Size.M -> SddsServTheme.typography.bodyMNormal.copy(color = color)
            SandboxEmbeddedChip.Size.S -> SddsServTheme.typography.bodySNormal.copy(color = color)
            SandboxEmbeddedChip.Size.XS -> SddsServTheme.typography.bodyXsNormal.copy(color = color)
        }
    }

    @Composable
    fun contentColor(state: SandboxEmbeddedChip.State): Color {
        return when (state) {
            SandboxEmbeddedChip.State.Default -> SddsServTheme.colors.textInversePrimary
            SandboxEmbeddedChip.State.Secondary -> SddsServTheme.colors.textDefaultPrimary
            SandboxEmbeddedChip.State.Accent -> SddsServTheme.colors.textOnDarkPrimary
        }
    }

    @Composable
    fun backgroundColor(state: SandboxEmbeddedChip.State): Brush {
        return SolidColor(
            when (state) {
                SandboxEmbeddedChip.State.Default -> SddsServTheme.colors.surfaceDefaultSolidDefault
                SandboxEmbeddedChip.State.Secondary -> SddsServTheme.colors.surfaceDefaultTransparentSecondary
                SandboxEmbeddedChip.State.Accent -> SddsServTheme.colors.surfaceDefaultAccent
            },
        )
    }

    @Composable
    fun shape(size: SandboxEmbeddedChip.Size): CornerBasedShape {
        return when (size) {
            SandboxEmbeddedChip.Size.L -> SddsServTheme.shapes.roundS
            SandboxEmbeddedChip.Size.M -> SddsServTheme.shapes.roundXs
            SandboxEmbeddedChip.Size.S -> SddsServTheme.shapes.roundXxs
            SandboxEmbeddedChip.Size.XS -> SddsServTheme.shapes.roundXxs.adjustBy(all = (-2).dp)
        }
    }

    @Composable
    fun iconSize(size: SandboxEmbeddedChip.Size): Dp {
        return when (size) {
            SandboxEmbeddedChip.Size.L -> 24.dp
            SandboxEmbeddedChip.Size.M -> 24.dp
            SandboxEmbeddedChip.Size.S -> 16.dp
            SandboxEmbeddedChip.Size.XS -> 12.dp
        }
    }

    @Composable
    fun contentMargin(size: SandboxEmbeddedChip.Size): Dp {
        return when (size) {
            SandboxEmbeddedChip.Size.L -> 8.dp
            SandboxEmbeddedChip.Size.M -> 6.dp
            SandboxEmbeddedChip.Size.S -> 4.dp
            SandboxEmbeddedChip.Size.XS -> 2.dp
        }
    }

    @Composable
    fun endPadding(size: SandboxEmbeddedChip.Size, hasEndContent: Boolean): Dp {
        if (hasEndContent) {
            return when (size) {
                SandboxEmbeddedChip.Size.L -> 12.dp
                SandboxEmbeddedChip.Size.M -> 10.dp
                SandboxEmbeddedChip.Size.S -> 8.dp
                SandboxEmbeddedChip.Size.XS -> 6.dp
            }
        }
        return when (size) {
            SandboxEmbeddedChip.Size.L -> 16.dp
            SandboxEmbeddedChip.Size.M -> 14.dp
            SandboxEmbeddedChip.Size.S -> 12.dp
            SandboxEmbeddedChip.Size.XS -> 10.dp
        }
    }

    @Composable
    fun startPadding(size: SandboxEmbeddedChip.Size, hasStartContent: Boolean): Dp {
        if (hasStartContent) {
            return when (size) {
                SandboxEmbeddedChip.Size.L -> 14.dp
                SandboxEmbeddedChip.Size.M -> 12.dp
                SandboxEmbeddedChip.Size.S -> 10.dp
                SandboxEmbeddedChip.Size.XS -> 6.dp
            }
        }
        return when (size) {
            SandboxEmbeddedChip.Size.L -> 16.dp
            SandboxEmbeddedChip.Size.M -> 14.dp
            SandboxEmbeddedChip.Size.S -> 12.dp
            SandboxEmbeddedChip.Size.XS -> 10.dp
        }
    }
}
