package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
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
 * Компонент Карточка [Card]
 *
 * @param modifier модификатор
 * @param style стиль карточки
 * @param onClick обработчик нажатий
 * @param enabled флаг доступности карточки
 * @param indication [Indication]
 * @param focusSelectorSettings режим отображения фокуса компонента [FocusSelectorSettings]
 * @param orientation расположение контента внутри карточки [CardOrientation]
 * @param contentPaddings отступ внутри контента
 * @param extra слот для дополнительного контента (к нему не применяются contentPadding)
 * @param label  слот для расположения заголовка
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
    orientation: CardOrientation = CardOrientation.Vertical,
    contentPaddings: PaddingValues = style.toPaddingValues(),
    extra: (@Composable () -> Unit)? = null,
    label: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    val isFocused by interactionSource.collectIsFocusedAsState()
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val shape = style.shape
    val cardModifier = modifier
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
        )
    when (orientation) {
        CardOrientation.Vertical -> VerticalCard(cardModifier, style, contentPaddings, content, extra, label)
        CardOrientation.Horizontal -> HorizontalCard(cardModifier, style, contentPaddings, content, extra, label)
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
            .widthIn(min = style.dimensions.contentMinWidth)
            .heightIn(min = style.dimensions.contentMinHeight)
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

/**
 * Способы группировки контента в карточке
 */
enum class CardOrientation {
    /**
     * Контент будет группироваться по-вертикали (в Column)
     */
    Vertical,

    /**
     * Контент будет группироваться по-горизонтали (в Row)
     */
    Horizontal,
}

@Composable
private fun VerticalCard(
    modifier: Modifier,
    style: CardStyle,
    contentPaddings: PaddingValues,
    content: (@Composable () -> Unit),
    extra: (@Composable () -> Unit)? = null,
    label: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(style.dimensions.mainAxisGap, Alignment.CenterVertically),
    ) {
        CompositionLocalProvider(LocalCardStyle provides style) {
            Box {
                Box(
                    modifier = Modifier
                        .widthIn(min = style.dimensions.contentMinWidth)
                        .heightIn(min = style.dimensions.contentMinHeight)
                        .padding(contentPaddings),
                    contentAlignment = Alignment.Center,
                ) {
                    content()
                }
                Box(
                    modifier = Modifier
                        .matchParentSize(),
                ) {
                    extra?.invoke()
                }
            }
        }
        CompositionLocalProvider(LocalTextStyle provides style.labelStyle) {
            label?.invoke()
        }
    }
}

@Composable
private fun HorizontalCard(
    modifier: Modifier,
    style: CardStyle,
    contentPaddings: PaddingValues,
    content: (@Composable () -> Unit),
    extra: (@Composable () -> Unit)? = null,
    label: (@Composable () -> Unit)? = null,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(style.dimensions.mainAxisGap, Alignment.CenterHorizontally),
    ) {
        CompositionLocalProvider(LocalCardStyle provides style) {
            Box {
                Box(
                    modifier = Modifier
                        .widthIn(min = style.dimensions.contentMinWidth)
                        .heightIn(min = style.dimensions.contentMinHeight)
                        .padding(contentPaddings),
                    contentAlignment = Alignment.Center,
                ) {
                    content()
                }
                Box(
                    modifier = Modifier
                        .matchParentSize(),
                ) {
                    extra?.invoke()
                }
            }
        }
        CompositionLocalProvider(LocalTextStyle provides style.labelStyle) {
            label?.invoke()
        }
    }
}

private fun CardStyle.toPaddingValues() = PaddingValues(
    start = dimensions.contentPaddingStart,
    top = dimensions.contentPaddingTop,
    end = dimensions.contentPaddingEnd,
    bottom = dimensions.contentPaddingBottom,
)
