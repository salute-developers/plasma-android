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
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWide
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.Pilled
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.plasma.homeds.styles.chipgroup.Xxs

internal object PlasmaHomedsChipGroupWideVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { ChipGroupWide.L.Default.style() },
            "L.Secondary" to ComposeStyleReference { ChipGroupWide.L.Secondary.style() },
            "L.Pilled.Default" to ComposeStyleReference { ChipGroupWide.L.Pilled.Default.style() },
            "L.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.L.Pilled.Secondary.style() },
            "M.Default" to ComposeStyleReference { ChipGroupWide.M.Default.style() },
            "M.Secondary" to ComposeStyleReference { ChipGroupWide.M.Secondary.style() },
            "M.Pilled.Default" to ComposeStyleReference { ChipGroupWide.M.Pilled.Default.style() },
            "M.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.M.Pilled.Secondary.style() },
            "S.Default" to ComposeStyleReference { ChipGroupWide.S.Default.style() },
            "S.Secondary" to ComposeStyleReference { ChipGroupWide.S.Secondary.style() },
            "S.Pilled.Default" to ComposeStyleReference { ChipGroupWide.S.Pilled.Default.style() },
            "S.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.S.Pilled.Secondary.style() },
            "Xs.Default" to ComposeStyleReference { ChipGroupWide.Xs.Default.style() },
            "Xs.Secondary" to ComposeStyleReference { ChipGroupWide.Xs.Secondary.style() },
            "Xs.Pilled.Default" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Default.style() },
            "Xs.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Secondary.style() },
            "Xxs.Default" to ComposeStyleReference { ChipGroupWide.Xxs.Default.style() },
            "Xxs.Secondary" to ComposeStyleReference { ChipGroupWide.Xxs.Secondary.style() },
            "Xxs.Pilled.Default" to ComposeStyleReference { ChipGroupWide.Xxs.Pilled.Default.style() },
            "Xxs.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.Xxs.Pilled.Secondary.style() },
        )
}
