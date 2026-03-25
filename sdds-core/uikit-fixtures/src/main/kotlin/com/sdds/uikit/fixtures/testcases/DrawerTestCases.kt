package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.DrawerLayout
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.drawer.CloseAlignment
import com.sdds.uikit.fixtures.stories.drawer.DrawerUiState
import com.sdds.uikit.fixtures.stories.drawer.drawer
import com.sdds.uikit.fixtures.stories.scrollbar.ScrollBarUiState
import com.sdds.uikit.fixtures.stories.scrollbar.ScrollOrientation
import com.sdds.uikit.fixtures.stories.scrollbar.scrollBar

/**
 * Тест-кейсы для [com.sdds.uikit.Drawer]
 */
@Suppress("UndocumentedPublicFunction")
abstract class DrawerTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2236
     */
    abstract fun testDrawerCloseInnerMStartHeader()

    /**
     * PLASMA-T2237
     */
    abstract fun testDrawerCloseOuterMHasShadowTopFooterHasOverlay()

    /**
     * PLASMA-T2238
     */
    abstract fun testDrawerCloseNoneEndHeaderFooter()

    /**
     * PLASMA-T2239
     */
    abstract fun testDrawerCloseInnerMBottomEnd()

    /**
     * PLASMA-T2242
     */
    abstract fun testDrawerPeakOffSet()

    /**
     * PLASMA-T2236
     */
    abstract fun testDrawerCloseInnerMStartCloseIconAbsolute()

    fun ComponentScope.drawerCloseInnerMStartHeader(style: Int): DrawerLayout =
        fillSize {
            drawer(
                context = context,
                style = style,
                state = DrawerUiState(
                    variant = "",
                    hasOverlay = false,
                    closeIconAlignment = CloseAlignment.Left,
                    alignment = DrawerLayout.DrawerPlacement.LEFT,
                    absoluteClosePlacement = false,
                    gesturesEnabled = true,
                    moveContentEnabled = true,
                    hasPeekOffset = false,
                    header = true,
                    footer = false,
                ),
            ).apply {
                drawer?.setBody(
                    scrollBar(
                        context,
                        state = ScrollBarUiState().copy(orientation = ScrollOrientation.VERTICAL),
                    ),
                )
            }
        }

    fun ComponentScope.drawerCloseOuterMTopFooterHasOverlay(style: Int): DrawerLayout =
        fillSize {
            drawer(
                context = context,
                style = style,
                state = DrawerUiState(
                    variant = "",
                    hasOverlay = true,
                    closeIconAlignment = CloseAlignment.Right,
                    alignment = DrawerLayout.DrawerPlacement.TOP,
                    absoluteClosePlacement = false,
                    gesturesEnabled = true,
                    moveContentEnabled = false,
                    hasPeekOffset = true,
                    header = false,
                    footer = true,
                ),
            )
        }

    fun ComponentScope.drawerCloseNoneEndHeaderFooter(style: Int): DrawerLayout =
        fillSize {
            drawer(
                context = context,
                style = style,
                state = DrawerUiState(
                    variant = "",
                    hasOverlay = false,
                    closeIconAlignment = CloseAlignment.Left,
                    alignment = DrawerLayout.DrawerPlacement.RIGHT,
                    absoluteClosePlacement = false,
                    gesturesEnabled = true,
                    moveContentEnabled = false,
                    hasPeekOffset = false,
                    header = true,
                    footer = true,
                ),
            ).apply {
                drawer?.setBody(
                    scrollBar(
                        context,
                        state = ScrollBarUiState().copy(orientation = ScrollOrientation.VERTICAL),
                    ),
                )
            }
        }

    fun ComponentScope.drawerCloseInnerMBottomEnd(style: Int): DrawerLayout =
        fillSize {
            drawer(
                context = context,
                style = style,
                state = DrawerUiState(
                    variant = "",
                    hasOverlay = false,
                    closeIconAlignment = CloseAlignment.Right,
                    alignment = DrawerLayout.DrawerPlacement.BOTTOM,
                    absoluteClosePlacement = false,
                    gesturesEnabled = false,
                    moveContentEnabled = false,
                    hasPeekOffset = false,
                    header = false,
                    footer = false,
                ),
            )
        }

    fun ComponentScope.drawerPeakOffSet(style: Int): DrawerLayout =
        fillSize {
            drawer(
                context = context,
                style = style,
                state = DrawerUiState(
                    variant = "",
                    hasOverlay = true,
                    closeIconAlignment = CloseAlignment.Left,
                    alignment = DrawerLayout.DrawerPlacement.RIGHT,
                    absoluteClosePlacement = false,
                    gesturesEnabled = true,
                    moveContentEnabled = false,
                    hasPeekOffset = true,
                    header = false,
                    footer = false,
                ),
            )
        }

    fun ComponentScope.drawerCloseInnerMStartCloseIconAbsolute(style: Int): DrawerLayout =
        fillSize {
            drawer(
                context = context,
                style = style,
                state = DrawerUiState(
                    variant = "",
                    hasOverlay = false,
                    closeIconAlignment = CloseAlignment.Left,
                    alignment = DrawerLayout.DrawerPlacement.LEFT,
                    absoluteClosePlacement = true,
                    gesturesEnabled = true,
                    moveContentEnabled = true,
                    hasPeekOffset = false,
                    header = false,
                    footer = false,
                ),
            ).apply {
                drawer?.setBody(
                    scrollBar(
                        context,
                        state = ScrollBarUiState().copy(orientation = ScrollOrientation.VERTICAL),
                    ),
                )
            }
        }
}
