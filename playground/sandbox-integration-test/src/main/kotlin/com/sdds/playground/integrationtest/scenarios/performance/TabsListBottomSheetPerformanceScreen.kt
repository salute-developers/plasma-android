package com.sdds.playground.integrationtest.scenarios.performance

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.HalfExpandedSettings
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.PerformanceScenarioTags
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.list.ListNormal
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.TabsDefault
import kotlinx.coroutines.launch
import com.sdds.compose.uikit.List as SddsList
import com.sdds.serv.styles.bottomsheet.Default as BottomSheetDefault
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet as ServModalBottomSheet
import com.sdds.serv.styles.list.M as ListM
import com.sdds.serv.styles.tabs.M as TabsM

private val catalogCategories = List(8) { index -> "Category ${index + 1}" }
private const val TARGET_CATEGORY_INDEX = 6
private const val TARGET_CATALOG_ITEM_INDEX = 12
private const val CATALOG_ITEM_COUNT = 30

/** A short catalog journey: scroll tabs, choose a category, scroll its list and open item details. */
@Composable
internal fun TabsListBottomSheetPerformanceScreen() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    var selectedItem by remember { mutableStateOf<String?>(null) }
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Hidden,
        halfExpandedSettings = HalfExpandedSettings.Skip,
    )
    val scope = rememberCoroutineScope()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Tabs(
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag(PerformanceScenarioTags.TABS_LIST_TABS),
                style = TabsDefault.TabsM.Horizontal.style(),
                selectedTabIndexProvider = { selectedTabIndex },
                clip = TabsClip.Scroll,
            ) {
                catalogCategories.forEachIndexed { index, category ->
                    tabItem(dropdownAlias = category) {
                        TabItem(
                            modifier = Modifier.then(
                                if (index == TARGET_CATEGORY_INDEX) {
                                    Modifier.testTag(PerformanceScenarioTags.TABS_LIST_TARGET_TAB)
                                } else {
                                    Modifier
                                },
                            ),
                            isSelected = selectedTabIndex == index,
                            onClick = { selectedTabIndex = index },
                            content = { Text(category) },
                        )
                    }
                }
            }

            Text(
                text = "${catalogCategories[selectedTabIndex]} products",
                modifier = Modifier.padding(horizontal = 16.dp),
            )

            SddsList(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .navigationBarsPadding()
                    .testTag(PerformanceScenarioTags.TABS_LIST_CONTENT),
                style = ListNormal.ListM.style(),
            ) {
                itemsIndexed(
                    items = List(CATALOG_ITEM_COUNT) { index ->
                        "${catalogCategories[selectedTabIndex]} item ${index + 1}"
                    },
                    key = { index, _ -> "${selectedTabIndex}_$index" },
                ) { index, item ->
                    ListItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .then(
                                if (index == TARGET_CATALOG_ITEM_INDEX) {
                                    Modifier.testTag(PerformanceScenarioTags.TABS_LIST_TARGET_ITEM)
                                } else {
                                    Modifier
                                },
                            )
                            .clickable {
                                selectedItem = item
                                scope.launch { sheetState.show() }
                            },
                        text = item,
                        label = "Available today",
                        subtitle = "Deterministic catalog description",
                        disclosureEnabled = true,
                    )
                }
            }
        }

        ModalBottomSheet(
            style = ServModalBottomSheet.BottomSheetDefault.style(),
            sheetState = sheetState,
            sheetGesturesEnabled = false,
            handlePlacement = BottomSheetHandlePlacement.Inner,
            edgeToEdge = false,
            fitContent = true,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Text(text = selectedItem.orEmpty())
                Text(text = "Product details opened from the selected catalog category.")
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .semantics { testTagsAsResourceId = true }
                        .testTag(PerformanceScenarioTags.TABS_LIST_BOTTOM_SHEET),
                    style = BasicButton.M.Default.style(),
                    label = "Close",
                    onClick = { scope.launch { sheetState.hide() } },
                )
            }
        }
    }
}
