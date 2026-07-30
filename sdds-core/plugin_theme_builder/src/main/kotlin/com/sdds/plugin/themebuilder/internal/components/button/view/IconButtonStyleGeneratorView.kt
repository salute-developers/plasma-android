package com.sdds.plugin.themebuilder.internal.components.button.view

import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Генератор стилей IconButton для xml
 */
internal class IconButtonStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    attrPrefix: String,
    styleComponentName: String = CORE_COMPONENT_NAME,
    colorStateComponentName: String = CORE_COMPONENT_NAME,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
) : BaseButtonStyleGeneratorView(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = attrPrefix,
    coreComponentName = CORE_COMPONENT_NAME,
    styleComponentName = styleComponentName,
    colorStateComponentName = colorStateComponentName,
    componentParent = COMPONENT_PARENT,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = DEF_STYLE_ATTR,
) {

    private companion object {
        const val CORE_COMPONENT_NAME = "IconButton"
        const val DEF_STYLE_ATTR = "sd_iconButtonStyle"
        const val COMPONENT_PARENT = "Sdds.Components.IconButton"
    }
}
