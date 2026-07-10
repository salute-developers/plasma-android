package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResizeDiagonal36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResizeDiagonal36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.751 19.375 c 0.148 0.0 0.294 0.03 0.43 0.086 c 0.137 0.056 0.261 0.14 0.366 0.244 c 0.104 0.105 0.188 0.229 0.244 0.365 c 0.056 0.137 0.085 0.283 0.085 0.431 c 0.0 0.148 -0.029 0.294 -0.085 0.43 c -0.056 0.137 -0.14 0.261 -0.244 0.366 l -11.25 11.25 c -0.105 0.104 -0.229 0.188 -0.365 0.244 c -0.137 0.056 -0.283 0.086 -0.431 0.086 c -0.148 0.0 -0.294 -0.03 -0.43 -0.086 c -0.137 -0.056 -0.261 -0.14 -0.366 -0.244 c -0.104 -0.105 -0.188 -0.229 -0.244 -0.365 c -0.057 -0.137 -0.086 -0.283 -0.086 -0.431 c 0.0 -0.148 0.03 -0.294 0.086 -0.43 c 0.056 -0.137 0.14 -0.261 0.244 -0.366 l 11.25 -11.25 c 0.105 -0.104 0.229 -0.188 0.365 -0.244 c 0.137 -0.056 0.283 -0.086 0.431 -0.086 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.501 7.0 c 0.148 0.0 0.294 0.03 0.43 0.086 c 0.137 0.057 0.261 0.14 0.366 0.244 c 0.104 0.105 0.187 0.229 0.244 0.365 c 0.057 0.137 0.086 0.283 0.086 0.431 c 0.0 0.148 -0.03 0.294 -0.086 0.43 c -0.057 0.137 -0.14 0.261 -0.244 0.366 L 8.922 30.297 c -0.211 0.21 -0.498 0.33 -0.796 0.33 c -0.298 0.0 -0.585 -0.12 -0.796 -0.33 C 7.12 30.086 7.0 29.799 7.0 29.5 c 0.0 -0.299 0.119 -0.585 0.33 -0.796 L 28.705 7.33 c 0.104 -0.104 0.228 -0.187 0.364 -0.244 C 29.206 7.029 29.353 7.0 29.501 7.0 Z")
        )
    }.build()
}
