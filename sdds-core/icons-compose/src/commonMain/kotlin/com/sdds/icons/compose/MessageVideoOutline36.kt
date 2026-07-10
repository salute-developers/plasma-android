package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageVideoOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageVideoOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.552 15.522 c 0.0 -0.893 0.0 -1.339 0.174 -1.68 c 0.153 -0.3 0.396 -0.543 0.696 -0.696 c 0.341 -0.174 0.787 -0.174 1.68 -0.174 h 3.41 c 0.892 0.0 1.338 0.0 1.68 0.174 c 0.3 0.153 0.543 0.396 0.696 0.696 c 0.174 0.341 0.174 0.787 0.174 1.68 v 0.71 l 2.234 -1.807 c 0.417 -0.337 1.038 -0.04 1.038 0.496 v 5.266 c 0.0 0.536 -0.62 0.833 -1.038 0.496 l -2.234 -1.806 v 0.709 c 0.0 0.892 0.0 1.339 -0.174 1.68 c -0.153 0.3 -0.397 0.543 -0.697 0.696 c -0.34 0.174 -0.787 0.174 -1.68 0.174 h -3.409 c -0.893 0.0 -1.339 0.0 -1.68 -0.174 c -0.3 -0.153 -0.543 -0.396 -0.696 -0.696 c -0.174 -0.341 -0.174 -0.788 -0.174 -1.68 v -4.064 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.116 5.102 c -7.06 0.0 -12.782 5.722 -12.782 12.781 c 0.0 1.535 0.27 3.008 0.767 4.373 c 0.285 0.781 0.364 1.547 0.176 2.22 l -1.103 3.937 c -0.411 1.47 0.943 2.823 2.412 2.411 l 3.938 -1.102 c 0.672 -0.188 1.438 -0.109 2.219 0.175 c 1.365 0.498 2.839 0.768 4.373 0.768 c 7.06 0.0 12.782 -5.722 12.782 -12.782 c 0.0 -7.059 -5.723 -12.781 -12.782 -12.781 Z M 7.334 17.883 c 0.0 -5.954 4.827 -10.781 10.782 -10.781 s 10.782 4.827 10.782 10.781 c 0.0 5.955 -4.827 10.782 -10.782 10.782 c -1.298 0.0 -2.54 -0.229 -3.689 -0.647 c -1.04 -0.378 -2.25 -0.556 -3.443 -0.222 l -3.863 1.082 l 1.082 -3.863 c 0.334 -1.194 0.156 -2.403 -0.222 -3.443 c -0.419 -1.15 -0.647 -2.391 -0.647 -3.689 Z")
        )
    }.build()
}
