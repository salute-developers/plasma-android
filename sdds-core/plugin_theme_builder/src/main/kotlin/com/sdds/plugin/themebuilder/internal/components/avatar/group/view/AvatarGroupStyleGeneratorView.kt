package com.sdds.plugin.themebuilder.internal.components.avatar.group.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.avatar.group.AvatarGroupProperties
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class AvatarGroupStyleGeneratorView(
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
) : ViewVariationGenerator<AvatarGroupProperties>(
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
        variationNode: VariationNode<AvatarGroupProperties>,
    ) = with(styleElement) {
        AvatarGroupDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, variationNode)
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<AvatarGroupProperties>) {
        val props = variationNode.value.props
        props.avatarStyle?.let { componentOverlayAttribute("sd_avatarStyleOverlay", it.camelCaseValue("")) }
    }

    private enum class AvatarGroupDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<AvatarGroupProperties, Float, Dimension> {
        ITEM_SPACING("sd_itemSpacing", "item_spacing"),
        ITEM_OFFSET("sd_itemOffset", "item_offset"),
        ;

        override fun provide(owner: AvatarGroupProperties): Dimension? {
            return when (this) {
                ITEM_SPACING -> owner.itemSpacing
                ITEM_OFFSET -> owner.itemOffset
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "AvatarGroup"
        const val DEF_STYLE_ATTR = "sd_avatarGroupStyle"
        const val COMPONENT_PARENT = "Sdds.Components.AvatarGroup"
    }
}
