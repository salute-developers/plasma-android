package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.DefaultVerticalArrangement
import com.sdds.compose.uikit.internal.checkable.radiobox.BaseRadioBox
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.radiobox.RadioBoxMotionStyle
import com.sdds.compose.uikit.motion.components.radiobox.rememberRadioBoxMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент RadioBox
 * @param checked флаг-индикатор выбора
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onClick слушатель нажатий
 * @param label лейбл
 * @param description описание
 * @param enabled включен ли компонент
 * @param interactionSource источник событий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun RadioBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    style: RadioBoxStyle = LocalRadioBoxStyle.current,
    onClick: (() -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    enabled: Boolean = true,
    animationDuration: Int = Int.MIN_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<RadioBoxMotionStyle> = rememberRadioBoxMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseRadioBox(
        checked = checked,
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        animationDuration = animationDuration,
        motion = motion,
        labelContent = label?.let {
            {
                Text(it)
            }
        },
        descriptionContent = description?.let {
            {
                Text(it)
            }
        },
    )
}

/**
 * Компонент RadioBox
 * @param checked флаг-индикатор выбора
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onClick слушатель нажатий
 * @param labelContent основной контент
 * @param descriptionContent контент для описания
 * @param enabled включен ли компонент
 * @param interactionSource источник событий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun RadioBox(
    checked: Boolean,
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: RadioBoxStyle = LocalRadioBoxStyle.current,
    onClick: (() -> Unit)? = null,
    descriptionContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    animationDuration: Int = Int.MIN_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<RadioBoxMotionStyle> = rememberRadioBoxMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseRadioBox(
        checked = checked,
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        labelContent = labelContent,
        descriptionContent = descriptionContent,
        animationDuration = animationDuration,
        motion = motion,
    )
}

/**
 * Состояния RadioBox
 */
@ApiStateSet(components = ["RadioBox"])
enum class RadioBoxStates : ValueState {
    /**
     * Radiobox выбран
     */
    Checked,
}

/**
 * Stateful вертикальная группа [RadioBox].
 * @param modifier модификатор
 * @param style стиль компонента
 * @param verticalArrangement способ распределения элементов по вертикали
 * @param horizontalAlignment выравнивание по горизонтали
 * @param default выбранный по умолчанию элемент
 * @param content контент, состоящий из [RadioBox]
 */
@Composable
fun <T : Any> RadioBoxGroup(
    modifier: Modifier = Modifier,
    style: RadioBoxGroupStyle = LocalRadioBoxGroupStyle.current,
    verticalArrangement: Arrangement.Vertical = DefaultVerticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    default: T? = null,
    content: @Composable RadioBoxGroupScope.(selection: MutableState<T?>) -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val resolvedArrangement = if (verticalArrangement == DefaultVerticalArrangement) {
        Arrangement.spacedBy(style.dimensions.itemSpacingValues.getValue(interactionSource))
    } else {
        verticalArrangement
    }
    val selection = remember { mutableStateOf(default) }
    Column(
        modifier = modifier,
        verticalArrangement = resolvedArrangement,
        horizontalAlignment = horizontalAlignment,
    ) {
        CompositionLocalProvider(LocalRadioBoxStyle provides style.radioBoxStyle) {
            RadioBoxScopeInstance.content(selection)
        }
    }
}

/**
 * Stateless вертикальная группа [RadioBox].
 * @param modifier модификатор
 * @param style стиль компонента
 * @param verticalArrangement способ распределения элементов по вертикали
 * @param horizontalAlignment выравнивание по горизонтали
 * @param content контент, состоящий из [RadioBox]
 */
@Composable
fun RadioBoxGroup(
    modifier: Modifier = Modifier,
    style: RadioBoxGroupStyle = LocalRadioBoxGroupStyle.current,
    verticalArrangement: Arrangement.Vertical = DefaultVerticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val resolvedArrangement = if (verticalArrangement == DefaultVerticalArrangement) {
        Arrangement.spacedBy(style.dimensions.itemSpacingValues.getValue(interactionSource))
    } else {
        verticalArrangement
    }
    Column(
        modifier = modifier,
        verticalArrangement = resolvedArrangement,
        horizontalAlignment = horizontalAlignment,
    ) {
        CompositionLocalProvider(LocalRadioBoxStyle provides style.radioBoxStyle) {
            content()
        }
    }
}

/**
 * Скоуп элемента stateful группы [RadioBoxGroup]
 */
interface RadioBoxGroupItemScope

private object RadioBoxGroupItemScopeInstance : RadioBoxGroupItemScope

/**
 * Скоуп stateful группы [RadioBoxGroup]
 */
interface RadioBoxGroupScope {

    /**
     * Добавляет элемент с ключом [key] в группу
     *
     * @param key уникальный ключ элмента группы
     * @param content composable элемента
     */
    @Composable
    fun <T> radioBoxItem(key: T, content: @Composable RadioBoxGroupItemScope.(key: T) -> Unit)
}

private object RadioBoxScopeInstance : RadioBoxGroupScope {

    @Composable
    override fun <T> radioBoxItem(
        key: T,
        content: @Composable (RadioBoxGroupItemScope.(key: T) -> Unit),
    ) {
        RadioBoxGroupItemScopeInstance.content(key)
    }
}

/**
 * Проверяет совадает ли ключ элемента [key] с текущим значением значением [selection]
 */
fun <T> RadioBoxGroupItemScope.isChecked(selection: MutableState<T>, key: T) =
    selection.value == key

/**
 * Обновляет текущее значение [selection] значением ключа [key]
 */
fun <T> RadioBoxGroupItemScope.updateSelection(selection: MutableState<T>, key: T) {
    if (selection.value != key) {
        selection.value = key
    }
}

@Composable
@Preview
private fun RadioBoxPreview() {
    RadioBox(
        modifier = Modifier.padding(8.dp),
        checked = true,
        label = "label",
        style = RadioBoxStyle.builder().style(),
        description = "description",
    )
}
