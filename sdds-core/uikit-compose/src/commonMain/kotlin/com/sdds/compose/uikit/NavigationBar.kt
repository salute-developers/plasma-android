package com.sdds.compose.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiName
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.setExclusiveEnum
import com.sdds.compose.uikit.internal.navigationbar.NavigationBarLayout
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.asMutableInteractionSource
import com.sdds.compose.uikit.motion.components.navigationbar.NavigationBarMotionStyle
import com.sdds.compose.uikit.motion.components.navigationbar.rememberNavigationBarMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.rememberStateSnapshot
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
 * @param onBackPressed обработчик кнопки назад
 * @param centerAlignmentStrategy режим центрирования текстового блока
 */
@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    style: NavigationBarStyle = LocalNavigationBarStyle.current,
    textPlacement: NavigationBarTextPlacement = NavigationBarTextPlacement.Bottom,
    textAlign: NavigationBarTextAlign = NavigationBarTextAlign.Center,
    contentPlacement: NavigationBarContentPlacement = NavigationBarContentPlacement.Bottom,
    actionStart: (@Composable RowScope.() -> Unit)? = null,
    actionEnd: (@Composable RowScope.() -> Unit)? = null,
    titleContent: (@Composable () -> Unit)? = null,
    descriptionContent: (@Composable () -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    onBackPressed: () -> Unit = {},
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    motion: Motion<NavigationBarMotionStyle> = rememberNavigationBarMotion(
        motionContext = rememberMotionContext(
            semanticStateSource = remember(textPlacement) {
                MutableSemanticStateSource().apply { setExclusiveEnum(textPlacement) }
            },
            interactionSource = interactionSource.asMutableInteractionSource(),
        ),
    ),
) {
    val columnSpacer by style.dimensions.descriptionPadding.getValueAsState(motion.context)
    val textContent: @Composable () -> Unit = {
        Column(
            verticalArrangement = Arrangement.spacedBy(columnSpacer),
            horizontalAlignment = textAlign.toAlignment(),
        ) {
            titleContent?.let {
                val titleColor =
                    style.colors.titleBrush.getBrushAsState(motion.context, motion.style.titleColor)
                val titleStyle by style.titleStyle
                    .getTextStyleAsState(motion.context, motion.style.titleStyle)
                ProvideTextStyle(
                    titleStyle
                        .copy(textAlign = textAlign.toPlatformTextAlign()),
                    brush = { titleColor.value },
                    it,
                )
            }
            descriptionContent?.let {
                val descriptionColor = style.colors.descriptionBrush.getBrushAsState(
                    motion.context,
                    motion.style.descriptionColor,
                )
                val descriptionStyle by style.descriptionStyle
                    .getTextStyleAsState(motion.context, motion.style.descriptionStyle)
                ProvideTextStyle(
                    descriptionStyle
                        .copy(textAlign = textAlign.toPlatformTextAlign()),
                    brush = { descriptionColor.value },
                    it,
                )
            }
        }
    }

    val startActions: (@Composable () -> Unit)? = if (actionStart != null) {
        @Composable { ActionRowWrapper(actionStart, style.dimensions.horizontalSpacingValues, motion) }
    } else {
        null
    }

    val endActions: (@Composable () -> Unit)? = if (actionEnd != null) {
        @Composable { ActionRowWrapper(actionEnd, style.dimensions.horizontalSpacingValues, motion) }
    } else {
        null
    }

    NavigationBar(
        modifier = modifier,
        style = style,
        textPlacement = textPlacement,
        textAlign = textAlign,
        contentPlacement = contentPlacement,
        actionStart = startActions,
        actionEnd = endActions,
        textContent = textContent,
        content = content,
        interactionSource = interactionSource,
        centerAlignmentStrategy = centerAlignmentStrategy,
        onBackPressed = onBackPressed,
        motion = motion,
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
 * @param onBackPressed обработчик кнопки назад
 * @param centerAlignmentStrategy режим центрирования текстового блока
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
    onBackPressed: () -> Unit = {},
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    motion: Motion<NavigationBarMotionStyle> = rememberNavigationBarMotion(
        motionContext = rememberMotionContext(
            semanticStateSource = remember(textPlacement) {
                MutableSemanticStateSource().apply { setExclusiveEnum(textPlacement) }
            },
            interactionSource = interactionSource.asMutableInteractionSource(),
        ),
    ),
) {
    SideEffect {
        motion.context.semanticStateSource.setExclusiveEnum(textPlacement)
    }
    val shape by style.bottomShapes.getValueAsState(motion.context)
    val spacing by style.dimensions.horizontalSpacingValues.getValueAsState(motion.context)
    val background =
        style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    Column(
        modifier = modifier
            .shadow(style.shadow)
            .clip(rememberNavBarShape(shape))
            .backgroundBrush({ background.value }),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val hasBottomText =
                textPlacement == NavigationBarTextPlacement.Bottom && textContent != null
            NavigationBarLayout(
                modifier = Modifier.fillMaxWidth(),
                startContent = startContent(
                    style = style,
                    motion = motion,
                    actionStart = actionStart,
                    onBackPressed = onBackPressed,
                ),
                centerContent = {
                    CenterContent(
                        style = style,
                        content = content,
                        textContent = textContent,
                        contentPlacement = contentPlacement,
                        textPlacement = textPlacement,
                        textAlign = textAlign,
                        motion = motion,
                        spacing = spacing,
                    )
                },
                endContent = endContent(
                    style = style,
                    motion = motion,
                    actionEnd = actionEnd,
                ),
                horizontalSpacing = spacing,
                centerAlignmentStrategy = centerAlignmentStrategy,
                textAlign = textAlign,
                minContentHeight = style.dimensions.minContentHeight.getValueAsState(motion.context).value,
                paddings = navbarPaddingValues(style.dimensions, motion, hasBottomText, forOuterText = false),
            )

            OuterText(
                textContent = textContent,
                textPlacement = textPlacement,
                style = style,
                motion = motion,
                textAlign = textAlign,
            )
        }

        OuterContent(content, contentPlacement)
    }
}

