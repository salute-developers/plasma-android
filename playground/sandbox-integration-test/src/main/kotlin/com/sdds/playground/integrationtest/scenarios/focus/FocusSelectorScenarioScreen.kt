package com.sdds.playground.integrationtest.scenarios.focus

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.components.scenario.ScenarioButton
import com.sdds.playground.integrationtest.components.scenario.ScenarioButtonGroup
import com.sdds.playground.integrationtest.components.scenario.ScenarioTextField
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState
import com.sdds.playground.integrationtest.uistate.TextFieldUiState
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.buttongroup.BasicButtonGroup
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.Segmented
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.chip.Chip
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chipgroup.ChipGroupDense
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.tabs.Xs
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.TextField

private enum class FocusSelectorTab(
    val title: String,
    val tabTag: String,
    val contentTag: String,
) {
    Button(
        title = "Button",
        tabTag = FocusSelectorTags.BUTTON_TAB,
        contentTag = FocusSelectorTags.BUTTON_TAB_CONTENT,
    ),
    ButtonGroup(
        title = "ButtonGroup",
        tabTag = FocusSelectorTags.BUTTON_GROUP_TAB,
        contentTag = FocusSelectorTags.BUTTON_GROUP_TAB_CONTENT,
    ),
    Chip(
        title = "Chip",
        tabTag = FocusSelectorTags.CHIP_TAB,
        contentTag = FocusSelectorTags.CHIP_TAB_CONTENT,
    ),
    ChipGroup(
        title = "ChipGroup",
        tabTag = FocusSelectorTags.CHIP_GROUP_TAB,
        contentTag = FocusSelectorTags.CHIP_GROUP_TAB_CONTENT,
    ),
    TextField(
        title = "TextField",
        tabTag = FocusSelectorTags.TEXT_FIELD_TAB,
        contentTag = FocusSelectorTags.TEXT_FIELD_TAB_CONTENT,
    ),
}

@Composable
internal fun FocusSelectorScenarioScreen() {
    var selectedTab by remember { mutableStateOf(FocusSelectorTab.Button) }
    var isButtonFocused by remember { mutableStateOf(false) }
    var isButtonGroupFocused by remember { mutableStateOf(false) }
    var isChipFocused by remember { mutableStateOf(false) }
    var isChipGroupFocused by remember { mutableStateOf(false) }
    var isTextFieldFocused by remember { mutableStateOf(false) }
    var wasButtonFocused by remember { mutableStateOf(false) }
    var wasButtonGroupFocused by remember { mutableStateOf(false) }
    var wasChipFocused by remember { mutableStateOf(false) }
    var wasChipGroupFocused by remember { mutableStateOf(false) }
    var wasTextFieldFocused by remember { mutableStateOf(false) }
    var textFieldValue by remember { mutableStateOf("") }

    val focusManager = LocalFocusManager.current
    val buttonInteractionSource = remember { MutableInteractionSource() }
    val chipInteractionSource = remember { MutableInteractionSource() }

    val checks = focusSelectorChecks(
        wasButtonFocused = wasButtonFocused,
        wasButtonGroupFocused = wasButtonGroupFocused,
        wasChipFocused = wasChipFocused,
        wasChipGroupFocused = wasChipGroupFocused,
        wasTextFieldFocused = wasTextFieldFocused,
        isButtonFocused = isButtonFocused,
        isChipFocused = isChipFocused,
        isTextFieldFocused = isTextFieldFocused,
    )

    ScenarioScaffold(
        title = "Фокус-селектор",
        description = "Сценарий с вкладками для проверки focus selector.",
        checks = checks,
        rootTestTag = FocusSelectorTags.ROOT,
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item {
                FocusSelectorTabs(
                    selectedTab = selectedTab,
                    onTabSelected = { tab ->
                        focusManager.clearFocus(force = true)
                        selectedTab = tab
                    },
                )
            }

            item {
                when (selectedTab) {
                    FocusSelectorTab.Button -> ButtonFocusCase(
                        isFocused = isButtonFocused,
                        interactionSource = buttonInteractionSource,
                        onFocusChanged = { focusState ->
                            isButtonFocused = focusState
                            wasButtonFocused = wasButtonFocused || focusState
                        },
                        onClearFocus = { focusManager.clearFocus(force = true) },
                    )

                    FocusSelectorTab.ButtonGroup -> ButtonGroupFocusCase(
                        isFocused = isButtonGroupFocused,
                        onFocusChanged = { focusState ->
                            isButtonGroupFocused = focusState
                            wasButtonGroupFocused = wasButtonGroupFocused || focusState
                        },
                        onClearFocus = { focusManager.clearFocus(force = true) },
                    )

                    FocusSelectorTab.Chip -> ChipFocusCase(
                        isFocused = isChipFocused,
                        interactionSource = chipInteractionSource,
                        onFocusChanged = { focusState ->
                            isChipFocused = focusState
                            wasChipFocused = wasChipFocused || focusState
                        },
                        onClearFocus = { focusManager.clearFocus(force = true) },
                    )

                    FocusSelectorTab.ChipGroup -> ChipGroupFocusCase(
                        isFocused = isChipGroupFocused,
                        onFocusChanged = { focusState ->
                            isChipGroupFocused = focusState
                            wasChipGroupFocused = wasChipGroupFocused || focusState
                        },
                        onClearFocus = { focusManager.clearFocus(force = true) },
                    )

                    FocusSelectorTab.TextField -> TextFieldFocusCase(
                        value = textFieldValue,
                        isFocused = isTextFieldFocused,
                        onValueChange = { value -> textFieldValue = value },
                        onFocusChanged = { focusState ->
                            isTextFieldFocused = focusState
                            wasTextFieldFocused = wasTextFieldFocused || focusState
                        },
                        onClearFocus = { focusManager.clearFocus(force = true) },
                    )
                }
            }
        }
    }
}

