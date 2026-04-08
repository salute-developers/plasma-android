package com.sdds.compose.uikit.fixtures.stories.icon

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.sandbox.NoStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.fixtures.stories.IconUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.IconUiStateTransformer
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class IconUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val mode: IconColorMode = IconColorMode.Tint,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class IconColorMode {
    Tint,
    FillColor,
    FillBrush,
}

@Story
object IconStory : ComposeBaseStory<IconUiState, NoStyle>(
    ComponentKey.Icon,
    IconUiState(),
    IconUiStatePropertiesProducer,
    IconUiStateTransformer,
) {

    private val ExampleFillColor = Color(0xFF27AE60).asBrush()
    private val ExampleFillBrush = Brush.linearGradient(
        colors = listOf(Color(0xFF11994A), Color(0xFFff5757)),
    )

    @Composable
    override fun BoxScope.Content(
        style: NoStyle,
        state: IconUiState,
    ) {
        when (state.mode) {
            IconColorMode.Tint -> {
                CompositionLocalProvider(
                    LocalTintBrushProducer provides { Color(0xFF2F80ED).asBrush() },
                ) {
                    Icon(
                        source = resourceImageSource(R.drawable.ic_plasma_24),
                        contentDescription = "Icon",
                        modifier = Modifier.size(48.dp),
                    )
                }
            }

            IconColorMode.FillColor -> {
                Icon(
                    source = resourceImageSource(R.drawable.ic_plasma_24),
                    contentDescription = "Icon",
                    modifier = Modifier.size(48.dp),
                    brush = { ExampleFillColor },
                )
            }

            IconColorMode.FillBrush -> {
                Icon(
                    source = resourceImageSource(R.drawable.ic_plasma_24),
                    contentDescription = "Icon",
                    modifier = Modifier.size(48.dp),
                    brush = { ExampleFillBrush },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: NoStyle,
        key: ComponentKey,
    ) {
        Icon(
            source = resourceImageSource(R.drawable.ic_plasma_24),
            contentDescription = "Icon",
            modifier = Modifier.size(24.dp),
            brush = { ExampleFillColor },
        )
    }
}
