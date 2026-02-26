package com.sdds.playground.sandbox.bottomsheet.compose.test


import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.internal.modal.BottomSheetState
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.bottomsheet.Default
import com.sdds.plasma.giga.styles.bottomsheet.ModalBottomSheet
import com.sdds.plasma.giga.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.giga.styles.buttongroup.Default
import com.sdds.plasma.giga.styles.buttongroup.M
import com.sdds.plasma.giga.styles.buttongroup.Wide
import com.sdds.plasma.giga.styles.iconbutton.IconButton
import com.sdds.plasma.giga.styles.iconbutton.M
import com.sdds.plasma.giga.styles.iconbutton.Pilled
import com.sdds.plasma.giga.styles.iconbutton.Secondary
import com.sdds.plasma.giga.styles.textarea.Default
import com.sdds.plasma.giga.styles.textarea.S
import com.sdds.plasma.giga.styles.textarea.TextArea
import com.sdds.plasma.giga.styles.textfield.Default
import com.sdds.plasma.giga.styles.textfield.S
import com.sdds.plasma.giga.styles.textfield.TextField
import com.sdds.plasma.giga.theme.PlasmaGigaTheme

import kotlinx.coroutines.launch
import com.sdds.icons.R as PlasmaR

@Composable
@Suppress("LongMethod")
internal fun ResearchSettingsDialogUltra(
    state: BottomSheetState,
    onDismissRequest: () -> Unit = {},
    onToneMenuDismiss: () -> Unit = {},
    onDeepResearchEnabledChanged: (Boolean) -> Unit = {},
    onSaveClick: () -> Unit = {},
) {
    val researchState = state
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val colors = PlasmaGigaTheme.colors
    val primaryTextColor = colors.textDefaultPrimary
    val secondaryTextColor = colors.textDefaultSecondary
    val typography = PlasmaGigaTheme.typography

    ModalBottomSheet(
        modifier = Modifier.imePadding(),
        sheetGesturesEnabled = true,
        style = ModalBottomSheet.Default.style(),
        sheetState = researchState,
        onDismiss = {
            onDismissRequest()
            coroutineScope.launch { researchState.hide() }
        },
        fitContent = false,
        handlePlacement = BottomSheetHandlePlacement.None,
        footer = {
            ButtonGroup(
                modifier = Modifier.fillMaxWidth(),
                orientation = ButtonGroupOrientation.Horizontal,
                style = BasicButtonGroup.M.Wide.Default.style(),
            ) {
                button(1f) {
                    Button(
                        label = "Save",
                        onClick = {
                            onSaveClick()
                            coroutineScope.launch { researchState.hide() }
                        },
                    )
                }
            }
        },
        body = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState()),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        modifier = Modifier.semantics { heading() },
                        text = "Title",
                        style = typography.headerH3Bold,
                        color = { primaryTextColor },
                    )

                    IconButton(
                        modifier = Modifier
                            .size(24.dp)
                            .padding(top = 12.dp, end = 12.dp),
                        style = IconButton.M.Pilled.Secondary.style(), // Surfaces/Default/Solid/Primary
                        iconRes = PlasmaR.drawable.ic_close_24,
                        iconContentDescription = "Close Icon",
                        onClick = {
                            onDismissRequest()
                            coroutineScope.launch { researchState.hide() }
                        },
                    )
                }
                Text(
                    modifier = Modifier.padding(horizontal = 8.dp),
                    text = "Label",
                    style = typography.bodyMNormal,
                    color = { primaryTextColor },
                )

                Row(
                    modifier = Modifier
                        .semantics(true) {
                            contentDescription = ""
                        }
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .background(
                            shape = PlasmaGigaTheme.shapes.roundM,
                            color = colors.surfaceDefaultTransparentPrimary,
                        )
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Title",
                        style = typography.bodyMNormal,
                        color = { primaryTextColor },
                    )
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(PlasmaR.drawable.ic_chevron_down_24),
                        contentDescription = null,
                        tint = secondaryTextColor,
                    )
                }

                Row(
                    modifier = Modifier
                        .semantics(mergeDescendants = true) {
                            role = Role.Switch
                        }
                        .fillMaxWidth()
                        .padding(top = 24.dp)
                        .background(
                            shape = PlasmaGigaTheme.shapes.roundM,
                            color = colors.surfaceDefaultTransparentPrimary,
                        )
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Text(
                            text = "Label",
                            style = typography.bodyMNormal,
                            color = { primaryTextColor },
                        )
                        Text(
                            text = "Label",
                            style = typography.bodySNormal,
                            color = { secondaryTextColor },
                        )
                    }
                    Switch(
                        modifier = Modifier.semantics {
                            contentDescription = "switch"
                        },
                        active = true,
                        onActiveChanged = onDeepResearchEnabledChanged,
                    )
                }

                Text(
                    modifier = Modifier.padding(start = 8.dp, top = 24.dp),
                    text = "Label",
                    style = typography.bodyMNormal,
                    color = { primaryTextColor },
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                    text = "Label",
                    style = typography.bodySNormal,
                    color = { secondaryTextColor },
                )

                TextField(
                    modifier = Modifier
                        .semantics {
                            contentDescription = ""
                        }
                        .fillMaxWidth()
                        .heightIn(max = 200.dp)
                        .padding(top = 10.dp, bottom = 24.dp),
                    value = "Input",
                    onValueChange = {
                        // TODO GIGAPLEX-3982 Выбор источников
                    },
                    style = TextField.S.Default.style(),
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            }
        },
    )
}
