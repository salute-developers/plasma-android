package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.SolidColor
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
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.SemanticStateSource
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero

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
@Suppress("LongMethod")
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
@Suppress("LongMethod")
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
@Suppress("LongMethod")
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
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val disclosureColor = style.colors.disclosureColor.colorForInteraction(interactionSource)
    val contentBeforeArrangement = style.contentBeforeArrangement
    val backgroundColor = style.colors.backgroundColor.getValue(interactionSource)
    val extraTopPadding = (style.dimensions.paddingBottom - style.dimensions.paddingTop).coerceAtLeast(0.dp)
    val spacerHeight = with(LocalDensity.current) { extraTopPadding.roundToPx() }
    val measurePolicy = remember(contentBeforeArrangement, spacerHeight) {
        NoteCompactMeasurePolicy(contentBeforeArrangement, spacerHeight)
    }
    // Нота оборачивает контент и растягивается только тогда, когда ширину требует родитель
    // (например модификатором fillMaxWidth)
    Layout(
        modifier = modifier
            .background(backgroundColor, style.shape)
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            )
            .clipToBounds(),
        measurePolicy = measurePolicy,
        content = {
            contentBefore?.let {
                Box(
                    modifier = Modifier
                        .layoutId(CONTENT_BEFORE)
                        .padding(
                            end = style.dimensions.contentBeforeEndMargin,
                        ),
                ) {
                    val iconSize = style.dimensions.iconSize
                    val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
                    CompositionLocalProvider(
                        LocalTint provides iconColor,
                        LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
                    ) {
                        contentBefore.invoke(this)
                    }
                }
            }
            Box(
                modifier = Modifier.layoutId(TITLE),
            ) {
                ProvideTextBehaviour(behaviour = TextBehaviour(overflow = TextOverflow.Ellipsis)) {
                    val textColor = style.colors.titleColor.colorForInteractionAsState(
                        interactionSource,
                        semanticStateSource,
                    )
                    ProvideTextStyle(style.titleStyle, color = { textColor.value }) {
                        titleContent()
                    }
                }
            }
            if (textContent != null) {
                Box(
                    modifier = Modifier
                        .layoutId(TEXT)
                        .padding(top = style.dimensions.textTopMargin),
                ) {
                    ProvideTextBehaviour(behaviour = TextBehaviour(overflow = TextOverflow.Ellipsis)) {
                        val textColor = style.colors.textColor.colorForInteractionAsState(
                            interactionSource,
                            semanticStateSource,
                        )
                        ProvideTextStyle(style.textStyle, color = { textColor.value }) {
                            textContent()
                        }
                    }
                }
            }
            contentAfter?.let {
                Box(
                    modifier = Modifier
                        .layoutId(CONTENT_AFTER)
                        .padding(start = style.dimensions.contentAfterStartMargin),
                ) {
                    val iconSize = style.dimensions.disclosureSize
                    val actualIconSize = if (iconSize == 0.dp) Dp.Unspecified else iconSize
                    CompositionLocalProvider(
                        LocalTint provides disclosureColor,
                        LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
                    ) {
                        it.invoke(this)
                    }
                }
            }
            action?.let {
                Box(
                    modifier = Modifier
                        .layoutId(ACTION)
                        .padding(
                            start = style.dimensions.actionStartMargin,
                            end = style.dimensions.actionEndMargin,
                        ),
                ) {
                    CompositionLocalProvider(
                        LocalLinkButtonStyle provides style.linkButtonStyle,
                    ) {
                        action.invoke(this)
                    }
                }
            }
            if (closeIcon != null) {
                val closeSize = style.dimensions.closeSize
                Box(
                    modifier = Modifier
                        .layoutId(CLOSE)
                        .padding(start = style.dimensions.closeStartMargin)
                        .defaultMinSize(),
                ) {
                    CompositionLocalProvider(
                        LocalIconDefaultSize provides DpSize(closeSize, closeSize),
                    ) {
                        closeIcon()
                    }
                }
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
    val closeColor = style.colors.closeColor.colorForInteraction(closeInteractionSource)
    Icon(
        modifier = Modifier
            .clickable(
                interactionSource = closeInteractionSource,
                indication = LocalIndication.current,
            ) { onClose?.invoke() },
        source = closeIconSource,
        contentDescription = "",
        brush = BrushProducer { SolidColor(closeColor) },
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

private const val CONTENT_BEFORE = "contentBefore"
private const val CONTENT_AFTER = "contentAfter"
private const val TITLE = "title"
private const val TEXT = "text"
private const val ACTION = "action"
private const val CLOSE = "close"
