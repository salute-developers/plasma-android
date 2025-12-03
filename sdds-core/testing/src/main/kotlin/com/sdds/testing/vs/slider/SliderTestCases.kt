package com.sdds.testing.vs.slider

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig

/**
 * Тест-кейсы для [Slider]
 */
@Suppress("UndocumentedPublicFunction")
abstract class SliderTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2411
     */
    abstract fun testSliderHorizontalLDefaultLabelInnerThumbLimitLabelNormalStart()

    /**
     * PLASMA-T2412
     */
    abstract fun testSliderHorizontalMAccentLabelOuterReversedEnd()

    /**
     * PLASMA-T2413
     */
    abstract fun testSliderVerticalInnerSGradientThumbLimitLabelNormalStart()

    /**
     * PLASMA-T2414
     */
    abstract fun testSliderVerticalOuterLabelLDefaultThumbLimitLabelNormalStart()

    /**
     * PLASMA-T2415
     */
    abstract fun testSliderHorizontalInnerLabelLimitLabelCenterThumbLimitLabelNormalStart()

    /**
     * PLASMA-T2416
     */
    abstract fun testSliderHorizontalLabelOuterMAccentLimitLabelCenterThumbSAlignmentEnd()

    /**
     * PLASMA-T2417
     */
    abstract fun testSliderVerticalLabelInnerSGradientAlignmentEnd()

    /**
     * PLASMA-T2418
     */
    abstract fun testSliderVerticalOuterLDefaultThumbSLabelNormalStart()

    /**
     * PLASMA-T2419
     */
    abstract fun testSliderVerticalOuterLabelMAccentAlignmentEndReversedEnd()

    /**
     * PLASMA-T2420
     */
    abstract fun testSliderVerticalOuterLabelSGradientAlignmentEndLabelThumb()

    /**
     * PLASMA-T2421
     */
    abstract fun testSliderVerticalOuterLabelAlignmentEndLabelEndThumbSReversedAlignmentEnd()

    /**
     * PLASMA-T2422
     */
    abstract fun testSliderVerticalInnerLabelEndMNoLabelAlignmentEndMaxSixty()

    /**
     * PLASMA-T2423
     */
    abstract fun testSliderVerticalOuterLabelEndThumbSReversedLimitDisabled()

    /**
     * PLASMA-T2424
     */
    abstract fun testSliderVerticalLabelOuterLThumbSLongLabel()

    /**
     * PLASMA-T2425
     */
    abstract fun testSliderHorizontalInnerLDefaultLongLabel()

    fun ComponentScope.sliderLabelThumbLimitLabelNormalStart(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.START,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(0f)
    }

    fun ComponentScope.sliderLabelReversedEnd(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = false,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = false,
            slideDirection = SlideDirection.REVERSED,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(100f)
    }

    fun ComponentScope.sliderThumbLimitLabelNormalStart(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = false,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.START,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(100f)
    }

    fun ComponentScope.sliderLabelThumbLimitLabelNormalStartProgressFifty(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.START,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(50f)
    }

    fun ComponentScope.sliderAlignmentEndReversed(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = true,
            minLabel = "1",
            maxLabel = "99",
            title = "Label",
            thumbEnabled = false,
            slideDirection = SlideDirection.REVERSED,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(0f)
    }

    fun ComponentScope.sliderAlignmentEnd(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(0f)
    }

    fun ComponentScope.sliderThumbLabelNormalStart(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = false,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.START,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(50f)
    }

    fun ComponentScope.sliderReversedEnd(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = false,
            labelEnabled = false,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = false,
            slideDirection = SlideDirection.REVERSED,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(50f)
    }

    fun ComponentScope.sliderThumbLabelLimitAlignmentEnd(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = false,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(80f)
    }

    fun ComponentScope.sliderReversedAlignmentEnd(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.REVERSED,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(0f)
    }

    fun ComponentScope.sliderNoLabelAlignmentEndMaxSixty(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "60",
            title = "",
            thumbEnabled = false,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(0f)
    }

    fun ComponentScope.sliderReversedLimitDisabled(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = false,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "Label",
            thumbEnabled = true,
            slideDirection = SlideDirection.REVERSED,
            alignment = Alignment.END,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(0f)
    }

    fun ComponentScope.sliderLongLabel(style: Int) = slider(
        context = context,
        style = style,
        state = SliderUiState(
            variant = "",
            appearance = "",
            limitLabelEnabled = true,
            labelEnabled = true,
            minLabel = "0",
            maxLabel = "100",
            title = "LabelLabelLabelLabelLabel",
            thumbEnabled = true,
            slideDirection = SlideDirection.NORMAL,
            alignment = Alignment.START,
        ),
    ).apply {
        id = R.id.slider
        setProgressValue(0f)
    }
}
