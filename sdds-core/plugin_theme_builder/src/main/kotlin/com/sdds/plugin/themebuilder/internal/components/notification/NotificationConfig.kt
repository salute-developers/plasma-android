package com.sdds.plugin.themebuilder.internal.components.notification

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.notificationcontent.NotificationContentProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class NotificationProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val closeColor: Color? = null,
    val closeSize: Dimension? = null,
    val closeAlignment: Value? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val notificationContentStyle: ComponentStyle<NotificationContentProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? NotificationProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            closeColor = closeColor ?: otherProps.closeColor,
            closeSize = closeSize ?: otherProps.closeSize,
            closeAlignment = closeAlignment ?: otherProps.closeAlignment,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            notificationContentStyle = notificationContentStyle ?: otherProps.notificationContentStyle,
        )
    }
}

@Serializable
internal data class NotificationView(override val props: NotificationProperties) :
    ViewVariation<NotificationProperties> {
    override fun merge(parent: ViewVariation<NotificationProperties>): ViewVariation<NotificationProperties> =
        copy(props = props.merge(parent.props) as NotificationProperties)
}

@Serializable
internal data class NotificationVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, NotificationView> = emptyMap(),
    override val props: NotificationProperties,
) : ChildVariation<NotificationProperties>

@Serializable
internal data class NotificationConfig(
    override val view: Map<String, NotificationView> = emptyMap(),
    override val props: NotificationProperties,
    override val variations: List<NotificationVariation> = emptyList(),
) : Config<NotificationProperties>, ComponentConfig
