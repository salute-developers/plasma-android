package com.sdds.plugin.themebuilder.internal.components.emptystate.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.emptystate.EmptyStateProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import org.w3c.dom.Element
import java.io.File

internal class EmptyStateStyleGeneratorView(
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
) : ViewVariationGenerator<EmptyStateProperties>(
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
        variationNode: VariationNode<EmptyStateProperties>,
        props: EmptyStateProperties,
    ) = with(styleElement) {
        addProps(variation, props)
        EmptyStateDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        EmptyStateColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, props: EmptyStateProperties) {
        props.descriptionStyle?.let { typographyAttribute("sd_descriptionTextAppearance", it.value) }
        props.buttonStyle?.let {
            componentOverlayAttribute(
                "sd_actionButtonStyleOverlay",
                it.value.techToCamelCase(),
            )
        }
    }

    internal enum class EmptyStateColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<EmptyStateProperties> {
        DESCRIPTION_COLOR("sd_descriptionTextColor", "description_color"),
        ICON_COLOR("sd_iconTint", "icon_color"),
        ;

        override fun provide(owner: EmptyStateProperties): Color? {
            return when (this) {
                DESCRIPTION_COLOR -> owner.descriptionColor
                ICON_COLOR -> owner.iconColor
            }
        }
    }

    internal enum class EmptyStateDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<EmptyStateProperties, Float, Dimension> {
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        DESCRIPTION_PADDING("sd_descriptionPadding", "description_padding"),
        ;

        override fun provide(owner: EmptyStateProperties): Dimension? {
            return when (this) {
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
                DESCRIPTION_PADDING -> owner.descriptionPadding
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "DropdownEmptyStateView"
        const val DEF_STYLE_ATTR = "sd_dropdownEmptyStateStyle"
        const val COMPONENT_PARENT = "Sdds.Components.DropdownEmptyState"
    }
}
