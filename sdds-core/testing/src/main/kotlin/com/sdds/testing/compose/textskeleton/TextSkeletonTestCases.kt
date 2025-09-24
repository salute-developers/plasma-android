package com.sdds.testing.compose.textskeleton

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.SkeletonLineWidthProvider
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextSkeleton
import com.sdds.compose.uikit.TextSkeletonStyle

/**
 * Тест-кейсы для [TextSkeleton]
 */

/**
 * PLASMA-T2091
 */
@Composable
fun TextSkeletonDefaultNoTextRandom(style: TextSkeletonStyle) {
    Box(modifier = Modifier.fillMaxWidth()) {
        val defaultTextStyle = LocalTextStyle.current
        Text(
            text = "",
            style = defaultTextStyle,
        )
        TextSkeleton(
            style = style,
            lineCount = 3,
            textStyle = defaultTextStyle,
            duration = 5000,
            lineWidthProvider = SkeletonLineWidthProvider.RandomDeviation(),
        )
    }
}

/**
 * PLASMA-T2092
 */
@Composable
fun TextSkeletonDefaultFullWidth(
    style: TextSkeletonStyle,
) {
    val defaultTextStyle = LocalTextStyle.current
    Box(
        contentAlignment = Alignment.TopStart,
    ) {
        TextSkeleton(
            style = style,
            textStyle = defaultTextStyle,
            lineCount = 10,
            duration = 5000,
            lineWidthProvider = SkeletonLineWidthProvider.FillMaxWidth,
        )
        Text(
            text = "",
            style = defaultTextStyle,
        )
    }
}
