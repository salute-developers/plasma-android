// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.textarea

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TextArea
 */
public enum class TextAreaStyles(
    public val key: String,
) {
    TextAreaXsDefault("TextArea.Xs.Default"),
    TextAreaXsError("TextArea.Xs.Error"),
    TextAreaXsOuterLabelDefault("TextArea.Xs.OuterLabel.Default"),
    TextAreaXsOuterLabelError("TextArea.Xs.OuterLabel.Error"),
    TextAreaSDefault("TextArea.S.Default"),
    TextAreaSError("TextArea.S.Error"),
    TextAreaSOuterLabelDefault("TextArea.S.OuterLabel.Default"),
    TextAreaSOuterLabelError("TextArea.S.OuterLabel.Error"),
    TextAreaSInnerLabelDefault("TextArea.S.InnerLabel.Default"),
    TextAreaSInnerLabelError("TextArea.S.InnerLabel.Error"),
    TextAreaMDefault("TextArea.M.Default"),
    TextAreaMError("TextArea.M.Error"),
    TextAreaMOuterLabelDefault("TextArea.M.OuterLabel.Default"),
    TextAreaMOuterLabelError("TextArea.M.OuterLabel.Error"),
    TextAreaMInnerLabelDefault("TextArea.M.InnerLabel.Default"),
    TextAreaMInnerLabelError("TextArea.M.InnerLabel.Error"),
    TextAreaClearXsDefault("TextAreaClear.Xs.Default"),
    TextAreaClearXsError("TextAreaClear.Xs.Error"),
    TextAreaClearXsOuterLabelDefault("TextAreaClear.Xs.OuterLabel.Default"),
    TextAreaClearXsOuterLabelError("TextAreaClear.Xs.OuterLabel.Error"),
    TextAreaClearSDefault("TextAreaClear.S.Default"),
    TextAreaClearSError("TextAreaClear.S.Error"),
    TextAreaClearSOuterLabelDefault("TextAreaClear.S.OuterLabel.Default"),
    TextAreaClearSOuterLabelError("TextAreaClear.S.OuterLabel.Error"),
    TextAreaClearSInnerLabelDefault("TextAreaClear.S.InnerLabel.Default"),
    TextAreaClearSInnerLabelError("TextAreaClear.S.InnerLabel.Error"),
    TextAreaClearMDefault("TextAreaClear.M.Default"),
    TextAreaClearMError("TextAreaClear.M.Error"),
    TextAreaClearMOuterLabelDefault("TextAreaClear.M.OuterLabel.Default"),
    TextAreaClearMOuterLabelError("TextAreaClear.M.OuterLabel.Error"),
    TextAreaClearMInnerLabelDefault("TextAreaClear.M.InnerLabel.Default"),
    TextAreaClearMInnerLabelError("TextAreaClear.M.InnerLabel.Error"),
    TextAreaClearLDefault("TextAreaClear.L.Default"),
    TextAreaClearLError("TextAreaClear.L.Error"),
    TextAreaClearLOuterLabelDefault("TextAreaClear.L.OuterLabel.Default"),
    TextAreaClearLOuterLabelError("TextAreaClear.L.OuterLabel.Error"),
    TextAreaClearLInnerLabelDefault("TextAreaClear.L.InnerLabel.Default"),
    TextAreaClearLInnerLabelError("TextAreaClear.L.InnerLabel.Error"),
    ;

    /**
     * Typed API для подбора стиля text-area
     */
    public object Default

    /**
     * Typed API для подбора стиля text-area-clear
     */
    public object Clear
}

/**
 * Возможные значения свойства size для text-area
 */
