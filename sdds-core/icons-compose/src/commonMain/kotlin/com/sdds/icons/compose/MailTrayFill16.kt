package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailTrayFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailTrayFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.137 2.5 H 4.863 c -0.57 0.0 -1.028 0.0 -1.4 0.03 C 3.08 2.56 2.744 2.625 2.433 2.78 C 1.94 3.028 1.538 3.423 1.286 3.908 C 1.128 4.213 1.062 4.543 1.03 4.919 C 1.0 5.284 1.0 5.735 1.0 6.294 v 2.581 h 4.194 c 0.432 0.0 0.786 0.232 1.01 0.507 C 6.318 9.52 6.45 9.648 6.596 9.758 C 6.998 10.061 7.491 10.226 8.0 10.226 c 0.509 0.0 1.002 -0.165 1.404 -0.468 c 0.146 -0.11 0.278 -0.237 0.392 -0.376 c 0.224 -0.275 0.578 -0.507 1.01 -0.507 H 15.0 V 6.294 c 0.0 -0.56 0.0 -1.01 -0.03 -1.375 c -0.032 -0.376 -0.098 -0.706 -0.256 -1.011 c -0.252 -0.485 -0.653 -0.88 -1.147 -1.127 c -0.311 -0.156 -0.647 -0.22 -1.03 -0.251 c -0.372 -0.03 -0.83 -0.03 -1.4 -0.03 Z M 15.0 9.875 h -4.194 c -0.06 0.0 -0.15 0.034 -0.236 0.14 c -0.165 0.2 -0.354 0.383 -0.565 0.542 C 9.43 10.99 8.725 11.226 8.0 11.226 c -0.724 0.0 -1.43 -0.235 -2.005 -0.67 c -0.211 -0.158 -0.4 -0.34 -0.565 -0.541 c -0.086 -0.106 -0.177 -0.14 -0.236 -0.14 H 1.0 c 0.0 0.482 0.003 0.878 0.03 1.206 c 0.032 0.376 0.098 0.706 0.256 1.011 c 0.252 0.485 0.653 0.88 1.147 1.127 c 0.311 0.156 0.647 0.22 1.03 0.251 c 0.372 0.03 0.83 0.03 1.4 0.03 h 6.274 c 0.57 0.0 1.028 0.0 1.4 -0.03 c 0.383 -0.03 0.719 -0.095 1.03 -0.251 c 0.494 -0.247 0.895 -0.642 1.147 -1.127 c 0.158 -0.305 0.224 -0.635 0.256 -1.011 c 0.027 -0.328 0.03 -0.724 0.03 -1.206 Z M 3.125 7.141 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 8.75 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -8.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.5 -2.563 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 8.75 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -8.75 Z")
        )
    }.build()
}
