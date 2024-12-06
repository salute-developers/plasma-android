package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.button.ButtonComponentConfig
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.camelToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор стилей для компонентов view system.
 * @author Малышев Александр on 02.12.2024
 */
internal abstract class ViewComponentStyleGenerator<T : ComponentConfig>(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val dimensAggregator: DimensAggregator,
    private val outputResDir: File,
    private val attrPrefix: String,
    private val componentName: String,
    private val componentParent: String,
) : ComponentStyleGenerator<T> {

    private val xmlResourceBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val dimenPrefix by unsafeLazy { componentName.camelToSnakeCase() }
    private val baseStyleName by unsafeLazy { "Components.${componentName.capitalized()}" }

    override fun generate(config: T) {
        onGenerate(xmlResourceBuilder, config)
        xmlResourceBuilder.build(outputResDir)
    }

    abstract fun onGenerate(xmlResourcesBuilder: XmlResourcesDocumentBuilder, config: T)

    protected fun XmlResourcesDocumentBuilder.baseStyle(content: Element.() -> Unit = {}) {
        appendStyleWithCompositePrefix(baseStyleName, componentParent, content)
    }

    protected fun XmlResourcesDocumentBuilder.variationStyle(
        name: String,
        content: Element.() -> Unit,
    ) {
        appendStyleWithCompositePrefix("$baseStyleName.${name.capitalized()}", content = content)
    }

    protected fun Element.circleShapeAttribute() = with(xmlResourceBuilder) {
        this@circleShapeAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = "sd_shapeAppearance",
            value = "?sd_shapeAppearanceCircle",
            usePrefix = false,
        )
    }

    protected fun Element.shapeAttribute(
        size: String,
        shape: ButtonComponentConfig.Shape,
    ) = with(xmlResourceBuilder) {
        this@shapeAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = "sd_shapeAppearance",
            value = "?${attrPrefix}_${ShapeToken.getAttrName(shape.name)}",
            usePrefix = false,
        )
        val adjustment = shape.adjustment ?: return@with
        dimenAttribute(size, "sd_shapeAppearanceAdjustment", "shape_adjustment", adjustment)
    }

    protected fun Element.typographyAttribute(
        attributeName: String,
        tokenName: String,
    ) = with(xmlResourceBuilder) {
        this@typographyAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = resourceReferenceProvider.style(TypographyToken.getViewTextAppearanceName(tokenName)),
            usePrefix = false,
        )
    }

    protected fun Element.dimenAttribute(
        variation: String,
        elementName: String,
        dimenName: String,
        value: Float,
    ) = with(xmlResourceBuilder) {
        val dimen = DimenData(
            name = "${dimenPrefix}_${variation}_$dimenName",
            value = value,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(dimen)
        this@dimenAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = elementName,
            value = resourceReferenceProvider.dimen(dimen),
            usePrefix = false,
        )
    }
}
