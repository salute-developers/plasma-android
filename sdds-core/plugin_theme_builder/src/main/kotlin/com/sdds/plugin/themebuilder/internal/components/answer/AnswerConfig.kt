package com.sdds.plugin.themebuilder.internal.components.answer

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.buttongroup.ButtonGroupProperties
import com.sdds.plugin.themebuilder.internal.components.chip.group.ChipGroupProperties
import com.sdds.plugin.themebuilder.internal.components.note.NoteProperties
import com.sdds.plugin.themebuilder.internal.components.spinner.SpinnerProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class AnswerProperties(
    val backgroundColor: Color? = null,
    val titleColor: Color? = null,
    val contentColor: Color? = null,
    val loadingTextColor: Color? = null,
    val titleStyle: Typography? = null,
    val contentStyle: Typography? = null,
    val loadingTextStyle: Typography? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val contentGap: Dimension? = null,
    val actionsGap: Dimension? = null,
    val suggestionsGap: Dimension? = null,
    val loadingGap: Dimension? = null,
    val noteStyle: ComponentStyle<NoteProperties>? = null,
    val loadingSpinnerStyle: ComponentStyle<SpinnerProperties>? = null,
    val actionsStartButtonGroupStyle: ComponentStyle<ButtonGroupProperties>? = null,
    val actionsEndButtonGroupStyle: ComponentStyle<ButtonGroupProperties>? = null,
    val suggestionsChipGroupStyle: ComponentStyle<ChipGroupProperties>? = null,
) : PropertyOwner {
    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? AnswerProperties ?: return this
        return copy(
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            titleColor = titleColor ?: otherProps.titleColor,
            contentColor = contentColor ?: otherProps.contentColor,
            loadingTextColor = loadingTextColor ?: otherProps.loadingTextColor,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            contentStyle = contentStyle ?: otherProps.contentStyle,
            loadingTextStyle = loadingTextStyle ?: otherProps.loadingTextStyle,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            contentGap = contentGap ?: otherProps.contentGap,
            actionsGap = actionsGap ?: otherProps.actionsGap,
            suggestionsGap = suggestionsGap ?: otherProps.suggestionsGap,
            loadingGap = loadingGap ?: otherProps.loadingGap,
            noteStyle = noteStyle ?: otherProps.noteStyle,
            loadingSpinnerStyle = loadingSpinnerStyle ?: otherProps.loadingSpinnerStyle,
            actionsStartButtonGroupStyle = actionsStartButtonGroupStyle ?: otherProps.actionsStartButtonGroupStyle,
            actionsEndButtonGroupStyle = actionsEndButtonGroupStyle ?: otherProps.actionsEndButtonGroupStyle,
            suggestionsChipGroupStyle = suggestionsChipGroupStyle ?: otherProps.suggestionsChipGroupStyle,
        )
    }
}

@Serializable
internal data class AnswerView(
    override val props: AnswerProperties,
    override val binding: List<Binding>? = null,
) : ViewVariation<AnswerProperties> {
    override fun merge(parent: ViewVariation<AnswerProperties>): ViewVariation<AnswerProperties> =
        copy(props = props.merge(parent.props) as AnswerProperties, binding = binding ?: parent.binding)
}

@Serializable
internal data class AnswerVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, AnswerView> = emptyMap(),
    override val props: AnswerProperties,
) : ChildVariation<AnswerProperties>

@Serializable
internal data class AnswerConfig(
    override val view: Map<String, AnswerView> = emptyMap(),
    override val props: AnswerProperties,
    override val variations: List<AnswerVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<AnswerProperties>, ComponentConfig
