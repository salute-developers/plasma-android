package com.sdds.plugin.themebuilder.internal.components.select.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.select.SelectProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class SelectStyleGeneratorView(
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
) : ViewVariationGenerator<SelectProperties>(
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
        variationNode: VariationNode<SelectProperties>,
        props: SelectProperties,
    ) = with(styleElement) {
        addProps(variation, props)
    }

    private fun Element.addProps(variation: String, props: SelectProperties) {
        props.buttonStyle?.let {
            componentOverlayAttribute("sd_buttonStyleOverlay", it.camelCaseValue(""))
        }
        props.dropdownStyle?.let {
            componentOverlayAttribute("sd_dropdownMenuStyleOverlay", it.camelCaseValue(""))
        }
        props.textFieldStyle?.let {
            componentOverlayAttribute("sd_textFieldStyleOverlay", it.camelCaseValue(""))
        }
        props.selectItemStyle?.let {
            componentOverlayAttribute("sd_selectItemStyleOverlay", it.camelCaseValue(""))
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Select"
        const val DEF_STYLE_ATTR = "sd_selectStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Select"
    }
}
