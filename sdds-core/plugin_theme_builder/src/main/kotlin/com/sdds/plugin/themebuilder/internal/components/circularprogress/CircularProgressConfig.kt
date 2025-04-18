package com.sdds.plugin.themebuilder.internal.components.circularprogress

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.BooleanValue
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class CircularProgressProperties(
    val valueStyle: Typography? = null,

    val width: Dimension? = null,
    val height: Dimension? = null,
    val trackThickness: Dimension? = null,
    val progressThickness: Dimension? = null,

    val indicatorColor: Color? = null,
    val trackColor: Color? = null,
    val valueColor: Color? = null,
    val valueSuffixColor: Color? = null,

    val valueEnabled: BooleanValue? = null,
    val trackEnabled: BooleanValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CircularProgressProperties ?: return this
        return copy(
            valueStyle = valueStyle ?: otherProps.valueStyle,
            width = width ?: otherProps.width,
            height = height ?: otherProps.height,
            trackThickness = trackThickness ?: otherProps.trackThickness,
            progressThickness = progressThickness ?: otherProps.progressThickness,
            indicatorColor = indicatorColor ?: otherProps.indicatorColor,
            trackColor = trackColor ?: otherProps.trackColor,
            valueColor = valueColor ?: otherProps.valueColor,
            valueSuffixColor = valueSuffixColor ?: otherProps.valueSuffixColor,
            valueEnabled = valueEnabled ?: otherProps.valueEnabled,
            trackEnabled = trackEnabled ?: otherProps.trackEnabled,
        )
    }
}

@Serializable
internal data class CircularProgressView(
    override val props: CircularProgressProperties,
) : ViewVariation<CircularProgressProperties> {
    override fun merge(parent: ViewVariation<CircularProgressProperties>): ViewVariation<CircularProgressProperties> =
        copy(props = props.merge(parent.props) as CircularProgressProperties)
}

@Serializable
internal data class CircularProgressVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CircularProgressView> = emptyMap(),
    override val props: CircularProgressProperties,
) : ChildVariation<CircularProgressProperties>

@Serializable
internal data class CircularProgressConfig(
    override val view: Map<String, CircularProgressView> = emptyMap(),
    override val props: CircularProgressProperties,
    override val variations: List<CircularProgressVariation> = emptyList(),
) : Config<CircularProgressProperties>, ComponentConfig
