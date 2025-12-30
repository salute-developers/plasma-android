package com.sdds.plugin.themebuilder.internal.components.file.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.file.FileProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class FileStyleGeneratorView(
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
) : ViewVariationGenerator<FileProperties>(
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
        variationNode: VariationNode<FileProperties>,
        props: FileProperties,
    ) = with(styleElement) {
        FileDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, props)
        FileColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, props: FileProperties) {
        props.descriptionStyle?.let { typographyAttribute("sd_descriptionAppearance", it.value) }
        props.labelStyle?.let { typographyAttribute("sd_labelAppearance", it.value) }
        props.progressBarStyle?.let {
            componentOverlayAttribute("sd_progressBarStyleOverlay", it.camelCaseValue(""))
        }
        props.circularProgressBarStyle?.let {
            componentOverlayAttribute("sd_circularProgressBarStyleOverlay", it.camelCaseValue(""))
        }
        props.actionButtonStyle?.let {
            componentOverlayAttribute("sd_iconButtonStyleOverlay", it.camelCaseValue(""))
        }
        props.actionPlacement?.let { valueAttribute("sd_actionPlacement", it.value.asActionPlacement()) }
        props.progressPlacement?.let { valueAttribute("sd_progressPlacement", it.value.asProgressPlacement()) }
    }

    private enum class FileDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<FileProperties, Float, Dimension> {
        START_CONTENT_PADDING("sd_contentStartPadding", "content_start_padding"),
        END_CONTENT_PADDING("sd_contentEndPadding", "content_end_padding"),
        BOTTOM_CONTENT_PADDING("sd_contentBottomPadding", "content_bottom_padding"),
        DESCRIPTION_PADDING("sd_descriptionPadding", "description_padding"),
        ;

        override fun provide(owner: FileProperties): Dimension? {
            return when (this) {
                START_CONTENT_PADDING -> owner.startContentPadding
                END_CONTENT_PADDING -> owner.endContentPadding
                BOTTOM_CONTENT_PADDING -> owner.bottomContentPadding
                DESCRIPTION_PADDING -> owner.descriptionPadding
            }
        }
    }

    private enum class FileColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<FileProperties> {
        ICON_COLOR("sd_iconTint", "icon_tint"),
        DESCRIPTION_COLOR("sd_descriptionColor", "description_color"),
        LABEL_COLOR("sd_labelColor", "label_color"),
        ;

        override fun provide(owner: FileProperties): Color? {
            return when (this) {
                ICON_COLOR -> owner.iconColor
                DESCRIPTION_COLOR -> owner.descriptionColor
                LABEL_COLOR -> owner.labelColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "File"
        const val DEF_STYLE_ATTR = "sd_fileStyle"
        const val COMPONENT_PARENT = "Sdds.Components.File"

        fun String.asActionPlacement(): String {
            return when (this) {
                "end" -> "end"
                else -> "start"
            }
        }

        fun String.asProgressPlacement(): String {
            return when (this) {
                "inner" -> "inner"
                else -> "outer"
            }
        }
    }
}
