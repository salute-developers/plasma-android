package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ConnectionWaiting36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ConnectionWaiting36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.962 8.802 C 11.362 6.366 14.614 5.0 18.0 5.0 c 3.387 0.0 6.639 1.366 9.039 3.802 c 0.387 0.394 1.02 0.398 1.414 0.01 c 0.393 -0.387 0.398 -1.02 0.01 -1.413 C 25.692 4.584 21.928 3.0 18.0 3.0 c -3.927 0.0 -7.69 1.584 -10.462 4.399 c -0.388 0.393 -0.383 1.026 0.01 1.414 c 0.394 0.387 1.027 0.383 1.414 -0.01 Z m 3.163 3.211 C 13.685 10.428 15.8 9.541 18.0 9.541 c 2.201 0.0 4.315 0.887 5.876 2.472 c 0.388 0.394 1.02 0.399 1.414 0.01 c 0.394 -0.387 0.399 -1.02 0.011 -1.413 c -1.933 -1.963 -4.56 -3.069 -7.3 -3.069 c -2.742 0.0 -5.368 1.106 -7.301 3.069 c -0.388 0.393 -0.383 1.026 0.01 1.414 c 0.394 0.388 1.027 0.383 1.415 -0.01 Z M 10.71 23.976 c 0.394 -0.387 1.027 -0.383 1.415 0.01 C 13.685 25.573 15.8 26.46 18.0 26.46 c 2.201 0.0 4.315 -0.887 5.876 -2.472 c 0.388 -0.393 1.02 -0.398 1.414 -0.01 c 0.394 0.387 0.399 1.02 0.011 1.413 c -1.933 1.963 -4.56 3.07 -7.3 3.07 c -2.742 0.0 -5.368 -1.107 -7.301 -3.07 c -0.388 -0.393 -0.383 -1.026 0.01 -1.414 Z m -1.748 3.22 c -0.387 -0.393 -1.02 -0.398 -1.414 -0.01 c -0.393 0.388 -0.398 1.02 -0.01 1.414 C 10.31 31.415 14.073 33.0 18.0 33.0 c 3.928 0.0 7.691 -1.584 10.463 -4.399 c 0.388 -0.393 0.383 -1.026 -0.01 -1.414 c -0.394 -0.387 -1.027 -0.383 -1.414 0.01 C 24.639 29.634 21.387 31.0 18.0 31.0 c -3.386 0.0 -6.638 -1.366 -9.038 -3.802 Z")
        )
    }.build()
}
