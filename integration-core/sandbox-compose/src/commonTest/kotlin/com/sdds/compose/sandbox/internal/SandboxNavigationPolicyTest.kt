package com.sdds.compose.sandbox.internal

import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.SandboxNavigationPolicy
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SandboxNavigationPolicyTest {

    @Test
    fun autoKeepsPreviousWindowSizeBasedBehavior() {
        assertEquals(SandboxLayout.Mobile, SandboxNavigationPolicy.Auto.resolve(isLargeDevice = false))
        assertEquals(SandboxLayout.Tv, SandboxNavigationPolicy.Auto.resolve(isLargeDevice = true))
    }

    @Test
    fun explicitPoliciesDoNotDependOnWindowSize() {
        assertEquals(SandboxLayout.Tv, SandboxNavigationPolicy.Tv.resolve(isLargeDevice = false))
        assertEquals(SandboxLayout.Desktop, SandboxNavigationPolicy.Desktop.resolve(isLargeDevice = false))
        assertEquals(SandboxLayout.Desktop, SandboxNavigationPolicy.Desktop.resolve(isLargeDevice = true))
    }

    @Test
    fun desktopNavigationBecomesPersistentAtBreakpoint() {
        assertFalse(isPersistentDesktopNavigation(PersistentDesktopNavigationBreakpoint - 1.dp))
        assertTrue(isPersistentDesktopNavigation(PersistentDesktopNavigationBreakpoint))
        assertTrue(isPersistentDesktopNavigation(PersistentDesktopNavigationBreakpoint + 1.dp))
    }

    @Test
    fun slideTransitionsAreUsedOnlyForMobileLayout() {
        assertTrue(SandboxLayout.Mobile.usesSlideTransitions())
        assertFalse(SandboxLayout.Tv.usesSlideTransitions())
        assertFalse(SandboxLayout.Desktop.usesSlideTransitions())
    }
}
