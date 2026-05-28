package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.checkable.switch.BaseSwitch
import com.sdds.compose.uikit.internal.checkable.switch.BaseSwitchLayout
import com.sdds.compose.uikit.internal.checkable.switch.SwitchToggle
import com.sdds.compose.uikit.internal.checkable.switch.switchText
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.switcher.SwitchMotionStyle
import com.sdds.compose.uikit.motion.components.switcher.rememberSwitchMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param label лейбл
 * @param description описание
 * @param style стиль компонента [SwitchStyle]
 * @param labelMaxLines количество строк в лейбле
 * @param descriptionMaxLines количество строк в описании
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взамодействий
 * @param motion объект анимаций
 */
@Composable
fun Switch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    labelMaxLines: Int = Int.MAX_VALUE,
    descriptionMaxLines: Int = Int.MAX_VALUE,
    animationDuration: Int = Int.MIN_VALUE,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<SwitchMotionStyle> = rememberSwitchMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseSwitch(
        active = active,
        modifier = modifier,
        onActiveChanged = onActiveChanged,
        labelContent = label?.let {
            {
                Text(it, maxLines = labelMaxLines, overflow = TextOverflow.Ellipsis)
            }
        },
        descriptionContent = description?.let {
            {
                Text(it, maxLines = descriptionMaxLines, overflow = TextOverflow.Ellipsis)
            }
        },
        style = style,
        animationDuration = animationDuration,
        enabled = enabled,
        motion = motion,
    )
}

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param labelContent основной контент Switch
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param descriptionContent контент для описания Switch
 * @param style стиль компонента [SwitchStyle]
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взамодействий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun Switch(
    active: Boolean,
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    descriptionContent: (@Composable () -> Unit)? = null,
    animationDuration: Int = Int.MIN_VALUE,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<SwitchMotionStyle> = rememberSwitchMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseSwitch(
        active = active,
        modifier = modifier,
        onActiveChanged = onActiveChanged,
        labelContent = labelContent,
        descriptionContent = descriptionContent,
        style = style,
        animationDuration = animationDuration,
        enabled = enabled,
        motion = motion,
    )
}

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param label лейбл
 * @param description описание
 * @param style стиль компонента [SwitchStyle]
 * @param dimensions размеры и отступы [SwitchDimensions]
 * @param colors цвета [SwitchColors]
 * @param labelTextStyle стиль текста лэйбла
 * @param descriptionTextStyle стиль текста описания
 * @param labelMaxLines количество строк в лейбле
 * @param descriptionMaxLines количество строк в описании
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взамодействий
 */
@Composable
@Deprecated("Use Switch without dimensions and colors parameters")
fun Switch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    dimensions: SwitchDimensions = style.dimensions,
    colors: SwitchColors = style.colors,
    labelTextStyle: TextStyle = style.labelStyle,
    descriptionTextStyle: TextStyle = style.descriptionStyle,
    labelMaxLines: Int = Int.MAX_VALUE,
    descriptionMaxLines: Int = Int.MAX_VALUE,
    animationDuration: Int = style.animationDurationMillis,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val motion = rememberSwitchMotion()
    SideEffect {
        motion.context.semanticStateSource.set(
            SwitchStates.Checked,
            active,
        )
    }
    val colorValues = colors.toColorValues()
    val dimensionValues = dimensions.toDimensionValues()
    val toggleableModifier =
        if (onActiveChanged != null) {
            Modifier.toggleable(
                value = active,
                onValueChange = onActiveChanged,
                enabled = enabled,
                role = Role.Switch,
                interactionSource = interactionSource,
                indication = null,
            )
        } else {
            Modifier
        }
    val labelColor = colorValues.labelBrush.getValueAsState(motion.context)
    val descriptionColor = colorValues.descriptionBrush.getValueAsState(motion.context)
    BaseSwitchLayout(
        modifier = modifier
            .then(toggleableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else style.disableAlpha },
        switch = {
            SwitchToggle(
                active = active,
                thumbShape = style.toggleThumbShapes.getValue(interactionSource),
                trackShape = style.toggleTrackShapes.getValue(interactionSource),
                colors = colorValues,
                dimensions = dimensionValues,
                animationDuration = animationDuration,
                motion = motion,
            )
        },
        label = switchText(
            value = label,
            textStyle = labelTextStyle,
            maxLines = labelMaxLines,
            color = labelColor,
        ),
        description = switchText(
            value = description,
            textStyle = descriptionTextStyle,
            maxLines = descriptionMaxLines,
            color = descriptionColor,
        ),
        verticalSpacing = dimensionValues.descriptionPaddingValues.getValueAsState(motion.context),
        horizontalSpacing = dimensionValues.textPaddingValues.getValueAsState(motion.context),
    )
}

