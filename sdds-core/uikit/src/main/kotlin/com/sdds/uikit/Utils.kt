package com.sdds.uikit

import android.content.Context
import com.google.android.material.color.MaterialColors

/**
 * Возвращает целочисленное значение цвета по аттрибуту цвета темы
 * @param attr аттрибут цвета темы
 */
fun Context.colorFromAttr(attr: Int): Int =
    MaterialColors.getColor(this, attr, 0)
