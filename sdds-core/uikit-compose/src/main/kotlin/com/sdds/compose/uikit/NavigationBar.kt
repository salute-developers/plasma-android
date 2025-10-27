package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.internal.cell.BaseCell
import com.sdds.compose.uikit.shadow.shadow

/**
 * Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий.
 *
 * @param modifier модификатор
 * @param style стиль компонента [NavigationBarStyle]
 * @param textPlacement расположение текста [NavigationBarTextPlacement]
 * @param textAlign выравнивание встроенного текста [NavigationBarTextAlign]
 * @param contentPlacement выравнивание контента [NavigationBarContentPlacement]
 * @param actionStart экшн в начале
 * @param actionEnd экшн в конце
 * @param textContent текст NavigationBar
 * @param content контент NavigationBar
 * @param interactionSource источник взаимодействий
 */
@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    style: NavigationBarStyle = LocalNavigationBarStyle.current,
    textPlacement: NavigationBarTextPlacement = NavigationBarTextPlacement.Bottom,
    textAlign: NavigationBarTextAlign = NavigationBarTextAlign.Center,
    contentPlacement: NavigationBarContentPlacement = NavigationBarContentPlacement.Bottom,
    actionStart: (@Composable () -> Unit)? = null,
    actionEnd: (@Composable () -> Unit)? = null,
    textContent: (@Composable () -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    Column(
        modifier = modifier
            .shadow(style.shadow)
            .clip(rememberBarShape(style.bottomShape))
            .background(style.colors.backgroundColor.colorForInteraction(interactionSource)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = style.dimensions.paddingStart,
                    end = style.dimensions.paddingEnd,
                    top = style.dimensions.paddingTop,
                    bottom = style.dimensions.paddingBottom,
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            BaseCell(
                modifier = Modifier.fillMaxWidth(),
                startContent = startContent(
                    style = style,
                    interactionSource = interactionSource,
                    actionStart = actionStart,
                    actionEnd = actionEnd,
                    textAlign = textAlign,
                ),
                centerContent = centerContent(
                    style = style,
                    content = content,
                    textContent = textContent,
                    contentPlacement = contentPlacement,
                    textPlacement = textPlacement,
                    textAlign = textAlign,
                    interactionSource = interactionSource,
                ),
                endContent = endContent(
                    style = style,
                    interactionSource = interactionSource,
                    actionStart = actionStart,
                    actionEnd = actionEnd,
                    textAlign = textAlign,
                ),
                dimensions = CellDimensions.builder()
                    .contentPaddingStart(style.dimensions.horizontalSpacing)
                    .contentPaddingEnd(style.dimensions.horizontalSpacing)
                    .build(),
            )

            OuterText(
                textContent = textContent,
                textPlacement = textPlacement,
                style = style,
                interactionSource = interactionSource,
            )
        }

        OuterContent(content, contentPlacement)
    }
}

/**
 * Расположение текста
 */
enum class NavigationBarTextPlacement {
    /**
     * Внутри основного блока
     */
    Inline,

    /**
     * Снизу от основного блока
     */
    Bottom,
}

/**
 * Выравнивание Inline-текста (при [NavigationBarTextPlacement.Inline])
 */
enum class NavigationBarTextAlign {
    /**
     * Текст расположен в начале, оба экшена в конце
     */
    Start,

    /**
     * Текст расположен по центру между экшенами
     */
    Center,

    /**
     * Текст расположен в конце, оба экшена в начале
     */
    End,
}

/**
 * Расположение контента
 */
enum class NavigationBarContentPlacement {
    /**
     * Внутри основного блока
     */
    Inline,

    /**
     * Снизу от основного блока
     */
    Bottom,
}

@Composable
private fun rememberBarShape(bottomShape: CornerBasedShape): RoundedCornerShape {
    return remember(bottomShape) {
        RoundedCornerShape(
            topStart = ZeroCornerSize,
            topEnd = ZeroCornerSize,
            bottomStart = bottomShape.bottomStart,
            bottomEnd = bottomShape.bottomEnd,
        )
    }
}

@Composable
private fun OuterContent(
    content: (@Composable () -> Unit)?,
    contentPlacement: NavigationBarContentPlacement,
) {
    if (content != null && contentPlacement == NavigationBarContentPlacement.Bottom) {
        content.invoke()
    }
}

@Composable
private fun OuterText(
    textContent: (@Composable () -> Unit)?,
    textPlacement: NavigationBarTextPlacement,
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
) {
    if (textContent != null && textPlacement == NavigationBarTextPlacement.Bottom) {
        Box(
            modifier = Modifier.padding(top = style.dimensions.textBlockTopMargin),
        ) {
            TextContent(
                textContent = textContent,
                textStyle = style.textStyle,
                textColor = style.colors.textColor,
                interactionSource = interactionSource,
            )
        }
    }
}

