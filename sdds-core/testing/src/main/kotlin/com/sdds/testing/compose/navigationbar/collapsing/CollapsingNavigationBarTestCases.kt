package com.sdds.testing.compose.navigationbar.collapsing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.CollapsingNavigationBar
import com.sdds.compose.uikit.CollapsingNavigationBarDefaults
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarScrollBehavior
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.rememberCollapsingNavigationBarState
import com.sdds.icons.R

/**
 * Тест-кейсы для [CollapsingNavigationBar]
 */
/**
 * PLASMA-T2490
 */
@Composable
fun CollapsingNavBarExpandedTitleDescription(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.Start,
        collapsedTextAlign = NavigationBarTextAlign.Start,
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2491
 */
@Composable
fun CollapsingNavBarLongExpandedTitleDescription(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTitle = textContent(LONG_TITLE),
        expandedDescription = textContent(LONG_DESCRIPTION),
        expandedTextAlign = NavigationBarTextAlign.Center,
        collapsedTextAlign = NavigationBarTextAlign.Center,
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2492
 */
@Composable
fun CollapsingNavBarLongContent(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        actionEnd = actionEnd(false),
        expandedTextAlign = NavigationBarTextAlign.Center,
        collapsedTextAlign = NavigationBarTextAlign.End,
        content = content(LONG_DESCRIPTION),
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Relative,
    )
}

/**
 * PLASMA-T2493
 */
@Composable
fun CollapsingNavBarActionEndCenterStartRelative(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        actionStart = actionStart(false),
        actionEnd = actionEnd(true),
        collapsedTextAlign = NavigationBarTextAlign.Center,
        expandedTextAlign = NavigationBarTextAlign.Start,
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Relative,
    )
}

/**
 * PLASMA-T2496
 */
@Composable
fun CollapsingNavBarNoCollapsedTitleLongDesc(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.Start,
        collapsedTitle = null,
        collapsedDescription = textContent(LONG_TITLE),
        collapsedTextAlign = NavigationBarTextAlign.Center,
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2515
 */
@Composable
fun CollapsingNavBarCollapsedTextAlignStart(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.Start,
        collapsedTextAlign = NavigationBarTextAlign.Start,
        actionStart = actionStart(false),
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2516
 */
@Composable
fun CollapsingNavBarNoActionsCollapsedTextEnd(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.Start,
        collapsedTextAlign = NavigationBarTextAlign.End,
        actionStart = actionStart(false),
        actionEnd = actionEnd(false),
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2517
 */
@Composable
fun CollapsingNavBarNoActionStartCollapsedTextAlignStart(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.End,
        collapsedTextAlign = NavigationBarTextAlign.End,
        actionStart = actionStart(false),
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2518
 */
@Composable
fun CollapsingNavBarHasActionsStart(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.Start,
        collapsedTextAlign = NavigationBarTextAlign.Start,
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2519
 */
@Composable
fun CollapsingNavBarCollapsedTextAlignCenter(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.Start,
        collapsedTextAlign = NavigationBarTextAlign.Center,
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * PLASMA-T2520
 */
@Composable
fun CollapsingNavBarCollapsedTextAlignEnd(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBarCommon(
        style = style,
        expandedTextAlign = NavigationBarTextAlign.Start,
        collapsedTextAlign = NavigationBarTextAlign.End,
        centerAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    )
}

/**
 * Общий CollapsingNavBar для тест-кейсов
 */
@Composable
private fun CollapsingNavigationBarCommon(
    modifier: Modifier = Modifier,
    style: CollapsingNavigationBarStyle,
    expandedTitle: (@Composable () -> Unit)? = textContent("Title"),
    expandedDescription: (@Composable () -> Unit)? = textContent("Description"),
    expandedTextAlign: NavigationBarTextAlign,
    collapsedTitle: (@Composable () -> Unit)? = textContent("Title"),
    collapsedDescription: (@Composable () -> Unit)? = textContent("Description"),
    collapsedTextAlign: NavigationBarTextAlign,
    actionStart: (@Composable RowScope.() -> Unit)? = actionStart(true),
    actionEnd: (@Composable RowScope.() -> Unit)? = actionEnd(true),
    content: (@Composable () -> Unit)? = content("Content"),
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
    scrollBehavior: NavigationBarScrollBehavior = CollapsingNavigationBarDefaults.exitUntilCollapsedScrollBehavior(
        rememberCollapsingNavigationBarState(),
    ),
) {
    Column {
        CollapsingNavigationBar(
            modifier = modifier,
            style = style,
            expandedTitle = expandedTitle,
            expandedDescription = expandedDescription,
            expandedTextAlign = expandedTextAlign,
            collapsedTitle = collapsedTitle,
            collapsedDescription = collapsedDescription,
            collapsedTextAlign = collapsedTextAlign,
            actionStart = actionStart,
            actionEnd = actionEnd,
            content = content,
            centerAlignmentStrategy = centerAlignmentStrategy,
            scrollBehavior = scrollBehavior,
        )
    }
}

/**
 * Actions left
 */
private fun actionStart(hasAction: Boolean): (@Composable RowScope.() -> Unit)? {
    return if (hasAction) {
        @Composable {
            Icon(
                painter = painterResource(R.drawable.ic_search_24),
                contentDescription = "",
            )
            Icon(
                painter = painterResource(R.drawable.ic_plus_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

/**
 * Actions right
 */
private fun actionEnd(hasAction: Boolean): (@Composable RowScope.() -> Unit)? {
    return if (hasAction) {
        @Composable {
            Icon(
                painter = painterResource(R.drawable.ic_menu_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

/**
 * Content
 */
private fun content(text: String): (@Composable () -> Unit)? {
    return if (text.isEmpty()) {
        null
    } else {
        @Composable {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) { Text(text) }
        }
    }
}

/**
 * Text content
 */
private fun textContent(text: String): (@Composable () -> Unit)? {
    return if (text.isEmpty()) {
        null
    } else {
        @Composable { Text(text) }
    }
}

private const val LONG_DESCRIPTION =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
        "It has survived not only five centuries, but also the leap into electronic typesetting, " +
        "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
        "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
        "like Aldus PageMaker including versions of Lorem Ipsum."

private const val LONG_TITLE =
    "There is no one who loves pain itself, who seeks after it and wants to have it, simply " +
        "because it is pain..."
