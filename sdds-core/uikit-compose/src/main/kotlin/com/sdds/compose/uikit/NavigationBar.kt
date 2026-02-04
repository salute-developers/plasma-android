package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.style.TextAlign
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.navigationbar.NavigationBarLayout
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
 * @param titleContent основной текст NavigationBar
 * @param descriptionContent дополнительный текст NavigationBar
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
    titleContent: (@Composable () -> Unit)?,
    descriptionContent: (@Composable () -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
) {
    val stateSet = remember(textPlacement) { setOf(textPlacement) }
    val textContent: @Composable () -> Unit = {
        Column(
            verticalArrangement = Arrangement.spacedBy(
                style.dimensions.descriptionPadding.getValue(stateSet),
            ),
            horizontalAlignment = textAlign.toAlignment(),
        ) {
            val titleColor = style.colors.titleColor.colorForInteractionAsState(interactionSource)
            val descriptionColor =
                style.colors.descriptionColor.colorForInteractionAsState(interactionSource)
            titleContent?.let {
                ProvideTextStyle(
                    style.titleStyle
                        .getValue(stateSet)
                        .copy(textAlign = textAlign.toPlatformTextAlign()),
                    color = { titleColor.value },
                    it,
                )
            }
            descriptionContent?.let {
                ProvideTextStyle(
                    style.descriptionStyle
                        .getValue(stateSet)
                        .copy(textAlign = textAlign.toPlatformTextAlign()),
                    color = { descriptionColor.value },
                    it,
                )
            }
        }
    }

    NavigationBar(
        modifier = modifier,
        style = style,
        textPlacement = textPlacement,
        textAlign = textAlign,
        contentPlacement = contentPlacement,
        actionStart = actionStart,
        actionEnd = actionEnd,
        textContent = textContent,
        content = content,
        interactionSource = interactionSource,
        centerAlignmentStrategy = centerAlignmentStrategy,
    )
}

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
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
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
            NavigationBarLayout(
                modifier = Modifier.fillMaxWidth(),
                startContent = startContent(
                    style = style,
                    interactionSource = interactionSource,
                    actionStart = actionStart,
                ),
                centerContent = {
                    CenterContent(
                        style = style,
                        content = content,
                        textContent = textContent,
                        contentPlacement = contentPlacement,
                        textPlacement = textPlacement,
                        textAlign = textAlign,
                        interactionSource = interactionSource,
                    )
                },
                endContent = endContent(
                    style = style,
                    interactionSource = interactionSource,
                    actionEnd = actionEnd,
                ),
                contentPadding = style.dimensions.horizontalSpacing,
                centerAlignmentStrategy = centerAlignmentStrategy,
                textAlign = textAlign,
            )

            OuterText(
                textContent = textContent,
                textPlacement = textPlacement,
                style = style,
                interactionSource = interactionSource,
                textAlign = textAlign,
            )
        }

        OuterContent(content, contentPlacement)
    }
}

/**
 * Режим центрирования текстового блока при [NavigationBarContentPlacement.Inline]
 */
enum class NavBarCenterAlignmentStrategy {
    /**
     * Текстовый блок располагается по центру компонента
     */
    Absolute,

    /**
     * Текстовый блок располагается по центру доступной области между экшенами
     */
    Relative,
}

/**
 * Расположение текста
 */
