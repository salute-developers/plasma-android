package com.sdds.compose.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
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
import com.sdds.compose.uikit.interactions.getValue
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
 * Компонент [NoteCompact]
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
fun NoteCompact(
    modifier: Modifier = Modifier,
    style: NoteCompactStyle = LocalNoteCompactStyle.current,
    title: String = "",
    text: String = "",
    closeIconSource: ImageSource? = null,
    onClose: (() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    action: (@Composable BoxScope.() -> Unit)? = null,
) {
    NoteCompact(
        modifier = modifier,
        style = style,
        titleContent = { Text(title) },
        textContent = if (text.isNotBlank()) {
            { Text(text) }
        } else {
            null
        },
        closeIcon = (closeIconSource ?: style.closeIconSource)
            ?.let { source -> { CloseIcon(source, onClose, style) } },
        contentBefore = contentBefore,
        interactionSource = interactionSource,
        action = action,
    )
}

/**
 * Компонент [NoteCompact]
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
fun NoteCompact(
    modifier: Modifier = Modifier,
    style: NoteCompactStyle = LocalNoteCompactStyle.current,
    title: String = "",
    text: String = "",
    closeIconSource: ImageSource? = null,
    onClose: (() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    contentAfter: (@Composable BoxScope.() -> Unit)? = null,
    action: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    NoteCompact(
        modifier = modifier,
        style = style,
        titleContent = { Text(title) },
        textContent = if (text.isNotBlank()) {
            { Text(text) }
        } else {
            null
        },
        closeIcon = (closeIconSource ?: style.closeIconSource)
            ?.let { source -> { CloseIcon(source, onClose, style) } },
        contentBefore = contentBefore,
        contentAfter = contentAfter,
        interactionSource = interactionSource,
        action = action,
    )
}

/**
 * Компонент [NoteCompact]
 *
 * Нота оборачивает контент по умолчанию: текстовый блок зажат между [contentBefore] и слотами
 * [contentAfter], [action], [closeIcon], которые стоят сразу за текстом. Если ширину задать извне
 * (`modifier = Modifier.fillMaxWidth()`), нота растянется, а эти слоты прижмутся к её концу.
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
fun NoteCompact(
    titleContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: NoteCompactStyle = LocalNoteCompactStyle.current,
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
    NoteCompact(
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
 * Компонент [NoteCompact]
 *
 * Нота оборачивает контент по умолчанию: текстовый блок зажат между [contentBefore] и слотами
 * [contentAfter], [action], [closeIcon], которые стоят сразу за текстом. Если ширину задать извне
 * (`modifier = Modifier.fillMaxWidth()`), нота растянется, а эти слоты прижмутся к её концу.
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
fun NoteCompact(
    motion: Motion<NoteMotionStyle>,
    titleContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: NoteCompactStyle = LocalNoteCompactStyle.current,
    textContent: (@Composable () -> Unit)? = null,
    closeIcon: (@Composable BoxScope.() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    action: (@Composable BoxScope.() -> Unit)? = null,
    contentAfter: (@Composable BoxScope.() -> Unit)? = null,
) {
    val contentBeforeArrangement = style.contentBeforeArrangement
    val backgroundColor = style.colors.backgroundColor.getBrushAsState(motion.context, motion.style.backgroundColor)
    val topP by style.dimensions.paddingTopValues.getValueAsState(motion.context)
    val bottomP by style.dimensions.paddingBottomValues.getValueAsState(motion.context)
    val extraTopPadding = (bottomP - topP).coerceAtLeast(0.dp)
    val spacerHeight = with(LocalDensity.current) { extraTopPadding.roundToPx() }
    val measurePolicy = remember(contentBeforeArrangement, spacerHeight) {
        NoteCompactMeasurePolicy(contentBeforeArrangement, spacerHeight)
    }
    val startP by style.dimensions.paddingStartValues.getValueAsState(motion.context)
    val endP by style.dimensions.paddingEndValues.getValueAsState(motion.context)
    // Нота оборачивает контент и растягивается только тогда, когда ширину требует родитель
    // (например модификатором fillMaxWidth)
    Layout(
        modifier = modifier
            .backgroundBrush(
                { backgroundColor.value },
                style.shapes.getValueAsState(motion.context).value,
            )
            .padding(
                start = startP,
                end = endP,
                top = topP,
                bottom = bottomP,
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
            contentAfter?.let { content ->
                ContentAfter(
                    modifier = Modifier.layoutId(CONTENT_AFTER),
                    style = style,
                    motion = motion,
                    contentAfter = content,
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
            closeIcon?.let { content ->
                CustomCloseIcon(
                    modifier = Modifier.layoutId(CLOSE),
                    style = style,
                    motion = motion,
                    closeIcon = content,
                )
            }
        },
    )
}

@Composable
private fun BoxScope.CloseIcon(
    closeIconSource: ImageSource? = null,
    onClose: (() -> Unit)?,
    style: NoteCompactStyle,
) {
    if (closeIconSource == null) return
    val closeInteractionSource = remember { MutableInteractionSource() }
    val closeColor = style.colors.closeBrush.getValueAsState(closeInteractionSource)
    Icon(
        modifier = Modifier
            .clickable(
                interactionSource = closeInteractionSource,
                indication = LocalIndication.current,
            ) { onClose?.invoke() },
        source = closeIconSource,
        contentDescription = "",
        brush = { closeColor.value },
    )
}

@Suppress("LongMethod")
private class NoteCompactMeasurePolicy(
    private val arrangement: ContentBeforeVerticalArrangement,
    private val spacerHeight: Int,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val childConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        fun measurable(id: String): Measurable? = measurables.find { it.layoutId == id }

        // Боковые слоты измеряются до текстового блока и забирают у него ширину
        var remaining = childConstraints
        val contentBefore = measurable(CONTENT_BEFORE)?.measure(remaining)
        remaining = remaining.offset(horizontal = -contentBefore.widthOrZero())
        val contentAfter = measurable(CONTENT_AFTER)?.measure(remaining)
        remaining = remaining.offset(horizontal = -contentAfter.widthOrZero())
        val action = measurable(ACTION)?.measure(remaining)
        remaining = remaining.offset(horizontal = -action.widthOrZero())
        val close = measurable(CLOSE)?.measure(remaining)
        var textConstraints = remaining.offset(horizontal = -close.widthOrZero())

        val title = measurable(TITLE)?.measure(textConstraints)
        val titleHeight = title.heightOrZero()
        textConstraints = textConstraints.offset(vertical = -titleHeight)
        val text = measurable(TEXT)?.measure(textConstraints)

        // Высота текста уже включает textTopMargin, так как паддинг задан внутри самого слота
        val textHeight = text.heightOrZero()
        val textBlockHeight = titleHeight + textHeight
        // Экшн и close центрируются относительно строки заголовка, а не всего текстового блока
        val anchorHeight = if (titleHeight > 0) titleHeight else textHeight

        // Смещения слотов относительно верха текстового блока.
        // Отрицательное смещение означает, что слот выпирает над текстовым блоком
        val contentBeforeHeight = contentBefore.heightOrZero()
        val contentBeforeOffset = when (arrangement) {
            ContentBeforeVerticalArrangement.Top -> (anchorHeight - contentBeforeHeight) / 2
            ContentBeforeVerticalArrangement.Center -> (textBlockHeight - contentBeforeHeight) / 2
            ContentBeforeVerticalArrangement.Bottom -> textBlockHeight - contentBeforeHeight
        }
        val contentAfterHeight = contentAfter.heightOrZero()
        val contentAfterOffset = (textBlockHeight - contentAfterHeight) / 2
        val actionHeight = action.heightOrZero()
        val actionOffset = (anchorHeight - actionHeight) / 2
        // Close центрируется по заголовку, но на высоту не влияет
        val closeOffset = (anchorHeight - close.heightOrZero()) / 2

        // Смещение отсутствующего слота (нулевая высота) в расчёт высоты не идёт
        fun topInsetOf(offset: Int, height: Int) = if (height == 0) 0 else offset
        val minOffset = minOf(
            0,
            topInsetOf(contentBeforeOffset, contentBeforeHeight),
            topInsetOf(contentAfterOffset, contentAfterHeight),
            topInsetOf(actionOffset, actionHeight),
        )
        // Компенсирующий паддинг и выпирающий над заголовком контент занимают одно и то же место,
        // поэтому берётся максимум, а не сумма
        val topInset = maxOf(spacerHeight, -minOffset)

        val textBlockWidth = maxOf(title.widthOrZero(), text.widthOrZero())
        val closeW = close.widthOrZero()
        val actionW = action.widthOrZero()
        val contentAW = contentAfter.widthOrZero()
        val contentBW = contentBefore.widthOrZero()
        val layoutWidth = contentBW + textBlockWidth + contentAW + actionW + closeW

        // Дно слота считается относительно низа текстового блока, topInset здесь сокращается
        fun bottomInsetOf(offset: Int, height: Int) = if (height == 0) 0 else offset + height - textBlockHeight
        val bottomInset = maxOf(
            0,
            bottomInsetOf(contentBeforeOffset, contentBeforeHeight),
            bottomInsetOf(contentAfterOffset, contentAfterHeight),
            bottomInsetOf(actionOffset, actionHeight),
        )

        val finalWidth = constraints.constrainWidth(layoutWidth)
        val finalHeight = constraints.constrainHeight(topInset + textBlockHeight + bottomInset)

        return layout(finalWidth, finalHeight) {
            contentBefore?.placeRelative(x = 0, y = topInset + contentBeforeOffset)
            title?.placeRelative(x = contentBW, y = topInset)
            text?.placeRelative(x = contentBW, y = topInset + titleHeight)
            var x = finalWidth - closeW
            close?.placeRelative(x = x, y = topInset + closeOffset)
            x -= actionW
            action?.placeRelative(x = x, y = topInset + actionOffset)
            x -= contentAW
            contentAfter?.placeRelative(x = x, y = topInset + contentAfterOffset)
        }
    }
}

@Composable
private fun ContentBefore(
    modifier: Modifier,
    style: NoteCompactStyle,
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
    style: NoteCompactStyle,
    motion: Motion<NoteMotionStyle>,
    titleContent: @Composable () -> Unit,
) {
    Box(modifier = modifier) {
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
    style: NoteCompactStyle,
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
    style: NoteCompactStyle,
    motion: Motion<NoteMotionStyle>,
    action: @Composable BoxScope.() -> Unit,
) {
    val startM by style.dimensions.actionStartMarginValues.getValueAsState(motion.context)
    val endM by style.dimensions.actionEndMarginValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(
                start = startM,
                end = endM,
            ),
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
    style: NoteCompactStyle,
    motion: Motion<NoteMotionStyle>,
    contentAfter: @Composable BoxScope.() -> Unit,
) {
    val startM by style.dimensions.contentAfterStartMarginValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(start = startM),
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

@Composable
private fun CustomCloseIcon(
    modifier: Modifier,
    style: NoteCompactStyle,
    motion: Motion<NoteMotionStyle>,
    closeIcon: @Composable BoxScope.() -> Unit,
) {
    val startP by style.dimensions.closeStartMarginValues.getValueAsState(motion.context)
    Box(
        modifier = modifier
            .padding(start = startP)
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

private const val CONTENT_BEFORE = "contentBefore"
private const val CONTENT_AFTER = "contentAfter"
private const val TITLE = "title"
private const val TEXT = "text"
private const val ACTION = "action"
private const val CLOSE = "close"
