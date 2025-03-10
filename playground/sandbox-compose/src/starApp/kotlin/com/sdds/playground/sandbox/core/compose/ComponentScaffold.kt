package com.sdds.playground.sandbox.core.compose

import android.view.Gravity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogWindowProvider
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdkit.star.designsystem.theme.StarDsTheme

/**
 * Макет для экрана с компонентом с таблицей изменяемых параметров компонента.
 * @param component Composable компонента
 * @param propertiesOwner делегат-владелец свойств
 */
@Composable
internal fun ComponentScaffold(
    component: @Composable BoxScope.() -> Unit,
    propertiesOwner: PropertiesOwner,
) {
    var currentProperty: Property<*>? by remember { mutableStateOf(null) }
    val properties by propertiesOwner.properties.collectAsState()
    var openDialog by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 8.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Box(
            modifier = Modifier
                .weight(0.4f, fill = true)
                .requiredHeight(230.dp)
                .clip(StarDsTheme.shapes.roundM)
                .border(
                    1.dp,
                    StarDsTheme.colors.surfaceDefaultSolidTertiary,
                    StarDsTheme.shapes.roundM,
                )
                .background(StarDsTheme.colors.surfaceDefaultSolidCard)
                .padding(16.dp),

            contentAlignment = Alignment.Center,
        ) {
            component()
        }

        PropertiesList(
            modifier = Modifier
                .weight(0.6f, fill = true),
            properties = properties,
            onSelect = {
                currentProperty = it
                openDialog = true
            },
            onReset = { propertiesOwner.resetToDefault() },
        )
    }

    if (openDialog) {
        PropertyEditorDialog(
            property = currentProperty,
            onConfirm = { openDialog = false },
        )
    }
}

/**
 * Редактор свойств.
 * Изменяет свое содержимое согласно подтипу [Property].
 * @param property редактируемое свойство
 * @param onConfirm колбэк завершения редактирования
 */
@Composable
private fun PropertyEditorDialog(
    property: Property<*>?,
    onConfirm: () -> Unit,
) {
    Dialog(onDismissRequest = onConfirm) {
        (LocalView.current.parent as? DialogWindowProvider)?.apply {
            window.setGravity(Gravity.END)
        }
        SandboxTheme {
            val sandboxStyle = LocalSandboxStyle.current
            Column(
                modifier = Modifier
                    .clip(sandboxStyle.sheetShape)
                    .background(sandboxStyle.sheetBackgroundColor)
                    .padding(dimensionResource(R.dimen.sandbox_editor_paddings)),
            ) {
                PropertyEditor(property = property, onConfirm = onConfirm)
            }
        }
    }
}
