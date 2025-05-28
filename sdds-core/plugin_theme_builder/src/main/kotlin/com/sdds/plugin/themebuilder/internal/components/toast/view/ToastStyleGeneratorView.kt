package com.sdds.plugin.themebuilder.internal.components.toast.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.toast.ToastProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class ToastStyleGeneratorView(
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
) : ViewVariationGenerator<ToastProperties>(
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
        variationNode: VariationNode<ToastProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        ToastDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        ToastColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<ToastProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.textStyle?.let { typographyAttribute("android:textAppearance", it.value) }
    }

    internal enum class ToastColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ToastProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        TEXT_COLOR("sd_textColor", "text_color"),
        CONTENT_START_COLOR("sd_contentStartTint", "content_start_color"),
        CONTENT_END_COLOR("sd_contentEndTint", "content_end_color"),
        ;

        override fun provide(owner: ToastProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                TEXT_COLOR -> owner.textColor
                CONTENT_START_COLOR -> owner.contentStartColor
                CONTENT_END_COLOR -> owner.contentEndColor
            }
        }
    }

    internal enum class ToastDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<ToastProperties, Float, Dimension> {
        CONTENT_START_SIZE("sd_contentStartSize", "content_start_size"),
        CONTENT_START_PADDING("sd_contentStartPadding", "content_start_padding"),
        CONTENT_END_SIZE("sd_contentEndSize", "content_end_size"),
        CONTENT_END_PADDING("sd_contentEndPadding", "content_end_padding"),
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        ;

        override fun provide(owner: ToastProperties): Dimension? {
            return when (this) {
                CONTENT_START_SIZE -> owner.contentStartSize
                CONTENT_START_PADDING -> owner.contentStartPadding
                CONTENT_END_SIZE -> owner.contentEndSize
                CONTENT_END_PADDING -> owner.contentEndPadding
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Toast"
        const val DEF_STYLE_ATTR = "sd_toastStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Toast"
    }
}
