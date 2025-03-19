package com.sdds.plugin.themebuilder.internal.components.segment

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class SegmentProperties(
    val shape: Shape? = null,
    val backgroundColor: Color? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val segmentItemStyle: ComponentStyle<SegmentProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SegmentProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            segmentItemStyle = segmentItemStyle ?: otherProps.segmentItemStyle,
        )
    }
}

@Serializable
internal data class SegmentView(
    override val props: SegmentProperties = SegmentProperties(),
) : ViewVariation<SegmentProperties> {
    override fun merge(parent: ViewVariation<SegmentProperties>): ViewVariation<SegmentProperties> =
        copy(props = props.merge(parent.props) as SegmentProperties)
}

@Serializable
internal data class SegmentVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, SegmentView> = emptyMap(),
    override val props: SegmentProperties,
) : ChildVariation<SegmentProperties>

@Serializable
internal data class SegmentConfig(
    override val view: Map<String, SegmentView> = emptyMap(),
    override val props: SegmentProperties = SegmentProperties(),
    override val variations: List<SegmentVariation> = emptyList(),
) : Config<SegmentProperties>, ComponentConfig
