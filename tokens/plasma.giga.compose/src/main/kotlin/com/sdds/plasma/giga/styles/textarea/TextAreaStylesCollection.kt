// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.textarea

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
    TextAreaXsWarning("TextArea.Xs.Warning"),
    TextAreaXsError("TextArea.Xs.Error"),
    TextAreaXsRequiredStartDefault("TextArea.Xs.RequiredStart.Default"),
    TextAreaXsRequiredStartWarning("TextArea.Xs.RequiredStart.Warning"),
    TextAreaXsRequiredStartError("TextArea.Xs.RequiredStart.Error"),
    TextAreaXsRequiredEndDefault("TextArea.Xs.RequiredEnd.Default"),
    TextAreaXsRequiredEndWarning("TextArea.Xs.RequiredEnd.Warning"),
    TextAreaXsRequiredEndError("TextArea.Xs.RequiredEnd.Error"),
    TextAreaXsOuterLabelDefault("TextArea.Xs.OuterLabel.Default"),
    TextAreaXsOuterLabelWarning("TextArea.Xs.OuterLabel.Warning"),
    TextAreaXsOuterLabelError("TextArea.Xs.OuterLabel.Error"),
    TextAreaXsOuterLabelRequiredStartDefault("TextArea.Xs.OuterLabel.RequiredStart.Default"),
    TextAreaXsOuterLabelRequiredStartWarning("TextArea.Xs.OuterLabel.RequiredStart.Warning"),
    TextAreaXsOuterLabelRequiredStartError("TextArea.Xs.OuterLabel.RequiredStart.Error"),
    TextAreaXsOuterLabelRequiredEndDefault("TextArea.Xs.OuterLabel.RequiredEnd.Default"),
    TextAreaXsOuterLabelRequiredEndWarning("TextArea.Xs.OuterLabel.RequiredEnd.Warning"),
    TextAreaXsOuterLabelRequiredEndError("TextArea.Xs.OuterLabel.RequiredEnd.Error"),
    TextAreaSDefault("TextArea.S.Default"),
    TextAreaSWarning("TextArea.S.Warning"),
    TextAreaSError("TextArea.S.Error"),
    TextAreaSRequiredStartDefault("TextArea.S.RequiredStart.Default"),
    TextAreaSRequiredStartWarning("TextArea.S.RequiredStart.Warning"),
    TextAreaSRequiredStartError("TextArea.S.RequiredStart.Error"),
    TextAreaSRequiredEndDefault("TextArea.S.RequiredEnd.Default"),
    TextAreaSRequiredEndWarning("TextArea.S.RequiredEnd.Warning"),
    TextAreaSRequiredEndError("TextArea.S.RequiredEnd.Error"),
    TextAreaSOuterLabelDefault("TextArea.S.OuterLabel.Default"),
    TextAreaSOuterLabelWarning("TextArea.S.OuterLabel.Warning"),
    TextAreaSOuterLabelError("TextArea.S.OuterLabel.Error"),
    TextAreaSOuterLabelRequiredStartDefault("TextArea.S.OuterLabel.RequiredStart.Default"),
    TextAreaSOuterLabelRequiredStartWarning("TextArea.S.OuterLabel.RequiredStart.Warning"),
    TextAreaSOuterLabelRequiredStartError("TextArea.S.OuterLabel.RequiredStart.Error"),
    TextAreaSOuterLabelRequiredEndDefault("TextArea.S.OuterLabel.RequiredEnd.Default"),
    TextAreaSOuterLabelRequiredEndWarning("TextArea.S.OuterLabel.RequiredEnd.Warning"),
    TextAreaSOuterLabelRequiredEndError("TextArea.S.OuterLabel.RequiredEnd.Error"),
    TextAreaSInnerLabelDefault("TextArea.S.InnerLabel.Default"),
    TextAreaSInnerLabelWarning("TextArea.S.InnerLabel.Warning"),
    TextAreaSInnerLabelError("TextArea.S.InnerLabel.Error"),
    TextAreaSInnerLabelRequiredStartDefault("TextArea.S.InnerLabel.RequiredStart.Default"),
    TextAreaSInnerLabelRequiredStartWarning("TextArea.S.InnerLabel.RequiredStart.Warning"),
    TextAreaSInnerLabelRequiredStartError("TextArea.S.InnerLabel.RequiredStart.Error"),
    TextAreaSInnerLabelRequiredEndDefault("TextArea.S.InnerLabel.RequiredEnd.Default"),
    TextAreaSInnerLabelRequiredEndWarning("TextArea.S.InnerLabel.RequiredEnd.Warning"),
    TextAreaSInnerLabelRequiredEndError("TextArea.S.InnerLabel.RequiredEnd.Error"),
    TextAreaMDefault("TextArea.M.Default"),
    TextAreaMWarning("TextArea.M.Warning"),
    TextAreaMError("TextArea.M.Error"),
    TextAreaMRequiredStartDefault("TextArea.M.RequiredStart.Default"),
    TextAreaMRequiredStartWarning("TextArea.M.RequiredStart.Warning"),
    TextAreaMRequiredStartError("TextArea.M.RequiredStart.Error"),
    TextAreaMRequiredEndDefault("TextArea.M.RequiredEnd.Default"),
    TextAreaMRequiredEndWarning("TextArea.M.RequiredEnd.Warning"),
    TextAreaMRequiredEndError("TextArea.M.RequiredEnd.Error"),
    TextAreaMOuterLabelDefault("TextArea.M.OuterLabel.Default"),
    TextAreaMOuterLabelWarning("TextArea.M.OuterLabel.Warning"),
    TextAreaMOuterLabelError("TextArea.M.OuterLabel.Error"),
    TextAreaMOuterLabelRequiredStartDefault("TextArea.M.OuterLabel.RequiredStart.Default"),
    TextAreaMOuterLabelRequiredStartWarning("TextArea.M.OuterLabel.RequiredStart.Warning"),
    TextAreaMOuterLabelRequiredStartError("TextArea.M.OuterLabel.RequiredStart.Error"),
    TextAreaMOuterLabelRequiredEndDefault("TextArea.M.OuterLabel.RequiredEnd.Default"),
    TextAreaMOuterLabelRequiredEndWarning("TextArea.M.OuterLabel.RequiredEnd.Warning"),
    TextAreaMOuterLabelRequiredEndError("TextArea.M.OuterLabel.RequiredEnd.Error"),
    TextAreaMInnerLabelDefault("TextArea.M.InnerLabel.Default"),
    TextAreaMInnerLabelWarning("TextArea.M.InnerLabel.Warning"),
    TextAreaMInnerLabelError("TextArea.M.InnerLabel.Error"),
    TextAreaMInnerLabelRequiredStartDefault("TextArea.M.InnerLabel.RequiredStart.Default"),
    TextAreaMInnerLabelRequiredStartWarning("TextArea.M.InnerLabel.RequiredStart.Warning"),
    TextAreaMInnerLabelRequiredStartError("TextArea.M.InnerLabel.RequiredStart.Error"),
    TextAreaMInnerLabelRequiredEndDefault("TextArea.M.InnerLabel.RequiredEnd.Default"),
    TextAreaMInnerLabelRequiredEndWarning("TextArea.M.InnerLabel.RequiredEnd.Warning"),
    TextAreaMInnerLabelRequiredEndError("TextArea.M.InnerLabel.RequiredEnd.Error"),
    TextAreaLDefault("TextArea.L.Default"),
    TextAreaLWarning("TextArea.L.Warning"),
    TextAreaLError("TextArea.L.Error"),
    TextAreaLRequiredStartDefault("TextArea.L.RequiredStart.Default"),
    TextAreaLRequiredStartWarning("TextArea.L.RequiredStart.Warning"),
    TextAreaLRequiredStartError("TextArea.L.RequiredStart.Error"),
    TextAreaLRequiredEndDefault("TextArea.L.RequiredEnd.Default"),
    TextAreaLRequiredEndWarning("TextArea.L.RequiredEnd.Warning"),
    TextAreaLRequiredEndError("TextArea.L.RequiredEnd.Error"),
    TextAreaLOuterLabelDefault("TextArea.L.OuterLabel.Default"),
    TextAreaLOuterLabelWarning("TextArea.L.OuterLabel.Warning"),
    TextAreaLOuterLabelError("TextArea.L.OuterLabel.Error"),
    TextAreaLOuterLabelRequiredStartDefault("TextArea.L.OuterLabel.RequiredStart.Default"),
    TextAreaLOuterLabelRequiredStartWarning("TextArea.L.OuterLabel.RequiredStart.Warning"),
    TextAreaLOuterLabelRequiredStartError("TextArea.L.OuterLabel.RequiredStart.Error"),
    TextAreaLOuterLabelRequiredEndDefault("TextArea.L.OuterLabel.RequiredEnd.Default"),
    TextAreaLOuterLabelRequiredEndWarning("TextArea.L.OuterLabel.RequiredEnd.Warning"),
    TextAreaLOuterLabelRequiredEndError("TextArea.L.OuterLabel.RequiredEnd.Error"),
    TextAreaLInnerLabelDefault("TextArea.L.InnerLabel.Default"),
    TextAreaLInnerLabelWarning("TextArea.L.InnerLabel.Warning"),
    TextAreaLInnerLabelError("TextArea.L.InnerLabel.Error"),
    TextAreaLInnerLabelRequiredStartDefault("TextArea.L.InnerLabel.RequiredStart.Default"),
    TextAreaLInnerLabelRequiredStartWarning("TextArea.L.InnerLabel.RequiredStart.Warning"),
    TextAreaLInnerLabelRequiredStartError("TextArea.L.InnerLabel.RequiredStart.Error"),
    TextAreaLInnerLabelRequiredEndDefault("TextArea.L.InnerLabel.RequiredEnd.Default"),
    TextAreaLInnerLabelRequiredEndWarning("TextArea.L.InnerLabel.RequiredEnd.Warning"),
    TextAreaLInnerLabelRequiredEndError("TextArea.L.InnerLabel.RequiredEnd.Error"),
    TextAreaXlDefault("TextArea.Xl.Default"),
    TextAreaXlWarning("TextArea.Xl.Warning"),
    TextAreaXlError("TextArea.Xl.Error"),
    TextAreaXlRequiredStartDefault("TextArea.Xl.RequiredStart.Default"),
    TextAreaXlRequiredStartWarning("TextArea.Xl.RequiredStart.Warning"),
    TextAreaXlRequiredStartError("TextArea.Xl.RequiredStart.Error"),
    TextAreaXlRequiredEndDefault("TextArea.Xl.RequiredEnd.Default"),
    TextAreaXlRequiredEndWarning("TextArea.Xl.RequiredEnd.Warning"),
    TextAreaXlRequiredEndError("TextArea.Xl.RequiredEnd.Error"),
    TextAreaXlOuterLabelDefault("TextArea.Xl.OuterLabel.Default"),
    TextAreaXlOuterLabelWarning("TextArea.Xl.OuterLabel.Warning"),
    TextAreaXlOuterLabelError("TextArea.Xl.OuterLabel.Error"),
    TextAreaXlOuterLabelRequiredStartDefault("TextArea.Xl.OuterLabel.RequiredStart.Default"),
    TextAreaXlOuterLabelRequiredStartWarning("TextArea.Xl.OuterLabel.RequiredStart.Warning"),
    TextAreaXlOuterLabelRequiredStartError("TextArea.Xl.OuterLabel.RequiredStart.Error"),
    TextAreaXlOuterLabelRequiredEndDefault("TextArea.Xl.OuterLabel.RequiredEnd.Default"),
    TextAreaXlOuterLabelRequiredEndWarning("TextArea.Xl.OuterLabel.RequiredEnd.Warning"),
    TextAreaXlOuterLabelRequiredEndError("TextArea.Xl.OuterLabel.RequiredEnd.Error"),
    TextAreaXlInnerLabelDefault("TextArea.Xl.InnerLabel.Default"),
    TextAreaXlInnerLabelWarning("TextArea.Xl.InnerLabel.Warning"),
    TextAreaXlInnerLabelError("TextArea.Xl.InnerLabel.Error"),
    TextAreaXlInnerLabelRequiredStartDefault("TextArea.Xl.InnerLabel.RequiredStart.Default"),
    TextAreaXlInnerLabelRequiredStartWarning("TextArea.Xl.InnerLabel.RequiredStart.Warning"),
    TextAreaXlInnerLabelRequiredStartError("TextArea.Xl.InnerLabel.RequiredStart.Error"),
    TextAreaXlInnerLabelRequiredEndDefault("TextArea.Xl.InnerLabel.RequiredEnd.Default"),
    TextAreaXlInnerLabelRequiredEndWarning("TextArea.Xl.InnerLabel.RequiredEnd.Warning"),
    TextAreaXlInnerLabelRequiredEndError("TextArea.Xl.InnerLabel.RequiredEnd.Error"),
    TextAreaClearXsDefault("TextAreaClear.Xs.Default"),
    TextAreaClearXsWarning("TextAreaClear.Xs.Warning"),
    TextAreaClearXsError("TextAreaClear.Xs.Error"),
    TextAreaClearXsRequiredStartDefault("TextAreaClear.Xs.RequiredStart.Default"),
    TextAreaClearXsRequiredStartWarning("TextAreaClear.Xs.RequiredStart.Warning"),
    TextAreaClearXsRequiredStartError("TextAreaClear.Xs.RequiredStart.Error"),
    TextAreaClearXsRequiredEndDefault("TextAreaClear.Xs.RequiredEnd.Default"),
    TextAreaClearXsRequiredEndWarning("TextAreaClear.Xs.RequiredEnd.Warning"),
    TextAreaClearXsRequiredEndError("TextAreaClear.Xs.RequiredEnd.Error"),
    TextAreaClearXsOuterLabelDefault("TextAreaClear.Xs.OuterLabel.Default"),
    TextAreaClearXsOuterLabelWarning("TextAreaClear.Xs.OuterLabel.Warning"),
    TextAreaClearXsOuterLabelError("TextAreaClear.Xs.OuterLabel.Error"),
    TextAreaClearXsOuterLabelRequiredStartDefault("TextAreaClear.Xs.OuterLabel.RequiredStart.Default"),
    TextAreaClearXsOuterLabelRequiredStartWarning("TextAreaClear.Xs.OuterLabel.RequiredStart.Warning"),
    TextAreaClearXsOuterLabelRequiredStartError("TextAreaClear.Xs.OuterLabel.RequiredStart.Error"),
    TextAreaClearXsOuterLabelRequiredEndDefault("TextAreaClear.Xs.OuterLabel.RequiredEnd.Default"),
    TextAreaClearXsOuterLabelRequiredEndWarning("TextAreaClear.Xs.OuterLabel.RequiredEnd.Warning"),
    TextAreaClearXsOuterLabelRequiredEndError("TextAreaClear.Xs.OuterLabel.RequiredEnd.Error"),
    TextAreaClearSDefault("TextAreaClear.S.Default"),
    TextAreaClearSWarning("TextAreaClear.S.Warning"),
    TextAreaClearSError("TextAreaClear.S.Error"),
    TextAreaClearSRequiredStartDefault("TextAreaClear.S.RequiredStart.Default"),
    TextAreaClearSRequiredStartWarning("TextAreaClear.S.RequiredStart.Warning"),
    TextAreaClearSRequiredStartError("TextAreaClear.S.RequiredStart.Error"),
    TextAreaClearSRequiredEndDefault("TextAreaClear.S.RequiredEnd.Default"),
    TextAreaClearSRequiredEndWarning("TextAreaClear.S.RequiredEnd.Warning"),
    TextAreaClearSRequiredEndError("TextAreaClear.S.RequiredEnd.Error"),
    TextAreaClearSOuterLabelDefault("TextAreaClear.S.OuterLabel.Default"),
    TextAreaClearSOuterLabelWarning("TextAreaClear.S.OuterLabel.Warning"),
    TextAreaClearSOuterLabelError("TextAreaClear.S.OuterLabel.Error"),
    TextAreaClearSOuterLabelRequiredStartDefault("TextAreaClear.S.OuterLabel.RequiredStart.Default"),
    TextAreaClearSOuterLabelRequiredStartWarning("TextAreaClear.S.OuterLabel.RequiredStart.Warning"),
    TextAreaClearSOuterLabelRequiredStartError("TextAreaClear.S.OuterLabel.RequiredStart.Error"),
    TextAreaClearSOuterLabelRequiredEndDefault("TextAreaClear.S.OuterLabel.RequiredEnd.Default"),
    TextAreaClearSOuterLabelRequiredEndWarning("TextAreaClear.S.OuterLabel.RequiredEnd.Warning"),
    TextAreaClearSOuterLabelRequiredEndError("TextAreaClear.S.OuterLabel.RequiredEnd.Error"),
    TextAreaClearSInnerLabelDefault("TextAreaClear.S.InnerLabel.Default"),
    TextAreaClearSInnerLabelWarning("TextAreaClear.S.InnerLabel.Warning"),
    TextAreaClearSInnerLabelError("TextAreaClear.S.InnerLabel.Error"),
    TextAreaClearSInnerLabelRequiredStartDefault("TextAreaClear.S.InnerLabel.RequiredStart.Default"),
    TextAreaClearSInnerLabelRequiredStartWarning("TextAreaClear.S.InnerLabel.RequiredStart.Warning"),
    TextAreaClearSInnerLabelRequiredStartError("TextAreaClear.S.InnerLabel.RequiredStart.Error"),
    TextAreaClearSInnerLabelRequiredEndDefault("TextAreaClear.S.InnerLabel.RequiredEnd.Default"),
    TextAreaClearSInnerLabelRequiredEndWarning("TextAreaClear.S.InnerLabel.RequiredEnd.Warning"),
    TextAreaClearSInnerLabelRequiredEndError("TextAreaClear.S.InnerLabel.RequiredEnd.Error"),
    TextAreaClearMDefault("TextAreaClear.M.Default"),
    TextAreaClearMWarning("TextAreaClear.M.Warning"),
    TextAreaClearMError("TextAreaClear.M.Error"),
    TextAreaClearMRequiredStartDefault("TextAreaClear.M.RequiredStart.Default"),
    TextAreaClearMRequiredStartWarning("TextAreaClear.M.RequiredStart.Warning"),
    TextAreaClearMRequiredStartError("TextAreaClear.M.RequiredStart.Error"),
    TextAreaClearMRequiredEndDefault("TextAreaClear.M.RequiredEnd.Default"),
    TextAreaClearMRequiredEndWarning("TextAreaClear.M.RequiredEnd.Warning"),
    TextAreaClearMRequiredEndError("TextAreaClear.M.RequiredEnd.Error"),
    TextAreaClearMOuterLabelDefault("TextAreaClear.M.OuterLabel.Default"),
    TextAreaClearMOuterLabelWarning("TextAreaClear.M.OuterLabel.Warning"),
    TextAreaClearMOuterLabelError("TextAreaClear.M.OuterLabel.Error"),
    TextAreaClearMOuterLabelRequiredStartDefault("TextAreaClear.M.OuterLabel.RequiredStart.Default"),
    TextAreaClearMOuterLabelRequiredStartWarning("TextAreaClear.M.OuterLabel.RequiredStart.Warning"),
    TextAreaClearMOuterLabelRequiredStartError("TextAreaClear.M.OuterLabel.RequiredStart.Error"),
    TextAreaClearMOuterLabelRequiredEndDefault("TextAreaClear.M.OuterLabel.RequiredEnd.Default"),
    TextAreaClearMOuterLabelRequiredEndWarning("TextAreaClear.M.OuterLabel.RequiredEnd.Warning"),
    TextAreaClearMOuterLabelRequiredEndError("TextAreaClear.M.OuterLabel.RequiredEnd.Error"),
    TextAreaClearMInnerLabelDefault("TextAreaClear.M.InnerLabel.Default"),
    TextAreaClearMInnerLabelWarning("TextAreaClear.M.InnerLabel.Warning"),
    TextAreaClearMInnerLabelError("TextAreaClear.M.InnerLabel.Error"),
    TextAreaClearMInnerLabelRequiredStartDefault("TextAreaClear.M.InnerLabel.RequiredStart.Default"),
    TextAreaClearMInnerLabelRequiredStartWarning("TextAreaClear.M.InnerLabel.RequiredStart.Warning"),
    TextAreaClearMInnerLabelRequiredStartError("TextAreaClear.M.InnerLabel.RequiredStart.Error"),
    TextAreaClearMInnerLabelRequiredEndDefault("TextAreaClear.M.InnerLabel.RequiredEnd.Default"),
    TextAreaClearMInnerLabelRequiredEndWarning("TextAreaClear.M.InnerLabel.RequiredEnd.Warning"),
    TextAreaClearMInnerLabelRequiredEndError("TextAreaClear.M.InnerLabel.RequiredEnd.Error"),
    TextAreaClearLDefault("TextAreaClear.L.Default"),
    TextAreaClearLWarning("TextAreaClear.L.Warning"),
    TextAreaClearLError("TextAreaClear.L.Error"),
    TextAreaClearLRequiredStartDefault("TextAreaClear.L.RequiredStart.Default"),
    TextAreaClearLRequiredStartWarning("TextAreaClear.L.RequiredStart.Warning"),
    TextAreaClearLRequiredStartError("TextAreaClear.L.RequiredStart.Error"),
    TextAreaClearLRequiredEndDefault("TextAreaClear.L.RequiredEnd.Default"),
    TextAreaClearLRequiredEndWarning("TextAreaClear.L.RequiredEnd.Warning"),
    TextAreaClearLRequiredEndError("TextAreaClear.L.RequiredEnd.Error"),
    TextAreaClearLOuterLabelDefault("TextAreaClear.L.OuterLabel.Default"),
    TextAreaClearLOuterLabelWarning("TextAreaClear.L.OuterLabel.Warning"),
    TextAreaClearLOuterLabelError("TextAreaClear.L.OuterLabel.Error"),
    TextAreaClearLOuterLabelRequiredStartDefault("TextAreaClear.L.OuterLabel.RequiredStart.Default"),
    TextAreaClearLOuterLabelRequiredStartWarning("TextAreaClear.L.OuterLabel.RequiredStart.Warning"),
    TextAreaClearLOuterLabelRequiredStartError("TextAreaClear.L.OuterLabel.RequiredStart.Error"),
    TextAreaClearLOuterLabelRequiredEndDefault("TextAreaClear.L.OuterLabel.RequiredEnd.Default"),
    TextAreaClearLOuterLabelRequiredEndWarning("TextAreaClear.L.OuterLabel.RequiredEnd.Warning"),
    TextAreaClearLOuterLabelRequiredEndError("TextAreaClear.L.OuterLabel.RequiredEnd.Error"),
    TextAreaClearLInnerLabelDefault("TextAreaClear.L.InnerLabel.Default"),
    TextAreaClearLInnerLabelWarning("TextAreaClear.L.InnerLabel.Warning"),
    TextAreaClearLInnerLabelError("TextAreaClear.L.InnerLabel.Error"),
    TextAreaClearLInnerLabelRequiredStartDefault("TextAreaClear.L.InnerLabel.RequiredStart.Default"),
    TextAreaClearLInnerLabelRequiredStartWarning("TextAreaClear.L.InnerLabel.RequiredStart.Warning"),
    TextAreaClearLInnerLabelRequiredStartError("TextAreaClear.L.InnerLabel.RequiredStart.Error"),
    TextAreaClearLInnerLabelRequiredEndDefault("TextAreaClear.L.InnerLabel.RequiredEnd.Default"),
    TextAreaClearLInnerLabelRequiredEndWarning("TextAreaClear.L.InnerLabel.RequiredEnd.Warning"),
    TextAreaClearLInnerLabelRequiredEndError("TextAreaClear.L.InnerLabel.RequiredEnd.Error"),
    TextAreaClearXlDefault("TextAreaClear.Xl.Default"),
    TextAreaClearXlWarning("TextAreaClear.Xl.Warning"),
    TextAreaClearXlError("TextAreaClear.Xl.Error"),
    TextAreaClearXlRequiredStartDefault("TextAreaClear.Xl.RequiredStart.Default"),
    TextAreaClearXlRequiredStartWarning("TextAreaClear.Xl.RequiredStart.Warning"),
    TextAreaClearXlRequiredStartError("TextAreaClear.Xl.RequiredStart.Error"),
    TextAreaClearXlRequiredEndDefault("TextAreaClear.Xl.RequiredEnd.Default"),
    TextAreaClearXlRequiredEndWarning("TextAreaClear.Xl.RequiredEnd.Warning"),
    TextAreaClearXlRequiredEndError("TextAreaClear.Xl.RequiredEnd.Error"),
    TextAreaClearXlOuterLabelDefault("TextAreaClear.Xl.OuterLabel.Default"),
    TextAreaClearXlOuterLabelWarning("TextAreaClear.Xl.OuterLabel.Warning"),
    TextAreaClearXlOuterLabelError("TextAreaClear.Xl.OuterLabel.Error"),
    TextAreaClearXlOuterLabelRequiredStartDefault("TextAreaClear.Xl.OuterLabel.RequiredStart.Default"),
    TextAreaClearXlOuterLabelRequiredStartWarning("TextAreaClear.Xl.OuterLabel.RequiredStart.Warning"),
    TextAreaClearXlOuterLabelRequiredStartError("TextAreaClear.Xl.OuterLabel.RequiredStart.Error"),
    TextAreaClearXlOuterLabelRequiredEndDefault("TextAreaClear.Xl.OuterLabel.RequiredEnd.Default"),
    TextAreaClearXlOuterLabelRequiredEndWarning("TextAreaClear.Xl.OuterLabel.RequiredEnd.Warning"),
    TextAreaClearXlOuterLabelRequiredEndError("TextAreaClear.Xl.OuterLabel.RequiredEnd.Error"),
    TextAreaClearXlInnerLabelDefault("TextAreaClear.Xl.InnerLabel.Default"),
    TextAreaClearXlInnerLabelWarning("TextAreaClear.Xl.InnerLabel.Warning"),
    TextAreaClearXlInnerLabelError("TextAreaClear.Xl.InnerLabel.Error"),
    TextAreaClearXlInnerLabelRequiredStartDefault("TextAreaClear.Xl.InnerLabel.RequiredStart.Default"),
    TextAreaClearXlInnerLabelRequiredStartWarning("TextAreaClear.Xl.InnerLabel.RequiredStart.Warning"),
    TextAreaClearXlInnerLabelRequiredStartError("TextAreaClear.Xl.InnerLabel.RequiredStart.Error"),
    TextAreaClearXlInnerLabelRequiredEndDefault("TextAreaClear.Xl.InnerLabel.RequiredEnd.Default"),
    TextAreaClearXlInnerLabelRequiredEndWarning("TextAreaClear.Xl.InnerLabel.RequiredEnd.Warning"),
    TextAreaClearXlInnerLabelRequiredEndError("TextAreaClear.Xl.InnerLabel.RequiredEnd.Error"),
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
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства required-placement для text-area
 */
