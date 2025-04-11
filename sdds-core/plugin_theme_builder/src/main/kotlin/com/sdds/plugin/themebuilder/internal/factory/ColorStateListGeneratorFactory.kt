package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorStateListGenerator
import java.io.File

/**
 * Фабрика для [ColorStateListGenerator]
 * @author Малышев Александр on 03.12.2024
 */
internal class ColorStateListGeneratorFactory(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourcePrefixConfig: ResourcePrefixConfig,
    private val outputResDir: File,
) {

    /**
     * Создает ColorStateList.
     * @param outputFile файл, в который запишется сгенерированный ColorStateList
     */
    fun create(outputFileName: String): ColorStateListGenerator =
        ColorStateListGenerator(outputResDir, outputFileName, xmlBuilderFactory, resourcePrefixConfig.resourcePrefix)
}
