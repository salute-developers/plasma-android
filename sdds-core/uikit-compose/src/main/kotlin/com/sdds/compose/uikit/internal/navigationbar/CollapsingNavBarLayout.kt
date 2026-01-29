package com.sdds.compose.uikit.internal.navigationbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFirst
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.ProvideTextStyle
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * The base [Layout] for all top app bars. This function lays out a top app bar navigation icon
 * (leading icon), a title (header), and action icons (trailing icons). Note that the navigation and
 * the actions are optional.
 *
 * @param heightPx the total height this layout is capped to
 * @param navigationIconContentColor the content color that will be applied via a
 * [LocalContentColor] when composing the navigation icon
 * @param titleContentColor the color that will be applied via a [LocalContentColor] when composing
 * the title
 * @param actionIconContentColor the content color that will be applied via a [LocalContentColor]
 * when composing the action icons
 * @param title the top app bar title (header)
 * @param titleTextStyle the title's text style
 * @param modifier a [Modifier]
 * @param alpha the title's alpha
 * @param titleVerticalArrangement the title's vertical arrangement
 * @param titleHorizontalArrangement the title's horizontal arrangement
 * @param titleBottomPadding the title's bottom padding
 * @param hideTitleSemantics hides the title node from the semantic tree. Apply this
 * boolean when this layout is part of a [BaseCollapsingNavBar] to hide the title's semantics
 * from accessibility services. This is needed to avoid having multiple titles visible to
 * accessibility services at the same time, when animating between collapsed / expanded states.
 * @param navigationIcon a navigation icon [Composable]
 * @param actions actions [Composable]
 */
@Composable
internal fun CollapsingNavBarLayout(
    modifier: Modifier,
    heightPx: Float,
    navigationIconContentColor: Color,
    titleContentColor: Color,
    descriptionContentColor: Color,
    actionIconContentColor: Color,
    title: @Composable () -> Unit,
    description: @Composable () -> Unit,
    titleTextStyle: TextStyle,
    descriptionTextStyle: TextStyle,
    alpha: Float,
    textVerticalArrangement: Arrangement.Vertical,
    textHorizontalArrangement: Arrangement.Horizontal,
    hideTitleSemantics: Boolean,
    navigationIcon: @Composable () -> Unit,
    actions: @Composable () -> Unit,
    backgroundContent: @Composable BoxScope.() -> Unit = {},
) {
    //TODO Использовать новый лэйаут из обычного навбара, добавить в апи
    Layout(
        {
            Box(
                Modifier
                    .layoutId("navigationIcon")
                    .padding(start = TopAppBarHorizontalPadding) //todo
            ) {
                CompositionLocalProvider(
                    LocalTint provides navigationIconContentColor,
                    content = navigationIcon
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp), //todo
                horizontalAlignment = when (textHorizontalArrangement) {
                    Arrangement.Center -> Alignment.CenterHorizontally
                    Arrangement.End -> Alignment.End
                    else -> Alignment.Start
                },
                modifier = Modifier
                    .layoutId("text")
                    .padding(horizontal = TopAppBarHorizontalPadding) //todo
                    .then(if (hideTitleSemantics) Modifier.clearAndSetSemantics { } else Modifier)
                    .graphicsLayer(alpha = alpha)
            ) {
                ProvideTextStyle(
                    color = { titleContentColor },
                    value = titleTextStyle,
                    content = title
                )
                ProvideTextStyle(
                    color = { descriptionContentColor },
                    value = descriptionTextStyle,
                    content = description
                )
            }
            Box(
                Modifier
                    .layoutId("actionIcons")
                    .padding(end = TopAppBarHorizontalPadding) //todo
            ) {
                CompositionLocalProvider(
                    LocalTint provides actionIconContentColor,
                    content = actions
                )
            }
            Box(
                modifier = Modifier
                    .layoutId("expandedContent")
                    .graphicsLayer(alpha = alpha)
                ,
                content = backgroundContent
            )
        },
        modifier = modifier
    ) { measurables, constraints ->
        val navigationIconPlaceable =
            measurables.fastFirst { it.layoutId == "navigationIcon" }
                .measure(constraints.copy(minWidth = 0))
        val actionIconsPlaceable =
            measurables.fastFirst { it.layoutId == "actionIcons" }
                .measure(constraints.copy(minWidth = 0))

        val maxTextWidth = if (constraints.maxWidth == Constraints.Infinity) {
            constraints.maxWidth
        } else {
            (constraints.maxWidth - navigationIconPlaceable.width - actionIconsPlaceable.width)
                .coerceAtLeast(0)
        }
        val textPlaceable =
            measurables.fastFirst { it.layoutId == "text" }
                .measure(constraints.copy(minWidth = 0, maxWidth = maxTextWidth))

        val layoutHeight = if (heightPx.isNaN()) 0 else heightPx.roundToInt()
        val expandedContentPlaceable = measurables.fastFirst { it.layoutId == "expandedContent" }
            .measure(
                constraints.copy(
                    minHeight = layoutHeight,
                    maxHeight = layoutHeight,
                    minWidth = constraints.maxWidth,
                    maxWidth = constraints.maxWidth,
                )
            )

        layout(constraints.maxWidth, layoutHeight) {
            // Expanded content
            expandedContentPlaceable.placeRelative(0, 0)

            // Navigation icon
            navigationIconPlaceable.placeRelative(
                x = 0,
                y = (layoutHeight - navigationIconPlaceable.height) / 2
            )

            // Title + description
            textPlaceable.placeRelative(
                x = when (textHorizontalArrangement) {
                    Arrangement.Center -> {
                        var baseX = (constraints.maxWidth - textPlaceable.width) / 2
                        if (baseX < navigationIconPlaceable.width) {
                            // May happen if the navigation is wider than the actions and the
                            // title is long. In this case, prioritize showing more of the title by
                            // offsetting it to the right.
                            baseX += (navigationIconPlaceable.width - baseX)
                        } else if (baseX + textPlaceable.width >
                            constraints.maxWidth - actionIconsPlaceable.width
                        ) {
                            // May happen if the actions are wider than the navigation and the title
                            // is long. In this case, offset to the left.
                            baseX += ((constraints.maxWidth - actionIconsPlaceable.width) -
                                    (baseX + textPlaceable.width))
                        }
                        baseX
                    }

                    Arrangement.End ->
                        constraints.maxWidth - textPlaceable.width - actionIconsPlaceable.width
                    // Arrangement.Start.
                    // An TopAppBarTitleInset will make sure the title is offset in case the
                    // navigation icon is missing.
                    else -> max(TopAppBarTitleInset.roundToPx(), navigationIconPlaceable.width)
                },
                y = when (textVerticalArrangement) {
                    Arrangement.Center -> (layoutHeight - textPlaceable.height) / 2
                    // Apply bottom padding from the title's baseline only when the Arrangement is
                    // "Bottom".
                    Arrangement.Bottom -> layoutHeight - textPlaceable.height
                    // Arrangement.Top
                    else -> 0
                }
            )

            // Action icons
            actionIconsPlaceable.placeRelative(
                x = constraints.maxWidth - actionIconsPlaceable.width,
                y = (layoutHeight - actionIconsPlaceable.height) / 2
            )
        }
    }
}

private val TopAppBarHorizontalPadding = 4.dp //todo remove

// A title inset when the App-Bar is a Medium or Large one. Also used to size a spacer when the
// navigation icon is missing.
private val TopAppBarTitleInset = 16.dp - TopAppBarHorizontalPadding //todo remove