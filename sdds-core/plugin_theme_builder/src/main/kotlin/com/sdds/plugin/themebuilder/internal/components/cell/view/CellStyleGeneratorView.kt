package com.sdds.plugin.themebuilder.internal.components.cell.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseName
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.cell.CellProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class CellStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<CellProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {

    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<CellProperties>,
    ) = with(styleElement) {
        CellDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variationNode)
        CellColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    override fun onCreateOverlayStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<CellProperties>,
    ) = with(styleElement) {
        super.onCreateOverlayStyle(variation, rootDocument, styleElement, variationNode)
        addCellContentStyleAttribute(variationNode)
    }

    private fun Element.addCellContentStyleAttribute(variationNode: VariationNode<CellProperties>) {
        val props = variationNode.value.props
        props.avatarStyle?.let { componentStyleAttribute("sd_avatarStyle", it.camelCaseValue(".")) }
        props.switchStyle?.let { componentStyleAttribute("sd_switchStyle", it.camelCaseValue(".")) }
        props.iconButtonStyle?.let { componentStyleAttribute("android:buttonStyle", it.camelCaseValue(".")) }
        props.radioBoxStyle?.let { componentStyleAttribute("android:radioButtonStyle", it.camelCaseValue(".")) }
        props.checkBoxStyle?.let { componentStyleAttribute("android:checkboxStyle", it.camelCaseValue(".")) }
    }

    private fun Element.addProps(
        variationNode: VariationNode<CellProperties>,
    ) {
        val props = variationNode.value.props

        val overlayStyleName = variationNode.camelCaseName("")
        props.labelStyle?.let { typographyAttribute("sd_labelAppearance", it.value) }
        props.titleStyle?.let { typographyAttribute("sd_titleAppearance", it.value) }
        props.subtitleStyle?.let { typographyAttribute("sd_subtitleAppearance", it.value) }
        props.disclosureTextStyle?.let { typographyAttribute("sd_disclosureTextAppearance", it.value) }
        props.disclosureIcon?.let { iconAttribute("sd_disclosureIcon", it.value) }

        if (props.cellContentStyleNotEmpty()) {
            componentOverlayAttribute("android:theme", "$styleComponentName$overlayStyleName")
        }
    }

    private enum class CellDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<CellProperties, Float, Dimension> {
        CONTENT_PADDING_START("sd_contentStartPadding", "content_start_padding"),
        CONTENT_PADDING_END("sd_contentEndPadding", "content_end_padding"),
        ;

        override fun provide(owner: CellProperties): Dimension? {
            return when (this) {
                CONTENT_PADDING_START -> owner.contentPaddingStart
                CONTENT_PADDING_END -> owner.contentPaddingEnd
            }
        }
    }

    private enum class CellColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<CellProperties> {
        LABEL_COLOR("sd_labelColor", "label_color"),
        TITLE_COLOR("sd_titleColor", "title_color"),
        SUBTITLE_COLOR("sd_subtitleColor", "subtitle_color"),
        DISCLOSURE_TEXT_COLOR("sd_disclosureTextColor", "disclosure_text_color"),
        DISCLOSURE_ICON_COLOR("sd_disclosureColor", "disclosure_color"),
        ;

        override fun provide(owner: CellProperties): Color? {
            return when (this) {
                LABEL_COLOR -> owner.labelColor
                TITLE_COLOR -> owner.titleColor
                SUBTITLE_COLOR -> owner.subtitleColor
                DISCLOSURE_TEXT_COLOR -> owner.disclosureTextColor
                DISCLOSURE_ICON_COLOR -> owner.disclosureIconColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Cell"
        const val DEF_STYLE_ATTR = "sd_cellStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Cell"

        private fun CellProperties.cellContentStyleNotEmpty(): Boolean =
            avatarStyle != null || switchStyle != null || iconButtonStyle != null ||
                radioBoxStyle != null || checkBoxStyle != null
    }
}
