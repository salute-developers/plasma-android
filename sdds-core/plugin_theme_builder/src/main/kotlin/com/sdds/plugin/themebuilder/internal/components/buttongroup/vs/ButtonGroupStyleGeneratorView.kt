package com.sdds.plugin.themebuilder.internal.components.buttongroup.vs

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.buttongroup.ButtonGroupProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class ButtonGroupStyleGeneratorView(
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
) : ViewVariationGenerator<ButtonGroupProperties>(
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
        variationNode: VariationNode<ButtonGroupProperties>,
        props: ButtonGroupProperties,
    ) = with(styleElement) {
        addProps(variation, props)
    }

    private fun Element.addProps(variation: String, props: ButtonGroupProperties) {
        props.externalShape?.let { shapeAttribute(variation, it.value, attrName = "external") }
        props.internalShape?.let { shapeAttribute(variation, it.value, attrName = "internal") }
        props.spacing?.let { dimenAttribute(variation, "sd_buttonSpacing", "spacing", it.value) }
        props.buttonStyle?.let { componentOverlayAttribute("sd_buttonStyleOverlay", it.camelCaseValue("")) }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "ButtonGroup"
        const val DEF_STYLE_ATTR = "sd_buttonGroupStyle"
        const val COMPONENT_PARENT = "Sdds.Components.ButtonGroup"
    }
}
