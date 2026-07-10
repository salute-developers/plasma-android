package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarDFocusOutlineOff24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarDFocusOutlineOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.015 4.045 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.061 0.0 L 18.938 4.0 H 4.7 C 3.209 4.0 2.0 5.209 2.0 6.7 v 10.6 c 0.0 0.986 0.529 1.849 1.318 2.32 l -0.335 0.335 c -0.292 0.293 -0.292 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 L 5.06 20.0 h 0.002 l 1.5 -1.5 H 6.56 l 1.5 -1.5 h 0.002 l 4.0 -4.0 H 12.06 l 7.476 -7.477 h 0.002 l 1.144 -1.143 H 20.68 l 0.335 -0.335 Z M 17.438 5.5 H 4.7 c -0.663 0.0 -1.2 0.537 -1.2 1.2 v 10.6 c 0.0 0.581 0.413 1.066 0.962 1.176 L 5.938 17.0 H 5.5 C 5.224 17.0 5.0 16.776 5.0 16.5 v -3.0 C 5.0 13.224 5.224 13.0 5.5 13.0 h 4.438 l 7.5 -7.5 Z M 20.5 6.683 l 1.207 -1.207 C 21.894 5.843 22.0 6.259 22.0 6.7 v 10.6 c 0.0 1.491 -1.209 2.7 -2.7 2.7 H 7.183 l 1.5 -1.5 H 19.3 c 0.663 0.0 1.2 -0.537 1.2 -1.2 V 6.7 V 6.683 Z M 18.5 17.0 h -8.317 l 4.0 -4.0 H 18.5 c 0.276 0.0 0.5 0.224 0.5 0.5 v 3.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 Z")
        )
    }.build()
}