public enum class TextAreaDefaultRequiredPlacement {
    None,
    Start,
    End,
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
    Warning,
    Error,
}

/**
 * Возможные значения свойства size для text-area-clear
 */
public enum class TextAreaClearSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства required-placement для text-area-clear
 */
public enum class TextAreaClearRequiredPlacement {
    None,
    Start,
    End,
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
    Warning,
    Error,
}

/**
 * Возвращает [TextFieldStyle] для [TextAreaStyles]
 */
@Composable
public fun TextAreaStyles.style(modify: @Composable TextFieldStyleBuilder.() -> Unit = {}): TextFieldStyle {
    val builder = when (this) {
        TextAreaStyles.TextAreaXsDefault -> TextArea.Xs.Default
        TextAreaStyles.TextAreaXsWarning -> TextArea.Xs.Warning
        TextAreaStyles.TextAreaXsError -> TextArea.Xs.Error
        TextAreaStyles.TextAreaXsRequiredStartDefault -> TextArea.Xs.RequiredStart.Default
        TextAreaStyles.TextAreaXsRequiredStartWarning -> TextArea.Xs.RequiredStart.Warning
        TextAreaStyles.TextAreaXsRequiredStartError -> TextArea.Xs.RequiredStart.Error
        TextAreaStyles.TextAreaXsRequiredEndDefault -> TextArea.Xs.RequiredEnd.Default
        TextAreaStyles.TextAreaXsRequiredEndWarning -> TextArea.Xs.RequiredEnd.Warning
        TextAreaStyles.TextAreaXsRequiredEndError -> TextArea.Xs.RequiredEnd.Error
        TextAreaStyles.TextAreaXsOuterLabelDefault -> TextArea.Xs.OuterLabel.Default
        TextAreaStyles.TextAreaXsOuterLabelWarning -> TextArea.Xs.OuterLabel.Warning
        TextAreaStyles.TextAreaXsOuterLabelError -> TextArea.Xs.OuterLabel.Error
        TextAreaStyles.TextAreaXsOuterLabelRequiredStartDefault ->
            TextArea.Xs.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaXsOuterLabelRequiredStartWarning ->
            TextArea.Xs.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaXsOuterLabelRequiredStartError ->
            TextArea.Xs.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaXsOuterLabelRequiredEndDefault ->
            TextArea.Xs.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaXsOuterLabelRequiredEndWarning ->
            TextArea.Xs.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaXsOuterLabelRequiredEndError ->
            TextArea.Xs.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaSDefault -> TextArea.S.Default
        TextAreaStyles.TextAreaSWarning -> TextArea.S.Warning
        TextAreaStyles.TextAreaSError -> TextArea.S.Error
        TextAreaStyles.TextAreaSRequiredStartDefault -> TextArea.S.RequiredStart.Default
        TextAreaStyles.TextAreaSRequiredStartWarning -> TextArea.S.RequiredStart.Warning
        TextAreaStyles.TextAreaSRequiredStartError -> TextArea.S.RequiredStart.Error
        TextAreaStyles.TextAreaSRequiredEndDefault -> TextArea.S.RequiredEnd.Default
        TextAreaStyles.TextAreaSRequiredEndWarning -> TextArea.S.RequiredEnd.Warning
        TextAreaStyles.TextAreaSRequiredEndError -> TextArea.S.RequiredEnd.Error
        TextAreaStyles.TextAreaSOuterLabelDefault -> TextArea.S.OuterLabel.Default
        TextAreaStyles.TextAreaSOuterLabelWarning -> TextArea.S.OuterLabel.Warning
        TextAreaStyles.TextAreaSOuterLabelError -> TextArea.S.OuterLabel.Error
        TextAreaStyles.TextAreaSOuterLabelRequiredStartDefault ->
            TextArea.S.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaSOuterLabelRequiredStartWarning ->
            TextArea.S.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaSOuterLabelRequiredStartError ->
            TextArea.S.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaSOuterLabelRequiredEndDefault ->
            TextArea.S.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaSOuterLabelRequiredEndWarning ->
            TextArea.S.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaSOuterLabelRequiredEndError -> TextArea.S.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaSInnerLabelDefault -> TextArea.S.InnerLabel.Default
        TextAreaStyles.TextAreaSInnerLabelWarning -> TextArea.S.InnerLabel.Warning
        TextAreaStyles.TextAreaSInnerLabelError -> TextArea.S.InnerLabel.Error
        TextAreaStyles.TextAreaSInnerLabelRequiredStartDefault ->
            TextArea.S.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaSInnerLabelRequiredStartWarning ->
            TextArea.S.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaSInnerLabelRequiredStartError ->
            TextArea.S.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaSInnerLabelRequiredEndDefault ->
            TextArea.S.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaSInnerLabelRequiredEndWarning ->
            TextArea.S.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaSInnerLabelRequiredEndError -> TextArea.S.InnerLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaMDefault -> TextArea.M.Default
        TextAreaStyles.TextAreaMWarning -> TextArea.M.Warning
        TextAreaStyles.TextAreaMError -> TextArea.M.Error
        TextAreaStyles.TextAreaMRequiredStartDefault -> TextArea.M.RequiredStart.Default
        TextAreaStyles.TextAreaMRequiredStartWarning -> TextArea.M.RequiredStart.Warning
        TextAreaStyles.TextAreaMRequiredStartError -> TextArea.M.RequiredStart.Error
        TextAreaStyles.TextAreaMRequiredEndDefault -> TextArea.M.RequiredEnd.Default
        TextAreaStyles.TextAreaMRequiredEndWarning -> TextArea.M.RequiredEnd.Warning
        TextAreaStyles.TextAreaMRequiredEndError -> TextArea.M.RequiredEnd.Error
        TextAreaStyles.TextAreaMOuterLabelDefault -> TextArea.M.OuterLabel.Default
        TextAreaStyles.TextAreaMOuterLabelWarning -> TextArea.M.OuterLabel.Warning
        TextAreaStyles.TextAreaMOuterLabelError -> TextArea.M.OuterLabel.Error
        TextAreaStyles.TextAreaMOuterLabelRequiredStartDefault ->
            TextArea.M.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaMOuterLabelRequiredStartWarning ->
            TextArea.M.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaMOuterLabelRequiredStartError ->
            TextArea.M.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaMOuterLabelRequiredEndDefault ->
            TextArea.M.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaMOuterLabelRequiredEndWarning ->
            TextArea.M.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaMOuterLabelRequiredEndError -> TextArea.M.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaMInnerLabelDefault -> TextArea.M.InnerLabel.Default
        TextAreaStyles.TextAreaMInnerLabelWarning -> TextArea.M.InnerLabel.Warning
        TextAreaStyles.TextAreaMInnerLabelError -> TextArea.M.InnerLabel.Error
        TextAreaStyles.TextAreaMInnerLabelRequiredStartDefault ->
            TextArea.M.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaMInnerLabelRequiredStartWarning ->
            TextArea.M.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaMInnerLabelRequiredStartError ->
            TextArea.M.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaMInnerLabelRequiredEndDefault ->
            TextArea.M.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaMInnerLabelRequiredEndWarning ->
            TextArea.M.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaMInnerLabelRequiredEndError -> TextArea.M.InnerLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaLDefault -> TextArea.L.Default
        TextAreaStyles.TextAreaLWarning -> TextArea.L.Warning
        TextAreaStyles.TextAreaLError -> TextArea.L.Error
        TextAreaStyles.TextAreaLRequiredStartDefault -> TextArea.L.RequiredStart.Default
        TextAreaStyles.TextAreaLRequiredStartWarning -> TextArea.L.RequiredStart.Warning
        TextAreaStyles.TextAreaLRequiredStartError -> TextArea.L.RequiredStart.Error
        TextAreaStyles.TextAreaLRequiredEndDefault -> TextArea.L.RequiredEnd.Default
        TextAreaStyles.TextAreaLRequiredEndWarning -> TextArea.L.RequiredEnd.Warning
        TextAreaStyles.TextAreaLRequiredEndError -> TextArea.L.RequiredEnd.Error
        TextAreaStyles.TextAreaLOuterLabelDefault -> TextArea.L.OuterLabel.Default
        TextAreaStyles.TextAreaLOuterLabelWarning -> TextArea.L.OuterLabel.Warning
        TextAreaStyles.TextAreaLOuterLabelError -> TextArea.L.OuterLabel.Error
        TextAreaStyles.TextAreaLOuterLabelRequiredStartDefault ->
            TextArea.L.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaLOuterLabelRequiredStartWarning ->
            TextArea.L.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaLOuterLabelRequiredStartError ->
            TextArea.L.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaLOuterLabelRequiredEndDefault ->
            TextArea.L.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaLOuterLabelRequiredEndWarning ->
            TextArea.L.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaLOuterLabelRequiredEndError -> TextArea.L.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaLInnerLabelDefault -> TextArea.L.InnerLabel.Default
        TextAreaStyles.TextAreaLInnerLabelWarning -> TextArea.L.InnerLabel.Warning
        TextAreaStyles.TextAreaLInnerLabelError -> TextArea.L.InnerLabel.Error
        TextAreaStyles.TextAreaLInnerLabelRequiredStartDefault ->
            TextArea.L.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaLInnerLabelRequiredStartWarning ->
            TextArea.L.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaLInnerLabelRequiredStartError ->
            TextArea.L.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaLInnerLabelRequiredEndDefault ->
            TextArea.L.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaLInnerLabelRequiredEndWarning ->
            TextArea.L.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaLInnerLabelRequiredEndError -> TextArea.L.InnerLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaXlDefault -> TextArea.Xl.Default
        TextAreaStyles.TextAreaXlWarning -> TextArea.Xl.Warning
        TextAreaStyles.TextAreaXlError -> TextArea.Xl.Error
        TextAreaStyles.TextAreaXlRequiredStartDefault -> TextArea.Xl.RequiredStart.Default
        TextAreaStyles.TextAreaXlRequiredStartWarning -> TextArea.Xl.RequiredStart.Warning
        TextAreaStyles.TextAreaXlRequiredStartError -> TextArea.Xl.RequiredStart.Error
        TextAreaStyles.TextAreaXlRequiredEndDefault -> TextArea.Xl.RequiredEnd.Default
        TextAreaStyles.TextAreaXlRequiredEndWarning -> TextArea.Xl.RequiredEnd.Warning
        TextAreaStyles.TextAreaXlRequiredEndError -> TextArea.Xl.RequiredEnd.Error
        TextAreaStyles.TextAreaXlOuterLabelDefault -> TextArea.Xl.OuterLabel.Default
        TextAreaStyles.TextAreaXlOuterLabelWarning -> TextArea.Xl.OuterLabel.Warning
        TextAreaStyles.TextAreaXlOuterLabelError -> TextArea.Xl.OuterLabel.Error
        TextAreaStyles.TextAreaXlOuterLabelRequiredStartDefault ->
            TextArea.Xl.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaXlOuterLabelRequiredStartWarning ->
            TextArea.Xl.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaXlOuterLabelRequiredStartError ->
            TextArea.Xl.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaXlOuterLabelRequiredEndDefault ->
            TextArea.Xl.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaXlOuterLabelRequiredEndWarning ->
            TextArea.Xl.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaXlOuterLabelRequiredEndError ->
            TextArea.Xl.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaXlInnerLabelDefault -> TextArea.Xl.InnerLabel.Default
        TextAreaStyles.TextAreaXlInnerLabelWarning -> TextArea.Xl.InnerLabel.Warning
        TextAreaStyles.TextAreaXlInnerLabelError -> TextArea.Xl.InnerLabel.Error
        TextAreaStyles.TextAreaXlInnerLabelRequiredStartDefault ->
            TextArea.Xl.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaXlInnerLabelRequiredStartWarning ->
            TextArea.Xl.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaXlInnerLabelRequiredStartError ->
            TextArea.Xl.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaXlInnerLabelRequiredEndDefault ->
            TextArea.Xl.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaXlInnerLabelRequiredEndWarning ->
            TextArea.Xl.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaXlInnerLabelRequiredEndError ->
            TextArea.Xl.InnerLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearXsDefault -> TextAreaClear.Xs.Default
        TextAreaStyles.TextAreaClearXsWarning -> TextAreaClear.Xs.Warning
        TextAreaStyles.TextAreaClearXsError -> TextAreaClear.Xs.Error
        TextAreaStyles.TextAreaClearXsRequiredStartDefault -> TextAreaClear.Xs.RequiredStart.Default
        TextAreaStyles.TextAreaClearXsRequiredStartWarning -> TextAreaClear.Xs.RequiredStart.Warning
        TextAreaStyles.TextAreaClearXsRequiredStartError -> TextAreaClear.Xs.RequiredStart.Error
        TextAreaStyles.TextAreaClearXsRequiredEndDefault -> TextAreaClear.Xs.RequiredEnd.Default
        TextAreaStyles.TextAreaClearXsRequiredEndWarning -> TextAreaClear.Xs.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearXsRequiredEndError -> TextAreaClear.Xs.RequiredEnd.Error
        TextAreaStyles.TextAreaClearXsOuterLabelDefault -> TextAreaClear.Xs.OuterLabel.Default
        TextAreaStyles.TextAreaClearXsOuterLabelWarning -> TextAreaClear.Xs.OuterLabel.Warning
        TextAreaStyles.TextAreaClearXsOuterLabelError -> TextAreaClear.Xs.OuterLabel.Error
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredStartDefault ->
            TextAreaClear.Xs.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredStartWarning ->
            TextAreaClear.Xs.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredStartError ->
            TextAreaClear.Xs.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredEndDefault ->
            TextAreaClear.Xs.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredEndWarning ->
            TextAreaClear.Xs.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredEndError ->
            TextAreaClear.Xs.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearSDefault -> TextAreaClear.S.Default
        TextAreaStyles.TextAreaClearSWarning -> TextAreaClear.S.Warning
        TextAreaStyles.TextAreaClearSError -> TextAreaClear.S.Error
        TextAreaStyles.TextAreaClearSRequiredStartDefault -> TextAreaClear.S.RequiredStart.Default
        TextAreaStyles.TextAreaClearSRequiredStartWarning -> TextAreaClear.S.RequiredStart.Warning
        TextAreaStyles.TextAreaClearSRequiredStartError -> TextAreaClear.S.RequiredStart.Error
        TextAreaStyles.TextAreaClearSRequiredEndDefault -> TextAreaClear.S.RequiredEnd.Default
        TextAreaStyles.TextAreaClearSRequiredEndWarning -> TextAreaClear.S.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearSRequiredEndError -> TextAreaClear.S.RequiredEnd.Error
        TextAreaStyles.TextAreaClearSOuterLabelDefault -> TextAreaClear.S.OuterLabel.Default
        TextAreaStyles.TextAreaClearSOuterLabelWarning -> TextAreaClear.S.OuterLabel.Warning
        TextAreaStyles.TextAreaClearSOuterLabelError -> TextAreaClear.S.OuterLabel.Error
        TextAreaStyles.TextAreaClearSOuterLabelRequiredStartDefault ->
            TextAreaClear.S.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearSOuterLabelRequiredStartWarning ->
            TextAreaClear.S.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearSOuterLabelRequiredStartError ->
            TextAreaClear.S.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearSOuterLabelRequiredEndDefault ->
            TextAreaClear.S.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearSOuterLabelRequiredEndWarning ->
            TextAreaClear.S.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearSOuterLabelRequiredEndError ->
            TextAreaClear.S.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearSInnerLabelDefault -> TextAreaClear.S.InnerLabel.Default
        TextAreaStyles.TextAreaClearSInnerLabelWarning -> TextAreaClear.S.InnerLabel.Warning
        TextAreaStyles.TextAreaClearSInnerLabelError -> TextAreaClear.S.InnerLabel.Error
        TextAreaStyles.TextAreaClearSInnerLabelRequiredStartDefault ->
            TextAreaClear.S.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearSInnerLabelRequiredStartWarning ->
            TextAreaClear.S.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearSInnerLabelRequiredStartError ->
            TextAreaClear.S.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearSInnerLabelRequiredEndDefault ->
            TextAreaClear.S.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearSInnerLabelRequiredEndWarning ->
            TextAreaClear.S.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearSInnerLabelRequiredEndError ->
            TextAreaClear.S.InnerLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearMDefault -> TextAreaClear.M.Default
        TextAreaStyles.TextAreaClearMWarning -> TextAreaClear.M.Warning
        TextAreaStyles.TextAreaClearMError -> TextAreaClear.M.Error
        TextAreaStyles.TextAreaClearMRequiredStartDefault -> TextAreaClear.M.RequiredStart.Default
        TextAreaStyles.TextAreaClearMRequiredStartWarning -> TextAreaClear.M.RequiredStart.Warning
        TextAreaStyles.TextAreaClearMRequiredStartError -> TextAreaClear.M.RequiredStart.Error
        TextAreaStyles.TextAreaClearMRequiredEndDefault -> TextAreaClear.M.RequiredEnd.Default
        TextAreaStyles.TextAreaClearMRequiredEndWarning -> TextAreaClear.M.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearMRequiredEndError -> TextAreaClear.M.RequiredEnd.Error
        TextAreaStyles.TextAreaClearMOuterLabelDefault -> TextAreaClear.M.OuterLabel.Default
        TextAreaStyles.TextAreaClearMOuterLabelWarning -> TextAreaClear.M.OuterLabel.Warning
        TextAreaStyles.TextAreaClearMOuterLabelError -> TextAreaClear.M.OuterLabel.Error
        TextAreaStyles.TextAreaClearMOuterLabelRequiredStartDefault ->
            TextAreaClear.M.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearMOuterLabelRequiredStartWarning ->
            TextAreaClear.M.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearMOuterLabelRequiredStartError ->
            TextAreaClear.M.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearMOuterLabelRequiredEndDefault ->
            TextAreaClear.M.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearMOuterLabelRequiredEndWarning ->
            TextAreaClear.M.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearMOuterLabelRequiredEndError ->
            TextAreaClear.M.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearMInnerLabelDefault -> TextAreaClear.M.InnerLabel.Default
        TextAreaStyles.TextAreaClearMInnerLabelWarning -> TextAreaClear.M.InnerLabel.Warning
        TextAreaStyles.TextAreaClearMInnerLabelError -> TextAreaClear.M.InnerLabel.Error
        TextAreaStyles.TextAreaClearMInnerLabelRequiredStartDefault ->
            TextAreaClear.M.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearMInnerLabelRequiredStartWarning ->
            TextAreaClear.M.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearMInnerLabelRequiredStartError ->
            TextAreaClear.M.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearMInnerLabelRequiredEndDefault ->
            TextAreaClear.M.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearMInnerLabelRequiredEndWarning ->
            TextAreaClear.M.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearMInnerLabelRequiredEndError ->
            TextAreaClear.M.InnerLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearLDefault -> TextAreaClear.L.Default
        TextAreaStyles.TextAreaClearLWarning -> TextAreaClear.L.Warning
        TextAreaStyles.TextAreaClearLError -> TextAreaClear.L.Error
        TextAreaStyles.TextAreaClearLRequiredStartDefault -> TextAreaClear.L.RequiredStart.Default
        TextAreaStyles.TextAreaClearLRequiredStartWarning -> TextAreaClear.L.RequiredStart.Warning
        TextAreaStyles.TextAreaClearLRequiredStartError -> TextAreaClear.L.RequiredStart.Error
        TextAreaStyles.TextAreaClearLRequiredEndDefault -> TextAreaClear.L.RequiredEnd.Default
        TextAreaStyles.TextAreaClearLRequiredEndWarning -> TextAreaClear.L.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearLRequiredEndError -> TextAreaClear.L.RequiredEnd.Error
        TextAreaStyles.TextAreaClearLOuterLabelDefault -> TextAreaClear.L.OuterLabel.Default
        TextAreaStyles.TextAreaClearLOuterLabelWarning -> TextAreaClear.L.OuterLabel.Warning
        TextAreaStyles.TextAreaClearLOuterLabelError -> TextAreaClear.L.OuterLabel.Error
        TextAreaStyles.TextAreaClearLOuterLabelRequiredStartDefault ->
            TextAreaClear.L.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearLOuterLabelRequiredStartWarning ->
            TextAreaClear.L.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearLOuterLabelRequiredStartError ->
            TextAreaClear.L.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearLOuterLabelRequiredEndDefault ->
            TextAreaClear.L.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearLOuterLabelRequiredEndWarning ->
            TextAreaClear.L.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearLOuterLabelRequiredEndError ->
            TextAreaClear.L.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearLInnerLabelDefault -> TextAreaClear.L.InnerLabel.Default
        TextAreaStyles.TextAreaClearLInnerLabelWarning -> TextAreaClear.L.InnerLabel.Warning
        TextAreaStyles.TextAreaClearLInnerLabelError -> TextAreaClear.L.InnerLabel.Error
        TextAreaStyles.TextAreaClearLInnerLabelRequiredStartDefault ->
            TextAreaClear.L.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearLInnerLabelRequiredStartWarning ->
            TextAreaClear.L.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearLInnerLabelRequiredStartError ->
            TextAreaClear.L.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearLInnerLabelRequiredEndDefault ->
            TextAreaClear.L.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearLInnerLabelRequiredEndWarning ->
            TextAreaClear.L.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearLInnerLabelRequiredEndError ->
            TextAreaClear.L.InnerLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearXlDefault -> TextAreaClear.Xl.Default
        TextAreaStyles.TextAreaClearXlWarning -> TextAreaClear.Xl.Warning
        TextAreaStyles.TextAreaClearXlError -> TextAreaClear.Xl.Error
        TextAreaStyles.TextAreaClearXlRequiredStartDefault -> TextAreaClear.Xl.RequiredStart.Default
        TextAreaStyles.TextAreaClearXlRequiredStartWarning -> TextAreaClear.Xl.RequiredStart.Warning
        TextAreaStyles.TextAreaClearXlRequiredStartError -> TextAreaClear.Xl.RequiredStart.Error
        TextAreaStyles.TextAreaClearXlRequiredEndDefault -> TextAreaClear.Xl.RequiredEnd.Default
        TextAreaStyles.TextAreaClearXlRequiredEndWarning -> TextAreaClear.Xl.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearXlRequiredEndError -> TextAreaClear.Xl.RequiredEnd.Error
        TextAreaStyles.TextAreaClearXlOuterLabelDefault -> TextAreaClear.Xl.OuterLabel.Default
        TextAreaStyles.TextAreaClearXlOuterLabelWarning -> TextAreaClear.Xl.OuterLabel.Warning
        TextAreaStyles.TextAreaClearXlOuterLabelError -> TextAreaClear.Xl.OuterLabel.Error
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredStartDefault ->
            TextAreaClear.Xl.OuterLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredStartWarning ->
            TextAreaClear.Xl.OuterLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredStartError ->
            TextAreaClear.Xl.OuterLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredEndDefault ->
            TextAreaClear.Xl.OuterLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredEndWarning ->
            TextAreaClear.Xl.OuterLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredEndError ->
            TextAreaClear.Xl.OuterLabel.RequiredEnd.Error
        TextAreaStyles.TextAreaClearXlInnerLabelDefault -> TextAreaClear.Xl.InnerLabel.Default
        TextAreaStyles.TextAreaClearXlInnerLabelWarning -> TextAreaClear.Xl.InnerLabel.Warning
        TextAreaStyles.TextAreaClearXlInnerLabelError -> TextAreaClear.Xl.InnerLabel.Error
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredStartDefault ->
            TextAreaClear.Xl.InnerLabel.RequiredStart.Default
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredStartWarning ->
            TextAreaClear.Xl.InnerLabel.RequiredStart.Warning
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredStartError ->
            TextAreaClear.Xl.InnerLabel.RequiredStart.Error
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredEndDefault ->
            TextAreaClear.Xl.InnerLabel.RequiredEnd.Default
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredEndWarning ->
            TextAreaClear.Xl.InnerLabel.RequiredEnd.Warning
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredEndError ->
            TextAreaClear.Xl.InnerLabel.RequiredEnd.Error
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextAreaStyles] для text-area
 */
public fun TextAreaStyles.Default.resolve(
    size: TextAreaDefaultSize = TextAreaDefaultSize.Xl,
    requiredPlacement: TextAreaDefaultRequiredPlacement = TextAreaDefaultRequiredPlacement.None,
    labelPlacement: TextAreaDefaultLabelPlacement = TextAreaDefaultLabelPlacement.None,
    view: TextAreaDefaultView = TextAreaDefaultView.Default,
): TextAreaStyles = when {
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsDefault
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXsWarning
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaXsError
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsRequiredStartDefault
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXsRequiredStartWarning
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaXsRequiredStartError
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsRequiredEndDefault
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXsRequiredEndWarning
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaXsRequiredEndError
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsOuterLabelDefault
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXsOuterLabelWarning
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXsOuterLabelError
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsOuterLabelRequiredStartDefault
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXsOuterLabelRequiredStartWarning
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXsOuterLabelRequiredStartError
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXsOuterLabelRequiredEndDefault
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXsOuterLabelRequiredEndWarning
    size == TextAreaDefaultSize.Xs && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXsOuterLabelRequiredEndError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaSError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSRequiredStartDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSRequiredStartWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaSRequiredStartError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSRequiredEndDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSRequiredEndWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaSRequiredEndError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSOuterLabelDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSOuterLabelWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSOuterLabelError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSOuterLabelRequiredStartDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSOuterLabelRequiredStartWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSOuterLabelRequiredStartError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSOuterLabelRequiredEndDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSOuterLabelRequiredEndWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSOuterLabelRequiredEndError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSInnerLabelDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSInnerLabelWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSInnerLabelError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSInnerLabelRequiredStartDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSInnerLabelRequiredStartWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSInnerLabelRequiredStartError
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaSInnerLabelRequiredEndDefault
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaSInnerLabelRequiredEndWarning
    size == TextAreaDefaultSize.S && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaSInnerLabelRequiredEndError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaMError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMRequiredStartDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMRequiredStartWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaMRequiredStartError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMRequiredEndDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMRequiredEndWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaMRequiredEndError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMOuterLabelDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMOuterLabelWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMOuterLabelError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMOuterLabelRequiredStartDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMOuterLabelRequiredStartWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMOuterLabelRequiredStartError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMOuterLabelRequiredEndDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMOuterLabelRequiredEndWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMOuterLabelRequiredEndError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMInnerLabelDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMInnerLabelWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMInnerLabelError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMInnerLabelRequiredStartDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMInnerLabelRequiredStartWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMInnerLabelRequiredStartError
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaMInnerLabelRequiredEndDefault
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaMInnerLabelRequiredEndWarning
    size == TextAreaDefaultSize.M && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaMInnerLabelRequiredEndError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaLError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLRequiredStartDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLRequiredStartWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaLRequiredStartError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLRequiredEndDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLRequiredEndWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaLRequiredEndError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLOuterLabelDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLOuterLabelWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaLOuterLabelError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLOuterLabelRequiredStartDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLOuterLabelRequiredStartWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaLOuterLabelRequiredStartError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLOuterLabelRequiredEndDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLOuterLabelRequiredEndWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaLOuterLabelRequiredEndError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLInnerLabelDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLInnerLabelWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaLInnerLabelError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLInnerLabelRequiredStartDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLInnerLabelRequiredStartWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaLInnerLabelRequiredStartError
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaLInnerLabelRequiredEndDefault
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaLInnerLabelRequiredEndWarning
    size == TextAreaDefaultSize.L && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaLInnerLabelRequiredEndError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaXlError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlRequiredStartDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlRequiredStartWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaXlRequiredStartError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlRequiredEndDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlRequiredEndWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.None && view == TextAreaDefaultView.Error ->
        TextAreaStyles.TextAreaXlRequiredEndError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlOuterLabelDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlOuterLabelWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXlOuterLabelError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlOuterLabelRequiredStartDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlOuterLabelRequiredStartWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXlOuterLabelRequiredStartError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlOuterLabelRequiredEndDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlOuterLabelRequiredEndWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Outer && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXlOuterLabelRequiredEndError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlInnerLabelDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlInnerLabelWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.None &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXlInnerLabelError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlInnerLabelRequiredStartDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlInnerLabelRequiredStartWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.Start &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXlInnerLabelRequiredStartError
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Default -> TextAreaStyles.TextAreaXlInnerLabelRequiredEndDefault
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Warning -> TextAreaStyles.TextAreaXlInnerLabelRequiredEndWarning
    size == TextAreaDefaultSize.Xl && requiredPlacement == TextAreaDefaultRequiredPlacement.End &&
        labelPlacement == TextAreaDefaultLabelPlacement.Inner && view ==
        TextAreaDefaultView.Error -> TextAreaStyles.TextAreaXlInnerLabelRequiredEndError
    else -> error("Unsupported text-area style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-area
 */
@Composable
public fun TextAreaStyles.Default.style(
    size: TextAreaDefaultSize = TextAreaDefaultSize.Xl,
    requiredPlacement: TextAreaDefaultRequiredPlacement = TextAreaDefaultRequiredPlacement.None,
    labelPlacement: TextAreaDefaultLabelPlacement = TextAreaDefaultLabelPlacement.None,
    view: TextAreaDefaultView = TextAreaDefaultView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, requiredPlacement, labelPlacement, view).style(modify)

/**
 * Возвращает экземпляр [TextAreaStyles] для text-area-clear
 */
public fun TextAreaStyles.Clear.resolve(
    size: TextAreaClearSize = TextAreaClearSize.Xl,
    requiredPlacement: TextAreaClearRequiredPlacement = TextAreaClearRequiredPlacement.None,
    labelPlacement: TextAreaClearLabelPlacement = TextAreaClearLabelPlacement.None,
    view: TextAreaClearView = TextAreaClearView.Default,
): TextAreaStyles = when {
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXsDefault
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXsWarning
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXsError
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXsRequiredStartDefault
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXsRequiredStartWarning
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXsRequiredStartError
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXsRequiredEndDefault
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXsRequiredEndWarning
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXsRequiredEndError
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXsOuterLabelDefault
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXsOuterLabelWarning
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXsOuterLabelError
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredStartDefault
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredStartWarning
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredStartError
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredEndDefault
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredEndWarning
    size == TextAreaClearSize.Xs && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXsOuterLabelRequiredEndError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSRequiredStartDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSRequiredStartWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSRequiredStartError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSRequiredEndDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSRequiredEndWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSRequiredEndError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSOuterLabelDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSOuterLabelWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSOuterLabelError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSOuterLabelRequiredStartDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSOuterLabelRequiredStartWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSOuterLabelRequiredStartError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSOuterLabelRequiredEndDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSOuterLabelRequiredEndWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSOuterLabelRequiredEndError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSInnerLabelDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSInnerLabelWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSInnerLabelError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSInnerLabelRequiredStartDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSInnerLabelRequiredStartWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSInnerLabelRequiredStartError
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearSInnerLabelRequiredEndDefault
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearSInnerLabelRequiredEndWarning
    size == TextAreaClearSize.S && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearSInnerLabelRequiredEndError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMRequiredStartDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMRequiredStartWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMRequiredStartError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMRequiredEndDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMRequiredEndWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMRequiredEndError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMOuterLabelDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMOuterLabelWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMOuterLabelError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMOuterLabelRequiredStartDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMOuterLabelRequiredStartWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMOuterLabelRequiredStartError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMOuterLabelRequiredEndDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMOuterLabelRequiredEndWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMOuterLabelRequiredEndError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMInnerLabelDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMInnerLabelWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMInnerLabelError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMInnerLabelRequiredStartDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMInnerLabelRequiredStartWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMInnerLabelRequiredStartError
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearMInnerLabelRequiredEndDefault
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearMInnerLabelRequiredEndWarning
    size == TextAreaClearSize.M && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearMInnerLabelRequiredEndError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLRequiredStartDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLRequiredStartWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLRequiredStartError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLRequiredEndDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLRequiredEndWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLRequiredEndError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLOuterLabelDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLOuterLabelWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLOuterLabelError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLOuterLabelRequiredStartDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLOuterLabelRequiredStartWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLOuterLabelRequiredStartError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLOuterLabelRequiredEndDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLOuterLabelRequiredEndWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLOuterLabelRequiredEndError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLInnerLabelDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLInnerLabelWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLInnerLabelError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLInnerLabelRequiredStartDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLInnerLabelRequiredStartWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLInnerLabelRequiredStartError
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearLInnerLabelRequiredEndDefault
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearLInnerLabelRequiredEndWarning
    size == TextAreaClearSize.L && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearLInnerLabelRequiredEndError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlRequiredStartDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlRequiredStartWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlRequiredStartError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlRequiredEndDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlRequiredEndWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.None && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlRequiredEndError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlOuterLabelDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlOuterLabelWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlOuterLabelError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredStartDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredStartWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredStartError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredEndDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredEndWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Outer && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlOuterLabelRequiredEndError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlInnerLabelDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlInnerLabelWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.None &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlInnerLabelError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredStartDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredStartWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.Start &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredStartError
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Default ->
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredEndDefault
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Warning ->
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredEndWarning
    size == TextAreaClearSize.Xl && requiredPlacement == TextAreaClearRequiredPlacement.End &&
        labelPlacement == TextAreaClearLabelPlacement.Inner && view == TextAreaClearView.Error ->
        TextAreaStyles.TextAreaClearXlInnerLabelRequiredEndError
    else -> error("Unsupported text-area-clear style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-area-clear
 */
@Composable
public fun TextAreaStyles.Clear.style(
    size: TextAreaClearSize = TextAreaClearSize.Xl,
    requiredPlacement: TextAreaClearRequiredPlacement = TextAreaClearRequiredPlacement.None,
    labelPlacement: TextAreaClearLabelPlacement = TextAreaClearLabelPlacement.None,
    view: TextAreaClearView = TextAreaClearView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, requiredPlacement, labelPlacement, view).style(modify)
