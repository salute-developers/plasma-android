package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder

/**
 * Фабрика для [XmlDocumentBuilder]
 * @param packageName название пакета, куда будет сохранен файл
 * @author Малышев Александр on 07.03.2024
 */
internal class KtFileBuilderFactory(
    private val packageName: String,
) {

    /**
     * Создает [XmlDocumentBuilder]
     */
    fun create(fileName: String): KtFileBuilder = KtFileBuilder(packageName, fileName)
}
