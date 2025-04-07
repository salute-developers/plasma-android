package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.navigationdrawer.NavigationDrawerTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemNavigationDrawerScreenshotTest : NavigationDrawerTestCases("+night") {

    @Test
    override fun testNavigationDrawerLabelAmountOne() {
        themedComponent(
            action = {
                onView(withId(com.sdds.testing.R.id.navigation_drawer))
                    .perform(click())
            },
        ) {
            navigationDrawerLabelAmountOne(style = R.style.Sdkit_StarDs_ComponentOverlays_NavigationDrawer)
        }
    }

    @Test
    override fun testNavigationDrawerExpandedNoLabel() {
        themedComponent(
            action = {
                onView(withId(com.sdds.testing.R.id.navigation_drawer))
                    .perform(click())
            },
        ) {
            navigationDrawerExpandedNoLabel(style = R.style.Sdkit_StarDs_ComponentOverlays_NavigationDrawer)
        }
    }

    @Test
    override fun testNavigationDrawerCollapsedHasHeader() {
        themedComponent(
            action = {
                onView(withId(com.sdds.testing.R.id.navigation_drawer))
                    .perform(click())
            },
        ) {
            navigationDrawerCollapsedHasHeader(style = R.style.Sdkit_StarDs_ComponentOverlays_NavigationDrawer)
        }
    }

    @Test
    override fun testNavigationDrawerExpandedHasFooter() {
        themedComponent(
            action = {
                onView(withId(com.sdds.testing.R.id.navigation_drawer))
                    .perform(click())
            },
        ) {
            navigationDrawerExpandedHasFooter(style = R.style.Sdkit_StarDs_ComponentOverlays_NavigationDrawer)
        }
    }

    @Test
    override fun testNavigationDrawerCollapsedCounter() {
        themedComponent(
            action = {
                onView(withId(com.sdds.testing.R.id.navigation_drawer))
                    .perform(click())
            },
        ) {
            navigationDrawerCollapsedCounter(style = R.style.Sdkit_StarDs_ComponentOverlays_NavigationDrawer)
        }
    }

    @Test
    override fun testNavigationDrawerCounterHasHeaderFooter() {
        themedComponent(
            action = {
                onView(withId(com.sdds.testing.R.id.navigation_drawer))
                    .perform(click())
            },
        ) {
            navigationDrawerExpandedCounterHeaderFooter(style = R.style.Sdkit_StarDs_ComponentOverlays_NavigationDrawer)
        }
    }
}
