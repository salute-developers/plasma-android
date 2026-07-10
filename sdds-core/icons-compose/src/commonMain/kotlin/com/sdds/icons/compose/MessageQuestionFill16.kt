package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageQuestionFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageQuestionFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.051 2.05 c -3.257 0.0 -5.898 2.64 -5.898 5.899 c 0.0 0.7 0.122 1.374 0.347 1.999 c 0.135 0.375 0.174 0.743 0.083 1.067 l -0.499 1.782 c -0.19 0.681 0.438 1.31 1.119 1.118 l 1.782 -0.498 c 0.324 -0.091 0.692 -0.052 1.067 0.083 c 0.625 0.225 1.298 0.347 2.0 0.347 c 3.257 0.0 5.898 -2.64 5.898 -5.898 c 0.0 -3.258 -2.641 -5.899 -5.899 -5.899 Z M 6.914 5.448 C 6.707 5.61 6.51 5.92 6.51 6.588 c 0.0 0.234 -0.19 0.425 -0.425 0.425 S 5.66 6.823 5.66 6.588 c 0.0 -0.845 0.257 -1.442 0.73 -1.81 c 0.453 -0.352 1.023 -0.43 1.51 -0.43 c 0.486 0.0 1.056 0.078 1.508 0.43 c 0.474 0.368 0.731 0.965 0.731 1.81 c 0.0 0.978 -0.617 1.469 -1.077 1.814 C 8.554 8.784 8.326 8.958 8.326 9.31 c 0.0 0.235 -0.19 0.425 -0.425 0.425 S 7.476 9.545 7.476 9.31 c 0.0 -0.794 0.581 -1.222 0.984 -1.519 l 0.093 -0.069 C 9.0 7.387 9.291 7.122 9.291 6.588 c 0.0 -0.669 -0.197 -0.979 -0.404 -1.14 c -0.228 -0.177 -0.566 -0.25 -0.986 -0.25 c -0.421 0.0 -0.759 0.073 -0.987 0.25 Z m 1.592 5.374 c 0.0 0.334 -0.271 0.605 -0.605 0.605 c -0.334 0.0 -0.605 -0.27 -0.605 -0.605 c 0.0 -0.334 0.27 -0.605 0.605 -0.605 c 0.334 0.0 0.605 0.271 0.605 0.605 Z")
        )
    }.build()
}
