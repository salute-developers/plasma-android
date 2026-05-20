package com.sdds.playground.integrationtest.scenarios.focus

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.components.scenario.ButtonFocusCase
import com.sdds.playground.integrationtest.components.scenario.ButtonGroupFocusCase
import com.sdds.playground.integrationtest.components.scenario.ChipFocusCase
import com.sdds.playground.integrationtest.components.scenario.ChipGroupFocusCase
import com.sdds.playground.integrationtest.components.scenario.CodeInputFocusCase
import com.sdds.playground.integrationtest.components.scenario.RadioBoxGroupFocusCase
import com.sdds.playground.integrationtest.components.scenario.ScenarioButton
import com.sdds.playground.integrationtest.components.scenario.TextFieldFocusCase
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.tabs.Xs

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
    RadioBoxGroup(
        title = "RadioBoxGroup",
        tabTag = FocusSelectorTags.RADIO_BOX_GROUP_TAB,
        contentTag = FocusSelectorTags.RADIO_BOX_GROUP_TAB_CONTENT,
    ),
    CodeInput(
        title = "CodeInput",
        tabTag = FocusSelectorTags.CODE_INPUT_TAB,
        contentTag = FocusSelectorTags.CODE_INPUT_TAB_CONTENT,
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
    var isRadioBoxGroupFocused by remember { mutableStateOf(false) }
    var isCodeInputFocused by remember { mutableStateOf(false) }
    var wasButtonFocused by remember { mutableStateOf(false) }
    var wasButtonGroupFocused by remember { mutableStateOf(false) }
    var wasChipFocused by remember { mutableStateOf(false) }
    var wasChipGroupFocused by remember { mutableStateOf(false) }
    var wasTextFieldFocused by remember { mutableStateOf(false) }
    var wasRadioBoxGroupFocused by remember { mutableStateOf(false) }
    var wasCodeInputFocused by remember { mutableStateOf(false) }
    var textFieldValue by remember { mutableStateOf("") }

    val focusManager = LocalFocusManager.current
    val buttonInteractionSource = remember { MutableInteractionSource() }
    val chipInteractionSource = remember { MutableInteractionSource() }
    val codeInputInteractionSource = remember { MutableInteractionSource() }

    val checks = focusSelectorChecks(
        wasButtonFocused = wasButtonFocused,
        wasButtonGroupFocused = wasButtonGroupFocused,
        wasChipFocused = wasChipFocused,
        wasChipGroupFocused = wasChipGroupFocused,
        wasTextFieldFocused = wasTextFieldFocused,
        wasRadioBoxGroupFocused = wasRadioBoxGroupFocused,
        wasCodeInputFocused = wasCodeInputFocused,
        isButtonFocused = isButtonFocused,
        isChipFocused = isChipFocused,
        isTextFieldFocused = isTextFieldFocused,
        isRadioBoxGroupFocused = isRadioBoxGroupFocused,
        isCodeInputFocused = isCodeInputFocused,
    )

    ScenarioScaffold(
        title = "Фокус-селектор",
        description = "Сценарий с вкладками для проверки focus selector у разных компонентов.",
        checks = checks,
        rootTestTag = FocusSelectorTags.ROOT,
    ) {
        LazyColumn(
            modifier = Modifier.navigationBarsPadding(),
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
                FocusSelectorTabContent(
                    selectedTab = selectedTab,
                    textFieldValue = textFieldValue,
                    isButtonFocused = isButtonFocused,
                    isButtonGroupFocused = isButtonGroupFocused,
                    isChipFocused = isChipFocused,
                    isChipGroupFocused = isChipGroupFocused,
                    isTextFieldFocused = isTextFieldFocused,
                    isRadioBoxGroupFocused = isRadioBoxGroupFocused,
                    isCodeInputFocused = isCodeInputFocused,
                    buttonInteractionSource = buttonInteractionSource,
                    chipInteractionSource = chipInteractionSource,
                    codeInputInteractionSource = codeInputInteractionSource,
                    onButtonFocusChanged = { focusState ->
                        isButtonFocused = focusState
                        wasButtonFocused = wasButtonFocused || focusState
                    },
                    onButtonGroupFocusChanged = { focusState ->
                        isButtonGroupFocused = focusState
                        wasButtonGroupFocused = wasButtonGroupFocused || focusState
                    },
                    onChipFocusChanged = { focusState ->
                        isChipFocused = focusState
                        wasChipFocused = wasChipFocused || focusState
                    },
                    onChipGroupFocusChanged = { focusState ->
                        isChipGroupFocused = focusState
                        wasChipGroupFocused = wasChipGroupFocused || focusState
                    },
                    onTextFieldFocusChanged = { focusState ->
                        isTextFieldFocused = focusState
                        wasTextFieldFocused = wasTextFieldFocused || focusState
                    },
                    onRadioBoxGroupFocusChanged = { focusState ->
                        isRadioBoxGroupFocused = focusState
                        wasRadioBoxGroupFocused = wasRadioBoxGroupFocused || focusState
                    },
                    onCodeInputFocusChanged = { focusState ->
                        isCodeInputFocused = focusState
                        wasCodeInputFocused = wasCodeInputFocused || focusState
                    },
                    onTextFieldValueChange = { value -> textFieldValue = value },
                    onClearButtonFocus = { focusManager.clearFocus(force = true) },
                    onClearChipFocus = { focusManager.clearFocus(force = true) },
                    onClearTextFieldFocus = { focusManager.clearFocus(force = true) },
                    onClearRadioBoxGroupFocus = {
                        focusManager.clearFocus(force = true)
                        isRadioBoxGroupFocused = false
                    },
                    onClearCodeInputFocus = {
                        focusManager.clearFocus(force = true)
                        isCodeInputFocused = false
                    },
                )
            }
        }
    }
}

