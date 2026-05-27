package com.sdds.playground.integrationtest.app

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Accordion
import com.sdds.compose.uikit.AccordionItem
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scenarios.catalog.IntegrationScenario
import com.sdds.playground.integrationtest.scenarios.catalog.IntegrationScenarioRegistry
import com.sdds.playground.integrationtest.theme.IntegrationSandboxTheme
import com.sdds.serv.styles.accordion.AccordionSolidActionStart
import com.sdds.serv.styles.accordion.S
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

    val currentScenario = selectedScenario

    IntegrationSandboxTheme {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            if (currentScenario == null) {
                AccordionForScenarioRegistry(
                    scenarios = IntegrationScenarioRegistry.scenarios,
                    onScenarioClick = { scenario -> selectedScenario = scenario },
                )
            } else {
                ScenarioDetailsScreen(
                    scenario = currentScenario,
                    onBack = { selectedScenario = null },
                )
            }
        }
    }
}

@Composable
private fun AccordionForScenarioRegistry(
    scenarios: List<IntegrationScenario>,
    onScenarioClick: (IntegrationScenario) -> Unit,
) {
    val openedState = remember(scenarios.size) {
        mutableStateListOf<Boolean>().apply {
            repeat(scenarios.size) { add(false) }
        }
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 24.dp,
        ),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        item {
            Text(
                text = "Integration Sandbox",
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 24.dp),
            )
        }
        item {
            Accordion(
                style = AccordionSolidActionStart.S.style(),
            ) {
                scenarios.forEachIndexed { index, scenario ->

                    AccordionItem(
                        modifier = Modifier.fillMaxWidth(),
                        title = scenario.title,
                        onClick = {
                            if (openedState[index]) {
                                onScenarioClick(scenario)
                            } else {
                                openedState[index] = true
                            }
                        },
                        opened = openedState[index],
                        openTransition = openTransition(animationEnabled = true),
                        content = {
                            Text(text = scenario.description)
                        },
                    )
                }
            }
        }
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

@Composable
private fun openTransition(animationEnabled: Boolean): EnterTransition =
    if (animationEnabled) remember { fadeIn() + expandVertically() } else EnterTransition.None
