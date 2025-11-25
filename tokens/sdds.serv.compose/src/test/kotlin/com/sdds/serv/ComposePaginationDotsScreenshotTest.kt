package com.sdds.serv

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.paginationdots.ActiveTypeLine
import com.sdds.serv.styles.paginationdots.M
import com.sdds.serv.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.serv.styles.paginationdots.PaginationDotsVertical
import com.sdds.serv.styles.paginationdots.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.paginationdots.PaginationDotsItemOneVisibleOne
import com.sdds.testing.compose.paginationdots.PaginationDotsItemSevenVisibleFive
import com.sdds.testing.compose.paginationdots.PaginationDotsItemTenVisibleSeven
import com.sdds.testing.compose.paginationdots.PaginationDotsItemThreeVisibleThree
import com.sdds.testing.compose.paginationdots.PaginationDotsItemTwentyVisibleNine
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposePaginationDotsScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testPaginationDotsMHorizontalItemTwentyVisibleNine() {
        composeTestRule.content {
            PaginationDotsItemTwentyVisibleNine(
                PaginationDotsHorizontal.M.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }

    @Test
    fun testPaginationDotsMActiveTypeLineVerticalItemTwentyVisibleNine() {
        composeTestRule.content {
            PaginationDotsItemTenVisibleSeven(
                PaginationDotsVertical.M.ActiveTypeLine.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }

    @Test
    fun testPaginationDotsSHorizontalItemThreeVisibleThree() {
        composeTestRule.content {
            PaginationDotsItemThreeVisibleThree(
                PaginationDotsHorizontal.S.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }

    @Test
    fun testPaginationDotsSActiveTypeLineHorizontalItemSevenVisibleFive() {
        composeTestRule.content {
            PaginationDotsItemSevenVisibleFive(
                PaginationDotsHorizontal.S.ActiveTypeLine.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }

    @Test
    fun testPaginationDotsMHorizontalItemOneVisibleOne() {
        composeTestRule.content {
            PaginationDotsItemOneVisibleOne(
                PaginationDotsHorizontal.M.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }

    @Test
    fun testPaginationDotsMHorizontalItemTwentyVisibleNineScroll() {
        composeTestRule.content {
            PaginationDotsItemTwentyVisibleNine(
                PaginationDotsHorizontal.M.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
        repeat(4) {
            composeTestRule.onNodeWithTag("iconButtonRight").performClick()
        }
    }

    @Test
    fun testPaginationDotsMVerticalItemTwentyVisibleNineScroll() {
        composeTestRule.content {
            PaginationDotsItemTwentyVisibleNine(
                PaginationDotsVertical.M.ActiveTypeLine.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
        repeat(4) {
            composeTestRule.onNodeWithTag("iconButtonRight").performClick()
        }
    }
}
