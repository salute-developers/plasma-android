package com.sdds.plugin.themebuilder.internal.components.aiheader

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class AiHeaderProperties(
    val shape: Shape? = null,
    val titleStyle: Typography? = null,
    val subtitleStyle: Typography? = null,
    val backgroundColor: Color? = null,
    val titleColor: Color? = null,
    val subtitleColor: Color? = null,
    val dividerColor: Color? = null,
    val dividerThickness: Dimension? = null,
    val textPaddingStart: Dimension? = null,
    val textPaddingEnd: Dimension? = null,
    val textPaddingTop: Dimension? = null,
    val textPaddingBottom: Dimension? = null,
    val subtitlePadding: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val startButtonStyle: ComponentStyle<ButtonProperties>? = null,
    val endButtonStyle: ComponentStyle<ButtonProperties>? = null,
    val startButtonIcon: Icon? = null,
    val endButtonIcon: Icon? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? AiHeaderProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            subtitleStyle = subtitleStyle ?: otherProps.subtitleStyle,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            titleColor = titleColor ?: otherProps.titleColor,
            subtitleColor = subtitleColor ?: otherProps.subtitleColor,
            dividerColor = dividerColor ?: otherProps.dividerColor,
            dividerThickness = dividerThickness ?: otherProps.dividerThickness,
            textPaddingStart = textPaddingStart ?: otherProps.textPaddingStart,
            textPaddingEnd = textPaddingEnd ?: otherProps.textPaddingEnd,
            textPaddingTop = textPaddingTop ?: otherProps.textPaddingTop,
            textPaddingBottom = textPaddingBottom ?: otherProps.textPaddingBottom,
            subtitlePadding = subtitlePadding ?: otherProps.subtitlePadding,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            startButtonStyle = startButtonStyle ?: otherProps.startButtonStyle,
            endButtonStyle = endButtonStyle ?: otherProps.endButtonStyle,
            startButtonIcon = startButtonIcon ?: otherProps.startButtonIcon,
            endButtonIcon = endButtonIcon ?: otherProps.endButtonIcon,
        )
    }
}

@Serializable
internal data class AiHeaderView(
    override val props: AiHeaderProperties,
    override val binding: List<Binding>? = null,
) : ViewVariation<AiHeaderProperties> {
    override fun merge(parent: ViewVariation<AiHeaderProperties>): ViewVariation<AiHeaderProperties> =
        copy(
            props = props.merge(parent.props) as AiHeaderProperties,
            binding = binding ?: parent.binding,
        )
}

@Serializable
internal data class AiHeaderVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, AiHeaderView> = emptyMap(),
    override val props: AiHeaderProperties,
) : ChildVariation<AiHeaderProperties>

@Serializable
internal data class AiHeaderConfig(
    override val view: Map<String, AiHeaderView> = emptyMap(),
    override val props: AiHeaderProperties,
    override val variations: List<AiHeaderVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<AiHeaderProperties>, ComponentConfig
