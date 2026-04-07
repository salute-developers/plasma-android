package com.sdds.compose.uikit.fixtures.stories.list

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.ListUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ListUiStateTransformer
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ListUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val hasDisclosure: Boolean = true,
    val amount: Int = 3,
    val hasDivider: Boolean = false,
    val startContent: ListItemStartContent = ListItemStartContent.IconSize24,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class ListItemStartContent {
    IconSize24,
    IconSize36,
    Counter,
}

@Story
object ListStory : ComposeBaseStory<ListUiState, ListStyle>(
    ComponentKey.List,
    ListUiState(),
    ListUiStatePropertiesProducer,
    ListUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ListStyle,
        state: ListUiState,
    ) {
        List(
            style = style,
        ) {
            items(state.amount) {
                val interactionSource = remember { MutableInteractionSource() }

                /* Обертка в Box нужна для удобства проверки размеров элементов */
                Box {
                    ListItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .focusable(interactionSource = interactionSource),
                        startContent = getStartContent(it, state.startContent),
                        titleContent = { Text("${state.title} $it") },
                        disclosureEnabled = state.hasDisclosure,
                        interactionSource = interactionSource,
                    )
                }
                if (state.hasDivider) {
                    Divider()
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: ListStyle,
        key: ComponentKey,
    ) {
        List(
            modifier = Modifier.fillMaxWidth(),
            style = style,
        ) {
            items(3) {
                val interactionSource = remember { MutableInteractionSource() }
                val isFocused = interactionSource.collectIsFocusedAsState()
                ListItem(
                    modifier = Modifier
                        .fillMaxWidth()
                        .focusable(interactionSource = interactionSource)
                        .focusSelector(
                            settings = LocalFocusSelectorSettings.current,
                        ) { isFocused.value },
                    text = "Title $it",
                    disclosureEnabled = true,
                    interactionSource = interactionSource,
                )
            }
        }
    }
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
