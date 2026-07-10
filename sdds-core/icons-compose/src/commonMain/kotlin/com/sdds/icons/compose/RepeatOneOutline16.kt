package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatOneOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatOneOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.708 1.4 C 8.514 1.202 8.198 1.2 8.0 1.393 C 7.804 1.587 7.8 1.904 7.995 2.1 l 0.92 0.935 H 5.893 c -2.71 0.0 -4.891 2.23 -4.891 4.963 c 0.0 1.115 0.363 2.146 0.976 2.976 c 0.164 0.222 0.477 0.269 0.699 0.105 c 0.222 -0.164 0.269 -0.477 0.105 -0.7 c -0.49 -0.662 -0.78 -1.486 -0.78 -2.38 c 0.0 -2.198 1.75 -3.964 3.89 -3.964 h 4.216 c 0.201 0.0 0.383 -0.121 0.46 -0.307 c 0.079 -0.186 0.037 -0.4 -0.104 -0.544 L 8.708 1.399 Z m 5.314 3.623 c -0.164 -0.222 -0.477 -0.269 -0.699 -0.105 c -0.222 0.165 -0.269 0.478 -0.105 0.7 c 0.49 0.662 0.78 1.486 0.78 2.381 c 0.0 2.197 -1.75 3.964 -3.89 3.964 H 5.893 c -0.202 0.0 -0.384 0.121 -0.462 0.307 c -0.077 0.186 -0.036 0.4 0.105 0.544 l 1.756 1.785 c 0.194 0.197 0.51 0.2 0.708 0.006 c 0.196 -0.194 0.199 -0.51 0.005 -0.707 l -0.92 -0.935 h 3.023 c 2.708 0.0 4.89 -2.23 4.89 -4.964 c 0.0 -1.115 -0.362 -2.146 -0.976 -2.976 Z M 8.675 5.857 c 0.0 -0.203 -0.123 -0.386 -0.31 -0.462 C 8.175 5.318 7.96 5.362 7.817 5.507 L 6.765 6.578 C 6.57 6.775 6.574 7.091 6.77 7.285 C 6.967 7.48 7.284 7.476 7.478 7.28 l 0.197 -0.2 v 3.064 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 5.857 Z")
        )
    }.build()
}
