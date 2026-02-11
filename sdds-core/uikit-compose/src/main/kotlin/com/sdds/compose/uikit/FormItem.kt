package com.sdds.compose.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isSpecified
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero

/**
 * Компонент предназначенный для группировки нескольких [FormItem] в вертикальной ориентации.
 *
 * @param modifier модификатор
 * @param formItemStyle стиль по умолчанию для [FormItem]
 * @param verticalArrangement расположение контента по вертикали
 * @param horizontalAlignment выравнивание контента по горизонтали
 * @param content контент, в котором ожидаются [FormItem]
 */
@Composable
@NonRestartableComposable
fun FormVertical(
    modifier: Modifier = Modifier,
    formItemStyle: FormItemStyle = LocalFormItemStyle.current,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(DEFAULT_FORM_SPACING.dp),
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier,
        content = {
            CompositionLocalProvider(LocalFormItemStyle provides formItemStyle) {
                content()
            }
        },
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
    )
}

/**
 * Компонент предназначенный для группировки нескольких [FormItem] в горизонтальной ориентации.
 *
 * @param modifier модификатор
 * @param formItemStyle стиль по умолчанию для [FormItem]
 * @param horizontalArrangement расположение контента по горизонтали
 * @param verticalAlignment выравнивание контента по вертикали
 * @param content контент, в котором ожидаются [FormItem]
 */
@Composable
@NonRestartableComposable
fun FormHorizontal(
    modifier: Modifier = Modifier,
    formItemStyle: FormItemStyle = LocalFormItemStyle.current,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(DEFAULT_FORM_SPACING.dp),
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    content: @Composable RowScope.() -> Unit,
) {
    Row(
        modifier = modifier,
        content = {
            CompositionLocalProvider(LocalFormItemStyle provides formItemStyle) {
                content()
            }
        },
        verticalAlignment = verticalAlignment,
        horizontalArrangement = horizontalArrangement,
    )
}

/**
 * Компонент-оболочка с набором вариаций и элементами управления формой.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param title контент заголовка
 * @param optional контент текста для опциональной формы [FormType.Optional]
 * @param titleCaption контент дополнительного заголовока
 * @param caption контент надписи
 * @param counter контент счетчика
 * @param bottomTextAlignment режим выравнивания нижнего текста ([caption] и [counter]) [FormBottomTextAlignment]
 * @param hasHint включает кнопку подсказки
 * @param onHintPressed обработчик нажатий на кнопку подсказки
 * @param hintTriggerInfo информация о расположении кнопки подсказки
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий [InteractionSource]
 */
@Composable
fun FormItem(
    modifier: Modifier = Modifier,
    style: FormItemStyle = LocalFormItemStyle.current,
    title: (@Composable () -> Unit)? = null,
    optional: (@Composable () -> Unit)? = null,
    titleCaption: (@Composable () -> Unit)? = null,
    caption: (@Composable () -> Unit)? = null,
    counter: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit,
    bottomTextAlignment: FormBottomTextAlignment = style.bottomTextAlignment,
    hasHint: Boolean = false,
    onHintPressed: (() -> Unit)? = null,
    hintTriggerInfo: MutableState<TriggerInfo> = remember { mutableStateOf(TriggerInfo()) },
    enabled: Boolean = true,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    val hint = getHint(hasHint, style, hintTriggerInfo, enabled, onHintPressed)
    val startTitle = getStartTitle(style, title, hint, optional, interactionSource)
    val endTitle = getEndTitle(style, hint, interactionSource)
    val topTitle = getTopTitle(style, title, hint, optional, interactionSource)
    val titleCaption = getTitleCaption(style, titleCaption, interactionSource)
    val counter = getCounter(style, counter, interactionSource)
    val caption = getCaption(style, caption, interactionSource)
    val content = getContent(style, content)

    FormItemLayout(
        modifier = modifier
            .enable(enabled = enabled, disabledAlpha = style.disableAlpha),
        startTitle = startTitle,
        endTitle = endTitle,
        topTitle = topTitle,
        titleCaption = titleCaption,
        caption = caption,
        counter = counter,
        content = content,
        bottomTextAlignment = bottomTextAlignment,
    )
}

