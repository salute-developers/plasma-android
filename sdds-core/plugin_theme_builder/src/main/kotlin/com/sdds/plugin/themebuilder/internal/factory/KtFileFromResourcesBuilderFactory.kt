package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory.Package

/**
 * Фабрика для [KtFileFromResourcesBuilder]
 * @param packageName название пакета, куда будет сохранен файл
 */
internal class KtFileFromResourcesBuilderFactory(
    private val packageName: String,
) {

    /**
     * Создает [KtFileFromResourcesBuilder]
     */
    fun create(frameworkPackage: Package = Package.TOKENS): KtFileFromResourcesBuilder =
        KtFileFromResourcesBuilder("$packageName.${frameworkPackage.packageName}")
}
