package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.common.StyledText
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.abs

/**
 * Компонент [Note]
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param title заголовок
 * @param text текст
 * @param closeIconRes ссылка на ресурс иконки закрытия
 * @param onClose колбэк клика на иконку закрытия [closeIconRes]
 * @param contentBefore контент перед текстовым блоком
 * @param interactionSource источник взаимодействий
 * @param action дополнительный контент для взаимодейстивия с компонентом
 */
@Suppress("LongMethod")
@Composable
fun Note(
    modifier: Modifier = Modifier,
    style: NoteStyle = LocalNoteStyle.current,
    title: String = "",
    text: String = "",
    @DrawableRes
    closeIconRes: Int? = style.closeIcon,
    onClose: (() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    action: (@Composable BoxScope.() -> Unit)? = null,
) {
    val backgroundColor = style.colors.backgroundColor.getValue(interactionSource)
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val contentBeforeArrangement = style.contentBeforeArrangement
    val measurePolicy = remember(contentBeforeArrangement) { NoteMeasurePolicy(contentBeforeArrangement) }
    val extraBottomPadding = style.dimensions.paddingTop - style.dimensions.paddingBottom
    Box(
        modifier.background(backgroundColor, style.shape),
    ) {
        CloseIcon(style, closeIconRes, onClose)
        Box(
            modifier = Modifier
                .padding(
                    start = style.dimensions.paddingStart,
                    end = style.dimensions.paddingEnd,
                    top = style.dimensions.paddingTop,
                    bottom = style.dimensions.paddingBottom,
                )
                .clipToBounds(),
        ) {
            Layout(
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
                    if (title.isNotBlank()) {
                        StyledText(
                            modifier = Modifier
                                .layoutId(TITLE)
                                .padding(end = style.dimensions.titlePaddingEnd),
                            text = title,
                            textStyle = style.titleStyle,
                            textColor = style.colors.titleColor.colorForInteraction(interactionSource),
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    if (text.isNotBlank()) {
                        StyledText(
                            modifier = Modifier
                                .layoutId(TEXT)
                                .padding(top = style.dimensions.textTopMargin),
                            text = text,
                            textStyle = style.textStyle,
                            textColor = style.colors.textColor.colorForInteraction(interactionSource),
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    if (extraBottomPadding > 0.dp) {
                        Spacer(
                            modifier = Modifier
                                .layoutId(SPACER)
                                .height(extraBottomPadding),
                        )
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
                },
            )
        }
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
    closeIconRes: Int?,
    onClose: (() -> Unit)?,
) {
    if (closeIconRes != null) {
        val closeSize = style.dimensions.closeSize
        val closeInteractionSource = remember { MutableInteractionSource() }
        val closeColor = style.colors.closeColor.colorForInteraction(closeInteractionSource)
        Icon(
            modifier = Modifier
                .padding(top = style.dimensions.closeTopMargin, end = style.dimensions.closeEndMargin)
                .size(closeSize)
                .defaultMinSize(closeSize, closeSize)
                .align(Alignment.TopEnd)
                .clickable(
                    interactionSource = closeInteractionSource,
                    indication = null,
                ) { onClose?.invoke() },
            painter = painterResource(closeIconRes),
            contentDescription = "",
            tint = closeColor,
        )
    }
}

private class NoteMeasurePolicy(
    private val arrangement: ContentBeforeVerticalArrangement,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val contentBefore = measurables.find { it.layoutId == CONTENT_BEFORE }
        val title = measurables.find { it.layoutId == TITLE }
        val text = measurables.find { it.layoutId == TEXT }
        val spacer = measurables.find { it.layoutId == SPACER }
        val action = measurables.find { it.layoutId == ACTION }

        val contentBeforePlaceable = contentBefore?.measure(constraints)
        val contentBeforeHeight = contentBeforePlaceable.heightOrZero()
        val contentBeforeWidth = contentBeforePlaceable.widthOrZero()

        var newConstraints = constraints.copy(maxWidth = (constraints.maxWidth - contentBeforeWidth).coerceAtLeast(0))

        val titlePlaceable = title?.measure(newConstraints)
        val titleWidth = titlePlaceable.widthOrZero()
        val titleHeight = titlePlaceable.heightOrZero()

        newConstraints = newConstraints.copy(maxHeight = (newConstraints.maxHeight - titleHeight))

        val textPlaceable = text?.measure(newConstraints)
        val textWidth = textPlaceable.widthOrZero()
        val textHeight = textPlaceable.heightOrZero()

        newConstraints = newConstraints.copy(maxHeight = (newConstraints.maxHeight - textHeight))

        val actionPlaceable = action?.measure(newConstraints)
        val actionWidth = actionPlaceable.widthOrZero()
        val actionHeight = actionPlaceable.heightOrZero()

        val spacerPlaceable = spacer?.measure(newConstraints)
        val spacerHeight = spacerPlaceable.heightOrZero()

        val layoutWidth = contentBeforeWidth + maxOf(actionWidth, textWidth, titleWidth)
        val layoutHeight = calculateLayoutHeight(
            contentBeforeHeight,
            titleHeight,
            textHeight,
            spacerHeight,
            actionHeight,
            arrangement,
        )
        val finalHeight = constraints.constrainHeight(layoutHeight)
        val finalWidth = constraints.constrainWidth(layoutWidth)

        val contentBeforeY = when (arrangement) {
            ContentBeforeVerticalArrangement.Top -> (titleHeight - contentBeforeHeight) / 2
            ContentBeforeVerticalArrangement.Center -> (titleHeight + textHeight - contentBeforeHeight) / 2
            ContentBeforeVerticalArrangement.Bottom -> titleHeight + textHeight - contentBeforeHeight
        }
        val positiveOffset = contentBeforeY > 0
        val titleY = if (positiveOffset) 0 else abs(contentBeforeY)
        return layout(finalWidth, finalHeight) {
            contentBeforePlaceable?.placeRelative(x = 0, y = if (positiveOffset) contentBeforeY else 0)
            titlePlaceable?.placeRelative(x = contentBeforeWidth, y = titleY)
            textPlaceable?.placeRelative(x = contentBeforeWidth, y = titleY + titleHeight)
            spacerPlaceable?.placeRelative(x = contentBeforeWidth, y = titleY + titleHeight + textHeight)
            actionPlaceable?.placeRelative(x = contentBeforeWidth, y = titleY + titleHeight + textHeight)
        }
    }
}

private fun calculateLayoutHeight(
    cbHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    spacerHeight: Int,
    aHeight: Int,
    arrangement: ContentBeforeVerticalArrangement,
): Int {
    return when (arrangement) {
        ContentBeforeVerticalArrangement.Top ->
            calculateHeightWhenTop(cbHeight, titleHeight, textHeight, spacerHeight, aHeight)

        ContentBeforeVerticalArrangement.Center ->
            calculateHeightWhenCenter(cbHeight, titleHeight, textHeight, spacerHeight, aHeight)

        ContentBeforeVerticalArrangement.Bottom ->
            calculateHeightWhenBottom(cbHeight, titleHeight, textHeight, spacerHeight, aHeight)
    }
}

private fun calculateHeightWhenTop(
    cbHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    spacerHeight: Int,
    aHeight: Int,
): Int {
    val half = cbHeight / 2
    val extraHeight = if (aHeight > 0) aHeight else spacerHeight
    return when {
        half >= (titleHeight / 2 + textHeight + extraHeight) -> cbHeight
        half > titleHeight / 2 ->
            half + titleHeight / 2 + textHeight + extraHeight

        else -> titleHeight + textHeight + extraHeight
    }
}

private fun calculateHeightWhenCenter(
    cbHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    spacerHeight: Int,
    aHeight: Int,
): Int {
    val half = cbHeight / 2
    val extraHeight = if (aHeight > 0) aHeight else spacerHeight
    return when {
        half >= ((titleHeight + textHeight) / 2 + extraHeight) -> cbHeight
        half > (titleHeight + textHeight) / 2 -> half + (titleHeight + textHeight) / 2 + extraHeight
        else -> titleHeight + textHeight + extraHeight
    }
}

private fun calculateHeightWhenBottom(
    cbHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    spacerHeight: Int,
    aHeight: Int,
): Int {
    val extraHeight = if (aHeight > 0) aHeight else spacerHeight
    return when {
        cbHeight >= (titleHeight + textHeight) -> cbHeight + extraHeight
        else -> titleHeight + textHeight + extraHeight
    }
}

private const val CONTENT_BEFORE = "contentBefore"
private const val TITLE = "title"
private const val TEXT = "text"
private const val ACTION = "action"
private const val SPACER = "spacer"
