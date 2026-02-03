package com.sdds.compose.uikit.internal.navigationbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.navigationbar.NavBarMeasurePolicy.Companion.BackgroundContentId
import com.sdds.compose.uikit.internal.navigationbar.NavBarMeasurePolicy.Companion.CenterContentId
import com.sdds.compose.uikit.internal.navigationbar.NavBarMeasurePolicy.Companion.EndContentId
import com.sdds.compose.uikit.internal.navigationbar.NavBarMeasurePolicy.Companion.StartContentId
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.roundToInt

@Composable
internal fun NavigationBarLayout(
    modifier: Modifier,
    startContent: (@Composable () -> Unit)?,
    centerContent: (@Composable () -> Unit)?,
    endContent: (@Composable () -> Unit)?,
    backgroundContent: (@Composable BoxScope.() -> Unit)? = null,
    horizontalSpacing: Dp,
    paddings: PaddingValues,
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
    textAlign: NavigationBarTextAlign,
    alpha: () -> Float = { 1f },
    offsetPx: () -> Float = { 0f },
    onMainContentSizeChanged: (Int) -> Unit = {},
) {
    Layout(
        modifier = modifier,
        measurePolicy = remember(centerAlignmentStrategy, textAlign, offsetPx, onMainContentSizeChanged, paddings) {
            NavBarMeasurePolicy(centerAlignmentStrategy, textAlign, offsetPx, onMainContentSizeChanged, paddings)
        },
        content = {
            startContent?.let {
                Box(
                    modifier = Modifier
                        .layoutId(StartContentId)
                        .padding(end = horizontalSpacing),
                    content = { startContent() },
                )
            }
            centerContent?.let {
                Box(
                    modifier = Modifier
                        .graphicsLayer { this.alpha = alpha() }
                        .layoutId(CenterContentId),
                    content = { centerContent() },
                )
            }
            endContent?.let {
                Box(
                    modifier = Modifier
                        .layoutId(EndContentId)
                        .padding(start = horizontalSpacing),
                    content = { endContent() },
                )
            }
            backgroundContent?.let {
                Box(
                    modifier = Modifier
                        .graphicsLayer {
                            this.alpha = alpha()
                        }
                        .layoutId(BackgroundContentId),
                    content = { backgroundContent() },
                )
            }
        },
    )
}

private class NavBarMeasurePolicy(
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
    private val textAlign: NavigationBarTextAlign,
    private val offsetPx: (() -> Float)?,
    private val onMainContentSizeChanged: (Int) -> Unit,
    private val paddings: PaddingValues,
) : MeasurePolicy {

    private val hasAbsoluteCenter = textAlign == NavigationBarTextAlign.Center &&
        centerAlignmentStrategy == NavBarCenterAlignmentStrategy.Absolute

    @Suppress("LongMethod")
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val paddingStart = paddings.calculateStartPadding(layoutDirection).roundToPx()
        val paddingEnd = paddings.calculateEndPadding(layoutDirection).roundToPx()
        val paddingTop = paddings.calculateTopPadding().roundToPx()
        val paddingBottom = paddings.calculateBottomPadding().roundToPx()

        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)
        val startContent = measurables
            .firstOrNull { it.layoutId == StartContentId }
            ?.measure(looseConstraints)

        val endContent = measurables
            .firstOrNull { it.layoutId == EndContentId }
            ?.measure(looseConstraints.offset(horizontal = -startContent.widthOrZero()))

        val centerConstraints = if (hasAbsoluteCenter) {
            looseConstraints.offset(
                -2 * maxOf(startContent.widthOrZero(), endContent.widthOrZero()),
            )
        } else {
            looseConstraints.offset(-startContent.widthOrZero() - endContent.widthOrZero())
        }
        val centerContent = measurables.firstOrNull { it.layoutId == CenterContentId }
            ?.measure(centerConstraints)

        val contentHeight = maxOf(
            startContent.heightOrZero(),
            centerContent.heightOrZero(),
            endContent.heightOrZero(),
        )
        onMainContentSizeChanged.invoke(contentHeight + paddingTop + paddingBottom)
        val offset = (offsetPx?.invoke()?.roundToInt() ?: 0)
        val height = contentHeight + offset + paddingTop + paddingBottom
        val width = constraints.constrainWidth(
            startContent.widthOrZero() +
                centerContent.widthOrZero() +
                endContent.widthOrZero() +
                paddingStart +
                paddingEnd,
        )

        val backgroundContent = measurables.firstOrNull { it.layoutId == BackgroundContentId }
            ?.measure(
                constraints.copy(
                    minHeight = height,
                    maxHeight = height,
                    minWidth = constraints.maxWidth,
                    maxWidth = constraints.maxWidth,
                ),
            )

        return layout(width, height) {
            backgroundContent?.placeRelative(0, 0)
            startContent?.let {
                it.placeRelative(
                    x = paddingStart,
                    y = paddingTop + offset + calculateVerticalPosition(
                        containerHeight = contentHeight,
                        elementHeight = it.heightOrZero(),
                    ),
                )
            }
            centerContent?.let {
                it.placeRelative(
                    x = if (hasAbsoluteCenter) {
                        calculateCenterHorizontalPosition(
                            containerWidth = width,
                            elementWidth = it.widthOrZero(),
                        )
                    } else {
                        when (textAlign) {
                            NavigationBarTextAlign.Start -> paddingStart + startContent.widthOrZero()
                            NavigationBarTextAlign.Center -> {
                                val startPoint = paddingStart + startContent.widthOrZero()
                                val endPoint = width - paddingEnd - endContent.widthOrZero()
                                val centerPoint = startPoint + ((endPoint - startPoint) / 2)
                                centerPoint - it.widthOrZero() / 2
                            }
                            NavigationBarTextAlign.End ->
                                width -
                                    paddingEnd -
                                    it.widthOrZero() -
                                    endContent.widthOrZero()
                        }
                    },
                    y = paddingTop + offset + calculateVerticalPosition(
                        containerHeight = contentHeight,
                        elementHeight = it.heightOrZero(),
                    ),
                )
            }
            endContent?.let {
                it.placeRelative(
                    x = width - it.widthOrZero() - paddingEnd,
                    y = paddingTop + offset + calculateVerticalPosition(
                        containerHeight = contentHeight,
                        elementHeight = it.heightOrZero(),
                    ),
                )
            }
        }
    }

    private fun calculateVerticalPosition(
        containerHeight: Int,
        elementHeight: Int,
    ) = ((containerHeight - elementHeight) / 2f).roundToInt()

    private fun calculateCenterHorizontalPosition(
        containerWidth: Int,
        elementWidth: Int,
    ) = ((containerWidth - elementWidth) / 2f).roundToInt()

    companion object {
        const val StartContentId = "StartContent"
        const val CenterContentId = "CenterContent"
        const val EndContentId = "EndContent"
        const val BackgroundContentId = "BackgroundContent"
    }
}
