package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
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
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
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
    indication: Indication? = LocalIndication.current,
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
    indication: Indication? = LocalIndication.current,
    focusSelectorSettings: FocusSelectorSettings,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = style.shape
    CompositionLocalProvider(LocalCardStyle provides style) {
        val backgroundBrush = style.colors.backgroundBrush.getValueAsState(interactionSource)
        Box(
            modifier = modifier
                .focusSelector(focusSelectorSettings, shape) { isFocused }
                .surface(
                    backgroundColor = { backgroundBrush.value },
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
 * @param contentFocusSelectorSettings режим отображения фокуса контента [FocusSelectorSettings]
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
    indication: Indication? = LocalIndication.current,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    contentFocusSelectorSettings: FocusSelectorSettings = FocusSelectorSettings.None,
    orientation: CardOrientation = CardOrientation.Vertical,
    contentPaddings: PaddingValues = style.toPaddingValues(),
    extra: (@Composable BoxScope.() -> Unit)? = null,
    label: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    val isFocused by interactionSource.collectIsFocusedAsState()
    val backgroundBrush = style.colors.backgroundBrush.getValueAsState(interactionSource)
    val shape = style.shape
    val cardModifier = modifier
        .focusSelector(focusSelectorSettings, shape) { isFocused }
        .surface(
            backgroundColor = { backgroundBrush.value },
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
        CardOrientation.Vertical ->
            VerticalCard(
                modifier = cardModifier,
                style = style,
                contentPaddings = contentPaddings,
                contentFocusSelectorSettings = contentFocusSelectorSettings,
                content = content,
                extra = extra,
                label = label,
                interactionSource = interactionSource,
            )

        CardOrientation.Horizontal ->
            HorizontalCard(
                modifier = cardModifier,
                style = style,
                contentPaddings = contentPaddings,
                contentFocusSelectorSettings = contentFocusSelectorSettings,
                content = content,
                extra = extra,
                label = label,
                interactionSource = interactionSource,
            )
    }
}

/**
 * Компонент Карточка [Card] со слотами title и subtitle.
 *
 * @param modifier модификатор
 * @param style стиль карточки
 * @param onClick обработчик нажатий
 * @param enabled флаг доступности карточки
 * @param indication [Indication]
 * @param focusSelectorSettings режим отображения фокуса компонента [FocusSelectorSettings]
 * @param contentFocusSelectorSettings режим отображения фокуса контента [FocusSelectorSettings]
 * @param orientation расположение контента внутри карточки [CardOrientation]
 * @param contentPaddings отступ внутри контента
 * @param extra слот для дополнительного контента (к нему не применяются contentPadding)
 * @param title слот для расположения заголовка
 * @param subtitle слот для расположения подзаголовка
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param content контент
 */
@Composable
fun Card(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: CardStyle = LocalCardStyle.current,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    indication: Indication? = LocalIndication.current,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    contentFocusSelectorSettings: FocusSelectorSettings = FocusSelectorSettings.None,
    orientation: CardOrientation = CardOrientation.Vertical,
    contentPaddings: PaddingValues = style.toPaddingValues(),
    subtitle: (@Composable () -> Unit)? = null,
    extra: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit),
) {
    Card(
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        indication = indication,
        focusSelectorSettings = focusSelectorSettings,
        contentFocusSelectorSettings = contentFocusSelectorSettings,
        orientation = orientation,
        contentPaddings = contentPaddings,
        extra = extra,
        label = {
            CardLabel(
                style = style,
                interactionSource = interactionSource,
                title = title,
                subtitle = subtitle,
            )
        },
        interactionSource = interactionSource,
        content = content,
    )
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
            .widthIn(min = style.dimensions.contentMinWidth, max = style.dimensions.contentMaxWidth)
            .heightIn(min = style.dimensions.contentMinHeight, max = style.dimensions.contentMaxHeight)
            .focusSelector(
                focusSelectorSettings,
                shape = shape,
            ) { isFocused }
            .then(modifier)
            .clip(shape),
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
    contentFocusSelectorSettings: FocusSelectorSettings,
    content: (@Composable () -> Unit),
    extra: (@Composable BoxScope.() -> Unit)? = null,
    label: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(style.dimensions.mainAxisGap, Alignment.CenterVertically),
    ) {
        CompositionLocalProvider(LocalCardStyle provides style) {
            Box {
                CardContent(
                    modifier = Modifier
                        .padding(contentPaddings),
                    focusSelectorSettings = contentFocusSelectorSettings,
                ) {
                    content()
                }
                Box(
                    modifier = Modifier
                        .matchParentSize(),
                ) {
                    extra?.invoke(this)
                }
            }
        }
        val labelColor = style.colors.labelColor.colorForInteractionAsState(interactionSource)
        @Suppress("DEPRECATION")
        ProvideTextStyle(style.labelStyle, color = { labelColor.value }) {
            Box(
                modifier = Modifier
                    .widthIn(max = style.dimensions.contentMaxWidth),
            ) {
                label?.invoke()
            }
        }
    }
}

@Composable
private fun HorizontalCard(
    modifier: Modifier,
    style: CardStyle,
    contentPaddings: PaddingValues,
    contentFocusSelectorSettings: FocusSelectorSettings,
    content: (@Composable () -> Unit),
    extra: (@Composable BoxScope.() -> Unit)? = null,
    label: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(style.dimensions.mainAxisGap, Alignment.CenterHorizontally),
    ) {
        CompositionLocalProvider(LocalCardStyle provides style) {
            Box {
                CardContent(
                    modifier = Modifier
                        .padding(contentPaddings),
                    focusSelectorSettings = contentFocusSelectorSettings,
                ) {
                    content()
                }
                Box(
                    modifier = Modifier
                        .matchParentSize(),
                ) {
                    extra?.invoke(this)
                }
            }
        }
        val labelColor = style.colors.labelColor.colorForInteractionAsState(interactionSource)
        @Suppress("DEPRECATION")
        ProvideTextStyle(style.labelStyle, color = { labelColor.value }) {
            Box(
                modifier = Modifier
                    .heightIn(max = style.dimensions.contentMaxHeight),
            ) {
                label?.invoke()
            }
        }
    }
}

@Composable
private fun CardLabel(
    style: CardStyle,
    interactionSource: MutableInteractionSource,
    title: @Composable () -> Unit,
    subtitle: (@Composable () -> Unit)?,
) {
    val subtitleGap = style.dimensions.subtitleGap.getValue(interactionSource)
    Column(
        verticalArrangement = Arrangement.spacedBy(subtitleGap),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val titleColor = style.colors.titleColor.getValueAsState(interactionSource)
        ProvideTextStyle(style.titleStyle, brush = { titleColor.value }) {
            title()
        }
        if (subtitle != null) {
            val subtitleStyle by style.subtitleStyles.getValueAsState(interactionSource)
            val subtitleBrush = style.colors.subtitleBrush.getValueAsState(interactionSource)
            ProvideTextStyle(subtitleStyle, brush = { subtitleBrush.value }) {
                subtitle()
            }
        }
    }
}

private fun CardStyle.toPaddingValues() = PaddingValues(
    start = dimensions.contentPaddingStart,
    top = dimensions.contentPaddingTop,
    end = dimensions.contentPaddingEnd,
    bottom = dimensions.contentPaddingBottom,
)
