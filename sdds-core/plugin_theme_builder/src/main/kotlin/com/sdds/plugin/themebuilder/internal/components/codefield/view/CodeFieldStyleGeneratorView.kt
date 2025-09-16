package com.sdds.plugin.themebuilder.internal.components.codefield.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.codefield.CodeFieldProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class CodeFieldStyleGeneratorView(
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
) : ViewVariationGenerator<CodeFieldProperties>(
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
        variationNode: VariationNode<CodeFieldProperties>,
        props: CodeFieldProperties,
    ) = with(styleElement) {
        CodeFieldDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, props)
        CodeFieldColorProperty.values().forEach { codeColorProperty ->
            addColorProperty(codeColorProperty, variation, variationNode) {
                containsState(it.state, listOf("error"))
            }
        }
    }

    private fun containsState(states: List<String>, stateNames: List<String>): Set<StateListAttribute> {
        return states.intersect(stateNames.toSet())
            .map { stateName -> StateListAttribute("app:sd_state_$stateName", "true") }
            .toSet()
    }

    private fun Element.addProps(variation: String, props: CodeFieldProperties) {
        props.itemShape?.let { shapeAttribute(variation, it.value, attrName = "item") }
        props.groupShape?.let { shapeAttribute(variation, it.value, attrName = "group") }
        props.valueStyle?.let { typographyAttribute("sd_valueAppearance", it.value) }
        props.captionStyle?.let { typographyAttribute("sd_captionAppearance", it.value) }
    }

    private enum class CodeFieldDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<CodeFieldProperties, Float, Dimension> {
        CELL_HEIGHT("sd_itemHeight", "item_height"),
        CELL_WIDTH("sd_itemWidth", "item_width"),
        DOT_SIZE("sd_dotSize", "dot_size"),
        ITEM_SPACING("sd_itemSpacing", "item_spacing"),
        GROUP_SPACING("sd_groupSpacing", "group_spacing"),
        CAPTION_PADDING("sd_captionPadding", "caption_padding"),
        ;

        override fun provide(owner: CodeFieldProperties): Dimension? {
            return when (this) {
                CELL_HEIGHT -> owner.height
                CELL_WIDTH -> owner.width
                DOT_SIZE -> owner.dotSize
                ITEM_SPACING -> owner.itemSpacing
                GROUP_SPACING -> owner.groupSpacing
                CAPTION_PADDING -> owner.captionSpacing
            }
        }
    }

    private enum class CodeFieldColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<CodeFieldProperties> {
        VALUE_COLOR("sd_valueColor", "value_color"),
        CURSOR_COLOR("sd_cursorColor", "cursor_color"),
        DOT_COLOR("sd_dotColor", "dot_color"),
        CAPTION_COLOR("sd_captionColor", "caption_color"),
        BACKGROUND_COLOR("sd_background", "background"),
        ;

        override fun provide(owner: CodeFieldProperties): Color? {
            return when (this) {
                VALUE_COLOR -> owner.valueColor
                CURSOR_COLOR -> owner.cursorColor
                DOT_COLOR -> owner.dotColor
                CAPTION_COLOR -> owner.captionColor
                BACKGROUND_COLOR -> owner.backgroundColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "CodeField"
        const val DEF_STYLE_ATTR = "sd_codeFieldStyle"
        const val COMPONENT_PARENT = "Sdds.Components.CodeField"
    }
}
