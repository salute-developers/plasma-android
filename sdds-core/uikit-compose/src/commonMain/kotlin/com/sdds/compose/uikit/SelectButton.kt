package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

/**
 * Компонент кнопки для выбора, предназначенный для использования внутри [SelectScope].
 * Отображает выбранное значение и управляет состоянием открытия/закрытия селектора.
 *
 * @param label Текущее выбранное значение, отображаемое на кнопке
 * @param modifier Модификатор для настройки внешнего вида и поведения компонента
 * @param style Стиль кнопки, определяющий её визуальное оформление
 * @param spacing Определяет расположение контента внутри кнопки (например, [ButtonSpacing.SpaceBetween] для распределения по краям)
 * @param enabled Флаг, определяющий доступность компонента для взаимодействия
 * @param readonly Флаг, запрещающий изменение состояния селектора при клике на кнопку
 * @param startIcon Ресурс иконки, отображаемой в начале кнопки (слева от текста)
 * @param iconOpened Ресурс иконки, отображаемой когда селектор открыт (обычно стрелка вверх)
 * @param iconClosed Ресурс иконки, отображаемой когда селектор закрыт (обычно стрелка вниз)
 * @param onClickLabel Описательная метка для действия клика, используемая специальными возможностями (accessibility)
 * @param interactionSource Источник взаимодействий для отслеживания состояний компонента (наведение, нажатие и т.д.)
 */
@Composable
fun SelectScope.SelectButton(
    label: String,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalButtonStyle.current,
    spacing: ButtonSpacing = ButtonSpacing.SpaceBetween,
    enabled: Boolean = true,
    readonly: Boolean = false,
    @DrawableRes
    startIcon: Int? = null,
    @DrawableRes
    iconOpened: Int? = null,
    @DrawableRes
    iconClosed: Int? = null,
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val selectState = LocalSelectState.current
    val isOpened = selectState.isOpened
    Button(
        modifier = modifier,
        label = label,
        icons = ButtonIcons(
            startRes = startIcon,
            endRes = if (isOpened) iconOpened else iconClosed,
        ),
        style = style,
        enabled = enabled,
        onClickLabel = onClickLabel,
        spacing = spacing,
        interactionSource = interactionSource,
        onClick = { if (!readonly) selectState.toggle() },
    )
}
