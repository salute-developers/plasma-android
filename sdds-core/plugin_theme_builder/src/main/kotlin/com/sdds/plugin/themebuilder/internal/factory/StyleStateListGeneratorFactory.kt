package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.components.base.view.StyleStateListGenerator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Фабрика для [StyleStateListGenerator]
 */
internal class StyleStateListGeneratorFactory(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourcePrefix: String,
    private val outputResDir: File,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) {

    /**
     * Создает [StyleStateListGenerator].
     * @param outputFileName название файла, в который запишется сгенерированный StyleStateList
     */
    fun <S : State<String>, V : Stateful<String, out S>> create(
        outputFileName: String,
    ): StyleStateListGenerator<S, V> =
        StyleStateListGenerator(
            outputResDir = outputResDir,
            fileName = outputFileName,
            resourcePrefix = resourcePrefix,
            xmlBuilderFactory = xmlBuilderFactory,
            resourceReferenceProvider = resourceReferenceProvider,
        )
}
