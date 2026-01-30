package com.sdds.plugin.themebuilder.internal.components.modal.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.modal.ModalProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import org.w3c.dom.Element
import java.io.File

internal class ModalStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    styleComponentName: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<ModalProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    styleComponentName = styleComponentName,
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
        variationNode: VariationNode<ModalProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        ModalDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        ModalColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<ModalProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.shadow?.let { shadowAttribute(it.value) }
        props.overlayStyle?.let {
            componentOverlayAttribute(
                "sd_overlayStyleOverlay",
                "${it.value.techToCamelCase()}View",
            )
        }
    }

    internal enum class ModalColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ModalProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        CONTENT_START_COLOR("sd_closeIconTint", "close_icon_color"),
        ;

        override fun provide(owner: ModalProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                CONTENT_START_COLOR -> owner.closeColor
            }
        }
    }

    internal enum class ModalDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<ModalProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        CLOSE_SIZE("sd_closeIconSize", "close_icon_size"),
        ;

        override fun provide(owner: ModalProperties): Dimension? {
            return when (this) {
                CLOSE_SIZE -> owner.closeSize
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Modal"
        const val DEF_STYLE_ATTR = "sd_modalStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Modal"
    }
}
