package com.sdds.plugin.themebuilder.internal.components.chip.group

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class ChipGroupProperties(
    val gap: Dimension? = null,
    val lineSpacing: Dimension? = null,
    val chipStyle: ComponentStyle<*>? = null,
    val disableAlpha: FloatValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ChipGroupProperties ?: return this
        return copy(
            gap = gap ?: otherProps.gap,
            lineSpacing = lineSpacing ?: otherProps.lineSpacing,
            chipStyle = chipStyle ?: otherProps.chipStyle,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
        )
    }
}

@Serializable
internal data class ChipGroupView(override val props: ChipGroupProperties) :
    ViewVariation<ChipGroupProperties> {
    override fun merge(parent: ViewVariation<ChipGroupProperties>): ViewVariation<ChipGroupProperties> =
        copy(props = props.merge(parent.props) as ChipGroupProperties)
}

@Serializable
internal data class ChipGroupVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ChipGroupView> = emptyMap(),
    override val props: ChipGroupProperties = ChipGroupProperties(),
) : ChildVariation<ChipGroupProperties>

@Serializable
internal data class ChipGroupConfig(
    override val view: Map<String, ChipGroupView> = emptyMap(),
    override val props: ChipGroupProperties = ChipGroupProperties(),
    override val variations: List<ChipGroupVariation> = emptyList(),
) : Config<ChipGroupProperties>, ComponentConfig
