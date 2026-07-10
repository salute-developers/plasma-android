package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.139 12.656 c 0.1 5.204 2.373 7.408 4.174 7.863 v -7.863 h 2.902 v 4.489 c 1.777 -0.194 3.644 -2.239 4.274 -4.489 h 2.904 c -0.484 2.773 -2.51 4.818 -3.95 5.658 c 1.44 0.682 3.747 2.466 4.624 5.693 h -3.195 c -0.686 -2.159 -2.396 -3.829 -4.657 -4.056 v 4.056 h -0.349 c -6.153 0.0 -9.663 -4.26 -9.81 -11.35 h 3.083 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.54 4.36 c 6.11 0.0 9.165 0.0 11.063 1.916 C 31.5 8.193 31.5 11.28 31.5 17.45 v 1.091 c 0.0 6.17 0.0 9.256 -1.898 11.173 c -1.897 1.917 -4.953 1.916 -11.062 1.916 h -1.08 c -6.11 0.0 -9.165 0.0 -11.063 -1.916 C 4.5 27.796 4.5 24.71 4.5 18.54 v -1.09 c 0.0 -6.171 0.0 -9.257 1.897 -11.174 C 8.295 4.36 11.351 4.36 17.46 4.36 h 1.08 Z m -1.0 2.0 c -5.204 0.0 -7.806 0.0 -9.423 1.635 C 6.5 9.631 6.5 12.264 6.5 17.53 v 0.931 c 0.0 5.265 0.0 7.897 1.617 9.533 c 1.617 1.636 4.219 1.636 9.423 1.636 h 0.92 c 5.204 0.0 7.806 0.0 9.423 -1.636 S 29.5 23.725 29.5 18.46 v -0.93 c 0.0 -5.266 0.0 -7.9 -1.617 -9.535 C 26.266 6.36 23.664 6.36 18.46 6.36 h -0.92 Z")
        )
    }.build()
}
