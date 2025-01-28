package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ShadowStyleGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Фабрика для [ShadowStyleGenerator]
 */
internal class ShadowStyleGeneratorFactory(
    private val outputResDir: File,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) {

    /**
     * Создает [ShadowStyleGenerator]
     */
    fun create() = ShadowStyleGenerator(
        outputResDir,
        xmlBuilderFactory,
        resourceReferenceProvider,
    )
}
