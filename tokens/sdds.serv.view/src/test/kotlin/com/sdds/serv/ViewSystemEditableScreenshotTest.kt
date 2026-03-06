package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.editable.EditableTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import kotlin.intArrayOf

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemEditableScreenshotTest(
    theme: String,
): EditableTestCases(theme) {

    @Test
    override fun testEditableH1SingleLineRelativeStart() {
        themedComponent {
            margins {
                editableSingleLineRelativeStart(R.style.Serv_Sdds_ComponentOverlays_EditableH1)
            }
        }
    }

    @Test
    override fun testEditableH2Disabled() {
        themedComponent {
            margins {
                editableDisabled(R.style.Serv_Sdds_ComponentOverlays_EditableH2)
            }
        }
    }

    @Test
    override fun testEditableH3MultiLineAbsoluteEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(typeText(longText))
            }
        ) {
            margins {
                editableMultiLineAbsoluteEnd(R.style.Serv_Sdds_ComponentOverlays_EditableH3)
            }
        }
    }

    @Test
    override fun testEditableH4SingleLineRelativeStart() {
        themedComponent {
            margins {
                editableSingleLineRelativeStart(R.style.Serv_Sdds_ComponentOverlays_EditableH4)
            }
        }
    }

    @Test
    override fun testEditableH5SingleLineAbsoluteCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(typeText(longText))
            }
        ) {
            margins {
                editableSingleLineAbsoluteCenter(R.style.Serv_Sdds_ComponentOverlays_EditableH5)
            }
        }
    }

    @Test
    override fun testEditableBodyLSingleLineRelativeStart() {
        themedComponent {
            margins {
                editableSingleLineRelativeStart(R.style.Serv_Sdds_ComponentOverlays_EditableBodyL)
            }
        }
    }

    @Test
    override fun testEditableBodyMMultiLineRelativeCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(typeText("!@#$%^&*()"))
            }
        ) {
            margins {
                editableMultiLineRelativeCenter(R.style.Serv_Sdds_ComponentOverlays_EditableBodyM)
            }
        }
    }

    @Test
    override fun testEditableBodySReadOnly() {
        themedComponent {
            margins {
                editableReadOnly(R.style.Serv_Sdds_ComponentOverlays_EditableBodyS)
            }
        }
    }

    @Test
    override fun testEditableBodyXsMultiLineRelativeCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(typeText(longText))
            }
        ) {
            margins {
                editableMultiLineRelativeCenter(R.style.Serv_Sdds_ComponentOverlays_EditableBodyXs)
            }
        }
    }

    @Test
    override fun testEditableBodyXxsSingleLineRelativeStart() {
        themedComponent {
            margins {
                editableSingleLineRelativeStart(R.style.Serv_Sdds_ComponentOverlays_EditableBodyXxs)
            }
        }
    }

    @Test
    override fun testEditableDeleteText() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(clearText())
            }
        ) {
            editableSingleLineRelativeStart(R.style.Serv_Sdds_ComponentOverlays_EditableH1)
        }
    }

    private val longText = """
        Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
        when an unknown printer took a galley of type and scrambled it to make a type specimen book.
    """
}
