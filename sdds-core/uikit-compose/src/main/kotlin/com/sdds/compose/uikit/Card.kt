package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.toFocusSelectorSettings

/**
 * Компонент Карточка [Card]
 *
 * @param modifier модификатор
 * @param style стиль карточки
 * @param onClick обработчик нажатий
 * @param enabled флаг доступности карточки
 * @param indication [Indication]
 * @param focusSelectorMode режим отображения фокуса компонента [FocusSelectorMode]
 * когда [focusSelectorMode] != [FocusSelectorMode.None]
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param content контент
 */
@Composable
fun Card(
    modifier: Modifier = Modifier,
    style: CardStyle = LocalCardStyle.current,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    indication: Indication? = null,
    focusSelectorMode: FocusSelectorMode = LocalFocusSelectorMode.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    val focusSelector = focusSelectorMode.toFocusSelectorSettings()
    Card(
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        indication = indication,
        focusSelectorSettings = focusSelector,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Компонент Карточка [Card]
 *
 * @param modifier модификатор
 * @param style стиль карточки
 * @param onClick обработчик нажатий
 * @param enabled флаг доступности карточки
 * @param indication [Indication]
 * @param focusSelectorSettings режим отображения фокуса компонента [FocusSelectorSettings]
 * когда [FocusSelectorSettings] != None
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param content контент
 */
@Composable
fun Card(
    modifier: Modifier = Modifier,
    style: CardStyle = LocalCardStyle.current,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    indication: Indication? = null,
    focusSelectorSettings: FocusSelectorSettings,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    val isFocused by interactionSource.collectIsFocusedAsState()
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val shape = style.shape
    CompositionLocalProvider(LocalCardStyle provides style) {
        Box(
            modifier = modifier
                .focusSelector(focusSelectorSettings, shape) { isFocused }
                .surface(
                    backgroundColor = { SolidColor(backgroundColor) },
                    shape = shape,
                    onClick = onClick,
                    enabled = enabled,
                    indication = indication,
                    interactionSource = interactionSource,
                )
                .padding(
                    start = style.dimensions.paddingStart,
                    top = style.dimensions.paddingTop,
                    end = style.dimensions.paddingEnd,
                    bottom = style.dimensions.paddingBottom,
                ),
            contentAlignment = Alignment.Center,
        ) {
            content()
        }
    }
}

/**
 * Контент карточки.
 *
 * @param modifier модификатор
 * @param style стиль карточки
 * @param focusSelectorMode режим отображения фокуса контента [FocusSelectorMode]
 * когда [focusSelectorMode] != [FocusSelectorMode.None]
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param content контент
 */
@Composable
fun CardContent(
    modifier: Modifier,
    style: CardStyle = LocalCardStyle.current,
    focusSelectorMode: FocusSelectorMode = FocusSelectorMode.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    val focusSelector = focusSelectorMode.toFocusSelectorSettings()
    CardContent(
        modifier = modifier,
        style = style,
        focusSelectorSettings = focusSelector,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Контент карточки.
 *
 * @param modifier модификатор
 * @param style стиль карточки
 * @param focusSelectorSettings режим отображения фокуса контента [FocusSelectorSettings]
 * когда [FocusSelectorSettings] != None
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param content контент
 */
@Composable
fun CardContent(
    modifier: Modifier,
    style: CardStyle = LocalCardStyle.current,
    focusSelectorSettings: FocusSelectorSettings,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = style.contentShape
    Box(
        modifier = Modifier
            .focusSelector(
                focusSelectorSettings,
                shape = shape,
            ) { isFocused }
            .clip(shape)
            .then(modifier),
        contentAlignment = Alignment.Center,
    ) {
        content()
    }
}
