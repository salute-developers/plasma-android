package com.sdds.compose.uikit.fixtures.samples.cell

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellGravity
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun Cell_Simple() {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState()
    composableCodeSnippet {
        Cell(
            modifier = Modifier
                .focusable(interactionSource = interactionSource)
                .focusSelector(
                    settings = LocalFocusSelectorSettings.current,
                ) { isFocused.value },
            title = AnnotatedString("Title"),
            subtitle = AnnotatedString("Subtitle"),
            label = AnnotatedString("Label"),
            disclosureContentEnabled = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = "",
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = "",
                )
            },
            interactionSource = interactionSource,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Cell_Style() {
    composableCodeSnippet {
        CellStyle.builder()
            .colors {
                labelColor(
                    placeholder(Color.Black, "/** Токен цвета */"),
                )
                titleColor(
                    placeholder(Color.Black, "/** Токен цвета */"),
                )
                subtitleColor(
                    placeholder(Color.Gray, "/** Токен цвета */"),
                )
                disclosureTextColor(
                    placeholder(Color.LightGray, "/** Токен цвета */"),
                )
                disclosureIconColor(
                    placeholder(Color.Gray, "/** Токен цвета */"),
                )
            }
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .subtitleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .disclosureTextStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
            .dimensions {
                contentPaddingStart(8.0.dp)
                contentPaddingEnd(8.0.dp)
            }
            .avatarStyle(
                placeholder(
                    AvatarStyle.builder().style(),
                    "/** Стиль компонента Avatar */",
                ),
            )
            .iconButtonStyle(
                placeholder(
                    ButtonStyle.basicButtonBuilder().style(),
                    "/** Стиль компонента IconButton */",
                ),
            )
            .checkBoxStyle(
                placeholder(
                    CheckBoxStyle.builder().style(),
                    "/** Стиль компонента CheckBox */",
                ),
            )
            .radioBoxStyle(
                placeholder(
                    RadioBoxStyle.builder().style(),
                    "/** Стиль компонента RadioBox */",
                ),
            )
            .switchStyle(
                placeholder(
                    SwitchStyle.builder().style(),
                    "/** Стиль компонента Switch */",
                ),
            )
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Cell_Gravity() {
    composableCodeSnippet {
        Cell(
            gravity = CellGravity.Center,
            disclosureContentEnabled = false,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Cell_Disclosure() {
    composableCodeSnippet {
        Cell(
            disclosureContentEnabled = true,
            disclosureText = AnnotatedString("Description"),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Cell_AvatarSwitch() {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState()
    composableCodeSnippet {
        Cell(
            modifier = Modifier
                .focusable(interactionSource = interactionSource)
                .focusSelector(
                    settings = LocalFocusSelectorSettings.current,
                ) { isFocused.value },
            title = AnnotatedString("Title"),
            subtitle = AnnotatedString(""),
            label = AnnotatedString(""),
            disclosureContentEnabled = false,
            startContent = {
                Avatar(painter = painterResource(id = R.drawable.ic_add_smile_fill_36))
            },
            endContent = {
                var active by remember { mutableStateOf(false) }
                Switch(active = active, onActiveChanged = { active = it })
            },
        )
    }
}
