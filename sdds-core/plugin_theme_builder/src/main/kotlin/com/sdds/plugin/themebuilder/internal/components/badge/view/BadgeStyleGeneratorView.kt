package com.sdds.plugin.themebuilder.internal.components.badge.view

import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

internal class BadgeStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    styleComponentName: String,
    outputResDir: File,
    resourcePrefix: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
) : BaseBadgeStyleGeneratorView(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    styleComponentName = styleComponentName,
    coreComponentName = CORE_COMPONENT_NAME,
    componentParent = COMPONENT_PARENT,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = DEF_STYLE_ATTR,
) {

    private companion object {
        const val CORE_COMPONENT_NAME = "Badge"
        const val DEF_STYLE_ATTR = "sd_badgeStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Badge"
    }
}
