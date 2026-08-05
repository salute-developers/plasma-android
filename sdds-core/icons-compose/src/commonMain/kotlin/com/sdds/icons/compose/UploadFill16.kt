package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UploadFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UploadFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.744 1.25 h 8.512 c 0.374 0.0 0.686 0.0 0.941 0.021 c 0.266 0.022 0.516 0.07 0.752 0.192 c 0.362 0.187 0.657 0.485 0.841 0.852 c 0.12 0.24 0.168 0.492 0.19 0.762 C 15.0 3.335 15.0 3.65 15.0 4.03 v 5.79 c 0.0 0.378 0.0 0.695 -0.02 0.953 c -0.023 0.27 -0.07 0.522 -0.19 0.762 c -0.184 0.367 -0.479 0.665 -0.841 0.852 c -0.236 0.122 -0.486 0.17 -0.752 0.192 c -0.255 0.02 -0.567 0.02 -0.94 0.02 H 8.524 V 7.73 l 1.202 1.218 c 0.203 0.206 0.536 0.208 0.742 0.005 c 0.207 -0.204 0.209 -0.536 0.005 -0.743 l -2.1 -2.128 C 8.275 5.981 8.141 5.925 8.0 5.925 c -0.14 0.0 -0.275 0.056 -0.373 0.156 l -2.1 2.128 C 5.323 8.416 5.325 8.75 5.532 8.952 C 5.738 9.155 6.07 9.153 6.274 8.947 l 1.201 -1.218 v 4.86 h 1.05 v 1.634 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.234 -0.525 -0.524 V 12.6 H 3.744 c -0.374 0.0 -0.686 0.0 -0.941 -0.021 c -0.266 -0.022 -0.516 -0.07 -0.752 -0.192 C 1.69 12.2 1.394 11.902 1.21 11.535 c -0.12 -0.24 -0.167 -0.493 -0.19 -0.762 C 1.0 10.515 1.0 10.198 1.0 9.819 V 4.03 c 0.0 -0.379 0.0 -0.695 0.02 -0.953 c 0.023 -0.27 0.07 -0.523 0.19 -0.762 C 1.394 1.948 1.689 1.65 2.05 1.463 C 2.287 1.34 2.537 1.293 2.803 1.27 C 3.058 1.25 3.37 1.25 3.743 1.25 Z")
        )
    }.build()
}
