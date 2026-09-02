// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.textfield

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
    TextFieldXsDefault("TextField.Xs.Default"),
    TextFieldXsSuccess("TextField.Xs.Success"),
    TextFieldXsWarning("TextField.Xs.Warning"),
    TextFieldXsError("TextField.Xs.Error"),
    TextFieldXsEdited("TextField.Xs.Edited"),
    TextFieldXsRequiredEndDefault("TextField.Xs.RequiredEnd.Default"),
    TextFieldXsRequiredEndSuccess("TextField.Xs.RequiredEnd.Success"),
    TextFieldXsRequiredEndWarning("TextField.Xs.RequiredEnd.Warning"),
    TextFieldXsRequiredEndError("TextField.Xs.RequiredEnd.Error"),
    TextFieldXsRequiredEndEdited("TextField.Xs.RequiredEnd.Edited"),
    TextFieldXsOuterLabelDefault("TextField.Xs.OuterLabel.Default"),
    TextFieldXsOuterLabelSuccess("TextField.Xs.OuterLabel.Success"),
    TextFieldXsOuterLabelWarning("TextField.Xs.OuterLabel.Warning"),
    TextFieldXsOuterLabelError("TextField.Xs.OuterLabel.Error"),
    TextFieldXsOuterLabelEdited("TextField.Xs.OuterLabel.Edited"),
    TextFieldXsOuterLabelRequiredEndDefault("TextField.Xs.OuterLabel.RequiredEnd.Default"),
    TextFieldXsOuterLabelRequiredEndSuccess("TextField.Xs.OuterLabel.RequiredEnd.Success"),
    TextFieldXsOuterLabelRequiredEndWarning("TextField.Xs.OuterLabel.RequiredEnd.Warning"),
    TextFieldXsOuterLabelRequiredEndError("TextField.Xs.OuterLabel.RequiredEnd.Error"),
    TextFieldXsOuterLabelRequiredEndEdited("TextField.Xs.OuterLabel.RequiredEnd.Edited"),
    TextFieldSDefault("TextField.S.Default"),
    TextFieldSSuccess("TextField.S.Success"),
    TextFieldSWarning("TextField.S.Warning"),
    TextFieldSError("TextField.S.Error"),
    TextFieldSEdited("TextField.S.Edited"),
    TextFieldSRequiredEndDefault("TextField.S.RequiredEnd.Default"),
    TextFieldSRequiredEndSuccess("TextField.S.RequiredEnd.Success"),
    TextFieldSRequiredEndWarning("TextField.S.RequiredEnd.Warning"),
    TextFieldSRequiredEndError("TextField.S.RequiredEnd.Error"),
    TextFieldSRequiredEndEdited("TextField.S.RequiredEnd.Edited"),
    TextFieldSOuterLabelDefault("TextField.S.OuterLabel.Default"),
    TextFieldSOuterLabelSuccess("TextField.S.OuterLabel.Success"),
    TextFieldSOuterLabelWarning("TextField.S.OuterLabel.Warning"),
    TextFieldSOuterLabelError("TextField.S.OuterLabel.Error"),
    TextFieldSOuterLabelEdited("TextField.S.OuterLabel.Edited"),
    TextFieldSOuterLabelRequiredEndDefault("TextField.S.OuterLabel.RequiredEnd.Default"),
    TextFieldSOuterLabelRequiredEndSuccess("TextField.S.OuterLabel.RequiredEnd.Success"),
    TextFieldSOuterLabelRequiredEndWarning("TextField.S.OuterLabel.RequiredEnd.Warning"),
    TextFieldSOuterLabelRequiredEndError("TextField.S.OuterLabel.RequiredEnd.Error"),
    TextFieldSOuterLabelRequiredEndEdited("TextField.S.OuterLabel.RequiredEnd.Edited"),
    TextFieldSInnerLabelDefault("TextField.S.InnerLabel.Default"),
    TextFieldSInnerLabelSuccess("TextField.S.InnerLabel.Success"),
    TextFieldSInnerLabelWarning("TextField.S.InnerLabel.Warning"),
    TextFieldSInnerLabelError("TextField.S.InnerLabel.Error"),
    TextFieldSInnerLabelEdited("TextField.S.InnerLabel.Edited"),
    TextFieldSInnerLabelRequiredEndDefault("TextField.S.InnerLabel.RequiredEnd.Default"),
    TextFieldSInnerLabelRequiredEndSuccess("TextField.S.InnerLabel.RequiredEnd.Success"),
    TextFieldSInnerLabelRequiredEndWarning("TextField.S.InnerLabel.RequiredEnd.Warning"),
    TextFieldSInnerLabelRequiredEndError("TextField.S.InnerLabel.RequiredEnd.Error"),
    TextFieldSInnerLabelRequiredEndEdited("TextField.S.InnerLabel.RequiredEnd.Edited"),
    TextFieldClearXsDefault("TextFieldClear.Xs.Default"),
    TextFieldClearXsSuccess("TextFieldClear.Xs.Success"),
    TextFieldClearXsWarning("TextFieldClear.Xs.Warning"),
    TextFieldClearXsError("TextFieldClear.Xs.Error"),
    TextFieldClearXsEdited("TextFieldClear.Xs.Edited"),
    TextFieldClearXsRequiredEndDefault("TextFieldClear.Xs.RequiredEnd.Default"),
    TextFieldClearXsRequiredEndSuccess("TextFieldClear.Xs.RequiredEnd.Success"),
    TextFieldClearXsRequiredEndWarning("TextFieldClear.Xs.RequiredEnd.Warning"),
    TextFieldClearXsRequiredEndError("TextFieldClear.Xs.RequiredEnd.Error"),
    TextFieldClearXsRequiredEndEdited("TextFieldClear.Xs.RequiredEnd.Edited"),
    TextFieldClearXsOuterLabelDefault("TextFieldClear.Xs.OuterLabel.Default"),
    TextFieldClearXsOuterLabelSuccess("TextFieldClear.Xs.OuterLabel.Success"),
    TextFieldClearXsOuterLabelWarning("TextFieldClear.Xs.OuterLabel.Warning"),
    TextFieldClearXsOuterLabelError("TextFieldClear.Xs.OuterLabel.Error"),
    TextFieldClearXsOuterLabelEdited("TextFieldClear.Xs.OuterLabel.Edited"),
    TextFieldClearXsOuterLabelRequiredEndDefault("TextFieldClear.Xs.OuterLabel.RequiredEnd.Default"),
    TextFieldClearXsOuterLabelRequiredEndSuccess("TextFieldClear.Xs.OuterLabel.RequiredEnd.Success"),
    TextFieldClearXsOuterLabelRequiredEndWarning("TextFieldClear.Xs.OuterLabel.RequiredEnd.Warning"),
    TextFieldClearXsOuterLabelRequiredEndError("TextFieldClear.Xs.OuterLabel.RequiredEnd.Error"),
    TextFieldClearXsOuterLabelRequiredEndEdited("TextFieldClear.Xs.OuterLabel.RequiredEnd.Edited"),
    TextFieldClearSDefault("TextFieldClear.S.Default"),
    TextFieldClearSSuccess("TextFieldClear.S.Success"),
    TextFieldClearSWarning("TextFieldClear.S.Warning"),
    TextFieldClearSError("TextFieldClear.S.Error"),
    TextFieldClearSEdited("TextFieldClear.S.Edited"),
    TextFieldClearSRequiredEndDefault("TextFieldClear.S.RequiredEnd.Default"),
    TextFieldClearSRequiredEndSuccess("TextFieldClear.S.RequiredEnd.Success"),
    TextFieldClearSRequiredEndWarning("TextFieldClear.S.RequiredEnd.Warning"),
    TextFieldClearSRequiredEndError("TextFieldClear.S.RequiredEnd.Error"),
    TextFieldClearSRequiredEndEdited("TextFieldClear.S.RequiredEnd.Edited"),
    TextFieldClearSOuterLabelDefault("TextFieldClear.S.OuterLabel.Default"),
    TextFieldClearSOuterLabelSuccess("TextFieldClear.S.OuterLabel.Success"),
    TextFieldClearSOuterLabelWarning("TextFieldClear.S.OuterLabel.Warning"),
    TextFieldClearSOuterLabelError("TextFieldClear.S.OuterLabel.Error"),
    TextFieldClearSOuterLabelEdited("TextFieldClear.S.OuterLabel.Edited"),
    TextFieldClearSOuterLabelRequiredEndDefault("TextFieldClear.S.OuterLabel.RequiredEnd.Default"),
    TextFieldClearSOuterLabelRequiredEndSuccess("TextFieldClear.S.OuterLabel.RequiredEnd.Success"),
    TextFieldClearSOuterLabelRequiredEndWarning("TextFieldClear.S.OuterLabel.RequiredEnd.Warning"),
    TextFieldClearSOuterLabelRequiredEndError("TextFieldClear.S.OuterLabel.RequiredEnd.Error"),
    TextFieldClearSOuterLabelRequiredEndEdited("TextFieldClear.S.OuterLabel.RequiredEnd.Edited"),
    TextFieldClearSInnerLabelDefault("TextFieldClear.S.InnerLabel.Default"),
    TextFieldClearSInnerLabelSuccess("TextFieldClear.S.InnerLabel.Success"),
    TextFieldClearSInnerLabelWarning("TextFieldClear.S.InnerLabel.Warning"),
    TextFieldClearSInnerLabelError("TextFieldClear.S.InnerLabel.Error"),
    TextFieldClearSInnerLabelEdited("TextFieldClear.S.InnerLabel.Edited"),
    TextFieldClearSInnerLabelRequiredEndDefault("TextFieldClear.S.InnerLabel.RequiredEnd.Default"),
    TextFieldClearSInnerLabelRequiredEndSuccess("TextFieldClear.S.InnerLabel.RequiredEnd.Success"),
    TextFieldClearSInnerLabelRequiredEndWarning("TextFieldClear.S.InnerLabel.RequiredEnd.Warning"),
    TextFieldClearSInnerLabelRequiredEndError("TextFieldClear.S.InnerLabel.RequiredEnd.Error"),
    TextFieldClearSInnerLabelRequiredEndEdited("TextFieldClear.S.InnerLabel.RequiredEnd.Edited"),
    ;

    /**
     * Typed API для подбора стиля text-field
     */
    public object Default

    /**
     * Typed API для подбора стиля text-field-clear
     */
    public object Clear
}

