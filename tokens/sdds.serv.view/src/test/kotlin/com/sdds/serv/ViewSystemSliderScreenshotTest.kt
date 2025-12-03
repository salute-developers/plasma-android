package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.slider.SliderTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemSliderScreenshotTest(
    theme: String,
) : SliderTestCases(theme) {

    @Test
    override fun testSliderHorizontalLDefaultLabelInnerThumbLimitLabelNormalStart() {
        themedComponent {
            margins {
                sliderLabelThumbLimitLabelNormalStart(
                    R.style.Serv_Sdds_ComponentOverlays_SliderHorizontalLabelInnerLDefault,
                )
            }
        }
    }

    @Test
    override fun testSliderHorizontalMAccentLabelOuterReversedEnd() {
        themedComponent {
            margins {
                sliderLabelReversedEnd(
                    R.style.Serv_Sdds_ComponentOverlays_SliderHorizontalLabelOuterMAccent,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalInnerSGradientThumbLimitLabelNormalStart() {
        themedComponent {
            margins {
                sliderThumbLimitLabelNormalStart(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelInnerSGradient,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalOuterLabelLDefaultThumbLimitLabelNormalStart() {
        themedComponent {
            margins {
                sliderLabelThumbLimitLabelNormalStartProgressFifty(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelOuterLDefault,
                )
            }
        }
    }

    @Test
    override fun testSliderHorizontalInnerLabelLimitLabelCenterThumbLimitLabelNormalStart() {
        themedComponent {
            margins {
                sliderLabelThumbLimitLabelNormalStart(
                    R.style.Serv_Sdds_ComponentOverlays_SliderHorizontalLabelInnerLLimitLabelCenter,
                )
            }
        }
    }

    @Test
    override fun testSliderHorizontalLabelOuterMAccentLimitLabelCenterThumbSAlignmentEnd() {
        themedComponent {
            margins {
                sliderAlignmentEndReversed(
                    R.style.Serv_Sdds_ComponentOverlays_SliderHorizontalLabelOuterMLimitLabelCenterThumbSAccent,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalLabelInnerSGradientAlignmentEnd() {
        themedComponent {
            margins {
                sliderAlignmentEnd(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelInnerSLabelEndThumbSGradient,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalOuterLDefaultThumbSLabelNormalStart() {
        themedComponent {
            margins {
                sliderThumbLabelNormalStart(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelOuterLThumbSDefault,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalOuterLabelMAccentAlignmentEndReversedEnd() {
        themedComponent {
            margins {
                sliderReversedEnd(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelOuterMAlignmentEndAccent,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalOuterLabelSGradientAlignmentEndLabelThumb() {
        themedComponent {
            margins {
                sliderThumbLabelLimitAlignmentEnd(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelOuterSAlignmentEndLabelEndGradient,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalOuterLabelAlignmentEndLabelEndThumbSReversedAlignmentEnd() {
        themedComponent {
            margins {
                sliderReversedAlignmentEnd(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSDefault,

                )
            }
        }
    }

    @Test
    override fun testSliderVerticalInnerLabelEndMNoLabelAlignmentEndMaxSixty() {
        themedComponent {
            margins {
                sliderNoLabelAlignmentEndMaxSixty(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelInnerMLabelEndDefault,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalOuterLabelEndThumbSReversedLimitDisabled() {
        themedComponent {
            margins {
                sliderReversedLimitDisabled(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelOuterLLabelEndThumbSDefault,
                )
            }
        }
    }

    @Test
    override fun testSliderVerticalLabelOuterLThumbSLongLabel() {
        themedComponent {
            margins {
                sliderLongLabel(
                    R.style.Serv_Sdds_ComponentOverlays_SliderVerticalLabelOuterLThumbSDefault,
                )
            }
        }
    }

    @Test
    override fun testSliderHorizontalInnerLDefaultLongLabel() {
        themedComponent {
            margins {
                sliderLongLabel(R.style.Serv_Sdds_ComponentOverlays_SliderHorizontalLabelInnerLDefault)
            }
        }
    }
}
