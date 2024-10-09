package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientStylesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File

/**
 * Генератор стилей градиентов
 */
internal class GradientStyleGenerator(
    private val outputResDir: File,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : SimpleBaseGenerator {

    private var needDeclareStyle: Boolean = true

    private val xmlStylesDocumentBuilder: XmlResourcesDocumentBuilder by unsafeLazy {
        xmlBuilderFactory.create(XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES)
    }

    private val gradientStyles: MutableMap<String, String> = mutableMapOf()

    /**
     * Добавляет стиль градиента
     *
     * @param nameSnakeCase имя градиента
     * @param gradientParameters пары атрибут-значение
     * @param description описание градиента
     *
     * @return вернет ссылку стиль
     */
    fun addStyle(
        nameSnakeCase: String,
        gradientParameters: Map<String, String>,
        description: String,
    ): String {
        val styleName = nameSnakeCase.snakeToCamelCase()
        val styleRes = resourceReferenceProvider.style("Gradient.$styleName")
        if (gradientStyles.contains(styleName)) {
            return gradientStyles[styleName] ?: styleRes
        }
        gradientStyles[styleName] = styleRes
        with(xmlStylesDocumentBuilder) {
            appendGradientLayerStyle(
                tokenName = styleName,
                parameters = gradientParameters,
                description = description,
            )
        }
        return styleRes
    }

    override fun generate() {
        xmlStylesDocumentBuilder.build(outputResDir.gradientStylesXmlFile())
    }

    private fun XmlResourcesDocumentBuilder.appendGradientLayerStyle(
        tokenName: String,
        parameters: Map<String, String>,
        description: String,
    ) {
        if (needDeclareStyle) {
            needDeclareStyle = false
            appendStyleWithCompositePrefix("Gradient")
        }

        wrapWithRegion(description) {
            appendStyleWithCompositePrefix("Gradient.$tokenName") {
                parameters.entries.forEach {
                    appendElement(
                        elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
                        tokenName = it.key,
                        value = it.value,
                        usePrefix = false,
                    )
                }
            }
        }
    }
}
