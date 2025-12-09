package com.sdds.playground.sandbox.list.compose

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun ListScreen(componentKey: ComponentKey = ComponentKey.List) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ListViewModel>(
            factory = ListViewModelFactory(ListUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { uiState, style ->
            List(
                style = style,
            ) {
                items(uiState.amount) {
                    val interactionSource = remember { MutableInteractionSource() }
                    ListItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .focusable(interactionSource = interactionSource),
                        startContent = getStartContent(style.listItemStyle, it),
                        titleContent = { Text("${uiState.title} $it") },
                        disclosureEnabled = uiState.hasDisclosure,
                        interactionSource = interactionSource,
                    )
                    if (uiState.hasDivider) {
                        Divider()
                    }
                }
            }
        },
    )
}

private fun getStartContent(
    style: ListItemStyle,
    itemIndex: Int,
): (@Composable RowScope.() -> Unit)? {
    val counterStyle = style.counterStyle ?: return null
    return {
        Counter(count = itemIndex.toString(), style = counterStyle)
    }
}

@Preview
@Composable
internal fun ListItemScreenPreview() {
    SandboxTheme {
        ListScreen()
    }
}
