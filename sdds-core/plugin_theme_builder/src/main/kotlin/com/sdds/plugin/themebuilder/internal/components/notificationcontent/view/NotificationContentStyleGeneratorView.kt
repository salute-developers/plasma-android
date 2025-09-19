package com.sdds.plugin.themebuilder.internal.components.notificationcontent.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.notificationcontent.NotificationContentProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class NotificationContentStyleGeneratorView(
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
) : ViewVariationGenerator<NotificationContentProperties>(
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
        variationNode: VariationNode<NotificationContentProperties>,
    ) = with(styleElement) {
        addProps(variationNode)
        NotificationContentDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        NotificationContentColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variationNode: VariationNode<NotificationContentProperties>) {
        val props = variationNode.value.props

        props.textStyle?.let { typographyAttribute("sd_textAppearance", it.value) }
        props.titleStyle?.let { typographyAttribute("sd_titleAppearance", it.value) }
        props.icon?.let { iconAttribute("sd_icon", it.value) }
        props.iconPlacement?.let {
            valueAttribute(
                "sd_notificationIconPlacement",
                it.value.asIconPlacement(),
            )
        }
        props.buttonLayout?.let { valueAttribute("sd_buttonLayout", it.value.asButtonLayout()) }
        props.buttonGroupStyle?.let {
            componentOverlayAttribute("sd_buttonGroupStyleOverlay", it.camelCaseValue(""))
        }
    }

    internal enum class NotificationContentColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<NotificationContentProperties> {
        TITLE_COLOR("sd_titleColor", "title_color"),
        TEXT_COLOR("sd_textColor", "text_color"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
        ;

        override fun provide(owner: NotificationContentProperties): Color? {
            return when (this) {
                TITLE_COLOR -> owner.titleColor
                TEXT_COLOR -> owner.textColor
                ICON_COLOR -> owner.iconColor
            }
        }
    }

    internal enum class NotificationContentDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<NotificationContentProperties, Float, Dimension> {
        ICON_SIZE("sd_iconSize", "icon_size"),
        ICON_MARGIN("sd_iconMargin", "icon_margin"),
        TEXT_PADDING("sd_textPadding", "text_padding"),
        CONTENT_START_PADDING("sd_contentStartPadding", "content_start_padding"),
        CONTENT_END_PADDING("sd_contentEndPadding", "content_end_padding"),
        CONTENT_TOP_PADDING("sd_contentTopPadding", "content_top_padding"),
        CONTENT_BOTTOM_PADDING("sd_contentBottomPadding", "content_bottom_padding"),
        TEXT_BOX_START_PADDING("sd_textBoxStartPadding", "tbox_start_padding"),
        TEXT_BOX_END_PADDING("sd_textBoxEndPadding", "tbox_end_padding"),
        TEXT_BOX_TOP_PADDING("sd_textBoxTopPadding", "tbox_top_padding"),
        TEXT_BOX_BOTTOM_PADDING("sd_textBoxBottomPadding", "tbox_bottom_padding"),
        BUTTON_GROUP_START_PADDING("sd_buttonGroupStartPadding", "btn_group_start_padding"),
        BUTTON_GROUP_END_PADDING("sd_buttonGroupEndPadding", "btn_group_end_padding"),
        BUTTON_GROUP_TOP_PADDING("sd_buttonGroupTopPadding", "btn_group_top_padding"),
        BUTTON_GROUP_BOTTOM_PADDING("sd_buttonGroupBottomPadding", "btn_group_bottom_padding"),
        ;

        @Suppress("CyclomaticComplexMethod")
        override fun provide(owner: NotificationContentProperties): Dimension? {
            return when (this) {
                ICON_SIZE -> owner.iconSize
                ICON_MARGIN -> owner.iconMargin
                TEXT_PADDING -> owner.textPadding
                CONTENT_START_PADDING -> owner.contentStartPadding
                CONTENT_END_PADDING -> owner.contentEndPadding
                CONTENT_TOP_PADDING -> owner.contentTopPadding
                CONTENT_BOTTOM_PADDING -> owner.contentBottomPadding
                TEXT_BOX_START_PADDING -> owner.textBoxStartPadding
                TEXT_BOX_END_PADDING -> owner.textBoxEndPadding
                TEXT_BOX_TOP_PADDING -> owner.textBoxTopPadding
                TEXT_BOX_BOTTOM_PADDING -> owner.textBoxBottomPadding
                BUTTON_GROUP_START_PADDING -> owner.buttonGroupStartPadding
                BUTTON_GROUP_END_PADDING -> owner.buttonGroupEndPadding
                BUTTON_GROUP_TOP_PADDING -> owner.buttonGroupTopPadding
                BUTTON_GROUP_BOTTOM_PADDING -> owner.buttonGroupBottomPadding
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "NotificationContent"
        const val DEF_STYLE_ATTR = "sd_notificationContentStyle"
        const val COMPONENT_PARENT = "Sdds.Components.NotificationContent"

        fun String.asIconPlacement(): String {
            return when (this) {
                "start" -> "start"
                "top" -> "top"
                else -> "none"
            }
        }

        fun String.asButtonLayout(): String {
            return when (this) {
                "stretch" -> "stretch"
                else -> "normal"
            }
        }
    }
}
