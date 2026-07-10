package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePlusFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePlusFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.25 7.5 c 0.0 2.347 -1.902 4.25 -4.25 4.25 c -2.347 0.0 -4.25 -1.903 -4.25 -4.25 S 9.653 3.25 12.0 3.25 c 2.348 0.0 4.25 1.903 4.25 4.25 Z m -4.38 13.25 C 11.317 19.794 11.0 18.684 11.0 17.5 c 0.0 -1.396 0.44 -2.69 1.19 -3.749 L 12.0 13.75 c -2.893 0.0 -5.58 0.998 -7.807 2.707 c -0.459 0.351 -0.711 0.908 -0.693 1.485 c 0.02 0.659 0.081 1.087 0.262 1.443 c 0.24 0.47 0.622 0.853 1.093 1.092 C 5.39 20.75 6.09 20.75 7.49 20.75 h 4.379 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 23.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 S 20.538 12.0 17.5 12.0 S 12.0 14.462 12.0 17.5 s 2.462 5.5 5.5 5.5 Z m 0.5 -8.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 17.0 14.224 17.0 14.5 V 17.0 h -2.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 17.0 v 2.5 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 18.0 h 2.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 20.776 17.0 20.5 17.0 H 18.0 v -2.5 Z")
        )
    }.build()
}
