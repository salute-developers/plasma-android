package com.sdds.playground.sandbox.core

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.unit.dp
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme
import kotlinx.coroutines.launch

/**
 * Макет для экрана с компонентом с таблицей изменяемых параметров компонента.
 * @param component Composable компонента
 * @param propertiesOwner делегат-владелец свойств
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun ComponentScaffold(
    component: @Composable BoxScope.() -> Unit,
    propertiesOwner: PropertiesOwner,
) {
    val sheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    val uiScope = rememberCoroutineScope()
    var currentProperty: Property<*>? by remember { mutableStateOf(null) }
    val properties by propertiesOwner.properties.collectAsState()

    ModalBottomSheetLayout(
        sheetState = sheetState,
        sheetContent = {
            Spacer(modifier = Modifier.height(16.dp))
            PropertyEditor(
                property = currentProperty,
                onConfirm = {
                    uiScope.launch { sheetState.hide() }
                },
            )
            Spacer(modifier = Modifier.imePadding())
        },
        sheetShape = StylesSaluteTheme.shapes.roundS.copy(
            bottomStart = CornerSize(0.dp),
            bottomEnd = CornerSize(0.dp),
        ),
        sheetBackgroundColor = StylesSaluteTheme.colors.surfaceDefaultSolidCard,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(all = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(230.dp)
                    .clip(StylesSaluteTheme.shapes.roundM)
                    .border(1.dp, StylesSaluteTheme.colors.surfaceDefaultSolidTertiary, StylesSaluteTheme.shapes.roundM)
                    .background(StylesSaluteTheme.colors.surfaceDefaultSolidCard)
                    .padding(16.dp),

                contentAlignment = Alignment.Center,
            ) {
                component()
            }

            PropertiesList(
                properties = properties,
                onSelect = {
                    currentProperty = it
                    uiScope.launch { sheetState.show() }
                },
                onReset = { propertiesOwner.resetToDefault() },
            )
        }
    }
}