enum class NavigationBarTextPlacement : ValueState {
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

private fun NavigationBarTextAlign.toPlatformTextAlign(): TextAlign {
    return when (this) {
        NavigationBarTextAlign.Start -> TextAlign.Start
        NavigationBarTextAlign.Center -> TextAlign.Center
        NavigationBarTextAlign.End -> TextAlign.End
    }
}

private fun NavigationBarTextAlign.toAlignment(): Alignment.Horizontal {
    return when (this) {
        NavigationBarTextAlign.Start -> Alignment.Start
        NavigationBarTextAlign.Center -> Alignment.CenterHorizontally
        NavigationBarTextAlign.End -> Alignment.End
    }
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
private fun ColumnScope.OuterText(
    textContent: (@Composable () -> Unit)?,
    textPlacement: NavigationBarTextPlacement,
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
    textAlign: NavigationBarTextAlign,
) {
    if (textContent != null && textPlacement == NavigationBarTextPlacement.Bottom) {
        Box(
            modifier = Modifier
                .align(textAlign.toAlignment())
                .padding(top = style.dimensions.textBlockTopMargin),
        ) {
            TextContent(
                textContent = textContent,
                textStyle = style.textStyle,
                textColor = style.colors.textColor,
                interactionSource = interactionSource,
                textAlign = textAlign,
            )
        }
    }
}

private fun startContent(
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
    actionStart: (@Composable () -> Unit)?,
): (@Composable () -> Unit)? {
    return if (style.backIcon != null || actionStart != null) {
        @Composable { StartContent(style, interactionSource, actionStart) }
    } else {
        null
    }
}

@Composable
private fun StartContent(
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
    actionStart: (@Composable () -> Unit)?,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        style.backIcon?.let {
            val backIconColor =
                style.colors.backIconColor.colorForInteraction(interactionSource)
            val padding = style.dimensions.backIconMargin
            Icon(
                modifier = Modifier.padding(end = padding),
                painter = painterResource(it),
                contentDescription = "",
                tint = backIconColor,
            )
        }
        if (actionStart != null) {
            Action(
                actionStart,
                style.colors.actionStartColor,
                interactionSource,
                style.actionButtonStyle,
            )
        }
    }
}

private fun endContent(
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
    actionEnd: (@Composable () -> Unit)?,
): (@Composable () -> Unit)? {
    return if (actionEnd != null) {
        { EndContent(style, interactionSource, actionEnd) }
    } else {
        null
    }
}

@Composable
private fun EndContent(
    style: NavigationBarStyle,
    interactionSource: InteractionSource,
    actionEnd: (@Composable () -> Unit)?,
) {
    if (actionEnd != null) {
        Action(
            actionEnd,
            style.colors.actionEndColor,
            interactionSource,
            style.actionButtonStyle,
        )
    }
}

@Composable
private fun Action(
    actionContent: (@Composable () -> Unit),
    tint: InteractiveColor,
    interactionSource: InteractionSource,
    actionButtonStyle: ButtonStyle?,
) {
    val iconColor = tint.colorForInteraction(interactionSource)
    if (actionButtonStyle != null) {
        CompositionLocalProvider(
            LocalTint provides iconColor,
            LocalIconButtonStyle provides actionButtonStyle,
            content = actionContent,
        )
    } else {
        CompositionLocalProvider(
            LocalTint provides iconColor,
            content = actionContent,
        )
    }
}

@Composable
private fun TextContent(
    textContent: @Composable () -> Unit,
    textStyle: TextStyle,
    textColor: InteractiveColor,
    interactionSource: InteractionSource,
    textAlign: NavigationBarTextAlign,
) {
    val color = textColor.colorForInteraction(interactionSource)
    CompositionLocalProvider(
        LocalTint provides color,
        LocalTextStyle provides textStyle.copy(
            color = color,
            textAlign = textAlign.toPlatformTextAlign(),
        ),
    ) {
        textContent.invoke()
    }
}

@Composable
private fun CenterContent(
    style: NavigationBarStyle,
    content: (@Composable () -> Unit)?,
    textContent: (@Composable () -> Unit)?,
    contentPlacement: NavigationBarContentPlacement,
    textPlacement: NavigationBarTextPlacement,
    textAlign: NavigationBarTextAlign,
    interactionSource: InteractionSource,
) {
    val hasInlineContent =
        content != null && contentPlacement == NavigationBarContentPlacement.Inline
    val hasInlineText =
        textContent != null && textPlacement == NavigationBarTextPlacement.Inline
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
                LocalTextStyle provides style.textStyle.copy(
                    color = textColor,
                    textAlign = textAlign.toPlatformTextAlign(),
                ),
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
