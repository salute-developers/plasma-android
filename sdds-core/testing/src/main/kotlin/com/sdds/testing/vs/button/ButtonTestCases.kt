package com.sdds.testing.vs.button

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Button
import com.sdds.uikit.IconButton
import com.sdds.uikit.LinkButton

/**
 * Тест-кейсы для [Button], [IconButton] и [LinkButton]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class ButtonTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testButtonSizeLDefault()

    abstract fun testButtonSizeMAccent()

    abstract fun testButtonSizeSWarning()

    abstract fun testButtonSizeXSDark()

    abstract fun testButtonSizeLIsLoading()

    abstract fun testButtonSizeLDisabled()

    abstract fun testButtonSizeLSecondary()

    abstract fun testButtonSizeMSpaceBetween()

    abstract fun testButtonSizeSLongText()

    abstract fun testButtonXSNegative()
    abstract fun testButtonLWhite()
    abstract fun testIconButtonLDefault()
    abstract fun testIconButtonMAccent()

    abstract fun testIconButtonSWarning()

    abstract fun testIconButtonXSDark()

    abstract fun testIconButtonLIsLoading()

    abstract fun testIconButtonDisabled()

    abstract fun testIconButtonLPilledSecondary()

    abstract fun testIconButtonMClear()

    abstract fun testIconButtonSPositive()

    abstract fun testIconButtonXSNegative()

    abstract fun testIconButtonLWhite()
    abstract fun testLinkButtonLDefault()
    abstract fun testLinkButtonIsLoading()
    abstract fun testLinkButtonLSecondary()
    abstract fun testLinkButtonMAccent()
    abstract fun testLinkButtonDisabled()
    abstract fun testLinkButtonSWarning()
    abstract fun testLinkButtonXsNegative()

    fun ComponentScope.buttonSizeLDefault(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = false,
            ),
        )

    fun ComponentScope.buttonSizeMAccent(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = false,
            ),
        )

    fun ComponentScope.buttonSizeSWarning(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.End,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = false,
            ),
        )

    fun ComponentScope.buttonSizeXSDark(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "Value",
                enabled = true,
                loading = false,
            ),
        )

    fun ComponentScope.buttonSizeLIsLoading(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = true,
            ),
        )

    fun ComponentScope.buttonSizeLDisabled(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = false,
                loading = false,
            ),
        )

    fun ComponentScope.buttonSizeLSecondary(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = true,
            ),
        )

    fun ComponentScope.buttonSizeMSpaceBetween(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "Value",
                spacing = Button.Spacing.SpaceBetween,
                enabled = true,
                loading = false,
                fixedSize = true,
            ),
        )

    fun ComponentScope.buttonSizeSLongText(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.End,
                buttonLabel = "LabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabel",
                buttonValue = "",
                enabled = true,
                loading = false,
            ),
        )

    fun ComponentScope.buttonXSNegative(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.End,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
            ),
        )

    fun ComponentScope.buttonLWhite(style: Int): Button =
        basicButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.End,
                spacing = Button.Spacing.Packed,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = false,
            ),
        )

    fun ComponentScope.iconButtonLDefault(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonMAccent(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonSWarning(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonXSDark(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonLIsLoading(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = true,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonDisabled(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = false,
            ),
        )

    fun ComponentScope.iconButtonLPilledSecondary(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonMClear(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonSPositive(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonXSNegative(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = true,
                enabled = true,
            ),
        )

    fun ComponentScope.iconButtonLWhite(style: Int): IconButton =
        iconButton(
            context,
            style,
            ButtonUiState(
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.linkButtonLDefault(style: Int): LinkButton =
        linkButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.linkButtonIsLoading(style: Int): LinkButton =
        linkButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                loading = true,
                enabled = true,
            ),
        )

    fun ComponentScope.linkButtonLSecondary(style: Int): LinkButton =
        linkButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.linkButtonMAccent(style: Int): LinkButton =
        linkButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.linkButtonDisabled(style: Int): LinkButton =
        linkButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                loading = false,
                enabled = false,
            ),
        )

    fun ComponentScope.linkButtonSWarning(style: Int): LinkButton =
        linkButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.End,
                buttonLabel = "Label",
                loading = false,
                enabled = true,
            ),
        )

    fun ComponentScope.linkButtonXsNegative(style: Int): LinkButton =
        linkButton(
            context,
            style,
            ButtonUiState(
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                loading = false,
                enabled = true,
            ),
        )
}
