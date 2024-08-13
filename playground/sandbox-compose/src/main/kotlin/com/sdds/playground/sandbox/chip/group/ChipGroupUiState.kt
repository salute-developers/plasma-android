package com.sdds.playground.sandbox.chip.group

import com.sdds.playground.sandbox.chip.SandboxChip

internal data class ChipGroupUiState(
    val items: List<String> = List(3) { "label" },
    val size: SandboxChip.Size = SandboxChip.Size.M,
    val gap: SandboxChipGroup.Gap = SandboxChipGroup.Gap.Dense,
    val shouldWrap: Boolean = true,
    val enabled: Boolean = true,
)
