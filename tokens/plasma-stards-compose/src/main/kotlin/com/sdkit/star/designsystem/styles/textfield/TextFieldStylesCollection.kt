// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.textfield

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
    TextFieldXsError("TextField.Xs.Error"),
    TextFieldXsOuterLabelDefault("TextField.Xs.OuterLabel.Default"),
    TextFieldXsOuterLabelError("TextField.Xs.OuterLabel.Error"),
    TextFieldSDefault("TextField.S.Default"),
    TextFieldSError("TextField.S.Error"),
    TextFieldSOuterLabelDefault("TextField.S.OuterLabel.Default"),
    TextFieldSOuterLabelError("TextField.S.OuterLabel.Error"),
    TextFieldSInnerLabelDefault("TextField.S.InnerLabel.Default"),
    TextFieldSInnerLabelError("TextField.S.InnerLabel.Error"),
    TextFieldMDefault("TextField.M.Default"),
    TextFieldMError("TextField.M.Error"),
    TextFieldMOuterLabelDefault("TextField.M.OuterLabel.Default"),
    TextFieldMOuterLabelError("TextField.M.OuterLabel.Error"),
    TextFieldMInnerLabelDefault("TextField.M.InnerLabel.Default"),
    TextFieldMInnerLabelError("TextField.M.InnerLabel.Error"),
    TextFieldClearXsDefault("TextFieldClear.Xs.Default"),
    TextFieldClearXsError("TextFieldClear.Xs.Error"),
    TextFieldClearXsOuterLabelDefault("TextFieldClear.Xs.OuterLabel.Default"),
    TextFieldClearXsOuterLabelError("TextFieldClear.Xs.OuterLabel.Error"),
    TextFieldClearSDefault("TextFieldClear.S.Default"),
    TextFieldClearSError("TextFieldClear.S.Error"),
    TextFieldClearSOuterLabelDefault("TextFieldClear.S.OuterLabel.Default"),
    TextFieldClearSOuterLabelError("TextFieldClear.S.OuterLabel.Error"),
    TextFieldClearSInnerLabelDefault("TextFieldClear.S.InnerLabel.Default"),
    TextFieldClearSInnerLabelError("TextFieldClear.S.InnerLabel.Error"),
    TextFieldClearMDefault("TextFieldClear.M.Default"),
    TextFieldClearMError("TextFieldClear.M.Error"),
    TextFieldClearMOuterLabelDefault("TextFieldClear.M.OuterLabel.Default"),
    TextFieldClearMOuterLabelError("TextFieldClear.M.OuterLabel.Error"),
    TextFieldClearMInnerLabelDefault("TextFieldClear.M.InnerLabel.Default"),
    TextFieldClearMInnerLabelError("TextFieldClear.M.InnerLabel.Error"),
    TextFieldClearLDefault("TextFieldClear.L.Default"),
    TextFieldClearLError("TextFieldClear.L.Error"),
    TextFieldClearLOuterLabelDefault("TextFieldClear.L.OuterLabel.Default"),
    TextFieldClearLOuterLabelError("TextFieldClear.L.OuterLabel.Error"),
    TextFieldClearLInnerLabelDefault("TextFieldClear.L.InnerLabel.Default"),
    TextFieldClearLInnerLabelError("TextFieldClear.L.InnerLabel.Error"),
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
    M,
    S,
    Xs,
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
    Error,
}

/**
 * Возможные значения свойства size для text-field-clear
 */
public enum class TextFieldClearSize {
    L,
    M,
    S,
    Xs,
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
    Error,
}

/**
 * Возвращает [TextFieldStyle] для [TextFieldStyles]
 */
