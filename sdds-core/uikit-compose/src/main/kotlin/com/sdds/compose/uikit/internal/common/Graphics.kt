package com.sdds.compose.uikit.internal.common

import androidx.annotation.FloatRange
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import com.sdds.compose.uikit.graphics.LayeredShaderBrush

internal fun DrawScope.drawOutline(
    outline: Outline,
    brush: Brush? = null,
    color: Color? = null,
    @FloatRange(from = 0.0, to = 1.0) alpha: Float = (brush as? LayeredShaderBrush)?.alpha ?: 1f,
    style: DrawStyle = Fill,
    colorFilter: ColorFilter? = null,
    blendMode: BlendMode = DrawScope.DefaultBlendMode,
) = when {
    brush != null -> drawOutline(outline, brush, alpha, style, colorFilter, blendMode)
    color != null -> drawOutline(outline, color, alpha, style, colorFilter, blendMode)
    else -> {}
}

internal fun Color.asBrush(): Brush = SolidColor(this)
