package com.sdds.plasma.homeds

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTouchInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarInternalPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.Default
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarActionEndCenterStartRelative
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarCollapsedTextAlignCenter
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarCollapsedTextAlignEnd
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarCollapsedTextAlignStart
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarExpandedTitleDescription
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarHasActionsStart
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarLongContent
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarLongExpandedTitleDescription
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarNoActionStartCollapsedTextAlignStart
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarNoActionsCollapsedTextEnd
import com.sdds.testing.compose.navigationbar.collapsing.CollapsingNavBarNoCollapsedTitleLongDesc
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCollapsingNavigationBar(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testCollapsingNavBarExpandedTitleDescStartAbsolute() {
        composeTestRule.content {
            CollapsingNavBarExpandedTitleDescription(CollapsingNavigationBarMainPage.Default.style())
        }
    }

    @Test
    fun testCollapsingNavBarLongExpandedTitleDesc() {
        composeTestRule.content {
            CollapsingNavBarLongExpandedTitleDescription(CollapsingNavigationBarMainPage.Default.style())
        }
    }

    @Test
    fun testCollapsingNavBarLongContent() {
        composeTestRule.content {
            CollapsingNavBarLongContent(CollapsingNavigationBarMainPage.Default.style())
        }
    }

    @Test
    fun testCollapsingNavBarActionEndCenterStartRelative() {
        composeTestRule.content {
            CollapsingNavBarActionEndCenterStartRelative(CollapsingNavigationBarInternalPage.Default.style())
        }
    }

    @Test
    fun testCollapsingNavbarNoCollapsedTitleLongDesc() {
        composeTestRule.content {
            CollapsingNavBarNoCollapsedTitleLongDesc(CollapsingNavigationBarMainPage.Default.style())
        }
        composeTestRule.onNodeWithText("Title").performTouchInput {
            down(center)
            moveBy(Offset(0f, -300f))
            up()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testCollapsingNavBarCollapsedTextAlignStart() {
        composeTestRule.content {
            CollapsingNavBarCollapsedTextAlignStart(CollapsingNavigationBarInternalPage.Default.style())
        }
        composeTestRule.onNodeWithText("Title").performTouchInput {
            down(center)
            moveBy(Offset(0f, -300f))
            up()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testCollapsingNavBarNoActionsCollapsedTextEnd() {
        composeTestRule.content {
            CollapsingNavBarNoActionsCollapsedTextEnd(CollapsingNavigationBarInternalPage.Default.style())
        }
        composeTestRule.onNodeWithText("Title").performTouchInput {
            down(center)
            moveBy(Offset(0f, -300f))
            up()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testCollapsingNavBarNoActionStartCollapsedTextAlignStart() {
        composeTestRule.content {
            CollapsingNavBarNoActionStartCollapsedTextAlignStart(CollapsingNavigationBarInternalPage.Default.style())
        }
    }

    @Test
    fun testCollapsingNavBarHasActionsStart() {
        composeTestRule.content {
            CollapsingNavBarHasActionsStart(CollapsingNavigationBarMainPage.Default.style())
        }
        composeTestRule.onNodeWithText("Title").performTouchInput {
            down(center)
            moveBy(Offset(0f, -300f))
            up()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testCollapsingNavBarCollapsedTextAlignCenter() {
        composeTestRule.content {
            CollapsingNavBarCollapsedTextAlignCenter(CollapsingNavigationBarMainPage.Default.style())
        }
        composeTestRule.onNodeWithText("Title").performTouchInput {
            down(center)
            moveBy(Offset(0f, -300f))
            up()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testCollapsingNavBarCollapsedTextAlignEnd() {
        composeTestRule.content {
            CollapsingNavBarCollapsedTextAlignEnd(CollapsingNavigationBarMainPage.Default.style())
        }
        composeTestRule.onNodeWithText("Title").performTouchInput {
            down(center)
            moveBy(Offset(0f, -300f))
            up()
        }
        composeTestRule.mainClock.advanceTimeByFrame()
    }
}
