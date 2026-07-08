package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SettingsFilterOff36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SettingsFilterOff36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.162 5.707 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -3.582 3.582 c -0.67 -0.397 -1.453 -0.625 -2.289 -0.625 c -2.142 0.0 -3.934 1.496 -4.389 3.5 H 4.377 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 15.111 c 0.105 0.46 0.28 0.894 0.514 1.289 l -5.746 5.746 c -0.634 -0.341 -1.359 -0.535 -2.129 -0.535 c -2.175 0.0 -3.989 1.543 -4.409 3.593 l 0.02 -0.093 H 4.627 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 3.111 c 0.091 0.4 0.235 0.778 0.424 1.13 l -3.87 3.869 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 31.162 5.707 Z M 9.698 24.343 l 3.022 -3.022 c -0.19 -0.047 -0.389 -0.071 -0.593 -0.071 c -1.38 0.0 -2.5 1.12 -2.5 2.5 c 0.0 0.204 0.024 0.403 0.07 0.593 Z m 11.805 -11.806 l 3.161 -3.16 c -0.247 -0.083 -0.512 -0.127 -0.787 -0.127 c -1.38 0.0 -2.5 1.12 -2.5 2.5 c 0.0 0.275 0.044 0.54 0.127 0.787 Z M 16.881 22.75 l -5.447 5.447 c 0.226 0.035 0.457 0.053 0.693 0.053 c 2.141 0.0 3.934 -1.496 4.388 -3.5 h 15.112 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 16.881 Z m 12.0 -12.0 l -5.476 5.476 c 0.155 0.016 0.313 0.024 0.472 0.024 c 2.142 0.0 3.934 -1.496 4.388 -3.5 h 3.112 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -2.496 Z")
        )
    }.build()
}
