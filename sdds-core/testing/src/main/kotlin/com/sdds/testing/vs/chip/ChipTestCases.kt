package com.sdds.testing.vs.chip

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.colorstate.ColorState

/**
 * Тест-кейсы для [Chip] и [ChipGroup]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class ChipTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testChipLDefault()

    abstract fun testChipMSecondary()

    abstract fun testChipSAccent()

    abstract fun testChipXsDefault()

    abstract fun testChipDisabled()

    abstract fun testChipGroupLDefault()

    abstract fun testChipGroupMSecondary()

    abstract fun testChipGroupSAccent()

    abstract fun testChipGroupXSDefault()

    abstract fun testChipGroupLPilledSecondaryCheckedStateAccent()

    abstract fun testChipGroupMAccentCheckedStateSecondary()

    abstract fun testChipGroupLSecondaryCheckedStateDefaultMultiple()

    fun ComponentScope.chipLDefault(style: Int): Chip =
        chip(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = false,
                hasClose = true,
                enabled = true,
            ),
        )

    fun ComponentScope.chipMSecondary(style: Int): Chip =
        chip(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
            ),
        )

    fun ComponentScope.chipSAccent(style: Int): Chip =
        chip(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
            ),
        )

    fun ComponentScope.chipXsDefault(style: Int): Chip =
        chip(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = true,
                hasClose = false,
                enabled = true,
            ),
        )

    fun ComponentScope.chipDisabled(style: Int): Chip =
        chip(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = false,
                hasClose = true,
                enabled = false,
            ),
        )

    fun ComponentScope.chipGroupLDefault(style: Int, colorState: ColorState): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                colorState,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = false,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupMSecondary(style: Int, colorState: ColorState): ChipGroup =
        chipGroup(
            context,
            style,
            colorState,
            ChipUiState(
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
                isWrapped = true,
                quantity = 20,
                gravityMode = GravityMode.Start,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )

    fun ComponentScope.chipGroupSAccent(style: Int, colorState: ColorState): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                colorState,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = false,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupXSDefault(style: Int, colorState: ColorState): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                colorState,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = false,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupLPilledSecondaryCheckedStateAccent(style: Int, colorState: ColorState): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                colorState,
                ChipUiState(
                    label = "Label",
                    contentLeft = true,
                    hasClose = true,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupMAccentCheckedStateSecondary(style: Int, colorState: ColorState): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                colorState,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = true,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupLSecondaryCheckedStateDefaultMultiple(style: Int, colorState: ColorState): ChipGroup =
        chipGroup(
            context,
            style,
            colorState,
            ChipUiState(
                label = "Label",
                contentLeft = true,
                hasClose = true,
                enabled = true,
                isWrapped = true,
                quantity = 5,
                gravityMode = GravityMode.End,
                selectionMode = ChipGroup.SelectionMode.Multiple,
            ),
        )
}
