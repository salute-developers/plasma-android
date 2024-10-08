package com.sdds.playground.sandbox.chip.group

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroup.OverflowMode
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.chip.SandboxChip
import com.sdds.playground.sandbox.chip.SandboxChip.State
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip

@Composable
internal fun SandboxChipGroup(
    items: List<String>,
    modifier: Modifier = Modifier,
    size: SandboxChip.Size = SandboxChip.Size.M,
    gap: SandboxChipGroup.Gap = SandboxChipGroup.Gap.Dense,
    shouldWrap: Boolean = true,
    enabled: Boolean = true,
) {
    ChipGroup(
        modifier = modifier,
        horizontalSpacing = gap.value,
        verticalSpacing = gap.value,
        overflowMode = if (shouldWrap) OverflowMode.Wrap else OverflowMode.Scrollable,
    ) {
        items.forEach {
            var isSelected by remember { mutableStateOf(false) }
            SandboxChip(
                modifier = Modifier
                    .height(size.height),
                isSelected = isSelected,
                onSelectedChange = { value -> isSelected = value },
                label = it,
                size = size,
                state = if (!isSelected) State.Secondary else State.Accent,
                endContent = if (isSelected) {
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    }
                } else {
                    null
                },
                enabled = enabled,
            )
        }
    }
}

@Composable
internal fun SandboxEmbeddedChipGroup(
    items: List<String>,
    modifier: Modifier = Modifier,
    onChipClosedPressed: ((String) -> Unit)? = null,
    size: SandboxEmbeddedChip.Size = SandboxEmbeddedChip.Size.M,
    gap: SandboxChipGroup.Gap = SandboxChipGroup.Gap.Dense,
    shouldWrap: Boolean = true,
    enabled: Boolean = true,
) {
    ChipGroup(
        modifier = modifier,
        horizontalSpacing = gap.value,
        verticalSpacing = gap.value,
        overflowMode = if (shouldWrap) OverflowMode.Wrap else OverflowMode.Unlimited,
    ) {
        items.forEach {
            SandboxEmbeddedChip(
                modifier = Modifier
                    .height(size.height),
                label = it,
                size = size,
                state = SandboxEmbeddedChip.State.Secondary,
                endContent = {
                    Icon(
                        modifier = Modifier.clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                        ) { onChipClosedPressed?.invoke(it) },
                        painter = painterResource(id = R.drawable.ic_close_24),
                        contentDescription = "",
                    )
                },
                enabled = enabled,
            )
        }
    }
}

internal object SandboxChipGroup {

    enum class Gap(val value: Dp) {
        Dense(2.dp),
        Wide(8.dp),
    }
}
