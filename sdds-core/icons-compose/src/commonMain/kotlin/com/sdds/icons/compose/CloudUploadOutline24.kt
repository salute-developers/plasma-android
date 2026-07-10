package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudUploadOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudUploadOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.0 13.25 c 0.0 -2.684 1.838 -4.937 4.324 -5.572 C 7.2 4.964 9.744 3.0 12.75 3.0 c 3.728 0.0 6.75 3.022 6.75 6.75 c 0.0 0.236 -0.012 0.47 -0.036 0.7 C 20.964 11.18 22.0 12.718 22.0 14.5 c 0.0 2.485 -2.015 4.5 -4.5 4.5 H 15.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 14.586 17.5 15.0 17.5 h 2.5 c 1.657 0.0 3.0 -1.343 3.0 -3.0 c 0.0 -1.34 -0.878 -2.475 -2.092 -2.86 c -0.364 -0.116 -0.583 -0.487 -0.509 -0.861 C 17.965 10.447 18.0 10.103 18.0 9.75 c 0.0 -2.9 -2.35 -5.25 -5.25 -5.25 c -2.096 0.0 -3.906 1.229 -4.748 3.005 c 1.508 0.066 2.866 0.712 3.854 1.72 c 0.29 0.296 0.286 0.77 -0.01 1.06 c -0.296 0.29 -0.77 0.286 -1.06 -0.01 C 10.012 9.487 8.938 9.0 7.75 9.0 C 7.51 9.0 7.274 9.02 7.045 9.058 C 5.034 9.393 3.5 11.143 3.5 13.25 c 0.0 2.347 1.903 4.25 4.25 4.25 H 9.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 9.414 19.0 9.0 19.0 H 7.75 C 4.574 19.0 2.0 16.426 2.0 13.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.53 11.97 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -3.0 3.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 1.72 -1.72 V 21.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -6.69 l 1.72 1.72 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -3.0 -3.0 Z")
        )
    }.build()
}
