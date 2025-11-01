package com.sdds.plugin.themebuilder.internal.components.note.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.note.NoteProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class NoteStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    styleComponentName: String,
    coreComponentName: String,
    componentParent: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String,
) : ViewVariationGenerator<NoteProperties>(
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
        variationNode: VariationNode<NoteProperties>,
        props: NoteProperties,
    ) = with(styleElement) {
        addProps(variation, props)
        NoteDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        NoteColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, props: NoteProperties) {
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.textStyle?.let { typographyAttribute("sd_textAppearance", it.value) }
        props.titleStyle?.let { typographyAttribute("sd_titleAppearance", it.value) }
        props.closeIcon?.let { iconAttribute("sd_closeIcon", it.value) }
        props.contentBeforeArrangement?.let {
            valueAttribute(
                "sd_contentBeforeArrangement",
                it.value.asContentBeforeArrangement(),
            )
        }
        props.linkButtonStyle?.let {
            componentOverlayAttribute("sd_linkButtonStyleOverlay", it.camelCaseValue(""))
        }
    }

    internal enum class NoteColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<NoteProperties> {
        TITLE_COLOR("sd_titleColor", "title_color"),
        TEXT_COLOR("sd_textColor", "text_color"),
        BACKGROUND_COLOR("sd_background", "bg_color"),
        CLOSE_COLOR("sd_closeIconTint", "close_icon_color"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
        ;

        override fun provide(owner: NoteProperties): Color? {
            return when (this) {
                ICON_COLOR -> owner.iconColor
                BACKGROUND_COLOR -> owner.backgroundColor
                CLOSE_COLOR -> owner.closeColor
                TITLE_COLOR -> owner.titleColor
                TEXT_COLOR -> owner.textColor
            }
        }
    }

    internal enum class NoteDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<NoteProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),

        CLOSE_SIZE("sd_closeIconSize", "close_icon_size"),
        ICON_SIZE("sd_iconSize", "icon_size"),

        TEXT_TOP_MARGIN("sd_textTopMargin", "text_top_margin"),
        CONTENT_BEFORE_END_MARGIN("sd_contentBeforeEndMargin", "content_before_end_margin"),
        TITLE_PADDING_END("sd_titlePaddingEnd", "title_padding_end"),

        CLOSE_TOP_MARGIN("sd_closeTopMargin", "close_top_margin"),
        CLOSE_START_MARGIN("sd_closeStartMargin", "close_start_margin"),
        CLOSE_END_MARGIN("sd_closeEndMargin", "close_end_margin"),
        ACTION_TOP_MARGIN("sd_actionTopMargin", "action_top_margin"),
        ACTION_START_MARGIN("sd_actionStartMargin", "action_start_margin"),
        ACTION_END_MARGIN("sd_actionEndMargin", "action_end_margin"),
        ;

        @Suppress("CyclomaticComplexMethod")
        override fun provide(owner: NoteProperties): Dimension? {
            return when (this) {
                CLOSE_SIZE -> owner.closeSize
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
                ICON_SIZE -> owner.iconSize
                TEXT_TOP_MARGIN -> owner.textTopMargin
                CONTENT_BEFORE_END_MARGIN -> owner.contentBeforeEndMargin
                TITLE_PADDING_END -> owner.titlePaddingEnd
                CLOSE_TOP_MARGIN -> owner.closeTopMargin
                CLOSE_START_MARGIN -> owner.closeStartMargin
                CLOSE_END_MARGIN -> owner.closeEndMargin
                ACTION_TOP_MARGIN -> owner.actionTopMargin
                ACTION_START_MARGIN -> owner.actionStartMargin
                ACTION_END_MARGIN -> owner.actionEndMargin
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        fun String.asContentBeforeArrangement(): String {
            return when (this) {
                "center" -> "center"
                "bottom" -> "bottom"
                else -> "top"
            }
        }
    }
}
