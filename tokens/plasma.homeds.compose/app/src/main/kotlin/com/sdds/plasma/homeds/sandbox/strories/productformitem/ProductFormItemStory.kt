package com.sdds.plasma.homeds.sandbox.strories.productformitem

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.icons.R
import com.sdds.plasma.homeds.components.productformitem.ProductFormItem
import com.sdds.plasma.homeds.components.productformitem.ProductFormItemStyle
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsProductFormItemUiStatePropertiesProducer
import com.sdds.plasma.homeds.compose.sandbox.stories.HomeDsProductFormItemUiStateTransformer
import com.sdds.plasma.homeds.integration.custom.ProductFormItemKey
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонетна ProductFormItem в песочнице
 *
 * @param caption контент надписи
 * @param enabled передаваемое значение
 * @param readonly если false - фокусировка, ввод текста и копирование отключены
 * @param singleLine режим однострочного текста
 * @param iconPlacement режим расположения иконки [EditableIconPlacement].
 * @param textAlign выранивание текста в Editable
 */
@StoryUiState
data class HomeDsProductFormItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val caption: String = "Caption",
    val enabled: Boolean = true,
    val readonly: Boolean = false,
    val singleLine: Boolean = true,
    val iconPlacement: EditableIconPlacement = EditableIconPlacement.Relative,
    val textAlign: FormItemTextAlign = FormItemTextAlign.Start,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Выранивание текста в Editable
 * @param align выравнивание
 */
enum class FormItemTextAlign(val align: TextAlign) {
    Center(TextAlign.Center),
    Start(TextAlign.Start),
    End(TextAlign.End),
}

@Story
internal object ProductFormItemStory : ComposeBaseStory<HomeDsProductFormItemUiState, ProductFormItemStyle>(
    ProductFormItemKey,
    HomeDsProductFormItemUiState(),
    HomeDsProductFormItemUiStatePropertiesProducer,
    HomeDsProductFormItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ProductFormItemStyle,
        state: HomeDsProductFormItemUiState,
    ) {
        var text by remember { mutableStateOf(TextFieldValue("Value")) }
        val focusRequester = remember { FocusRequester() }

        ProductFormItem(
            onValueChange = { text = it },
            style = style,
            focusRequester = focusRequester,
            caption = { Text(text = state.caption) },
            enabled = state.enabled,
            value = text,
            icon = {
                Icon(
                    modifier = Modifier
                        .clickable(
                            indication = null,
                            enabled = state.enabled,
                            interactionSource = remember { MutableInteractionSource() },
                        ) {
                            focusRequester.requestFocus()
                            text = text.copy(selection = TextRange(text.text.length))
                        },
                    painter = painterResource(R.drawable.ic_edit_fill_24),
                    contentDescription = null,
                )
            },
            iconPlacement = state.iconPlacement,
            textAlign = state.textAlign.align,
            singleLine = state.singleLine,
            readOnly = state.readonly,
        )
    }

    @Composable
    override fun Preview(style: ProductFormItemStyle, key: ComponentKey) {
        ProductFormItem(
            onValueChange = {},
            style = style,
            caption = { Text(text = "Caption") },
            value = TextFieldValue("Value"),
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_edit_fill_24),
                    contentDescription = null,
                )
            },
        )
    }
}
