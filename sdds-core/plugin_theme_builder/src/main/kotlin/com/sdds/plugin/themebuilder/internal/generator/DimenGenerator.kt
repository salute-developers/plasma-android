package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.FileProvider.dimensFile
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import java.io.File

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
class DimenGenerator(
    private val outputDir: File,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory
) : BaseGenerator {

    private val xmlDocumentBuilder: XmlDocumentBuilder = xmlBuilderFactory.create("resources")

    override fun generate() {
        dimensAggregator.dimens.forEach {
            xmlDocumentBuilder.appendDimen(it)
        }
        xmlDocumentBuilder.build(outputDir.dimensFile())
    }

    private fun XmlDocumentBuilder.appendDimen(dimen: DimenData) {
        appendToken("dimen", dimen.name, "${dimen.value}${dimen.type.suffix}")
    }
}