package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder

/**
 * Фабрика для [KtFileBuilder]
 * @param packageName название пакета, куда будет сохранен файл
 * @author Малышев Александр on 07.03.2024
 */
internal class KtFileBuilderFactory(
    private val packageName: String,
) {

    /**
     * Создает [KtFileBuilder]
     */
    fun create(fileName: String): KtFileBuilder = KtFileBuilder(packageName, fileName)
}
