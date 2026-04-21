// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.textfield

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TextField
 */
public enum class TextFieldStyles(
    public val key: String,
) {
    TextFieldSDefault("TextField.S.Default"),
    TextFieldSError("TextField.S.Error"),
    TextFieldSRequiredStartDefault("TextField.S.RequiredStart.Default"),
    TextFieldSRequiredStartError("TextField.S.RequiredStart.Error"),
    TextFieldSRequiredEndDefault("TextField.S.RequiredEnd.Default"),
    TextFieldSRequiredEndError("TextField.S.RequiredEnd.Error"),
    TextFieldSInnerLabelDefault("TextField.S.InnerLabel.Default"),
    TextFieldSInnerLabelError("TextField.S.InnerLabel.Error"),
    TextFieldSInnerLabelRequiredStartDefault("TextField.S.InnerLabel.RequiredStart.Default"),
    TextFieldSInnerLabelRequiredStartError("TextField.S.InnerLabel.RequiredStart.Error"),
    TextFieldSInnerLabelRequiredEndDefault("TextField.S.InnerLabel.RequiredEnd.Default"),
    TextFieldSInnerLabelRequiredEndError("TextField.S.InnerLabel.RequiredEnd.Error"),
    TextFieldMDefault("TextField.M.Default"),
    TextFieldMError("TextField.M.Error"),
    TextFieldMRequiredStartDefault("TextField.M.RequiredStart.Default"),
    TextFieldMRequiredStartError("TextField.M.RequiredStart.Error"),
    TextFieldMRequiredEndDefault("TextField.M.RequiredEnd.Default"),
    TextFieldMRequiredEndError("TextField.M.RequiredEnd.Error"),
    TextFieldMInnerLabelDefault("TextField.M.InnerLabel.Default"),
    TextFieldMInnerLabelError("TextField.M.InnerLabel.Error"),
    TextFieldMInnerLabelRequiredStartDefault("TextField.M.InnerLabel.RequiredStart.Default"),
    TextFieldMInnerLabelRequiredStartError("TextField.M.InnerLabel.RequiredStart.Error"),
    TextFieldMInnerLabelRequiredEndDefault("TextField.M.InnerLabel.RequiredEnd.Default"),
    TextFieldMInnerLabelRequiredEndError("TextField.M.InnerLabel.RequiredEnd.Error"),
    TextFieldLDefault("TextField.L.Default"),
    TextFieldLError("TextField.L.Error"),
    TextFieldLRequiredStartDefault("TextField.L.RequiredStart.Default"),
    TextFieldLRequiredStartError("TextField.L.RequiredStart.Error"),
    TextFieldLRequiredEndDefault("TextField.L.RequiredEnd.Default"),
    TextFieldLRequiredEndError("TextField.L.RequiredEnd.Error"),
    TextFieldLInnerLabelDefault("TextField.L.InnerLabel.Default"),
    TextFieldLInnerLabelError("TextField.L.InnerLabel.Error"),
    TextFieldLInnerLabelRequiredStartDefault("TextField.L.InnerLabel.RequiredStart.Default"),
    TextFieldLInnerLabelRequiredStartError("TextField.L.InnerLabel.RequiredStart.Error"),
    TextFieldLInnerLabelRequiredEndDefault("TextField.L.InnerLabel.RequiredEnd.Default"),
    TextFieldLInnerLabelRequiredEndError("TextField.L.InnerLabel.RequiredEnd.Error"),
    ;

    /**
     * Typed API для подбора стиля text-field
     */
    public companion object
}

/**
 * Возможные значения свойства size для text-field
 */
public enum class TextFieldSize {
    S,
    M,
    L,
}

/**
 * Возможные значения свойства required-placement для text-field
 */
public enum class TextFieldRequiredPlacement {
    None,
    Start,
    End,
}

/**
 * Возможные значения свойства label-placement для text-field
 */
public enum class TextFieldLabelPlacement {
    Inner,
    None,
}

/**
 * Возможные значения свойства view для text-field
 */
public enum class TextFieldView {
    Default,
    Error,
}

/**
 * Возвращает [TextFieldStyle] для [TextFieldStyles]
 */
