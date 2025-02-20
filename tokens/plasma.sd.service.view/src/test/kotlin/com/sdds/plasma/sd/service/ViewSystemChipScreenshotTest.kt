package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.chip.ChipTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemChipScreenshotTest(
    theme: String,
) : ChipTestCases(theme) {

    @Test
    override fun testChipLDefault() {
        themedComponent {
            chipLDefault(R.style.Plasma_SdService_ComponentOverlays_ChipLDefault)
        }
    }

    @Test
    override fun testChipMSecondary() {
        themedComponent {
            chipMSecondary(R.style.Plasma_SdService_ComponentOverlays_ChipMPilledSecondary)
        }
    }

    @Test
    override fun testChipSDisabled() {
        themedComponent {
            chipSDisabled(R.style.Plasma_SdService_ComponentOverlays_ChipSAccent)
        }
    }

    @Test
    override fun testChipXsDefault() {
        themedComponent {
            chipXsDefault(R.style.Plasma_SdService_ComponentOverlays_ChipXSDefault)
        }
    }

    @Test
    override fun testChipGroupLDefault() {
        themedComponent {
            chipGroupLDefault(R.style.Plasma_SdService_ComponentOverlays_ChipGroupDenseL)
        }
    }

    @Test
    override fun testChipGroupMSecondary() {
        themedComponent {
            chipGroupMSecondary(R.style.Plasma_SdService_ComponentOverlays_ChipGroupWideMSecondary)
        }
    }

    @Test
    override fun testChipGroupSAccent() {
        themedComponent {
            chipGroupSAccent(R.style.Plasma_SdService_ComponentOverlays_ChipGroupDenseSAccent)
        }
    }

    @Test
    override fun testChipGroupXSDefault() {
        themedComponent {
            chipGroupXSDefault(R.style.Plasma_SdService_ComponentOverlays_ChipGroupDenseXS)
        }
    }

    @Test
    override fun testChipGroupLPilledSecondaryCheckedStateAccent() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            chipGroupLPilledSecondaryCheckedStateAccent(
                R.style.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPilledSecondary,
            )
        }
    }

    @Test
    override fun testChipGroupMAccentCheckedStateSecondary() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            chipGroupMAccentCheckedStateSecondary(R.style.Plasma_SdService_ComponentOverlays_ChipGroupWideMAccent)
        }
    }

    @Test
    override fun testChipGroupLSecondaryCheckedStateDefaultMultiple() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
                onView(withId(1))
                    .perform(click())
            },
        ) {
            chipGroupLSecondaryCheckedStateDefaultMultiple(
                R.style.Plasma_SdService_ComponentOverlays_ChipGroupDenseLSecondary,
            )
        }
    }
}
