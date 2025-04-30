package com.sdds.plugin.themebuilder.internal.components.checkbox.group.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.checkbox.group.CheckBoxGroupProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента CheckBoxGroup
 */
internal open class CheckBoxGroupStyleGeneratorView(
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
) : ViewVariationGenerator<CheckBoxGroupProperties>(
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
        variationNode: VariationNode<CheckBoxGroupProperties>,
        props: CheckBoxGroupProperties,
    ) = with(styleElement) {
        addProps(variation, props)
    }

    private fun Element.addProps(variation: String, props: CheckBoxGroupProperties) {
        props.itemOffset?.let { dimenAttribute(variation, "sd_itemOffset", "item_spacing", it.value) }
        props.itemSpacing?.let { dimenAttribute(variation, "sd_itemSpacing", "item_offset", it.value) }
        props.checkBoxStyle?.let { componentOverlayAttribute("sd_checkBoxStyleOverlay", it.camelCaseValue("")) }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "CheckBoxGroup"
        const val DEF_STYLE_ATTR = "sd_checkBoxGroupStyle"
        const val COMPONENT_PARENT = "Sdds.Components.CheckBoxGroup"
    }
}
