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
 * Компонент [NoteCompact]
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
fun NoteCompact(
    modifier: Modifier = Modifier,
    style: NoteCompactStyle = LocalNoteCompactStyle.current,
    title: String = "",
    text: String = "",
    @DrawableRes
    closeIconRes: Int? = style.closeIcon,
    onClose: (() -> Unit)? = null,
    contentBefore: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    action: (@Composable BoxScope.() -> Unit)? = null,
) {
    val iconColor = style.colors.iconColor.colorForInteraction(interactionSource)
    val contentBeforeArrangement = style.contentBeforeArrangement
    val backgroundColor = style.colors.backgroundColor.getValue(interactionSource)
    val measurePolicy = remember(contentBeforeArrangement) { NoteCompactMeasurePolicy(contentBeforeArrangement) }
    val extraTopPadding = style.dimensions.paddingBottom - style.dimensions.paddingTop
    Box(
        modifier = modifier
            .background(backgroundColor, style.shape)
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
                if (extraTopPadding > 0.dp) {
                    Spacer(
                        modifier = Modifier
                            .layoutId(SPACER)
                            .height(extraTopPadding),
                    )
                }
                if (title.isNotBlank()) {
                    StyledText(
                        modifier = Modifier
                            .layoutId(TITLE),
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
                CloseIcon(Modifier.layoutId(CLOSE), closeIconRes, onClose, style)
            },
        )
    }
}

@Composable
private fun CloseIcon(
    modifier: Modifier,
    closeIconRes: Int?,
    onClose: (() -> Unit)?,
    style: NoteCompactStyle,
) {
    if (closeIconRes == null) return
    val closeSize = style.dimensions.closeSize
    val closeInteractionSource = remember { MutableInteractionSource() }
    val closeColor = style.colors.closeColor.colorForInteraction(closeInteractionSource)
    Icon(
        modifier = modifier
            .padding(start = style.dimensions.closeStartMargin)
            .size(closeSize)
            .defaultMinSize(closeSize, closeSize)
            .clickable(
                interactionSource = closeInteractionSource,
                indication = null,
            ) { onClose?.invoke() },
        painter = painterResource(closeIconRes),
        contentDescription = "",
        tint = closeColor,
    )
}

@Suppress("LongMethod")
private class NoteCompactMeasurePolicy(
    private val arrangement: ContentBeforeVerticalArrangement,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val contentBefore = measurables.find { it.layoutId == CONTENT_BEFORE }
        val spacer = measurables.find { it.layoutId == SPACER }
        val title = measurables.find { it.layoutId == TITLE }
        val text = measurables.find { it.layoutId == TEXT }
        val action = measurables.find { it.layoutId == ACTION }
        val close = measurables.find { it.layoutId == CLOSE }

        val contentBeforePlaceable = contentBefore?.measure(constraints)
        val contentBeforeWidth = contentBeforePlaceable.widthOrZero()
        val contentBeforeHeight = contentBeforePlaceable.heightOrZero()

        val actionPlaceable = action?.measure(constraints)
        val actionWidth = actionPlaceable.widthOrZero()
        val actionHeight = actionPlaceable.heightOrZero()

        val closePlaceable = close?.measure(constraints)
        val closeWidth = closePlaceable.widthOrZero()
        val closeHeight = closePlaceable.heightOrZero()

        var newConstraints = constraints.copy(
            maxWidth = (constraints.maxWidth - contentBeforeWidth - actionWidth - closeWidth).coerceAtLeast(0),
        )

        val spacerPlaceable = spacer?.measure(newConstraints)
        val spacerHeight = spacerPlaceable.heightOrZero()

        val titlePlaceable = title?.measure(newConstraints)
        val titleWidth = titlePlaceable.widthOrZero()
        val titleHeight = titlePlaceable.heightOrZero()

        newConstraints = newConstraints.copy(maxHeight = newConstraints.maxHeight - titleHeight)

        val textPlaceable = text?.measure(newConstraints)
        val textWidth = textPlaceable.widthOrZero()
        val textHeight = textPlaceable.heightOrZero()

        val layoutWidth = contentBeforeWidth + maxOf(textWidth, titleWidth) + actionWidth + closeWidth
        val layoutHeight = calculateLayoutHeight(
            contentBeforeHeight,
            spacerHeight,
            titleHeight,
            textHeight,
            actionHeight,
            arrangement,
        )
        val finalWidth = constraints.constrainWidth(layoutWidth)
        val finalHeight = constraints.constrainHeight(layoutHeight)

        var contentOffsetY = when (arrangement) {
            ContentBeforeVerticalArrangement.Top -> spacerHeight + (titleHeight - contentBeforeHeight) / 2
            ContentBeforeVerticalArrangement.Center -> {
                spacerHeight + (titleHeight + textHeight - contentBeforeHeight) / 2
            }

            ContentBeforeVerticalArrangement.Bottom -> spacerHeight + titleHeight + textHeight - contentBeforeHeight
        }
        var actionOffsetY = spacerHeight + (titleHeight - actionHeight) / 2
        var spacerOffsetY = 0
        val actionStartX = contentBeforeWidth + maxOf(titleWidth, textWidth)
        val closeStartX = actionStartX + actionWidth
        val firstPlaceContent = (contentOffsetY < actionOffsetY) && contentOffsetY < 0
        val firstPlaceAction = (actionOffsetY < contentOffsetY) && actionOffsetY < 0
        if (firstPlaceContent) {
            spacerOffsetY += abs(contentOffsetY)
            actionOffsetY += abs(contentOffsetY)
            contentOffsetY = 0
        }
        if (firstPlaceAction) {
            spacerOffsetY += abs(actionOffsetY)
            contentOffsetY += abs(actionOffsetY)
            actionOffsetY = 0
        }
        return layout(finalWidth, finalHeight) {
            contentBeforePlaceable?.placeRelative(x = 0, y = contentOffsetY)
            spacerPlaceable?.placeRelative(x = contentBeforeWidth, spacerOffsetY)
            titlePlaceable?.placeRelative(x = contentBeforeWidth, y = spacerOffsetY + spacerHeight)
            textPlaceable?.placeRelative(x = contentBeforeWidth, y = spacerOffsetY + spacerHeight + titleHeight)
            actionPlaceable?.placeRelative(x = actionStartX, y = actionOffsetY)
            closePlaceable?.placeRelative(
                x = closeStartX,
                y = (spacerOffsetY + spacerHeight + titleHeight / 2 - closeHeight / 2),
            )
        }
    }
}

