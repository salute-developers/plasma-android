package com.sdds.plugin.themebuilder.internal.dimens

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
class DimensAggregator {

    private val mutableDimens = mutableSetOf<DimenData>()
    val dimens: Set<DimenData>
        get() = mutableDimens

    fun addDimen(dimenData: DimenData) {
        mutableDimens.add(dimenData)
    }
}