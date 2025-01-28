package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewShadowAttributeGenerator
import java.io.File

/**
 * Фабрика для [ViewShadowAttributeGenerator]
 */
internal class ViewShadowAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Создает [ViewShadowAttributeGenerator]
     */
    fun create(): ViewShadowAttributeGenerator =
        ViewShadowAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
            attrPrefix = attrPrefix,
        )
}
