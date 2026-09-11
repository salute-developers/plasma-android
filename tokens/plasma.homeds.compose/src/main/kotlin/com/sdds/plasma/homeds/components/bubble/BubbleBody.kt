package com.sdds.plasma.homeds.components.bubble

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.util.lerp
import com.sdds.compose.uikit.LocalTextBrushProducer
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.plasma.homeds.motion.bubble.BubbleMotionStyle

/**
 * Тело развёрнутого бабла (содержимое + бейдж-крестик). Вызывается из `BubbleOverlayItem`
 * (`BubbleHost.kt`), которому принадлежат реестр и позиционирование оверлея.
 *
 * @param entry запись реестра хоста с таймлайном/колбэками/стилем
 * @param circleSize диаметр круга-якоря
 * @param motion общий Motion оверлея (тело + бейдж-крестик), построенный в `BubbleOverlayItem`
 */
@Composable
internal fun BubbleBody(entry: BubbleOverlayEntry, circleSize: Dp, motion: Motion<BubbleMotionStyle>) {
    val style = entry.style
    val density = LocalDensity.current
    val layoutDirection = LocalLayoutDirection.current
    val interactionSource = motion.context.interactionSource
    val bodyCornerRadius by style.dimensions.bodyCornerRadius.getDpAsState(
        motion.context,
        motion.style.bodyCornerRadius,
    )
    val bodyNearCornerRadius by style.dimensions.bodyNearCornerRadius.getDpAsState(
        motion.context,
        motion.style.bodyNearCornerRadius,
    )
    val bodyMinSize by style.dimensions.bodyMinHeight.getDpAsState(motion.context, motion.style.bodyMinHeight)
    val neckWidth by style.dimensions.neckWidth.getDpAsState(motion.context, motion.style.neckWidth)
    val neckLength by style.dimensions.neckLength.getDpAsState(motion.context, motion.style.neckLength)
    val neckFilletRadius by style.dimensions.neckFilletRadius.getDpAsState(
        motion.context,
        motion.style.neckFilletRadius,
    )
    val paddingStart by style.dimensions.paddingStart.getDpAsState(motion.context, motion.style.paddingStart)
    val paddingEnd by style.dimensions.paddingEnd.getDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop by style.dimensions.paddingTop.getDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom by style.dimensions.paddingBottom.getDpAsState(motion.context, motion.style.paddingBottom)
    val contentPadding = PaddingValues(
        start = paddingStart,
        end = paddingEnd,
        top = paddingTop,
        bottom = paddingBottom,
    )
    val iconSize by style.dimensions.iconSize.getDpAsState(motion.context, motion.style.iconSize)
    val bodyBrush by style.colors.bodyBrush.getBrushAsState(motion.context, motion.style.bodyColor)
    val iconBrush by style.colors.iconBrush.getBrushAsState(motion.context, motion.style.iconColor)
    val borderBrush by style.colors.borderBrush.getBrushAsState(motion.context, motion.style.borderColor)
    val textBrush by style.colors.textColor.getBrushAsState(motion.context, motion.style.textColor)
    val textStyle by style.textStyle.getValueAsState(interactionSource)
    val glowLayer = style.innerGlowLayer(interactionSource)
    val closeInteractionSource = remember { MutableInteractionSource() }
    val badgeAlignment = bubbleBadgeAlignment(entry.placement, entry.alignment)
    val reserved = with(density) { (circleSize.toPx() + neckLength.toPx()).toDp() }
    val reservedPadding = bubbleReservedPadding(entry.placement, reserved)
    val bodyMinSizeModifier = when (entry.placement) {
        BubblePlacement.Top, BubblePlacement.Bottom -> Modifier.heightIn(min = bodyMinSize)
        BubblePlacement.Start, BubblePlacement.End -> Modifier.widthIn(min = bodyMinSize)
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    Box(
        modifier = Modifier
            .graphicsLayer {
                val bounceScale = entry.bounceProgress().coerceAtLeast(1f)
                scaleX = bounceScale
                scaleY = bounceScale
                val (resolvedPlacement, resolvedAlignment) = resolveBubblePlacement(
                    entry.placement,
                    entry.alignment,
                    layoutDirection,
                )
                transformOrigin = bubbleBouncePivot(
                    resolvedPlacement = resolvedPlacement,
                    resolvedAlignment = resolvedAlignment,
                    circleRadiusPx = circleSize.toPx() / 2f,
                    sizeWidth = size.width,
                    sizeHeight = size.height,
                )
            }
            .drawWithCache {
                val circlePx = circleSize.toPx()
                val neckWidthPx = neckWidth.toPx()
                val neckLengthPx = neckLength.toPx()
                val neckFilletRadiusPx = neckFilletRadius.toPx()
                val cornerPx = bodyCornerRadius.toPx()
                val nearCornerPx = bodyNearCornerRadius.toPx()
                val glowRadiusPx = glowLayer?.blurRadius?.toPx() ?: 0f
                val glowPainter = createBubbleInnerGlowPainter(size)
                onDrawBehind {
                    val path = buildBubblePath(
                        size = size,
                        layoutDirection = layoutDirection,
                        progress = entry.expandProgress(),
                        circleDiameterPx = circlePx,
                        neckWidthPx = neckWidthPx,
                        neckLengthPx = neckLengthPx,
                        neckFilletRadiusPx = neckFilletRadiusPx,
                        bodyCornerRadiusPx = cornerPx,
                        bodyNearCornerRadiusPx = nearCornerPx,
                        placement = entry.placement,
                        alignment = entry.alignment,
                    )
                    val bodyAlpha = (
                        (entry.expandProgress() - BODY_ALPHA_LOW) / (BODY_ALPHA_HIGH - BODY_ALPHA_LOW)
                        ).coerceIn(0f, 1f)
                    drawPath(path, bodyBrush, alpha = bodyAlpha)
                    if (glowLayer != null) {
                        with(glowPainter) { draw(path, glowLayer.color, glowRadiusPx, alpha = bodyAlpha) }
                    }
                }
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = entry.onBodyClick,
            ),
    ) {
        Box(modifier = Modifier.padding(reservedPadding)) {
            Box(
                modifier = bodyMinSizeModifier
                    .padding(contentPadding)
                    .graphicsLayer { alpha = entry.expandProgress().coerceIn(0f, 1f) },
            ) {
                CompositionLocalProvider(
                    LocalTintBrushProducer provides { textBrush },
                    LocalTextBrushProducer provides { textBrush },
                    LocalTextStyle provides textStyle,
                ) {
                    entry.content()
                }
            }
        }
        Box(
            modifier = Modifier
                .align(badgeAlignment)
                .size(circleSize)
                .clickable(
                    interactionSource = closeInteractionSource,
                    indication = null,
                    onClick = entry.onCloseClick,
                ),
            contentAlignment = Alignment.Center,
        ) {
            BubbleTriggerIcon(
                morphProgress = entry.iconMorphProgress,
                rotationProgress = entry.rotationProgress,
                sizeScale = { lerp(1f, BUBBLE_BADGE_BORDER_SCALE, entry.iconMorphProgress()) },
                tint = iconBrush,
                starIcon = style.starIcon,
                closeIcon = style.closeIcon,
                backgroundBrush = bodyBrush,
                borderBrush = borderBrush,
                borderSize = circleSize,
                glowLayer = glowLayer,
                modifier = Modifier.size(iconSize),
            )
        }
    }
}

/**
 * Позиция круга-якоря внутри overlay-бокса для выравнивания бейджа-крестика через `Modifier.align`.
 */
@Suppress("CyclomaticComplexMethod")
private fun bubbleBadgeAlignment(placement: BubblePlacement, alignment: BubbleAlignment): Alignment {
    val horizontal = when (placement) {
        BubblePlacement.Start -> Alignment.End
        BubblePlacement.End -> Alignment.Start
        BubblePlacement.Top, BubblePlacement.Bottom -> when (alignment) {
            BubbleAlignment.Start -> Alignment.Start
            BubbleAlignment.Center -> Alignment.CenterHorizontally
            BubbleAlignment.End -> Alignment.End
        }
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    val vertical = when (placement) {
        BubblePlacement.Top -> Alignment.Bottom
        BubblePlacement.Bottom -> Alignment.Top
        BubblePlacement.Start, BubblePlacement.End -> when (alignment) {
            BubbleAlignment.Start -> Alignment.Top
            BubbleAlignment.Center -> Alignment.CenterVertically
            BubbleAlignment.End -> Alignment.Bottom
        }
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    return Alignment { size, space, layoutDirection ->
        IntOffset(
            horizontal.align(size.width, space.width, layoutDirection),
            vertical.align(size.height, space.height),
        )
    }
}

/**
 * На какой стороне content-слота резервировать место под круг+шейку.
 */
private fun bubbleReservedPadding(placement: BubblePlacement, reserved: Dp): PaddingValues =
    when (placement) {
        BubblePlacement.Top -> PaddingValues(bottom = reserved)
        BubblePlacement.Bottom -> PaddingValues(top = reserved)
        BubblePlacement.Start -> PaddingValues(end = reserved)
        BubblePlacement.End -> PaddingValues(start = reserved)
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }

/**
 * Пивот для "пружинного" `graphicsLayer`-масштаба тела — центр круга-якоря.
 */
@Suppress("CyclomaticComplexMethod")
private fun bubbleBouncePivot(
    resolvedPlacement: BubblePlacement,
    resolvedAlignment: BubbleAlignment,
    circleRadiusPx: Float,
    sizeWidth: Float,
    sizeHeight: Float,
): TransformOrigin {
    val pivotX = when (resolvedPlacement) {
        BubblePlacement.Start -> 1f - circleRadiusPx / sizeWidth
        BubblePlacement.End -> circleRadiusPx / sizeWidth
        BubblePlacement.Top, BubblePlacement.Bottom -> when (resolvedAlignment) {
            BubbleAlignment.Start -> circleRadiusPx / sizeWidth
            BubbleAlignment.Center -> 0.5f
            BubbleAlignment.End -> 1f - circleRadiusPx / sizeWidth
        }
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    val pivotY = when (resolvedPlacement) {
        BubblePlacement.Top -> 1f - circleRadiusPx / sizeHeight
        BubblePlacement.Bottom -> circleRadiusPx / sizeHeight
        BubblePlacement.Start, BubblePlacement.End -> when (resolvedAlignment) {
            BubbleAlignment.Start -> circleRadiusPx / sizeHeight
            BubbleAlignment.Center -> 0.5f
            BubbleAlignment.End -> 1f - circleRadiusPx / sizeHeight
        }
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    return TransformOrigin(pivotX, pivotY)
}

private const val BODY_ALPHA_LOW = 0.3f
private const val BODY_ALPHA_HIGH = 0.7f
