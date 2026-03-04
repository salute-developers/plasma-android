package com.sdds.playground.sandbox.list.compose

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
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

                    /* Обертка в Box нужна для удобства проверки размеров элементов */
                    Box {
                        ListItem(
                            modifier = Modifier
                                .fillMaxWidth()
                                .focusable(interactionSource = interactionSource),
                            startContent = getStartContent(it, uiState.startContent),
                            titleContent = { Text("${uiState.title} $it") },
                            disclosureEnabled = uiState.hasDisclosure,
                            interactionSource = interactionSource,
                        )
                    }
                    if (uiState.hasDivider) {
                        Divider()
                    }
                }
            }
        },
    )
}

private fun getStartContent(
    itemIndex: Int,
    startContent: ListItemStartContent,
): (@Composable RowScope.() -> Unit) {
    return {
        when (startContent) {
            ListItemStartContent.IconSize24 -> Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_plasma_24),
                contentDescription = "",
            )
            ListItemStartContent.IconSize36 -> Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_plasma_36),
                contentDescription = "",
            )

            ListItemStartContent.Counter -> Counter(count = itemIndex.toString())
        }
    }
}

@Preview
@Composable
internal fun ListItemScreenPreview() {
    SandboxTheme {
        ListScreen()
    }
}
