package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun MobileLayout(
    hasMultipleThemes: Boolean,
    showTopBar: Boolean,
    topBar: @Composable (() -> Unit),
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
    ) {
        if (hasMultipleThemes && showTopBar) {
            topBar()
        }
        content()
    }
}
