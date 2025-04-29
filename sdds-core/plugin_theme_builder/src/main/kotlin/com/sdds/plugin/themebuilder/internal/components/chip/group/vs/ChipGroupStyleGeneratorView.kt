package com.sdds.plugin.themebuilder.internal.components.chip.group.vs

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.chip.group.ChipGroupProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента ChipGroup
 */
internal open class ChipGroupStyleGeneratorView(
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
) : ViewVariationGenerator<ChipGroupProperties>(
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
        variationNode: VariationNode<ChipGroupProperties>,
        props: ChipGroupProperties,
    ) = with(styleElement) {
        addProps(variation, props)
    }

    private fun Element.addProps(variation: String, props: ChipGroupProperties) {
        props.gap?.let { dimenAttribute(variation, "sd_gap", "gap", it.value) }
        props.lineSpacing?.let { dimenAttribute(variation, "sd_lineSpacing", "line_spacing", it.value) }
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }
        props.chipStyle?.let { componentOverlayAttribute("sd_chipStyleOverlay", it.camelCaseValue("")) }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "ChipGroup"
        const val DEF_STYLE_ATTR = "sd_chipGroupStyle"
        const val COMPONENT_PARENT = "Sdds.Components.ChipGroup"
    }
}
