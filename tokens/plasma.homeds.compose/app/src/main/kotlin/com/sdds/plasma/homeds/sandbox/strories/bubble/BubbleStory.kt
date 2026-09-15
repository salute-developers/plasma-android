package com.sdds.plasma.homeds.sandbox.strories.bubble

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Text
import com.sdds.plasma.homeds.components.bubble.BubbleAlignment
import com.sdds.plasma.homeds.components.bubble.BubbleHost
import com.sdds.plasma.homeds.components.bubble.BubblePlacement
import com.sdds.plasma.homeds.components.bubble.BubbleStyle
import com.sdds.plasma.homeds.components.bubble.BubbleTrigger
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsBubbleUiStatePropertiesProducer
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsBubbleUiStateTransformer
import com.sdds.plasma.homeds.integration.custom.BubbleKey
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента Bubble в песочнице.
 *
 * @param hasOffer монтировать ли демонстрационные [BubbleTrigger]
 * @param placement с какой стороны от триггера появляется тело, см. [BubblePlacement]
 * @param alignment выравнивание тела вдоль оси, перпендикулярной [placement], см. [BubbleAlignment]
 * @param progress значение прогресс-бара перегрузки [BubbleTrigger] с `text`/`progress`
 * @param hasProgress показывать ли прогресс-бар
 */
@StoryUiState
data class HomeDsBubbleUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val hasOffer: Boolean = true,
    val placement: BubblePlacement = BubblePlacement.Top,
    val alignment: BubbleAlignment = BubbleAlignment.End,
    val progress: Float = 0.5f,
    val hasProgress: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
internal object BubbleStory : ComposeBaseStory<HomeDsBubbleUiState, BubbleStyle>(
    BubbleKey,
    HomeDsBubbleUiState(),
    HomeDsBubbleUiStatePropertiesProducer,
    HomeDsBubbleUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: BubbleStyle,
        state: HomeDsBubbleUiState,
    ) {
        val bubbleCardIndices = remember {
            (0 until DEVICE_CARD_COUNT)
                .shuffled()
                .take(BUBBLE_COUNT)
                .toSet()
        }
        val expandedById = remember(bubbleCardIndices, state.hasOffer) { mutableStateMapOf<Int, Boolean>() }
        val dismissedById = remember(bubbleCardIndices, state.hasOffer) { mutableStateMapOf<Int, Boolean>() }
        BubbleHost(modifier = Modifier.fillMaxSize()) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(GRID_COLUMNS),
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                items(DEVICE_CARD_COUNT) { index ->
                    Box(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .background(Color.DarkGray, RoundedCornerShape(16.dp)),
                    ) {
                        Text(
                            text = "$index",
                            textColor = Color.White,
                            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier.align(Alignment.Center),
                        )
                        if (index in bubbleCardIndices && state.hasOffer && dismissedById[index] != true) {
                            BubbleTrigger(
                                onExpandedClick = {
                                    Log.d(LOG_TAG, "trigger=$index onExpandedClick")
                                    expandedById[index] = false
                                },
                                expanded = expandedById[index] == true,
                                text = "Прокачать до 100%",
                                progress = state.progress,
                                hasProgress = state.hasProgress,
                                placement = state.placement,
                                alignment = state.alignment,
                                style = style,
                                onDismissRequest = {
                                    Log.d(LOG_TAG, "trigger=$index onDismissRequest")
                                    expandedById.remove(index)
                                    dismissedById[index] = true
                                },
                                onTriggerClick = {
                                    Log.d(LOG_TAG, "trigger=$index onTriggerClick")
                                    expandedById[index] = true
                                },
                                onTriggerVisibilityChange = { visible ->
                                    Log.d(
                                        LOG_TAG,
                                        "trigger=$index onTriggerVisibilityChange: visible=$visible",
                                    )
                                },
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(8.dp),
                            )
                        }
                    }
                }
            }
        }
    }

    @Composable
    override fun Preview(style: BubbleStyle, key: ComponentKey) {
        BubbleTrigger(
            onExpandedClick = {},
            expanded = false,
            style = style,
        ) {
            Text(text = "Прокачать до 100%")
        }
    }
}

private const val GRID_COLUMNS = 3
private const val DEVICE_CARD_COUNT = 30
private const val BUBBLE_COUNT = 3
private const val LOG_TAG = "BubbleStory"
