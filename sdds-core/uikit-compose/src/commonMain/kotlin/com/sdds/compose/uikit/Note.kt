package com.sdds.compose.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.SemanticStateSource
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.note.NoteMotionStyle
import com.sdds.compose.uikit.motion.components.note.rememberNoteMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент [Note]
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param title заголовок
 * @param text текст
 * @param closeIconSource источник иконки закрытия
 * @param onClose колбэк клика на иконку закрытия [closeIconSource]
 * @param contentBefore контент перед текстовым блоком
 * @param interactionSource источник взаимодействий
 * @param action дополнительный контент для взаимодейстивия с компонентом
 */
@Composable
fun Note(
    modifier: Modifier = Modifier,
    style: NoteStyle = LocalNoteStyle.current,
    title: String = "",
    text: String = "",
    closeIconSource: ImageSource? = null,
    onClose: (() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    action: (@Composable BoxScope.() -> Unit)? = null,
) {
    Note(
        modifier = modifier,
        style = style,
        titleContent = { Text(title) },
        textContent = if (text.isNotBlank()) {
            { Text(text) }
        } else {
            null
        },
        closeIcon = (closeIconSource ?: style.closeIconSource)
            ?.let { source -> { CloseIcon(style, source, onClose) } },
        contentBefore = contentBefore,
        interactionSource = interactionSource,
        action = action,
    )
}

/**
 * Компонент [Note]
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param title заголовок
 * @param text текст
 * @param closeIconSource источник иконки закрытия
 * @param onClose колбэк клика на иконку закрытия [closeIconSource]
 * @param contentBefore контент перед текстовым блоком
 * @param contentAfter контент за текстовым блоком
 * @param interactionSource источник взаимодействий
 * @param action дополнительный контент для взаимодейстивия с компонентом
 */
@Composable
fun Note(
    modifier: Modifier = Modifier,
    style: NoteStyle = LocalNoteStyle.current,
    title: String = "",
    text: String = "",
    closeIconSource: ImageSource? = null,
    onClose: (() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    contentAfter: (@Composable BoxScope.() -> Unit)? = null,
    action: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    Note(
        modifier = modifier,
        style = style,
        titleContent = { Text(title) },
        textContent = if (text.isNotBlank()) {
            { Text(text) }
        } else {
            null
        },
        closeIcon = (closeIconSource ?: style.closeIconSource)
            ?.let { source -> { CloseIcon(style, source, onClose) } },
        contentBefore = contentBefore,
        contentAfter = contentAfter,
        interactionSource = interactionSource,
        action = action,
    )
}

/**
 * Компонент [Note]
 *
 * Нота оборачивает контент по умолчанию: текстовый блок зажат между [contentBefore] и
 * [contentAfter], который стоит сразу за текстом. Если ширину задать извне
 * (`modifier = Modifier.fillMaxWidth()`), нота растянется, а [contentAfter] прижмётся к её концу.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param titleContent заголовок
 * @param textContent текст
 * @param closeIcon иконка закрытия
 * @param contentBefore контент перед текстовым блоком
 * @param action дополнительный контент для взаимодейстивия с компонентом
 * @param interactionSource источник взаимодействий
 * @param semanticStateSource источник состояния семантики
 * @param contentAfter контент за текстовым блоком
 */
@Composable
fun Note(
    titleContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: NoteStyle = LocalNoteStyle.current,
    textContent: (@Composable () -> Unit)? = null,
    closeIcon: (@Composable BoxScope.() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    action: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    semanticStateSource: SemanticStateSource = remember { MutableSemanticStateSource() },
    contentAfter: (@Composable BoxScope.() -> Unit)? = null,
) {
    val fallbackSource = remember { MutableInteractionSource() }
    val fallbackSemantic = remember { MutableSemanticStateSource() }
    Note(
        motion = rememberNoteMotion(
            motionContext = rememberMotionContext(
                semanticStateSource = (semanticStateSource as? MutableSemanticStateSource)
                    ?: fallbackSemantic,
                interactionSource = (interactionSource as? MutableInteractionSource)
                    ?: fallbackSource,
            ),
        ),
        titleContent = titleContent,
        modifier = modifier,
        style = style,
        textContent = textContent,
        closeIcon = closeIcon,
        contentBefore = contentBefore,
        action = action,
        contentAfter = contentAfter,
    )
}

/**
 * Компонент [Note]
 *
 * Нота оборачивает контент по умолчанию: текстовый блок зажат между [contentBefore] и
 * [contentAfter], который стоит сразу за текстом. Если ширину задать извне
 * (`modifier = Modifier.fillMaxWidth()`), нота растянется, а [contentAfter] прижмётся к её концу.
 *
 * @param motion объект анимаций
 * @param modifier модификатор
 * @param style стиль компонента
 * @param titleContent заголовок
 * @param textContent текст
 * @param closeIcon иконка закрытия
 * @param contentBefore контент перед текстовым блоком
 * @param action дополнительный контент для взаимодейстивия с компонентом
 * @param contentAfter контент за текстовым блоком
 */
@Composable
fun Note(
    motion: Motion<NoteMotionStyle>,
    titleContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: NoteStyle = LocalNoteStyle.current,
    textContent: (@Composable () -> Unit)? = null,
    closeIcon: (@Composable BoxScope.() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    action: (@Composable BoxScope.() -> Unit)? = null,
    contentAfter: (@Composable BoxScope.() -> Unit)? = null,
) {
    val backgroundColor = style.colors.backgroundColor.getBrushAsState(motion.context, motion.style.backgroundColor)
    val contentBeforeArrangement = style.contentBeforeArrangement
    val top by style.dimensions.paddingTopValues.getValueAsState(motion.context)
    val bottom by style.dimensions.paddingBottomValues.getValueAsState(motion.context)
    val extraBottomPadding = (top - bottom).coerceAtLeast(0.dp)
    val spacerHeight = with(LocalDensity.current) { extraBottomPadding.roundToPx() }
    val measurePolicy = remember(contentBeforeArrangement, spacerHeight) {
        NoteMeasurePolicy(contentBeforeArrangement, spacerHeight)
    }
    Box(
        modifier = modifier
            .backgroundBrush(
                { backgroundColor.value },
                style.shapes.getValueAsState(motion.context).value,
            ),
        // Нота по умолчанию оборачивает контент и растягивается только тогда, когда ширину
        // требует родитель (например модификатором fillMaxWidth)
        propagateMinConstraints = true,
    ) {
        if (closeIcon != null) {
            val iconTopP by style.dimensions.closeTopMarginValues.getValueAsState(motion.context)
            val iconEndP by style.dimensions.closeEndMarginValues.getValueAsState(motion.context)
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    // Слот close — оверлей, он не должен наследовать родительские min-ограничения
                    .width(IntrinsicSize.Min)
                    .height(IntrinsicSize.Min)
                    .padding(top = iconTopP, end = iconEndP)
                    .defaultMinSize(),
            ) {
                val closeSize by style.dimensions.closeSizeValues.getValueAsState(motion.context)
                val closeBrush = style.colors.closeBrush.getBrushAsState(motion.context, motion.style.closeColor)
                CompositionLocalProvider(
                    LocalTintBrushProducer provides { closeBrush.value },
                    LocalIconDefaultSize provides DpSize(closeSize, closeSize),
                ) {
                    closeIcon()
                }
            }
        }
        val startP by style.dimensions.paddingStartValues.getValueAsState(motion.context)
        val endP by style.dimensions.paddingEndValues.getValueAsState(motion.context)
        Layout(
            modifier = Modifier
                .padding(
                    start = startP,
                    end = endP,
                    top = top,
                    bottom = bottom,
                )
                .clipToBounds(),
            measurePolicy = measurePolicy,
            content = {
                contentBefore?.let { content ->
                    ContentBefore(
                        modifier = Modifier.layoutId(CONTENT_BEFORE),
                        style = style,
                        motion = motion,
                        contentBefore = content,
                    )
                }
                Title(
                    modifier = Modifier.layoutId(TITLE),
                    style = style,
                    motion = motion,
                    titleContent = titleContent,
                )
                textContent?.let { content ->
                    ContentText(
                        modifier = Modifier.layoutId(TEXT),
                        style = style,
                        motion = motion,
                        textContent = content,
                    )
                }
                action?.let {
                    Action(
                        modifier = Modifier.layoutId(ACTION),
                        style = style,
                        motion = motion,
                        action = action,
                    )
                }
                contentAfter?.let { content ->
                    ContentAfter(
                        modifier = Modifier.layoutId(CONTENT_AFTER),
                        style = style,
                        motion = motion,
                        contentAfter = content,
                    )
                }
            },
        )
    }
}

/**
 * Расположение contentBefore в Note и NoteCompact
 */
enum class ContentBeforeVerticalArrangement {

    /**
     * Сверху
     */
    Top,

    /**
     * По центру
     */
    Center,

    /**
     * Снизу
     */
    Bottom,
}

@Composable
private fun BoxScope.CloseIcon(
    style: NoteStyle,
    closeIconSource: ImageSource,
    onClose: (() -> Unit)?,
) {
    val closeInteractionSource = remember { MutableInteractionSource() }
    val closeColor = style.colors.closeBrush.getValueAsState(closeInteractionSource)
    Icon(
        modifier = Modifier
            .align(Alignment.TopEnd)
            .clickable(
                interactionSource = closeInteractionSource,
                indication = LocalIndication.current,
            ) { onClose?.invoke() },
        source = closeIconSource,
        contentDescription = "",
        brush = { closeColor.value },
    )
}

private class NoteMeasurePolicy(
    private val arrangement: ContentBeforeVerticalArrangement,
    private val spacerHeight: Int,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val childConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        fun measurable(id: String): Measurable? = measurables.find { it.layoutId == id }
        // Инлайн-строка: contentBefore | текстовый блок | contentAfter
        var remaining = childConstraints
        val contentBefore = measurable(CONTENT_BEFORE)?.measure(remaining)
        remaining = remaining.offset(horizontal = -contentBefore.widthOrZero())
        val contentAfter = measurable(CONTENT_AFTER)?.measure(remaining)
        var textConstraints = remaining.offset(horizontal = -contentAfter.widthOrZero())

        val title = measurable(TITLE)?.measure(textConstraints)
        val titleHeight = title.heightOrZero()
        textConstraints = textConstraints.offset(vertical = -titleHeight)
        val text = measurable(TEXT)?.measure(textConstraints)
        val textHeight = text.heightOrZero()
        // Экшн идёт отдельной строкой под текстовым блоком, поэтому contentAfter его ширину не уменьшает
        remaining = remaining.offset(vertical = -(titleHeight + textHeight))
        val action = measurable(ACTION)?.measure(remaining)
        // Высота текста уже включает textTopMargin, так как паддинг задан внутри самого слота
        val textBlockHeight = titleHeight + textHeight
        val anchorHeight = if (titleHeight > 0) titleHeight else textHeight

        // Смещения слотов инлайн-строки относительно верха текстового блока.
        // Отрицательное смещение означает, что слот выпирает над текстовым блоком
        val contentBeforeHeight = contentBefore.heightOrZero()
        val contentBeforeOffset = when (arrangement) {
            ContentBeforeVerticalArrangement.Top -> (anchorHeight - contentBeforeHeight) / 2
            ContentBeforeVerticalArrangement.Center -> (textBlockHeight - contentBeforeHeight) / 2
            ContentBeforeVerticalArrangement.Bottom -> textBlockHeight - contentBeforeHeight
        }
        val contentAfterHeight = contentAfter.heightOrZero()
        val contentAfterOffset = (textBlockHeight - contentAfterHeight) / 2

        // Смещение отсутствующего слота (нулевая высота) в расчёт высоты не идёт
        fun topInsetOf(offset: Int, height: Int) = if (height == 0) 0 else offset
        // Строка сдвигается вниз так, чтобы ни один слот не вылезал за её начало
        val minOffset = minOf(
            0,
            topInsetOf(contentBeforeOffset, contentBeforeHeight),
            topInsetOf(contentAfterOffset, contentAfterHeight),
        )
        val topInset = -minOffset

        // Кто из слотов выпирает под низ текстового блока
        fun bottomInsetOf(offset: Int, height: Int) = if (height == 0) 0 else offset + height - textBlockHeight
        val rowBottomInset = maxOf(
            0,
            bottomInsetOf(contentBeforeOffset, contentBeforeHeight),
            bottomInsetOf(contentAfterOffset, contentAfterHeight),
        )
        // Под строкой становится экшн (его actionTopMargin учтён внутри слота),
        // а если экшна нет — компенсирующий паддинг
        val tailHeight = maxOf(spacerHeight, action.heightOrZero())

        val textBlockWidth = maxOf(title.widthOrZero(), text.widthOrZero())
        val layoutWidth = contentBefore.widthOrZero() +
            maxOf(action.widthOrZero(), textBlockWidth + contentAfter.widthOrZero())
        val finalWidth = constraints.constrainWidth(layoutWidth)
        val finalHeight = constraints.constrainHeight(topInset + textBlockHeight + rowBottomInset + tailHeight)

        return layout(finalWidth, finalHeight) {
            contentBefore?.placeRelative(x = 0, y = topInset + contentBeforeOffset)
            title?.placeRelative(x = contentBefore.widthOrZero(), y = topInset)
            text?.placeRelative(x = contentBefore.widthOrZero(), y = topInset + titleHeight)
            contentAfter?.placeRelative(
                x = finalWidth - contentAfter.widthOrZero(),
                y = topInset + contentAfterOffset,
            )
            action?.placeRelative(
                x = contentBefore.widthOrZero(),
                y = topInset + textBlockHeight + rowBottomInset,
            )
        }
    }
}

@Composable
private fun ContentBefore(
    modifier: Modifier,
    style: NoteStyle,
    motion: Motion<NoteMotionStyle>,
    contentBefore: @Composable BoxScope.() -> Unit,
) {
    val end by style.dimensions.contentBeforeEndMarginValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(
                end = end,
            ),
    ) {
        val iconColor =
            style.colors.iconBrush.getBrushAsState(motion.context, motion.style.contentBeforeColor)
        val iconSize by style.dimensions.iconSizeValues.getValueAsState(motion.context)
        val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
        CompositionLocalProvider(
            LocalTintBrushProducer provides { iconColor.value },
            LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
        ) {
            contentBefore()
        }
    }
}

@Composable
private fun Title(
    modifier: Modifier,
    style: NoteStyle,
    motion: Motion<NoteMotionStyle>,
    titleContent: @Composable () -> Unit,
) {
    val titleEndP by style.dimensions.titlePaddingEndValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(end = titleEndP),
    ) {
        ProvideTextBehaviour(behaviour = TextBehaviour(overflow = TextOverflow.Ellipsis)) {
            val textColor = style.colors.titleBrush.getBrushAsState(motion.context, motion.style.titleColor)
            val titleStyle by style.titleStyles.getTextStyleAsState(motion.context, motion.style.titleStyle)
            ProvideTextStyle(titleStyle, brush = { textColor.value }) {
                titleContent()
            }
        }
    }
}

