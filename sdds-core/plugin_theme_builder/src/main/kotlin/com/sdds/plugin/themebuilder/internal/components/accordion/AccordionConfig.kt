package com.sdds.plugin.themebuilder.internal.components.accordion

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.divider.DividerProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class AccordionProperties(
    val itemSpacing: Dimension? = null,
    val accordionItemStyle: ComponentStyle<AccordionItemProperties>? = null,
    val dividerStyle: ComponentStyle<DividerProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? AccordionProperties ?: return this
        return copy(
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            accordionItemStyle = accordionItemStyle ?: otherProps.accordionItemStyle,
            dividerStyle = dividerStyle ?: otherProps.dividerStyle,
        )
    }
}

@Serializable
internal data class AccordionView(override val props: AccordionProperties) :
    ViewVariation<AccordionProperties> {
    override fun merge(parent: ViewVariation<AccordionProperties>): ViewVariation<AccordionProperties> =
        copy(props = props.merge(parent.props) as AccordionProperties)
}

@Serializable
internal data class AccordionVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, AccordionView> = emptyMap(),
    override val props: AccordionProperties,
) : ChildVariation<AccordionProperties>

@Serializable
internal data class AccordionConfig(
    override val view: Map<String, AccordionView> = emptyMap(),
    override val props: AccordionProperties,
    override val variations: List<AccordionVariation> = emptyList(),
) : Config<AccordionProperties>, ComponentConfig
