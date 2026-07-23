package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeadphonesFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeadphonesFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 5.25 C 10.958 5.25 5.25 10.958 5.25 18.0 v 1.516 c 0.758 -0.485 1.659 -0.766 2.625 -0.766 c 2.692 0.0 4.875 2.183 4.875 4.875 v 4.5 c 0.0 2.692 -2.183 4.875 -4.875 4.875 S 3.0 30.817 3.0 28.125 V 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 v 10.125 C 33.0 30.817 30.817 33.0 28.125 33.0 s -4.875 -2.183 -4.875 -4.875 v -4.5 c 0.0 -2.692 2.183 -4.875 4.875 -4.875 c 0.966 0.0 1.867 0.281 2.625 0.766 V 18.0 c 0.0 -7.042 -5.708 -12.75 -12.75 -12.75 Z")
        )
    }.build()
}
