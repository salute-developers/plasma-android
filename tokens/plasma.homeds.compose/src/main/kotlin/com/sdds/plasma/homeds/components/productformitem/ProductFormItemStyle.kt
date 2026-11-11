package com.sdds.plasma.homeds.components.productformitem

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ProductFormItemStyle] для компонента [ProductFormItem]
 */
val LocalProductFormItemStyle =
    compositionLocalOf { ProductFormItemStyle.builder().style() }

/**
 * Стиль компонента [ProductFormItem]
 */
@Stable
interface ProductFormItemStyle : Style {

    /**
     * Стиль компонента [FormItem]
     * @see FormItemStyle
     */
    val formItemStyle: FormItemStyle

    /**
     * Стиль компонента [Editable]
     * @see EditableStyle
     */
    val editableStyle: EditableStyle

    companion object {

        /**
         * Возвращает экземпляр [ProductFormItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): ProductFormItemStyleBuilder = DefaultProductFormItemStyle.Builder()
    }
}

/**
 * Builder стиля [ProductFormItem].
 */
@Stable
interface ProductFormItemStyleBuilder : StyleBuilder<ProductFormItemStyle> {

    /**
     * Устанавливает стиль компонента [FormItem]
     */
    fun formItemStyle(style: FormItemStyle): ProductFormItemStyleBuilder

    /**
     * Устанавливает стиль компонента [Editable]
     */
    fun editableStyle(style: EditableStyle): ProductFormItemStyleBuilder
}

@Immutable
internal class DefaultProductFormItemStyle(
    override val formItemStyle: FormItemStyle,
    override val editableStyle: EditableStyle,
) : ProductFormItemStyle {
    @Stable
    class Builder : ProductFormItemStyleBuilder {

        private var formItemStyle: FormItemStyle? = null
        private var editableStyle: EditableStyle? = null

        override fun formItemStyle(style: FormItemStyle): ProductFormItemStyleBuilder = apply {
            this.formItemStyle = style
        }

        override fun editableStyle(style: EditableStyle): ProductFormItemStyleBuilder = apply {
            this.editableStyle = style
        }

        override fun style(): ProductFormItemStyle {
            return DefaultProductFormItemStyle(
                formItemStyle = formItemStyle ?: FormItemStyle.builder().style(),
                editableStyle = editableStyle ?: EditableStyle.builder().style(),
            )
        }
    }
}
