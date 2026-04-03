package com.sdds.compose.uikit.fixtures.stories.select

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Select
import com.sdds.compose.uikit.SelectButton
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemType
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectTextField
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.SelectUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.SelectUiStateTransformer
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.compose.uikit.rememberSelectSingleDataStateManager
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class SelectUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val showEmptyState: Boolean = false,
    val readOnly: Boolean = false,
    val enabled: Boolean = true,
    val triggerType: TriggerType = TriggerType.TextField,
    val triggerAlignment: SelectTriggerAlignment = SelectTriggerAlignment.TopCenter,
    val placement: PopoverPlacement = PopoverPlacement.Bottom,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Strict,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class TriggerType {
    TextField, Button
}

enum class SelectTriggerAlignment(val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopEnd(Alignment.TopEnd),
    TopCenter(Alignment.TopCenter),
    Center(Alignment.Center),
    CenterStart(Alignment.CenterStart),
    CenterEnd(Alignment.CenterEnd),
    BottomStart(Alignment.BottomStart),
    BottomEnd(Alignment.BottomEnd),
    BottomCenter(Alignment.BottomCenter),
}

@Story
object SelectStory : ComposeBaseStory<SelectUiState, SelectStyle>(
    ComponentKey.Select,
    SelectUiState(),
    SelectUiStatePropertiesProducer,
    SelectUiStateTransformer,
) {
    @Composable
    @Suppress("LongMethod")
    override fun BoxScope.Content(
        style: SelectStyle,
        state: SelectUiState,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            val selectState = remember { SelectState() }
            val itemType = style.selectItemStyle.itemType
            val checkedStateManager = if (itemType == SelectItemType.Multiple) {
                rememberSelectMultipleDataStateManager(SelectList)
            } else {
                rememberSelectSingleDataStateManager(SelectList)
            }
            val dropdownProperties = remember(state.placement, state.placementMode) {
                DropdownProperties(
                    popupProperties = PopupProperties(
                        clippingEnabled = false,
                        focusable = true,
                        usePlatformDefaultWidth = true,
                    ),
                ).copy(
                    placement = state.placement,
                    placementMode = state.placementMode,
                )
            }

            Select(
                modifier = Modifier.align(state.triggerAlignment.alignment),
                state = selectState,
                style = style,
                enabled = state.enabled,
                readOnly = state.readOnly,
                dropdownProperties = dropdownProperties,
                trigger = {
                    when (state.triggerType) {
                        TriggerType.TextField -> {
                            val value =
                                getTextFieldValue(itemType, checkedStateManager.selectedItems)
                            SelectTextField(
                                modifier = Modifier.width(260.dp),
                                value = value,
                                readOnly = state.readOnly,
                                enabled = state.enabled,
                                placeholderText = if (value.isEmpty()) "Сотрудник" else null,
                                captionText = "Выберите имя",
                                iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                                iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                                chipsContent = getChipsContent(
                                    itemType,
                                    checkedStateManager.selectedItems,
                                ),
                                startContent = {
                                    Icon(
                                        painterResource(R.drawable.ic_search_24),
                                        "",
                                    )
                                },
                            )
                        }

                        TriggerType.Button -> {
                            val value = getButtonValue(itemType, checkedStateManager.selectedItems)
                            SelectButton(
                                modifier = Modifier.width(260.dp),
                                label = value,
                                readonly = state.readOnly,
                                enabled = state.enabled,
                                iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                                iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                            )
                        }
                    }
                },
                showEmptyState = state.showEmptyState,
                emptyState = {
                    EmptyState(
                        iconRes = R.drawable.ic_plasma_36,
                        description = "Empty State",
                        buttonLabel = "Action",
                    )
                },
                footer = if (state.showLoading) {
                    { Loading() }
                } else {
                    null
                },
                listContent = {
                    items(SelectList.size) {
                        SelectItem(
                            modifier = Modifier.fillMaxWidth(),
                            checked = checkedStateManager.isSelected(SelectList[it]),
                            onClick = {
                                Log.d("Select", "Item $it was selected")
                                checkedStateManager.onItemPressed(SelectList[it])
                            },
                        ) {
                            Cell(
                                title = AnnotatedString(SelectList[it]),
                                disclosureIconRes = null,
                            )
                        }
                    }
                },
            )
        }
    }

    @Composable
    override fun Preview(
        style: SelectStyle,
        key: ComponentKey,
    ) {
        var state by remember { mutableStateOf(SelectState()) }
        val stateManager = rememberSelectSingleDataStateManager(SelectList, SelectList[1])
        Select(
            style = style,
            state = state,
            trigger = {
                SelectButton(
                    modifier = Modifier.width(260.dp),
                    label = getButtonValue(
                        SelectItemType.Single,
                        stateManager.selectedItems,
                    ),
                    iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                    iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                )
            },
            listContent = {
                items(SelectList.size) {
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = stateManager.isSelected(SelectList[it]),
                        onClick = {
                            Log.d("Select", "Item $it was selected")
                            stateManager.onItemPressed(SelectList[it])
                        },
                    ) {
                        Cell(
                            title = AnnotatedString(SelectList[it]),
                            disclosureIconRes = null,
                        )
                    }
                }
            },
        )
    }
}

private fun getChipsContent(
    selectItemType: SelectItemType,
    selectedItems: List<String>,
): (@Composable () -> Unit)? {
    return if (selectItemType == SelectItemType.Multiple && selectedItems.isNotEmpty()) {
        {
            selectedItems.forEach { Chip(label = it) }
        }
    } else {
        null
    }
}

private fun getTextFieldValue(
    selectItemType: SelectItemType,
    selectedItems: List<String>,
): String {
    return if (selectItemType == SelectItemType.Multiple) {
        ""
    } else {
        selectedItems.firstOrNull().orEmpty()
    }
}

private fun getButtonValue(
    selectItemType: SelectItemType,
    selectedItems: List<String>,
): String {
    return if (selectItemType == SelectItemType.Multiple) {
        selectedItems.joinToString(", ").ifEmpty { "Value" }
    } else {
        selectedItems.firstOrNull() ?: "Value"
    }
}

@Composable
private fun Loading(
    label: String = "Загрузка",
) {
    Row(
        modifier = Modifier.height(40.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Spinner()
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text = label,
        )
    }
}

private val SelectList = listOf(
    "Иван Иванов",
    "Пётр Петров",
    "Сергей Сергеев",
    "Алексей Алексеев",
    "Анна Смирнова",
    "Мария Кузнецова",
    "Дмитрий Попов",
    "Елена Соколова",
    "Ольга Морозова",
    "Николай Волков",
)