private fun focusSelectorChecks(
    wasButtonFocused: Boolean,
    wasButtonGroupFocused: Boolean,
    wasChipFocused: Boolean,
    wasChipGroupFocused: Boolean,
    wasTextFieldFocused: Boolean,
    isButtonFocused: Boolean,
    isChipFocused: Boolean,
    isTextFieldFocused: Boolean,
): List<ScenarioCheckUiState> {
    return listOf(
        ScenarioCheckUiState(
            title = "Кнопка получает фокус",
            passed = wasButtonFocused,
            testTag = FocusSelectorTags.check(1),
        ),
        ScenarioCheckUiState(
            title = "Группа кнопок получает фокус",
            passed = wasButtonGroupFocused,
            testTag = FocusSelectorTags.check(2),
        ),
        ScenarioCheckUiState(
            title = "Чип получает фокус",
            passed = wasChipFocused,
            testTag = FocusSelectorTags.check(3),
        ),
        ScenarioCheckUiState(
            title = "Группа чипов получает фокус",
            passed = wasChipGroupFocused,
            testTag = FocusSelectorTags.check(4),
        ),
        ScenarioCheckUiState(
            title = "Фокус можно сбросить у кнопки и чипа",
            passed = (wasButtonFocused || wasChipFocused) && !isButtonFocused && !isChipFocused,
            testTag = FocusSelectorTags.check(5),
        ),
        ScenarioCheckUiState(
            title = "Текстовое поле получает фокус",
            passed = wasTextFieldFocused,
            testTag = FocusSelectorTags.check(6),
        ),
        ScenarioCheckUiState(
            title = "Фокус можно сбросить у текстового поля",
            passed = wasTextFieldFocused && !isTextFieldFocused,
            testTag = FocusSelectorTags.check(7),
        ),
    )
}

@Composable
private fun FocusSelectorTabs(
    selectedTab: FocusSelectorTab,
    onTabSelected: (FocusSelectorTab) -> Unit,
) {
    Tabs(
        selectedTabIndexProvider = { selectedTab.ordinal },
        style = TabsDefault.Xs.Horizontal.style(),
        clip = TabsClip.ShowMore,
        onDisclosureTabClicked = { index ->
            onTabSelected(FocusSelectorTab.entries[index])
        },
    ) {
        FocusSelectorTab.entries.forEach { tab ->
            tabItem(dropdownAlias = tab.title) {
                TabItem(
                    modifier = Modifier
                        .focusProperties { canFocus = false }
                        .testTag(tab.tabTag),
                    isSelected = selectedTab == tab,
                    onClick = { onTabSelected(tab) },
                ) {
                    Text(tab.title)
                }
            }
        }
    }
}

