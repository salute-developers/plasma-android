import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.fs.FocusSelectorBorders
import com.sdds.compose.uikit.fs.FocusSelectorScales
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.playground.integrationtest.components.scenario.ChipGroupFocusCase
import com.sdds.playground.integrationtest.components.scenario.ScenarioTabs
import com.sdds.playground.integrationtest.components.scenario.ScenarioTabsItem
import com.sdds.playground.integrationtest.components.scenario.TextFieldFocusCase
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.testtags.FocusSelectorScaleTags
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState
import kotlinx.coroutines.android.awaitFrame

@Composable
internal fun FocusSelectorScaleScenarioScreen() {
    var selectedTab by remember { mutableStateOf(ScaleTab.ChipGroup) }
    var isChipGroupFocused by remember { mutableStateOf(false) }
    var wasChipGroupFocused by remember { mutableStateOf(false) }
    var isTextFieldFocused by remember { mutableStateOf(false) }
    var wasTextFieldFocused by remember { mutableStateOf(false) }
    var textFieldValue by remember { mutableStateOf("") }

    val focusManager = LocalFocusManager.current
    val tabFocusAnchorRequester = remember { FocusRequester() }

    val scaleSettings = FocusSelectorSettings
        .builder()
        .border(FocusSelectorBorders.none())
        .scale(FocusSelectorScales.byFactor(0.05f))
        .build()

    LaunchedEffect(selectedTab) {
        awaitFrame()
        tabFocusAnchorRequester.requestFocus()
    }

    CompositionLocalProvider(
        LocalFocusSelectorSettings provides scaleSettings,
    ) {
        ScenarioScaffold(
            title = "FocusSelector Scale",
            description = "Проверка focus selector в режиме scale.",
            checks = listOf(
                ScenarioCheckUiState(
                    title = "ChipGroup получает фокус",
                    passed = wasChipGroupFocused,
                    testTag = FocusSelectorScaleTags.check(1),
                ),
                ScenarioCheckUiState(
                    title = "Фокус можно сбросить у чипа",
                    passed = wasChipGroupFocused && !isChipGroupFocused,
                    testTag = FocusSelectorTags.check(2),
                ),
                ScenarioCheckUiState(
                    title = "TextField получает фокус",
                    passed = wasTextFieldFocused,
                    testTag = FocusSelectorScaleTags.check(3),
                ),
                ScenarioCheckUiState(
                    title = "Фокус можно сбросить у текстового поля",
                    passed = wasTextFieldFocused && !isTextFieldFocused,
                    testTag = FocusSelectorTags.check(4),
                ),
            ),
            rootTestTag = FocusSelectorScaleTags.ROOT,
        ) {
            LazyColumn(
                modifier = Modifier.navigationBarsPadding(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                item {
                    ScenarioTabs(
                        items = listOf(
                            ScenarioTabsItem("ChipGroup", FocusSelectorScaleTags.CHIP_GROUP_TAB),
                            ScenarioTabsItem("TextField", FocusSelectorScaleTags.TEXT_FIELD_TAB),
                        ),
                        selectedIndex = selectedTab.ordinal,
                        keyboardFocusable = false,
                        onTabSelected = { index ->
                            focusManager.clearFocus(force = true)
                            selectedTab = ScaleTab.entries[index]
                        },
                    )
                }

                item {
                    when (selectedTab) {
                        ScaleTab.ChipGroup -> ChipGroupFocusCase(
                            isFocused = isChipGroupFocused,
                            rootFocusRequester = tabFocusAnchorRequester,
                            onFocusChanged = {
                                isChipGroupFocused = it
                                wasChipGroupFocused = wasChipGroupFocused || it
                            },
                            onClearFocus = { focusManager.clearFocus(force = true) },
                        )

                        ScaleTab.TextField -> TextFieldFocusCase(
                            value = textFieldValue,
                            isFocused = isTextFieldFocused,
                            rootFocusRequester = tabFocusAnchorRequester,
                            onValueChange = { textFieldValue = it },
                            onFocusChanged = {
                                isTextFieldFocused = it
                                wasTextFieldFocused = wasTextFieldFocused || it
                            },
                            onClearFocus = { focusManager.clearFocus(force = true) },
                        )
                    }
                }
            }
        }
    }
}

private enum class ScaleTab {
    ChipGroup,
    TextField,
}