@Composable
public fun TextFieldStyles.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextFieldStyles.TextFieldXsDefault -> TextField.Xs.Default
        TextFieldStyles.TextFieldXsError -> TextField.Xs.Error
        TextFieldStyles.TextFieldXsOuterLabelDefault -> TextField.Xs.OuterLabel.Default
        TextFieldStyles.TextFieldXsOuterLabelError -> TextField.Xs.OuterLabel.Error
        TextFieldStyles.TextFieldSDefault -> TextField.S.Default
        TextFieldStyles.TextFieldSError -> TextField.S.Error
        TextFieldStyles.TextFieldSOuterLabelDefault -> TextField.S.OuterLabel.Default
        TextFieldStyles.TextFieldSOuterLabelError -> TextField.S.OuterLabel.Error
        TextFieldStyles.TextFieldSInnerLabelDefault -> TextField.S.InnerLabel.Default
        TextFieldStyles.TextFieldSInnerLabelError -> TextField.S.InnerLabel.Error
        TextFieldStyles.TextFieldMDefault -> TextField.M.Default
        TextFieldStyles.TextFieldMError -> TextField.M.Error
        TextFieldStyles.TextFieldMOuterLabelDefault -> TextField.M.OuterLabel.Default
        TextFieldStyles.TextFieldMOuterLabelError -> TextField.M.OuterLabel.Error
        TextFieldStyles.TextFieldMInnerLabelDefault -> TextField.M.InnerLabel.Default
        TextFieldStyles.TextFieldMInnerLabelError -> TextField.M.InnerLabel.Error
        TextFieldStyles.TextFieldClearXsDefault -> TextFieldClear.Xs.Default
        TextFieldStyles.TextFieldClearXsError -> TextFieldClear.Xs.Error
        TextFieldStyles.TextFieldClearXsOuterLabelDefault -> TextFieldClear.Xs.OuterLabel.Default
        TextFieldStyles.TextFieldClearXsOuterLabelError -> TextFieldClear.Xs.OuterLabel.Error
        TextFieldStyles.TextFieldClearSDefault -> TextFieldClear.S.Default
        TextFieldStyles.TextFieldClearSError -> TextFieldClear.S.Error
        TextFieldStyles.TextFieldClearSOuterLabelDefault -> TextFieldClear.S.OuterLabel.Default
        TextFieldStyles.TextFieldClearSOuterLabelError -> TextFieldClear.S.OuterLabel.Error
        TextFieldStyles.TextFieldClearSInnerLabelDefault -> TextFieldClear.S.InnerLabel.Default
        TextFieldStyles.TextFieldClearSInnerLabelError -> TextFieldClear.S.InnerLabel.Error
        TextFieldStyles.TextFieldClearMDefault -> TextFieldClear.M.Default
        TextFieldStyles.TextFieldClearMError -> TextFieldClear.M.Error
        TextFieldStyles.TextFieldClearMOuterLabelDefault -> TextFieldClear.M.OuterLabel.Default
        TextFieldStyles.TextFieldClearMOuterLabelError -> TextFieldClear.M.OuterLabel.Error
        TextFieldStyles.TextFieldClearMInnerLabelDefault -> TextFieldClear.M.InnerLabel.Default
        TextFieldStyles.TextFieldClearMInnerLabelError -> TextFieldClear.M.InnerLabel.Error
        TextFieldStyles.TextFieldClearLDefault -> TextFieldClear.L.Default
        TextFieldStyles.TextFieldClearLError -> TextFieldClear.L.Error
        TextFieldStyles.TextFieldClearLOuterLabelDefault -> TextFieldClear.L.OuterLabel.Default
        TextFieldStyles.TextFieldClearLOuterLabelError -> TextFieldClear.L.OuterLabel.Error
        TextFieldStyles.TextFieldClearLInnerLabelDefault -> TextFieldClear.L.InnerLabel.Default
        TextFieldStyles.TextFieldClearLInnerLabelError -> TextFieldClear.L.InnerLabel.Error
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field
 */
