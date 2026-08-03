package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Whatsapp36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Whatsapp36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.125 17.865 c 0.0 2.62 0.687 5.178 1.994 7.432 L 3.0 33.0 l 7.918 -2.067 c 2.182 1.184 4.639 1.809 7.138 1.81 h 0.007 c 8.232 0.0 14.934 -6.67 14.937 -14.866 c 0.001 -3.972 -1.551 -7.707 -4.371 -10.517 c -2.82 -2.81 -6.57 -4.358 -10.566 -4.36 C 9.829 3.0 3.129 9.669 3.125 17.865 Z m 4.716 7.044 l -0.296 -0.467 c -1.243 -1.968 -1.899 -4.241 -1.898 -6.576 c 0.003 -6.812 5.572 -12.355 12.42 -12.355 c 3.317 0.001 6.433 1.288 8.778 3.623 c 2.344 2.336 3.634 5.44 3.633 8.742 c -0.003 6.813 -5.573 12.356 -12.416 12.356 h -0.004 c -2.229 -0.001 -4.414 -0.597 -6.32 -1.723 l -0.453 -0.267 l -4.7 1.226 l 1.256 -4.56 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.33 11.65 c -0.28 -0.619 -0.575 -0.631 -0.84 -0.642 c -0.218 -0.01 -0.467 -0.009 -0.716 -0.009 c -0.249 0.0 -0.653 0.093 -0.995 0.465 c -0.342 0.372 -1.306 1.27 -1.306 3.099 c 0.0 1.828 1.337 3.594 1.523 3.843 c 0.187 0.247 2.583 4.119 6.376 5.608 c 3.153 1.238 3.794 0.992 4.479 0.93 c 0.684 -0.062 2.208 -0.899 2.519 -1.767 c 0.31 -0.867 0.31 -1.61 0.218 -1.766 c -0.094 -0.155 -0.343 -0.248 -0.716 -0.434 c -0.373 -0.186 -2.208 -1.085 -2.55 -1.209 c -0.342 -0.123 -0.591 -0.185 -0.84 0.187 c -0.249 0.371 -0.964 1.208 -1.181 1.456 c -0.218 0.248 -0.436 0.28 -0.81 0.093 c -0.372 -0.186 -1.575 -0.578 -3.0 -1.844 c -1.11 -0.985 -1.86 -2.2 -2.077 -2.573 c -0.218 -0.371 -0.023 -0.573 0.164 -0.758 c 0.168 -0.166 0.373 -0.434 0.56 -0.65 c 0.186 -0.218 0.248 -0.372 0.373 -0.62 c 0.124 -0.248 0.062 -0.465 -0.031 -0.651 c -0.094 -0.186 -0.819 -2.023 -1.15 -2.758 Z")
        )
    }.build()
}
