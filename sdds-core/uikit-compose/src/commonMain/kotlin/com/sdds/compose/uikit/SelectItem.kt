package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.maybeShapeable
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.cell.rememberCellMotion
import com.sdds.compose.uikit.motion.components.checkbox.rememberCheckBoxMotion
import com.sdds.compose.uikit.motion.components.select.SelectItemMotionStyle
import com.sdds.compose.uikit.motion.components.select.rememberSelectItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Элемент компонента выбора [Select].
 * Поддерживает представления одиночного (radio) и множественного (checkbox) выбора.
 *
 * Представляет собой строку с элементом управления слева и пользовательским контентом справа.
 * Внешний вид компонента настраивается через [SelectItemStyle].
 *
 * @param checked Флаг состояния выбора элемента. Определяет отображение элемента управления.
 * @param onClick Обработчик, вызываемый при клике на элемент. Должен изменять состояние [checked].
 * @param modifier Модификатор для настройки внешнего вида и расположения компонента.
 * @param style Стиль компонента, определяющий цвета, размеры и форму. По умолчанию используется [LocalSelectItemStyle.current].
 * @param enabled Флаг доступности компонента. Если `false`, компонент отображается с пониженной прозрачностью и не реагирует на клики.
 * @param disclosureEnabled Флаг включения [disclosureContent]
 * @param labelContent контент надписи
 * @param subtitleContent контент подзаголовка
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param disclosureContent контент disclosure
 * @param interactionSource Источник взаимодействий для отслеживания состояний (наведение, нажатие и т.д.).
 * @param titleContent контент заголовка
 *
 * @see SelectItemStyle Стиль компонента выбора
 * @see SelectItemType Тип выбора (одиночный/множественный)
 */
