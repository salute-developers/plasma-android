package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.theme.SddsServTheme
import kotlinx.coroutines.launch

/**
 * Макет для экрана с компонентом с таблицей изменяемых параметров компонента.
 * @param component Composable компонента
 * @param propertiesOwner делегат-владелец свойств
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun <State : UiState, S : Style> ComponentScaffold(
    key: ComponentKey,
    viewModel: ComponentViewModel<State, S>,
    themeManager: ThemeManager = ThemeManager,
    component: @Composable BoxScope.(State, S) -> Unit,
) {
    val sheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    val uiScope = rememberCoroutineScope()
    var currentProperty: Property<*>? by remember { mutableStateOf(null) }
    val properties by viewModel.properties.collectAsState()

    ModalBottomSheetLayout(
        sheetState = sheetState,
        sheetContent = {
            Column(Modifier.padding(dimensionResource(R.dimen.sandbox_editor_paddings))) {
                PropertyEditor(
                    property = currentProperty,
                    onConfirm = {
                        uiScope.launch { sheetState.hide() }
                    },
                )
                Spacer(modifier = Modifier.imePadding().navigationBarsPadding())
            }
        },
        sheetShape = SddsServTheme.shapes.roundS.copy(
            bottomStart = CornerSize(0.dp),
            bottomEnd = CornerSize(0.dp),
        ),
        sheetBackgroundColor = SddsServTheme.colors.surfaceDefaultSolidCard,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(230.dp)
                    .clip(SddsServTheme.shapes.roundM)
                    .border(1.dp, SddsServTheme.colors.surfaceDefaultSolidTertiary, SddsServTheme.shapes.roundM)
                    .background(SddsServTheme.colors.surfaceDefaultSolidCard)
                    .padding(16.dp),

                contentAlignment = Alignment.Center,
            ) {
                val currentTheme by themeManager.currentTheme.collectAsState()
                currentTheme.compose.themeWrapper {
                    val uiState by viewModel.uiState.collectAsState()
                    component(
                        uiState,
                        currentTheme.compose.components.get<String, S>(key).styleProvider.style(uiState.variant),
                    )
                }
            }

            PropertiesList(
                properties = properties,
                onSelect = {
                    currentProperty = it
                    uiScope.launch { sheetState.show() }
                },
                onReset = { viewModel.resetToDefault() },
            )
        }
    }
}