@Composable
public fun TextFieldStyles.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextFieldStyles.TextFieldSDefault -> TextField.S.Default
        TextFieldStyles.TextFieldSError -> TextField.S.Error
        TextFieldStyles.TextFieldSRequiredStartDefault -> TextField.S.RequiredStart.Default
        TextFieldStyles.TextFieldSRequiredStartError -> TextField.S.RequiredStart.Error
        TextFieldStyles.TextFieldSRequiredEndDefault -> TextField.S.RequiredEnd.Default
        TextFieldStyles.TextFieldSRequiredEndError -> TextField.S.RequiredEnd.Error
        TextFieldStyles.TextFieldSInnerLabelDefault -> TextField.S.InnerLabel.Default
        TextFieldStyles.TextFieldSInnerLabelError -> TextField.S.InnerLabel.Error
        TextFieldStyles.TextFieldSInnerLabelRequiredStartDefault ->
            TextField.S.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldSInnerLabelRequiredStartError ->
            TextField.S.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldSInnerLabelRequiredEndDefault ->
            TextField.S.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldSInnerLabelRequiredEndError ->
            TextField.S.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldMDefault -> TextField.M.Default
        TextFieldStyles.TextFieldMError -> TextField.M.Error
        TextFieldStyles.TextFieldMRequiredStartDefault -> TextField.M.RequiredStart.Default
        TextFieldStyles.TextFieldMRequiredStartError -> TextField.M.RequiredStart.Error
        TextFieldStyles.TextFieldMRequiredEndDefault -> TextField.M.RequiredEnd.Default
        TextFieldStyles.TextFieldMRequiredEndError -> TextField.M.RequiredEnd.Error
        TextFieldStyles.TextFieldMInnerLabelDefault -> TextField.M.InnerLabel.Default
        TextFieldStyles.TextFieldMInnerLabelError -> TextField.M.InnerLabel.Error
        TextFieldStyles.TextFieldMInnerLabelRequiredStartDefault ->
            TextField.M.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldMInnerLabelRequiredStartError ->
            TextField.M.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldMInnerLabelRequiredEndDefault ->
            TextField.M.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldMInnerLabelRequiredEndError ->
            TextField.M.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldLDefault -> TextField.L.Default
        TextFieldStyles.TextFieldLError -> TextField.L.Error
        TextFieldStyles.TextFieldLRequiredStartDefault -> TextField.L.RequiredStart.Default
        TextFieldStyles.TextFieldLRequiredStartError -> TextField.L.RequiredStart.Error
        TextFieldStyles.TextFieldLRequiredEndDefault -> TextField.L.RequiredEnd.Default
        TextFieldStyles.TextFieldLRequiredEndError -> TextField.L.RequiredEnd.Error
        TextFieldStyles.TextFieldLInnerLabelDefault -> TextField.L.InnerLabel.Default
        TextFieldStyles.TextFieldLInnerLabelError -> TextField.L.InnerLabel.Error
        TextFieldStyles.TextFieldLInnerLabelRequiredStartDefault ->
            TextField.L.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldLInnerLabelRequiredStartError ->
            TextField.L.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldLInnerLabelRequiredEndDefault ->
            TextField.L.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldLInnerLabelRequiredEndError ->
            TextField.L.InnerLabel.RequiredEnd.Error
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field
 */
public fun TextFieldStyles.Companion.resolve(
    size: TextFieldSize = TextFieldSize.S,
    requiredPlacement: TextFieldRequiredPlacement = TextFieldRequiredPlacement.None,
    labelPlacement: TextFieldLabelPlacement = TextFieldLabelPlacement.Inner,
    view: TextFieldView = TextFieldView.Default,
): TextFieldStyles = when {
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldSDefault
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldSError
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldSRequiredStartDefault
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldSRequiredStartError
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldSRequiredEndDefault
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldSRequiredEndError
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldSInnerLabelDefault
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldSInnerLabelError
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldSInnerLabelRequiredStartDefault
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldSInnerLabelRequiredStartError
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldSInnerLabelRequiredEndDefault
    size == TextFieldSize.S && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldSInnerLabelRequiredEndError
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldMDefault
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldMError
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldMRequiredStartDefault
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldMRequiredStartError
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldMRequiredEndDefault
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldMRequiredEndError
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldMInnerLabelDefault
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldMInnerLabelError
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldMInnerLabelRequiredStartDefault
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldMInnerLabelRequiredStartError
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldMInnerLabelRequiredEndDefault
    size == TextFieldSize.M && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldMInnerLabelRequiredEndError
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldLDefault
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldLError
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldLRequiredStartDefault
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldLRequiredStartError
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.None && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldLRequiredEndDefault
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.None && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldLRequiredEndError
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldLInnerLabelDefault
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.None &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldLInnerLabelError
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldLInnerLabelRequiredStartDefault
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.Start &&
        labelPlacement == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldLInnerLabelRequiredStartError
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.Inner && view == TextFieldView.Default ->
        TextFieldStyles.TextFieldLInnerLabelRequiredEndDefault
    size == TextFieldSize.L && requiredPlacement == TextFieldRequiredPlacement.End && labelPlacement
        == TextFieldLabelPlacement.Inner && view == TextFieldView.Error ->
        TextFieldStyles.TextFieldLInnerLabelRequiredEndError
    else -> error("Unsupported text-field style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field
 */
@Composable
public fun TextFieldStyles.Companion.style(
    size: TextFieldSize = TextFieldSize.S,
    requiredPlacement: TextFieldRequiredPlacement = TextFieldRequiredPlacement.None,
    labelPlacement: TextFieldLabelPlacement = TextFieldLabelPlacement.Inner,
    view: TextFieldView = TextFieldView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, requiredPlacement, labelPlacement, view).style(modify)
