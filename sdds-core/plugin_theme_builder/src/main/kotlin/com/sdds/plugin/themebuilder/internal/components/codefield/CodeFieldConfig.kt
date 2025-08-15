package com.sdds.plugin.themebuilder.internal.components.codefield

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
internal data class CodeFieldProperties(
    val itemShape: Shape? = null,
    val groupShape: Shape? = null,
    val valueStyle: Typography? = null,
    val captionStyle: Typography? = null,
    val height: Dimension? = null,
    val width: Dimension? = null,
    val dotSize: Dimension? = null,
    val itemSpacing: Dimension? = null,
    val groupSpacing: Dimension? = null,
    val captionSpacing: Dimension? = null,
    val valueColor: Color? = null,
    val cursorColor: Color? = null,
    val dotColor: Color? = null,
    val captionColor: Color? = null,
    val backgroundColor: Color? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CodeFieldProperties ?: return this
        return copy(
            itemShape = itemShape ?: otherProps.itemShape,
            groupShape = groupShape ?: otherProps.groupShape,
            valueStyle = valueStyle ?: otherProps.valueStyle,
            captionStyle = captionStyle ?: otherProps.captionStyle,
            height = height ?: otherProps.height,
            width = width ?: otherProps.width,
            dotSize = dotSize ?: otherProps.dotSize,
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            groupSpacing = groupSpacing ?: otherProps.groupSpacing,
            captionSpacing = captionSpacing ?: otherProps.captionSpacing,
            valueColor = valueColor ?: otherProps.valueColor,
            cursorColor = cursorColor ?: otherProps.cursorColor,
            dotColor = dotColor ?: otherProps.dotColor,
            captionColor = captionColor ?: otherProps.captionColor,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
        )
    }
}

@Serializable
internal data class CodeFieldView(
    override val props: CodeFieldProperties,
) : ViewVariation<CodeFieldProperties> {
    override fun merge(parent: ViewVariation<CodeFieldProperties>): ViewVariation<CodeFieldProperties> =
        copy(props = props.merge(parent.props) as CodeFieldProperties)
}

@Serializable
internal data class CodeFieldVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CodeFieldView> = emptyMap(),
    override val props: CodeFieldProperties,
) : ChildVariation<CodeFieldProperties>

@Serializable
internal data class CodeFieldConfig(
    override val view: Map<String, CodeFieldView> = emptyMap(),
    override val props: CodeFieldProperties,
    override val variations: List<CodeFieldVariation> = emptyList(),
) : Config<CodeFieldProperties>, ComponentConfig
