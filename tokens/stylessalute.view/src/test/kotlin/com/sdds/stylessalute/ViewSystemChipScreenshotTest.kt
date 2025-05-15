package com.sdds.stylessalute

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.stylessalute.colorstate.ChipColorState
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
            chipLDefault(R.style.Salute_StylesSalute_ComponentOverlays_ChipLDefault)
        }
    }

    @Test
    override fun testChipMSecondary() {
        themedComponent {
            chipMSecondary(R.style.Salute_StylesSalute_ComponentOverlays_ChipMPilledSecondary)
        }
    }

    @Test
    override fun testChipSAccent() {
        themedComponent {
            chipSAccent(R.style.Salute_StylesSalute_ComponentOverlays_ChipSAccent)
        }
    }

    @Test
    override fun testChipXsDefault() {
        themedComponent {
            chipXsDefault(R.style.Salute_StylesSalute_ComponentOverlays_ChipXsDefault)
        }
    }

    @Test
    override fun testChipDisabled() {
        themedComponent {
            chipDisabled((R.style.Salute_StylesSalute_ComponentOverlays_ChipL))
        }
    }

    @Test
    override fun testChipGroupLDefault() {
        themedComponent {
            chipGroupLDefault(
                R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLDefault,
                ChipColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testChipGroupMSecondary() {
        themedComponent {
            chipGroupMSecondary(
                R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMSecondary,
                ChipColorState.SECONDARY,
            )
        }
    }

    @Test
    override fun testChipGroupSAccent() {
        themedComponent {
            chipGroupSAccent(
                R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseSAccent,
                ChipColorState.ACCENT,
            )
        }
    }

    @Test
    override fun testChipGroupXSDefault() {
        themedComponent {
            chipGroupXSDefault(
                R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseXsDefault,
                ChipColorState.DEFAULT,
            )
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
                R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLPilledSecondary,
                ChipColorState.ACCENT,
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
            chipGroupMAccentCheckedStateSecondary(
                R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMAccent,
                ChipColorState.SECONDARY,
            )
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
                R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLSecondary,
                ChipColorState.DEFAULT,
            )
        }
    }
}