/**
 * Возможные значения свойства size для text-field
 */
public enum class TextFieldDefaultSize {
    Xs,
    S,
}

/**
 * Возможные значения свойства required-placement для text-field
 */
public enum class TextFieldDefaultRequiredPlacement {
    None,
    End,
}

/**
 * Возможные значения свойства label-placement для text-field
 */
public enum class TextFieldDefaultLabelPlacement {
    None,
    Outer,
    Inner,
}

/**
 * Возможные значения свойства view для text-field
 */
public enum class TextFieldDefaultView {
    Default,
    Success,
    Warning,
    Error,
    Edited,
}

/**
 * Возможные значения свойства size для text-field-clear
 */
public enum class TextFieldClearSize {
    Xs,
    S,
}

/**
 * Возможные значения свойства required-placement для text-field-clear
 */
public enum class TextFieldClearRequiredPlacement {
    None,
    End,
}

/**
 * Возможные значения свойства label-placement для text-field-clear
 */
public enum class TextFieldClearLabelPlacement {
    None,
    Outer,
    Inner,
}

/**
 * Возможные значения свойства view для text-field-clear
 */
public enum class TextFieldClearView {
    Default,
    Success,
    Warning,
    Error,
    Edited,
}

/**
 * Возвращает [TextFieldStyle] для [TextFieldStyles]
 */
