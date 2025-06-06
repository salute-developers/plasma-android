package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.selection
import kotlin.math.roundToInt

internal val LocalPropertyEditorStyle = compositionLocalOf { PropertyEditorStyle.create() }

@Immutable
internal interface PropertyEditorStyle {

    val shape: Shape
    val labelTextStyle: TextStyle
    val labelTextColor: Color
    val editorItemBackground: InteractiveColor
    val editorItemShape: Shape
    val editorItemPadding: Dp
    val editorItemHeight: Dp
    val editorItemTextStyle: TextStyle
    val editorItemTextColor: InteractiveColor
    val choiceEditorTextColor: Color
    val backgroundColor: Color
    val spacing: Dp

    val headerHeight: Dp
    val confirmButtonStyle: ButtonStyle
    val textEditorStyle: TextFieldStyle

    companion object {

        fun create(
            shape: Shape = RectangleShape,
            labelTextStyle: TextStyle = TextStyle.Default,
            labelTextColor: Color = Color.Black,
            editorItemBackground: InteractiveColor = Color.LightGray.asInteractive(),
            spacing: Dp = 16.dp,
            confirmButtonStyle: ButtonStyle = ButtonStyle.basicButtonBuilder().style(),
            textEditorStyle: TextFieldStyle = TextFieldStyle.builder().style(),
            backgroundColor: Color = Color.Transparent,
            editorItemShape: Shape = RoundedCornerShape(6.dp),
            editorItemTextStyle: TextStyle = TextStyle.Default,
            editorItemTextColor: InteractiveColor = Color.Black.asInteractive(),
            headerHeight: Dp = 54.dp,
            editorItemPadding: Dp = 6.dp,
            editorItemHeight: Dp = 6.dp,
            choiceEditorTextColor: Color = Color.Black,
        ): PropertyEditorStyle =
            PropertyEditorStyleImpl(
                shape = shape,
                labelTextStyle = labelTextStyle,
                labelTextColor = labelTextColor,
                editorItemBackground = editorItemBackground,
                spacing = spacing,
                confirmButtonStyle = confirmButtonStyle,
                textEditorStyle = textEditorStyle,
                backgroundColor = backgroundColor,
                editorItemShape = editorItemShape,
                editorItemTextStyle = editorItemTextStyle,
                editorItemTextColor = editorItemTextColor,
                editorItemHeight = editorItemHeight,
                headerHeight = headerHeight,
                editorItemPadding = editorItemPadding,
                choiceEditorTextColor = choiceEditorTextColor,
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
internal fun PropertyEditor(
    property: Property<*>?,
    onConfirm: () -> Unit,
    headerTitle: String,
    modifier: Modifier = Modifier,
    style: PropertyEditorStyle = LocalPropertyEditorStyle.current,
) {
    Column(
        modifier = modifier
            .clip(style.shape)
            .background(style.backgroundColor)
            .padding(start = 4.dp, end = 4.dp, bottom = 24.dp),
    ) {
        EditorHeader(
            title = headerTitle,
            style = style,
        )

        when (property) {
            is Property.SingleChoiceProperty -> ChoiceEditor(
                onConfirm = { newValue ->
                    property.onApply(newValue)
                    onConfirm()
                },
                choices = property.variants,
                currentValue = property.value,
                modifier = modifier,
                style = style,
                propertyName = property.name,
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
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
private fun TextPropertyEditor(
    onConfirm: (String) -> Unit,
    propertyName: String,
    currentValue: String,
    style: PropertyEditorStyle,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
) {
    var textFieldValue by remember { mutableStateOf(currentValue) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequester = remember { FocusRequester() }

    TextField(
        style = style.textEditorStyle,
        labelText = propertyName,
        value = textFieldValue,
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(focusRequester),
        keyboardOptions = keyboardOptions,
        onValueChange = { textFieldValue = it },
        placeholderText = "",
        focusSelectorSettings = FocusSelectorSettings.None,
    )
    Spacer(modifier = Modifier.height(style.spacing))
    LaunchedEffect(Unit) {
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
    var selected by remember { mutableStateOf(currentValue) }
    Column(
        Modifier
            .fillMaxHeight(),
    ) {
        Spacer(modifier = Modifier.height(style.spacing))
        Row(
            Modifier
                .padding(horizontal = style.editorItemPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = propertyName,
                style = style.editorItemTextStyle.copy(style.choiceEditorTextColor),
            )
        }
        Spacer(modifier = Modifier.height(style.spacing))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(style.editorItemPadding),
        ) {
            items(choices.size) {
                val interactionSource = remember { MutableInteractionSource() }
                val background = style.editorItemBackground.colorForInteraction(interactionSource)
                val choice = choices[it]
                val isSelected = choice == selected
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(style.editorItemHeight)
                        .focusableItem(
                            interactionSource = interactionSource,
                        )
                        .selection(isSelected, interactionSource)
                        .background(color = background, shape = style.editorItemShape)
                        .clickable {
                            selected = choice
                            onConfirm(choice)
                        }
                        .padding(horizontal = style.editorItemPadding),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = choice.toString(),
                        style = style.editorItemTextStyle
                            .copy(style.editorItemTextColor.colorForInteraction(interactionSource)),
                    )
                }
            }
        }
    }
}

@Composable
private fun EditorHeader(
    title: String,
    style: PropertyEditorStyle,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(style.headerHeight)
            .padding(style.editorItemPadding),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            Modifier
                .weight(1f)
                .wrapContentWidth(Alignment.Start),
        ) {
            Text(
                text = title.substringBefore(","),
                style = style.labelTextStyle.copy(style.choiceEditorTextColor),
            )
            Text(
                text = title.substringAfter(","),
                style = style.labelTextStyle.copy(style.labelTextColor),
            )
        }
    }
}

@Immutable
private data class PropertyEditorStyleImpl(
    override val shape: Shape,
    override val labelTextStyle: TextStyle,
    override val labelTextColor: Color,
    override val spacing: Dp,
    override val confirmButtonStyle: ButtonStyle,
    override val editorItemBackground: InteractiveColor,
    override val textEditorStyle: TextFieldStyle,
    override val backgroundColor: Color,
    override val editorItemShape: Shape,
    override val editorItemTextStyle: TextStyle,
    override val editorItemTextColor: InteractiveColor,
    override val headerHeight: Dp,
    override val editorItemPadding: Dp,
    override val choiceEditorTextColor: Color,
    override val editorItemHeight: Dp,
) : PropertyEditorStyle