public enum class TextAreaDefaultSize {
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства label-placement для text-area
 */
public enum class TextAreaDefaultLabelPlacement {
    None,
    Outer,
    Inner,
}

/**
 * Возможные значения свойства view для text-area
 */
public enum class TextAreaDefaultView {
    Default,
    Error,
}

/**
 * Возможные значения свойства size для text-area-clear
 */
public enum class TextAreaClearSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства label-placement для text-area-clear
 */
public enum class TextAreaClearLabelPlacement {
    None,
    Outer,
    Inner,
}

/**
 * Возможные значения свойства view для text-area-clear
 */
public enum class TextAreaClearView {
    Default,
    Error,
}

/**
 * Возвращает [TextFieldStyle] для [TextAreaStyles]
 */
@Composable
public fun TextAreaStyles.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextAreaStyles.TextAreaXsDefault -> TextArea.Xs.Default
        TextAreaStyles.TextAreaXsError -> TextArea.Xs.Error
        TextAreaStyles.TextAreaXsOuterLabelDefault -> TextArea.Xs.OuterLabel.Default
        TextAreaStyles.TextAreaXsOuterLabelError -> TextArea.Xs.OuterLabel.Error
        TextAreaStyles.TextAreaSDefault -> TextArea.S.Default
        TextAreaStyles.TextAreaSError -> TextArea.S.Error
        TextAreaStyles.TextAreaSOuterLabelDefault -> TextArea.S.OuterLabel.Default
        TextAreaStyles.TextAreaSOuterLabelError -> TextArea.S.OuterLabel.Error
        TextAreaStyles.TextAreaSInnerLabelDefault -> TextArea.S.InnerLabel.Default
        TextAreaStyles.TextAreaSInnerLabelError -> TextArea.S.InnerLabel.Error
        TextAreaStyles.TextAreaMDefault -> TextArea.M.Default
        TextAreaStyles.TextAreaMError -> TextArea.M.Error
        TextAreaStyles.TextAreaMOuterLabelDefault -> TextArea.M.OuterLabel.Default
        TextAreaStyles.TextAreaMOuterLabelError -> TextArea.M.OuterLabel.Error
        TextAreaStyles.TextAreaMInnerLabelDefault -> TextArea.M.InnerLabel.Default
        TextAreaStyles.TextAreaMInnerLabelError -> TextArea.M.InnerLabel.Error
        TextAreaStyles.TextAreaClearXsDefault -> TextAreaClear.Xs.Default
        TextAreaStyles.TextAreaClearXsError -> TextAreaClear.Xs.Error
        TextAreaStyles.TextAreaClearXsOuterLabelDefault -> TextAreaClear.Xs.OuterLabel.Default
        TextAreaStyles.TextAreaClearXsOuterLabelError -> TextAreaClear.Xs.OuterLabel.Error
        TextAreaStyles.TextAreaClearSDefault -> TextAreaClear.S.Default
        TextAreaStyles.TextAreaClearSError -> TextAreaClear.S.Error
        TextAreaStyles.TextAreaClearSOuterLabelDefault -> TextAreaClear.S.OuterLabel.Default
        TextAreaStyles.TextAreaClearSOuterLabelError -> TextAreaClear.S.OuterLabel.Error
        TextAreaStyles.TextAreaClearSInnerLabelDefault -> TextAreaClear.S.InnerLabel.Default
        TextAreaStyles.TextAreaClearSInnerLabelError -> TextAreaClear.S.InnerLabel.Error
        TextAreaStyles.TextAreaClearMDefault -> TextAreaClear.M.Default
        TextAreaStyles.TextAreaClearMError -> TextAreaClear.M.Error
        TextAreaStyles.TextAreaClearMOuterLabelDefault -> TextAreaClear.M.OuterLabel.Default
        TextAreaStyles.TextAreaClearMOuterLabelError -> TextAreaClear.M.OuterLabel.Error
        TextAreaStyles.TextAreaClearMInnerLabelDefault -> TextAreaClear.M.InnerLabel.Default
        TextAreaStyles.TextAreaClearMInnerLabelError -> TextAreaClear.M.InnerLabel.Error
        TextAreaStyles.TextAreaClearLDefault -> TextAreaClear.L.Default
        TextAreaStyles.TextAreaClearLError -> TextAreaClear.L.Error
        TextAreaStyles.TextAreaClearLOuterLabelDefault -> TextAreaClear.L.OuterLabel.Default
        TextAreaStyles.TextAreaClearLOuterLabelError -> TextAreaClear.L.OuterLabel.Error
        TextAreaStyles.TextAreaClearLInnerLabelDefault -> TextAreaClear.L.InnerLabel.Default
        TextAreaStyles.TextAreaClearLInnerLabelError -> TextAreaClear.L.InnerLabel.Error
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextAreaStyles] для text-area
 */