@Composable
@NonRestartableComposable
fun SelectItem(
    checked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SelectItemStyle = LocalSelectItemStyle.current,
    enabled: Boolean = true,
    disclosureEnabled: Boolean = true,
    labelContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    disclosureContent: (@Composable RowScope.() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    titleContent: @Composable () -> Unit,
) {
    SelectItem(
        motion = rememberSelectItemMotion(motionContext = rememberMotionContext(interactionSource)),
        checked = checked,
        onClick = onClick,
        modifier = modifier,
        style = style,
        enabled = enabled,
        disclosureEnabled = disclosureEnabled,
        labelContent = labelContent,
        subtitleContent = subtitleContent,
        startContent = startContent,
        endContent = endContent,
        disclosureContent = disclosureContent,
        titleContent = titleContent,
    )
}

/**
 * Элемент выбора с переходами собственных значений и состоянием Selected из checked.
 * Встроенные Cell/CheckBox используют контекст строки и собственные стили переходов.
 *
 * @param motion контекст состояний и стиль переходов строки.
 */
@Composable
@NonRestartableComposable
fun SelectItem(
    motion: Motion<SelectItemMotionStyle>,
    checked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SelectItemStyle = LocalSelectItemStyle.current,
    enabled: Boolean = true,
    disclosureEnabled: Boolean = true,
    labelContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
    startContent: (@Composable RowScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    disclosureContent: (@Composable RowScope.() -> Unit)? = null,
    titleContent: @Composable () -> Unit,
) {
    SelectItem(
        motion = motion,
        checked = checked,
        onClick = onClick,
        modifier = modifier,
        style = style,
        enabled = enabled,
        content = {
            Cell(
                motion = rememberCellMotion(motionContext = motion.context),
                interactionSource = motion.context.interactionSource,
                style = style.cellStyle,
                titleContent = titleContent,
                labelContent = labelContent,
                subtitleContent = subtitleContent,
                startContent = startContent,
                endContent = endContent,
                disclosureContent = if (disclosureEnabled) disclosureContent else null,
            )
        },
    )
}

/**
 * Элемент компонента выбора [Select].
 * Поддерживает представления одиночного (radio) и множественного (checkbox) выбора.
 *
 * Представляет собой строку с элементом управления слева и пользовательским контентом справа.
 * Внешний вид компонента настраивается через [SelectItemStyle].
 *
 * @param checked Флаг состояния выбора элемента. Определяет отображение элемента управления.
 * @param onClick Обработчик, вызываемый при клике на элемент. Должен изменять состояние [checked].
 * @param modifier Модификатор для настройки внешнего вида и расположения компонента.
 * @param style Стиль компонента, определяющий цвета, размеры и форму. По умолчанию используется [LocalSelectItemStyle.current].
 * @param enabled Флаг доступности компонента. Если `false`, компонент отображается с пониженной прозрачностью и не реагирует на клики.
 * @param interactionSource Источник взаимодействий для отслеживания состояний (наведение, нажатие и т.д.).
 * @param content Основной контент элемента справа от элемента управления.
 *
 * @see SelectItemStyle Стиль компонента выбора
 * @see SelectItemType Тип выбора (одиночный/множественный)
 */
@Composable
fun SelectItem(
    checked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SelectItemStyle = LocalSelectItemStyle.current,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit,
) {
    SelectItem(
        motion = rememberSelectItemMotion(motionContext = rememberMotionContext(interactionSource)),
        checked = checked,
        onClick = onClick,
        modifier = modifier,
        style = style,
        enabled = enabled,
        content = content,
    )
}

/**
 * Элемент выбора с переходами собственных значений и состоянием Selected из checked.
 * Произвольный content получает общий контекст только при явной передаче потребителем.
 * Форма переключается без интерполяции, незаданные переходы используют noMotion().
 *
 * @param motion контекст состояний и стиль переходов строки.
 */
@Composable
fun SelectItem(
    motion: Motion<SelectItemMotionStyle>,
    checked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SelectItemStyle = LocalSelectItemStyle.current,
    enabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    val shape by style.shapes.getValueAsState(motion.context)
    val backgroundBrush by style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val iconBrush by style.colors.iconBrush.getBrushAsState(motion.context, motion.style.iconColor)
    val height by style.dimensions.heightValues.getValueAsState(motion.context)
    val paddingStart by style.dimensions.paddingStartValues.getValueAsState(motion.context)
    val paddingEnd by style.dimensions.paddingEndValues.getValueAsState(motion.context)
    val paddingTop by style.dimensions.paddingTopValues.getValueAsState(motion.context)
    val paddingBottom by style.dimensions.paddingBottomValues.getValueAsState(motion.context)
    val controlMargin by style.dimensions.controlMarginValues.getValueAsState(motion.context)
    val controlSize by style.dimensions.controlSizeValues.getValueAsState(motion.context)
    Row(
        modifier = modifier
            .selection(checked, motion.context.semanticStateSource)
            .alpha(if (enabled) 1f else style.disableAlpha)
            .background(
                brush = backgroundBrush,
                shape = shape,
            )
            .heightIn(min = height)
            .padding(
                start = paddingStart,
                end = paddingEnd,
                top = paddingTop,
                bottom = paddingBottom,
            )
            .clickable(
                enabled = enabled,
                indication = LocalIndication.current.maybeShapeable(shape),
                interactionSource = motion.context.interactionSource,
            ) {
                onClick.invoke()
            },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(end = controlMargin)
                .size(controlSize),
        ) {
            CompositionLocalProvider(
                LocalTintBrushProducer provides { iconBrush },
                LocalCheckBoxStyle provides style.checkBoxStyle,
            ) {
                val controlContent: @Composable () -> Unit = {
                    when (style.itemType) {
                        SelectItemType.Single -> {
                            val icon = style.iconSource
                            if (checked && icon != null) {
                                Icon(
                                    source = icon,
                                    contentDescription = "",
                                )
                            }
                        }

                        SelectItemType.Multiple -> {
                            CheckBox(
                                enabled = enabled,
                                state = ToggleableState(checked),
                                interactionSource = motion.context.interactionSource,
                                motion = rememberCheckBoxMotion(motionContext = motion.context),
                            )
                        }
                    }
                }
                controlContent()
            }
        }
        CompositionLocalProvider(LocalCellStyle provides style.cellStyle) {
            content()
        }
    }
}

/**
 * Тип элемента выбора [SelectItem]
 */
enum class SelectItemType {
    /**
     * Тип элемента для одиночного выбора
     */
    Single,

    /**
     * Тип элемента для множественного выбора
     */
    Multiple,
}
