package com.sdkit.star.designsystem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.sdkit.star.designsystem.compose.R

/**
 * Extension property для преобразования целого числа в единицу измерения [Dp] с учетом стандартного базового размера из ресурсов.
 *
 * Используется для масштабирования размеров интерфейса в соответствии с дизайн-системой, где базовая размерность задается через ресурс [R.dimen.sdkit_cmp_standard_dimen].
 * Например, 2.dp вернет значение, равное удвоенному базовому размеру.
 *
 * @receiver Int множитель базового размера.
 * @return [Dp] результат умножения базового размера на [Int].
 */
val Int.dp: Dp
    @Composable
    @ReadOnlyComposable
    get() = dimensionResource(R.dimen.sdkit_cmp_standard_dp) * this

/**
 * Extension property для преобразования целого числа в текстовую единицу измерения [TextUnit] (sp) с учетом стандартного базового размера из ресурсов.
 *
 * Используется для масштабирования размеров шрифтов в соответствии с дизайн-системой, где базовая размерность задается через ресурс [R.dimen.sdkit_cmp_standard_dimen].
 * Например, 2.sp вернет значение, равное удвоенному базовому размеру в sp.
 *
 * @receiver Int множитель базового размера.
 * @return [TextUnit] результат умножения базового размера на [Int] в sp.
 */
val Int.sp: TextUnit
    @Composable
    @ReadOnlyComposable
    get() = (dimensionResource(R.dimen.sdkit_cmp_standard_sp).value * this).sp

/**
 * Extension property для преобразования числа с плавающей точкой в единицу измерения [Dp] с учетом стандартного базового размера из ресурсов.
 *
 * Используется для более точного масштабирования размеров интерфейса в соответствии с дизайн-системой, где базовая размерность задается через ресурс [R.dimen.sdkit_cmp_standard_dimen].
 * Например, 1.5f.dp вернет значение, равное 1.5 * базовый размер.
 *
 * @receiver Float множитель базового размера.
 * @return [Dp] результат умножения базового размера на [Float].
 */
val Float.dp: Dp
    @Composable
    @ReadOnlyComposable
    get() = dimensionResource(R.dimen.sdkit_cmp_standard_dp) * this

/**
 * Extension property для преобразования числа с плавающей точкой в текстовую единицу измерения [TextUnit] (sp) с учетом стандартного базового размера из ресурсов.
 *
 * Используется для более точного масштабирования размеров шрифтов в соответствии с дизайн-системой, где базовая размерность задается через ресурс [R.dimen.sdkit_cmp_standard_dimen].
 * Например, 1.5f.sp вернет значение, равное 1.5 * базовый размер в sp.
 *
 * @receiver Float множитель базового размера.
 * @return [TextUnit] результат умножения базового размера на [Float] в sp.
 */
val Float.sp: TextUnit
    @Composable
    @ReadOnlyComposable
    get() = (dimensionResource(R.dimen.sdkit_cmp_standard_sp).value * this).sp