public fun TextAreaStyles.Default.resolve(
    size: TextAreaDefaultSize = TextAreaDefaultSize.M,
    labelPlacement: TextAreaDefaultLabelPlacement = TextAreaDefaultLabelPlacement.None,
    view: TextAreaDefaultView = TextAreaDefaultView.Default,
): TextAreaStyles = when {
    size == TextAreaDefaultSize.Xs && labelPlacement == TextAreaDefaultLabelPlacement.None && view
        == TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsDefault
    size == TextAreaDefaultSize.Xs && labelPlacement == TextAreaDefaultLabelPlacement.None && view
        == TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXsError
    size == TextAreaDefaultSize.Xs && labelPlacement == TextAreaDefaultLabelPlacement.Outer && view
        == TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsOuterLabelDefault
    size == TextAreaDefaultSize.Xs && labelPlacement == TextAreaDefaultLabelPlacement.Outer && view
        == TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXsOuterLabelError
    size == TextAreaDefaultSize.S && labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSDefault
    size == TextAreaDefaultSize.S && labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSError
    size == TextAreaDefaultSize.S && labelPlacement == TextAreaDefaultLabelPlacement.Outer && view
        == TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSOuterLabelDefault
    size == TextAreaDefaultSize.S && labelPlacement == TextAreaDefaultLabelPlacement.Outer && view
        == TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSOuterLabelError
    size == TextAreaDefaultSize.S && labelPlacement == TextAreaDefaultLabelPlacement.Inner && view
        == TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSInnerLabelDefault
    size == TextAreaDefaultSize.S && labelPlacement == TextAreaDefaultLabelPlacement.Inner && view
        == TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSInnerLabelError
    size == TextAreaDefaultSize.M && labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMDefault
    size == TextAreaDefaultSize.M && labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMError
    size == TextAreaDefaultSize.M && labelPlacement == TextAreaDefaultLabelPlacement.Outer && view
        == TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMOuterLabelDefault
    size == TextAreaDefaultSize.M && labelPlacement == TextAreaDefaultLabelPlacement.Outer && view
        == TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMOuterLabelError
    size == TextAreaDefaultSize.M && labelPlacement == TextAreaDefaultLabelPlacement.Inner && view
        == TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMInnerLabelDefault
    size == TextAreaDefaultSize.M && labelPlacement == TextAreaDefaultLabelPlacement.Inner && view
        == TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMInnerLabelError
    else -> error("Unsupported text-area style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-area
 */
@Composable
public fun TextAreaStyles.Default.style(
    size: TextAreaDefaultSize = TextAreaDefaultSize.M,
    labelPlacement: TextAreaDefaultLabelPlacement = TextAreaDefaultLabelPlacement.None,
    view: TextAreaDefaultView = TextAreaDefaultView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, labelPlacement, view).style(modify)

/**
 * Возвращает экземпляр [TextAreaStyles] для text-area-clear
 */
public fun TextAreaStyles.Clear.resolve(
    size: TextAreaClearSize = TextAreaClearSize.L,
    labelPlacement: TextAreaClearLabelPlacement = TextAreaClearLabelPlacement.None,
    view: TextAreaClearView = TextAreaClearView.Default,
): TextAreaStyles = when {
    size == TextAreaClearSize.Xs && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearXsDefault
    size == TextAreaClearSize.Xs && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearXsError
    size == TextAreaClearSize.Xs && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearXsOuterLabelDefault
    size == TextAreaClearSize.Xs && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearXsOuterLabelError
    size == TextAreaClearSize.S && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearSDefault
    size == TextAreaClearSize.S && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearSError
    size == TextAreaClearSize.S && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearSOuterLabelDefault
    size == TextAreaClearSize.S && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearSOuterLabelError
    size == TextAreaClearSize.S && labelPlacement == TextAreaClearLabelPlacement.Inner && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearSInnerLabelDefault
    size == TextAreaClearSize.S && labelPlacement == TextAreaClearLabelPlacement.Inner && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearSInnerLabelError
    size == TextAreaClearSize.M && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearMDefault
    size == TextAreaClearSize.M && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearMError
    size == TextAreaClearSize.M && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearMOuterLabelDefault
    size == TextAreaClearSize.M && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearMOuterLabelError
    size == TextAreaClearSize.M && labelPlacement == TextAreaClearLabelPlacement.Inner && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearMInnerLabelDefault
    size == TextAreaClearSize.M && labelPlacement == TextAreaClearLabelPlacement.Inner && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearMInnerLabelError
    size == TextAreaClearSize.L && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearLDefault
    size == TextAreaClearSize.L && labelPlacement == TextAreaClearLabelPlacement.None && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearLError
    size == TextAreaClearSize.L && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearLOuterLabelDefault
    size == TextAreaClearSize.L && labelPlacement == TextAreaClearLabelPlacement.Outer && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearLOuterLabelError
    size == TextAreaClearSize.L && labelPlacement == TextAreaClearLabelPlacement.Inner && view ==
        TextAreaClearView.Default -> TextAreaStyles.TextAreaClearLInnerLabelDefault
    size == TextAreaClearSize.L && labelPlacement == TextAreaClearLabelPlacement.Inner && view ==
        TextAreaClearView.Error -> TextAreaStyles.TextAreaClearLInnerLabelError
    else -> error("Unsupported text-area-clear style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-area-clear
 */
@Composable
public fun TextAreaStyles.Clear.style(
    size: TextAreaClearSize = TextAreaClearSize.L,
    labelPlacement: TextAreaClearLabelPlacement = TextAreaClearLabelPlacement.None,
    view: TextAreaClearView = TextAreaClearView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, labelPlacement, view).style(modify)
