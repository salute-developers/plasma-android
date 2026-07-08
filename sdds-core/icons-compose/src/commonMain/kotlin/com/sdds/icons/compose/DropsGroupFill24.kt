package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropsGroupFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropsGroupFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.76 12.09 c 0.141 -0.12 0.339 -0.12 0.48 0.0 l 0.072 0.065 l 0.158 0.148 c 0.087 0.083 0.182 0.176 0.281 0.277 c 0.377 0.386 0.753 0.82 1.105 1.296 c 1.024 1.38 1.644 2.82 1.644 4.266 C 15.5 20.272 13.933 22.0 12.0 22.0 s -3.5 -1.727 -3.5 -3.858 c 0.0 -1.445 0.62 -2.885 1.644 -4.266 c 0.352 -0.475 0.728 -0.91 1.105 -1.296 c 0.1 -0.101 0.194 -0.194 0.281 -0.277 l 0.085 -0.081 l 0.146 -0.131 Z m -5.0 -10.0 c 0.141 -0.12 0.339 -0.12 0.48 0.0 l 0.072 0.065 l 0.158 0.148 C 7.557 2.386 7.652 2.479 7.75 2.58 C 8.128 2.966 8.504 3.4 8.856 3.876 C 9.88 5.256 10.5 6.696 10.5 8.143 C 10.5 10.273 8.933 12.0 7.0 12.0 s -3.5 -1.727 -3.5 -3.857 c 0.0 -1.446 0.62 -2.887 1.644 -4.267 C 5.496 3.4 5.872 2.966 6.249 2.58 c 0.1 -0.101 0.194 -0.194 0.281 -0.277 l 0.085 -0.081 l 0.146 -0.131 Z m 10.0 0.0 c 0.141 -0.12 0.339 -0.12 0.48 0.0 l 0.073 0.065 l 0.157 0.148 c 0.087 0.083 0.182 0.176 0.281 0.277 c 0.377 0.386 0.753 0.82 1.105 1.296 c 1.024 1.38 1.644 2.82 1.644 4.267 C 20.5 10.273 18.933 12.0 17.0 12.0 s -3.5 -1.727 -3.5 -3.857 c 0.0 -1.446 0.62 -2.887 1.644 -4.267 c 0.352 -0.475 0.728 -0.91 1.105 -1.296 c 0.1 -0.101 0.194 -0.194 0.281 -0.277 l 0.085 -0.081 l 0.146 -0.131 Z")
        )
    }.build()
}