/**
 * Расположение Title в форме [FormItem]
 */
enum class FormTitlePlacement {
    /**
     * Title расположен в начале перед формой
     */
    Start,

    /**
     * Title расположен над формой
     */
    Top,

    /**
     * Без Title
     */
    None,
}

/**
 * Режим выранивания нижнего текста формы [FormItem] (caption / counter)
 */
enum class FormBottomTextAlignment {
    /**
     * Caption и Counter центрированы по горизонтали относительно формы,
     * расположены друг под другом
     */
    Center,

    /**
     * Caption расположен в начале, Counter расположен в конце
     */
    Edge,
}

/**
 * Выравнивание индикатора формы [FormItem]
 */
enum class FormIndicatorAlignment(internal val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopCenter(Alignment.TopCenter),
    TopEnd(Alignment.TopEnd),
    CenterStart(Alignment.CenterStart),
    Center(Alignment.Center),
    CenterEnd(Alignment.CenterEnd),
    BottomStart(Alignment.BottomStart),
    BottomCenter(Alignment.BottomCenter),
    BottomEnd(Alignment.BottomEnd),
}

/**
 * Тип формы [FormItem]
 */
enum class FormType {

    /**
     * Опциональный тип формы.
     * Когда форма имеет данный тип, к title добавляется optional.
     */
    Optional,

    /**
     * Обязательный тип формы c индикатором
     */
    Required,
}

private fun getHint(
    hasHint: Boolean,
    style: FormItemStyle,
    hintTriggerInfo: MutableState<TriggerInfo>,
    enabled: Boolean,
    onHintPressed: (() -> Unit)?,
): (@Composable () -> Unit)? {
    val hintIcon = style.hintIcon
    return if (hasHint && hintIcon != null) {
        {
            Icon(
                painter = painterResource(hintIcon),
                contentDescription = "Hint",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(style.dimensions.hintWidth)
                    .height(style.dimensions.hintHeight)
                    .popoverTrigger(hintTriggerInfo)
                    .clickable(
                        enabled = enabled,
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() },
                    ) { onHintPressed?.invoke() },
            )
        }
    } else {
        null
    }
}

private fun getStartTitle(
    style: FormItemStyle,
    title: (@Composable () -> Unit)?,
    hint: (@Composable () -> Unit)?,
    optional: (@Composable () -> Unit)?,
    interactionSource: InteractionSource,
): (@Composable () -> Unit)? {
    return if (style.titlePlacement == FormTitlePlacement.Start && (title != null || hint != null)) {
        {
            TitleHintOptional(
                modifier = Modifier.padding(end = style.dimensions.titleBlockPadding),
                style = style,
                title = title,
                hint = hint,
                optional = optional,
                interactionSource = interactionSource,
            )
        }
    } else {
        null
    }
}

private fun getEndTitle(
    style: FormItemStyle,
    hint: (@Composable () -> Unit)?,
    interactionSource: InteractionSource,
): (@Composable () -> Unit)? {
    return if (style.titlePlacement == FormTitlePlacement.None && hint != null) {
        {
            TitleHintOptional(
                modifier = Modifier.padding(start = style.dimensions.titleBlockPadding),
                style = style,
                hint = hint,
                interactionSource = interactionSource,
            )
        }
    } else {
        null
    }
}

private fun getTopTitle(
    style: FormItemStyle,
    title: (@Composable () -> Unit)?,
    hint: (@Composable () -> Unit)?,
    optional: (@Composable () -> Unit)?,
    interactionSource: InteractionSource,
): (@Composable () -> Unit)? {
    return if (style.titlePlacement == FormTitlePlacement.Top && (title != null || hint != null)) {
        {
            TitleHintOptional(
                modifier = Modifier.padding(bottom = style.dimensions.titleBlockPadding),
                style = style,
                title = title,
                hint = hint,
                optional = optional,
                interactionSource = interactionSource,
            )
        }
    } else {
        null
    }
}

