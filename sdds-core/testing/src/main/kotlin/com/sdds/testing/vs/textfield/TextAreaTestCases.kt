package com.sdds.testing.vs.textfield

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.TextArea
import com.sdds.uikit.colorstate.ColorState

/**
 * Тест-кейсы для [TextArea]
 * @author Малышев Александр on 14.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class TextAreaTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testTextAreaLDefaultInnerRequiredLeft()

    abstract fun testTextAreaMDefaultOuter()

    abstract fun testTextAreaSWarningInnerRequiredRight()

    abstract fun testTextAreaXsError()

    abstract fun testTextAreaLReadOnly()

    abstract fun testTextAreaMWarningInner()

    abstract fun testTextAreaSDefaultInnerRight()

    abstract fun testTextAreaXSDefaultOuter()

    abstract fun testTextAreaLDisabled()

    abstract fun testTextAreaMErrorOuter()

    abstract fun testTextAreaSFocused()

    abstract fun testTextAreaMDefaultChipsInner()

    abstract fun testTextAreaSDefaultChipsOuterRight()

    abstract fun testTextAreaTextSLongText()

    abstract fun testTextAreaLDefaultTBTA()

    fun ComponentScope.textAreaLDefaultInnerRequiredLeft(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaMDefaultOuter(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaSWarningInnerRequiredRight(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                captionText = "",
                counterText = "Counter",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaXsError(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaLReadOnly(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = true,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaMWarningInner(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaSDefaultInnerRight(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaXSDefaultOuter(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaLDisabled(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = false,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaMErrorOuter(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaSFocused(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = true,
            ),
        )

    fun ComponentScope.textAreaMDefaultChipsInner(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
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

    fun ComponentScope.textAreaSDefaultChipsOuterRight(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = false,
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

    fun ComponentScope.textAreaTextSLongText(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "O Captain! my Captain! our fearful trip is done,\n" +
                    "The ship has weather’d every rack, the prize we sought is won,\n" +
                    "The port is near, the bells I hear, the people all exulting,\n" +
                    "While follow eyes the steady keel, the vessel grim and daring;\n" +
                    "But O heart! heart! heart!\n" +
                    "O the bleeding drops of red,\n" +
                    "Where on the deck my Captain lies,\n" +
                    "                                  Fallen cold and dead.",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )

    fun ComponentScope.textAreaLDefaultTBTA(style: Int, colorState: ColorState): TextArea =
        textArea(
            context,
            style,
            colorState,
            TextFieldUiState(
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "TB1!",
                suffix = "TB2@",
                hasChips = false,
            ),
        )
}
