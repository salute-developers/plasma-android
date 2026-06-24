package com.sdds.plugin.themebuilder.internal.components.splitter

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class SplitterProperties(
    val dividerShape: Shape? = null,
    val handleShape: Shape? = null,

    val dividerThickness: Dimension? = null,
    val handleThickness: Dimension? = null,
    val handleStartPadding: Dimension? = null,
    val handleTopPadding: Dimension? = null,
    val handleEndPadding: Dimension? = null,
    val handleBottomPadding: Dimension? = null,
    val handleSpacer: Dimension? = null,
    val gap: Dimension? = null,

    val dividerColor: Color? = null,
    val handleColor: Color? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SplitterProperties ?: return this
        return copy(
            dividerShape = dividerShape ?: otherProps.dividerShape,
            handleShape = handleShape ?: otherProps.handleShape,
            dividerThickness = dividerThickness ?: otherProps.dividerThickness,
            handleThickness = handleThickness ?: otherProps.handleThickness,
            handleStartPadding = handleStartPadding ?: otherProps.handleStartPadding,
            handleTopPadding = handleTopPadding ?: otherProps.handleTopPadding,
            handleEndPadding = handleEndPadding ?: otherProps.handleEndPadding,
            handleBottomPadding = handleBottomPadding ?: otherProps.handleBottomPadding,
            handleSpacer = handleSpacer ?: otherProps.handleSpacer,
            gap = gap ?: otherProps.gap,
            dividerColor = dividerColor ?: otherProps.dividerColor,
            handleColor = handleColor ?: otherProps.handleColor,
        )
    }
}

@Serializable
internal data class SplitterView(
    override val props: SplitterProperties,
    override val binding: List<Binding>? = null,
) : ViewVariation<SplitterProperties> {
    override fun merge(parent: ViewVariation<SplitterProperties>): ViewVariation<SplitterProperties> =
        copy(props = props.merge(parent.props) as SplitterProperties, binding = binding ?: parent.binding)
}

@Serializable
internal data class SplitterVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, SplitterView> = emptyMap(),
    override val props: SplitterProperties,
) : ChildVariation<SplitterProperties>

@Serializable
internal data class SplitterConfig(
    override val view: Map<String, SplitterView> = emptyMap(),
    override val props: SplitterProperties,
    override val variations: List<SplitterVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<SplitterProperties>, ComponentConfig
