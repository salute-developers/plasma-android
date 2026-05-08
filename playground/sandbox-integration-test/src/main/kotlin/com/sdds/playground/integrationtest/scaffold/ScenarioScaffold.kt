package com.sdds.playground.integrationtest.scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Text
import com.sdds.playground.integrationtest.testtags.CommonScenarioTags
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState

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
        Text(
            text = title,
            modifier = Modifier.testTag(CommonScenarioTags.TITLE),
        )
        Text(
            text = description,
            modifier = Modifier.testTag(CommonScenarioTags.DESCRIPTION),
        )
        Text(
            text = "Progress: ${checks.count { it.passed }}/${checks.size}",
            modifier = Modifier.testTag(CommonScenarioTags.PROGRESS),
        )
        Column(
            modifier = Modifier.testTag(CommonScenarioTags.CHECKS_SECTION),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            checks.forEachIndexed { index, check ->
                val prefix = if (check.passed) "PASS" else "WAIT"
                Text(
                    text = "$prefix ${index + 1}. ${check.title}",
                    modifier = Modifier.testTag(check.testTag),
                )
            }
        }
        content()
    }
}
