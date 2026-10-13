package com.sdds.compose.uikit

import androidx.compose.foundation.background
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
@Suppress("LongMethod")
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
    val backgroundColor = style.colors.backgroundColor.getValue(interactionSource)
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val disclosureColor = style.colors.disclosureColor.colorForInteraction(interactionSource)
    val contentBeforeArrangement = style.contentBeforeArrangement
    val extraBottomPadding = (style.dimensions.paddingTop - style.dimensions.paddingBottom).coerceAtLeast(0.dp)
    val spacerHeight = with(LocalDensity.current) { extraBottomPadding.roundToPx() }
    val measurePolicy = remember(contentBeforeArrangement, spacerHeight) {
        NoteMeasurePolicy(contentBeforeArrangement, spacerHeight)
    }
    Box(
        modifier = modifier.background(backgroundColor, style.shape),
        // Нота по умолчанию оборачивает контент и растягивается только тогда, когда ширину
        // требует родитель (например модификатором fillMaxWidth)
        propagateMinConstraints = true,
    ) {
        if (closeIcon != null) {
            val closeSize = style.dimensions.closeSize
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    // Слот close — оверлей, он не должен наследовать родительские min-ограничения
                    .width(IntrinsicSize.Min)
                    .height(IntrinsicSize.Min)
                    .padding(top = style.dimensions.closeTopMargin, end = style.dimensions.closeEndMargin)
                    .defaultMinSize(),
            ) {
                CompositionLocalProvider(
                    LocalIconDefaultSize provides DpSize(closeSize, closeSize),
                ) {
                    closeIcon()
                }
            }
        }
        Layout(
            modifier = Modifier
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
                    modifier = Modifier
                        .layoutId(TITLE)
                        .padding(end = style.dimensions.titlePaddingEnd),
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
                action?.let {
                    Box(
                        modifier = Modifier
                            .layoutId(ACTION)
                            .padding(top = style.dimensions.actionTopMargin),
                    ) {
                        CompositionLocalProvider(
                            LocalLinkButtonStyle provides style.linkButtonStyle,
                        ) {
                            action.invoke(this)
                        }
                    }
                }
                contentAfter?.let {
                    Box(
                        modifier = Modifier
                            .layoutId(CONTENT_AFTER)
                            .padding(
                                start = style.dimensions.contentAfterStartMargin,
                                end = style.dimensions.contentAfterEndMargin,
                            ),
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
    val closeColor = style.colors.closeColor.colorForInteraction(closeInteractionSource)
    Icon(
        modifier = Modifier
            .align(Alignment.TopEnd)
            .clickable(
                interactionSource = closeInteractionSource,
                indication = LocalIndication.current,
            ) { onClose?.invoke() },
        source = closeIconSource,
        contentDescription = "",
        brush = BrushProducer { SolidColor(closeColor) },
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
        val textConstraints = remaining.offset(horizontal = -contentAfter.widthOrZero())

        val title = measurable(TITLE)?.measure(textConstraints)
        val text = measurable(TEXT)?.measure(textConstraints)
        // Экшн идёт отдельной строкой под текстовым блоком, поэтому contentAfter его ширину не уменьшает
        val action = measurable(ACTION)?.measure(remaining)

        val titleHeight = title.heightOrZero()
        // Высота текста уже включает textTopMargin, так как паддинг задан внутри самого слота
        val textHeight = text.heightOrZero()
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

private const val CONTENT_BEFORE = "contentBefore"
private const val CONTENT_AFTER = "contentAfter"
private const val TITLE = "title"
private const val TEXT = "text"
private const val ACTION = "action"
