package com.sdds.playground.integrationtest.app

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scenarios.catalog.IntegrationScenario
import com.sdds.playground.integrationtest.scenarios.catalog.IntegrationScenarioRegistry
import com.sdds.playground.integrationtest.theme.IntegrationSandboxTheme
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary

/**
 * Приложение для интеграционных сценариев
 */
@Composable
internal fun IntegrationSandboxApp(
    initialScenarioId: String? = null,
) {
    var selectedScenario by remember {
        mutableStateOf(
            IntegrationScenarioRegistry.scenarios
                .firstOrNull { it.id == initialScenarioId },
        )
    }

    IntegrationSandboxTheme {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            if (selectedScenario == null) {
                ScenarioListScreen(
                    scenarios = IntegrationScenarioRegistry.scenarios,
                    onScenarioClick = { selectedScenario = it },
                )
            } else {
                ScenarioDetailsScreen(
                    scenario = selectedScenario!!,
                    onBack = { selectedScenario = null },
                )
            }
        }
    }
}

@Composable
private fun ScenarioListScreen(
    scenarios: List<IntegrationScenario>,
    onScenarioClick: (IntegrationScenario) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
    ) {
        Text(
            text = "Integration Sandbox",
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 24.dp),
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(scenarios, key = { it.id }) { scenario ->
                ScenarioListItem(
                    scenario = scenario,
                    onClick = { onScenarioClick(scenario) },
                )
            }
        }
    }
}

@Composable
private fun ScenarioListItem(
    scenario: IntegrationScenario,
    onClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        Text(text = scenario.category.title)
        Text(text = scenario.title)
        Text(text = scenario.description)
    }
}

@Composable
private fun ScenarioDetailsScreen(
    scenario: IntegrationScenario,
    onBack: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(text = scenario.title)
            Button(
                label = "Back",
                style = BasicButton.S.Secondary.style(),
                onClick = onBack,
            )
        }
        scenario.screen()
    }
}
