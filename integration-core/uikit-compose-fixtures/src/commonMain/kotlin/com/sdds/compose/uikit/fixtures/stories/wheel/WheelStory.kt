package com.sdds.compose.uikit.fixtures.stories.wheel

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelSeparator
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.fixtures.stories.WheelUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.WheelUiStateTransformer
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlinx.coroutines.launch

/**
 * Состояние компонента [Wheel].
 *
 * @property variant Вариант отображения.
 * @property itemLabel Заголовок элемента.
 * @property textAfter Текст после значения.
 * @property description Описание колеса.
 * @property hasControls Флаг отображения кнопок управления.
 * @property fillMaxWidth Заполнить максимальную ширину.
 * @property wheelCount Количество колес.
 * @property visibleItemsCount Количество видимых элементов.
 * @property separatorType Тип разделителя между элементами.
 * @property itemsCount Количество элементов в каждом колесе.
 * @property initialIndex Индекс изначально выбранного элемента.
 * @property inBottomSheet Показывать колесо в ModalBottomSheet.
 * @property hasLooping Зациклить прокрутку колеса.
 */
@StoryUiState
data class WheelUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemLabel: String = "Label",
    val textAfter: String = "TA",
    val description: String = "",
    val hasControls: Boolean = true,
    val wheelCount: Int = 2,
    val visibleItemsCount: Int = 3,
    val separatorType: WheelSeparator = WheelSeparator.Dots,
    val fillMaxWidth: Boolean = true,
    val itemsCount: Int = 30,
    val initialIndex: Int = 0,
    val inBottomSheet: Boolean = false,
    val hasLooping: Boolean = false,
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
        if (state.inBottomSheet) {
            val sheetState = rememberModalBottomSheetState(
                initialValue = BottomSheetValue.Hidden,
                skipHalfExpanded = true,
            )
            val scope = rememberCoroutineScope()
            Button(
                label = "показать Wheel в BottomSheet",
                onClick = { scope.launch { sheetState.show() } },
            )
            ModalBottomSheet(
                modifier = Modifier.statusBarsPadding(),
                sheetState = sheetState,
                fitContent = true,
            ) {
                WheelContent(
                    style = style,
                    state = state,
                    modifier = Modifier.navigationBarsPadding(),
                )
            }
        } else {
            WheelContent(style = style, state = state)
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
                dataSet = List(20) {
                    WheelItemData("Label")
                },
            )
        }
    }
}

@Composable
private fun WheelContent(
    style: WheelStyle,
    state: WheelUiState,
    modifier: Modifier = Modifier,
) {
    Wheel(
        modifier = modifier.then(if (state.fillMaxWidth) Modifier.fillMaxWidth() else Modifier),
        style = style,
        hasControls = state.hasControls,
        wheelCount = state.wheelCount,
        visibleItemsCount = state.visibleItemsCount,
        wheelSeparator = state.separatorType,
        onItemSelected = { wheelIndex, itemIndex ->
            println("item selected: $itemIndex in wheel $wheelIndex")
        },
    ) {
        WheelDataSet(
            dataSet = List(state.itemsCount) {
                WheelItemData(
                    text = "${state.itemLabel}$it",
                    textAfter = state.textAfter,
                )
            },
            initialIndex = state.initialIndex.coerceIn(0, (state.itemsCount - 1).coerceAtLeast(0)),
            description = state.description,
            staticTextAfter = state.textAfter,
            looping = state.hasLooping,
        )
    }
}