@Composable
private fun ContentText(
    modifier: Modifier,
    style: NoteStyle,
    motion: Motion<NoteMotionStyle>,
    textContent: @Composable () -> Unit,
) {
    val textTop by style.dimensions.textTopMarginValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(top = textTop),
    ) {
        ProvideTextBehaviour(behaviour = TextBehaviour(overflow = TextOverflow.Ellipsis)) {
            val textColor =
                style.colors.textBrush.getBrushAsState(motion.context, motion.style.textColor)
            val textStyle by style.textStyles.getTextStyleAsState(
                motion.context,
                motion.style.textStyle,
            )
            ProvideTextStyle(textStyle, brush = { textColor.value }) {
                textContent()
            }
        }
    }
}

@Composable
private fun Action(
    modifier: Modifier,
    style: NoteStyle,
    motion: Motion<NoteMotionStyle>,
    action: @Composable BoxScope.() -> Unit,
) {
    val actionTop by style.dimensions.actionTopMarginValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(top = actionTop),
    ) {
        CompositionLocalProvider(
            LocalLinkButtonStyle provides style.linkButtonStyle,
        ) {
            action()
        }
    }
}

@Composable
private fun ContentAfter(
    modifier: Modifier,
    style: NoteStyle,
    motion: Motion<NoteMotionStyle>,
    contentAfter: @Composable BoxScope.() -> Unit,
) {
    val startM by style.dimensions.contentAfterStartMarginValues.getValueAsState(motion.context)
    val endM by style.dimensions.contentAfterEndMarginValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(
                start = startM,
                end = endM,
            ),
    ) {
        val iconSize by style.dimensions.disclosureSizeValues.getValueAsState(motion.context)
        val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
        val disclosureColor =
            style.colors.disclosureBrush.getBrushAsState(motion.context, motion.style.contentAfterColor)
        CompositionLocalProvider(
            LocalTintBrushProducer provides { disclosureColor.value },
            LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
        ) {
            contentAfter()
        }
    }
}

private const val CONTENT_BEFORE = "contentBefore"
private const val CONTENT_AFTER = "contentAfter"
private const val TITLE = "title"
private const val TEXT = "text"
private const val ACTION = "action"
