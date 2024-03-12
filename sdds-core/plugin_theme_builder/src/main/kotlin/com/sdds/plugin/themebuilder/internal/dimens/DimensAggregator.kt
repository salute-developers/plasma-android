package com.sdds.plugin.themebuilder.internal.dimens

/**
 * Агрегатор размеров.
 * Нужен для сбора всех размеров из токенов для
 * сохранения их в один файл.
 * @author Малышев Александр on 07.03.2024
 */
internal class DimensAggregator {

    private val mutableDimens = mutableSetOf<DimenData>()

    /**
     * Множество размеров
     */
    val dimens: Set<DimenData>
        get() = mutableDimens

    /**
     * Добавляет размер в агрегатор
     */
    fun addDimen(dimenData: DimenData) {
        mutableDimens.add(dimenData)
    }
}
