package com.sdds.plasma.homeds

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTouchInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarActionEndCenterStartRelative
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarCollapsedTextAlignCenter
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarCollapsedTextAlignEnd
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarCollapsedTextAlignStart
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarExpandedTitleDescription
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarHasActionsStart
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarLongContent
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarLongExpandedTitleDescription
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarNoActionStartCollapsedTextAlignStart
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarNoActionsCollapsedTextEnd
import com.sdds.compose.uikit.fixtures.testcases.CollapsingNavBarNoCollapsedTitleLongDesc
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarInternalPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.Default
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
