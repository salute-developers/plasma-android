package com.sdds.plugin.themebuilder.internal.components.list.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.list.ListProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import org.w3c.dom.Element
import java.io.File

internal class ListStyleGeneratorView(
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
) : ViewVariationGenerator<ListProperties>(
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
        variationNode: VariationNode<ListProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<ListProperties>) {
        val props = variationNode.value.props
        props.listItemStyle?.let {
            componentOverlayAttribute(
                "sd_listItemViewStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "ListView"
        const val DEF_STYLE_ATTR = "sd_listViewStyle"
        const val COMPONENT_PARENT = "Sdds.Components.List"
    }
}
