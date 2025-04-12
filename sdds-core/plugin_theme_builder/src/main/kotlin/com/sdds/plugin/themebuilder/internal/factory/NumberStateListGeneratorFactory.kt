package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.components.base.view.NumberStateListGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Фабрика для [NumberStateListGenerator]
 * @author Малышев Александр on 11.04.2025
 */
internal class NumberStateListGeneratorFactory(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourcePrefix: String,
    private val outputResDir: File,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) {

    /**
     * Создает [NumberStateListGenerator].
     * @param outputFileName название файла, в который запишется сгенерированный NumberStateList
     */
    fun <T : Number, S : State<T>, V : Stateful<T, out S>> create(
        outputFileName: String,
    ): NumberStateListGenerator<T, S, V> =
        NumberStateListGenerator(
            outputResDir = outputResDir,
            fileName = outputFileName,
            resourcePrefix = resourcePrefix,
            xmlBuilderFactory = xmlBuilderFactory,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )
}
