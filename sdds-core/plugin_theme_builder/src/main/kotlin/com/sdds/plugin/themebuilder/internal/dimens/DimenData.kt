package com.sdds.plugin.themebuilder.internal.dimens

/**
 * Данные о размере (dimen)
 * @property name название размера
 * @property value значение размера
 * @property type тип размера
 * @author Малышев Александр on 07.03.2024
 */
internal data class DimenData(
    val name: String,
    val value: Number,
    val type: Type,
) {

    /**
     * Тип размера с суффиксом
     * @property suffix суффикс
     */
    enum class Type(val suffix: String) {
        DP("dp"), SP("sp"), PX("px")
    }
}
