package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.dimensFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File

/**
 * Генератор размеров
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param dimensAggregator агрегатов размеров
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param dimensConfig конфигурация размеров
 * @author Малышев Александр on 07.03.2024
 */
internal class DimenTokenGenerator(
    private val outputResDir: File,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val dimensConfig: DimensionsConfig,
) : SimpleBaseGenerator {

    private val xmlResourcesDocumentBuilder: XmlResourcesDocumentBuilder by unsafeLazy {
        xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES)
    }

    /**
     * @see BaseGenerator.generate
     */
    override fun generate() {
        dimensAggregator.dimens.forEach {
            xmlResourcesDocumentBuilder.appendDimen(it)
        }
        if (dimensAggregator.dimens.isNotEmpty()) {
            xmlResourcesDocumentBuilder.build(outputResDir.dimensFile())
        }
    }

    private fun XmlResourcesDocumentBuilder.appendDimen(dimen: DimenData) {
        val updatedValue = dimen.value.toFloat() * dimensConfig.multiplier
        appendElement(ElementName.DIMEN, dimen.name, "${updatedValue}${dimen.type.suffix}")
    }
}
