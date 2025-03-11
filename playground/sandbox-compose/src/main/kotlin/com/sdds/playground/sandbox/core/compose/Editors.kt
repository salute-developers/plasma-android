package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.playground.sandbox.R
import kotlin.math.roundToInt

internal val LocalPropertyEditorStyle = compositionLocalOf { PropertyEditorStyle.create() }

@Immutable
internal interface PropertyEditorStyle {

    val labelTextStyle: TextStyle
    val labelTextColor: Color

    val spacing: Dp

    val confirmButtonStyle: ButtonStyle

    companion object {

        fun create(
            labelTextStyle: TextStyle = TextStyle.Default,
            labelTextColor: Color = Color.Black,
            spacing: Dp = 16.dp,
            confirmButtonStyle: ButtonStyle = ButtonStyle.basicButtonBuilder().style(),
        ): PropertyEditorStyle =
            PropertyEditorStyleImpl(
                labelTextStyle = labelTextStyle,
                labelTextColor = labelTextColor,
                spacing = spacing,
                confirmButtonStyle = confirmButtonStyle,
            )
    }
}

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
    style: PropertyEditorStyle = LocalPropertyEditorStyle.current,
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
            style = style,
        )

        is Property.IntProperty -> TextPropertyEditor(
            onConfirm = { newValue ->
                property.onApply(newValue.toFloatOrNull()?.roundToInt() ?: 0)
                onConfirm()
            },
            propertyName = property.name,
            currentValue = property.value.toString(),
            style = style,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
        )

        is Property.StringProperty -> TextPropertyEditor(
            onConfirm = { newValue ->
                property.onApply(newValue)
                onConfirm()
            },
            propertyName = property.name,
            currentValue = property.value,
            style = style,
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
    style: PropertyEditorStyle,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
) {
    var textFieldValue by remember { mutableStateOf(currentValue) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequester = remember { FocusRequester() }

    Text(
        text = stringResource(id = R.string.sandbox_text_editor_title, propertyName),
        style = style.labelTextStyle.copy(color = style.labelTextColor),
    )
    Spacer(modifier = Modifier.height(style.spacing))
    TextField(
        value = textFieldValue,
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(focusRequester),
        keyboardOptions = keyboardOptions,
        onValueChange = { textFieldValue = it },
        placeholderText = stringResource(id = R.string.sandbox_text_editor_placeholder),
    )
    Spacer(modifier = Modifier.height(style.spacing))
    Button(
        style = style.confirmButtonStyle,
        modifier = Modifier.fillMaxWidth(),
        label = stringResource(R.string.sandbox_editor_confirm),
        onClick = {
            focusRequester.freeFocus()
            keyboardController?.hide()
            onConfirm(textFieldValue)
        },

    )
    Spacer(modifier = Modifier.height(style.spacing))
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
    style: PropertyEditorStyle,
    modifier: Modifier = Modifier,
) {
    Spacer(modifier = Modifier.height(style.spacing))
    Text(
        text = stringResource(id = R.string.sandbox_choice_editor_title, propertyName),
        style = style.labelTextStyle.copy(color = style.labelTextColor),
    )
    LazyColumn {
        items(choices.size) {
            val choice = choices[it]
            Spacer(modifier = Modifier.height(style.spacing))
            RadioBox(
                checked = choice == currentValue,
                label = choice.toString(),
                modifier = modifier
                    .fillMaxWidth(),
                onClick = { onConfirm(choice) },
            )
        }
    }
}

@Immutable
private data class PropertyEditorStyleImpl(
    override val labelTextStyle: TextStyle,
    override val labelTextColor: Color,
    override val spacing: Dp,
    override val confirmButtonStyle: ButtonStyle,
) : PropertyEditorStyle
