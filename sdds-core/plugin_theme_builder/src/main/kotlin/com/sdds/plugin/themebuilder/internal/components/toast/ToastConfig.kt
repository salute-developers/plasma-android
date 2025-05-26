package com.sdds.plugin.themebuilder.internal.components.toast

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class ToastProperties(
    val shape: Shape? = null,
    val backgroundColor: Color? = null,
    val textStyle: Typography? = null,
    val textColor: Color? = null,
    val contentStartColor: Color? = null,
    val contentEndColor: Color? = null,
    val contentStartSize: Dimension? = null,
    val contentEndSize: Dimension? = null,
    val contentStartPadding: Dimension? = null,
    val contentEndPadding: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ToastProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            textStyle = textStyle ?: otherProps.textStyle,
            textColor = textColor ?: otherProps.textColor,
            contentStartColor = contentStartColor ?: otherProps.contentStartColor,
            contentEndColor = contentEndColor ?: otherProps.contentEndColor,
            contentStartSize = contentStartSize ?: otherProps.contentStartSize,
            contentEndSize = contentEndSize ?: otherProps.contentEndSize,
            contentStartPadding = contentStartPadding ?: otherProps.contentStartPadding,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
        )
    }
}

@Serializable
internal data class ToastView(override val props: ToastProperties) :
    ViewVariation<ToastProperties> {
    override fun merge(parent: ViewVariation<ToastProperties>): ViewVariation<ToastProperties> =
        copy(props = props.merge(parent.props) as ToastProperties)
}

@Serializable
internal data class ToastVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ToastView> = emptyMap(),
    override val props: ToastProperties,
) : ChildVariation<ToastProperties>

@Serializable
internal data class ToastConfig(
    override val view: Map<String, ToastView> = emptyMap(),
    override val props: ToastProperties,
    override val variations: List<ToastVariation> = emptyList(),
) : Config<ToastProperties>, ComponentConfig
