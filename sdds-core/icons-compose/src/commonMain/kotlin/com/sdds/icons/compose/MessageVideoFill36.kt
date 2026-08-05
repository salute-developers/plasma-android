package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageVideoFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageVideoFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.47 17.89 c 0.0 -6.981 5.66 -12.64 12.64 -12.64 s 12.64 5.659 12.64 12.64 c 0.0 6.98 -5.66 12.64 -12.64 12.64 c -1.502 0.0 -2.945 -0.263 -4.284 -0.745 c -0.803 -0.29 -1.593 -0.373 -2.287 -0.178 L 7.72 30.676 c -1.46 0.409 -2.806 -0.937 -2.397 -2.397 l 1.07 -3.818 c 0.194 -0.695 0.11 -1.484 -0.179 -2.288 c -0.482 -1.339 -0.745 -2.781 -0.745 -4.283 Z m 7.219 3.118 c -0.088 -0.317 -0.088 -0.745 -0.088 -1.456 v -3.975 c 0.0 -0.892 0.0 -1.338 0.174 -1.68 c 0.153 -0.3 0.396 -0.543 0.696 -0.696 c 0.341 -0.174 0.787 -0.174 1.68 -0.174 h 3.326 c 0.893 0.0 1.34 0.0 1.68 0.174 c 0.3 0.153 0.544 0.397 0.697 0.697 c 0.036 0.07 0.064 0.145 0.087 0.228 c 0.087 0.317 0.087 0.744 0.087 1.452 v 0.676 l 2.201 -1.78 c 0.37 -0.298 0.898 -0.1 1.015 0.321 c 0.015 0.055 0.024 0.114 0.024 0.176 v 5.189 c 0.0 0.536 -0.622 0.832 -1.039 0.495 l -2.201 -1.78 v 0.678 c 0.0 0.892 0.0 1.339 -0.174 1.68 c -0.153 0.3 -0.397 0.543 -0.697 0.696 c -0.34 0.174 -0.787 0.174 -1.68 0.174 h -3.326 c -0.892 0.0 -1.339 0.0 -1.68 -0.174 c -0.3 -0.153 -0.543 -0.397 -0.696 -0.696 c -0.035 -0.07 -0.064 -0.144 -0.086 -0.225 Z")
        )
    }.build()
}
