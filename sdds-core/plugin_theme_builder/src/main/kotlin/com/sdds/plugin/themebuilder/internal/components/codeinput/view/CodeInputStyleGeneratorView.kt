package com.sdds.plugin.themebuilder.internal.components.codeinput.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.codeinput.CodeInputProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class CodeInputStyleGeneratorView(
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
) : ViewVariationGenerator<CodeInputProperties>(
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
        variationNode: VariationNode<CodeInputProperties>,
        props: CodeInputProperties,
    ) = with(styleElement) {
        CodeInputdDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, props)
        CodeInputColorProperty.values().forEach { codeColorProperty ->
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

    private fun Element.addProps(variation: String, props: CodeInputProperties) {
        props.codeStyle?.let { typographyAttribute("sd_valueAppearance", it.value) }
        props.captionStyle?.let { typographyAttribute("sd_captionAppearance", it.value) }
    }

    private enum class CodeInputdDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<CodeInputProperties, Float, Dimension> {
        ITEM_HEIGHT("sd_itemHeight", "item_height"),
        ITEM_WIDTH("sd_itemWidth", "item_width"),
        DOT_SIZE("sd_dotSize", "dot_size"),
        ITEM_SPACING("sd_itemSpacing", "item_spacing"),
        GROUP_SPACING("sd_groupSpacing", "group_spacing"),
        CAPTION_PADDING("sd_captionPadding", "caption_padding"),
        STROKE_WIDTH("sd_strokeWidth", "stroke_width"),
        ;

        override fun provide(owner: CodeInputProperties): Dimension? {
            return when (this) {
                ITEM_HEIGHT -> owner.itemHeight
                ITEM_WIDTH -> owner.itemWidth
                DOT_SIZE -> owner.dotSize
                ITEM_SPACING -> owner.itemSpacing
                GROUP_SPACING -> owner.groupSpacing
                CAPTION_PADDING -> owner.captionPadding
                STROKE_WIDTH -> owner.strokeWidth
            }
        }
    }

    private enum class CodeInputColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<CodeInputProperties> {
        CODE_COLOR("sd_valueColor", "value_color"),
        FILL_COLOR("sd_dotColor", "dot_color"),
        CAPTION_COLOR("sd_captionColor", "caption_color"),
        STROKE_COLOR("sd_strokeColor", "stroke_color"),
        ;

        override fun provide(owner: CodeInputProperties): Color? {
            return when (this) {
                CODE_COLOR -> owner.codeColor
                FILL_COLOR -> owner.fillColor
                CAPTION_COLOR -> owner.captionColor
                STROKE_COLOR -> owner.strokeColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "CodeInput"
        const val DEF_STYLE_ATTR = "sd_codeInputStyle"
        const val COMPONENT_PARENT = "Sdds.Components.CodeInput"
    }
}
