package com.sdds.playground.integrationtest.scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.CommonScenarioTags
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState
import com.sdds.serv.styles.list.ListTight
import com.sdds.serv.styles.list.Xs

@Composable
internal fun ScenarioScaffold(
    title: String,
    description: String,
    checks: List<ScenarioCheckUiState>,
    rootTestTag: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .widthIn(max = 360.dp)
            .testTag(rootTestTag),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        List(
            modifier = Modifier.fillMaxWidth(),
            style = ListTight.Xs.style(),
        ) {
            item {
                ListItem(
                    text = title,
                    modifier = Modifier.testTag(CommonScenarioTags.TITLE),
                )
            }
            item {
                ListItem(
                    text = description,
                    modifier = Modifier.testTag(CommonScenarioTags.DESCRIPTION),
                )
            }
            item {
                ListItem(
                    text = "Progress: ${checks.count { it.passed }}/${checks.size}",
                    modifier = Modifier.testTag(CommonScenarioTags.PROGRESS),
                )
            }
            items(checks.size) { index ->
                val check = checks[index]
                val prefix = if (check.passed) "PASS" else "WAIT"
                ListItem(
                    modifier = Modifier.fillMaxWidth(),
                    titleContent = {
                        Text(
                            text = "$prefix ${index + 1}. ${check.title}",
                            modifier = Modifier.testTag(check.testTag),
                        )
                    },
                    disclosureEnabled = false,
                )
            }
        }
        content()
    }
}
