package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MegaphoneFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MegaphoneFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.889 5.647 c 0.698 -0.152 1.377 -0.219 2.048 -0.039 c 1.007 0.271 1.875 0.917 2.43 1.807 c 0.37 0.594 0.508 1.268 0.571 1.986 C 33.0 10.101 33.0 10.98 33.0 12.048 v 11.176 c 0.0 1.069 0.0 1.946 -0.062 2.647 c -0.064 0.718 -0.201 1.392 -0.571 1.986 c -0.555 0.89 -1.423 1.536 -2.43 1.806 c -0.671 0.18 -1.35 0.114 -2.048 -0.038 c -0.68 -0.148 -1.511 -0.409 -2.522 -0.726 l -4.699 -1.474 c -0.665 1.068 -1.638 1.918 -2.8 2.427 c -1.452 0.637 -3.09 0.694 -4.582 0.16 c -1.492 -0.532 -2.725 -1.616 -3.455 -3.028 c -0.51 -0.987 -0.747 -2.085 -0.7 -3.18 l -2.808 -0.881 l -0.16 -0.05 c -0.748 -0.234 -1.406 -0.439 -1.916 -0.857 c -0.445 -0.366 -0.791 -0.84 -1.005 -1.379 C 2.998 20.021 3.0 19.327 3.0 18.535 v -1.799 C 3.0 15.945 2.998 15.25 3.242 14.634 c 0.214 -0.538 0.56 -1.012 1.005 -1.378 c 0.51 -0.418 1.168 -0.623 1.917 -0.857 l 0.159 -0.05 l 19.044 -5.976 c 1.01 -0.318 1.841 -0.578 2.522 -0.726 Z m -16.75 18.787 l 7.527 2.362 c -0.427 0.528 -0.974 0.95 -1.602 1.225 c -0.984 0.431 -2.093 0.47 -3.104 0.109 c -1.012 -0.362 -1.853 -1.098 -2.352 -2.064 c -0.264 -0.511 -0.421 -1.066 -0.468 -1.632 Z m -0.014 -9.826 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 6.058 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 v -6.058 Z")
        )
    }.build()
}