/**
 * Режим центрирования текстового блока
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
@ApiStateSet(components = ["NavigationBar"])
enum class NavigationBarTextPlacement : ValueState {
    /**
     * Внутри основного блока
     */
    @ApiName(name = "text-inlined")
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

internal fun NavigationBarTextAlign.toPlatformTextAlign(): TextAlign {
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
private fun ActionRowWrapper(
    actions: @Composable RowScope.() -> Unit,
    spacing: StatefulValue<Dp>,
    motion: Motion<NavigationBarMotionStyle>,
) {
    val spacing by spacing.getValueAsState(motion.context)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(spacing),
    ) {
        actions()
    }
}

@Composable
internal fun rememberNavBarShape(bottomShape: CornerBasedShape): RoundedCornerShape {
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
    motion: Motion<NavigationBarMotionStyle>,
    textAlign: NavigationBarTextAlign,
) {
    if (textContent != null && textPlacement == NavigationBarTextPlacement.Bottom) {
        val paddings = navbarPaddingValues(style.dimensions, motion, hasBottomText = false, forOuterText = true)
        Box(
            modifier = Modifier
                .align(textAlign.toAlignment())
                .padding(paddings),
        ) {
            val color = style.colors.textBrush.getBrushAsState(motion.context, motion.style.textColor)
            val textStyle by style.textStyles.getTextStyleAsState(motion.context, motion.style.textStyle)

            CompositionLocalProvider(
                LocalTintBrushProducer provides { color.value },
                LocalTextStyle provides textStyle.copy(
                    brush = color.value,
                    textAlign = textAlign.toPlatformTextAlign(),
                ),
            ) {
                textContent.invoke()
            }
        }
    }
}

private fun startContent(
    style: NavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionStart: (@Composable () -> Unit)?,
    onBackPressed: () -> Unit,
): (@Composable () -> Unit)? {
    return if (style.backIconSource != null || actionStart != null) {
        @Composable { StartContent(style, motion, actionStart, onBackPressed) }
    } else {
        null
    }
}

