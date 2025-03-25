package com.sdds.testing.compose.segment

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SegmentVertical
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

/**
 * PLASMA-T1350
 */
@Composable
fun SegmentSizeL(style: SegmentStyle) {
    SegmentHorizontal(
        style = style,
        stretch = false,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
                    label = "Label",
                    enabled = true,
                    startContent = null,
                    endContent = null,
                )
            }
        }
    }
}

/**
 * PLASMA-T1351
 */
@Composable
fun SegmentSizeMPilled(style: SegmentStyle) {
    SegmentHorizontal(
        style = style,
        stretch = false,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
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
        }
    }
}

/**
 * PLASMA-T1352
 */
@Composable
fun SegmentSizeS(style: SegmentStyle) {
    SegmentHorizontal(
        style = style,
        stretch = false,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
                    label = "Label",
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
        }
    }
}

/**
 * PLASMA-T1353
 */
@Composable
fun SegmentSizeXs(style: SegmentStyle) {
    SegmentHorizontal(
        style = style,
        stretch = false,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
                    label = "Label",
                    enabled = true,
                    startContent = null,
                    endContent = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_plasma_16),
                            contentDescription = "",
                        )
                    },
                )
            }
        }
    }
}

/**
 * PLASMA-T1350
 */
@Composable
fun SegmentSizeOrientationVertical(style: SegmentStyle) {
    SegmentVertical(
        style = style,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
                    label = "Label",
                    enabled = true,
                    startContent = null,
                    endContent = null,
                )
            }
        }
    }
}

/**
 * PLASMA-T1355
 */
@Composable
fun SegmentDisabled(style: SegmentStyle) {
    SegmentHorizontal(
        style = style,
        stretch = false,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
                    label = "Label",
                    enabled = false,
                    startContent = null,
                    endContent = null,
                )
            }
        }
    }
}

/**
 * PLASMA-T1693
 */
@Composable
fun SegmentSizeSStretch(style: SegmentStyle) {
    SegmentHorizontal(
        style = style,
        stretch = true,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
                    label = "Label",
                    enabled = true,
                    startContent = null,
                    endContent = null,
                )
            }
        }
    }
}

/**
 * PLASMA-T1889
 */
@Composable
fun SegmentSizeLCounter(style: SegmentStyle) {
    SegmentHorizontal(
        style = style,
        stretch = false,
        hasBackground = true,
    ) {
        repeat(3) { index ->
            segmentItem {
                SegmentItem(
                    isSelected = index == 0,
                    label = "Label",
                    enabled = true,
                    startContent = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_plasma_24),
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
        }
    }
}
