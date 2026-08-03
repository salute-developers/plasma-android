package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DeliveryOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DeliveryOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.683 2.035 C 2.426 1.934 2.136 2.06 2.035 2.317 C 1.934 2.574 2.06 2.865 2.317 2.966 l 1.454 0.57 C 3.83 3.56 3.873 3.608 3.891 3.668 l 1.47 5.055 c 0.39 1.338 1.763 2.131 3.116 1.799 l 5.142 -1.263 c 0.268 -0.065 0.433 -0.336 0.367 -0.604 c -0.066 -0.269 -0.337 -0.433 -0.605 -0.367 L 8.239 9.55 C 7.406 9.754 6.561 9.266 6.321 8.443 l -1.47 -5.055 C 4.747 3.03 4.482 2.742 4.136 2.606 L 2.683 2.035 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.19 4.374 C 6.441 4.571 6.0 5.335 6.203 6.081 l 0.511 1.875 C 6.92 8.702 7.69 9.146 8.438 8.95 l 2.918 -0.768 c 0.748 -0.197 1.19 -0.961 0.986 -1.707 L 11.83 4.601 c -0.203 -0.746 -0.974 -1.192 -1.722 -0.995 L 7.189 4.374 Z m 3.181 0.197 L 7.453 5.339 C 7.239 5.395 7.113 5.613 7.17 5.827 L 7.682 7.7 c 0.059 0.213 0.279 0.34 0.493 0.284 l 2.918 -0.768 c 0.214 -0.056 0.34 -0.274 0.282 -0.487 l -0.512 -1.875 c -0.058 -0.213 -0.278 -0.34 -0.492 -0.284 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.694 14.0 c 0.98 0.0 1.774 -0.78 1.774 -1.742 c 0.0 -0.963 -0.795 -1.743 -1.774 -1.743 c -0.98 0.0 -1.775 0.78 -1.775 1.743 C 3.92 13.22 4.714 14.0 5.694 14.0 Z m 0.0 -1.0 c 0.444 0.0 0.774 -0.35 0.774 -0.742 c 0.0 -0.393 -0.33 -0.743 -0.774 -0.743 c -0.445 0.0 -0.775 0.35 -0.775 0.743 S 5.25 13.0 5.694 13.0 Z")
        )
    }.build()
}
