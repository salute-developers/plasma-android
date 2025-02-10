package com.sdds.playground.sandbox.textfield.vs

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
import com.sdds.serv.colorstate.TextAreaColorState
import com.sdds.serv.colorstate.TextFieldColorState
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
    val state: FieldColorState = FieldColorState.Default,
    val labelText: String = "Label",
    val placeholderText: String = "Placeholder",
    val valueText: String? = null,
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

@Parcelize
internal enum class FieldColorState : Parcelable {
    /**
     * Нормальное состояние поля
     */
    Default,

    /**
     * Обозначение позитивного сценария
     */
    Success,

    /**
     * Обозначение предупреждения
     */
    Warning,

    /**
     * Обозначение негативного сценария
     */
    Error,
}

internal fun FieldColorState.asTextFieldState(): TextFieldColorState =
    when (this) {
        FieldColorState.Default -> TextFieldColorState.DEFAULT
        FieldColorState.Success -> TextFieldColorState.SUCCESS
        FieldColorState.Warning -> TextFieldColorState.WARNING
        FieldColorState.Error -> TextFieldColorState.ERROR
    }

internal fun FieldColorState.asTextAreaState(): TextAreaColorState =
    when (this) {
        FieldColorState.Default -> TextAreaColorState.DEFAULT
        FieldColorState.Warning -> TextAreaColorState.WARNING
        FieldColorState.Error -> TextAreaColorState.ERROR
        else -> TextAreaColorState.DEFAULT
    }

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
    TextFieldL(R.style.Serv_Sdds_ComponentOverlays_TextFieldL),
    TextFieldLOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabel),
    TextFieldLOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredStart),
    TextFieldLOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredEnd),
    TextFieldLInnerLabel(R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabel),
    TextFieldLInnerLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredStart),
    TextFieldLInnerLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredEnd),
    TextFieldM(R.style.Serv_Sdds_ComponentOverlays_TextFieldM),
    TextFieldMOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabel),
    TextFieldMOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabelRequiredStart),
    TextFieldMOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabelRequiredEnd),
    TextFieldMInnerLabel(R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabel),
    TextFieldMInnerLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabelRequiredStart),
    TextFieldMInnerLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabelRequiredEnd),
    TextFieldS(R.style.Serv_Sdds_ComponentOverlays_TextFieldS),
    TextFieldSOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabel),
    TextFieldSOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredStart),
    TextFieldSOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredEnd),
    TextFieldSInnerLabel(R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabel),
    TextFieldSInnerLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredStart),
    TextFieldSInnerLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredEnd),
    TextFieldXS(R.style.Serv_Sdds_ComponentOverlays_TextFieldXs),
    TextFieldXSRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldXsRequiredStart),
    TextFieldXSRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldXsRequiredEnd),
    TextFieldXSOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabel),
    TextFieldXSOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabelRequiredStart),
    TextFieldXSOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabelRequiredEnd),
}

/**
 * Стиль варианта компонента [TextField] в многострочном режиме
 * @property styleRes ресурс стиля варианта
 */
@Parcelize
internal enum class TextAreaVariant(@StyleRes override val styleRes: Int) : FieldVariant {
    TextAreaL(R.style.Serv_Sdds_ComponentOverlays_TextAreaL),
    TextAreaLOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabel),
    TextAreaLOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabelRequiredStart),
    TextAreaLOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabelRequiredEnd),
    TextAreaLInnerLabel(R.style.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabel),
    TextAreaLInnerLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabelRequiredStart),
    TextAreaLInnerLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabelRequiredEnd),
    TextAreaM(R.style.Serv_Sdds_ComponentOverlays_TextAreaM),
    TextAreaMOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabel),
    TextAreaMOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabelRequiredStart),
    TextAreaMOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabelRequiredEnd),
    TextAreaMInnerLabel(R.style.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabel),
    TextAreaMInnerLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabelRequiredStart),
    TextAreaMInnerLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabelRequiredEnd),
    TextAreaS(R.style.Serv_Sdds_ComponentOverlays_TextAreaS),
    TextAreaSOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabel),
    TextAreaSOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabelRequiredStart),
    TextAreaSOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabelRequiredEnd),
    TextAreaSInnerLabel(R.style.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabel),
    TextAreaSInnerLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabelRequiredStart),
    TextAreaSInnerLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabelRequiredEnd),
    TextAreaXS(R.style.Serv_Sdds_ComponentOverlays_TextAreaXs),
    TextAreaXSRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaXsRequiredStart),
    TextAreaXSRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaXsRequiredEnd),
    TextAreaXSOuterLabel(R.style.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabel),
    TextAreaXSOuterLabelRequiredStart(R.style.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabelRequiredStart),
    TextAreaXSOuterLabelRequiredEnd(R.style.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabelRequiredEnd),
}