@Composable
private fun FocusSelectorTabContent(
    selectedTab: FocusSelectorTab,
    textFieldValue: String,
    isButtonFocused: Boolean,
    isButtonGroupFocused: Boolean,
    isChipFocused: Boolean,
    isChipGroupFocused: Boolean,
    isTextFieldFocused: Boolean,
    isRadioBoxGroupFocused: Boolean,
    isCodeInputFocused: Boolean,
    buttonInteractionSource: MutableInteractionSource,
    chipInteractionSource: MutableInteractionSource,
    codeInputInteractionSource: MutableInteractionSource,
    onButtonFocusChanged: (Boolean) -> Unit,
    onButtonGroupFocusChanged: (Boolean) -> Unit,
    onChipFocusChanged: (Boolean) -> Unit,
    onChipGroupFocusChanged: (Boolean) -> Unit,
    onTextFieldFocusChanged: (Boolean) -> Unit,
    onRadioBoxGroupFocusChanged: (Boolean) -> Unit,
    onCodeInputFocusChanged: (Boolean) -> Unit,
    onTextFieldValueChange: (String) -> Unit,
    onClearButtonFocus: () -> Unit,
    onClearChipFocus: () -> Unit,
    onClearTextFieldFocus: () -> Unit,
    onClearRadioBoxGroupFocus: () -> Unit,
    onClearCodeInputFocus: () -> Unit,
) {
    when (selectedTab) {
        FocusSelectorTab.Button -> ButtonFocusCase(
            isFocused = isButtonFocused,
            interactionSource = buttonInteractionSource,
            onFocusChanged = onButtonFocusChanged,
            onClearFocus = onClearButtonFocus,
        )

        FocusSelectorTab.ButtonGroup -> ButtonGroupFocusCase(
            isFocused = isButtonGroupFocused,
            onFocusChanged = onButtonGroupFocusChanged,
            onClearFocus = onClearButtonFocus,
        )

        FocusSelectorTab.Chip -> ChipFocusCase(
            isFocused = isChipFocused,
            interactionSource = chipInteractionSource,
            onFocusChanged = onChipFocusChanged,
            onClearFocus = onClearChipFocus,
        )

        FocusSelectorTab.ChipGroup -> ChipGroupFocusCase(
            isFocused = isChipGroupFocused,
            onFocusChanged = onChipGroupFocusChanged,
            onClearFocus = onClearChipFocus,
        )

        FocusSelectorTab.TextField -> TextFieldFocusCase(
            value = textFieldValue,
            isFocused = isTextFieldFocused,
            onValueChange = onTextFieldValueChange,
            onFocusChanged = onTextFieldFocusChanged,
            onClearFocus = onClearTextFieldFocus,
        )

        FocusSelectorTab.RadioBoxGroup -> RadioBoxGroupFocusCase(
            isFocused = isRadioBoxGroupFocused,
            onFocusChanged = onRadioBoxGroupFocusChanged,
            onClearFocus = onClearRadioBoxGroupFocus,
        )

        FocusSelectorTab.CodeInput -> CodeInputFocusCase(
            isFocused = isCodeInputFocused,
            interactionSource = codeInputInteractionSource,
            onFocusChanged = onCodeInputFocusChanged,
            onClearFocus = onClearCodeInputFocus,
        )
    }
}

private fun focusSelectorChecks(
    wasButtonFocused: Boolean,
    wasButtonGroupFocused: Boolean,
    wasChipFocused: Boolean,
    wasChipGroupFocused: Boolean,
    wasTextFieldFocused: Boolean,
    wasRadioBoxGroupFocused: Boolean,
    wasCodeInputFocused: Boolean,
    isButtonFocused: Boolean,
    isChipFocused: Boolean,
    isTextFieldFocused: Boolean,
    isRadioBoxGroupFocused: Boolean,
    isCodeInputFocused: Boolean,
): List<ScenarioCheckUiState> = listOf(
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
    ScenarioCheckUiState(
        title = "Группа радиокнопок получает фокус",
        passed = wasRadioBoxGroupFocused,
        testTag = FocusSelectorTags.check(8),
    ),
    ScenarioCheckUiState(
        title = "CodeInput получает фокус",
        passed = wasCodeInputFocused,
        testTag = FocusSelectorTags.check(9),
    ),
    ScenarioCheckUiState(
        title = "Фокус можно сбросить у радиокнопок и CodeInput",
        passed = (wasRadioBoxGroupFocused || wasCodeInputFocused) &&
            !isRadioBoxGroupFocused && !isCodeInputFocused,
        testTag = FocusSelectorTags.check(10),
    ),
)

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
internal fun FocusSelectorClearButton(
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
