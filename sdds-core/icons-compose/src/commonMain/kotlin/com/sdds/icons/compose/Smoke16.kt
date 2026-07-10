package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Smoke16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Smoke16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.9 1.383 c 0.175 -0.213 0.49 -0.245 0.703 -0.07 c 0.214 0.174 0.246 0.49 0.071 0.703 c -1.087 1.33 -1.352 2.344 -1.282 3.186 c 0.073 0.874 0.51 1.655 1.041 2.54 c 0.51 0.852 1.118 1.811 1.316 2.926 c 0.204 1.157 -0.033 2.425 -1.05 3.913 c -0.155 0.229 -0.467 0.287 -0.695 0.131 c -0.227 -0.155 -0.286 -0.466 -0.13 -0.694 c 0.895 -1.311 1.042 -2.319 0.89 -3.175 c -0.159 -0.896 -0.65 -1.687 -1.188 -2.586 c -0.519 -0.864 -1.086 -1.834 -1.18 -2.972 C 6.296 4.115 6.698 2.852 7.9 1.383 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.934 3.123 c 0.18 -0.209 0.497 -0.232 0.706 -0.052 c 0.21 0.18 0.233 0.496 0.053 0.705 C 3.936 4.656 3.8 5.325 3.88 5.883 c 0.088 0.608 0.437 1.172 0.866 1.849 C 5.148 8.368 5.63 9.117 5.75 9.976 c 0.127 0.908 -0.155 1.857 -1.06 2.901 c -0.181 0.209 -0.497 0.23 -0.705 0.05 c -0.208 -0.18 -0.23 -0.496 -0.05 -0.705 c 0.763 -0.88 0.902 -1.55 0.824 -2.108 C 4.675 9.507 4.33 8.943 3.9 8.267 C 3.499 7.631 3.016 6.883 2.892 6.026 c -0.13 -0.907 0.144 -1.858 1.043 -2.903 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.291 3.123 c 0.18 -0.209 0.497 -0.232 0.707 -0.052 c 0.208 0.18 0.232 0.496 0.052 0.705 c -0.756 0.88 -0.893 1.549 -0.812 2.107 c 0.087 0.608 0.437 1.172 0.865 1.849 c 0.403 0.636 0.886 1.385 1.006 2.244 c 0.127 0.908 -0.156 1.857 -1.06 2.901 c -0.182 0.209 -0.497 0.23 -0.706 0.05 c -0.208 -0.18 -0.23 -0.496 -0.05 -0.705 c 0.764 -0.88 0.902 -1.55 0.825 -2.108 c -0.085 -0.607 -0.431 -1.171 -0.86 -1.847 c -0.402 -0.636 -0.886 -1.384 -1.01 -2.241 c -0.13 -0.907 0.145 -1.857 1.043 -2.903 Z")
        )
    }.build()
}
