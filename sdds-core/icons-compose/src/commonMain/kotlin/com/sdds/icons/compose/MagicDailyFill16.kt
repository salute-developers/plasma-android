package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MagicDailyFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MagicDailyFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.25 c -1.257 0.0 -2.275 1.02 -2.275 2.278 h -3.5 c -0.29 0.0 -0.525 0.236 -0.525 0.526 c 0.0 0.29 0.235 0.526 0.525 0.526 H 3.1 v 4.756 c 0.0 0.472 0.0 0.858 0.026 1.172 c 0.026 0.325 0.083 0.619 0.222 0.893 c 0.218 0.428 0.566 0.777 0.994 0.996 c 0.274 0.14 0.567 0.196 0.89 0.223 c 0.314 0.025 0.7 0.025 1.17 0.025 h 3.195 c 0.471 0.0 0.857 0.0 1.17 -0.025 c 0.324 -0.027 0.617 -0.084 0.89 -0.223 c 0.429 -0.219 0.777 -0.568 0.995 -0.996 c 0.14 -0.274 0.196 -0.568 0.222 -0.893 c 0.026 -0.314 0.026 -0.7 0.026 -1.172 V 4.58 h 0.875 c 0.29 0.0 0.525 -0.235 0.525 -0.526 c 0.0 -0.29 -0.235 -0.526 -0.525 -0.526 h -3.5 C 10.275 2.271 9.257 1.25 8.0 1.25 Z M 8.0 2.3 c -0.676 0.0 -1.225 0.549 -1.225 1.228 h 2.45 C 9.225 2.85 8.675 2.3 8.0 2.3 Z M 5.53 5.962 c 0.204 -0.205 0.537 -0.204 0.742 0.001 l 1.75 1.753 c 0.204 0.205 0.204 0.537 0.0 0.742 l -1.75 1.753 c -0.205 0.205 -0.538 0.206 -0.743 0.0 c -0.205 -0.204 -0.205 -0.536 0.0 -0.742 l 1.38 -1.382 l -1.38 -1.382 c -0.205 -0.205 -0.205 -0.538 0.0 -0.743 Z m 2.8 0.0 c 0.204 -0.205 0.537 -0.204 0.742 0.001 l 1.75 1.753 c 0.204 0.205 0.204 0.537 0.0 0.742 l -1.75 1.753 c -0.205 0.205 -0.538 0.206 -0.743 0.0 c -0.205 -0.204 -0.205 -0.536 0.0 -0.742 l 1.38 -1.382 l -1.38 -1.382 c -0.205 -0.205 -0.205 -0.538 0.0 -0.743 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 10.366 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 0.012 c -0.003 1.833 -1.488 3.318 -3.32 3.32 H 5.37 c -1.832 -0.002 -3.317 -1.487 -3.32 -3.32 v -0.012 H 1.0 v 0.014 c 0.004 2.41 1.957 4.365 4.369 4.368 h 5.262 c 2.412 -0.003 4.365 -1.957 4.369 -4.368 v -0.014 Z")
        )
    }.build()
}
