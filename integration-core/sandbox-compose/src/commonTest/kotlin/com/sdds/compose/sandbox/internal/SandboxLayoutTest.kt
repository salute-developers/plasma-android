package com.sdds.compose.sandbox.internal

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SandboxLayoutTest {

    @Test
    fun layoutIsResolvedOnlyFromWindowSize() {
        assertEquals(SandboxLayout.Mobile, resolveSandboxLayout(isLargeDevice = false))
        assertEquals(SandboxLayout.Large, resolveSandboxLayout(isLargeDevice = true))
    }

    @Test
    fun slideTransitionsAreUsedOnlyForMobileLayout() {
        assertTrue(SandboxLayout.Mobile.usesSlideTransitions())
        assertFalse(SandboxLayout.Large.usesSlideTransitions())
    }

    @Test
    fun firstStoryIsShownAtStartOnlyForLargeLayout() {
        assertFalse(SandboxLayout.Mobile.showsFirstStoryAtStart())
        assertTrue(SandboxLayout.Large.showsFirstStoryAtStart())
    }

    @Test
    fun mobileStoryShowsExplicitBackButton() {
        assertTrue(SandboxLayout.Mobile.showsMobileBackButton(isComponentStory = true))
    }

    @Test
    fun mobileComponentListHidesExplicitBackButton() {
        assertFalse(SandboxLayout.Mobile.showsMobileBackButton(isComponentStory = false))
    }

    @Test
    fun largeLayoutHidesMobileBackButton() {
        assertFalse(SandboxLayout.Large.showsMobileBackButton(isComponentStory = true))
    }
}
