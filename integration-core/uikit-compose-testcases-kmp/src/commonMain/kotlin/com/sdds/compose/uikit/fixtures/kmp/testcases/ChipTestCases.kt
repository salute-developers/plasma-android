package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipStyle

/**
 * Тест-кейс для Chip
 */
@Composable
fun ChipSizeLDefaultKmp(style: ChipStyle) {
    Chip(
        style = style,
        label = "Label",
        onClick = {},
        enabled = true,
    )
}

/**
 * Тест-кейс для Chip
 */
@Composable
fun ChipDisabledKmp(style: ChipStyle) {
    Chip(
        style = style,
        label = "Label",
        onClick = {},
        enabled = false,
    )
}

/**
 * Тест-кейс для Chip
 */
@Composable
fun ChipGroupSizeLDenseKmp(style: ChipGroupStyle) {
    ChipGroup(
        style = style,
        content = {
            repeat(5) {
                Chip(
                    label = "Label",
                    onClick = {},
                    enabled = true,
                )
            }
        },
    )
}
