package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatTranscriptionFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatTranscriptionFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.44 6.875 C 1.44 4.072 3.71 1.8 6.513 1.8 s 5.075 2.272 5.075 5.075 c 0.0 2.803 -2.272 5.075 -5.075 5.075 c -0.47 0.0 -0.927 -0.064 -1.36 -0.185 c -0.434 -0.12 -0.83 -0.16 -1.178 -0.069 l -1.358 0.357 c -0.778 0.205 -1.487 -0.505 -1.283 -1.282 l 0.358 -1.358 c 0.091 -0.348 0.051 -0.744 -0.07 -1.178 c -0.12 -0.433 -0.184 -0.89 -0.184 -1.36 Z M 6.513 4.95 c 0.29 0.0 0.525 0.235 0.525 0.525 v 2.8 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -2.8 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z M 9.49 6.175 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.4 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.4 Z M 4.064 5.65 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.4 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.4 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z m 2.55 7.349 c 0.556 -0.009 1.094 -0.092 1.605 -0.24 c 0.45 0.172 0.936 0.266 1.445 0.266 c 0.377 0.0 0.741 -0.052 1.086 -0.148 c 0.514 -0.142 1.114 -0.23 1.714 -0.072 l 1.357 0.357 l 0.009 0.001 h 0.004 c 0.002 0.0 0.007 -0.003 0.011 -0.008 c 0.005 -0.004 0.007 -0.008 0.007 -0.011 v -0.002 l 0.001 -0.002 l -0.001 -0.009 l -0.358 -1.357 c -0.157 -0.6 -0.07 -1.2 0.073 -1.713 c 0.096 -0.345 0.147 -0.71 0.147 -1.086 c 0.0 -1.081 -0.423 -2.063 -1.113 -2.79 c -0.062 -0.55 -0.196 -1.078 -0.394 -1.575 c 1.5 0.876 2.507 2.503 2.507 4.365 c 0.0 0.468 -0.064 0.922 -0.183 1.353 c -0.121 0.436 -0.163 0.837 -0.07 1.192 l 0.358 1.357 c 0.2 0.76 -0.493 1.452 -1.252 1.252 l -1.358 -0.357 c -0.354 -0.093 -0.755 -0.052 -1.191 0.069 c -0.432 0.12 -0.886 0.184 -1.354 0.184 c -1.146 0.0 -2.203 -0.382 -3.05 -1.026 Z")
        )
    }.build()
}
