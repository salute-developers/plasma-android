package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RubleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RubleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m -1.892 7.567 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 5.81 h -1.27 c -0.552 0.0 -1.0 0.449 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 1.27 v 1.785 h -1.27 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 1.27 v 1.27 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -1.27 h 2.784 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -2.784 v -1.784 h 2.405 c 2.433 0.0 4.406 -1.972 4.406 -4.405 c 0.0 -2.433 -1.973 -4.406 -4.406 -4.406 h -3.405 Z m 3.405 6.81 h -2.405 v -4.81 h 2.405 c 1.329 0.0 2.406 1.077 2.406 2.406 c 0.0 1.328 -1.077 2.405 -2.406 2.405 Z")
        )
    }.build()
}
