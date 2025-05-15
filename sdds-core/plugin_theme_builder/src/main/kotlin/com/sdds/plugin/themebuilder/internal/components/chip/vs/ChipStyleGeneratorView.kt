package com.sdds.plugin.themebuilder.internal.components.chip.vs

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.chip.ChipProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Chip
 */
internal open class ChipStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    styleComponentName: String = coreComponentName,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<ChipProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    styleComponentName = styleComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {
    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<ChipProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        ChipColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(
        variation: String,
        variationNode: VariationNode<ChipProperties>,
    ) {
        val props = variationNode.value.props
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.labelStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }
        props.height?.let { dimenAttribute(variation, "android:minHeight", "min_height", it.value) }
        props.paddingStart?.let {
            dimenAttribute(
                variation,
                "android:paddingStart",
                "padding_start",
                it.value,
            )
        }
        props.paddingEnd?.let {
            dimenAttribute(
                variation,
                "android:paddingEnd",
                "padding_end",
                it.value,
            )
        }
        props.contentStartPadding?.let {
            dimenAttribute(
                variation,
                "sd_textPaddingStart",
                "text_padding_start",
                it.value,
            )
        }
        props.contentEndPadding?.let {
            dimenAttribute(
                variation,
                "sd_textPaddingEnd",
                "text_padding_end",
                it.value,
            )
        }
        props.contentStartSize?.let {
            dimenAttribute(
                variation,
                "sd_contentStartSize",
                "content_start_size",
                it.value,
            )
        }
        props.contentEndSize?.let {
            dimenAttribute(
                variation,
                "sd_contentEndSize",
                "content_end_size",
                it.value,
            )
        }
    }

    internal enum class ChipColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ChipProperties> {
        BACKGROUND_COLOR("android:backgroundTint", "bg_color"),
        LABEL_COLOR("android:textColor", "text_color"),
        CONTENT_START_COLOR("sd_drawableStartTint", "drawable_start_tint"),
        CONTENT_END_COLOR("sd_drawableEndTint", "drawable_end_tint"),
        ;

        override fun provide(owner: ChipProperties): Color? {
            return when (this) {
                LABEL_COLOR -> owner.labelColor
                BACKGROUND_COLOR -> owner.backgroundColor
                CONTENT_START_COLOR -> owner.contentStartColor
                CONTENT_END_COLOR -> owner.contentEndColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Chip"
        const val DEF_STYLE_ATTR = "sd_chipStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Chip"
    }
}
