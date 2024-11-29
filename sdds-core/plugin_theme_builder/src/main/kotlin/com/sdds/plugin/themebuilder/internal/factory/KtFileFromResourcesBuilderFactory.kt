package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder

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
    fun create(frameworkPackage: TargetPackage = TargetPackage.TOKENS): KtFileFromResourcesBuilder =
        KtFileFromResourcesBuilder("$packageName.${frameworkPackage.packageName}")
}
