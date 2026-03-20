package com.sdds.compose.uikit.fixtures.stories.card

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.CardContent
import com.sdds.compose.uikit.CardOrientation
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.R
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.sandbox.CardUiStatePropertiesProducer
import com.sdds.sandbox.CardUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import com.sdds.icons.R.drawable as Icons

/**
 * Состояние компонента Card
 * @property variant состояние компонента
 */
@StoryUiState
data class CardUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val orientation: CardOrientation = CardOrientation.Vertical,
    val label: String = "Title",
    val hasExtra: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CardStory : ComposeBaseStory<CardUiState, CardStyle>(
    ComponentKey.Card,
    CardUiState(),
    CardUiStatePropertiesProducer,
    CardUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CardStyle,
        state: CardUiState,
    ) {
        Card(
            style = style,
            orientation = state.orientation,
            label = { Text(state.label) },
            extra = if (state.hasExtra) getExtra() else null,
        ) {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp),
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.il_avatar_test),
                    contentDescription = "Android",
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: CardStyle,
        key: ComponentKey,
    ) {
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(150.dp),
            style = style,
            focusSelectorSettings = LocalFocusSelectorSettings.current,
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f),
                ) {
                    Text(
                        "Card text",
                        modifier = Modifier
                            .align(Alignment.Center),
                    )
                }
                CardContent(
                    modifier = Modifier
                        .weight(2f)
                        .align(Alignment.CenterHorizontally),
                    style = style,
                    focusSelectorSettings = FocusSelectorSettings.None,
                ) {
                    Image(
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = R.drawable.il_avatar_test),
                        contentDescription = "Android",
                    )
                    Text(
                        text = "Content",
                    )
                }
            }
        }
    }
}

private fun getExtra(): (@Composable BoxScope.() -> Unit) = {
    IconButton(
        iconRes = Icons.ic_plasma_24,
        modifier = Modifier.align(Alignment.BottomEnd),
        onClick = {},
    )
}
