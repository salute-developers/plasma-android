package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.checkable.checkbox.BaseCheckBox
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.checkbox.CheckBoxMotionStyle
import com.sdds.compose.uikit.motion.components.checkbox.rememberCheckBoxMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент CheckBox
 * @param checked установлен ли или снят флажок
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onCheckedChange слушатель изменения состояния checked
 * @param enabled включен ли компонент
 * @param label лейбл
 * @param description описание
 * @param interactionSource источник событий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun CheckBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onCheckedChange: ((Boolean) -> Unit)? = null,
    enabled: Boolean = true,
    label: String? = null,
    description: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CheckBoxMotionStyle> = rememberCheckBoxMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    CheckBox(
        state = ToggleableState(checked),
        onClick = if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else {
            null
        },
        modifier = modifier,
        style = style,
        enabled = enabled,
        label = label,
        description = description,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент CheckBox
 * @param state состояние [ToggleableState]
 * @param onClick слушатель нажатий
 * @param modifier модификатор
 * @param style стиль компонента
 * @param label лейбл
 * @param description описание
 * @param enabled включен ли компонент
 * @param interactionSource источник событий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun CheckBox(
    state: ToggleableState,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    label: String? = null,
    description: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CheckBoxMotionStyle> = rememberCheckBoxMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseCheckBox(
        value = state.toCheckBoxValue(),
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        labelContent = label?.let {
            {
                Text(it)
            }
        },
        descriptionContent = description?.let {
            {
                Text(description)
            }
        },
        motion = motion,
    )
}

/**
 * Компонент CheckBox
 * @param state состояние [ToggleableState]
 * @param labelContent лейбл
 * @param onClick слушатель нажатий
 * @param modifier модификатор
 * @param style стиль компонента
 * @param enabled включен ли компонент
 * @param descriptionContent описание
 * @param interactionSource источник событий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun CheckBox(
    state: ToggleableState,
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    descriptionContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CheckBoxMotionStyle> = rememberCheckBoxMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseCheckBox(
        value = state.toCheckBoxValue(),
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        labelContent = labelContent,
        descriptionContent = descriptionContent,
        motion = motion,
    )
}

/**
 * Компонент CheckBox
 * @param value значение [CheckBoxValue]
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onClick слушатель нажатий
 * @param enabled включен ли компонент
 * @param label лейбл
 * @param description описание
 * @param interactionSource источник событий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun CheckBox(
    value: CheckBoxValue,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    label: String? = null,
    description: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CheckBoxMotionStyle> = rememberCheckBoxMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseCheckBox(
        value = value,
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        labelContent = label?.let {
            {
                Text(it)
            }
        },
        descriptionContent = description?.let {
            {
                Text(description)
            }
        },
        motion = motion,
    )
}

/**
 * Компонент CheckBox
 * @param value значение [CheckBoxValue]
 * @param labelContent лейбл
 * @param onClick слушатель нажатий
 * @param modifier модификатор
 * @param style стиль компонента
 * @param enabled включен ли компонент
 * @param descriptionContent описание
 * @param interactionSource источник событий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun CheckBox(
    value: CheckBoxValue,
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    descriptionContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CheckBoxMotionStyle> = rememberCheckBoxMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseCheckBox(
        value = value,
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        labelContent = labelContent,
        descriptionContent = descriptionContent,
        motion = motion,
    )
}

/**
 * Значение состояния [CheckBox].
 *
 * В отличие от [ToggleableState] (используется в перегрузках выше для обратной совместимости),
 * дополнительно содержит [Error] — состояние, сигнализирующее, что значение чекбокса невалидно.
 * [Error] может быть установлено только вызывающим кодом (например, по результату валидации формы) —
 * сам компонент никогда не переводит себя в [Error] в результате клика.
 */
enum class CheckBoxValue {
    /**
     * CheckBox снят
     */
    Off,

    /**
     * CheckBox выбран
     */
    On,

    /**
     * Indeterminate состояние
     */
    Indeterminate,

    /**
     * Состояние ошибки/невалидного значения. Задаётся только программно.
     */
    Error,
}

internal fun ToggleableState.toCheckBoxValue(): CheckBoxValue = when (this) {
    ToggleableState.On -> CheckBoxValue.On
    ToggleableState.Off -> CheckBoxValue.Off
    ToggleableState.Indeterminate -> CheckBoxValue.Indeterminate
}

/**
 * Состояния CheckBox
 */
@ApiStateSet(components = ["CheckBox"])
enum class CheckBoxStates : ValueState {
    /**
     * CheckBox выбран
     */
    Checked,

    /**
     * Indeterminate состояние
     */
    Indeterminate,

    /**
     * Значение CheckBox невалидно
     */
    Error,
}
