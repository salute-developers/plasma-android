package com.sdds.compose.uikit.fixtures.stories.wheel

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelSeparator
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.fixtures.stories.WheelUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.WheelUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента [Wheel].
 *
 * @property variant Вариант отображения.
 * @property itemLabel Заголовок элемента.
 * @property itemTextAfter Текст после значения.
 * @property description Описание колеса.
 * @property hasControls Флаг отображения кнопок управления.
 * @property wheelCount Количество колес.
 * @property visibleItemsCount Количество видимых элементов.
 * @property separatorType Тип разделителя между элементами.
 */
@StoryUiState
data class WheelUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemLabel: String = "Label",
    val itemTextAfter: String = "",
    val description: String = "",
    val hasControls: Boolean = true,
    val wheelCount: Int = 2,
    val visibleItemsCount: Int = 3,
    val separatorType: WheelSeparator = WheelSeparator.Dots,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object WheelStory : ComposeBaseStory<WheelUiState, WheelStyle>(
    ComponentKey.Wheel,
    WheelUiState(),
    WheelUiStatePropertiesProducer,
    WheelUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: WheelStyle,
        state: WheelUiState,
    ) {
        Wheel(
            modifier = Modifier,
            style = style,
            hasControls = state.hasControls,
            wheelCount = state.wheelCount,
            visibleItemsCount = state.visibleItemsCount,
            wheelSeparator = state.separatorType,
            onItemSelected = { wheelIndex, itemIndex ->
                println("item selected: $itemIndex in wheel $wheelIndex")
            },
        ) { wheelIndex ->
            WheelDataSet(
                dataSet = List(30) {
                    WheelItemData(
                        text = state.itemLabel,
                        textAfter = state.itemTextAfter,
                    )
                },
                description = state.description,
            )
        }
    }

    @Composable
    override fun Preview(
        style: WheelStyle,
        key: ComponentKey,
    ) {
        Wheel(
            style = style,
            hasControls = true,
            wheelCount = 1,
            visibleItemsCount = 3,
            wheelSeparator = WheelSeparator.None,
        ) { wheelIndex ->
            WheelDataSet(
                List(20) {
                    WheelItemData(
                        "Label",
                        "TA",
                    )
                },
            )
        }
    }
}
