package com.sdds.testing.vs.mask

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.TextField
import kotlinx.parcelize.Parcelize

/**
 * Состояние [TextField] с маской, используемое для тестирования компонента TextField с различными масками.
 *
 * @property variant стиль варианта компонента
 * @property appearance внешний вид компонента
 * @property colorVariant цветовое состояние поля
 * @property labelText текст заголовка поля
 * @property placeholderText текст-заглушка для поля
 * @property valueText текст значения поля
 * @property icon наличие иконки слева
 * @property action наличие иконки справа (действия)
 * @property enabled включен ли компонент
 * @property readOnly режим "только для чтения"
 * @property prefix префикс перед значением
 * @property suffix суффикс после значения
 * @property mask тип маски для поля ввода
 * @property maskDisplayMode режим отображения маски (всегда или только при вводе)
 */
@Parcelize
data class MaskUiState(
    override val variant: String = "",
    override val appearance: String = "",
    override val colorVariant: String = "",
    val labelText: String = "Label",
    val placeholderText: String = "",
    val valueText: String? = null,
    val icon: Boolean = true,
    val action: Boolean = true,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val prefix: String? = "",
    val suffix: String? = "",
    val mask: TextFieldMask = TextFieldMask.PHONE,
    val maskDisplayMode: TextFieldMaskDisplayMode = TextFieldMaskDisplayMode.ALWAYS,
) : Parcelable, UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }

    override fun updateColorVariant(colorVariant: String): UiState {
        return copy(colorVariant = colorVariant)
    }
}

/**
 * Перечисление типов масок поля ввода.
 *
 * @property raw соответствующая маска из TextField.Mask
 */
enum class TextFieldMask(val raw: TextField.Mask) {
    /**
     * Маска для ввода телефона.
     */
    PHONE(TextField.Mask.Phone()),

    /**
     * Маска для ввода даты.
     */
    DATE(TextField.Mask.Date),

    /**
     * Маска для ввода времени.
     */
    TIME(TextField.Mask.Time),

    /**
     * Маска для ввода чисел.
     */
    NUMBER(TextField.Mask.Number()),
}

/**
 * Режим отображения маски поля ввода.
 *
 * @property raw целочисленное значение режима отображения маски
 */
enum class TextFieldMaskDisplayMode(val raw: Int) {
    /**
     * Маска отображается всегда.
     */
    ALWAYS(TextField.MASK_DISPLAY_MODE_ALWAYS),

    /**
     * Маска отображается только при вводе.
     */
    ON_INPUT(TextField.MASK_DISPLAY_MODE_ON_INPUT),
}
