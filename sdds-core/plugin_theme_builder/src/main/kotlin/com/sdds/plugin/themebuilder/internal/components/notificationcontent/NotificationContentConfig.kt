package com.sdds.plugin.themebuilder.internal.components.notificationcontent

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.buttongroup.ButtonGroupProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class NotificationContentProperties(
    val titleStyle: Typography? = null,
    val textStyle: Typography? = null,
    val titleColor: Color? = null,
    val textColor: Color? = null,
    val iconColor: Color? = null,
    val icon: Icon? = null,
    val iconSize: Dimension? = null,
    val iconMargin: Dimension? = null,
    val textPadding: Dimension? = null,
    val contentStartPadding: Dimension? = null,
    val contentEndPadding: Dimension? = null,
    val contentTopPadding: Dimension? = null,
    val contentBottomPadding: Dimension? = null,
    val textBoxStartPadding: Dimension? = null,
    val textBoxEndPadding: Dimension? = null,
    val textBoxTopPadding: Dimension? = null,
    val textBoxBottomPadding: Dimension? = null,
    val buttonGroupStartPadding: Dimension? = null,
    val buttonGroupEndPadding: Dimension? = null,
    val buttonGroupTopPadding: Dimension? = null,
    val buttonGroupBottomPadding: Dimension? = null,
    val iconPlacement: Value? = null,
    val buttonLayout: Value? = null,
    val buttonGroupStyle: ComponentStyle<ButtonGroupProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? NotificationContentProperties ?: return this
        return copy(
            titleStyle = titleStyle ?: otherProps.titleStyle,
            textStyle = textStyle ?: otherProps.textStyle,
            titleColor = titleColor ?: otherProps.titleColor,
            textColor = textColor ?: otherProps.textColor,
            icon = icon ?: otherProps.icon,
            iconColor = iconColor ?: otherProps.iconColor,
            iconSize = iconSize ?: otherProps.iconSize,
            iconMargin = iconMargin ?: otherProps.iconMargin,
            textPadding = textPadding ?: otherProps.textPadding,
            contentStartPadding = contentStartPadding ?: otherProps.contentStartPadding,
            contentEndPadding = contentEndPadding ?: otherProps.contentEndPadding,
            contentTopPadding = contentTopPadding ?: otherProps.contentTopPadding,
            contentBottomPadding = contentBottomPadding ?: otherProps.contentBottomPadding,
            textBoxStartPadding = textBoxStartPadding ?: otherProps.textBoxStartPadding,
            textBoxEndPadding = textBoxEndPadding ?: otherProps.textBoxEndPadding,
            textBoxTopPadding = textBoxTopPadding ?: otherProps.textBoxTopPadding,
            textBoxBottomPadding = textBoxBottomPadding ?: otherProps.textBoxBottomPadding,
            buttonGroupStartPadding = buttonGroupStartPadding ?: otherProps.buttonGroupStartPadding,
            buttonGroupEndPadding = buttonGroupEndPadding ?: otherProps.buttonGroupEndPadding,
            buttonGroupTopPadding = buttonGroupTopPadding ?: otherProps.buttonGroupTopPadding,
            buttonGroupBottomPadding = buttonGroupBottomPadding
                ?: otherProps.buttonGroupBottomPadding,
            iconPlacement = iconPlacement ?: otherProps.iconPlacement,
            buttonLayout = buttonLayout ?: otherProps.buttonLayout,
            buttonGroupStyle = buttonGroupStyle ?: otherProps.buttonGroupStyle,
        )
    }
}

@Serializable
internal data class NotificationContentView(override val props: NotificationContentProperties) :
    ViewVariation<NotificationContentProperties> {
    override fun merge(
        parent: ViewVariation<NotificationContentProperties>,
    ): ViewVariation<NotificationContentProperties> =
        copy(props = props.merge(parent.props) as NotificationContentProperties)
}

@Serializable
internal data class NotificationContentVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, NotificationContentView> = emptyMap(),
    override val props: NotificationContentProperties,
) : ChildVariation<NotificationContentProperties>

@Serializable
internal data class NotificationContentConfig(
    override val view: Map<String, NotificationContentView> = emptyMap(),
    override val props: NotificationContentProperties,
    override val variations: List<NotificationContentVariation> = emptyList(),
) : Config<NotificationContentProperties>, ComponentConfig
