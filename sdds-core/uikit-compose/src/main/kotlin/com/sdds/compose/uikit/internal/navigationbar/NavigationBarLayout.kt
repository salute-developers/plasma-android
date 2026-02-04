package com.sdds.compose.uikit.internal.navigationbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
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
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.roundToInt

@Composable
internal fun NavigationBarLayout(
    modifier: Modifier,
    startContent: (@Composable () -> Unit)?,
    centerContent: (@Composable () -> Unit)?,
    endContent: (@Composable () -> Unit)?,
    contentPadding: Dp,
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
    textAlign: NavigationBarTextAlign,
) {
    Layout(
        modifier = modifier,
        measurePolicy = remember(centerAlignmentStrategy, textAlign) {
            NavBarMeasurePolicy(centerAlignmentStrategy, textAlign)
        },
        content = {
            startContent?.let {
                Box(
                    modifier = Modifier
                        .layoutId("StartContent")
                        .padding(end = contentPadding),
                    content = { startContent() },
                )
            }
            centerContent?.let {
                Box(
                    modifier = Modifier
                        .layoutId("CenterContent"),
                    content = { centerContent() },
                )
            }
            endContent?.let {
                Box(
                    modifier = Modifier
                        .layoutId("EndContent")
                        .padding(start = contentPadding),
                    content = { endContent() },
                )
            }
        },
    )
}

private class NavBarMeasurePolicy(
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
    textAlign: NavigationBarTextAlign,
) : MeasurePolicy {

    private val hasAbsoluteCenter = textAlign == NavigationBarTextAlign.Center &&
        centerAlignmentStrategy == NavBarCenterAlignmentStrategy.Absolute

    @Suppress("LongMethod")
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)
        val startContent = measurables
            .firstOrNull { it.layoutId == "StartContent" }
            ?.measure(looseConstraints.copy(minWidth = 0))

        val endContent = measurables
            .firstOrNull { it.layoutId == "EndContent" }
            ?.measure(looseConstraints.offset(horizontal = -startContent.widthOrZero()))

        val centerConstraints = if (hasAbsoluteCenter) {
            looseConstraints.offset(
                -2 * maxOf(startContent.widthOrZero(), endContent.widthOrZero()),
            )
        } else {
            looseConstraints.offset(-startContent.widthOrZero() - endContent.widthOrZero())
        }
        val centerContent = measurables.firstOrNull { it.layoutId == "CenterContent" }
            ?.measure(centerConstraints)

        val height = maxOf(
            startContent.heightOrZero(),
            centerContent.heightOrZero(),
            endContent.heightOrZero(),
        )
        val width = constraints.constrainWidth(
            startContent.widthOrZero() + centerContent.widthOrZero() + endContent.widthOrZero(),
        )

        return layout(width, height) {
            startContent?.let {
                it.placeRelative(
                    x = 0,
                    y = calculateVerticalPosition(
                        containerHeight = height,
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
                        startContent.widthOrZero()
                    },
                    y = calculateVerticalPosition(
                        containerHeight = height,
                        elementHeight = it.heightOrZero(),
                    ),
                )
            }
            endContent?.let {
                it.placeRelative(
                    x = width - it.widthOrZero(),
                    y = calculateVerticalPosition(
                        containerHeight = height,
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
}
