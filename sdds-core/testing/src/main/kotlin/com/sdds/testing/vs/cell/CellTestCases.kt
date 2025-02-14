package com.sdds.testing.vs.cell

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.CellLayout

/**
 * Тест-кейсы для [CellLayout]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class CellTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testCellSizeLAvatarHasDisclosure()

    abstract fun testCellSizeMTitleAvatar()

    abstract fun testCellSizeSSubtitleHasDisclosure()

    abstract fun testCellSizeXSLabelAvatar()

    abstract fun testCellSizeLHasDisclosureDisclosureText()

    abstract fun testCellSizeMAvatarIcon()

    abstract fun testCellSizeSIconHasDisclosureDisclosureText()

    abstract fun testCellSizeXSRadioBoxAvatar()

    abstract fun testCellSizeLSwitchCheckBox()

    abstract fun testCellSizeMCheckBoxHasDisclosure()

    fun ComponentScope.cellSizeLAvatarHasDisclosure(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "Title",
                subtitle = "Subtitle",
                label = "Label",
                hasDisclosure = true,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.NONE,
            ),
        )

    fun ComponentScope.cellSizeMTitleAvatar(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "Title",
                subtitle = "",
                label = "",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.NONE,
            ),
        )

    fun ComponentScope.cellSizeSSubtitleHasDisclosure(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "",
                subtitle = "Subtitle",
                label = "",
                hasDisclosure = true,
                disclosureText = "",
                startContent = CellContent.NONE,
                endContent = CellContent.NONE,
            ),
        )

    fun ComponentScope.cellSizeXSLabelAvatar(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "",
                subtitle = "",
                label = "Label",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.NONE,
            ),
        )

    fun ComponentScope.cellSizeLHasDisclosureDisclosureText(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "Title",
                subtitle = "Subtitle",
                label = "Label",
                hasDisclosure = true,
                disclosureText = "text",
                startContent = CellContent.NONE,
                endContent = CellContent.NONE,
            ),
        )

    fun ComponentScope.cellSizeMAvatarIcon(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "Title",
                subtitle = "",
                label = "Label",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.ICON,
            ),
        )

    fun ComponentScope.cellSizeSIconHasDisclosureDisclosureText(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "Title",
                subtitle = "Subtitle",
                label = "",
                hasDisclosure = true,
                disclosureText = "text",
                startContent = CellContent.ICON,
                endContent = CellContent.NONE,
            ),
        )

    fun ComponentScope.cellSizeXSRadioBoxAvatar(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "Title",
                subtitle = "Subtitle",
                label = "Label",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.RADIOBOX,
                endContent = CellContent.AVATAR,
            ),
        )

    fun ComponentScope.cellSizeLSwitchCheckBox(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "Title",
                subtitle = "",
                label = "",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.SWITCH,
                endContent = CellContent.CHECKBOX,
            ),
        )

    fun ComponentScope.cellSizeMCheckBoxHasDisclosure(style: Int): CellLayout =
        cellLayout(
            context,
            style,
            CellUiState(
                title = "",
                subtitle = "",
                label = "Label",
                hasDisclosure = true,
                disclosureText = "",
                startContent = CellContent.CHECKBOX,
                endContent = CellContent.NONE,
            ),
        )
}
