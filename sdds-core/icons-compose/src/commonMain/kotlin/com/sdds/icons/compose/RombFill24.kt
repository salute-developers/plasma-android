package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RombFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RombFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.504 2.22 l 0.018 0.019 l 8.258 8.257 c 0.158 0.159 0.307 0.307 0.422 0.443 c 0.125 0.147 0.253 0.327 0.328 0.559 c 0.106 0.326 0.106 0.678 0.0 1.005 c -0.075 0.231 -0.203 0.411 -0.328 0.559 c -0.115 0.135 -0.264 0.284 -0.422 0.442 l -8.276 8.276 c -0.158 0.158 -0.307 0.307 -0.442 0.422 c -0.148 0.125 -0.328 0.253 -0.56 0.328 c -0.326 0.106 -0.678 0.106 -1.004 0.0 c -0.232 -0.075 -0.412 -0.203 -0.56 -0.328 c -0.135 -0.115 -0.284 -0.264 -0.442 -0.422 l -8.275 -8.276 c -0.158 -0.158 -0.307 -0.307 -0.422 -0.442 c -0.125 -0.148 -0.253 -0.328 -0.329 -0.56 c -0.106 -0.326 -0.106 -0.678 0.0 -1.004 c 0.076 -0.232 0.204 -0.412 0.329 -0.56 c 0.115 -0.135 0.264 -0.284 0.422 -0.442 l 8.258 -8.257 l 0.017 -0.018 c 0.159 -0.158 0.307 -0.307 0.443 -0.422 c 0.147 -0.125 0.327 -0.253 0.559 -0.329 c 0.326 -0.106 0.678 -0.106 1.005 0.0 c 0.231 0.076 0.411 0.204 0.559 0.329 c 0.135 0.115 0.284 0.264 0.442 0.422 Z")
        )
    }.build()
}
