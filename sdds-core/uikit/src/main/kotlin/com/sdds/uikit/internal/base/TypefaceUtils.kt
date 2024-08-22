package com.sdds.uikit.internal.base

import android.content.Context
import android.content.res.Configuration
import android.graphics.Typeface
import android.graphics.fonts.FontStyle
import android.os.Build
import androidx.core.math.MathUtils

/**
 * Утилиты для работы с [Typeface]
 */
internal object TypefaceUtils {

    /**
     * Копирует [typeface] с поправками на fontWeight
     */
    fun maybeCopyWithFontWeightAdjustment(context: Context, typeface: Typeface): Typeface? =
        if (
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.S &&
            context.resources.configuration.fontWeightAdjustment != Configuration.FONT_WEIGHT_ADJUSTMENT_UNDEFINED &&
            context.resources.configuration.fontWeightAdjustment != 0
        ) {
            val adjustedWeight = MathUtils.clamp(
                typeface.weight + context.resources.configuration.fontWeightAdjustment,
                FontStyle.FONT_WEIGHT_MIN,
                FontStyle.FONT_WEIGHT_MAX,
            )
            Typeface.create(typeface, adjustedWeight, typeface.isItalic)
        } else {
            null
        }
}