private fun getTitleCaption(
    style: FormItemStyle,
    titleCaption: (@Composable () -> Unit)?,
    interactionSource: InteractionSource,
): (@Composable () -> Unit)? {
    return if (titleCaption != null) {
        {
            Box(
                modifier = Modifier.padding(bottom = style.dimensions.titleCaptionPadding),
            ) {
                val titleCaptionColor =
                    style.colors.titleCaptionColor.colorForInteractionAsState(interactionSource)
                ProvideTextStyle(
                    style.titleCaptionStyle,
                    color = { titleCaptionColor.value },
                    titleCaption,
                )
            }
        }
    } else {
        null
    }
}

private fun getCounter(
    style: FormItemStyle,
    counter: (@Composable () -> Unit)?,
    interactionSource: InteractionSource,
): (@Composable () -> Unit)? {
    return if (counter != null) {
        {
            Box(
                modifier = Modifier.padding(top = style.dimensions.counterPadding),
            ) {
                val counterColor =
                    style.colors.counterColor.colorForInteractionAsState(interactionSource)
                ProvideTextStyle(
                    style.counterStyle,
                    color = { counterColor.value },
                    counter,
                )
            }
        }
    } else {
        null
    }
}

private fun getCaption(
    style: FormItemStyle,
    caption: (@Composable () -> Unit)?,
    interactionSource: InteractionSource,
): (@Composable () -> Unit)? {
    return if (caption != null) {
        {
            Box(
                modifier = Modifier.padding(top = style.dimensions.captionPadding),
            ) {
                val captionColor =
                    style.colors.captionColor.colorForInteraction(interactionSource)
                CompositionLocalProvider(
                    LocalTint provides captionColor,
                ) {
                    ProvideTextStyle(
                        style.captionStyle,
                        color = { captionColor },
                        caption,
                    )
                }
            }
        }
    } else {
        null
    }
}

private fun getContent(
    style: FormItemStyle,
    content: (@Composable () -> Unit),
): (@Composable () -> Unit) {
    return {
        val shouldShowIndicator = style.formItemType == FormType.Required &&
            style.titlePlacement == FormTitlePlacement.None
        val indicatorModifier = if (shouldShowIndicator) {
            Modifier.indicator(
                style = style.indicatorStyle,
                alignment = style.indicatorAlignment.alignment,
                horizontalPadding = style.dimensions.indicatorOffsetX,
                verticalPadding = style.dimensions.indicatorOffsetY,
                horizontalMode = style.indicatorAlignmentMode,
                verticalMode = IndicatorMode.Inner,
            )
        } else {
            Modifier
        }
        Box(modifier = indicatorModifier) {
            content()
        }
    }
}

@Composable
private fun FormItemLayout(
    modifier: Modifier = Modifier,
    startTitle: (@Composable () -> Unit)?,
    endTitle: (@Composable () -> Unit)?,
    topTitle: (@Composable () -> Unit)?,
    titleCaption: (@Composable () -> Unit)?,
    caption: (@Composable () -> Unit)?,
    counter: (@Composable () -> Unit)?,
    content: @Composable () -> Unit,
    bottomTextAlignment: FormBottomTextAlignment,
) {
    Layout(
        modifier = modifier,
        content = {
            LayoutItem(startTitle, START_TITLE_ID)
            LayoutItem(endTitle, END_TITLE_ID)
            LayoutItem(topTitle, TOP_TITLE_ID)
            LayoutItem(titleCaption, TITLE_CAPTION_ID)
            LayoutItem(caption, CAPTION_ID)
            LayoutItem(counter, COUNTER_ID)
            LayoutItem(content, CONTENT_ID)
        },
        measurePolicy = remember(bottomTextAlignment) {
            FormItemMeasurePolicy(bottomTextAlignment)
        },
    )
}

@Composable
private fun LayoutItem(content: (@Composable () -> Unit)?, id: String) {
    content?.let {
        Box(
            modifier = Modifier.layoutId(id),
        ) {
            content()
        }
    }
}

