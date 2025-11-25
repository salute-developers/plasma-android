package com.sdds.testing.compose.paginationdots

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.PaginationDots
import com.sdds.compose.uikit.PaginationDotsStyle

/**
 * Тест-кейсы для компонента [PaginationDots]
 */

/**
 * PLASMA-T2354
 */
@Composable
fun PaginationDotsItemTwentyVisibleNine(style: PaginationDotsStyle, iconButtonStyle: ButtonStyle) {
    Column {
        var selectedIndex by remember { mutableIntStateOf(0) }
        val totalCount = 20
        PaginationDots(
            style = style,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            visibleCount = 9,
        )
        Spacer(Modifier.size(16.dp))
        PaginationDotsIconButtons(
            iconButtonStyle = iconButtonStyle,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            onChange = { selectedIndex = it },
        )
    }
}

/**
 * PLASMA-T2355
 */
@Composable
fun PaginationDotsItemTenVisibleSeven(style: PaginationDotsStyle, iconButtonStyle: ButtonStyle) {
    Column {
        var selectedIndex by remember { mutableIntStateOf(0) }
        val totalCount = 10
        PaginationDots(
            style = style,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            visibleCount = 7,
        )
        Spacer(Modifier.size(16.dp))
        PaginationDotsIconButtons(
            iconButtonStyle = iconButtonStyle,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            onChange = { selectedIndex = it },
        )
    }
}

/**
 * PLASMA-T2356
 */
@Composable
fun PaginationDotsItemThreeVisibleThree(style: PaginationDotsStyle, iconButtonStyle: ButtonStyle) {
    Column {
        var selectedIndex by remember { mutableIntStateOf(0) }
        val totalCount = 3
        PaginationDots(
            style = style,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            visibleCount = 3,
        )
        Spacer(Modifier.size(16.dp))
        PaginationDotsIconButtons(
            iconButtonStyle = iconButtonStyle,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            onChange = { selectedIndex = it },
        )
    }
}

/**
 * PLASMA-T2357
 */
@Composable
fun PaginationDotsItemSevenVisibleFive(style: PaginationDotsStyle, iconButtonStyle: ButtonStyle) {
    Column {
        var selectedIndex by remember { mutableIntStateOf(0) }
        val totalCount = 7
        PaginationDots(
            style = style,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            visibleCount = 5,
        )
        Spacer(Modifier.size(16.dp))
        PaginationDotsIconButtons(
            iconButtonStyle = iconButtonStyle,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            onChange = { selectedIndex = it },
        )
    }
}

/**
 * PLASMA-T2358
 */
@Composable
fun PaginationDotsItemOneVisibleOne(style: PaginationDotsStyle, iconButtonStyle: ButtonStyle) {
    Column {
        var selectedIndex by remember { mutableIntStateOf(0) }
        val totalCount = 1
        PaginationDots(
            style = style,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            visibleCount = 1,
        )
        Spacer(Modifier.size(16.dp))
        PaginationDotsIconButtons(
            iconButtonStyle = iconButtonStyle,
            selectedIndex = selectedIndex,
            totalCount = totalCount,
            onChange = { selectedIndex = it },
        )
    }
}

/**
 * IconButtons для PaginationDots
 */
@Composable
fun PaginationDotsIconButtons(
    iconButtonStyle: ButtonStyle,
    selectedIndex: Int,
    totalCount: Int,
    onChange: (Int) -> Unit,
) {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        IconButton(
            modifier = Modifier.testTag("iconButtonLeft"),
            style = iconButtonStyle,
            iconRes = com.sdds.icons.R.drawable.ic_arrow_left_24,
            onClick = {
                onChange((selectedIndex - 1).coerceIn(0 until totalCount))
            },
        )
        IconButton(
            modifier = Modifier.testTag("iconButtonRight"),
            style = iconButtonStyle,
            iconRes = com.sdds.icons.R.drawable.ic_arrow_right_24,
            onClick = {
                onChange((selectedIndex + 1).coerceIn(0 until totalCount))
            },
        )
    }
}
