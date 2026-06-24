package com.sdds.playground.integrationtest.scenarios.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scaffold.ScenarioScaffold
import com.sdds.playground.integrationtest.testtags.TextFieldInvalidSelectionTags
import com.sdds.playground.integrationtest.uistate.ScenarioCheckUiState
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.TextField as TextFieldStyles

private val OriginalText = "a".repeat(112)
private val TransformedTextValue = "a".repeat(103)

@Composable
internal fun TextFieldInvalidSelectionScenarioScreen() {
    var value by remember {
        mutableStateOf(
            TextFieldValue(
                text = OriginalText,
                selection = TextRange(TransformedTextValue.length),
            ),
        )
    }
    var caretMoved by remember { mutableStateOf(false) }

    ScenarioScaffold(
        title = "Каретка за пределами отображаемого текста",
        description = "Воспроизводит падение getCursorRect, когда исходное смещение каретки больше длины " +
            "трансформированного layout",
        rootTestTag = TextFieldInvalidSelectionTags.ROOT,
        checks = listOf(
            ScenarioCheckUiState(
                title = "Caret was moved to original text end",
                passed = caretMoved,
                testTag = TextFieldInvalidSelectionTags.CHECK_CARET_MOVED,
            ),
        ),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Button(
                label = "Move caret to original end",
                modifier = Modifier.testTag(TextFieldInvalidSelectionTags.MOVE_CARET_BUTTON),
                style = BasicButton.S.Secondary.style(),
                onClick = {
                    caretMoved = true
                    value = value.copy(selection = TextRange(value.text.length))
                },
            )
            TextField(
                value = value,
                onValueChange = { value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag(TextFieldInvalidSelectionTags.FIELD),
                style = TextFieldStyles.L.InnerLabel.Default.style(),
                labelText = "Repro text field",
                focusSelectorSettings = FocusSelectorSettings.None,
                visualTransformation = ShorteningVisualTransformation,
            )
            Text(text = "Length: ${value.text.length}, selection: ${value.selection.end}")
        }
    }
}

private object ShorteningVisualTransformation : VisualTransformation {

    override fun filter(text: AnnotatedString): TransformedText {
        return TransformedText(
            text = AnnotatedString(TransformedTextValue),
            offsetMapping = object : OffsetMapping {
                override fun originalToTransformed(offset: Int): Int = offset.coerceAtMost(TransformedTextValue.length)
                override fun transformedToOriginal(offset: Int): Int = offset.coerceAtMost(OriginalText.length)
            },
        )
    }
}