public fun TextFieldStyles.Default.resolve(
    size: TextFieldDefaultSize = TextFieldDefaultSize.M,
    labelPlacement: TextFieldDefaultLabelPlacement = TextFieldDefaultLabelPlacement.None,
    view: TextFieldDefaultView = TextFieldDefaultView.Default,
): TextFieldStyles = when {
    size == TextFieldDefaultSize.Xs && labelPlacement == TextFieldDefaultLabelPlacement.None && view
        == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsDefault
    size == TextFieldDefaultSize.Xs && labelPlacement == TextFieldDefaultLabelPlacement.None && view
        == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsError
    size == TextFieldDefaultSize.Xs && labelPlacement == TextFieldDefaultLabelPlacement.Outer &&
        view == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsOuterLabelDefault
    size == TextFieldDefaultSize.Xs && labelPlacement == TextFieldDefaultLabelPlacement.Outer &&
        view == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsOuterLabelError
    size == TextFieldDefaultSize.S && labelPlacement == TextFieldDefaultLabelPlacement.None && view
        == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSDefault
    size == TextFieldDefaultSize.S && labelPlacement == TextFieldDefaultLabelPlacement.None && view
        == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSError
    size == TextFieldDefaultSize.S && labelPlacement == TextFieldDefaultLabelPlacement.Outer && view
        == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSOuterLabelDefault
    size == TextFieldDefaultSize.S && labelPlacement == TextFieldDefaultLabelPlacement.Outer && view
        == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSOuterLabelError
    size == TextFieldDefaultSize.S && labelPlacement == TextFieldDefaultLabelPlacement.Inner && view
        == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSInnerLabelDefault
    size == TextFieldDefaultSize.S && labelPlacement == TextFieldDefaultLabelPlacement.Inner && view
        == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSInnerLabelError
    size == TextFieldDefaultSize.M && labelPlacement == TextFieldDefaultLabelPlacement.None && view
        == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMDefault
    size == TextFieldDefaultSize.M && labelPlacement == TextFieldDefaultLabelPlacement.None && view
        == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMError
    size == TextFieldDefaultSize.M && labelPlacement == TextFieldDefaultLabelPlacement.Outer && view
        == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMOuterLabelDefault
    size == TextFieldDefaultSize.M && labelPlacement == TextFieldDefaultLabelPlacement.Outer && view
        == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMOuterLabelError
    size == TextFieldDefaultSize.M && labelPlacement == TextFieldDefaultLabelPlacement.Inner && view
        == TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMInnerLabelDefault
    size == TextFieldDefaultSize.M && labelPlacement == TextFieldDefaultLabelPlacement.Inner && view
        == TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMInnerLabelError
    else -> error("Unsupported text-field style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field
 */
@Composable
public fun TextFieldStyles.Default.style(
    size: TextFieldDefaultSize = TextFieldDefaultSize.M,
    labelPlacement: TextFieldDefaultLabelPlacement = TextFieldDefaultLabelPlacement.None,
    view: TextFieldDefaultView = TextFieldDefaultView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, labelPlacement, view).style(modify)

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field-clear
 */
public fun TextFieldStyles.Clear.resolve(
    size: TextFieldClearSize = TextFieldClearSize.L,
    labelPlacement: TextFieldClearLabelPlacement = TextFieldClearLabelPlacement.None,
    view: TextFieldClearView = TextFieldClearView.Default,
): TextFieldStyles = when {
    size == TextFieldClearSize.Xs && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXsDefault
    size == TextFieldClearSize.Xs && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearXsError
    size == TextFieldClearSize.Xs && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXsOuterLabelDefault
    size == TextFieldClearSize.Xs && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearXsOuterLabelError
    size == TextFieldClearSize.S && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSDefault
    size == TextFieldClearSize.S && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearSError
    size == TextFieldClearSize.S && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSOuterLabelDefault
    size == TextFieldClearSize.S && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearSOuterLabelError
    size == TextFieldClearSize.S && labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSInnerLabelDefault
    size == TextFieldClearSize.S && labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearSInnerLabelError
    size == TextFieldClearSize.M && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMDefault
    size == TextFieldClearSize.M && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearMError
    size == TextFieldClearSize.M && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMOuterLabelDefault
    size == TextFieldClearSize.M && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearMOuterLabelError
    size == TextFieldClearSize.M && labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMInnerLabelDefault
    size == TextFieldClearSize.M && labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearMInnerLabelError
    size == TextFieldClearSize.L && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLDefault
    size == TextFieldClearSize.L && labelPlacement == TextFieldClearLabelPlacement.None && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearLError
    size == TextFieldClearSize.L && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLOuterLabelDefault
    size == TextFieldClearSize.L && labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearLOuterLabelError
    size == TextFieldClearSize.L && labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLInnerLabelDefault
    size == TextFieldClearSize.L && labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Error -> TextFieldStyles.TextFieldClearLInnerLabelError
    else -> error("Unsupported text-field-clear style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field-clear
 */
@Composable
public fun TextFieldStyles.Clear.style(
    size: TextFieldClearSize = TextFieldClearSize.L,
    labelPlacement: TextFieldClearLabelPlacement = TextFieldClearLabelPlacement.None,
    view: TextFieldClearView = TextFieldClearView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, labelPlacement, view).style(modify)
