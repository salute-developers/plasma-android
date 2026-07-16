package com.sdds.compose.sandbox.internal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.sandbox.theme.SddsSandboxTheme

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
            .background(SddsSandboxTheme.colors.backgroundDefaultPrimary)
            .statusBarsPadding(),
    ) {
        if (hasMultipleThemes && showTopBar) {
            topBar()
        }
        content()
    }
}
