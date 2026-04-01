// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.Pilled
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.plasma.homeds.styles.chipgroup.Xxs

internal object PlasmaHomedsChipGroupDenseVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { ChipGroupDense.L.Default.style() },
            "L.Secondary" to ComposeStyleReference { ChipGroupDense.L.Secondary.style() },
            "L.Pilled.Default" to ComposeStyleReference { ChipGroupDense.L.Pilled.Default.style() },
            "L.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.L.Pilled.Secondary.style() },
            "M.Default" to ComposeStyleReference { ChipGroupDense.M.Default.style() },
            "M.Secondary" to ComposeStyleReference { ChipGroupDense.M.Secondary.style() },
            "M.Pilled.Default" to ComposeStyleReference { ChipGroupDense.M.Pilled.Default.style() },
            "M.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.M.Pilled.Secondary.style() },
            "S.Default" to ComposeStyleReference { ChipGroupDense.S.Default.style() },
            "S.Secondary" to ComposeStyleReference { ChipGroupDense.S.Secondary.style() },
            "S.Pilled.Default" to ComposeStyleReference { ChipGroupDense.S.Pilled.Default.style() },
            "S.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.S.Pilled.Secondary.style() },
            "Xs.Default" to ComposeStyleReference { ChipGroupDense.Xs.Default.style() },
            "Xs.Secondary" to ComposeStyleReference { ChipGroupDense.Xs.Secondary.style() },
            "Xs.Pilled.Default" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Default.style() },
            "Xs.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Secondary.style() },
            "Xxs.Default" to ComposeStyleReference { ChipGroupDense.Xxs.Default.style() },
            "Xxs.Secondary" to ComposeStyleReference { ChipGroupDense.Xxs.Secondary.style() },
            "Xxs.Pilled.Default" to ComposeStyleReference { ChipGroupDense.Xxs.Pilled.Default.style() },
            "Xxs.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.Xxs.Pilled.Secondary.style() },
        )
}
