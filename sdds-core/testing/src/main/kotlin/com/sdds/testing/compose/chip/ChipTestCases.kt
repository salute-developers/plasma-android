package com.sdds.testing.compose.chip

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupOverflowMode
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R

/**
 * Тест кейсы для Chip, ChipGroup
 */

/**
 * PLASMA-T1442
 */
@Composable
fun ChipSizeLDefault(style: ChipStyle) {
    Chip(
        style = style,
        label = "Label",
        onClick = {},
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_close_24),
                contentDescription = null,
            )
        },
        enabled = true,
    )
}

/**
 * PLASMA-T1443
 */
@Composable
fun ChipSizeMSecondaryPilled(style: ChipStyle) {
    Chip(
        style = style,
        label = "Label",
        onClick = {},
        enabled = true,
    )
}

/**
 * PLASMA-T1446
 */
@Composable
fun ChipSizeSAccent(style: ChipStyle) {
    Chip(
        style = style,
        label = "Label",
        onClick = {},
        enabled = true,
    )
}

/**
 * PLASMA-T1447
 */
@Composable
fun ChipSizeXSContentLeft(style: ChipStyle) {
    Chip(
        style = style,
        label = "Label",
        onClick = {},
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_16),
                contentDescription = null,
            )
        },
        enabled = true,
    )
}

/**
 * PLASMA-T1654
 */
@Composable
fun ChipDisabled(style: ChipStyle) {
    Chip(
        style = style,
        label = "Label",
        onClick = {},
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_close_24),
                contentDescription = null,
            )
        },
        enabled = false,
    )
}

/**
 * PLASMA-T1599
 */
@Composable
fun ChipGroupSizeLDense(style: ChipGroupStyle) {
    ChipGroup(
        style = style,
        overflowMode = ChipGroupOverflowMode.Unlimited,
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

/**
 * PLASMA-T1600
 */
@Composable
fun ChipGroupSizeMSecondaryWideWrapped(style: ChipGroupStyle) {
    ChipGroup(
        style = style,
        overflowMode = ChipGroupOverflowMode.Wrap,
        content = {
            repeat(20) {
                Chip(
                    label = "Label",
                    onClick = {},
                    enabled = true,
                )
            }
        },
    )
}

/**
 * PLASMA-T1601
 */
@Composable
fun ChipGroupSizeSAccentDense(style: ChipGroupStyle) {
    ChipGroup(
        style = style,
        overflowMode = ChipGroupOverflowMode.Scrollable,
        content = {
            repeat(10) {
                Chip(
                    label = "Label",
                    onClick = {},
                    enabled = true,
                )
            }
        },
    )
}

/**
 * PLASMA-T1602
 */
@Composable
fun ChipGroupSizeXsDefault(style: ChipGroupStyle) {
    ChipGroup(
        style = style,
        overflowMode = ChipGroupOverflowMode.Unlimited,
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