private fun calculateLayoutHeight(
    cbHeight: Int,
    spacerHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    aHeight: Int,
    arrangement: ContentBeforeVerticalArrangement,
): Int {
    return when (arrangement) {
        ContentBeforeVerticalArrangement.Top ->
            calculateHeightWhenTop(cbHeight, spacerHeight, titleHeight, textHeight, aHeight)

        ContentBeforeVerticalArrangement.Center ->
            calculateHeightWhenCenter(cbHeight, spacerHeight, titleHeight, textHeight, aHeight)

        ContentBeforeVerticalArrangement.Bottom ->
            calculateHeightWhenBottom(cbHeight, spacerHeight, titleHeight, textHeight, aHeight)
    }
}

private fun calculateHeightWhenTop(
    cbHeight: Int,
    spacerHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    aHeight: Int,
): Int {
    val maxHalf = maxOf(cbHeight / 2, aHeight / 2)
    val bigSpacer = spacerHeight > (maxHalf - titleHeight / 2)
    return when {
        maxHalf >= (titleHeight / 2 + textHeight) -> {
            if (bigSpacer) {
                spacerHeight + titleHeight / 2 + maxHalf
            } else {
                maxHalf * 2
            }
        }

        maxHalf > titleHeight / 2 -> {
            if (bigSpacer) {
                spacerHeight + titleHeight + textHeight
            } else {
                maxHalf + titleHeight / 2 + textHeight
            }
        }

        else -> {
            if (bigSpacer) {
                spacerHeight + titleHeight + textHeight
            } else {
                (maxHalf - titleHeight / 2) + titleHeight + textHeight
            }
        }
    }
}

private fun calculateHeightWhenCenter(
    cbHeight: Int,
    spacerHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    aHeight: Int,
): Int {
    val offsetPartContent = cbHeight / 2 - (titleHeight + textHeight) / 2
    val offsetTopPartAction = aHeight / 2 - titleHeight / 2
    val offsetBottomPartAction = aHeight / 2 - (titleHeight / 2 + textHeight)
    val maxTopOffset = maxOf(offsetPartContent, offsetTopPartAction, spacerHeight)
    val maxBottomOffset = maxOf(offsetPartContent, offsetBottomPartAction)
    var result = titleHeight + textHeight
    if (maxTopOffset > 0) result += maxTopOffset
    if (maxBottomOffset > 0) result += maxBottomOffset
    return result
}

private fun calculateHeightWhenBottom(
    cbHeight: Int,
    spacerHeight: Int,
    titleHeight: Int,
    textHeight: Int,
    aHeight: Int,
): Int {
    val offsetPartContent = cbHeight - (titleHeight + textHeight)
    val offsetTopPartAction = aHeight / 2 - titleHeight / 2
    val maxTopOffset = maxOf(offsetPartContent, offsetTopPartAction, spacerHeight)
    val offsetBottomPartAction = aHeight / 2 - (titleHeight / 2 + textHeight)
    var result = titleHeight + textHeight
    if (maxTopOffset > 0) result += maxTopOffset
    if (offsetBottomPartAction > 0) result += offsetBottomPartAction
    return result
}

private const val CONTENT_BEFORE = "contentBefore"
private const val TITLE = "title"
private const val TEXT = "text"
private const val ACTION = "action"
private const val CLOSE = "close"
private const val SPACER = "spacer"