@Composable
public fun TextFieldStyles.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextFieldStyles.TextFieldXsDefault -> TextField.Xs.Default
        TextFieldStyles.TextFieldXsSuccess -> TextField.Xs.Success
        TextFieldStyles.TextFieldXsWarning -> TextField.Xs.Warning
        TextFieldStyles.TextFieldXsError -> TextField.Xs.Error
        TextFieldStyles.TextFieldXsEdited -> TextField.Xs.Edited
        TextFieldStyles.TextFieldXsRequiredEndDefault -> TextField.Xs.RequiredEnd.Default
        TextFieldStyles.TextFieldXsRequiredEndSuccess -> TextField.Xs.RequiredEnd.Success
        TextFieldStyles.TextFieldXsRequiredEndWarning -> TextField.Xs.RequiredEnd.Warning
        TextFieldStyles.TextFieldXsRequiredEndError -> TextField.Xs.RequiredEnd.Error
        TextFieldStyles.TextFieldXsRequiredEndEdited -> TextField.Xs.RequiredEnd.Edited
        TextFieldStyles.TextFieldXsOuterLabelDefault -> TextField.Xs.OuterLabel.Default
        TextFieldStyles.TextFieldXsOuterLabelSuccess -> TextField.Xs.OuterLabel.Success
        TextFieldStyles.TextFieldXsOuterLabelWarning -> TextField.Xs.OuterLabel.Warning
        TextFieldStyles.TextFieldXsOuterLabelError -> TextField.Xs.OuterLabel.Error
        TextFieldStyles.TextFieldXsOuterLabelEdited -> TextField.Xs.OuterLabel.Edited
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndDefault ->
            TextField.Xs.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndSuccess ->
            TextField.Xs.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndWarning ->
            TextField.Xs.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndError ->
            TextField.Xs.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndEdited ->
            TextField.Xs.OuterLabel.RequiredEnd.Edited
        TextFieldStyles.TextFieldSDefault -> TextField.S.Default
        TextFieldStyles.TextFieldSSuccess -> TextField.S.Success
        TextFieldStyles.TextFieldSWarning -> TextField.S.Warning
        TextFieldStyles.TextFieldSError -> TextField.S.Error
        TextFieldStyles.TextFieldSEdited -> TextField.S.Edited
        TextFieldStyles.TextFieldSRequiredEndDefault -> TextField.S.RequiredEnd.Default
        TextFieldStyles.TextFieldSRequiredEndSuccess -> TextField.S.RequiredEnd.Success
        TextFieldStyles.TextFieldSRequiredEndWarning -> TextField.S.RequiredEnd.Warning
        TextFieldStyles.TextFieldSRequiredEndError -> TextField.S.RequiredEnd.Error
        TextFieldStyles.TextFieldSRequiredEndEdited -> TextField.S.RequiredEnd.Edited
        TextFieldStyles.TextFieldSOuterLabelDefault -> TextField.S.OuterLabel.Default
        TextFieldStyles.TextFieldSOuterLabelSuccess -> TextField.S.OuterLabel.Success
        TextFieldStyles.TextFieldSOuterLabelWarning -> TextField.S.OuterLabel.Warning
        TextFieldStyles.TextFieldSOuterLabelError -> TextField.S.OuterLabel.Error
        TextFieldStyles.TextFieldSOuterLabelEdited -> TextField.S.OuterLabel.Edited
        TextFieldStyles.TextFieldSOuterLabelRequiredEndDefault ->
            TextField.S.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldSOuterLabelRequiredEndSuccess ->
            TextField.S.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldSOuterLabelRequiredEndWarning ->
            TextField.S.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldSOuterLabelRequiredEndError ->
            TextField.S.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldSOuterLabelRequiredEndEdited ->
            TextField.S.OuterLabel.RequiredEnd.Edited
        TextFieldStyles.TextFieldSInnerLabelDefault -> TextField.S.InnerLabel.Default
        TextFieldStyles.TextFieldSInnerLabelSuccess -> TextField.S.InnerLabel.Success
        TextFieldStyles.TextFieldSInnerLabelWarning -> TextField.S.InnerLabel.Warning
        TextFieldStyles.TextFieldSInnerLabelError -> TextField.S.InnerLabel.Error
        TextFieldStyles.TextFieldSInnerLabelEdited -> TextField.S.InnerLabel.Edited
        TextFieldStyles.TextFieldSInnerLabelRequiredEndDefault ->
            TextField.S.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldSInnerLabelRequiredEndSuccess ->
            TextField.S.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldSInnerLabelRequiredEndWarning ->
            TextField.S.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldSInnerLabelRequiredEndError ->
            TextField.S.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldSInnerLabelRequiredEndEdited ->
            TextField.S.InnerLabel.RequiredEnd.Edited
        TextFieldStyles.TextFieldClearXsDefault -> TextFieldClear.Xs.Default
        TextFieldStyles.TextFieldClearXsSuccess -> TextFieldClear.Xs.Success
        TextFieldStyles.TextFieldClearXsWarning -> TextFieldClear.Xs.Warning
        TextFieldStyles.TextFieldClearXsError -> TextFieldClear.Xs.Error
        TextFieldStyles.TextFieldClearXsEdited -> TextFieldClear.Xs.Edited
        TextFieldStyles.TextFieldClearXsRequiredEndDefault -> TextFieldClear.Xs.RequiredEnd.Default
        TextFieldStyles.TextFieldClearXsRequiredEndSuccess -> TextFieldClear.Xs.RequiredEnd.Success
        TextFieldStyles.TextFieldClearXsRequiredEndWarning -> TextFieldClear.Xs.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearXsRequiredEndError -> TextFieldClear.Xs.RequiredEnd.Error
        TextFieldStyles.TextFieldClearXsRequiredEndEdited -> TextFieldClear.Xs.RequiredEnd.Edited
        TextFieldStyles.TextFieldClearXsOuterLabelDefault -> TextFieldClear.Xs.OuterLabel.Default
        TextFieldStyles.TextFieldClearXsOuterLabelSuccess -> TextFieldClear.Xs.OuterLabel.Success
        TextFieldStyles.TextFieldClearXsOuterLabelWarning -> TextFieldClear.Xs.OuterLabel.Warning
        TextFieldStyles.TextFieldClearXsOuterLabelError -> TextFieldClear.Xs.OuterLabel.Error
        TextFieldStyles.TextFieldClearXsOuterLabelEdited -> TextFieldClear.Xs.OuterLabel.Edited
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndDefault ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndSuccess ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndWarning ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndError ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndEdited ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Edited
        TextFieldStyles.TextFieldClearSDefault -> TextFieldClear.S.Default
        TextFieldStyles.TextFieldClearSSuccess -> TextFieldClear.S.Success
        TextFieldStyles.TextFieldClearSWarning -> TextFieldClear.S.Warning
        TextFieldStyles.TextFieldClearSError -> TextFieldClear.S.Error
        TextFieldStyles.TextFieldClearSEdited -> TextFieldClear.S.Edited
        TextFieldStyles.TextFieldClearSRequiredEndDefault -> TextFieldClear.S.RequiredEnd.Default
        TextFieldStyles.TextFieldClearSRequiredEndSuccess -> TextFieldClear.S.RequiredEnd.Success
        TextFieldStyles.TextFieldClearSRequiredEndWarning -> TextFieldClear.S.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearSRequiredEndError -> TextFieldClear.S.RequiredEnd.Error
        TextFieldStyles.TextFieldClearSRequiredEndEdited -> TextFieldClear.S.RequiredEnd.Edited
        TextFieldStyles.TextFieldClearSOuterLabelDefault -> TextFieldClear.S.OuterLabel.Default
        TextFieldStyles.TextFieldClearSOuterLabelSuccess -> TextFieldClear.S.OuterLabel.Success
        TextFieldStyles.TextFieldClearSOuterLabelWarning -> TextFieldClear.S.OuterLabel.Warning
        TextFieldStyles.TextFieldClearSOuterLabelError -> TextFieldClear.S.OuterLabel.Error
        TextFieldStyles.TextFieldClearSOuterLabelEdited -> TextFieldClear.S.OuterLabel.Edited
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndDefault ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndSuccess ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndWarning ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndError ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndEdited ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Edited
        TextFieldStyles.TextFieldClearSInnerLabelDefault -> TextFieldClear.S.InnerLabel.Default
        TextFieldStyles.TextFieldClearSInnerLabelSuccess -> TextFieldClear.S.InnerLabel.Success
        TextFieldStyles.TextFieldClearSInnerLabelWarning -> TextFieldClear.S.InnerLabel.Warning
        TextFieldStyles.TextFieldClearSInnerLabelError -> TextFieldClear.S.InnerLabel.Error
        TextFieldStyles.TextFieldClearSInnerLabelEdited -> TextFieldClear.S.InnerLabel.Edited
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndDefault ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndSuccess ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndWarning ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndError ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndEdited ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Edited
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field
 */
