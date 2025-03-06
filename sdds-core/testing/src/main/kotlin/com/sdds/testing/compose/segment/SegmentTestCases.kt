package com.sdds.testing.compose.segment

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.icons.R

/**
 * Тест кейсы для Segment
 */

/**
 * PLASMA-T1885
 */
@Composable
fun SegmentItemSizeLPrimary(style: SegmentItemStyle) {
    SegmentItem(
        style = style,
        isSelected = true,
        label = "Label",
        enabled = true,
        startContent = null,
        endContent = null,
    )
}

/**
 * PLASMA-T1886
 */
@Composable
fun SegmentItemSizeMSecondaryPilled(style: SegmentItemStyle) {
    SegmentItem(
        style = style,
        isSelected = true,
        label = "Label",
        value = "Value",
        enabled = true,
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_24),
                contentDescription = "",
            )
        },
        endContent = null,
    )
}

/**
 * PLASMA-T1887
 */
@Composable
fun SegmentItemSizeS(style: SegmentItemStyle) {
    SegmentItem(
        style = style,
        isSelected = false,
        label = "Label",
        enabled = true,
        startContent = null,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1888
 */
@Composable
fun SegmentItemSizeXs(style: SegmentItemStyle) {
    SegmentItem(
        style = style,
        isSelected = true,
        label = "Label",
        enabled = true,
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        },
        endContent = {
            Counter(
                count = "123",
            )
        },
    )
}

/**
 * PLASMA-T1884
 */
@Composable
fun SegmentItemDisabled(style: SegmentItemStyle) {
    SegmentItem(
        style = style,
        isSelected = true,
        label = "Label",
        enabled = false,
        startContent = null,
        endContent = null,
    )
}
