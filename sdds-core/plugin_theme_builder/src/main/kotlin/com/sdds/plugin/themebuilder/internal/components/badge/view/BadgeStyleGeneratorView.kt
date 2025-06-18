package com.sdds.plugin.themebuilder.internal.components.badge.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeProperties
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class BadgeStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String,
    styleComponentName: String = coreComponentName,
    componentParent: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String,
) : ViewVariationGenerator<BadgeProperties>(
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
        variationNode: VariationNode<BadgeProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        BadgeColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(
        variation: String,
        variationNode: VariationNode<BadgeProperties>,
    ) {
        val props = variationNode.value.props
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.labelStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.height?.let { dimenAttribute(variation, "android:minHeight", "min_height", it.value) }
        props.width?.let { dimenAttribute(variation, "android:minWidth", "min_width", it.value) }
        props.startPadding?.let {
            dimenAttribute(
                variation,
                "android:paddingStart",
                "padding_start",
                it.value,
            )
        }
        props.endPadding?.let {
            dimenAttribute(
                variation,
                "android:paddingEnd",
                "padding_end",
                it.value,
            )
        }
        props.startContentMargin?.let {
            dimenAttribute(
                variation,
                "sd_textPaddingStart",
                "text_padding_start",
                it.value,
            )
        }
        props.endContentMargin?.let {
            dimenAttribute(
                variation,
                "sd_textPaddingEnd",
                "text_padding_end",
                it.value,
            )
        }
        props.startContentSize?.let {
            dimenAttribute(
                variation,
                "sd_contentStartSize",
                "content_start_size",
                it.value,
            )
        }
        props.endContentSize?.let {
            dimenAttribute(
                variation,
                "sd_contentEndSize",
                "content_end_size",
                it.value,
            )
        }
    }

    internal enum class BadgeColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<BadgeProperties> {
        BACKGROUND_COLOR("android:backgroundTint", "bg_color"),
        LABEL_COLOR("android:textColor", "text_color"),
        CONTENT_START_COLOR("sd_drawableStartTint", "drawable_start_tint"),
        CONTENT_END_COLOR("sd_drawableEndTint", "drawable_end_tint"),
        ;

        override fun provide(owner: BadgeProperties): Color? {
            return when (this) {
                LABEL_COLOR -> owner.labelColor
                BACKGROUND_COLOR -> owner.backgroundColor
                CONTENT_START_COLOR -> owner.startContentColor
                CONTENT_END_COLOR -> owner.endContentColor
            }
        }
    }
}
