package com.sdds.testing.vs.chip

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup

/**
 * Тест-кейсы для [Chip] и [ChipGroup]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class ChipTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testChipLDefault()
    abstract fun testChipMSecondary()

    abstract fun testChipSDisabled()

    abstract fun testChipXsDefault()

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

    fun ComponentScope.chipSDisabled(style: Int): Chip =
        chip(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = false,
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

    fun ComponentScope.chipGroupLDefault(style: Int): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = false,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    checkedState = CheckedState.Accent,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupMSecondary(style: Int): ChipGroup =
        chipGroup(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
                isWrapped = true,
                quantity = 20,
                gravityMode = GravityMode.Start,
                checkedState = CheckedState.Accent,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )

    fun ComponentScope.chipGroupSAccent(style: Int): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = false,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    checkedState = CheckedState.Accent,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupXSDefault(style: Int): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = false,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    checkedState = CheckedState.Accent,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupLPilledSecondaryCheckedStateAccent(style: Int): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                ChipUiState(
                    label = "Label",
                    contentLeft = true,
                    hasClose = true,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    checkedState = CheckedState.Accent,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupMAccentCheckedStateSecondary(style: Int): ChipGroup =
        horizontalScroll {
            chipGroup(
                context,
                style,
                ChipUiState(
                    label = "Label",
                    contentLeft = false,
                    hasClose = true,
                    enabled = true,
                    isWrapped = false,
                    quantity = 5,
                    gravityMode = GravityMode.Start,
                    checkedState = CheckedState.Secondary,
                    selectionMode = ChipGroup.SelectionMode.Single,
                ),
            )
        }

    fun ComponentScope.chipGroupLSecondaryCheckedStateDefaultMultiple(style: Int): ChipGroup =
        chipGroup(
            context,
            style,
            ChipUiState(
                label = "Label",
                contentLeft = true,
                hasClose = true,
                enabled = true,
                isWrapped = true,
                quantity = 5,
                gravityMode = GravityMode.End,
                checkedState = CheckedState.Default,
                selectionMode = ChipGroup.SelectionMode.Multiple,
            ),
        )
}
