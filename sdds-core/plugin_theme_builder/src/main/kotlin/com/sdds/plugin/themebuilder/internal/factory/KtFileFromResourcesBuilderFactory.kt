package com.sdds.plugin.themebuilder.internal.factory

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
    fun create(frameworkPackage: Package = Package.COMPOSE): KtFileFromResourcesBuilder =
        KtFileFromResourcesBuilder("$packageName.${frameworkPackage.packageName}")

    internal enum class Package(val packageName: String) {
        VS("vs"),
        COMPOSE("compose")
    }
}
