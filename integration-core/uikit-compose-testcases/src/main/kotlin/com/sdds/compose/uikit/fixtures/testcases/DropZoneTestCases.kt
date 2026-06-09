package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.DropZone
import com.sdds.compose.uikit.DropZoneIconPlacement
import com.sdds.compose.uikit.DropZoneState
import com.sdds.compose.uikit.DropZoneStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.icons.R

/**
 * Тест-кейсы для [DropZone]
 */

/**
 * PLASMA-T1633
 */
@Composable
fun DropZoneIconPlacementTop(
    style: DropZoneStyle,
) {
    DropZoneCommon(
        style = style,
    )
}

/**
 * PLASMA-T1634
 */
@Composable
fun DropZoneNoTitleIconPlacementStart(
    style: DropZoneStyle,
) {
    DropZoneCommon(
        style = style,
        iconPlacement = DropZoneIconPlacement.Start,
        title = null,
    )
}

/**
 * PLASMA-T1635
 */
@Composable
fun DropZoneNoDescriptionIconPlacementTop(
    style: DropZoneStyle,
) {
    DropZoneCommon(
        style = style,
        description = null,
    )
}

/**
 * PLASMA-T1636
 */
@Composable
fun DropZoneNoTitleNoDescriptionIconPlacementStart(
    style: DropZoneStyle,
) {
    DropZoneCommon(
        style = style,
        title = null,
        description = null,
    )
}

/**
 * PLASMA-T1637
 */
@Composable
fun DropZoneDisabled(
    style: DropZoneStyle,
) {
    DropZoneCommon(
        style = style,
        state = DropZoneState.Disabled,
    )
}

/**
 * PLASMA-T2678
 */
@Composable
fun DropZoneIconPlacementStart(
    style: DropZoneStyle,
) {
    DropZoneCommon(
        style = style,
        iconPlacement = DropZoneIconPlacement.Start,
    )
}

/**
 * PLASMA-T2679
 */
@Composable
fun DropZoneDraggingOver(
    style: DropZoneStyle,
) {
    DropZoneCommon(
        style = style,
        state = DropZoneState.DraggingOver,
    )
}

/**
 * Общий тест-кейс
 */
@Composable
fun DropZoneCommon(
    style: DropZoneStyle,
    state: DropZoneState = DropZoneState.Idle,
    iconPlacement: DropZoneIconPlacement = DropZoneIconPlacement.Top,
    icon: @Composable (() -> Unit) = {
        Icon(
            painter = painterResource(R.drawable.ic_arrow_bar_down_24),
            contentDescription = null,
        )
    },
    title: @Composable (() -> Unit)? = { Text("Title") },
    description: @Composable (() -> Unit)? = { Text("Description") },
) {
    DropZone(
        style = style,
        state = state,
        iconPlacement = iconPlacement,
        icon = icon,
        title = title,
        description = description,
    )
}