private class FormItemMeasurePolicy(
    private val bottomTextAlignment: FormBottomTextAlignment,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        fun measureItem(id: String, cns: Constraints = looseConstraints): Placeable? =
            measurables.firstOrNull { it.layoutId == id }?.measure(cns)

        val topTitlePlaceable = measureItem(TOP_TITLE_ID)
        val startTitlePlaceable = measureItem(START_TITLE_ID)
        val endTitlePlaceable = measureItem(END_TITLE_ID)
        val contentPlaceable = measureItem(
            id = CONTENT_ID,
            cns = looseConstraints
                .offset(-startTitlePlaceable.widthOrZero() - endTitlePlaceable.widthOrZero()),
        )
        val titleCaptionPlaceable = measureItem(TITLE_CAPTION_ID)
        val captionPlaceable = measureItem(CAPTION_ID)
        val counterPlaceable = measureItem(COUNTER_ID)

        val topContentWidth = titleCaptionPlaceable.widthOrZero() + topTitlePlaceable.widthOrZero()
        val bottomContentWidth = calculateBottomContentWidth(captionPlaceable, counterPlaceable)
        val centerBlockWidth = maxOf(topContentWidth, contentPlaceable.widthOrZero(), bottomContentWidth)
        val desiredWidth = calculateDesiredWidth(
            startTitlePlaceable = startTitlePlaceable,
            endTitlePlaceable = endTitlePlaceable,
            centerBlockWidth = centerBlockWidth,
        )

        val topContentHeight = maxOf(titleCaptionPlaceable.heightOrZero(), topTitlePlaceable.heightOrZero())
        val bottomContentHeight = calculateBottomContentHeight(captionPlaceable, counterPlaceable)
        val desiredHeight = maxOf(
            contentPlaceable.heightOrZero() + topContentHeight + bottomContentHeight,
            startTitlePlaceable.heightOrZero(),
            endTitlePlaceable.heightOrZero(),
        )

        val constrainedWidth = constraints.constrainWidth(desiredWidth)
        val constrainedHeight = constraints.constrainHeight(desiredHeight)

        return layout(constrainedWidth, constrainedHeight) {
            startTitlePlaceable?.placeRelative(0, topContentHeight)
            topTitlePlaceable?.placeRelative(
                startTitlePlaceable.widthOrZero(),
                topContentHeight - topTitlePlaceable.heightOrZero(),
            )
            titleCaptionPlaceable?.placeRelative(
                constrainedWidth - titleCaptionPlaceable.widthOrZero() - endTitlePlaceable.widthOrZero(),
                topContentHeight - titleCaptionPlaceable.heightOrZero(),
            )
            contentPlaceable?.placeRelative(startTitlePlaceable.widthOrZero(), topContentHeight)
            endTitlePlaceable?.placeRelative(
                startTitlePlaceable.widthOrZero() + centerBlockWidth,
                topContentHeight,
            )
            placeBottomText(
                captionPlaceable = captionPlaceable,
                startTitlePlaceable = startTitlePlaceable,
                endTitlePlaceable = endTitlePlaceable,
                contentPlaceable = contentPlaceable,
                counterPlaceable = counterPlaceable,
                constrainedWidth = constrainedWidth,
                topContentHeight = topContentHeight,
            )
        }
    }

    private fun Placeable.PlacementScope.placeBottomText(
        captionPlaceable: Placeable?,
        startTitlePlaceable: Placeable?,
        endTitlePlaceable: Placeable?,
        contentPlaceable: Placeable?,
        counterPlaceable: Placeable?,
        constrainedWidth: Int,
        topContentHeight: Int,
    ) {
        when (bottomTextAlignment) {
            FormBottomTextAlignment.Center -> {
                captionPlaceable?.placeRelative(
                    (
                        startTitlePlaceable.widthOrZero() + constrainedWidth -
                            captionPlaceable.widthOrZero() - endTitlePlaceable.widthOrZero()
                        ) / 2,
                    topContentHeight + contentPlaceable.heightOrZero(),
                )
                counterPlaceable?.placeRelative(
                    (
                        startTitlePlaceable.widthOrZero() + constrainedWidth -
                            counterPlaceable.widthOrZero() - endTitlePlaceable.widthOrZero()
                        ) / 2,
                    topContentHeight + contentPlaceable.heightOrZero() + captionPlaceable.heightOrZero(),
                )
            }

            FormBottomTextAlignment.Edge -> {
                captionPlaceable?.placeRelative(
                    startTitlePlaceable.widthOrZero(),
                    topContentHeight + contentPlaceable.heightOrZero(),
                )
                counterPlaceable?.placeRelative(
                    constrainedWidth - counterPlaceable.widthOrZero() - endTitlePlaceable.widthOrZero(),
                    topContentHeight + contentPlaceable.heightOrZero(),
                )
            }
        }
    }

    private fun calculateBottomContentWidth(
        captionPlaceable: Placeable?,
        counterPlaceable: Placeable?,
    ) = when (bottomTextAlignment) {
        FormBottomTextAlignment.Center -> maxOf(
            captionPlaceable.widthOrZero(),
            counterPlaceable.widthOrZero(),
        )

        FormBottomTextAlignment.Edge -> captionPlaceable.widthOrZero() + counterPlaceable.widthOrZero()
    }

    private fun calculateDesiredWidth(
        startTitlePlaceable: Placeable?,
        endTitlePlaceable: Placeable?,
        centerBlockWidth: Int,
    ) = startTitlePlaceable.widthOrZero() +
        endTitlePlaceable.widthOrZero() +
        centerBlockWidth

    private fun calculateBottomContentHeight(
        captionPlaceable: Placeable?,
        counterPlaceable: Placeable?,
    ) = when (bottomTextAlignment) {
        FormBottomTextAlignment.Center -> captionPlaceable.heightOrZero() + counterPlaceable.heightOrZero()
        FormBottomTextAlignment.Edge -> maxOf(
            captionPlaceable.heightOrZero(),
            counterPlaceable.heightOrZero(),
        )
    }
}