@Composable
private fun StartContent(
    style: NavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionStart: (@Composable () -> Unit)?,
    onBackPressed: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        style.backIconSource?.let {
            val iconInteraction = remember { MutableInteractionSource() }
            val iconMotionContext = rememberMotionContext(
                semanticStateSource = motion.context.semanticStateSource,
                interactionSource = iconInteraction,
            )
            val backIconColor =
                style.colors.backIconBrush.getBrushAsState(iconMotionContext, motion.style.backIconColor)
            val padding by style.dimensions.backIconMarginValues.getValueAsState(motion.context)
            Icon(
                modifier = Modifier
                    .padding(end = padding)
                    .clickable(
                        interactionSource = iconInteraction,
                        indication = LocalIndication.current,
                        onClick = onBackPressed,
                    ),
                source = it,
                contentDescription = "",
                brush = { backIconColor.value },
            )
        }
        if (actionStart != null) {
            Actions(
                actionStart,
                style.colors.actionStartBrush,
                motion.context,
                motion.style.actionStartColor,
                style.actionButtonStyle,
            )
        }
    }
}

private fun endContent(
    style: NavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionEnd: (@Composable () -> Unit)?,
): (@Composable () -> Unit)? {
    return if (actionEnd != null) {
        { EndContent(style, motion, actionEnd) }
    } else {
        null
    }
}

@Composable
private fun EndContent(
    style: NavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionEnd: (@Composable () -> Unit)?,
) {
    if (actionEnd != null) {
        Actions(
            actionEnd,
            style.colors.actionEndBrush,
            motion.context,
            motion.style.actionEndColor,
            style.actionButtonStyle,
        )
    }
}

@Composable
private fun Actions(
    actionContent: (@Composable () -> Unit),
    tint: StatefulValue<Brush>,
    motionContext: MotionContext,
    motionProperty: MotionProperty<Brush>,
    actionButtonStyle: ButtonStyle?,
) {
    val iconColor = tint.getBrushAsState(motionContext, motionProperty)
    if (actionButtonStyle != null) {
        CompositionLocalProvider(
            LocalTintBrushProducer provides { iconColor.value },
            LocalIconButtonStyle provides actionButtonStyle,
            content = actionContent,
        )
    } else {
        CompositionLocalProvider(
            LocalTintBrushProducer provides { iconColor.value },
            content = actionContent,
        )
    }
}

@Composable
private fun CenterContent(
    style: NavigationBarStyle,
    content: (@Composable () -> Unit)?,
    textContent: (@Composable () -> Unit)?,
    spacing: Dp,
    contentPlacement: NavigationBarContentPlacement,
    textPlacement: NavigationBarTextPlacement,
    textAlign: NavigationBarTextAlign,
    motion: Motion<NavigationBarMotionStyle>,
) {
    val hasInlineContent =
        content != null && contentPlacement == NavigationBarContentPlacement.Inline
    val hasInlineText =
        textContent != null && textPlacement == NavigationBarTextPlacement.Inline
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(spacing),
    ) {
        val textColor = style.colors.textBrush.getBrushAsState(motion.context, motion.style.textColor)
        val textStyle by style.textStyles.getTextStyleAsState(motion.context, motion.style.textStyle)
        CompositionLocalProvider(
            LocalTintBrushProducer provides { textColor.value },
            LocalTextStyle provides textStyle.copy(
                brush = textColor.value,
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

@Composable
private fun navbarPaddingValues(
    dimensions: NavigationBarDimensions,
    motion: Motion<NavigationBarMotionStyle>,
    hasBottomText: Boolean,
    forOuterText: Boolean,
): PaddingValues {
    val start = dimensions.paddingStartValues
    val top = if (forOuterText) dimensions.textBlockTopMarginValues else dimensions.paddingTopValues
    val end = dimensions.paddingEndValues
    val bottom = dimensions.paddingBottomValues
    val values = remember(start, top, end, bottom) { listOf(start, top, end, bottom) }
    val snapshot = motion.context.rememberStateSnapshot(values)
    val paddings = remember(snapshot, hasBottomText) {
        PaddingValues(
            start = start.getValue(snapshot.target),
            end = end.getValue(snapshot.target),
            top = top.getValue(snapshot.target),
            bottom = if (hasBottomText) 0.dp else bottom.getValue(snapshot.target),
        )
    }
    return paddings
}

internal fun getCenterContentAlignment(
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
