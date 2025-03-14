package com.sdds.testing.vs.textfield

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.TextField
import com.sdds.uikit.colorstate.ColorState

/**
 * Тест-кейсы для [TextField]
 * @author Малышев Александр on 14.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class TextFieldTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testTextFieldLDefaultInnerLeft()

    abstract fun testTextFieldMSuccessOuterLabel()

    abstract fun testTextFieldSWarningInnerRight()

    abstract fun testTextFieldXsError()

    abstract fun testTextFieldLSuccessRequiredOuterLabel()

    abstract fun testTextFieldMWarningInnerLabel()

    abstract fun testTextFieldSDefaultReadOnly()

    abstract fun testTextFieldXSSuccessOuterLabel()

    abstract fun testTextFieldLDisabled()

    abstract fun testTextFieldMErrorOuterLabel()

    abstract fun testTextFieldSWarningInnerLabelRightFocused()

    abstract fun testTextFieldMSuccessInnerLabelChips()

    abstract fun testTextFieldSDefaultOuterLabelRightChips()

    abstract fun testTextFieldLInputText()

    abstract fun testTextFieldLSuffixPrefix()

    abstract fun testTextFieldTBTACyrillic()
    abstract fun testTextFieldLDisabledOuterLabelStart()

    abstract fun testTextFieldSuffixPrefixNoValue()

    fun ComponentScope.textFieldLDefaultInnerLeft(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                captionText = "Caption",
                placeholderText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldMSuccessOuterLabel(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "",
                captionText = "Caption",
                placeholderText = "Placeholder",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldSWarningInnerRight(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "",
                captionText = "Caption",
                placeholderText = "Placeholder",
                icon = true,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldXsError(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "",
                captionText = "Caption",
                placeholderText = "Placeholder",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldLSuccessRequiredOuterLabel(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldMWarningInnerLabel(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldSDefaultReadOnly(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = true,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldXSSuccessOuterLabel(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldLDisabled(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = false,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldMErrorOuterLabel(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldSWarningInnerLabelRightFocused(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldMSuccessInnerLabelChips(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = true,
                chipData = listOf(
                    ExampleChipData(text = "Chip"),
                    ExampleChipData(text = "Chip"),
                ),
            ),
        )

    fun ComponentScope.textFieldSDefaultOuterLabelRightChips(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = true,
                chipData = listOf(
                    ExampleChipData(text = "Chip"),
                    ExampleChipData(text = "Chip"),
                ),
            ),
        )

    fun ComponentScope.textFieldLInputText(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "",
                valueText = "абвгдежзabcdefg@#643!#\$",
                captionText = "",
                icon = true,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldLSuffixPrefix(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                hasChips = false,
                prefix = "TB Prefix",
                suffix = "TA Suffix",
            ),
        )

    fun ComponentScope.textFieldTBTACyrillic(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                hasChips = false,
                prefix = "префикс",
                suffix = "суффикс",
            ),
        )

    fun ComponentScope.textFieldLDisabledOuterLabelStart(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = false,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldLSuffixPrefixNoValue(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
                readOnly = false,
                prefix = "TB",
                suffix = "TA",
                hasChips = false,
            ),
        )

    fun ComponentScope.textFieldXlDefault(style: Int, colorState: ColorState): TextField =
        textField(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                valueText = "Value",
                placeholderText = "Placeholder",
                captionText = "Caption",
                prefix = "",
                suffix = "",
                icon = true,
                action = true,
                readOnly = false,
                enabled = true,
                hasChips = false,
            ),
        )
}
