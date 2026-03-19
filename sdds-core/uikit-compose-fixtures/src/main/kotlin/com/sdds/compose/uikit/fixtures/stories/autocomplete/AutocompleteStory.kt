package com.sdds.compose.uikit.fixtures.stories.autocomplete

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Autocomplete
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.sandbox.AutocompleteUiStatePropertiesProducer
import com.sdds.sandbox.AutocompleteUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AutocompleteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val withEmptyState: Boolean = true,
    val fieldAlignment: AutocompleteFieldAlignment = AutocompleteFieldAlignment.TopCenter,
    val placement: PopoverPlacement = PopoverPlacement.Bottom,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Strict,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class AutocompleteFieldAlignment(val alignment: Alignment) {
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
object AutocompleteStory : ComposeBaseStory<AutocompleteUiState, AutocompleteStyle>(
    ComponentKey.Autocomplete,
    AutocompleteUiState(),
    AutocompleteUiStatePropertiesProducer,
    AutocompleteUiStateTransformer,
) {
    @Composable
    @Suppress("LongMethod")
    override fun BoxScope.Content(
        style: AutocompleteStyle,
        state: AutocompleteUiState,
    ) {
        Box(
            modifier = Modifier
                .offset(y = -keyboardHeight / 2)
                .fillMaxWidth()
                .height(screenHeight),
        ) {
            var showDropdown by remember { mutableStateOf(false) }
            var text by remember { mutableStateOf(TextFieldValue()) }
            val filteredList =
                remember {
                    mutableListOf<String>().apply {
                        addAll(
                            AutocompleteSuggestions.filterSuggestions(text.text),
                        )
                    }
                }
            val showEmptyState = state.withEmptyState && filteredList.isEmpty()
            val dropdownProperties = remember(state.placement, state.placementMode) {
                DropdownProperties().copy(
                    placement = state.placement,
                    placementMode = state.placementMode,
                )
            }
            Autocomplete(
                modifier = Modifier.align(state.fieldAlignment.alignment),
                showDropdown = showDropdown,
                onDismissRequest = { showDropdown = false },
                style = style,
                dropdownProperties = dropdownProperties,
                field = {
                    TextField(
                        modifier = Modifier.width(240.dp),
                        value = text,
                        placeholderText = "Сотрудник",
                        captionText = "Введите имя Алексей",
                        onValueChange = {
                            text = it
                            filteredList.clear()
                            filteredList.addAll(AutocompleteSuggestions.filterSuggestions(text.text))
                            showDropdown = filteredList.isNotEmpty() || state.withEmptyState
                        },
                        endContent = {
                            Icon(
                                painterResource(com.sdds.icons.R.drawable.ic_search_24),
                                "",
                            )
                        },
                        focusSelectorSettings = FocusSelectorSettings.None,
                    )
                },
                showEmptyState = showEmptyState,
                emptyState = {
                    EmptyState(
                        iconRes = com.sdds.icons.R.drawable.ic_plasma_36,
                        description = "Empty State",
                        buttonLabel = "Action",
                    )
                },
                footer = if (state.showLoading) { { Loading() } } else null,
                listContent = {
                    listContent(
                        filteredList = filteredList,
                        onClick = {
                            text = text.copy(it, TextRange(it.length))
                            showDropdown = false
                        },
                    )
                },
            )
        }
    }

    @Composable
    override fun Preview(
        style: AutocompleteStyle,
        key: ComponentKey,
    ) {
        var text by remember { mutableStateOf(TextFieldValue()) }
        var showDropdown by remember { mutableStateOf(false) }
        val textFieldInteractionSource = remember { MutableInteractionSource() }
        val filteredList = AutocompleteSuggestions.filterSuggestions(text.text)
        val showEmptyState = filteredList.isEmpty()

        Autocomplete(
            showDropdown = showDropdown,
            onDismissRequest = { showDropdown = false },
            style = style,
            field = {
                TextField(
                    modifier = Modifier.width(240.dp),
                    value = text,
                    placeholderText = "Сотрудник",
                    captionText = "Введите имя Алексей",
                    onValueChange = {
                        text = it
                        showDropdown = true
                    },
                    endContent = {
                        Icon(painter = painterResource(com.sdds.icons.R.drawable.ic_search_24), "")
                    },
                    focusSelectorSettings = FocusSelectorSettings.None,
                    interactionSource = textFieldInteractionSource,
                )
            },
            showEmptyState = showEmptyState,
            emptyState = {
                EmptyState(
                    iconRes = com.sdds.icons.R.drawable.ic_plasma_36,
                    description = "Empty State",
                    buttonLabel = "Action",
                )
            },
            footer = { Loading() },
        ) {
            items(filteredList.size) { index ->
                ListItem(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ) {
                            text = TextFieldValue(
                                text = filteredList[index],
                                selection = TextRange(filteredList[index].length),
                            )
                            showDropdown = false
                        },
                    text = filteredList[index],
                )
            }
        }
    }
}

private val keyboardHeight: Dp
    @Composable get() {
        val windowInsets = WindowInsets.ime
        val density = LocalDensity.current
        return with(density) { windowInsets.getBottom(density).toDp() }
    }

private val screenHeight: Dp
    @Composable get() {
        val componentScreenPaddings = 32.dp
        val screenSize = LocalConfiguration.current.screenHeightDp.dp
        return screenSize - keyboardHeight - componentScreenPaddings
    }

private fun LazyListScope.listContent(
    filteredList: List<String>,
    onClick: (String) -> Unit,
) {
    items(filteredList.size) { index ->
        ListItem(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                ) {
                    onClick.invoke(filteredList[index])
                },
            text = filteredList[index],
        )
    }
}

private val AutocompleteSuggestions = setOf(
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

private fun Set<String>.filterSuggestions(text: String): List<String> {
    return this.filter { suggestion -> suggestion.contains(text, ignoreCase = true) }
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
