package com.sdds.plugin.themebuilder.internal.components.autocomplete.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.autocomplete.AutoCompleteProperties
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import org.w3c.dom.Element
import java.io.File

internal class AutocompleteStyleGeneratorView(
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
) : ViewVariationGenerator<AutoCompleteProperties>(
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
        variationNode: VariationNode<AutoCompleteProperties>,
        props: AutoCompleteProperties,
    ) = with(styleElement) {
        addProps(props)
    }

    private fun Element.addProps(props: AutoCompleteProperties) {
        props.textFieldStyle?.let {
            componentOverlayAttribute(
                "sd_textFieldStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
        props.dropdownStyle?.let {
            componentOverlayAttribute(
                "sd_dropdownMenuStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Autocomplete"
        const val DEF_STYLE_ATTR = "sd_autocompleteStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Autocomplete"
    }
}
