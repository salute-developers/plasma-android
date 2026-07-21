package com.sdds.compose.sandbox.internal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme

@Composable
internal fun MobileLayout(
    hasMultipleThemes: Boolean,
    showTopBar: Boolean,
    topBar: @Composable (() -> Unit),
    showBackButton: Boolean,
    onBack: () -> Unit,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SddsSandboxTheme.colors.backgroundDefaultPrimary)
            .statusBarsPadding(),
    ) {
        when {
            showBackButton -> MobileBackBar(onBack = onBack)
            hasMultipleThemes && showTopBar -> topBar()
        }
        content()
    }
}

@Composable
private fun MobileBackBar(onBack: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(LocalPropertyEditorStyle.current.headerHeight)
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SandboxBackButton(onClick = onBack)
    }
}