private fun SwitchDimensions.toDimensionValues(): SwitchDimensionValues {
    return object : SwitchDimensionValues {
        override val toggleTrackWidthValues: StatefulValue<Dp> =
            this@toDimensionValues.toggleWidth.asStatefulValue()

        @Deprecated("Use toggleTrackWidthValues", replaceWith = ReplaceWith("toggleTrackWidthValues"))
        override val toggleTrackWidth: Dp = toggleTrackWidthValues.getDefaultValue()

        override val toggleTrackHeightValues: StatefulValue<Dp> =
            this@toDimensionValues.toggleHeight.asStatefulValue()

        @Deprecated("Use toggleTrackHeightValues", replaceWith = ReplaceWith("toggleTrackHeightValues"))
        override val toggleTrackHeight: Dp = toggleTrackHeightValues.getDefaultValue()

        override val toggleThumbWidths: StatefulValue<Dp> =
            this@toDimensionValues.thumbDiameter.asStatefulValue()

        @Deprecated("Use toggleThumbWidths", replaceWith = ReplaceWith("toggleThumbWidths"))
        override val toggleThumbWidth: Dp = toggleThumbWidths.getDefaultValue()

        override val toggleThumbHeights: StatefulValue<Dp> =
            this@toDimensionValues.thumbDiameter.asStatefulValue()

        @Deprecated("Use toggleThumbHeights", replaceWith = ReplaceWith("toggleThumbHeights"))
        override val toggleThumbHeight: Dp = toggleThumbHeights.getDefaultValue()

        override val toggleThumbPaddings: StatefulValue<Dp> = 2.dp.asStatefulValue()

        @Deprecated("Use toggleThumbPaddings", replaceWith = ReplaceWith("toggleThumbPaddings"))
        override val toggleThumbPadding: Dp = toggleThumbPaddings.getDefaultValue()

        override val textPaddingValues: StatefulValue<Dp> =
            this@toDimensionValues.horizontalSpacing.asStatefulValue()

        @Deprecated("Use textPaddingValues", replaceWith = ReplaceWith("textPaddingValues"))
        override val textPadding: Dp = textPaddingValues.getDefaultValue()

        override val descriptionPaddingValues: StatefulValue<Dp> =
            this@toDimensionValues.verticalSpacing.asStatefulValue()

        @Deprecated("Use descriptionPaddingValues", replaceWith = ReplaceWith("descriptionPaddingValues"))
        override val descriptionPadding: Dp = descriptionPaddingValues.getDefaultValue()

        override val paddingTopValues: StatefulValue<Dp> = 0.dp.asStatefulValue()

        @Deprecated("Use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
        override val paddingTop: Dp = paddingTopValues.getDefaultValue()

        override val paddingStartValues: StatefulValue<Dp> = 0.dp.asStatefulValue()

        @Deprecated("Use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
        override val paddingStart: Dp = paddingStartValues.getDefaultValue()

        override val paddingEndValues: StatefulValue<Dp> = 0.dp.asStatefulValue()

        @Deprecated("Use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
        override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

        override val paddingBottomValues: StatefulValue<Dp> = 0.dp.asStatefulValue()

        @Deprecated("Use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
        override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

        override val toggleTrackBorderWidth: StatefulValue<Dp> = 0.dp.asStatefulValue()
    }
}

private fun SwitchColors.toColorValues(): SwitchColorValues {
    return object : SwitchColorValues {
        override val labelBrush: StatefulValue<Brush> = this@toColorValues.labelColor.asStatefulBrush()

        @Deprecated("Use labelBrush", replaceWith = ReplaceWith("labelBrush"))
        override val labelColor: InteractiveColor = this@toColorValues.labelColor.asInteractive()

        override val descriptionBrush: StatefulValue<Brush> = this@toColorValues.labelColor.asStatefulBrush()

        @Deprecated("Use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
        override val descriptionColor: InteractiveColor = this@toColorValues.labelColor.asInteractive()

        override val toggleThumbBrush: StatefulValue<Brush> = this@toColorValues.thumbColor.asStatefulBrush()

        @Deprecated("Use toggleThumbBrush", replaceWith = ReplaceWith("toggleThumbBrush"))
        override val toggleThumbColor: InteractiveColor = this@toColorValues.thumbColor.asInteractive()

        override val toggleTrackBrush: StatefulValue<Brush> = this@toColorValues.inactiveTrackColor
            .asStatefulBrush(setOf(SwitchStates.Checked) to this@toColorValues.activeTrackColor)

        @Deprecated("Use toggleTrackBrush", replaceWith = ReplaceWith("toggleTrackBrush"))
        override val toggleTrackColor: InteractiveColor = this@toColorValues.inactiveTrackColor
            .asInteractive(setOf(SwitchStates.Checked) to this@toColorValues.activeTrackColor)

        override val toggleTrackBorderBrush: StatefulValue<Brush> = Color.Transparent.asStatefulBrush()

        @Deprecated("Use toggleTrackBorderBrush", replaceWith = ReplaceWith("toggleTrackBorderBrush"))
        override val toggleTrackBorderColor: InteractiveColor = Color.Transparent.asInteractive()

        override val backgroundBrush: StatefulValue<Brush> = Color.Transparent.asStatefulBrush()

        @Deprecated("Use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
        override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()
    }
}

/**
 * Состояния Switch
 */
enum class SwitchStates : ValueState {
    /**
     * Switch включен
     */
    Checked,
}

@Composable
@Preview
private fun SwitchPreview() {
    Switch(
        active = true,
        label = "Label",
        style = SwitchStyle
            .builder()
            .toggleThumbShape(RoundedCornerShape(25))
            .toggleTrackShape(RoundedCornerShape(25))
            .style(),
        description = "Description is long enough",
    )
}
