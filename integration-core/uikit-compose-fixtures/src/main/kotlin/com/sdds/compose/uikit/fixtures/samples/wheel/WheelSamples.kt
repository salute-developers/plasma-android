package com.sdds.compose.uikit.fixtures.samples.wheel

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.DataEdgePlacement
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelAlignment
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelSeparator
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Wheel_Simple() {
    composableCodeSnippet {
        Wheel(
            wheelCount = 1,
            visibleItemsCount = 3,
            onItemSelected = { wheelIndex, itemIndex ->
                println("item selected: $itemIndex in wheel $wheelIndex")
            },
        ) { wheelIndex ->
            WheelDataSet(
                dataSet = List(10) {
                    WheelItemData(
                        text = "Label$wheelIndex",
                        textAfter = "TA$wheelIndex",
                    )
                },
                description = "Description",
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Wheel_AlarmClockWithControlsAndSeparator() {
    composableCodeSnippet {
        Wheel(
            wheelCount = 2,
            visibleItemsCount = 3,
            hasControls = true,
            wheelSeparator = WheelSeparator.Dots,
            alignment = WheelAlignment.Mixed,
            onItemSelected = { wheelIndex, itemIndex ->
                println("item selected: $itemIndex in wheel $wheelIndex")
            },
        ) { wheelIndex ->
            return@Wheel when (wheelIndex) {
                0 -> {
                    WheelDataSet(
                        dataSet = List(24) {
                            WheelItemData(
                                text = "${it + 1}",
                                textAfter = "ч.",
                            )
                        },
                        description = "Часы",
                    )
                }
                else -> {
                    WheelDataSet(
                        dataSet = List(60) {
                            WheelItemData(
                                text = "${it + 1}",
                                textAfter = "мин.",
                            )
                        },
                        description = "Минуты",
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Wheel_CenteredAlarmClockWithControlsAndDivider() {
    composableCodeSnippet {
        Wheel(
            wheelCount = 2,
            visibleItemsCount = 5,
            hasControls = true,
            wheelSeparator = WheelSeparator.Divider,
            alignment = WheelAlignment.Center,
            onItemSelected = { wheelIndex, itemIndex ->
                println("item selected: $itemIndex in wheel $wheelIndex")
            },
        ) { wheelIndex ->
            return@Wheel when (wheelIndex) {
                0 -> {
                    WheelDataSet(
                        dataSet = List(24) {
                            WheelItemData(
                                text = "${it + 1}",
                                textAfter = "ч.",
                            )
                        },
                        description = "Часы",
                    )
                }
                else -> {
                    WheelDataSet(
                        dataSet = List(60) {
                            WheelItemData(
                                text = "${it + 1}",
                                textAfter = "мин.",
                            )
                        },
                        description = "Минуты",
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Wheel_AlarmClockWithEdgePlacement() {
    composableCodeSnippet {
        Wheel(
            wheelCount = 2,
            dataEdgePlacement = DataEdgePlacement.WheelEdge,
            onItemSelected = { wheelIndex, itemIndex ->
                println("item selected: $itemIndex in wheel $wheelIndex")
            },
        ) { wheelIndex ->
            return@Wheel when (wheelIndex) {
                0 -> {
                    WheelDataSet(
                        dataSet = List(24) {
                            WheelItemData(
                                text = "${it + 1}",
                                textAfter = "ч.",
                            )
                        },
                        description = "Часы",
                    )
                }
                else -> {
                    WheelDataSet(
                        dataSet = List(60) {
                            WheelItemData(
                                text = "${it + 1}",
                                textAfter = "мин.",
                            )
                        },
                        description = "Минуты",
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Wheel_Style() {
    composableCodeSnippet {
        WheelStyle.builder()
            .controlIconUp(com.sdds.icons.R.drawable.ic_disclosure_up_outline_36)
            .controlIconDown(com.sdds.icons.R.drawable.ic_disclosure_down_outline_36)
            .wheelCount(3)
            .visibleItemsCount(3)
            .colors {
                itemTextColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                itemTextAfterColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                descriptionColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                controlIconUpColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Focused)
                            to placeholder(Color.Black, "/** Токен цвета в состоянии focused */"),
                    ),
                )
                controlIconDownColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Focused)
                            to placeholder(Color.Black, "/** Токен цвета в состоянии focused */"),
                    ),
                )
                separatorColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
            }
            .itemTextStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .itemTextAfterStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                itemTextAfterPadding(2.0.dp)
                descriptionPadding(8.0.dp)
                separatorSpacing(40.0.dp)
                itemMinSpacing(20.0.dp)
            }
            .itemAlignment(WheelAlignment.Center)
            .style()
    }
}
