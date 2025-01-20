package com.sdds.plugin.themebuilder.internal.components.textfield.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Генератор стилей для компонента TextArea для ViewSystem
 * @author Малышев Александр on 10.12.2024
 */
internal class ViewTextAreaStyleGenerator(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
) : ViewTextFieldStyleGenerator(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = CORE_COMPONENT_NAME,
    componentParent = COMPONENT_PARENT,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = DEF_STYLE_ATTR,
) {
    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<TextFieldProperties>,
    ) =
        with(styleElement) {
            addProps(variation, variationNode)
            super.onCreateStyle(variation, rootDocument, styleElement, variationNode)
        }

    override fun createColorStateStyles(
        rootDocument: XmlResourcesDocumentBuilder,
        variationNode: VariationNode<TextFieldProperties>,
    ) = Unit

    @Suppress("CyclomaticComplexMethod", "LongMethod")
    private fun Element.addProps(
        variation: String,
        variationNode: VariationNode<TextFieldProperties>,
    ) {
        val props = variationNode.value.props
        props.scrollBarThickness?.let {
            dimenAttribute(
                variation,
                "sd_scrollBarThickness",
                "scrollbar_thickness",
                it.value,
            )
        }
        props.scrollBarPaddingTop?.let {
            dimenAttribute(
                variation,
                "sd_scrollBarPaddingTop",
                "scrollbar_padding_top",
                it.value,
            )
        }
        props.scrollBarPaddingEnd?.let {
            dimenAttribute(
                variation,
                "sd_scrollBarPaddingEnd",
                "scrollbar_padding_end",
                it.value,
            )
        }
        props.scrollBarPaddingBottom?.let {
            dimenAttribute(
                variation,
                "sd_scrollBarPaddingBottom",
                "scrollbar_padding_bottom",
                it.value,
            )
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "TextArea"
        const val DEF_STYLE_ATTR = "sd_textAreaStyle"
        const val COMPONENT_PARENT = "Sdds.Components.TextArea"
    }
}
