package com.sdkit.star.designsystem

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.color.MaterialColors

/**
 * Метод возвращает [ColorStateList] из контейнера [TypedArray] по индексу [index],
 * если такой индекс указан, иначе null
 * @return [ColorStateList]
 * @author Александр Малышев on 28.07.2023
 */
fun TypedArray.obtainColorStateList(context: Context, index: Int): ColorStateList? {
    val resId = getResourceId(index, 0)
    return if (resId != 0) {
        AppCompatResources.getColorStateList(context, resId)
    } else {
        getColorStateList(index)
    }
}

/**
 * Возвращает целочисленное значение цвета по аттрибуту цвета темы
 * @param attr аттрибут цвета темы
 */
fun Context.colorFromAttr(attr: Int): Int =
    MaterialColors.getColor(this, attr, 0)
