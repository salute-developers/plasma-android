package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.Editable
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.editable.EditableUiState
import com.sdds.uikit.fixtures.stories.editable.IconPlacement
import com.sdds.uikit.fixtures.stories.editable.TextAlign
import com.sdds.uikit.fixtures.stories.editable.editable

/**
 * Тест-кейсы для [Editable]
 */
@Suppress("UndocumentedPublicFunction")
abstract class EditableTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2536
     */
    abstract fun testEditableH1SingleLineRelativeStart()

    /**
     * PLASMA-T2537
     */
    abstract fun testEditableH2Disabled()

    /**
     * PLASMA-T2538
     */
    abstract fun testEditableH3MultiLineAbsoluteEnd()

    /**
     * PLASMA-T2539
     */
    abstract fun testEditableH4SingleLineRelativeStart()

    /**
     * PLASMA-T2540
     */
    abstract fun testEditableH5SingleLineAbsoluteCenter()

    /**
     * PLASMA-T2542
     */
    abstract fun testEditableBodyLSingleLineRelativeStart()

    /**
     * PLASMA-T2543
     */
    abstract fun testEditableBodyMMultiLineRelativeCenter()

    /**
     * PLASMA-T2544
     */
    abstract fun testEditableBodySReadOnly()

    /**
     * PLASMA-T2545
     */
    abstract fun testEditableBodyXsMultiLineRelativeCenter()

    /**
     * PLASMA-T2546
     */
    abstract fun testEditableBodyXxsSingleLineRelativeStart()

    /**
     * PLASMA-T2577
     */
    abstract fun testEditableDeleteText()

    fun ComponentScope.editableSingleLineRelativeStart(style: Int): Editable =
        editable(
            context = context,
            style = style,
            state = EditableUiState(
                variant = "",
                appearance = "",
                enabled = true,
                singleLine = true,
                readonly = false,
                iconPlacement = IconPlacement.Relative,
                textAlignment = TextAlign.Start,
            ),
        ).apply {
            id = R.id.editable
        }

    fun ComponentScope.editableDisabled(style: Int): Editable =
        editable(
            context = context,
            style = style,
            state = EditableUiState(
                variant = "",
                appearance = "",
                enabled = false,
                singleLine = true,
                readonly = false,
                iconPlacement = IconPlacement.Relative,
                textAlignment = TextAlign.Center,
            ),
        ).apply {
            id = R.id.editable
        }

    fun ComponentScope.editableMultiLineAbsoluteEnd(style: Int): Editable =
        editable(
            context = context,
            style = style,
            state = EditableUiState(
                variant = "",
                appearance = "",
                enabled = true,
                singleLine = false,
                readonly = false,
                iconPlacement = IconPlacement.Absolute,
                textAlignment = TextAlign.End,
            ),
        ).apply {
            id = R.id.editable
        }

    fun ComponentScope.editableSingleLineAbsoluteCenter(style: Int): Editable =
        editable(
            context = context,
            style = style,
            state = EditableUiState(
                variant = "",
                appearance = "",
                enabled = true,
                singleLine = true,
                readonly = false,
                iconPlacement = IconPlacement.Absolute,
                textAlignment = TextAlign.Center,
            ),
        ).apply {
            id = R.id.editable
        }

    fun ComponentScope.editableMultiLineRelativeStart(style: Int): Editable =
        editable(
            context = context,
            style = style,
            state = EditableUiState(
                variant = "",
                appearance = "",
                enabled = true,
                singleLine = false,
                readonly = false,
                iconPlacement = IconPlacement.Relative,
                textAlignment = TextAlign.Start,
            ),
        ).apply {
            id = R.id.editable
        }

    fun ComponentScope.editableMultiLineRelativeCenter(style: Int): Editable =
        editable(
            context = context,
            style = style,
            state = EditableUiState(
                variant = "",
                appearance = "",
                enabled = true,
                singleLine = false,
                readonly = false,
                iconPlacement = IconPlacement.Relative,
                textAlignment = TextAlign.Center,
            ),
        ).apply {
            id = R.id.editable
        }

    fun ComponentScope.editableReadOnly(style: Int): Editable =
        editable(
            context = context,
            style = style,
            state = EditableUiState(
                variant = "",
                appearance = "",
                enabled = true,
                singleLine = false,
                readonly = true,
                iconPlacement = IconPlacement.Relative,
                textAlignment = TextAlign.Start,
            ),
        ).apply {
            id = R.id.editable
        }
}
