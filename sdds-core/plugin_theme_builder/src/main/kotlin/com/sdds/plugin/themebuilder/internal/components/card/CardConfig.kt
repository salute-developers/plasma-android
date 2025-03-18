package com.sdds.plugin.themebuilder.internal.components.card

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class CardProperties(
    val shape: Shape? = null,
    val contentShape: Shape? = null,
    val contentMinWidth: Dimension? = null,
    val contentMinHeight: Dimension? = null,
    val backgroundColor: Color? = null,

    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,

    val fsBorderMode: Value? = null,
    val fsStrokeInset: FloatValue? = null,
    val fsTarget: Value? = null,
    val fsScaleFactor: FloatValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CardProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            contentShape = contentShape ?: otherProps.contentShape,
            contentMinWidth = contentMinWidth ?: otherProps.contentMinWidth,
            contentMinHeight = contentMinHeight ?: otherProps.contentMinHeight,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            fsBorderMode = fsBorderMode ?: otherProps.fsBorderMode,
            fsStrokeInset = fsStrokeInset ?: otherProps.fsStrokeInset,
            fsTarget = fsTarget ?: otherProps.fsTarget,
            fsScaleFactor = fsScaleFactor ?: otherProps.fsScaleFactor,
        )
    }
}

@Serializable
internal data class CardView(
    override val props: CardProperties,
) : ViewVariation<CardProperties> {
    override fun merge(parent: ViewVariation<CardProperties>): ViewVariation<CardProperties> =
        copy(props = props.merge(parent.props) as CardProperties)
}

@Serializable
internal data class CardVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CardView> = emptyMap(),
    override val props: CardProperties,
) : ChildVariation<CardProperties>

@Serializable
internal data class CardConfig(
    override val view: Map<String, CardView> = emptyMap(),
    override val props: CardProperties = CardProperties(),
    override val variations: List<CardVariation> = emptyList(),
) : Config<CardProperties>, ComponentConfig
