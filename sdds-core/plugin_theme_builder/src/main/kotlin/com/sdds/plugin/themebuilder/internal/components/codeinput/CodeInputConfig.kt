package com.sdds.plugin.themebuilder.internal.components.codeinput

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class CodeInputProperties(
    val codeStyle: Typography? = null,
    val captionStyle: Typography? = null,
    val dotSize: Dimension? = null,
    val strokeWidth: Dimension? = null,
    val itemHeight: Dimension? = null,
    val itemWidth: Dimension? = null,
    val itemSpacing: Dimension? = null,
    val groupSpacing: Dimension? = null,
    val captionPadding: Dimension? = null,
    val codeColor: Color? = null,
    val captionColor: Color? = null,
    val strokeColor: Color? = null,
    val fillColor: Color? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CodeInputProperties ?: return this
        return copy(
            codeStyle = codeStyle ?: otherProps.codeStyle,
            captionStyle = captionStyle ?: otherProps.captionStyle,
            dotSize = dotSize ?: otherProps.dotSize,
            strokeWidth = strokeWidth ?: otherProps.strokeWidth,
            itemHeight = itemHeight ?: otherProps.itemHeight,
            itemWidth = itemWidth ?: otherProps.itemWidth,
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            groupSpacing = groupSpacing ?: otherProps.groupSpacing,
            captionPadding = captionPadding ?: otherProps.captionPadding,
            codeColor = codeColor ?: otherProps.codeColor,
            captionColor = captionColor ?: otherProps.captionColor,
            strokeColor = strokeColor ?: otherProps.strokeColor,
            fillColor = fillColor ?: otherProps.fillColor,
        )
    }
}

@Serializable
internal data class CodeInputView(
    override val props: CodeInputProperties,
) : ViewVariation<CodeInputProperties> {
    override fun merge(parent: ViewVariation<CodeInputProperties>): ViewVariation<CodeInputProperties> =
        copy(props = props.merge(parent.props) as CodeInputProperties)
}

@Serializable
internal data class CodeInputVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CodeInputView> = emptyMap(),
    override val props: CodeInputProperties,
) : ChildVariation<CodeInputProperties>

@Serializable
internal data class CodeInputConfig(
    override val view: Map<String, CodeInputView> = emptyMap(),
    override val props: CodeInputProperties,
    override val variations: List<CodeInputVariation> = emptyList(),
) : Config<CodeInputProperties>, ComponentConfig
