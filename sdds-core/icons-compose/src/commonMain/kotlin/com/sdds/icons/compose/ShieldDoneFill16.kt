package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDoneFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDoneFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.383 1.116 c -0.233 -0.155 -0.533 -0.155 -0.766 0.0 c -0.271 0.18 -1.11 0.72 -2.144 1.212 c -1.05 0.5 -2.23 0.917 -3.202 0.917 c -0.288 0.0 -0.521 0.236 -0.521 0.526 c 0.0 4.923 1.41 7.73 2.926 9.315 c 1.507 1.575 3.056 1.876 3.23 1.906 h 0.005 l 0.013 0.003 C 7.938 14.997 7.966 15.0 8.0 15.0 c 0.034 0.0 0.062 -0.003 0.076 -0.005 l 0.013 -0.003 h 0.003 h 0.001 c 0.175 -0.03 1.724 -0.331 3.23 -1.906 c 1.517 -1.584 2.927 -4.392 2.927 -9.315 c 0.0 -0.29 -0.233 -0.526 -0.52 -0.526 c -0.973 0.0 -2.154 -0.417 -3.203 -0.917 c -1.034 -0.493 -1.873 -1.032 -2.144 -1.212 Z m 2.759 5.454 c 0.189 -0.201 0.179 -0.518 -0.023 -0.707 c -0.201 -0.189 -0.518 -0.179 -0.707 0.023 L 7.454 9.039 L 6.249 7.96 C 6.044 7.776 5.728 7.794 5.543 8.0 C 5.36 8.206 5.377 8.522 5.583 8.706 l 1.568 1.403 c 0.202 0.181 0.512 0.168 0.698 -0.03 l 3.293 -3.51 Z")
        )
    }.build()
}
