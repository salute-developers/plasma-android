package com.sdds.testing.compose.rectskeleton

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RectSkeleton
import com.sdds.compose.uikit.RectSkeletonStyle

/**
 * Тест кейсы для RectSkeleton
 */

/**
 * Preview для меню песочницы
 */
@Composable
fun RectSkeletonForSandbox(style: RectSkeletonStyle) {
    RectSkeleton(
        modifier = Modifier
            .width(200.dp)
            .height(60.dp),
        style = style,
        duration = 5000,
    )
}
