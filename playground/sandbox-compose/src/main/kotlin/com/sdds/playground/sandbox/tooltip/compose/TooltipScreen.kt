package com.sdds.playground.sandbox.tooltip.compose

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.popover.compose.autoHideToMs
import com.sdds.playground.sandbox.popover.compose.toAlignment

/**
 * Экран с компонентом [Tooltip]
 */
@Composable
internal fun TooltipScreen(componentKey: ComponentKey = ComponentKey.Tooltip) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<TooltipViewModel>(
            factory = TooltipViewModelFactory(
                defaultState = TooltipUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        backgroundColor = Color.LightGray.copy(0.3f),
        component = { tooltipUiState, style ->
            val showTooltip = remember { mutableStateOf(false) }
            val triggerLC = remember { mutableStateOf<LayoutCoordinates?>(null) }
            Button(
                modifier = Modifier
                    .align(tooltipUiState.triggerPlacement.toAlignment())
                    .popoverTrigger(triggerLC),
                label = "show",
                onClick = { showTooltip.value = true },
            )
            Tooltip(
                show = showTooltip.value,
                modifier = Modifier.width(160.dp),
                triggerLayoutCoordinates = triggerLC,
                placement = tooltipUiState.placement,
                placementMode = tooltipUiState.placementMode,
                triggerCentered = tooltipUiState.triggerCentered,
                alignment = tooltipUiState.alignment,
                style = style,
                tailEnabled = tooltipUiState.tailEnabled,
                onDismissRequest = {
                    showTooltip.value = false
                },
                duration = tooltipUiState.autoHide.autoHideToMs(),
                contentStart = getContentStart(tooltipUiState.hasContentStart),
                text = AnnotatedString(tooltipUiState.text),
            )
        },
    )
}

private fun getContentStart(hasContentStart: Boolean): @Composable (() -> Unit)? {
    return if (hasContentStart) {
        @Composable { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") }
    } else {
        null
    }
}

@Composable
@Preview(showBackground = true)
private fun TooltipScreenPreview() {
    SandboxTheme {
        TooltipScreen()
    }
}
