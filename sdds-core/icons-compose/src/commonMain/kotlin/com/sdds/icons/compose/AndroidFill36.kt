package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AndroidFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AndroidFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.803 25.37 c 0.0 0.82 -0.691 1.486 -1.542 1.487 h -1.764 v 4.209 c 0.0 1.068 -0.885 1.934 -1.977 1.934 c -1.096 0.0 -1.979 -0.866 -1.979 -1.934 v -4.21 h -3.08 v 4.21 c 0.0 1.068 -0.887 1.934 -1.98 1.934 c -1.091 0.0 -1.978 -0.866 -1.978 -1.934 v -4.21 H 10.74 c -0.851 0.0 -1.544 -0.666 -1.544 -1.487 V 13.554 h 17.606 v 11.815 Z m 3.45 -11.932 c 1.105 0.0 1.997 0.876 1.997 1.956 v 7.64 c 0.0 1.079 -0.892 1.954 -1.996 1.954 c -1.102 0.0 -1.999 -0.875 -2.0 -1.955 v -7.64 c 0.0 -1.079 0.898 -1.955 2.0 -1.955 Z M 5.748 13.44 c 1.104 0.0 1.998 0.875 1.998 1.955 v 7.636 c 0.0 1.079 -0.894 1.955 -1.998 1.955 c -1.103 0.0 -1.997 -0.877 -1.997 -1.955 v -7.636 c 0.0 -1.08 0.894 -1.954 1.997 -1.954 Z M 23.09 3.308 c 0.224 -0.32 0.677 -0.403 1.009 -0.186 c 0.332 0.218 0.417 0.654 0.191 0.973 l -1.673 2.368 c 2.342 1.203 3.969 3.282 4.186 5.7 H 9.197 c 0.218 -2.417 1.845 -4.496 4.187 -5.7 L 11.71 4.094 c -0.226 -0.32 -0.14 -0.755 0.191 -0.973 c 0.332 -0.217 0.783 -0.134 1.01 0.185 l 1.824 2.582 c 1.012 -0.337 2.11 -0.53 3.265 -0.53 c 1.156 0.0 2.254 0.193 3.266 0.53 l 1.824 -2.581 Z M 14.287 7.94 c -0.539 0.0 -0.975 0.42 -0.975 0.938 s 0.438 0.937 0.975 0.938 c 0.538 0.0 0.974 -0.42 0.974 -0.938 S 14.825 7.94 14.287 7.94 Z m 7.549 0.0 c -0.54 0.0 -0.974 0.42 -0.974 0.938 s 0.435 0.937 0.974 0.938 c 0.538 0.0 0.974 -0.42 0.975 -0.938 c 0.0 -0.518 -0.438 -0.938 -0.975 -0.938 Z")
        )
    }.build()
}
