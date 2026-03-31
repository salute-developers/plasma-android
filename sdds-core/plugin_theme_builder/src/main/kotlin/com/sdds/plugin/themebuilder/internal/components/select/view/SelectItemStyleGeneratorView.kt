package com.sdds.plugin.themebuilder.internal.components.select.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.select.SelectItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class SelectItemStyleGeneratorView(
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
) : ViewVariationGenerator<SelectItemProperties>(
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
        variationNode: VariationNode<SelectItemProperties>,
    ) = with(styleElement) {
        SelectItemDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        SelectItemColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
        addProps(variation, variationNode)
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<SelectItemProperties>) {
        val props = variationNode.value.props
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }
        props.shape?.let { shapeAttribute(variation, it.value) }
        props.cellStyle?.let { componentOverlayAttribute("sd_cellStyleOverlay", it.camelCaseValue("")) }
        props.checkboxStyle?.let { componentOverlayAttribute("sd_checkBoxStyleOverlay", it.camelCaseValue("")) }
        props.icon?.let { iconAttribute("sd_icon", it.value) }
        props.itemType?.let { valueAttribute("sd_itemType", it.value.asIconType()) }
    }

    private enum class SelectItemDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<SelectItemProperties, Float, Dimension> {
        MIN_HEIGHT("android:minHeight", "min_height"),
        CONTROL_SIZE("sd_controlSize", "control_size"),
        CONTROL_MARGIN("sd_controlMargin", "control_margin"),
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        ;

        override fun provide(owner: SelectItemProperties): Dimension? {
            return when (this) {
                MIN_HEIGHT -> owner.height
                CONTROL_SIZE -> owner.controlSize
                CONTROL_MARGIN -> owner.controlMargin
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
            }
        }
    }

    private enum class SelectItemColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<SelectItemProperties> {
        BACKGROUND("sd_background", "background"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
        ;

        override fun provide(owner: SelectItemProperties): Color? {
            return when (this) {
                BACKGROUND -> owner.backgroundColor
                ICON_COLOR -> owner.iconColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "SelectIem"
        const val DEF_STYLE_ATTR = "sd_selectItemStyle"
        const val COMPONENT_PARENT = "Sdds.Components.SelectItem"

        fun String.asIconType(): String {
            return when (this) {
                "single" -> "single"
                else -> "multiple"
            }
        }
    }
}
