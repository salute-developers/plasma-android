package com.sdds.uikit

import android.content.Context
import android.content.res.Resources
import android.content.res.TypedArray
import android.util.AttributeSet
import androidx.annotation.StyleRes
import com.google.android.material.color.MaterialColors
import com.sdds.uikit.shader.ShaderFactory
import com.sdds.uikit.shape.GradientShader
import com.sdds.uikit.shape.ShapeDrawable
import kotlin.math.roundToInt

/**
 * Возвращает кол-во целых px в указанном кол-ве целых dp
 */
val Int.dp: Int
    get() = (this * Resources.getSystem().displayMetrics.density).roundToInt()

/**
 * Возвращает кол-во px в указанном кол-ве dp
 */
val Float.dp: Float
    get() = this * Resources.getSystem().displayMetrics.density

/**
 * Возвращает целочисленное значение цвета по аттрибуту цвета темы
 * @param attr аттрибут цвета темы
 */
fun Context.colorFromAttr(attr: Int): Int =
    MaterialColors.getColor(this, attr, 0)

internal fun Context.shaderFactory(@StyleRes styleRes: Int): ShaderFactory? {
    return getShaderFactory(theme, styleRes)
}

internal fun getShaderFactory(
    theme: Resources.Theme?,
    @StyleRes styleRes: Int,
): ShaderFactory? {
    val attrs = R.styleable.SdShaderAppearance
    val typedArray = theme?.obtainStyledAttributes(styleRes, attrs)
    val shaderFactory = typedArray?.shaderFactory() ?: return null
    typedArray.recycle()
    return shaderFactory
}

internal fun TypedArray.shaderFactory(): ShaderFactory? {
    return let typedArray@{ array ->
        val type = ShapeDrawable.GradientType.values().getOrElse(
            array.getInt(R.styleable.SdShaderAppearance_sd_gradientType, 0),
        ) { ShapeDrawable.GradientType.NONE }

        if (type == ShapeDrawable.GradientType.NONE) {
            return@typedArray null
        }

        val colors = array.getResourceId(R.styleable.SdShaderAppearance_sd_colors, 0).let { colorsId ->
            if (colorsId == 0) return@let intArrayOf()
            resources.getIntArray(colorsId)
        }
        val stops = array.getResourceId(R.styleable.SdShaderAppearance_sd_stops, 0).let { stopsId ->
            resources.getStringArray(stopsId)
                .map { it.toFloatOrNull() ?: 0f }
                .toFloatArray()
        }
        val centerX = array.getFloat(R.styleable.SdShaderAppearance_sd_centerX, 0f)
        val centerY = array.getFloat(R.styleable.SdShaderAppearance_sd_centerY, 0f)
        val radius = array.getFloat(R.styleable.SdShaderAppearance_sd_radius, 0f)
        val angle = array.getFloat(R.styleable.SdShaderAppearance_sd_angle, 0f)
        return@typedArray when (type) {
            ShapeDrawable.GradientType.LINEAR -> GradientShader.Linear(colors, stops, angle)
            ShapeDrawable.GradientType.RADIAL -> GradientShader.Radial(
                colors = colors,
                positions = stops,
                radius = radius,
                centerX = centerX,
                centerY = centerY,
            )

            ShapeDrawable.GradientType.SWEEP -> GradientShader.Sweep(
                colors = colors,
                positions = stops,
                centerX = centerX,
                centerY = centerY,
            )

            ShapeDrawable.GradientType.SOLID -> GradientShader.Solid(colors.firstOrNull() ?: 0)
            else -> null
        }
    }
}
