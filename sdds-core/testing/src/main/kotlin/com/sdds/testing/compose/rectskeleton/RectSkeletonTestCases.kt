package com.sdds.testing.compose.rectskeleton

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RectSkeleton
import com.sdds.compose.uikit.RectSkeletonStyle

/**
 * Тест-кейсы для RectSkeleton
 */

@Composable
fun RectSkeletonTest(style: RectSkeletonStyle) {
    RectSkeleton(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp),
        style = style,
        duration = 5000,
    )
}
