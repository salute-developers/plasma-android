package com.sdds.compose.uikit.fixtures.samples.paginationdots

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.PaginationDots
import com.sdds.compose.uikit.PaginationDotsOrientation
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun PaginationDots_Simple() {
    composableCodeSnippet {
        var selectedIndex by remember { mutableIntStateOf(0) }
        PaginationDots(
            selectedIndex = selectedIndex,
            totalCount = 11,
            visibleCount = 5,
        )
        Spacer(Modifier.size(16.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            IconButton(
                iconRes = com.sdds.icons.R.drawable.ic_arrow_left_24,
                onClick = {
                    // для корректной работы необходимо следить, чтобы индекс не выходил за пределы totalCount
                    selectedIndex = selectedIndex.minus(1).coerceIn(0, 10)
                },
            )
            IconButton(
                iconRes = com.sdds.icons.R.drawable.ic_arrow_right_24,
                onClick = {
                    // для корректной работы необходимо следить, чтобы индекс не выходил за пределы totalCount
                    selectedIndex = selectedIndex.plus(1).coerceIn(0, 10)
                },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun PaginationDots_Style() {
    composableCodeSnippet {
        PaginationDotsStyle.builder()
            .orientation(PaginationDotsOrientation.Vertical)
            .edgeShrinkFactor(0.3f)
            .edgeCount(2)
            .colors {
                dotBackgroundColor(
                    placeholder(Color.Black, "/** Токен цвета */").asStatefulValue(
                        setOf(InteractiveState.Activated)
                            to placeholder(Color.Black, "/** Цвет в состоянии activated */"),
                    ),
                )
            }
            .dimensions {
                gap(6.0.dp)
                dotWidth(8.0.dp)
                dotHeight(
                    8.0.dp.asStatefulValue(
                        setOf(InteractiveState.Activated) to 32.0.dp,
                    ),
                )
            }
            .style()
    }
}
