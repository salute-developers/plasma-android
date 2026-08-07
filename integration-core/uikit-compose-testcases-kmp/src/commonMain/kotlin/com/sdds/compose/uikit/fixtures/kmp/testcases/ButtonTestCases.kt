package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle

/**
 * Тест-кейс для Button
 */
@Composable
fun ButtonSizeLDefaultKmp(style: ButtonStyle) {
    Button(
        style = style,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * Тест-кейс для Button
 */
@Composable
fun ButtonSizeLDisabledKmp(style: ButtonStyle) {
    Button(
        style = style,
        spacing = ButtonSpacing.Packed,
        label = "Label",
        enabled = false,
        loading = false,
        onClick = {},
    )
}

/**
 * Тест-кейс для Button
 */
@Composable
fun ButtonSizeLIsLoadingKmp(style: ButtonStyle) {
    Button(
        style = style,
        label = "Label",
        enabled = true,
        loading = true,
        onClick = {},
    )
}

/**
 * Тест-кейс для Button
 */
@Composable
fun ButtonSizeMSpaceBetweenKmp(style: ButtonStyle) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        style = style,
        spacing = ButtonSpacing.SpaceBetween,
        label = "Label",
        value = "Value",
        enabled = true,
        loading = false,
        onClick = {},
    )
}
