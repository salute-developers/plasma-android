package com.sdds.uikit

import android.content.Context
import android.content.res.Resources
import com.google.android.material.color.MaterialColors
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