public fun TextFieldStyles.Default.resolve(
    size: TextFieldDefaultSize = TextFieldDefaultSize.S,
    requiredPlacement: TextFieldDefaultRequiredPlacement = TextFieldDefaultRequiredPlacement.None,
    labelPlacement: TextFieldDefaultLabelPlacement = TextFieldDefaultLabelPlacement.None,
    view: TextFieldDefaultView = TextFieldDefaultView.Default,
): TextFieldStyles = when {
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsDefault
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXsSuccess
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXsWarning
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsError
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldXsEdited
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsRequiredEndDefault
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXsRequiredEndSuccess
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXsRequiredEndWarning
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsRequiredEndError
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldXsRequiredEndEdited
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsOuterLabelDefault
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXsOuterLabelSuccess
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXsOuterLabelWarning
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsOuterLabelError
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldXsOuterLabelEdited
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsOuterLabelRequiredEndDefault
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXsOuterLabelRequiredEndSuccess
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXsOuterLabelRequiredEndWarning
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsOuterLabelRequiredEndError
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldXsOuterLabelRequiredEndEdited
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSError
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldSEdited
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSRequiredEndDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSRequiredEndSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSRequiredEndWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSRequiredEndError
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldSRequiredEndEdited
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSOuterLabelDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSOuterLabelSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSOuterLabelWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSOuterLabelError
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldSOuterLabelEdited
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSOuterLabelRequiredEndDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSOuterLabelRequiredEndSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSOuterLabelRequiredEndWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSOuterLabelRequiredEndError
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldSOuterLabelRequiredEndEdited
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSInnerLabelDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSInnerLabelSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSInnerLabelWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSInnerLabelError
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldSInnerLabelEdited
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSInnerLabelRequiredEndDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSInnerLabelRequiredEndSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSInnerLabelRequiredEndWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSInnerLabelRequiredEndError
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Edited -> TextFieldStyles.TextFieldSInnerLabelRequiredEndEdited
    else -> error("Unsupported text-field style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field
 */
@Composable
public fun TextFieldStyles.Default.style(
    size: TextFieldDefaultSize = TextFieldDefaultSize.S,
    requiredPlacement: TextFieldDefaultRequiredPlacement = TextFieldDefaultRequiredPlacement.None,
    labelPlacement: TextFieldDefaultLabelPlacement = TextFieldDefaultLabelPlacement.None,
    view: TextFieldDefaultView = TextFieldDefaultView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, requiredPlacement, labelPlacement, view).style(modify)

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field-clear
 */
public fun TextFieldStyles.Clear.resolve(
    size: TextFieldClearSize = TextFieldClearSize.Xs,
    requiredPlacement: TextFieldClearRequiredPlacement = TextFieldClearRequiredPlacement.None,
    labelPlacement: TextFieldClearLabelPlacement = TextFieldClearLabelPlacement.None,
    view: TextFieldClearView = TextFieldClearView.Default,
): TextFieldStyles = when {
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearXsDefault
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearXsSuccess
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearXsWarning
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXsError
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearXsEdited
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearXsRequiredEndDefault
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearXsRequiredEndSuccess
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearXsRequiredEndWarning
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXsRequiredEndError
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearXsRequiredEndEdited
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXsOuterLabelDefault
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXsOuterLabelSuccess
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXsOuterLabelWarning
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXsOuterLabelError
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearXsOuterLabelEdited
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndDefault
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndSuccess
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndWarning
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndError
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndEdited
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearSDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearSSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearSWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSError
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearSEdited
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearSRequiredEndDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearSRequiredEndSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearSRequiredEndWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSRequiredEndError
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearSRequiredEndEdited
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSOuterLabelDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearSOuterLabelSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearSOuterLabelWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSOuterLabelError
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearSOuterLabelEdited
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSOuterLabelRequiredEndDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearSOuterLabelRequiredEndSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearSOuterLabelRequiredEndWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndError
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndEdited
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSInnerLabelDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearSInnerLabelSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearSInnerLabelWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSInnerLabelError
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearSInnerLabelEdited
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSInnerLabelRequiredEndDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearSInnerLabelRequiredEndSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearSInnerLabelRequiredEndWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndError
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Edited ->
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndEdited
    else -> error("Unsupported text-field-clear style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field-clear
 */
@Composable
public fun TextFieldStyles.Clear.style(
    size: TextFieldClearSize = TextFieldClearSize.Xs,
    requiredPlacement: TextFieldClearRequiredPlacement = TextFieldClearRequiredPlacement.None,
    labelPlacement: TextFieldClearLabelPlacement = TextFieldClearLabelPlacement.None,
    view: TextFieldClearView = TextFieldClearView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, requiredPlacement, labelPlacement, view).style(modify)
