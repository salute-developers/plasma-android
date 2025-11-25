package com.sdds.testing.vs.mask

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.colorstate.ColorState

/**
 * Тест-кейсы для компонента [Mask]
 */
@Suppress("UndocumentedPublicFunction")
abstract class MaskTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1243
     */
    abstract fun testMaskDefaultLOuterLabelMaskPlaceholderPhone()

    /**
     * PLASMA-T1244
     */
    abstract fun testMaskSuccessMOuterLabelMaskPlaceholderPhone()

    /**
     * PLASMA-T1245
     */
    abstract fun testMaskWarningSRequiredRightPlaceholderPhone()

    /**
     * PLASMA-T1246
     */
    abstract fun testMaskErrorXsRequiredLeftPlaceholderPhone()

    /**
     * PLASMA-T1247
     */
    abstract fun testMaskDisabledIconAction()

    /**
     * PLASMA-T1248
     */
    abstract fun testMaskReadOnlyIconAction()

    /**
     * PLASMA-T2377
     */
    abstract fun testMaskXlDefaultOuterLabelDateIconAction()

    /**
     * PLASMA-T2378
     */
    abstract fun testMaskLSuccessRequiredLeftInnerLabelTimeAlwaysIcon()

    /**
     * PLASMA-T2379
     */
    abstract fun testMaskMWarningRequiredRightOuterLabelNumberAlwaysAction()

    /**
     * PLASMA-T2380
     */
    abstract fun testMaskErrorSuffixPrefixPhone()

    /**
     * PLASMA-T2381
     */
    abstract fun testMaskXsDefaultRequiredLeftPhoneOnInputIconAction()

    /**
     * PLASMA-T1281
     */
    abstract fun testMaskTypeLettersInTelephone()

    /**
     * PLASMA-T1282
     */
    abstract fun testMaskTypeNumberInTelephone()

    /**
     * PLASMA-T1283
     */
    abstract fun testMaskTypeAnyOtherNumberInTelephone()

    /**
     * PLASMA-T1284
     */
    abstract fun testMaskDeleteNumberInTelephone()

    /**
     * PLASMA-T1285
     */
    abstract fun testMaskInputFullNumberInTelephone()

    /**
     * PLASMA-T1286
     */
    abstract fun testMaskInputLettersAndNumberInTelephone()

    /**
     * PLASMA-T1287
     */
    abstract fun testMaskInputPartiallyFilledNumberInTelephone()

    /**
     * PLASMA-T1288
     */
    abstract fun testMaskInputFullyFilledNumberInTelephone()

    /**
     * PLASMA-T2382
     */
    abstract fun testMaskShortDateInput()

    /**
     * PLASMA-T2383
     */
    abstract fun testMaskShortDateInputNotFull()

    /**
     * PLASMA-T2384
     */
    abstract fun testMaskFullDateInput()

    /**
     * PLASMA-T2385
     */
    abstract fun testMaskTimeInput()

    /**
     * PLASMA-T2386
     */
    abstract fun testMaskTimeInputStartWithZero()

    /**
     * PLASMA-T2387
     */
    abstract fun testMaskTimeInputMaxNumber()

    /**
     * PLASMA-T2388
     */
    abstract fun testMaskTimeInputWithLetter()

    /**
     * PLASMA-T2389
     */
    abstract fun testMaskNumberInput()

    /**
     * PLASMA-T2390
     */
    abstract fun testMaskNumberInputMaxNumber()

    /**
     * PLASMA-T2391
     */
    abstract fun testMaskNumberInputOneNumber()

    /**
     * PLASMA-T2392
     */
    abstract fun testMaskNumberInputSymbolsAndLetters()

    fun ComponentScope.maskPhoneDisplayAlways(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "placeholder",
                valueText = "",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.PHONE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskDisabledIconAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = true,
                enabled = false,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.PHONE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskReadOnlyIconAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = true,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.PHONE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskDateShortDateAlwaysIconAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.SHORT_DATE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskTimeAlwaysIcon(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.TIME,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskNumberAlwaysAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.NUMBER,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskSuffixPrefixPhone(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "TA",
                suffix = "TB",
                mask = TextFieldMask.PHONE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskPhoneOnInputIconAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.PHONE,
                maskDisplayMode = TextFieldMaskDisplayMode.ON_INPUT,
            ),
        ).apply {
            id = R.id.textField
        }

    fun ComponentScope.maskPhoneDisplayAlwaysIconAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "placeholder",
                valueText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.PHONE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskPhoneDisplayAlwaysIconActionNoPlaceholder(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.PHONE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskDateMediumDateAlwaysIconAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.MEDIUM_DATE,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )

    fun ComponentScope.maskTimeAlwaysIconAction(style: Int, colorState: ColorState) =
        maskedTextField(
            context = context,
            style = style,
            colorState = colorState,
            state = MaskUiState(
                variant = "",
                appearance = "",
                colorVariant = "",
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                mask = TextFieldMask.TIME,
                maskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
            ),
        )
}
