package com.sdds.playground.sandbox.core.compose

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

internal val LocalSandboxStyle = compositionLocalOf { SandboxStyle.create() }

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
@Immutable
internal interface SandboxStyle {

    val drawerBackgroundColor: Color
    val sheetBackgroundColor: Color
    val sheetShape: Shape

    companion object {

        fun create(
            drawerBackgroundColor: Color = Color.LightGray,
            sheetBackgroundColor: Color = Color.LightGray,
            sheetShape: Shape = RectangleShape,
        ): SandboxStyle {
            return SandboxStyleImpl(
                drawerBackgroundColor = drawerBackgroundColor,
                sheetBackgroundColor = sheetBackgroundColor,
                sheetShape = sheetShape,
            )
        }
    }
}

@Immutable
private data class SandboxStyleImpl(
    override val drawerBackgroundColor: Color,
    override val sheetBackgroundColor: Color,
    override val sheetShape: Shape,
) : SandboxStyle
