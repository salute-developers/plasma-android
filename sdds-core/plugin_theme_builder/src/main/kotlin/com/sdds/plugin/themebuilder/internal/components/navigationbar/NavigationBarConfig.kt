package com.sdds.plugin.themebuilder.internal.components.navigationbar

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class NavigationBarProperties(
    val textStyle: Typography? = null,
    val backIcon: Icon? = null,
    val bottomShape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val backIconColor: Color? = null,
    val actionStartColor: Color? = null,
    val actionEndColor: Color? = null,
    val textColor: Color? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val backIconMargin: Dimension? = null,
    val textBlockTopMargin: Dimension? = null,
    val horizontalSpacing: Dimension? = null,
    val actionButtonStyle: ComponentStyle<ButtonProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? NavigationBarProperties ?: return this
        return copy(
            textStyle = textStyle ?: otherProps.textStyle,
            bottomShape = bottomShape ?: otherProps.bottomShape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            backIconColor = backIconColor ?: otherProps.backIconColor,
            actionStartColor = actionStartColor ?: otherProps.actionStartColor,
            actionEndColor = actionEndColor ?: otherProps.actionEndColor,
            textColor = textColor ?: otherProps.textColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            backIconMargin = backIconMargin ?: otherProps.backIconMargin,
            textBlockTopMargin = textBlockTopMargin ?: otherProps.textBlockTopMargin,
            horizontalSpacing = horizontalSpacing ?: otherProps.horizontalSpacing,
            actionButtonStyle = actionButtonStyle ?: otherProps.actionButtonStyle,
        )
    }
}

@Serializable
internal data class NavigationBarView(override val props: NavigationBarProperties) :
    ViewVariation<NavigationBarProperties> {
    override fun merge(parent: ViewVariation<NavigationBarProperties>): ViewVariation<NavigationBarProperties> =
        copy(props = props.merge(parent.props) as NavigationBarProperties)
}

@Serializable
internal data class NavigationBarVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, NavigationBarView> = emptyMap(),
    override val props: NavigationBarProperties,
) : ChildVariation<NavigationBarProperties>

@Serializable
internal data class NavigationBarConfig(
    override val view: Map<String, NavigationBarView> = emptyMap(),
    override val props: NavigationBarProperties,
    override val variations: List<NavigationBarVariation> = emptyList(),
) : Config<NavigationBarProperties>, ComponentConfig
