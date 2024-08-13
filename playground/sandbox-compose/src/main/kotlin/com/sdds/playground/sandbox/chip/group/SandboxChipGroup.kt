package com.sdds.playground.sandbox.chip.group

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
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.chip.SandboxChip
import com.sdds.playground.sandbox.chip.SandboxChip.State

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
        shouldWrap = shouldWrap,
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
                state = if (!isSelected) State.Default else State.Accent,
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

internal object SandboxChipGroup {

    enum class Size(val height: Dp) {
        L(48.dp),
        M(40.dp),
        S(32.dp),
        XS(24.dp),
    }

    enum class Gap(val value: Dp) {
        Dense(2.dp),
        Wide(8.dp),
    }
}
