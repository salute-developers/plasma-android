package com.sdds.plugin.themebuilder.internal.components.editable.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.StateListAttribute
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.editable.EditableProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class EditableStyleGeneratorView(
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
) : ViewVariationGenerator<EditableProperties>(
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
        variationNode: VariationNode<EditableProperties>,
        props: EditableProperties,
    ) = with(styleElement) {
        EditableDimensionsProperty.values().forEach { dimensionProperty ->
            addDimensionProperty(dimensionProperty, variation, variationNode)
        }
        EditableColorProperty.values().forEach { colorProperty ->
            addColorProperty(colorProperty, variation, variationNode) {
                containsState(it.state, "readonly")
            }
        }
        EditableTypographyProperties.values().forEach { typographyProperty ->
            addTypographyProperty(typographyProperty, variation, variationNode)
        }
        addProps(variationNode)
    }

    private fun containsState(states: List<String>, stateName: String): Set<StateListAttribute> {
        return if (states.contains(stateName)) {
            setOf(StateListAttribute("app:sd_state_readonly", "true"))
        } else {
            emptySet()
        }
    }

    private fun Element.addProps(
        variationNode: VariationNode<EditableProperties>,
    ) {
        val props = variationNode.value.props
        props.disableAlpha?.let { valueAttribute("sd_disabledAlpha", it.value.toString()) }
    }

    private enum class EditableDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<EditableProperties, Float, Dimension> {
        ICON_MARGIN("sd_iconMargin", "icon_margin"),
        ICON_SIZE("sd_iconSize", "icon_size"),
        ;
        override fun provide(owner: EditableProperties): Dimension? {
            return when (this) {
                ICON_MARGIN -> owner.iconMargin
                ICON_SIZE -> owner.iconSize
            }
        }
    }

    private enum class EditableColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<EditableProperties> {
        VALUE_COLOR("sd_valueColor", "value_color"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
        CURSOR_COLOR("sd_cursorColor", "cursor_color"),

        ;

        override fun provide(owner: EditableProperties): Color? {
            return when (this) {
                VALUE_COLOR -> owner.textColor
                ICON_COLOR -> owner.iconColor
                CURSOR_COLOR -> owner.cursorColor
            }
        }
    }

    internal enum class EditableTypographyProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<EditableProperties, String, Typography> {
        VALUE_APPEARANCE("sd_valueAppearance", "value_appearance"),
        ;

        override fun provide(owner: EditableProperties): Typography? {
            return when (this) {
                VALUE_APPEARANCE -> owner.textStyle
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Editable"
        const val DEF_STYLE_ATTR = "sd_editableStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Editable"
    }
}
