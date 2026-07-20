package com.sdds.compose.uikit.fixtures.stories.combobox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ComboBox
import com.sdds.compose.uikit.ComboBoxStyle
import com.sdds.compose.uikit.ComboBoxTextField
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemType
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.ComboBoxUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ComboBoxUiStateTransformer
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.compose.uikit.rememberSelectSingleDataStateManager
import com.sdds.icons.compose.ChevronDown24
import com.sdds.icons.compose.ChevronUp24
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.Plasma36
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Search24
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ComboBoxUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val showEmptyState: Boolean = false,
    val readOnly: Boolean = false,
    val enabled: Boolean = true,
    val triggerAlignment: ComboBoxTriggerAlignment = ComboBoxTriggerAlignment.BottomCenter,
    val placement: PopoverPlacement = PopoverPlacement.Bottom,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class ComboBoxTriggerAlignment(val alignment: Alignment) {
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
object ComboBoxStory : ComposeBaseStory<ComboBoxUiState, ComboBoxStyle>(
    ComponentKey.ComboBox,
    ComboBoxUiState(),
    ComboBoxUiStatePropertiesProducer,
    ComboBoxUiStateTransformer,
) {
    @Composable
    @Suppress("LongMethod")
    override fun BoxScope.Content(
        style: ComboBoxStyle,
        state: ComboBoxUiState,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            val selectState = remember { SelectState() }
            val itemType = style.selectItemStyle.itemType
            val isMultiple = itemType == SelectItemType.Multiple
            val checkedStateManager = if (itemType == SelectItemType.Multiple) {
                rememberSelectMultipleDataStateManager(ComboBoxList)
            } else {
                rememberSelectSingleDataStateManager(ComboBoxList)
            }
            var value by remember { mutableStateOf("") }
            val dropdownProperties = remember(state.placement, state.placementMode) {
                DropdownProperties(
                    placement = state.placement,
                    placementMode = state.placementMode,
                )
            }
            val filteredList = remember(value, selectState.isOpened) {
                if (selectState.isOpened && value.isEmpty()) {
                    ComboBoxList
                } else {
                    ComboBoxList.filter { it.contains(value, ignoreCase = true) }
                }
            }

            Column(
                modifier = Modifier.align(state.triggerAlignment.alignment),
            ) {
                ComboBox(
                    state = selectState,
                    style = style,
                    enabled = state.enabled,
                    readOnly = state.readOnly,
                    dropdownProperties = dropdownProperties,
                    trigger = {
                        ComboBoxTextField(
                            modifier = Modifier.width(260.dp),
                            value = value,
                            onValueChange = { value = it },
                            readOnly = state.readOnly,
                            enabled = state.enabled,
                            placeholderText = if (value.isEmpty()) "Сотрудник" else null,
                            captionText = "Введите или выберите имя",
                            iconOpened = imageVectorSource(SddsIcons.ChevronUp24),
                            iconClosed = imageVectorSource(SddsIcons.ChevronDown24),
                            chipsContent = getChipsContent(
                                itemType,
                                checkedStateManager.selectedItems,
                                checkedStateManager::onItemPressed,
                                state.enabled,
                                state.readOnly,
                            ),
                            focusSelectorSettings = FocusSelectorSettings.None,
                            startContent = {
                                Icon(
                                    rememberVectorPainter(SddsIcons.Search24),
                                    "",
                                )
                            },
                        )
                    },
                    showEmptyState = state.showEmptyState || filteredList.isEmpty(),
                    emptyState = {
                        EmptyState(
                            iconSource = imageVectorSource(SddsIcons.Plasma36),
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
                        items(filteredList.size) {
                            val item = filteredList[it]
                            SelectItem(
                                modifier = Modifier.fillMaxWidth(),
                                checked = checkedStateManager.isSelected(item),
                                onClick = {
                                    println("ComboBox" + ": " + "Item $it was selected")
                                    checkedStateManager.onItemPressed(item)
                                    value = if (isMultiple) "" else item
                                    if (!isMultiple) {
                                        selectState.close()
                                    }
                                },
                            ) {
                                Cell(
                                    title = AnnotatedString(item),
                                )
                            }
                        }
                    },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: ComboBoxStyle,
        key: ComponentKey,
    ) {
        var value by remember { mutableStateOf("") }
        val selectState = remember { SelectState() }
        val stateManager = rememberSelectSingleDataStateManager(ComboBoxList)
        val filteredList = remember(value, selectState.isOpened) {
            if (selectState.isOpened && value.isEmpty()) {
                ComboBoxList
            } else {
                ComboBoxList.filter { it.contains(value, ignoreCase = true) }
            }
        }
        ComboBox(
            style = style,
            state = selectState,
            trigger = {
                ComboBoxTextField(
                    modifier = Modifier.width(260.dp),
                    value = value,
                    placeholderText = if (value.isEmpty()) "Сотрудник" else null,
                    onValueChange = { value = it },
                    iconOpened = imageVectorSource(SddsIcons.ChevronUp24),
                    iconClosed = imageVectorSource(SddsIcons.ChevronDown24),
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            },
            showEmptyState = filteredList.isEmpty(),
            emptyState = {
                EmptyState(
                    iconSource = imageVectorSource(SddsIcons.Plasma36),
                    description = "Empty State",
                    buttonLabel = "Action",
                )
            },
            listContent = {
                items(filteredList.size) {
                    val item = filteredList[it]
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = stateManager.isSelected(item),
                        onClick = {
                            println("ComboBox" + ": " + "Item $it was selected")
                            stateManager.onItemPressed(item)
                            value = item
                            selectState.close()
                        },
                    ) {
                        Cell(
                            title = AnnotatedString(item),
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
    onRemove: (String) -> Unit,
    enabled: Boolean = true,
    readOnly: Boolean = false,
): (@Composable () -> Unit)? {
    return if (selectItemType == SelectItemType.Multiple && selectedItems.isNotEmpty()) {
        {
            selectedItems.forEach { item ->
                Chip(
                    label = item,
                    enabled = enabled,
                    endContent = {
                        Icon(
                            painter = rememberVectorPainter(SddsIcons.Close24),
                            contentDescription = "",
                            modifier = if (enabled && !readOnly) {
                                Modifier.clickable(
                                    indication = null,
                                    interactionSource = remember { MutableInteractionSource() },
                                ) {
                                    onRemove(item)
                                }
                            } else {
                                Modifier
                            },
                        )
                    },
                )
            }
        }
    } else {
        null
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

private val ComboBoxList = listOf(
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
