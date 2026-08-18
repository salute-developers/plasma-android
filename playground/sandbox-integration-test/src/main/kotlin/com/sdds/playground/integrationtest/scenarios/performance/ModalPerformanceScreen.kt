package com.sdds.playground.integrationtest.scenarios.performance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.PerformanceScenarioTags
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.modal.Default as ModalDefault
import com.sdds.serv.styles.modal.Modal as ServModal

/** A deterministic Modal fixture owned by the performance suite. */
@Composable
internal fun ModalPerformanceScreen() {
    var isVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp)
            .semantics { testTagsAsResourceId = true },
        contentAlignment = Alignment.Center,
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .testTag(PerformanceScenarioTags.MODAL_OPEN_BUTTON),
            style = BasicButton.M.Default.style(),
            label = "Open modal",
            onClick = { isVisible = true },
        )

        Modal(
            show = isVisible,
            dimBackground = true,
            onDismissRequest = { isVisible = false },
            modifier = Modifier.width(300.dp),
            style = ServModal.ModalDefault.style(),
            hasClose = false,
            edgeToEdge = true,
            useNativeBlackout = true,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .semantics { testTagsAsResourceId = true }
                    .testTag(PerformanceScenarioTags.MODAL_CONTENT),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Text(text = "Deterministic performance modal")
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag(PerformanceScenarioTags.MODAL_CLOSE_BUTTON),
                    style = BasicButton.M.Default.style(),
                    label = "Close modal",
                    onClick = { isVisible = false },
                )
            }
        }
    }
}
