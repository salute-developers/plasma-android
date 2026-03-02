package com.sdds.testing.vs.navigationbar

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.NavigationBar

/**
 * Тест-кейсы для [NavigationBar]
 */
@Suppress("UndocumentedPublicFunction")
abstract class NavigationBarTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2339
     */
    abstract fun testNavigationBarMainPageNoBackground()

    /**
     * PLASMA-T2340
     */
    abstract fun testNavigationBarInternalPageNoBackgroundRounded()

    /**
     * PLASMA-T2341
     */
    abstract fun testNavigationBarInternalPageHasBackgroundLongText()

    /**
     * PLASMA-T2342
     */
    abstract fun testNavigationHasBackgroundRounded()

    /**
     * PLASMA-T2343
     */
    abstract fun testNavigationBarHasBackgroundShadow()

    /**
     * PLASMA-T2344
     */
    abstract fun testNavigationBarHasBackgroundShadowRounded()

    /**
     * PLASMA-T2470
     */
    abstract fun testNavigationBarInnerRelative()

    /**
     * PLASMA-T2471
     */
    abstract fun testNavigationBarLongDescription()

    fun ComponentScope.navigationBarInnerCenterNoDescription(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = "Title",
                    description = "",
                    contentText = "Content",
                    hasActionStart = true,
                    hasActionEnd = true,
                    textPlacement = TextPlacement.Inner,
                    contentPlacement = ContentPlacement.Inner,
                    textAlign = TextAlignment.Center,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Center,
                    centerAlignmentStrategy = AlignmentStrategy.Absolute,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }

    fun ComponentScope.navigationBarNoTextNoDescription(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = "",
                    description = "",
                    contentText = "Content",
                    hasActionStart = true,
                    hasActionEnd = true,
                    textPlacement = TextPlacement.Bottom,
                    textAlign = TextAlignment.Start,
                    contentPlacement = ContentPlacement.Bottom,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Start,
                    centerAlignmentStrategy = AlignmentStrategy.Absolute,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }

    fun ComponentScope.navigationBarLongTitleLongContent(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = LONG_TITLE,
                    description = "",
                    contentText = LONG_TEXT,
                    hasActionStart = true,
                    hasActionEnd = false,
                    textPlacement = TextPlacement.Inner,
                    textAlign = TextAlignment.Center,
                    contentPlacement = ContentPlacement.Bottom,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Center,
                    centerAlignmentStrategy = AlignmentStrategy.Absolute,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }

    fun ComponentScope.navigationBarNoContentInnerEndBottom(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = "Title",
                    description = "",
                    contentText = "",
                    hasActionStart = false,
                    hasActionEnd = true,
                    textPlacement = TextPlacement.Inner,
                    textAlign = TextAlignment.End,
                    contentPlacement = ContentPlacement.Bottom,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.End,
                    centerAlignmentStrategy = AlignmentStrategy.Absolute,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }

    fun ComponentScope.navigationBarLongTitle(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = LONG_TEXT,
                    description = "",
                    contentText = "Content",
                    hasActionStart = true,
                    hasActionEnd = true,
                    textPlacement = TextPlacement.Bottom,
                    contentPlacement = ContentPlacement.Inner,
                    textAlign = TextAlignment.Start,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Start,
                    centerAlignmentStrategy = AlignmentStrategy.Absolute,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }

    fun ComponentScope.navigationBarBottomCenter(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = "Title",
                    description = "",
                    contentText = "Content",
                    hasActionStart = true,
                    hasActionEnd = true,
                    textPlacement = TextPlacement.Bottom,
                    contentPlacement = ContentPlacement.Bottom,
                    textAlign = TextAlignment.Center,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Center,
                    centerAlignmentStrategy = AlignmentStrategy.Absolute,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }

    fun ComponentScope.navigationBarInnerRelative(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = "Title",
                    description = "Description",
                    contentText = "Content",
                    hasActionStart = false,
                    hasActionEnd = true,
                    textPlacement = TextPlacement.Inner,
                    contentPlacement = ContentPlacement.Inner,
                    textAlign = TextAlignment.Center,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Center,
                    centerAlignmentStrategy = AlignmentStrategy.Relative,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }

    fun ComponentScope.navigationBarLongDescription(style: Int): NavigationBar =
        fillSize {
            navigationBar(
                context = context,
                style = style,
                state = NavigationBarUiState(
                    variant = "",
                    appearance = "",
                    title = LONG_TITLE,
                    description = LONG_TEXT,
                    contentText = "Content",
                    hasActionStart = true,
                    hasActionEnd = false,
                    textPlacement = TextPlacement.Inner,
                    contentPlacement = ContentPlacement.Bottom,
                    textAlign = TextAlignment.Center,
                    contentBetweenActionsAlignment = ContentBetweenActionsAlignment.Center,
                    centerAlignmentStrategy = AlignmentStrategy.Absolute,
                ),
            ).apply {
                id = R.id.navigation_bar
            }
        }
}

private const val LONG_TEXT = "Lorem Ipsum is simply dummy text of the printing and typesetting " +
        "industry. Lorem Ipsum has been the industry's standard dummy text ever " +
        "since the 1500s, when an unknown printer took a galley of type and " +
        "scrambled it to make a type specimen book. It has survived not only " +
        "five centuries, but also the leap into electronic typesetting, " +
        "remaining essentially unchanged. It was popularised in the 1960s " +
        "with the release of Letraset sheets containing Lorem Ipsum passages, " +
        "and more recently with desktop publishing software like Aldus PageMaker " +
        "including versions of Lorem Ipsum."

private const val LONG_TITLE = "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, " +
        "consectetur, adipisci velit..."
