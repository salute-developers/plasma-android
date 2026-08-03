package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileAutorotateFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileAutorotateFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.498 8.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.788 -0.155 -1.568 -0.457 -2.296 c -0.3 -0.728 -0.743 -1.389 -1.3 -1.946 c -0.557 -0.557 -1.218 -0.999 -1.945 -1.3 c -0.303 -0.125 -0.614 -0.225 -0.931 -0.3 l 0.892 0.893 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.196 -0.512 0.195 -0.707 0.0 L 7.647 1.855 C 7.504 1.712 7.46 1.497 7.538 1.31 C 7.616 1.123 7.798 1.001 8.0 1.001 c 0.92 0.0 1.83 0.181 2.678 0.533 c 0.85 0.352 1.62 0.867 2.27 1.517 c 0.65 0.65 1.166 1.421 1.517 2.27 c 0.352 0.85 0.533 1.76 0.533 2.679 c 0.0 0.276 -0.224 0.5 -0.5 0.5 Z M 3.575 8.044 C 2.95 7.42 2.639 7.108 2.522 6.749 c -0.102 -0.317 -0.102 -0.657 0.0 -0.974 c 0.117 -0.36 0.43 -0.671 1.053 -1.295 L 4.48 3.573 C 5.105 2.95 5.417 2.638 5.777 2.521 c 0.316 -0.103 0.657 -0.103 0.973 0.0 c 0.36 0.117 0.671 0.428 1.295 1.052 l 4.384 4.384 c 0.623 0.624 0.935 0.936 1.052 1.295 c 0.103 0.317 0.103 0.658 0.0 0.974 c -0.117 0.36 -0.428 0.671 -1.052 1.295 l -0.907 0.907 c -0.624 0.624 -0.935 0.936 -1.295 1.052 c -0.316 0.103 -0.657 0.103 -0.973 0.0 c -0.36 -0.116 -0.672 -0.428 -1.296 -1.052 L 3.575 8.044 Z M 2.002 8.0 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 s -0.5 0.223 -0.5 0.5 c 0.0 0.919 0.18 1.829 0.533 2.678 c 0.351 0.849 0.867 1.62 1.516 2.27 c 0.65 0.65 1.422 1.165 2.27 1.517 c 0.85 0.352 1.76 0.533 2.679 0.533 c 0.202 0.0 0.384 -0.122 0.462 -0.309 c 0.077 -0.187 0.034 -0.402 -0.109 -0.545 L 6.45 12.241 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 c -0.195 0.195 -0.195 0.512 0.0 0.707 l 0.892 0.893 c -0.317 -0.074 -0.628 -0.175 -0.93 -0.3 c -0.728 -0.301 -1.39 -0.743 -1.946 -1.3 c -0.557 -0.557 -1.0 -1.218 -1.3 -1.946 C 2.156 9.567 2.002 8.787 2.002 8.0 Z")
        )
    }.build()
}
