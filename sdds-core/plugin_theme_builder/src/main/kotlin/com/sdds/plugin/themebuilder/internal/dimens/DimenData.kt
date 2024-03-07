package com.sdds.plugin.themebuilder.internal.dimens

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
data class DimenData(
    val name: String,
    val value: Number,
    val type: Type
) {

    enum class Type(val suffix: String) {
        DP("dp"), SP("sp"), PX("px")
    }
}
