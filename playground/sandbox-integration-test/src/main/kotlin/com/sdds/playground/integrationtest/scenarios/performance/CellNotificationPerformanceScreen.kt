package com.sdds.playground.integrationtest.scenarios.performance

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Notification
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showNotification
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.PerformanceScenarioTags
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.notification.NotificationLoose
import com.sdds.serv.styles.basicbutton.M as ButtonM
import com.sdds.serv.styles.cell.Cell as CellStyle
import com.sdds.serv.styles.cell.M as CellM
import com.sdds.serv.styles.notification.M as NotificationM

private val notificationFeedItems = List(30) { index -> "Message ${index + 1}" }
private const val TARGET_NOTIFICATION_ITEM_INDEX = 12

/** A feed action followed by a persistent Notification and its confirmation button. */
@Composable
internal fun CellNotificationPerformanceScreen() {
    OverlayHost {
        val overlayManager = LocalOverlayManager.current
        val confirmedItem = remember { mutableStateOf<String?>(null) }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .testTag(PerformanceScenarioTags.CELL_NOTIFICATION_LIST),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            itemsIndexed(
                items = notificationFeedItems,
                key = { _, item -> item },
            ) { index, item ->
                Cell(
                    modifier = Modifier
                        .fillMaxWidth()
                        .then(
                            if (index == TARGET_NOTIFICATION_ITEM_INDEX) {
                                Modifier.testTag(PerformanceScenarioTags.CELL_NOTIFICATION_TARGET)
                            } else {
                                Modifier
                            },
                        )
                        .clickable {
                            overlayManager.showNotification(
                                durationMillis = null,
                                position = OverlayPosition.BottomCenter,
                                isFocusable = true,
                            ) { notificationId ->
                                Notification(
                                    modifier = Modifier
                                        .fillMaxWidth(0.92f)
                                        .semantics { testTagsAsResourceId = true }
                                        .testTag(PerformanceScenarioTags.NOTIFICATION_CONTENT),
                                    style = NotificationLoose.NotificationM.style(),
                                ) {
                                    NotificationContent(
                                        modifier = Modifier.fillMaxWidth(),
                                        title = "Mark message as read?",
                                        text = item,
                                        buttons = {
                                            button {
                                                Button(
                                                    modifier = Modifier.testTag(
                                                        PerformanceScenarioTags.NOTIFICATION_CONFIRM_BUTTON,
                                                    ),
                                                    style = BasicButton.ButtonM.Default.style(),
                                                    label = "Confirm",
                                                    onClick = {
                                                        confirmedItem.value = item
                                                        overlayManager.remove(notificationId)
                                                    },
                                                )
                                            }
                                        },
                                    )
                                }
                            }
                        },
                    style = CellStyle.CellM.style(),
                    title = AnnotatedString(item),
                    subtitle = AnnotatedString(
                        if (confirmedItem.value == item) "Read" else "Tap to mark as read",
                    ),
                    disclosureContentEnabled = true,
                )
            }
        }
    }
}
