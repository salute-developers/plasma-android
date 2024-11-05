package com.sdds.plasma.b2c.sandbox.core

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.buttons.Default
import com.sdds.playground.sandbox.buttons.M
import com.sdds.playground.sandbox.textfield.SandboxTextField
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme
import kotlin.math.roundToInt

/**
 * Редактор свойств.
 * Изменяет свое содержимое согласно подтипу [Property].
 * @param property редактируемое свойство
 * @param onConfirm колбэк завершения редактирования
 * @param modifier модификатор
 */
@Composable
internal fun ColumnScope.PropertyEditor(
    property: Property<*>?,
    onConfirm: () -> Unit,
    modifier: Modifier = Modifier,
) {
    when (property) {
        is Property.SingleChoiceProperty -> ChoiceEditor(
            onConfirm = { newValue ->
                property.onApply(newValue)
                onConfirm()
            },
            propertyName = property.name,
            choices = property.variants,
            currentValue = property.value,
            modifier = modifier,
        )

        is Property.IntProperty -> TextPropertyEditor(
            onConfirm = { newValue ->
                property.onApply(newValue.toFloatOrNull()?.roundToInt() ?: 0)
                onConfirm()
            },
            propertyName = property.name,
            currentValue = property.value.toString(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
        )

        is Property.StringProperty -> TextPropertyEditor(
            onConfirm = { newValue ->
                property.onApply(newValue)
                onConfirm()
            },
            propertyName = property.name,
            currentValue = property.value,
        )

        else -> Unit
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
private fun ColumnScope.TextPropertyEditor(
    onConfirm: (String) -> Unit,
    propertyName: String,
    currentValue: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
) {
    var textFieldValue by remember(currentValue) {
        mutableStateOf(TextFieldValue(currentValue, TextRange(currentValue.length)))
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequester = remember { FocusRequester() }

    Text(
        text = stringResource(id = R.string.sandbox_text_editor_title, propertyName),
        style = SddsServTheme.typography.headerH3Bold.copy(color = SddsServTheme.colors.textDefaultPrimary),
        modifier = Modifier.padding(16.dp),
    )
    SandboxTextField(
        value = textFieldValue,
        modifier = Modifier
            .fillMaxWidth()
            .padding(Margins)
            .focusRequester(focusRequester),
        keyboardOptions = keyboardOptions,
        onValueChange = { textFieldValue = it },
        placeholderText = stringResource(id = R.string.sandbox_text_editor_placeholder),
    )
    Spacer(modifier = Modifier.height(16.dp))
    Button(
        style = BasicButton.M.Default.style(),
        modifier = Modifier
            .fillMaxWidth()
            .padding(Margins),
        label = stringResource(R.string.sandbox_editor_confirm),
        onClick = {
            focusRequester.freeFocus()
            keyboardController?.hide()
            onConfirm(textFieldValue.text)
        },

    )
    Spacer(modifier = Modifier.height(16.dp))
    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
        keyboardController?.show()
    }
}

@Composable
private fun <T> ChoiceEditor(
    onConfirm: (T) -> Unit,
    propertyName: String,
    currentValue: T,
    choices: List<T>,
    modifier: Modifier = Modifier,
) {
    Text(
        text = stringResource(id = R.string.sandbox_choice_editor_title, propertyName),
        style = SddsServTheme.typography.headerH3Bold.copy(color = SddsServTheme.colors.textDefaultPrimary),
        modifier = Modifier.padding(8.dp),
    )
    choices.forEach {
        RadioBox(
            checked = it == currentValue,
            label = it.toString(),
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp),
            onClick = { onConfirm(it) },
        )
    }
}

private val Margins = 8.dp
