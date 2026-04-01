package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.uikit.fixtures.SDK_NUMBER
import com.sdds.uikit.fixtures.stories.paginationdots.paginationDotsWithControls
import com.sdds.uikit.fixtures.testcases.PaginationDotsTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemPaginationDotsScreenshotTest(
    theme: String,
) : PaginationDotsTestCases(theme) {

    @Test
    override fun testPaginationDotsHorizontalMTwentyVisibleNine() {
        themedComponent {
            margins {
                paginationDotsHorizontalMTwentyVisibleNine(
                    R.style.Serv_Sdds_ComponentOverlays_PaginationDotsHorizontalM,
                )
            }
        }
    }

    @Test
    override fun testPaginationDotsVerticalMActiveTypeLineTenVisibleSeven() {
        themedComponent {
            margins {
                paginationDotsVerticalMActiveTypeLineTenVisibleSeven(
                    R.style.Serv_Sdds_ComponentOverlays_PaginationDotsVerticalMActiveTypeLine,
                )
            }
        }
    }

    @Test
    override fun testPaginationDotsHorizontalSThreeVisibleThree() {
        themedComponent {
            margins {
                paginationDotsHorizontalSThreeVisibleThree(
                    R.style.Serv_Sdds_ComponentOverlays_PaginationDotsHorizontalS,
                )
            }
        }
    }

    @Test
    override fun testPaginationDotsHorizontalSActiveTypeLineSevenVisibleFive() {
        themedComponent {
            margins {
                paginationDotsHorizontalSActiveTypeLineSevenVisibleFive(
                    R.style.Serv_Sdds_ComponentOverlays_PaginationDotsHorizontalSActiveTypeLine,
                )
            }
        }
    }

    @Test
    override fun testPaginationDotsHorizontalMOneVisibleOne() {
        themedComponent {
            margins {
                paginationDotsHorizontalMOneVisibleOne(R.style.Serv_Sdds_ComponentOverlays_PaginationDotsHorizontalM)
            }
        }
    }

    @Test
    override fun testPaginationDotsWithControlsHorizontalM() {
        themedComponent(
            action = {
                repeat(5) {
                    onView(withContentDescription("Next")).perform(click())
                }
            },
        ) {
            margins {
                paginationDotsWithControls(
                    context = context,
                    R.style.Serv_Sdds_ComponentOverlays_PaginationDotsHorizontalM,
                )
            }
        }
    }

    @Test
    override fun testPaginationDotsWithControlsVerticalMActiveTypeLine() {
        themedComponent(
            action = {
                repeat(5) {
                    onView(withContentDescription("Next")).perform(click())
                }
            },
        ) {
            margins {
                paginationDotsWithControls(
                    context = context,
                    R.style.Serv_Sdds_ComponentOverlays_PaginationDotsVerticalMActiveTypeLine,
                )
            }
        }
    }
}
