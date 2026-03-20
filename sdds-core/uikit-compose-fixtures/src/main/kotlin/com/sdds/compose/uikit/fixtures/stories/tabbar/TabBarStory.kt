package com.sdds.compose.uikit.fixtures.stories.tabbar

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.TabBar
import com.sdds.compose.uikit.TabBarItem
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.TabBarUiStatePropertiesProducer
import com.sdds.sandbox.TabBarUiStateTransformer
import com.sdds.sandbox.UiState

@StoryUiState
data class TabBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val customWeight: Boolean = false,
    val label: String = "Label",
    val extraType: TabBarExtraType = TabBarExtraType.Counter,
    val amount: Int = 2,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class TabBarExtraType {
    None,
    Counter,
    Indicator,
}

@Story
object TabBarStory : ComposeBaseStory<TabBarUiState, TabBarStyle>(
    ComponentKey.TabBar,
    TabBarUiState(),
    TabBarUiStatePropertiesProducer,
    TabBarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TabBarStyle,
        state: TabBarUiState,
    ) {
        var selectedItem by remember { mutableIntStateOf(0) }
        TabBar(style = style) {
            repeat(state.amount) {
                tabItem {
                    TabBarItem(
                        isSelected = it == selectedItem,
                        defaultIcon = R.drawable.ic_smile_outline_36,
                        selectedIcon = R.drawable.ic_smile_fill_36,
                        label = state.label,
                        extra = getExtra(state.extraType),
                        onClick = {
                            selectedItem = it
                        },
                    )
                }
                if (state.customWeight && it == (state.amount / 2) - 1) {
                    tabItem(weight = null) {
                        Icon(
                            modifier = Modifier.width(44.dp),
                            painter = painterResource(R.drawable.ic_home_alt_fill_36),
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: TabBarStyle,
        key: ComponentKey,
    ) {
        TabBar(style = style) {
            repeat(3) {
                tabItem {
                    TabBarItem(
                        isSelected = it == 0,
                        defaultIcon = R.drawable.ic_smile_outline_36,
                        selectedIcon = R.drawable.ic_smile_fill_36,
                        label = "Label",
                        extra = { Counter(count = "12") },
                    )
                }
            }
        }
    }
}

private fun getExtra(extraType: TabBarExtraType): (@Composable () -> Unit)? {
    return when (extraType) {
        TabBarExtraType.None -> null
        TabBarExtraType.Counter -> {
            { Counter(count = "12") }
        }

        TabBarExtraType.Indicator -> {
            { Indicator() }
        }
    }
}
