package com.sdds.compose.uikit.fixtures

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

@Composable
actual fun RemoteImage(
    model: String,
    contentDescription: String?,
    modifier: Modifier,
    contentScale: ContentScale,
) {
    Box(modifier = modifier)
}
