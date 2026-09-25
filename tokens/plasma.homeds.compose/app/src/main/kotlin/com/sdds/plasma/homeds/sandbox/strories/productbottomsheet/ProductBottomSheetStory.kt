package com.sdds.plasma.homeds.sandbox.strories.productbottomsheet

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelSeparator
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.productbottomsheet.ProductBottomSheet
import com.sdds.plasma.homeds.components.productbottomsheet.ProductBottomSheetStyle
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsProductBottomSheetUiStatePropertiesProducer
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsProductBottomSheetUiStateTransformer
import com.sdds.plasma.homeds.integration.custom.ProductBottomSheetKey
import com.sdds.plasma.homeds.sandbox.R
import com.sdds.plasma.homeds.styles.wheel.H4
import com.sdds.plasma.homeds.styles.wheel.Wheel
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlinx.coroutines.launch

/**
 * Состояние компонетна ProductBottomSheet в песочнице
 *
 * @param handlePlacement режим размещения ручки
 * @param edgeToEdge полноэкранный режим
 * @param dimBackground включение затемнения экрна
 * @param useNativeBlackout исполльзование нативного затемнения
 */
@StoryUiState
data class HomeDsProductBottomSheetUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val handlePlacement: BottomSheetHandlePlacement = BottomSheetHandlePlacement.Auto,
    val edgeToEdge: Boolean = true,
    val dimBackground: Boolean = true,
    val useNativeBlackout: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
internal object ProductBottomSheetStory : ComposeBaseStory<HomeDsProductBottomSheetUiState, ProductBottomSheetStyle>(
    ProductBottomSheetKey,
    HomeDsProductBottomSheetUiState(),
    HomeDsProductBottomSheetUiStatePropertiesProducer,
    HomeDsProductBottomSheetUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ProductBottomSheetStyle,
        state: HomeDsProductBottomSheetUiState,
    ) {
        val sheetState = rememberModalBottomSheetState(
            initialValue = BottomSheetValue.Hidden,
        )
        val scope = rememberCoroutineScope()
        Button(
            label = "показать BottomSheet",
            onClick = {
                scope.launch {
                    sheetState.show()
                }
            },
        )

        ProductBottomSheet(
            modifier = Modifier
                .statusBarsPadding()
                .navigationBarsPadding()
                .imePadding(),
            style = style,
            sheetState = sheetState,
            onDismiss = { println("BottomSheetScreen" + ": " + "OnDismiss") },
            dimBackground = state.dimBackground,
            useNativeBlackout = state.useNativeBlackout,
            handlePlacement = state.handlePlacement,
            fitContent = true,
            edgeToEdge = state.edgeToEdge,
            title = {
                Text("Title", Modifier.align(Alignment.Start))
            },
            subTitle = {
                Text("Subtitle", Modifier.align(Alignment.Start))
            },
            footer = {
                ButtonGroup(
                    modifier = Modifier
                        .align(Alignment.Center),
                    orientation = ButtonGroupOrientation.Vertical,
                ) {
                    repeat(2) {
                        button {
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                label = "label",
                                value = "value",
                                onClick = {},
                            )
                        }
                    }
                }
            },
            body = {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(R.drawable.checker),
                    contentDescription = "Android",
                )
                Wheel(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center),
                    style = Wheel.H4.style(),
                    hasControls = true,
                    wheelCount = 2,
                    visibleItemsCount = 3,
                    wheelSeparator = WheelSeparator.Dots,
                    onItemSelected = { wheelIndex, itemIndex ->
                        println("item selected: $itemIndex in wheel $wheelIndex")
                    },
                ) {
                    val itemsCount = 30
                    WheelDataSet(
                        dataSet = List(itemsCount) {
                            WheelItemData(
                                text = "Label",
                                textAfter = "",
                            )
                        },
                        initialIndex = itemsCount.coerceIn(0, (itemsCount - 1).coerceAtLeast(0)),
                        description = "",
                        staticTextAfter = "",
                        looping = false,
                    )
                }
            },
        )
    }

    @Composable
    override fun Preview(style: ProductBottomSheetStyle, key: ComponentKey) {
        val sheetState = rememberModalBottomSheetState(
            initialValue = BottomSheetValue.Hidden,
        )
        val scope = rememberCoroutineScope()
        Button(
            label = "show ModalBottomSheet",
            onClick = {
                scope.launch {
                    sheetState.show()
                }
            },
        )
        ProductBottomSheet(
            modifier = Modifier.statusBarsPadding(),
            style = style,
            sheetState = sheetState,
            onDismiss = { println("BottomSheetScreen" + ": " + "OnDismiss") },
            fitContent = true,
            dimBackground = false,
            title = { Text("Title") },
            subTitle = { Text("Subtitle") },
            footer = {
                ButtonGroup(
                    modifier = Modifier.padding(12.dp),
                    orientation = ButtonGroupOrientation.Vertical,
                ) {
                    repeat(2) {
                        button {
                            Button(
                                label = "label",
                                value = "value",
                                onClick = {},
                            )
                        }
                    }
                }
            },
            body = {
                Wheel(
                    style = Wheel.H4.style(),
                    hasControls = true,
                    wheelCount = 1,
                    visibleItemsCount = 3,
                    wheelSeparator = WheelSeparator.None,
                ) {
                    WheelDataSet(
                        dataSet = List(20) {
                            WheelItemData("Label")
                        },
                    )
                }
            },
        )
    }
}
