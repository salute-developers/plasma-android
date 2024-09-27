package com.sdds.playground.sandbox.textfield

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
import com.sdds.uikit.TextField
import kotlinx.parcelize.Parcelize

/**
 * Состояние [TextField]
 * @property variant стиль варианта компонента
 * @property state состояние поля
 * @property labelText текст заголовка
 * @property placeholderText текст-заглушка
 * @property captionText текст-подпись
 * @property counterText текст счетчика
 * @property icon иконка слева
 * @property action иконка справа
 * @property enabled включен ли компонент
 * @property readOnly режим "только для чтения"
 * @property hasChips режим поддержки чипов
 * @property chipData данные для чипов
 */
@Parcelize
internal data class TextFieldUiState(
    val variant: FieldVariant,
    val state: TextField.FieldState = TextField.FieldState.Default,
    val labelText: String = "Label",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val counterText: String = "Counter",
    val icon: Boolean = true,
    val action: Boolean = true,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val hasChips: Boolean = false,
    val chipData: List<ExampleChipData> = emptyList(),
    val prefix: String? = "TB",
    val suffix: String? = "TA",
) : Parcelable

/**
 * Пример данных для чипа
 * @property text текст чипа
 */
@Parcelize
internal data class ExampleChipData(
    val text: String,
) : Parcelable

@Parcelize
internal sealed interface FieldVariant : Parcelable {
    @get:StyleRes
    val styleRes: Int
}

/**
 * Стиль варианта компонента [TextField]
 * @property styleRes ресурс стиля варианта
 */
@Parcelize
internal enum class TextFieldVariant(@StyleRes override val styleRes: Int) : FieldVariant {
    TextFieldL(R.style.Theme_Sandbox_ComponentOverlays_TextFieldL),
    TextFieldLOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextFieldLOuterLabel),
    TextFieldLOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldLOuterLabelRequiredStart),
    TextFieldLOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldLOuterLabelRequiredEnd),
    TextFieldLInnerLabel(R.style.Theme_Sandbox_ComponentOverlays_TextFieldLInnerLabel),
    TextFieldLInnerLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldLInnerLabelRequiredStart),
    TextFieldLInnerLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldLInnerLabelRequiredEnd),
    TextFieldM(R.style.Theme_Sandbox_ComponentOverlays_TextFieldM),
    TextFieldMOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextFieldMOuterLabel),
    TextFieldMOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldMOuterLabelRequiredStart),
    TextFieldMOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldMOuterLabelRequiredEnd),
    TextFieldMInnerLabel(R.style.Theme_Sandbox_ComponentOverlays_TextFieldMInnerLabel),
    TextFieldMInnerLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldMInnerLabelRequiredStart),
    TextFieldMInnerLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldMInnerLabelRequiredEnd),
    TextFieldS(R.style.Theme_Sandbox_ComponentOverlays_TextFieldS),
    TextFieldSOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextFieldSOuterLabel),
    TextFieldSOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldSOuterLabelRequiredStart),
    TextFieldSOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldSOuterLabelRequiredEnd),
    TextFieldSInnerLabel(R.style.Theme_Sandbox_ComponentOverlays_TextFieldSInnerLabel),
    TextFieldSInnerLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldSInnerLabelRequiredStart),
    TextFieldSInnerLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldSInnerLabelRequiredEnd),
    TextFieldXS(R.style.Theme_Sandbox_ComponentOverlays_TextFieldXS),
    TextFieldXSRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldXSRequiredStart),
    TextFieldXSRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldXSRequiredEnd),
    TextFieldXSOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextFieldXSOuterLabel),
    TextFieldXSOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextFieldXSOuterLabelRequiredStart),
    TextFieldXSOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextFieldXSOuterLabelRequiredEnd),
}

/**
 * Стиль варианта компонента [TextField] в многострочном режиме
 * @property styleRes ресурс стиля варианта
 */
@Parcelize
internal enum class TextAreaVariant(@StyleRes override val styleRes: Int) : FieldVariant {
    TextAreaL(R.style.Theme_Sandbox_ComponentOverlays_TextAreaL),
    TextAreaLOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextAreaLOuterLabel),
    TextAreaLOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaLOuterLabelRequiredStart),
    TextAreaLOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaLOuterLabelRequiredEnd),
    TextAreaLInnerLabel(R.style.Theme_Sandbox_ComponentOverlays_TextAreaLInnerLabel),
    TextAreaLInnerLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaLInnerLabelRequiredStart),
    TextAreaLInnerLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaLInnerLabelRequiredEnd),
    TextAreaM(R.style.Theme_Sandbox_ComponentOverlays_TextAreaM),
    TextAreaMOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextAreaMOuterLabel),
    TextAreaMOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaMOuterLabelRequiredStart),
    TextAreaMOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaMOuterLabelRequiredEnd),
    TextAreaMInnerLabel(R.style.Theme_Sandbox_ComponentOverlays_TextAreaMInnerLabel),
    TextAreaMInnerLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaMInnerLabelRequiredStart),
    TextAreaMInnerLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaMInnerLabelRequiredEnd),
    TextAreaS(R.style.Theme_Sandbox_ComponentOverlays_TextAreaS),
    TextAreaSOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextAreaSOuterLabel),
    TextAreaSOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaSOuterLabelRequiredStart),
    TextAreaSOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaSOuterLabelRequiredEnd),
    TextAreaSInnerLabel(R.style.Theme_Sandbox_ComponentOverlays_TextAreaSInnerLabel),
    TextAreaSInnerLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaSInnerLabelRequiredStart),
    TextAreaSInnerLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaSInnerLabelRequiredEnd),
    TextAreaXS(R.style.Theme_Sandbox_ComponentOverlays_TextAreaXS),
    TextAreaXSRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaXSRequiredStart),
    TextAreaXSRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaXSRequiredEnd),
    TextAreaXSOuterLabel(R.style.Theme_Sandbox_ComponentOverlays_TextAreaXSOuterLabel),
    TextAreaXSOuterLabelRequiredStart(R.style.Theme_Sandbox_ComponentOverlays_TextAreaXSOuterLabelRequiredStart),
    TextAreaXSOuterLabelRequiredEnd(R.style.Theme_Sandbox_ComponentOverlays_TextAreaXSOuterLabelRequiredEnd),
}
