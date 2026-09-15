package com.sdds.plasma.homeds.components.bubble

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.util.lerp

/**
 * Строит Union-геометрию апсейл-бабла: круг-якорь, объединённый с телом, растущим из круга при
 * [progress] от 0 (только круг) до 1 (круг + тело в полный размер [size]).
 *
 * @param size полный размер контейнера
 * @param layoutDirection направление раскладки — используется для зеркалирования [placement]/[alignment]
 * @param progress прогресс разворота 0f..1f
 * @param circleDiameterPx диаметр круга-якоря в px
 * @param neckWidthPx ширина шейки в развёрнутом состоянии, px
 * @param neckLengthPx длина шейки (зазор между кругом и телом) в развёрнутом состоянии, px
 * @param neckFilletRadiusPx радиус вогнутой галтели на стыках шейки, px
 * @param bodyCornerRadiusPx радиус скругления обычных углов тела, px
 * @param bodyNearCornerRadiusPx радиус скругления угла тела, ближайшего к кругу-якорю, px
 * @param placement с какой стороны от круга-якоря появляется тело
 * @param alignment выравнивание тела вдоль оси, перпендикулярной [placement]
 */
@Suppress("LongParameterList")
internal fun buildBubblePath(
    size: Size,
    layoutDirection: LayoutDirection,
    progress: Float,
    circleDiameterPx: Float,
    neckWidthPx: Float,
    neckLengthPx: Float,
    neckFilletRadiusPx: Float,
    bodyCornerRadiusPx: Float,
    bodyNearCornerRadiusPx: Float,
    placement: BubblePlacement,
    alignment: BubbleAlignment,
): Path {
    val (resolvedPlacement, resolvedAlignment) = resolveBubblePlacement(placement, alignment, layoutDirection)

    val canonicalSize = when (resolvedPlacement) {
        BubblePlacement.Top, BubblePlacement.Bottom -> size
        BubblePlacement.Start, BubblePlacement.End -> Size(size.height, size.width)
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    val path = buildCanonicalBubblePath(
        size = canonicalSize,
        progress = progress,
        circleDiameterPx = circleDiameterPx,
        neckWidthPx = neckWidthPx,
        neckLengthPx = neckLengthPx,
        neckFilletRadiusPx = neckFilletRadiusPx,
        bodyCornerRadiusPx = bodyCornerRadiusPx,
        bodyNearCornerRadiusPx = bodyNearCornerRadiusPx,
        alignment = resolvedAlignment,
    )
    val matrix = placementMatrix(resolvedPlacement, size)
    if (matrix != null) {
        path.transform(matrix)
    }
    return path
}

/**
 * Матрица преобразования канонического (Top-ориентированного) `Path` в реальную ориентацию
 * [placement] — `null` для [BubblePlacement.Top].
 */
private fun placementMatrix(placement: BubblePlacement, realSize: Size): Matrix? = when (placement) {
    BubblePlacement.Top -> null
    BubblePlacement.Bottom -> Matrix().apply {
        this[1, 1] = -1f
        this[3, 1] = realSize.height
    }
    BubblePlacement.Start -> Matrix().apply {
        this[0, 0] = 0f
        this[0, 1] = 1f
        this[1, 0] = 1f
        this[1, 1] = 0f
    }
    BubblePlacement.End -> Matrix().apply {
        this[0, 0] = 0f
        this[0, 1] = 1f
        this[1, 0] = -1f
        this[1, 1] = 0f
        this[3, 0] = realSize.width
    }
    BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
}

/**
 * Резолвит [placement]/[alignment] под [layoutDirection].
 */
internal fun resolveBubblePlacement(
    placement: BubblePlacement,
    alignment: BubbleAlignment,
    layoutDirection: LayoutDirection,
): Pair<BubblePlacement, BubbleAlignment> {
    val isRtl = layoutDirection == LayoutDirection.Rtl
    val resolvedPlacement = if (isRtl) mirrorPlacementRtl(placement) else placement
    val resolvedAlignment = if (isRtl && (placement == BubblePlacement.Top || placement == BubblePlacement.Bottom)) {
        mirrorAlignmentRtl(alignment)
    } else {
        alignment
    }
    return resolvedPlacement to resolvedAlignment
}

private fun mirrorPlacementRtl(placement: BubblePlacement): BubblePlacement = when (placement) {
    BubblePlacement.Start -> BubblePlacement.End
    BubblePlacement.End -> BubblePlacement.Start
    BubblePlacement.Top, BubblePlacement.Bottom -> placement
    BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
}

/**
 * Точка отказа для exhaustive `when` над [BubblePlacement], если [BubblePlacement.Auto] не был
 * разрешён заранее (см. [resolveAutoBubblePlacement]).
 */
internal fun unresolvedBubbleAutoPlacementError(): Nothing =
    error(
        "BubblePlacement.Auto должен быть разрешён в конкретную сторону " +
            "(resolveAutoBubblePlacement) до того, как достигнет геометрии/layout — " +
            "см. регистрацию BubbleOverlayEntry в BubbleTrigger.kt",
    )

/**
 * Автовыбор [placement]/[alignment] по свободному месту в границах [BubbleHost] — реализация
 * [BubblePlacement.Auto].
 *
 * @param hostSize размер [BubbleHost] в px
 * @param anchorPosition позиция круга-якоря (левый верхний угол) в координатах хоста, px
 * @param circleDiameterPx диаметр круга-якоря, px
 * @param layoutDirection направление раскладки
 */
internal fun resolveAutoBubblePlacement(
    hostSize: Size,
    anchorPosition: Offset,
    circleDiameterPx: Float,
    layoutDirection: LayoutDirection,
): Pair<BubblePlacement, BubbleAlignment> {
    if (hostSize.width <= 0f || hostSize.height <= 0f) {
        return BubblePlacement.Top to BubbleAlignment.End
    }
    val spaceTop = anchorPosition.y
    val spaceBottom = hostSize.height - (anchorPosition.y + circleDiameterPx)
    val spaceLeft = anchorPosition.x
    val spaceRight = hostSize.width - (anchorPosition.x + circleDiameterPx)
    val isRtl = layoutDirection == LayoutDirection.Rtl
    val spaceStart = if (isRtl) spaceRight else spaceLeft
    val spaceEnd = if (isRtl) spaceLeft else spaceRight

    val placement = listOf(
        BubblePlacement.Top to spaceTop,
        BubblePlacement.Bottom to spaceBottom,
        BubblePlacement.Start to spaceStart,
        BubblePlacement.End to spaceEnd,
    ).maxByOrNull { it.second }!!.first

    val alignment = when (placement) {
        BubblePlacement.Top, BubblePlacement.Bottom -> autoBubbleAlignment(spaceStart, spaceEnd)
        BubblePlacement.Start, BubblePlacement.End -> autoBubbleAlignment(spaceTop, spaceBottom)
        BubblePlacement.Auto -> unresolvedBubbleAutoPlacementError()
    }
    return placement to alignment
}

/**
 * Выбирает [BubbleAlignment] по разнице свободного места на двух концах перпендикулярной оси.
 */
private fun autoBubbleAlignment(spaceAtStart: Float, spaceAtEnd: Float): BubbleAlignment {
    val diff = spaceAtEnd - spaceAtStart
    val threshold = AUTO_ALIGNMENT_CENTER_THRESHOLD_RATIO * maxOf(spaceAtStart, spaceAtEnd, 1f)
    return when {
        diff > threshold -> BubbleAlignment.Start
        diff < -threshold -> BubbleAlignment.End
        else -> BubbleAlignment.Center
    }
}

private const val AUTO_ALIGNMENT_CENTER_THRESHOLD_RATIO = 0.15f

private fun mirrorAlignmentRtl(alignment: BubbleAlignment): BubbleAlignment = when (alignment) {
    BubbleAlignment.Start -> BubbleAlignment.End
    BubbleAlignment.End -> BubbleAlignment.Start
    BubbleAlignment.Center -> alignment
}

/**
 * Каноническая геометрия — круг-якорь у нижнего края [size], тело растёт вверх, [alignment]
 * управляет горизонтальной позицией круга.
 */
@Suppress("LongParameterList", "CyclomaticComplexMethod")
private fun buildCanonicalBubblePath(
    size: Size,
    progress: Float,
    circleDiameterPx: Float,
    neckWidthPx: Float,
    neckLengthPx: Float,
    neckFilletRadiusPx: Float,
    bodyCornerRadiusPx: Float,
    bodyNearCornerRadiusPx: Float,
    alignment: BubbleAlignment,
): Path {
    val p = progress.coerceIn(0f, 1f)

    val circleLeft = when (alignment) {
        BubbleAlignment.Start -> 0f
        BubbleAlignment.Center -> (size.width - circleDiameterPx) / 2f
        BubbleAlignment.End -> size.width - circleDiameterPx
    }
    val circleTop = size.height - circleDiameterPx
    val circleRect = Rect(circleLeft, circleTop, circleLeft + circleDiameterPx, circleTop + circleDiameterPx)
    val circleCenterX = circleLeft + circleDiameterPx / 2f

    if (p <= 0f) {
        return Path().apply { addOval(circleRect) }
    }

    val bodyFinalRect = Rect(0f, 0f, size.width, size.height - circleDiameterPx - neckLengthPx)
    val bodyRect = Rect(
        left = lerp(circleRect.left, bodyFinalRect.left, p),
        top = lerp(circleRect.top, bodyFinalRect.top, p),
        right = lerp(circleRect.right, bodyFinalRect.right, p),
        bottom = lerp(circleRect.bottom, bodyFinalRect.bottom, p),
    )
    val overlapPx = neckWidthPx * NECK_OVERLAP_RATIO
    val neckTopY = bodyRect.bottom
    val neckBottomY = lerp(circleRect.top, circleRect.top + overlapPx, p)
    val neckIncluded = neckTopY < neckBottomY
    val maxSafeCorner = minOf(bodyRect.width, bodyRect.height) / 2f
    val cornerBlend = ((p - CORNER_SHARPEN_THRESHOLD) / (1f - CORNER_SHARPEN_THRESHOLD)).coerceIn(0f, 1f)
    val lerpedCorner = lerp(maxSafeCorner, bodyCornerRadiusPx, cornerBlend).coerceAtMost(maxSafeCorner)
    val marginToFillet = (circleDiameterPx / 2f - neckWidthPx / 2f - neckFilletRadiusPx).coerceAtLeast(0f)
    val safeNearCornerPx = bodyNearCornerRadiusPx.coerceAtMost(marginToFillet * 0.8f).coerceAtMost(maxSafeCorner)
    val nearCornerBlendWindowPx = neckFilletRadiusPx.coerceAtLeast(1f)
    val nearCornerBlend = ((neckBottomY - neckTopY + nearCornerBlendWindowPx) / (2f * nearCornerBlendWindowPx))
        .coerceIn(0f, 1f)
    val nearCornerRoundTarget = lerp(maxSafeCorner, minOf(maxSafeCorner, marginToFillet * 0.8f), nearCornerBlend)
    val nearCorner = lerp(nearCornerRoundTarget, safeNearCornerPx, cornerBlend).coerceAtMost(maxSafeCorner)
    val farCorner = CornerRadius(lerpedCorner, lerpedCorner)
    val nearCornerRadius = CornerRadius(nearCorner, nearCorner)
    val roundRect = when (alignment) {
        BubbleAlignment.Start -> RoundRect(
            bodyRect,
            topLeft = farCorner,
            topRight = farCorner,
            bottomRight = farCorner,
            bottomLeft = nearCornerRadius,
        )
        BubbleAlignment.End -> RoundRect(
            bodyRect,
            topLeft = farCorner,
            topRight = farCorner,
            bottomRight = nearCornerRadius,
            bottomLeft = farCorner,
        )
        BubbleAlignment.Center -> RoundRect(
            bodyRect,
            topLeft = farCorner,
            topRight = farCorner,
            bottomRight = farCorner,
            bottomLeft = farCorner,
        )
    }
    val bodyPath = Path().apply { addRoundRect(roundRect) }

    val circlePath = Path().apply { addOval(circleRect) }
    val bodyUnionCircle = Path().apply { op(bodyPath, circlePath, PathOperation.Union) }
    if (!neckIncluded) {
        return bodyUnionCircle
    }
    val neckHalfWidth = lerp(circleDiameterPx / 2f, neckWidthPx / 2f, p)
    val filletRadius = lerp(0f, neckFilletRadiusPx, p)
    val neckPath = buildNeckPath(
        centerX = circleCenterX,
        topY = neckTopY,
        bottomY = neckBottomY,
        halfWidth = neckHalfWidth,
        filletRadius = filletRadius,
    )
    return Path().apply { op(bodyUnionCircle, neckPath, PathOperation.Union) }
}

/**
 * Строит прямоугольную шейку шириной 2×[halfWidth] со скруглёнными вогнутыми галтелями радиуса
 * [filletRadius] на обоих стыках (с телом и с кругом-якорем).
 */
private fun buildNeckPath(
    centerX: Float,
    topY: Float,
    bottomY: Float,
    halfWidth: Float,
    filletRadius: Float,
): Path {
    val leftX = centerX - halfWidth
    val rightX = centerX + halfWidth
    val fr = filletRadius
    return Path().apply {
        moveTo(leftX - fr, topY)
        arcTo(Rect(leftX - 2 * fr, topY, leftX, topY + 2 * fr), 270f, 90f, false)
        lineTo(leftX, bottomY - fr)
        arcTo(Rect(leftX - 2 * fr, bottomY - 2 * fr, leftX, bottomY), 0f, 90f, false)
        lineTo(rightX + fr, bottomY)
        arcTo(Rect(rightX, bottomY - 2 * fr, rightX + 2 * fr, bottomY), 90f, 90f, false)
        lineTo(rightX, topY + fr)
        arcTo(Rect(rightX, topY, rightX + 2 * fr, topY + 2 * fr), 180f, 90f, false)
        close()
    }
}

private const val NECK_OVERLAP_RATIO = 0.25f
private const val CORNER_SHARPEN_THRESHOLD = 0.85f
