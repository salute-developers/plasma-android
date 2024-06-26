package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
import java.io.File

/**
 * Фабрика для [ViewColorAttributeGenerator]
 */
internal class ViewColorAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Создает [ViewColorAttributeGenerator]
     */
    fun create(): ViewColorAttributeGenerator =
        ViewColorAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
            attrPrefix = attrPrefix,
        )
}
