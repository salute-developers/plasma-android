package com.sdds.plugin.themebuilder.internal.components.notification.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.notification.NotificationProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class NotificationStyleGeneratorView(
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
) : ViewVariationGenerator<NotificationProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    componentParent = componentParent,
    styleComponentName = styleComponentName,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {

    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<NotificationProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        NotificationDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        NotificationColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<NotificationProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.shadow?.let { shadowAttribute(it.value) }
        props.closeAlignment?.let { valueAttribute("sd_closeIconAlignment", it.value.asIconAlignment()) }
    }

    internal enum class NotificationColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<NotificationProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        CLOSE_COLOR("sd_closeIconTint", "close_icon_color"),
        ;

        override fun provide(owner: NotificationProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                CLOSE_COLOR -> owner.closeColor
            }
        }
    }

    internal enum class NotificationDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<NotificationProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        CLOSE_SIZE("sd_closeIconSize", "close_icon_size"),
        ;

        override fun provide(owner: NotificationProperties): Dimension? {
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
        const val CORE_COMPONENT_NAME = "Notification"
        const val DEF_STYLE_ATTR = "sd_notificationStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Notification"

        fun String.asIconAlignment(): String {
            return when (this) {
                "center-end" -> "centerEnd"
                else -> "topEnd"
            }
        }
    }
}
