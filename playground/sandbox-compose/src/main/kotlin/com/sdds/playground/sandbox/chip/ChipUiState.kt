package com.sdds.playground.sandbox.chip

internal data class ChipUiState(
    val state: SandboxChip.State = SandboxChip.State.Default,
    val size: SandboxChip.Size = SandboxChip.Size.M,
    val shape: SandboxChip.Shape = SandboxChip.Shape.Default,
    val isClickable: Boolean = true,
    val label: String = "Label",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
)
