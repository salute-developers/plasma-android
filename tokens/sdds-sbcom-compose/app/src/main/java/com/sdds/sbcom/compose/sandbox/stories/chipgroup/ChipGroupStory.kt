package com.sdds.sbcom.compose.sandbox.stories.chipgroup

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.fixtures.stories.ChipGroupUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ChipGroupUiStateTransformer
import com.sdds.compose.uikit.fixtures.stories.chipgroup.ChipGroupUiState
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story

@Story
object ChipGroupStory : ComposeBaseStory<ChipGroupUiState, ChipGroupStyle>(
    ComponentKey.ChipGroup,
    ChipGroupUiState(),
    ChipGroupUiStatePropertiesProducer,
    ChipGroupUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ChipGroupStyle,
        state: ChipGroupUiState,
    ) {
        ChipGroup(
            modifier = if (state.shouldWrap) {
                Modifier
            } else {
                Modifier.horizontalScroll(rememberScrollState())
            },
            style = style,
        ) {
            repeat(state.quantity) {
                var isSelected by remember { mutableStateOf(false) }
                Chip(
                    isSelected = isSelected,
                    onSelectedChange = { value -> isSelected = value },
                    label = state.label,
                    startContent = if (isSelected) {
                        {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_close_24),
                                contentDescription = "",
                            )
                        }
                    } else {
                        null
                    },
                    enabled = state.enabled,
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: ChipGroupStyle,
        key: ComponentKey,
    ) {
        ChipGroup(
            style = style,
            content = {
                repeat(3) {
                    Chip(
                        label = "Label",
                        onClick = {},
                        enabled = true,
                    )
                }
            },
        )
    }
}
