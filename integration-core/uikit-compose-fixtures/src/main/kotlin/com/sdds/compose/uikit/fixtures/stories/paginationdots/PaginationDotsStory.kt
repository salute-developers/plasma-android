package com.sdds.compose.uikit.fixtures.stories.paginationdots

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
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
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.PaginationDots
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.fixtures.stories.PaginationDotsUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.PaginationDotsUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class PaginationDotsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 20,
    val visibleItemCount: Int = 9,
    val step: Int = 1,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object PaginationDotsStory : ComposeBaseStory<PaginationDotsUiState, PaginationDotsStyle>(
    ComponentKey.PaginationDots,
    PaginationDotsUiState(),
    PaginationDotsUiStatePropertiesProducer,
    PaginationDotsUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: PaginationDotsStyle,
        state: PaginationDotsUiState,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            var selectedIndex by remember { mutableIntStateOf(0) }
            val totalCount = state.itemCount
            PaginationDots(
                style = style,
                selectedIndex = selectedIndex,
                totalCount = totalCount,
                visibleCount = state.visibleItemCount,
            )
            Spacer(Modifier.size(16.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                IconButton(
                    iconRes = R.drawable.ic_arrow_left_24,
                    onClick = {
                        selectedIndex = selectedIndex
                            .minus(state.step)
                            .coerceIn(0 until totalCount)
                    },
                )
                IconButton(
                    iconRes = R.drawable.ic_arrow_right_24,
                    onClick = {
                        selectedIndex = selectedIndex
                            .plus(state.step)
                            .coerceIn(0 until totalCount)
                    },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: PaginationDotsStyle,
        key: ComponentKey,
    ) {
        PaginationDots(
            style = style,
            selectedIndex = 0,
            visibleCount = 5,
            totalCount = 13,
        )
    }
}
