// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chip.Chip
import com.sdds.plasma.homeds.styles.chip.Default
import com.sdds.plasma.homeds.styles.chip.L
import com.sdds.plasma.homeds.styles.chip.M
import com.sdds.plasma.homeds.styles.chip.Pilled
import com.sdds.plasma.homeds.styles.chip.S
import com.sdds.plasma.homeds.styles.chip.Secondary
import com.sdds.plasma.homeds.styles.chip.Xs
import com.sdds.plasma.homeds.styles.chip.Xxs

internal object PlasmaHomedsChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { Chip.L.Default.style() },
            "L.Secondary" to ComposeStyleReference { Chip.L.Secondary.style() },
            "L.Pilled.Default" to ComposeStyleReference { Chip.L.Pilled.Default.style() },
            "L.Pilled.Secondary" to ComposeStyleReference { Chip.L.Pilled.Secondary.style() },
            "M.Default" to ComposeStyleReference { Chip.M.Default.style() },
            "M.Secondary" to ComposeStyleReference { Chip.M.Secondary.style() },
            "M.Pilled.Default" to ComposeStyleReference { Chip.M.Pilled.Default.style() },
            "M.Pilled.Secondary" to ComposeStyleReference { Chip.M.Pilled.Secondary.style() },
            "S.Default" to ComposeStyleReference { Chip.S.Default.style() },
            "S.Secondary" to ComposeStyleReference { Chip.S.Secondary.style() },
            "S.Pilled.Default" to ComposeStyleReference { Chip.S.Pilled.Default.style() },
            "S.Pilled.Secondary" to ComposeStyleReference { Chip.S.Pilled.Secondary.style() },
            "Xs.Default" to ComposeStyleReference { Chip.Xs.Default.style() },
            "Xs.Secondary" to ComposeStyleReference { Chip.Xs.Secondary.style() },
            "Xs.Pilled.Default" to ComposeStyleReference { Chip.Xs.Pilled.Default.style() },
            "Xs.Pilled.Secondary" to ComposeStyleReference { Chip.Xs.Pilled.Secondary.style() },
            "Xxs.Default" to ComposeStyleReference { Chip.Xxs.Default.style() },
            "Xxs.Secondary" to ComposeStyleReference { Chip.Xxs.Secondary.style() },
            "Xxs.Pilled.Default" to ComposeStyleReference { Chip.Xxs.Pilled.Default.style() },
            "Xxs.Pilled.Secondary" to ComposeStyleReference { Chip.Xxs.Pilled.Secondary.style() },
        )
}