@Composable
private fun ButtonFocusCase(
    isFocused: Boolean,
    interactionSource: MutableInteractionSource,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.BUTTON_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Button")
        ScenarioButton(
            state = ButtonUiState(
                label = "Фокусируемая кнопка",
                testTag = FocusSelectorTags.FOCUSABLE_BUTTON,
            ),
            style = BasicButton.L.Default.style(),
            modifier = Modifier.onFocusChanged { onFocusChanged(it.isFocused) },
            interactionSource = interactionSource,
            keyboardFocusable = true,
            onClick = {},
        )
        Text(
            text = if (isFocused) "Кнопка в фокусе" else "Кнопка не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.BUTTON_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}

@Composable
private fun ButtonGroupFocusCase(
    isFocused: Boolean,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.BUTTON_GROUP_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "ButtonGroup")
        ScenarioButtonGroup(
            state = ButtonUiState(
                label = "Buttons",
                testTag = FocusSelectorTags.FOCUSABLE_BUTTON_GROUP,
            ),
            style = BasicButtonGroup.Xs.NoGap.Segmented.style(),
            modifier = Modifier.onFocusChanged { onFocusChanged(it.isFocused) },
            keyboardFocusable = true,
            onClick = {},
        )
        Text(
            text = if (isFocused) "Группа кнопок в фокусе" else "Кнопки не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.BUTTON_GROUP_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}

@Composable
private fun ChipFocusCase(
    isFocused: Boolean,
    interactionSource: MutableInteractionSource,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.CHIP_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Chip")
        Chip(
            modifier = Modifier
                .onFocusChanged { onFocusChanged(it.isFocused) }
                .focusable(
                    enabled = true,
                    interactionSource = interactionSource,
                )
                .testTag(FocusSelectorTags.FOCUSABLE_CHIP),
            style = Chip.L.Default.style(),
            label = "Фокусируемый чип",
            interactionSource = interactionSource,
            onClick = {},
        )
        Text(
            text = if (isFocused) "Чип в фокусе" else "Чип не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.CHIP_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}

@Composable
private fun ChipGroupFocusCase(
    isFocused: Boolean,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.CHIP_GROUP_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "ChipGroup")
        ChipGroup(
            modifier = Modifier.testTag(FocusSelectorTags.CHIP_GROUP),
            style = ChipGroupDense.M.Default.style(),
        ) {
            repeat(3) { index ->
                val itemInteractionSource = remember { MutableInteractionSource() }
                Chip(
                    modifier = Modifier
                        .onFocusChanged { onFocusChanged(it.isFocused) }
                        .focusable(
                            enabled = true,
                            interactionSource = itemInteractionSource,
                        )
                        .testTag(FocusSelectorTags.chipGroupItem(index)),
                    style = Chip.M.Default.style(),
                    label = "Chips",
                    interactionSource = itemInteractionSource,
                    onClick = {},
                )
            }
        }
        Text(
            text = if (isFocused) "Группа чипов в фокусе" else "Чипы не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.CHIP_GROUP_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}

@Composable
private fun TextFieldFocusCase(
    value: String,
    isFocused: Boolean,
    onValueChange: (String) -> Unit,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.TEXT_FIELD_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "TextField")
        ScenarioTextField(
            state = TextFieldUiState(
                value = value,
                label = "Фокусируемое текстовое поле",
                placeholder = "Введите текст",
                testTag = FocusSelectorTags.FOCUSABLE_TEXT_FIELD,
            ),
            style = TextField.L.InnerLabel.Default.style(),
            modifier = Modifier.onFocusChanged { onFocusChanged(it.isFocused) },
            onValueChange = onValueChange,
            focusSelectorSettings = LocalFocusSelectorSettings.current,
        )
        Text(
            text = if (isFocused) "Текстовое поле в фокусе" else "Текстовое поле не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.TEXT_FIELD_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}

@Composable
private fun FocusSelectorClearButton(
    onClick: () -> Unit,
) {
    ScenarioButton(
        state = ButtonUiState(
            label = "Сбросить фокус",
            testTag = FocusSelectorTags.CLEAR_FOCUS,
        ),
        style = BasicButton.Xs.Secondary.style(),
        onClick = onClick,
    )
}
