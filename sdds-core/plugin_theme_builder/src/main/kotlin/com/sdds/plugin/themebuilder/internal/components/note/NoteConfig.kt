package com.sdds.plugin.themebuilder.internal.components.note

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class NoteProperties(
    // общие свойства для Note и NoteCompact
    val shape: Shape? = null,

    val titleStyle: Typography? = null,
    val textStyle: Typography? = null,

    val titleColor: Color? = null,
    val textColor: Color? = null,
    val backgroundColor: Color? = null,
    val closeColor: Color? = null,
    val iconColor: Color? = null,

    val closeIcon: Icon? = null,

    val linkButtonStyle: ComponentStyle<ButtonProperties>? = null,

    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val closeSize: Dimension? = null,
    val iconSize: Dimension? = null,
    val textTopMargin: Dimension? = null,
    val contentBeforeEndMargin: Dimension? = null,
    val contentBeforeArrangement: Value? = null,

    // свойства характерные для Note
    val titlePaddingEnd: Dimension? = null,
    val closeTopMargin: Dimension? = null,
    val closeEndMargin: Dimension? = null,
    val actionTopMargin: Dimension? = null,

    // свойства характерные для NoteCompact
    val closeStartMargin: Dimension? = null,
    val actionStartMargin: Dimension? = null,
    val actionEndMargin: Dimension? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? NoteProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            textStyle = textStyle ?: otherProps.textStyle,
            titleColor = titleColor ?: otherProps.titleColor,
            textColor = textColor ?: otherProps.textColor,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            closeColor = closeColor ?: otherProps.closeColor,
            iconColor = iconColor ?: otherProps.iconColor,
            closeIcon = closeIcon ?: otherProps.closeIcon,
            linkButtonStyle = linkButtonStyle ?: otherProps.linkButtonStyle,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            closeSize = closeSize ?: otherProps.closeSize,
            iconSize = iconSize ?: otherProps.iconSize,
            textTopMargin = textTopMargin ?: otherProps.textTopMargin,
            closeTopMargin = closeTopMargin ?: otherProps.closeTopMargin,
            contentBeforeEndMargin = contentBeforeEndMargin ?: otherProps.contentBeforeEndMargin,
            contentBeforeArrangement = contentBeforeArrangement ?: otherProps.contentBeforeArrangement,
            titlePaddingEnd = titlePaddingEnd ?: otherProps.titlePaddingEnd,
            closeEndMargin = closeEndMargin ?: otherProps.closeEndMargin,
            actionTopMargin = actionTopMargin ?: otherProps.actionTopMargin,
            closeStartMargin = closeStartMargin ?: otherProps.closeStartMargin,
            actionStartMargin = actionStartMargin ?: otherProps.actionStartMargin,
            actionEndMargin = actionEndMargin ?: otherProps.actionEndMargin,

        )
    }
}

@Serializable
internal data class NoteView(override val props: NoteProperties) :
    ViewVariation<NoteProperties> {
    override fun merge(parent: ViewVariation<NoteProperties>): ViewVariation<NoteProperties> =
        copy(props = props.merge(parent.props) as NoteProperties)
}

@Serializable
internal data class NoteVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, NoteView> = emptyMap(),
    override val props: NoteProperties,
) : ChildVariation<NoteProperties>

@Serializable
internal data class NoteConfig(
    override val view: Map<String, NoteView> = emptyMap(),
    override val props: NoteProperties,
    override val variations: List<NoteVariation> = emptyList(),
) : Config<NoteProperties>, ComponentConfig
