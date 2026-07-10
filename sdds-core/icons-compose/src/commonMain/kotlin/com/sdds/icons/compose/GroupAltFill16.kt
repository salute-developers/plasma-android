package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupAltFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupAltFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.975 6.8 C 11.54 6.8 12.0 7.26 12.0 7.825 v 3.15 C 12.0 11.54 11.54 12.0 10.975 12.0 h -3.15 C 7.26 12.0 6.8 11.54 6.8 10.975 V 9.899 h 1.55 c 0.856 0.0 1.55 -0.693 1.55 -1.55 V 6.8 h 1.075 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.175 4.0 C 8.74 4.0 9.2 4.46 9.2 5.025 v 3.15 C 9.2 8.74 8.74 9.2 8.175 9.2 h -3.15 C 4.46 9.2 4.0 8.74 4.0 8.175 v -3.15 C 4.0 4.46 4.46 4.0 5.025 4.0 h 3.15 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.058 1.006 C 14.587 1.06 15.0 1.506 15.0 2.05 c 0.0 0.362 -0.184 0.682 -0.463 0.87 c -0.028 0.02 -0.057 0.037 -0.087 0.054 v 10.052 c 0.136 0.074 0.253 0.178 0.344 0.302 c 0.028 0.039 0.056 0.079 0.079 0.121 C 14.954 13.6 15.0 13.77 15.0 13.95 c 0.0 0.58 -0.47 1.05 -1.05 1.05 l -0.107 -0.006 c -0.248 -0.025 -0.47 -0.135 -0.636 -0.302 c -0.024 -0.023 -0.046 -0.048 -0.067 -0.074 c -0.043 -0.052 -0.081 -0.108 -0.114 -0.168 H 2.974 c -0.146 0.268 -0.405 0.466 -0.712 0.529 C 2.193 14.992 2.122 15.0 2.05 15.0 l -0.108 -0.006 C 1.9 14.99 1.858 14.982 1.817 14.973 C 1.35 14.867 1.0 14.45 1.0 13.95 c 0.0 -0.399 0.222 -0.746 0.55 -0.924 V 2.974 c -0.09 -0.049 -0.171 -0.11 -0.242 -0.182 C 1.284 2.768 1.26 2.744 1.239 2.718 L 1.18 2.637 C 1.067 2.469 1.0 2.267 1.0 2.05 C 1.0 1.47 1.47 1.0 2.05 1.0 c 0.217 0.0 0.42 0.067 0.587 0.18 l 0.08 0.06 c 0.027 0.02 0.051 0.044 0.075 0.068 C 2.863 1.379 2.925 1.46 2.974 1.55 h 10.052 c 0.017 -0.03 0.034 -0.06 0.053 -0.087 c 0.17 -0.252 0.446 -0.425 0.764 -0.457 C 13.878 1.002 13.914 1.0 13.95 1.0 c 0.037 0.0 0.072 0.002 0.108 0.006 Z M 2.974 2.55 C 2.877 2.729 2.729 2.877 2.55 2.974 v 10.051 v 0.001 c 0.18 0.097 0.327 0.245 0.424 0.423 l 10.052 0.001 c 0.098 -0.179 0.245 -0.328 0.424 -0.425 V 2.974 c -0.06 -0.033 -0.116 -0.07 -0.168 -0.114 c -0.078 -0.064 -0.146 -0.14 -0.203 -0.223 c -0.019 -0.028 -0.036 -0.057 -0.053 -0.087 H 2.974 Z")
        )
    }.build()
}
