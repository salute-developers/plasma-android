package com.sdds.plugin.themebuilder.internal.components.file

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import com.sdds.plugin.themebuilder.internal.components.circularprogress.CircularProgressProperties
import com.sdds.plugin.themebuilder.internal.components.progress.ProgressBarProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class FileProperties(
    val labelStyle: Typography? = null,
    val descriptionStyle: Typography? = null,
    val labelColor: Color? = null,
    val descriptionColor: Color? = null,
    val iconColor: Color? = null,
    val startContentPadding: Dimension? = null,
    val endContentPadding: Dimension? = null,
    val bottomContentPadding: Dimension? = null,
    val descriptionPadding: Dimension? = null,
    val progressPlacement: Value? = null,
    val actionPlacement: Value? = null,
    val progressBarStyle: ComponentStyle<ProgressBarProperties>? = null,
    val circularProgressBarStyle: ComponentStyle<CircularProgressProperties>? = null,
    val actionButtonStyle: ComponentStyle<ButtonProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? FileProperties ?: return this
        return copy(
            labelStyle = labelStyle ?: otherProps.labelStyle,
            descriptionStyle = descriptionStyle ?: otherProps.descriptionStyle,
            labelColor = labelColor ?: otherProps.labelColor,
            descriptionColor = descriptionColor ?: otherProps.descriptionColor,
            iconColor = iconColor ?: otherProps.iconColor,
            startContentPadding = startContentPadding ?: otherProps.startContentPadding,
            endContentPadding = endContentPadding ?: otherProps.endContentPadding,
            bottomContentPadding = bottomContentPadding ?: otherProps.bottomContentPadding,
            descriptionPadding = descriptionPadding ?: otherProps.descriptionPadding,
            progressPlacement = progressPlacement ?: otherProps.progressPlacement,
            actionPlacement = actionPlacement ?: otherProps.actionPlacement,
            progressBarStyle = progressBarStyle ?: otherProps.progressBarStyle,
            circularProgressBarStyle = circularProgressBarStyle ?: otherProps.circularProgressBarStyle,
            actionButtonStyle = actionButtonStyle ?: otherProps.actionButtonStyle,
        )
    }
}

@Serializable
internal data class FileView(override val props: FileProperties) :
    ViewVariation<FileProperties> {
    override fun merge(
        parent: ViewVariation<FileProperties>,
    ): ViewVariation<FileProperties> =
        copy(props = props.merge(parent.props) as FileProperties)
}

@Serializable
internal data class FileVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, FileView> = emptyMap(),
    override val props: FileProperties,
) : ChildVariation<FileProperties>

@Serializable
internal data class FileConfig(
    override val view: Map<String, FileView> = emptyMap(),
    override val props: FileProperties,
    override val variations: List<FileVariation> = emptyList(),
) : Config<FileProperties>, ComponentConfig