@Composable
private fun TitleHintOptional(
    modifier: Modifier = Modifier,
    style: FormItemStyle,
    title: (@Composable () -> Unit)? = null,
    hint: (@Composable () -> Unit)?,
    optional: (@Composable () -> Unit)? = null,
    interactionSource: InteractionSource,
) {
    val titlePlacement = style.titlePlacement
    val formItemType = style.formItemType
    val shouldShowIndicator = titlePlacement != FormTitlePlacement.None &&
        formItemType == FormType.Required
    val indicatorModifier = if (shouldShowIndicator) {
        Modifier.indicator(
            style = style.indicatorStyle,
            alignment = style.indicatorAlignment.alignment,
            horizontalPadding = style.dimensions.indicatorOffsetX,
            verticalPadding = style.dimensions.indicatorOffsetY,
            horizontalMode = style.indicatorAlignmentMode,
            verticalMode = IndicatorMode.Inner,
        )
    } else {
        Modifier
    }

    val widthModifier = if (style.dimensions.titleBlockWidth.isSpecified) {
        Modifier.width(style.dimensions.titleBlockWidth)
    } else {
        Modifier
    }

    Box(modifier.then(widthModifier)) {
        Row(
            modifier = indicatorModifier,
            horizontalArrangement = Arrangement.spacedBy(style.dimensions.titleBlockSpacing),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            title?.let {
                val titleColor = style.colors.titleColor.colorForInteractionAsState(interactionSource)
                ProvideTextStyle(
                    value = style.titleStyle,
                    color = { titleColor.value },
                    content = title,
                )
            }
            hint?.let {
                val hintColor = style.colors.hintColor.colorForInteraction(interactionSource)
                CompositionLocalProvider(LocalTint provides hintColor, hint)
            }
            if (optional != null && formItemType == FormType.Optional) {
                val optionalColor =
                    style.colors.optionalColor.colorForInteractionAsState(interactionSource)
                ProvideTextStyle(
                    value = style.titleStyle,
                    color = { optionalColor.value },
                    content = optional,
                )
            }
        }
    }
}

private const val TOP_TITLE_ID = "TopTitle"
private const val START_TITLE_ID = "StartTitle"
private const val END_TITLE_ID = "EndTitle"
private const val TITLE_CAPTION_ID = "TitleCaption"
private const val CAPTION_ID = "Caption"
private const val COUNTER_ID = "Counter"
private const val CONTENT_ID = "Content"
private const val DEFAULT_FORM_SPACING = 4
