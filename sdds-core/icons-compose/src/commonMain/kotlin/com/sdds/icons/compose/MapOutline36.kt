package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MapOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MapOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.619 6.215 C 32.859 6.405 33.0 6.694 33.0 7.0 v 19.724 c 0.0 0.462 -0.317 0.864 -0.766 0.972 l -9.46 2.276 c -0.156 0.038 -0.32 0.037 -0.477 -0.002 l -8.842 -2.216 l -9.221 2.218 c -0.298 0.072 -0.612 0.003 -0.853 -0.187 C 3.141 29.595 3.0 29.306 3.0 29.0 V 9.276 c 0.0 -0.462 0.317 -0.864 0.766 -0.972 l 9.46 -2.276 c 0.156 -0.038 0.32 -0.037 0.477 0.002 l 8.842 2.216 l 9.221 -2.218 c 0.298 -0.072 0.612 -0.003 0.853 0.187 Z M 21.54 10.056 l -7.082 -1.774 v 17.662 l 7.082 1.774 V 10.056 Z m 2.0 17.675 L 31.0 25.936 V 8.27 l -7.46 1.795 V 27.73 Z m -11.082 -1.795 V 8.27 L 5.0 10.064 V 27.73 l 7.46 -1.795 Z")
        )
    }.build()
}
