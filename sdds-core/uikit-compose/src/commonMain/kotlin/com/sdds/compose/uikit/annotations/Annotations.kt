package com.sdds.compose.uikit.annotations

/**
 * Помечает целочисленное значение как Android drawable-ресурс на Android-таргетах.
 */
annotation class DrawableRes

/**
 * Помечает целочисленное значение как Android string-ресурс на Android-таргетах.
 */
annotation class StringRes

/**
 * Помечает значение с плавающей точкой допустимым диапазоном.
 *
 * @property from нижняя граница допустимого диапазона.
 * @property to верхняя граница допустимого диапазона.
 * @property fromInclusive входит ли [from] в допустимый диапазон.
 * @property toInclusive входит ли [to] в допустимый диапазон.
 */
annotation class FloatRange(
    val from: Double = Double.NEGATIVE_INFINITY,
    val to: Double = Double.POSITIVE_INFINITY,
    val fromInclusive: Boolean = true,
    val toInclusive: Boolean = true,
)

/**
 * Помечает целочисленное значение допустимым диапазоном.
 *
 * @property from нижняя граница допустимого диапазона.
 * @property to верхняя граница допустимого диапазона.
 */
annotation class IntRange(
    val from: Long = Long.MIN_VALUE,
    val to: Long = Long.MAX_VALUE,
)
