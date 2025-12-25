package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.file.FileTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemFileScreenshotTest(
    theme: String,
) : FileTestCases(theme) {

    @Test
    override fun testFileCircularProgressLDefaultIsLoadingStart() {
        themedComponent {
            fileLabelDescriptionIsLoadingStart(R.style.Serv_Sdds_ComponentOverlays_FileCircularProgressLDefault)
        }
    }

    @Test
    override fun testFileLinearProgressMNegativeIsLoadingHasContentEnd() {
        themedComponent {
            fileIsLoadingHasContentEnd(R.style.Serv_Sdds_ComponentOverlays_FileLinearProgressMNegative)
        }
    }

    @Test
    override fun testFileCircularProgressSDefaultHasContentDescriptionEnd() {
        themedComponent {
            fileHasContentNoLabelEnd(R.style.Serv_Sdds_ComponentOverlays_FileCircularProgressSDefault)
        }
    }

    @Test
    override fun testFileLinearProgressXsNegativeIsLoadingLabelDescriptionStart() {
        themedComponent {
            fileLabelDescriptionIsLoadingStart(R.style.Serv_Sdds_ComponentOverlays_FileLinearProgressXsNegative)
        }
    }

    @Test
    override fun testFileCircularProgressLNegativeIsLoadingLongText() {
        themedComponent {
            fileLongText(R.style.Serv_Sdds_ComponentOverlays_FileCircularProgressLNegative)
        }
    }

    @Test
    override fun testFileCircularProgressLDefaultIsLoadingHasContentNoDescriptionEnd() {
        themedComponent {
            fileIsLoadingHasContentNoDescriptionEnd(R.style.Serv_Sdds_ComponentOverlays_FileCircularProgressLDefault)
        }
    }
}
