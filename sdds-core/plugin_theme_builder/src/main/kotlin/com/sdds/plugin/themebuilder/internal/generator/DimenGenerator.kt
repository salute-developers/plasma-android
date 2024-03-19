package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.dimensFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File

/**
 * Генератор размеров
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param dimensAggregator агрегатов размеров
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @author Малышев Александр on 07.03.2024
 */
internal class DimenGenerator(
    private val outputResDir: File,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
) : BaseGenerator {

    private val xmlDocumentBuilder: XmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }

    /**
     * @see BaseGenerator.generate
     */
    override fun generate() {
        dimensAggregator.dimens.forEach {
            xmlDocumentBuilder.appendDimen(it)
        }
        if (dimensAggregator.dimens.isNotEmpty()) {
            xmlDocumentBuilder.build(outputResDir.dimensFile())
        }
    }

    private fun XmlDocumentBuilder.appendDimen(dimen: DimenData) {
        appendElement(ElementName.DIMEN, dimen.name, "${dimen.value}${dimen.type.suffix}")
    }
}
