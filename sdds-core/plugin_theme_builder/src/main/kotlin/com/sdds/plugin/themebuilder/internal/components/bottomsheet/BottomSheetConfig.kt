package com.sdds.plugin.themebuilder.internal.components.bottomsheet

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class BottomSheetProperties(
    val shape: Shape? = null,
    val handleShape: Shape? = null,

    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val handleHeight: Dimension? = null,
    val handleWidth: Dimension? = null,
    val handleOffset: Dimension? = null,
    val handlePlacement: Value? = null,

    val backgroundColor: Color? = null,
    val handleColor: Color? = null,
    val shadow: Shadow? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? BottomSheetProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            handleShape = handleShape ?: otherProps.handleShape,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            handleHeight = handleHeight ?: otherProps.handleHeight,
            handleWidth = handleWidth ?: otherProps.handleWidth,
            handleOffset = handleOffset ?: otherProps.handleOffset,
            handlePlacement = handlePlacement ?: otherProps.handlePlacement,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            handleColor = handleColor ?: otherProps.handleColor,
            shadow = shadow ?: otherProps.shadow,
        )
    }
}

@Serializable
internal data class BottomSheetView(
    override val props: BottomSheetProperties,
) : ViewVariation<BottomSheetProperties> {
    override fun merge(parent: ViewVariation<BottomSheetProperties>): ViewVariation<BottomSheetProperties> =
        copy(props = props.merge(parent.props) as BottomSheetProperties)
}

@Serializable
internal data class BottomSheetVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, BottomSheetView> = emptyMap(),
    override val props: BottomSheetProperties,
) : ChildVariation<BottomSheetProperties>

@Serializable
internal data class BottomSheetConfig(
    override val view: Map<String, BottomSheetView> = emptyMap(),
    override val props: BottomSheetProperties = BottomSheetProperties(),
    override val variations: List<BottomSheetVariation> = emptyList(),
) : Config<BottomSheetProperties>, ComponentConfig
