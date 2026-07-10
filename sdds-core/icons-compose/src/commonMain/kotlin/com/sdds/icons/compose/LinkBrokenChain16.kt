package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LinkBrokenChain16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LinkBrokenChain16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.855 6.646 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 3.11 8.805 c -1.074 1.074 -1.074 2.816 0.0 3.89 C 4.184 13.77 5.926 13.77 7.0 12.698 l 1.453 -1.452 c 0.196 -0.196 0.512 -0.196 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 l -1.452 1.452 c -1.465 1.464 -3.84 1.463 -5.305 -0.001 c -1.465 -1.465 -1.465 -3.84 0.0 -5.305 l 1.452 -1.452 Z m -1.542 -5.0 c 0.195 -0.194 0.512 -0.194 0.707 0.0 l 5.216 5.217 l 2.045 -2.044 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.194 0.195 0.195 0.512 0.0 0.707 L 8.943 7.57 l 5.956 5.956 c 0.195 0.195 0.195 0.511 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 2.312 2.353 c -0.194 -0.194 -0.194 -0.511 0.0 -0.706 Z m 5.219 7.335 l -2.045 2.047 c -0.195 0.194 -0.512 0.194 -0.707 0.0 c -0.196 -0.195 -0.195 -0.513 0.0 -0.708 l 2.045 -2.046 l 0.707 0.707 Z m 0.525 -6.538 c 1.465 -1.465 3.84 -1.465 5.305 0.0 c 1.464 1.465 1.465 3.84 0.0 5.305 L 11.91 9.201 c -0.195 0.194 -0.511 0.194 -0.707 0.0 c -0.195 -0.196 -0.194 -0.512 0.0 -0.708 l 1.453 -1.452 c 1.074 -1.074 1.073 -2.816 -0.001 -3.89 c -1.075 -1.075 -2.817 -1.075 -3.891 0.0 L 7.312 4.603 c -0.195 0.194 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 1.452 -1.453 Z")
        )
    }.build()
}