private fun startContent(
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
    actionStart: (@Composable () -> Unit)?,
    actionEnd: (@Composable () -> Unit)?,
    textAlign: NavigationBarTextAlign,
): (@Composable RowScope.() -> Unit)? {
    val hasActions = actionStart != null || actionEnd != null
    return if (style.backIcon != null || (textAlign != NavigationBarTextAlign.Start && hasActions)) {
        @Composable {
            style.backIcon?.let {
                val backIconColor =
                    style.colors.backIconColor.colorForInteraction(interactionSource)
                Icon(
                    modifier = Modifier.padding(end = style.dimensions.backIconMargin),
                    painter = painterResource(it),
                    contentDescription = "",
                    tint = backIconColor,
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(style.dimensions.horizontalSpacing),
            ) {
                if (actionStart != null && textAlign != NavigationBarTextAlign.Start) {
                    Action(actionStart, style.colors.actionStartColor, interactionSource)
                }
                if (actionEnd != null && textAlign == NavigationBarTextAlign.End) {
                    Action(actionEnd, style.colors.actionEndColor, interactionSource)
                }
            }
        }
    } else {
        null
    }
}

private fun endContent(
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
    actionStart: (@Composable () -> Unit)?,
    actionEnd: (@Composable () -> Unit)?,
    textAlign: NavigationBarTextAlign,
): (@Composable RowScope.() -> Unit)? {
    val hasActions = actionStart != null || actionEnd != null
    return if (hasActions && textAlign != NavigationBarTextAlign.End) {
        {
            Row(
                horizontalArrangement = Arrangement.spacedBy(style.dimensions.horizontalSpacing),
            ) {
                if (actionStart != null && textAlign == NavigationBarTextAlign.Start) {
                    Action(actionStart, style.colors.actionStartColor, interactionSource)
                }
                if (actionEnd != null && textAlign != NavigationBarTextAlign.End) {
                    Action(actionEnd, style.colors.actionEndColor, interactionSource)
                }
            }
        }
    } else {
        null
    }
}

@Composable
private fun Action(
    actionContent: (@Composable () -> Unit),
    tint: InteractiveColor,
    interactionSource: InteractionSource,
) {
    val iconColor = tint.colorForInteraction(interactionSource)
    CompositionLocalProvider(LocalTint provides iconColor) {
        actionContent.invoke()
    }
}

@Composable
private fun TextContent(
    textContent: @Composable () -> Unit,
    textStyle: TextStyle,
    textColor: InteractiveColor,
    interactionSource: InteractionSource,
) {
    val color = textColor.colorForInteraction(interactionSource)
    CompositionLocalProvider(
        LocalTint provides color,
        LocalTextStyle provides textStyle.copy(color),
    ) {
        textContent.invoke()
    }
}

private fun centerContent(
    style: NavigationBarStyle,
    content: (@Composable () -> Unit)?,
    textContent: (@Composable () -> Unit)?,
    contentPlacement: NavigationBarContentPlacement,
    textPlacement: NavigationBarTextPlacement,
    textAlign: NavigationBarTextAlign,
    interactionSource: InteractionSource,
): @Composable ColumnScope.() -> Unit {
    val hasInlineContent =
        content != null && contentPlacement == NavigationBarContentPlacement.Inline
    val hasInlineText =
        textContent != null && textPlacement == NavigationBarTextPlacement.Inline
    return {
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .align(getCenterContentAlignment(hasInlineText, hasInlineContent, textAlign)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(style.dimensions.horizontalSpacing),
            ) {
                val textColor = style.colors.textColor.colorForInteraction(interactionSource)
                CompositionLocalProvider(
                    LocalTint provides textColor,
                    LocalTextStyle provides style.textStyle.copy(color = textColor),
                ) {
                    if (hasInlineText) {
                        textContent?.invoke()
                    }
                    if (hasInlineContent) {
                        content?.invoke()
                    }
                }
            }
        }
    }
}

private fun getCenterContentAlignment(
    hasInlineText: Boolean,
    hasInlineContent: Boolean,
    textAlign: NavigationBarTextAlign,
): Alignment {
    return if (hasInlineText && hasInlineContent) {
        Alignment.CenterStart
    } else {
        when (textAlign) {
            NavigationBarTextAlign.Start -> Alignment.CenterStart
            NavigationBarTextAlign.Center -> Alignment.Center
            NavigationBarTextAlign.End -> Alignment.CenterEnd
        }
    }
}
