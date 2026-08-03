package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.679 2.5 h 6.642 c 0.542 0.0 0.98 0.0 1.333 0.029 c 0.365 0.03 0.685 0.093 0.981 0.243 c 0.47 0.24 0.853 0.623 1.092 1.093 c 0.151 0.296 0.214 0.616 0.244 0.98 C 15.0 5.2 15.0 5.638 15.0 6.18 V 9.82 c 0.0 0.542 0.0 0.98 -0.029 1.333 c -0.03 0.365 -0.093 0.685 -0.244 0.981 c -0.24 0.47 -0.622 0.853 -1.092 1.092 c -0.296 0.151 -0.616 0.214 -0.98 0.244 C 12.3 13.5 11.862 13.5 11.32 13.5 H 4.68 c -0.542 0.0 -0.98 0.0 -1.333 -0.029 c -0.365 -0.03 -0.685 -0.093 -0.981 -0.244 c -0.47 -0.24 -0.853 -0.622 -1.093 -1.092 c -0.15 -0.296 -0.213 -0.616 -0.243 -0.98 C 1.0 10.8 1.0 10.363 1.0 9.821 V 6.179 c 0.0 -0.542 0.0 -0.98 0.029 -1.333 c 0.03 -0.365 0.093 -0.685 0.243 -0.981 c 0.24 -0.47 0.623 -0.853 1.093 -1.093 c 0.296 -0.15 0.616 -0.213 0.98 -0.243 C 3.7 2.5 4.138 2.5 4.68 2.5 Z M 3.427 3.526 C 3.125 3.55 2.951 3.596 2.82 3.663 C 2.537 3.807 2.307 4.037 2.163 4.32 C 2.096 4.451 2.05 4.625 2.026 4.927 C 2.002 5.221 2.0 5.595 2.0 6.121 h 11.999 c 0.0 -0.527 0.0 -0.9 -0.025 -1.194 c -0.024 -0.302 -0.07 -0.476 -0.138 -0.608 c -0.143 -0.282 -0.373 -0.512 -0.655 -0.656 c -0.132 -0.067 -0.305 -0.113 -0.608 -0.137 C 12.264 3.5 11.868 3.5 11.3 3.5 H 4.7 c -0.568 0.0 -0.964 0.0 -1.273 0.026 Z M 14.0 7.12 H 2.0 V 9.8 c 0.0 0.567 0.0 0.964 0.026 1.272 c 0.024 0.303 0.07 0.476 0.137 0.608 c 0.144 0.282 0.374 0.512 0.656 0.655 c 0.132 0.068 0.306 0.114 0.608 0.138 C 3.736 12.5 4.132 12.5 4.7 12.5 h 6.6 c 0.568 0.0 0.964 0.0 1.273 -0.026 c 0.303 -0.024 0.476 -0.07 0.608 -0.138 c 0.282 -0.143 0.512 -0.373 0.655 -0.655 c 0.068 -0.132 0.114 -0.305 0.138 -0.608 C 14.0 10.764 14.0 10.368 14.0 9.8 l -0.001 -2.68 Z")
        )
    }.build()
}
