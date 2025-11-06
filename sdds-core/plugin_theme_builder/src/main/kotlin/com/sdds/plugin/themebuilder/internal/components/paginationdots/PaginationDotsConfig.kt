package com.sdds.plugin.themebuilder.internal.components.paginationdots

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class PaginationDotsProperties(
    val dotBackgroundColor: Color? = null,
    val gap: Dimension? = null,
    val dotWidth: Dimension? = null,
    val dotHeight: Dimension? = null,
    val edgeShrinkFactor: FloatValue? = null,
    val edgeCount: Value? = null,
    val orientation: Value? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? PaginationDotsProperties ?: return this
        return copy(
            dotBackgroundColor = dotBackgroundColor ?: otherProps.dotBackgroundColor,
            gap = gap ?: otherProps.gap,
            dotWidth = dotWidth ?: otherProps.dotWidth,
            dotHeight = dotHeight ?: otherProps.dotHeight,
            edgeShrinkFactor = edgeShrinkFactor ?: otherProps.edgeShrinkFactor,
            edgeCount = edgeCount ?: otherProps.edgeCount,
            orientation = orientation ?: otherProps.orientation,
        )
    }
}

@Serializable
internal data class PaginationDotsView(
    override val props: PaginationDotsProperties,
) : ViewVariation<PaginationDotsProperties> {
    override fun merge(parent: ViewVariation<PaginationDotsProperties>): ViewVariation<PaginationDotsProperties> =
        copy(props = props.merge(parent.props) as PaginationDotsProperties)
}

@Serializable
internal data class PaginationDotsVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, PaginationDotsView> = emptyMap(),
    override val props: PaginationDotsProperties,
) : ChildVariation<PaginationDotsProperties>

@Serializable
internal data class PaginationDotsConfig(
    override val view: Map<String, PaginationDotsView> = emptyMap(),
    override val props: PaginationDotsProperties,
    override val variations: List<PaginationDotsVariation> = emptyList(),
) : Config<PaginationDotsProperties>, ComponentConfig
