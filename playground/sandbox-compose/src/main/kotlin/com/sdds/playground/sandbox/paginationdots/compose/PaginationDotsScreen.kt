package com.sdds.playground.sandbox.paginationdots.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.PaginationDots
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.M

/**
 * Экран с компонентом [PaginationDots]
 */
@Composable
internal fun PaginationDotsScreen(componentKey: ComponentKey = ComponentKey.PaginationDots) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<PaginationDotsViewModel>(
            factory = PaginationDotsViewModelFactory(
                defaultState = PaginationDotsUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { paginationDotsUiState, style ->
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                var selectedIndex by remember { mutableIntStateOf(0) }
                val totalCount = paginationDotsUiState.itemCount
                PaginationDots(
                    style = style,
                    selectedIndex = selectedIndex,
                    totalCount = totalCount,
                    visibleCount = paginationDotsUiState.visibleItemCount,
                )
                Spacer(Modifier.size(16.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    IconButton(
                        iconRes = com.sdds.icons.R.drawable.ic_arrow_left_24,
                        style = IconButton.M.Default.style(),
                        onClick = {
                            selectedIndex = selectedIndex.minus(1)
                        },
                    )
                    IconButton(
                        style = IconButton.M.Default.style(),
                        iconRes = com.sdds.icons.R.drawable.ic_arrow_right_24,
                        onClick = {
                            selectedIndex = selectedIndex.plus(1)
                        },
                    )
                }
            }
        },
    )
}

@Composable
internal fun PaginationDotsPreview(style: PaginationDotsStyle) {
    SandboxTheme {
        PaginationDots(
            style = style,
            selectedIndex = 0,
            visibleCount = 5,
            totalCount = 13,
        )
    }
}
