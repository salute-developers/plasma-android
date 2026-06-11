// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.textfield

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
    TextFieldXsRequiredStartDefault("TextField.Xs.RequiredStart.Default"),
    TextFieldXsRequiredStartSuccess("TextField.Xs.RequiredStart.Success"),
    TextFieldXsRequiredStartWarning("TextField.Xs.RequiredStart.Warning"),
    TextFieldXsRequiredStartError("TextField.Xs.RequiredStart.Error"),
    TextFieldXsRequiredEndDefault("TextField.Xs.RequiredEnd.Default"),
    TextFieldXsRequiredEndSuccess("TextField.Xs.RequiredEnd.Success"),
    TextFieldXsRequiredEndWarning("TextField.Xs.RequiredEnd.Warning"),
    TextFieldXsRequiredEndError("TextField.Xs.RequiredEnd.Error"),
    TextFieldXsOuterLabelDefault("TextField.Xs.OuterLabel.Default"),
    TextFieldXsOuterLabelSuccess("TextField.Xs.OuterLabel.Success"),
    TextFieldXsOuterLabelWarning("TextField.Xs.OuterLabel.Warning"),
    TextFieldXsOuterLabelError("TextField.Xs.OuterLabel.Error"),
    TextFieldXsOuterLabelRequiredStartDefault("TextField.Xs.OuterLabel.RequiredStart.Default"),
    TextFieldXsOuterLabelRequiredStartSuccess("TextField.Xs.OuterLabel.RequiredStart.Success"),
    TextFieldXsOuterLabelRequiredStartWarning("TextField.Xs.OuterLabel.RequiredStart.Warning"),
    TextFieldXsOuterLabelRequiredStartError("TextField.Xs.OuterLabel.RequiredStart.Error"),
    TextFieldXsOuterLabelRequiredEndDefault("TextField.Xs.OuterLabel.RequiredEnd.Default"),
    TextFieldXsOuterLabelRequiredEndSuccess("TextField.Xs.OuterLabel.RequiredEnd.Success"),
    TextFieldXsOuterLabelRequiredEndWarning("TextField.Xs.OuterLabel.RequiredEnd.Warning"),
    TextFieldXsOuterLabelRequiredEndError("TextField.Xs.OuterLabel.RequiredEnd.Error"),
    TextFieldSDefault("TextField.S.Default"),
    TextFieldSSuccess("TextField.S.Success"),
    TextFieldSWarning("TextField.S.Warning"),
    TextFieldSError("TextField.S.Error"),
    TextFieldSRequiredStartDefault("TextField.S.RequiredStart.Default"),
    TextFieldSRequiredStartSuccess("TextField.S.RequiredStart.Success"),
    TextFieldSRequiredStartWarning("TextField.S.RequiredStart.Warning"),
    TextFieldSRequiredStartError("TextField.S.RequiredStart.Error"),
    TextFieldSRequiredEndDefault("TextField.S.RequiredEnd.Default"),
    TextFieldSRequiredEndSuccess("TextField.S.RequiredEnd.Success"),
    TextFieldSRequiredEndWarning("TextField.S.RequiredEnd.Warning"),
    TextFieldSRequiredEndError("TextField.S.RequiredEnd.Error"),
    TextFieldSOuterLabelDefault("TextField.S.OuterLabel.Default"),
    TextFieldSOuterLabelSuccess("TextField.S.OuterLabel.Success"),
    TextFieldSOuterLabelWarning("TextField.S.OuterLabel.Warning"),
    TextFieldSOuterLabelError("TextField.S.OuterLabel.Error"),
    TextFieldSOuterLabelRequiredStartDefault("TextField.S.OuterLabel.RequiredStart.Default"),
    TextFieldSOuterLabelRequiredStartSuccess("TextField.S.OuterLabel.RequiredStart.Success"),
    TextFieldSOuterLabelRequiredStartWarning("TextField.S.OuterLabel.RequiredStart.Warning"),
    TextFieldSOuterLabelRequiredStartError("TextField.S.OuterLabel.RequiredStart.Error"),
    TextFieldSOuterLabelRequiredEndDefault("TextField.S.OuterLabel.RequiredEnd.Default"),
    TextFieldSOuterLabelRequiredEndSuccess("TextField.S.OuterLabel.RequiredEnd.Success"),
    TextFieldSOuterLabelRequiredEndWarning("TextField.S.OuterLabel.RequiredEnd.Warning"),
    TextFieldSOuterLabelRequiredEndError("TextField.S.OuterLabel.RequiredEnd.Error"),
    TextFieldSInnerLabelDefault("TextField.S.InnerLabel.Default"),
    TextFieldSInnerLabelSuccess("TextField.S.InnerLabel.Success"),
    TextFieldSInnerLabelWarning("TextField.S.InnerLabel.Warning"),
    TextFieldSInnerLabelError("TextField.S.InnerLabel.Error"),
    TextFieldSInnerLabelRequiredStartDefault("TextField.S.InnerLabel.RequiredStart.Default"),
    TextFieldSInnerLabelRequiredStartSuccess("TextField.S.InnerLabel.RequiredStart.Success"),
    TextFieldSInnerLabelRequiredStartWarning("TextField.S.InnerLabel.RequiredStart.Warning"),
    TextFieldSInnerLabelRequiredStartError("TextField.S.InnerLabel.RequiredStart.Error"),
    TextFieldSInnerLabelRequiredEndDefault("TextField.S.InnerLabel.RequiredEnd.Default"),
    TextFieldSInnerLabelRequiredEndSuccess("TextField.S.InnerLabel.RequiredEnd.Success"),
    TextFieldSInnerLabelRequiredEndWarning("TextField.S.InnerLabel.RequiredEnd.Warning"),
    TextFieldSInnerLabelRequiredEndError("TextField.S.InnerLabel.RequiredEnd.Error"),
    TextFieldMDefault("TextField.M.Default"),
    TextFieldMSuccess("TextField.M.Success"),
    TextFieldMWarning("TextField.M.Warning"),
    TextFieldMError("TextField.M.Error"),
    TextFieldMRequiredStartDefault("TextField.M.RequiredStart.Default"),
    TextFieldMRequiredStartSuccess("TextField.M.RequiredStart.Success"),
    TextFieldMRequiredStartWarning("TextField.M.RequiredStart.Warning"),
    TextFieldMRequiredStartError("TextField.M.RequiredStart.Error"),
    TextFieldMRequiredEndDefault("TextField.M.RequiredEnd.Default"),
    TextFieldMRequiredEndSuccess("TextField.M.RequiredEnd.Success"),
    TextFieldMRequiredEndWarning("TextField.M.RequiredEnd.Warning"),
    TextFieldMRequiredEndError("TextField.M.RequiredEnd.Error"),
    TextFieldMOuterLabelDefault("TextField.M.OuterLabel.Default"),
    TextFieldMOuterLabelSuccess("TextField.M.OuterLabel.Success"),
    TextFieldMOuterLabelWarning("TextField.M.OuterLabel.Warning"),
    TextFieldMOuterLabelError("TextField.M.OuterLabel.Error"),
    TextFieldMOuterLabelRequiredStartDefault("TextField.M.OuterLabel.RequiredStart.Default"),
    TextFieldMOuterLabelRequiredStartSuccess("TextField.M.OuterLabel.RequiredStart.Success"),
    TextFieldMOuterLabelRequiredStartWarning("TextField.M.OuterLabel.RequiredStart.Warning"),
    TextFieldMOuterLabelRequiredStartError("TextField.M.OuterLabel.RequiredStart.Error"),
    TextFieldMOuterLabelRequiredEndDefault("TextField.M.OuterLabel.RequiredEnd.Default"),
    TextFieldMOuterLabelRequiredEndSuccess("TextField.M.OuterLabel.RequiredEnd.Success"),
    TextFieldMOuterLabelRequiredEndWarning("TextField.M.OuterLabel.RequiredEnd.Warning"),
    TextFieldMOuterLabelRequiredEndError("TextField.M.OuterLabel.RequiredEnd.Error"),
    TextFieldMInnerLabelDefault("TextField.M.InnerLabel.Default"),
    TextFieldMInnerLabelSuccess("TextField.M.InnerLabel.Success"),
    TextFieldMInnerLabelWarning("TextField.M.InnerLabel.Warning"),
    TextFieldMInnerLabelError("TextField.M.InnerLabel.Error"),
    TextFieldMInnerLabelRequiredStartDefault("TextField.M.InnerLabel.RequiredStart.Default"),
    TextFieldMInnerLabelRequiredStartSuccess("TextField.M.InnerLabel.RequiredStart.Success"),
    TextFieldMInnerLabelRequiredStartWarning("TextField.M.InnerLabel.RequiredStart.Warning"),
    TextFieldMInnerLabelRequiredStartError("TextField.M.InnerLabel.RequiredStart.Error"),
    TextFieldMInnerLabelRequiredEndDefault("TextField.M.InnerLabel.RequiredEnd.Default"),
    TextFieldMInnerLabelRequiredEndSuccess("TextField.M.InnerLabel.RequiredEnd.Success"),
    TextFieldMInnerLabelRequiredEndWarning("TextField.M.InnerLabel.RequiredEnd.Warning"),
    TextFieldMInnerLabelRequiredEndError("TextField.M.InnerLabel.RequiredEnd.Error"),
    TextFieldLDefault("TextField.L.Default"),
    TextFieldLSuccess("TextField.L.Success"),
    TextFieldLWarning("TextField.L.Warning"),
    TextFieldLError("TextField.L.Error"),
    TextFieldLRequiredStartDefault("TextField.L.RequiredStart.Default"),
    TextFieldLRequiredStartSuccess("TextField.L.RequiredStart.Success"),
    TextFieldLRequiredStartWarning("TextField.L.RequiredStart.Warning"),
    TextFieldLRequiredStartError("TextField.L.RequiredStart.Error"),
    TextFieldLRequiredEndDefault("TextField.L.RequiredEnd.Default"),
    TextFieldLRequiredEndSuccess("TextField.L.RequiredEnd.Success"),
    TextFieldLRequiredEndWarning("TextField.L.RequiredEnd.Warning"),
    TextFieldLRequiredEndError("TextField.L.RequiredEnd.Error"),
    TextFieldLOuterLabelDefault("TextField.L.OuterLabel.Default"),
    TextFieldLOuterLabelSuccess("TextField.L.OuterLabel.Success"),
    TextFieldLOuterLabelWarning("TextField.L.OuterLabel.Warning"),
    TextFieldLOuterLabelError("TextField.L.OuterLabel.Error"),
    TextFieldLOuterLabelRequiredStartDefault("TextField.L.OuterLabel.RequiredStart.Default"),
    TextFieldLOuterLabelRequiredStartSuccess("TextField.L.OuterLabel.RequiredStart.Success"),
    TextFieldLOuterLabelRequiredStartWarning("TextField.L.OuterLabel.RequiredStart.Warning"),
    TextFieldLOuterLabelRequiredStartError("TextField.L.OuterLabel.RequiredStart.Error"),
    TextFieldLOuterLabelRequiredEndDefault("TextField.L.OuterLabel.RequiredEnd.Default"),
    TextFieldLOuterLabelRequiredEndSuccess("TextField.L.OuterLabel.RequiredEnd.Success"),
    TextFieldLOuterLabelRequiredEndWarning("TextField.L.OuterLabel.RequiredEnd.Warning"),
    TextFieldLOuterLabelRequiredEndError("TextField.L.OuterLabel.RequiredEnd.Error"),
    TextFieldLInnerLabelDefault("TextField.L.InnerLabel.Default"),
    TextFieldLInnerLabelSuccess("TextField.L.InnerLabel.Success"),
    TextFieldLInnerLabelWarning("TextField.L.InnerLabel.Warning"),
    TextFieldLInnerLabelError("TextField.L.InnerLabel.Error"),
    TextFieldLInnerLabelRequiredStartDefault("TextField.L.InnerLabel.RequiredStart.Default"),
    TextFieldLInnerLabelRequiredStartSuccess("TextField.L.InnerLabel.RequiredStart.Success"),
    TextFieldLInnerLabelRequiredStartWarning("TextField.L.InnerLabel.RequiredStart.Warning"),
    TextFieldLInnerLabelRequiredStartError("TextField.L.InnerLabel.RequiredStart.Error"),
    TextFieldLInnerLabelRequiredEndDefault("TextField.L.InnerLabel.RequiredEnd.Default"),
    TextFieldLInnerLabelRequiredEndSuccess("TextField.L.InnerLabel.RequiredEnd.Success"),
    TextFieldLInnerLabelRequiredEndWarning("TextField.L.InnerLabel.RequiredEnd.Warning"),
    TextFieldLInnerLabelRequiredEndError("TextField.L.InnerLabel.RequiredEnd.Error"),
    TextFieldXlDefault("TextField.Xl.Default"),
    TextFieldXlSuccess("TextField.Xl.Success"),
    TextFieldXlWarning("TextField.Xl.Warning"),
    TextFieldXlError("TextField.Xl.Error"),
    TextFieldXlRequiredStartDefault("TextField.Xl.RequiredStart.Default"),
    TextFieldXlRequiredStartSuccess("TextField.Xl.RequiredStart.Success"),
    TextFieldXlRequiredStartWarning("TextField.Xl.RequiredStart.Warning"),
    TextFieldXlRequiredStartError("TextField.Xl.RequiredStart.Error"),
    TextFieldXlRequiredEndDefault("TextField.Xl.RequiredEnd.Default"),
    TextFieldXlRequiredEndSuccess("TextField.Xl.RequiredEnd.Success"),
    TextFieldXlRequiredEndWarning("TextField.Xl.RequiredEnd.Warning"),
    TextFieldXlRequiredEndError("TextField.Xl.RequiredEnd.Error"),
    TextFieldXlOuterLabelDefault("TextField.Xl.OuterLabel.Default"),
    TextFieldXlOuterLabelSuccess("TextField.Xl.OuterLabel.Success"),
    TextFieldXlOuterLabelWarning("TextField.Xl.OuterLabel.Warning"),
    TextFieldXlOuterLabelError("TextField.Xl.OuterLabel.Error"),
    TextFieldXlOuterLabelRequiredStartDefault("TextField.Xl.OuterLabel.RequiredStart.Default"),
    TextFieldXlOuterLabelRequiredStartSuccess("TextField.Xl.OuterLabel.RequiredStart.Success"),
    TextFieldXlOuterLabelRequiredStartWarning("TextField.Xl.OuterLabel.RequiredStart.Warning"),
    TextFieldXlOuterLabelRequiredStartError("TextField.Xl.OuterLabel.RequiredStart.Error"),
    TextFieldXlOuterLabelRequiredEndDefault("TextField.Xl.OuterLabel.RequiredEnd.Default"),
    TextFieldXlOuterLabelRequiredEndSuccess("TextField.Xl.OuterLabel.RequiredEnd.Success"),
    TextFieldXlOuterLabelRequiredEndWarning("TextField.Xl.OuterLabel.RequiredEnd.Warning"),
    TextFieldXlOuterLabelRequiredEndError("TextField.Xl.OuterLabel.RequiredEnd.Error"),
    TextFieldXlInnerLabelDefault("TextField.Xl.InnerLabel.Default"),
    TextFieldXlInnerLabelSuccess("TextField.Xl.InnerLabel.Success"),
    TextFieldXlInnerLabelWarning("TextField.Xl.InnerLabel.Warning"),
    TextFieldXlInnerLabelError("TextField.Xl.InnerLabel.Error"),
    TextFieldXlInnerLabelRequiredStartDefault("TextField.Xl.InnerLabel.RequiredStart.Default"),
    TextFieldXlInnerLabelRequiredStartSuccess("TextField.Xl.InnerLabel.RequiredStart.Success"),
    TextFieldXlInnerLabelRequiredStartWarning("TextField.Xl.InnerLabel.RequiredStart.Warning"),
    TextFieldXlInnerLabelRequiredStartError("TextField.Xl.InnerLabel.RequiredStart.Error"),
    TextFieldXlInnerLabelRequiredEndDefault("TextField.Xl.InnerLabel.RequiredEnd.Default"),
    TextFieldXlInnerLabelRequiredEndSuccess("TextField.Xl.InnerLabel.RequiredEnd.Success"),
    TextFieldXlInnerLabelRequiredEndWarning("TextField.Xl.InnerLabel.RequiredEnd.Warning"),
    TextFieldXlInnerLabelRequiredEndError("TextField.Xl.InnerLabel.RequiredEnd.Error"),
    TextFieldClearXsDefault("TextFieldClear.Xs.Default"),
    TextFieldClearXsSuccess("TextFieldClear.Xs.Success"),
    TextFieldClearXsWarning("TextFieldClear.Xs.Warning"),
    TextFieldClearXsError("TextFieldClear.Xs.Error"),
    TextFieldClearXsRequiredStartDefault("TextFieldClear.Xs.RequiredStart.Default"),
    TextFieldClearXsRequiredStartSuccess("TextFieldClear.Xs.RequiredStart.Success"),
    TextFieldClearXsRequiredStartWarning("TextFieldClear.Xs.RequiredStart.Warning"),
    TextFieldClearXsRequiredStartError("TextFieldClear.Xs.RequiredStart.Error"),
    TextFieldClearXsRequiredEndDefault("TextFieldClear.Xs.RequiredEnd.Default"),
    TextFieldClearXsRequiredEndSuccess("TextFieldClear.Xs.RequiredEnd.Success"),
    TextFieldClearXsRequiredEndWarning("TextFieldClear.Xs.RequiredEnd.Warning"),
    TextFieldClearXsRequiredEndError("TextFieldClear.Xs.RequiredEnd.Error"),
    TextFieldClearXsOuterLabelDefault("TextFieldClear.Xs.OuterLabel.Default"),
    TextFieldClearXsOuterLabelSuccess("TextFieldClear.Xs.OuterLabel.Success"),
    TextFieldClearXsOuterLabelWarning("TextFieldClear.Xs.OuterLabel.Warning"),
    TextFieldClearXsOuterLabelError("TextFieldClear.Xs.OuterLabel.Error"),
    TextFieldClearXsOuterLabelRequiredStartDefault("TextFieldClear.Xs.OuterLabel.RequiredStart.Default"),
    TextFieldClearXsOuterLabelRequiredStartSuccess("TextFieldClear.Xs.OuterLabel.RequiredStart.Success"),
    TextFieldClearXsOuterLabelRequiredStartWarning("TextFieldClear.Xs.OuterLabel.RequiredStart.Warning"),
    TextFieldClearXsOuterLabelRequiredStartError("TextFieldClear.Xs.OuterLabel.RequiredStart.Error"),
    TextFieldClearXsOuterLabelRequiredEndDefault("TextFieldClear.Xs.OuterLabel.RequiredEnd.Default"),
    TextFieldClearXsOuterLabelRequiredEndSuccess("TextFieldClear.Xs.OuterLabel.RequiredEnd.Success"),
    TextFieldClearXsOuterLabelRequiredEndWarning("TextFieldClear.Xs.OuterLabel.RequiredEnd.Warning"),
    TextFieldClearXsOuterLabelRequiredEndError("TextFieldClear.Xs.OuterLabel.RequiredEnd.Error"),
    TextFieldClearSDefault("TextFieldClear.S.Default"),
    TextFieldClearSSuccess("TextFieldClear.S.Success"),
    TextFieldClearSWarning("TextFieldClear.S.Warning"),
    TextFieldClearSError("TextFieldClear.S.Error"),
    TextFieldClearSRequiredStartDefault("TextFieldClear.S.RequiredStart.Default"),
    TextFieldClearSRequiredStartSuccess("TextFieldClear.S.RequiredStart.Success"),
    TextFieldClearSRequiredStartWarning("TextFieldClear.S.RequiredStart.Warning"),
    TextFieldClearSRequiredStartError("TextFieldClear.S.RequiredStart.Error"),
    TextFieldClearSRequiredEndDefault("TextFieldClear.S.RequiredEnd.Default"),
    TextFieldClearSRequiredEndSuccess("TextFieldClear.S.RequiredEnd.Success"),
    TextFieldClearSRequiredEndWarning("TextFieldClear.S.RequiredEnd.Warning"),
    TextFieldClearSRequiredEndError("TextFieldClear.S.RequiredEnd.Error"),
    TextFieldClearSOuterLabelDefault("TextFieldClear.S.OuterLabel.Default"),
    TextFieldClearSOuterLabelSuccess("TextFieldClear.S.OuterLabel.Success"),
    TextFieldClearSOuterLabelWarning("TextFieldClear.S.OuterLabel.Warning"),
    TextFieldClearSOuterLabelError("TextFieldClear.S.OuterLabel.Error"),
    TextFieldClearSOuterLabelRequiredStartDefault("TextFieldClear.S.OuterLabel.RequiredStart.Default"),
    TextFieldClearSOuterLabelRequiredStartSuccess("TextFieldClear.S.OuterLabel.RequiredStart.Success"),
    TextFieldClearSOuterLabelRequiredStartWarning("TextFieldClear.S.OuterLabel.RequiredStart.Warning"),
    TextFieldClearSOuterLabelRequiredStartError("TextFieldClear.S.OuterLabel.RequiredStart.Error"),
    TextFieldClearSOuterLabelRequiredEndDefault("TextFieldClear.S.OuterLabel.RequiredEnd.Default"),
    TextFieldClearSOuterLabelRequiredEndSuccess("TextFieldClear.S.OuterLabel.RequiredEnd.Success"),
    TextFieldClearSOuterLabelRequiredEndWarning("TextFieldClear.S.OuterLabel.RequiredEnd.Warning"),
    TextFieldClearSOuterLabelRequiredEndError("TextFieldClear.S.OuterLabel.RequiredEnd.Error"),
    TextFieldClearSInnerLabelDefault("TextFieldClear.S.InnerLabel.Default"),
    TextFieldClearSInnerLabelSuccess("TextFieldClear.S.InnerLabel.Success"),
    TextFieldClearSInnerLabelWarning("TextFieldClear.S.InnerLabel.Warning"),
    TextFieldClearSInnerLabelError("TextFieldClear.S.InnerLabel.Error"),
    TextFieldClearSInnerLabelRequiredStartDefault("TextFieldClear.S.InnerLabel.RequiredStart.Default"),
    TextFieldClearSInnerLabelRequiredStartSuccess("TextFieldClear.S.InnerLabel.RequiredStart.Success"),
    TextFieldClearSInnerLabelRequiredStartWarning("TextFieldClear.S.InnerLabel.RequiredStart.Warning"),
    TextFieldClearSInnerLabelRequiredStartError("TextFieldClear.S.InnerLabel.RequiredStart.Error"),
    TextFieldClearSInnerLabelRequiredEndDefault("TextFieldClear.S.InnerLabel.RequiredEnd.Default"),
    TextFieldClearSInnerLabelRequiredEndSuccess("TextFieldClear.S.InnerLabel.RequiredEnd.Success"),
    TextFieldClearSInnerLabelRequiredEndWarning("TextFieldClear.S.InnerLabel.RequiredEnd.Warning"),
    TextFieldClearSInnerLabelRequiredEndError("TextFieldClear.S.InnerLabel.RequiredEnd.Error"),
    TextFieldClearMDefault("TextFieldClear.M.Default"),
    TextFieldClearMSuccess("TextFieldClear.M.Success"),
    TextFieldClearMWarning("TextFieldClear.M.Warning"),
    TextFieldClearMError("TextFieldClear.M.Error"),
    TextFieldClearMRequiredStartDefault("TextFieldClear.M.RequiredStart.Default"),
    TextFieldClearMRequiredStartSuccess("TextFieldClear.M.RequiredStart.Success"),
    TextFieldClearMRequiredStartWarning("TextFieldClear.M.RequiredStart.Warning"),
    TextFieldClearMRequiredStartError("TextFieldClear.M.RequiredStart.Error"),
    TextFieldClearMRequiredEndDefault("TextFieldClear.M.RequiredEnd.Default"),
    TextFieldClearMRequiredEndSuccess("TextFieldClear.M.RequiredEnd.Success"),
    TextFieldClearMRequiredEndWarning("TextFieldClear.M.RequiredEnd.Warning"),
    TextFieldClearMRequiredEndError("TextFieldClear.M.RequiredEnd.Error"),
    TextFieldClearMOuterLabelDefault("TextFieldClear.M.OuterLabel.Default"),
    TextFieldClearMOuterLabelSuccess("TextFieldClear.M.OuterLabel.Success"),
    TextFieldClearMOuterLabelWarning("TextFieldClear.M.OuterLabel.Warning"),
    TextFieldClearMOuterLabelError("TextFieldClear.M.OuterLabel.Error"),
    TextFieldClearMOuterLabelRequiredStartDefault("TextFieldClear.M.OuterLabel.RequiredStart.Default"),
    TextFieldClearMOuterLabelRequiredStartSuccess("TextFieldClear.M.OuterLabel.RequiredStart.Success"),
    TextFieldClearMOuterLabelRequiredStartWarning("TextFieldClear.M.OuterLabel.RequiredStart.Warning"),
    TextFieldClearMOuterLabelRequiredStartError("TextFieldClear.M.OuterLabel.RequiredStart.Error"),
    TextFieldClearMOuterLabelRequiredEndDefault("TextFieldClear.M.OuterLabel.RequiredEnd.Default"),
    TextFieldClearMOuterLabelRequiredEndSuccess("TextFieldClear.M.OuterLabel.RequiredEnd.Success"),
    TextFieldClearMOuterLabelRequiredEndWarning("TextFieldClear.M.OuterLabel.RequiredEnd.Warning"),
    TextFieldClearMOuterLabelRequiredEndError("TextFieldClear.M.OuterLabel.RequiredEnd.Error"),
    TextFieldClearMInnerLabelDefault("TextFieldClear.M.InnerLabel.Default"),
    TextFieldClearMInnerLabelSuccess("TextFieldClear.M.InnerLabel.Success"),
    TextFieldClearMInnerLabelWarning("TextFieldClear.M.InnerLabel.Warning"),
    TextFieldClearMInnerLabelError("TextFieldClear.M.InnerLabel.Error"),
    TextFieldClearMInnerLabelRequiredStartDefault("TextFieldClear.M.InnerLabel.RequiredStart.Default"),
    TextFieldClearMInnerLabelRequiredStartSuccess("TextFieldClear.M.InnerLabel.RequiredStart.Success"),
    TextFieldClearMInnerLabelRequiredStartWarning("TextFieldClear.M.InnerLabel.RequiredStart.Warning"),
    TextFieldClearMInnerLabelRequiredStartError("TextFieldClear.M.InnerLabel.RequiredStart.Error"),
    TextFieldClearMInnerLabelRequiredEndDefault("TextFieldClear.M.InnerLabel.RequiredEnd.Default"),
    TextFieldClearMInnerLabelRequiredEndSuccess("TextFieldClear.M.InnerLabel.RequiredEnd.Success"),
    TextFieldClearMInnerLabelRequiredEndWarning("TextFieldClear.M.InnerLabel.RequiredEnd.Warning"),
    TextFieldClearMInnerLabelRequiredEndError("TextFieldClear.M.InnerLabel.RequiredEnd.Error"),
    TextFieldClearLDefault("TextFieldClear.L.Default"),
    TextFieldClearLSuccess("TextFieldClear.L.Success"),
    TextFieldClearLWarning("TextFieldClear.L.Warning"),
    TextFieldClearLError("TextFieldClear.L.Error"),
    TextFieldClearLRequiredStartDefault("TextFieldClear.L.RequiredStart.Default"),
    TextFieldClearLRequiredStartSuccess("TextFieldClear.L.RequiredStart.Success"),
    TextFieldClearLRequiredStartWarning("TextFieldClear.L.RequiredStart.Warning"),
    TextFieldClearLRequiredStartError("TextFieldClear.L.RequiredStart.Error"),
    TextFieldClearLRequiredEndDefault("TextFieldClear.L.RequiredEnd.Default"),
    TextFieldClearLRequiredEndSuccess("TextFieldClear.L.RequiredEnd.Success"),
    TextFieldClearLRequiredEndWarning("TextFieldClear.L.RequiredEnd.Warning"),
    TextFieldClearLRequiredEndError("TextFieldClear.L.RequiredEnd.Error"),
    TextFieldClearLOuterLabelDefault("TextFieldClear.L.OuterLabel.Default"),
    TextFieldClearLOuterLabelSuccess("TextFieldClear.L.OuterLabel.Success"),
    TextFieldClearLOuterLabelWarning("TextFieldClear.L.OuterLabel.Warning"),
    TextFieldClearLOuterLabelError("TextFieldClear.L.OuterLabel.Error"),
    TextFieldClearLOuterLabelRequiredStartDefault("TextFieldClear.L.OuterLabel.RequiredStart.Default"),
    TextFieldClearLOuterLabelRequiredStartSuccess("TextFieldClear.L.OuterLabel.RequiredStart.Success"),
    TextFieldClearLOuterLabelRequiredStartWarning("TextFieldClear.L.OuterLabel.RequiredStart.Warning"),
    TextFieldClearLOuterLabelRequiredStartError("TextFieldClear.L.OuterLabel.RequiredStart.Error"),
    TextFieldClearLOuterLabelRequiredEndDefault("TextFieldClear.L.OuterLabel.RequiredEnd.Default"),
    TextFieldClearLOuterLabelRequiredEndSuccess("TextFieldClear.L.OuterLabel.RequiredEnd.Success"),
    TextFieldClearLOuterLabelRequiredEndWarning("TextFieldClear.L.OuterLabel.RequiredEnd.Warning"),
    TextFieldClearLOuterLabelRequiredEndError("TextFieldClear.L.OuterLabel.RequiredEnd.Error"),
    TextFieldClearLInnerLabelDefault("TextFieldClear.L.InnerLabel.Default"),
    TextFieldClearLInnerLabelSuccess("TextFieldClear.L.InnerLabel.Success"),
    TextFieldClearLInnerLabelWarning("TextFieldClear.L.InnerLabel.Warning"),
    TextFieldClearLInnerLabelError("TextFieldClear.L.InnerLabel.Error"),
    TextFieldClearLInnerLabelRequiredStartDefault("TextFieldClear.L.InnerLabel.RequiredStart.Default"),
    TextFieldClearLInnerLabelRequiredStartSuccess("TextFieldClear.L.InnerLabel.RequiredStart.Success"),
    TextFieldClearLInnerLabelRequiredStartWarning("TextFieldClear.L.InnerLabel.RequiredStart.Warning"),
    TextFieldClearLInnerLabelRequiredStartError("TextFieldClear.L.InnerLabel.RequiredStart.Error"),
    TextFieldClearLInnerLabelRequiredEndDefault("TextFieldClear.L.InnerLabel.RequiredEnd.Default"),
    TextFieldClearLInnerLabelRequiredEndSuccess("TextFieldClear.L.InnerLabel.RequiredEnd.Success"),
    TextFieldClearLInnerLabelRequiredEndWarning("TextFieldClear.L.InnerLabel.RequiredEnd.Warning"),
    TextFieldClearLInnerLabelRequiredEndError("TextFieldClear.L.InnerLabel.RequiredEnd.Error"),
    TextFieldClearXlDefault("TextFieldClear.Xl.Default"),
    TextFieldClearXlSuccess("TextFieldClear.Xl.Success"),
    TextFieldClearXlWarning("TextFieldClear.Xl.Warning"),
    TextFieldClearXlError("TextFieldClear.Xl.Error"),
    TextFieldClearXlRequiredStartDefault("TextFieldClear.Xl.RequiredStart.Default"),
    TextFieldClearXlRequiredStartSuccess("TextFieldClear.Xl.RequiredStart.Success"),
    TextFieldClearXlRequiredStartWarning("TextFieldClear.Xl.RequiredStart.Warning"),
    TextFieldClearXlRequiredStartError("TextFieldClear.Xl.RequiredStart.Error"),
    TextFieldClearXlRequiredEndDefault("TextFieldClear.Xl.RequiredEnd.Default"),
    TextFieldClearXlRequiredEndSuccess("TextFieldClear.Xl.RequiredEnd.Success"),
    TextFieldClearXlRequiredEndWarning("TextFieldClear.Xl.RequiredEnd.Warning"),
    TextFieldClearXlRequiredEndError("TextFieldClear.Xl.RequiredEnd.Error"),
    TextFieldClearXlOuterLabelDefault("TextFieldClear.Xl.OuterLabel.Default"),
    TextFieldClearXlOuterLabelSuccess("TextFieldClear.Xl.OuterLabel.Success"),
    TextFieldClearXlOuterLabelWarning("TextFieldClear.Xl.OuterLabel.Warning"),
    TextFieldClearXlOuterLabelError("TextFieldClear.Xl.OuterLabel.Error"),
    TextFieldClearXlOuterLabelRequiredStartDefault("TextFieldClear.Xl.OuterLabel.RequiredStart.Default"),
    TextFieldClearXlOuterLabelRequiredStartSuccess("TextFieldClear.Xl.OuterLabel.RequiredStart.Success"),
    TextFieldClearXlOuterLabelRequiredStartWarning("TextFieldClear.Xl.OuterLabel.RequiredStart.Warning"),
    TextFieldClearXlOuterLabelRequiredStartError("TextFieldClear.Xl.OuterLabel.RequiredStart.Error"),
    TextFieldClearXlOuterLabelRequiredEndDefault("TextFieldClear.Xl.OuterLabel.RequiredEnd.Default"),
    TextFieldClearXlOuterLabelRequiredEndSuccess("TextFieldClear.Xl.OuterLabel.RequiredEnd.Success"),
    TextFieldClearXlOuterLabelRequiredEndWarning("TextFieldClear.Xl.OuterLabel.RequiredEnd.Warning"),
    TextFieldClearXlOuterLabelRequiredEndError("TextFieldClear.Xl.OuterLabel.RequiredEnd.Error"),
    TextFieldClearXlInnerLabelDefault("TextFieldClear.Xl.InnerLabel.Default"),
    TextFieldClearXlInnerLabelSuccess("TextFieldClear.Xl.InnerLabel.Success"),
    TextFieldClearXlInnerLabelWarning("TextFieldClear.Xl.InnerLabel.Warning"),
    TextFieldClearXlInnerLabelError("TextFieldClear.Xl.InnerLabel.Error"),
    TextFieldClearXlInnerLabelRequiredStartDefault("TextFieldClear.Xl.InnerLabel.RequiredStart.Default"),
    TextFieldClearXlInnerLabelRequiredStartSuccess("TextFieldClear.Xl.InnerLabel.RequiredStart.Success"),
    TextFieldClearXlInnerLabelRequiredStartWarning("TextFieldClear.Xl.InnerLabel.RequiredStart.Warning"),
    TextFieldClearXlInnerLabelRequiredStartError("TextFieldClear.Xl.InnerLabel.RequiredStart.Error"),
    TextFieldClearXlInnerLabelRequiredEndDefault("TextFieldClear.Xl.InnerLabel.RequiredEnd.Default"),
    TextFieldClearXlInnerLabelRequiredEndSuccess("TextFieldClear.Xl.InnerLabel.RequiredEnd.Success"),
    TextFieldClearXlInnerLabelRequiredEndWarning("TextFieldClear.Xl.InnerLabel.RequiredEnd.Warning"),
    TextFieldClearXlInnerLabelRequiredEndError("TextFieldClear.Xl.InnerLabel.RequiredEnd.Error"),
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
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства required-placement для text-field
 */
public enum class TextFieldDefaultRequiredPlacement {
    None,
    Start,
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
}

/**
 * Возможные значения свойства size для text-field-clear
 */
public enum class TextFieldClearSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства required-placement для text-field-clear
 */
public enum class TextFieldClearRequiredPlacement {
    None,
    Start,
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
        TextFieldStyles.TextFieldXsRequiredStartDefault -> TextField.Xs.RequiredStart.Default
        TextFieldStyles.TextFieldXsRequiredStartSuccess -> TextField.Xs.RequiredStart.Success
        TextFieldStyles.TextFieldXsRequiredStartWarning -> TextField.Xs.RequiredStart.Warning
        TextFieldStyles.TextFieldXsRequiredStartError -> TextField.Xs.RequiredStart.Error
        TextFieldStyles.TextFieldXsRequiredEndDefault -> TextField.Xs.RequiredEnd.Default
        TextFieldStyles.TextFieldXsRequiredEndSuccess -> TextField.Xs.RequiredEnd.Success
        TextFieldStyles.TextFieldXsRequiredEndWarning -> TextField.Xs.RequiredEnd.Warning
        TextFieldStyles.TextFieldXsRequiredEndError -> TextField.Xs.RequiredEnd.Error
        TextFieldStyles.TextFieldXsOuterLabelDefault -> TextField.Xs.OuterLabel.Default
        TextFieldStyles.TextFieldXsOuterLabelSuccess -> TextField.Xs.OuterLabel.Success
        TextFieldStyles.TextFieldXsOuterLabelWarning -> TextField.Xs.OuterLabel.Warning
        TextFieldStyles.TextFieldXsOuterLabelError -> TextField.Xs.OuterLabel.Error
        TextFieldStyles.TextFieldXsOuterLabelRequiredStartDefault ->
            TextField.Xs.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldXsOuterLabelRequiredStartSuccess ->
            TextField.Xs.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldXsOuterLabelRequiredStartWarning ->
            TextField.Xs.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldXsOuterLabelRequiredStartError ->
            TextField.Xs.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndDefault ->
            TextField.Xs.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndSuccess ->
            TextField.Xs.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndWarning ->
            TextField.Xs.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldXsOuterLabelRequiredEndError ->
            TextField.Xs.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldSDefault -> TextField.S.Default
        TextFieldStyles.TextFieldSSuccess -> TextField.S.Success
        TextFieldStyles.TextFieldSWarning -> TextField.S.Warning
        TextFieldStyles.TextFieldSError -> TextField.S.Error
        TextFieldStyles.TextFieldSRequiredStartDefault -> TextField.S.RequiredStart.Default
        TextFieldStyles.TextFieldSRequiredStartSuccess -> TextField.S.RequiredStart.Success
        TextFieldStyles.TextFieldSRequiredStartWarning -> TextField.S.RequiredStart.Warning
        TextFieldStyles.TextFieldSRequiredStartError -> TextField.S.RequiredStart.Error
        TextFieldStyles.TextFieldSRequiredEndDefault -> TextField.S.RequiredEnd.Default
        TextFieldStyles.TextFieldSRequiredEndSuccess -> TextField.S.RequiredEnd.Success
        TextFieldStyles.TextFieldSRequiredEndWarning -> TextField.S.RequiredEnd.Warning
        TextFieldStyles.TextFieldSRequiredEndError -> TextField.S.RequiredEnd.Error
        TextFieldStyles.TextFieldSOuterLabelDefault -> TextField.S.OuterLabel.Default
        TextFieldStyles.TextFieldSOuterLabelSuccess -> TextField.S.OuterLabel.Success
        TextFieldStyles.TextFieldSOuterLabelWarning -> TextField.S.OuterLabel.Warning
        TextFieldStyles.TextFieldSOuterLabelError -> TextField.S.OuterLabel.Error
        TextFieldStyles.TextFieldSOuterLabelRequiredStartDefault ->
            TextField.S.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldSOuterLabelRequiredStartSuccess ->
            TextField.S.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldSOuterLabelRequiredStartWarning ->
            TextField.S.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldSOuterLabelRequiredStartError ->
            TextField.S.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldSOuterLabelRequiredEndDefault ->
            TextField.S.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldSOuterLabelRequiredEndSuccess ->
            TextField.S.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldSOuterLabelRequiredEndWarning ->
            TextField.S.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldSOuterLabelRequiredEndError ->
            TextField.S.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldSInnerLabelDefault -> TextField.S.InnerLabel.Default
        TextFieldStyles.TextFieldSInnerLabelSuccess -> TextField.S.InnerLabel.Success
        TextFieldStyles.TextFieldSInnerLabelWarning -> TextField.S.InnerLabel.Warning
        TextFieldStyles.TextFieldSInnerLabelError -> TextField.S.InnerLabel.Error
        TextFieldStyles.TextFieldSInnerLabelRequiredStartDefault ->
            TextField.S.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldSInnerLabelRequiredStartSuccess ->
            TextField.S.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldSInnerLabelRequiredStartWarning ->
            TextField.S.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldSInnerLabelRequiredStartError ->
            TextField.S.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldSInnerLabelRequiredEndDefault ->
            TextField.S.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldSInnerLabelRequiredEndSuccess ->
            TextField.S.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldSInnerLabelRequiredEndWarning ->
            TextField.S.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldSInnerLabelRequiredEndError ->
            TextField.S.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldMDefault -> TextField.M.Default
        TextFieldStyles.TextFieldMSuccess -> TextField.M.Success
        TextFieldStyles.TextFieldMWarning -> TextField.M.Warning
        TextFieldStyles.TextFieldMError -> TextField.M.Error
        TextFieldStyles.TextFieldMRequiredStartDefault -> TextField.M.RequiredStart.Default
        TextFieldStyles.TextFieldMRequiredStartSuccess -> TextField.M.RequiredStart.Success
        TextFieldStyles.TextFieldMRequiredStartWarning -> TextField.M.RequiredStart.Warning
        TextFieldStyles.TextFieldMRequiredStartError -> TextField.M.RequiredStart.Error
        TextFieldStyles.TextFieldMRequiredEndDefault -> TextField.M.RequiredEnd.Default
        TextFieldStyles.TextFieldMRequiredEndSuccess -> TextField.M.RequiredEnd.Success
        TextFieldStyles.TextFieldMRequiredEndWarning -> TextField.M.RequiredEnd.Warning
        TextFieldStyles.TextFieldMRequiredEndError -> TextField.M.RequiredEnd.Error
        TextFieldStyles.TextFieldMOuterLabelDefault -> TextField.M.OuterLabel.Default
        TextFieldStyles.TextFieldMOuterLabelSuccess -> TextField.M.OuterLabel.Success
        TextFieldStyles.TextFieldMOuterLabelWarning -> TextField.M.OuterLabel.Warning
        TextFieldStyles.TextFieldMOuterLabelError -> TextField.M.OuterLabel.Error
        TextFieldStyles.TextFieldMOuterLabelRequiredStartDefault ->
            TextField.M.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldMOuterLabelRequiredStartSuccess ->
            TextField.M.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldMOuterLabelRequiredStartWarning ->
            TextField.M.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldMOuterLabelRequiredStartError ->
            TextField.M.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldMOuterLabelRequiredEndDefault ->
            TextField.M.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldMOuterLabelRequiredEndSuccess ->
            TextField.M.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldMOuterLabelRequiredEndWarning ->
            TextField.M.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldMOuterLabelRequiredEndError ->
            TextField.M.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldMInnerLabelDefault -> TextField.M.InnerLabel.Default
        TextFieldStyles.TextFieldMInnerLabelSuccess -> TextField.M.InnerLabel.Success
        TextFieldStyles.TextFieldMInnerLabelWarning -> TextField.M.InnerLabel.Warning
        TextFieldStyles.TextFieldMInnerLabelError -> TextField.M.InnerLabel.Error
        TextFieldStyles.TextFieldMInnerLabelRequiredStartDefault ->
            TextField.M.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldMInnerLabelRequiredStartSuccess ->
            TextField.M.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldMInnerLabelRequiredStartWarning ->
            TextField.M.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldMInnerLabelRequiredStartError ->
            TextField.M.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldMInnerLabelRequiredEndDefault ->
            TextField.M.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldMInnerLabelRequiredEndSuccess ->
            TextField.M.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldMInnerLabelRequiredEndWarning ->
            TextField.M.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldMInnerLabelRequiredEndError ->
            TextField.M.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldLDefault -> TextField.L.Default
        TextFieldStyles.TextFieldLSuccess -> TextField.L.Success
        TextFieldStyles.TextFieldLWarning -> TextField.L.Warning
        TextFieldStyles.TextFieldLError -> TextField.L.Error
        TextFieldStyles.TextFieldLRequiredStartDefault -> TextField.L.RequiredStart.Default
        TextFieldStyles.TextFieldLRequiredStartSuccess -> TextField.L.RequiredStart.Success
        TextFieldStyles.TextFieldLRequiredStartWarning -> TextField.L.RequiredStart.Warning
        TextFieldStyles.TextFieldLRequiredStartError -> TextField.L.RequiredStart.Error
        TextFieldStyles.TextFieldLRequiredEndDefault -> TextField.L.RequiredEnd.Default
        TextFieldStyles.TextFieldLRequiredEndSuccess -> TextField.L.RequiredEnd.Success
        TextFieldStyles.TextFieldLRequiredEndWarning -> TextField.L.RequiredEnd.Warning
        TextFieldStyles.TextFieldLRequiredEndError -> TextField.L.RequiredEnd.Error
        TextFieldStyles.TextFieldLOuterLabelDefault -> TextField.L.OuterLabel.Default
        TextFieldStyles.TextFieldLOuterLabelSuccess -> TextField.L.OuterLabel.Success
        TextFieldStyles.TextFieldLOuterLabelWarning -> TextField.L.OuterLabel.Warning
        TextFieldStyles.TextFieldLOuterLabelError -> TextField.L.OuterLabel.Error
        TextFieldStyles.TextFieldLOuterLabelRequiredStartDefault ->
            TextField.L.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldLOuterLabelRequiredStartSuccess ->
            TextField.L.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldLOuterLabelRequiredStartWarning ->
            TextField.L.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldLOuterLabelRequiredStartError ->
            TextField.L.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldLOuterLabelRequiredEndDefault ->
            TextField.L.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldLOuterLabelRequiredEndSuccess ->
            TextField.L.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldLOuterLabelRequiredEndWarning ->
            TextField.L.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldLOuterLabelRequiredEndError ->
            TextField.L.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldLInnerLabelDefault -> TextField.L.InnerLabel.Default
        TextFieldStyles.TextFieldLInnerLabelSuccess -> TextField.L.InnerLabel.Success
        TextFieldStyles.TextFieldLInnerLabelWarning -> TextField.L.InnerLabel.Warning
        TextFieldStyles.TextFieldLInnerLabelError -> TextField.L.InnerLabel.Error
        TextFieldStyles.TextFieldLInnerLabelRequiredStartDefault ->
            TextField.L.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldLInnerLabelRequiredStartSuccess ->
            TextField.L.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldLInnerLabelRequiredStartWarning ->
            TextField.L.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldLInnerLabelRequiredStartError ->
            TextField.L.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldLInnerLabelRequiredEndDefault ->
            TextField.L.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldLInnerLabelRequiredEndSuccess ->
            TextField.L.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldLInnerLabelRequiredEndWarning ->
            TextField.L.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldLInnerLabelRequiredEndError ->
            TextField.L.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldXlDefault -> TextField.Xl.Default
        TextFieldStyles.TextFieldXlSuccess -> TextField.Xl.Success
        TextFieldStyles.TextFieldXlWarning -> TextField.Xl.Warning
        TextFieldStyles.TextFieldXlError -> TextField.Xl.Error
        TextFieldStyles.TextFieldXlRequiredStartDefault -> TextField.Xl.RequiredStart.Default
        TextFieldStyles.TextFieldXlRequiredStartSuccess -> TextField.Xl.RequiredStart.Success
        TextFieldStyles.TextFieldXlRequiredStartWarning -> TextField.Xl.RequiredStart.Warning
        TextFieldStyles.TextFieldXlRequiredStartError -> TextField.Xl.RequiredStart.Error
        TextFieldStyles.TextFieldXlRequiredEndDefault -> TextField.Xl.RequiredEnd.Default
        TextFieldStyles.TextFieldXlRequiredEndSuccess -> TextField.Xl.RequiredEnd.Success
        TextFieldStyles.TextFieldXlRequiredEndWarning -> TextField.Xl.RequiredEnd.Warning
        TextFieldStyles.TextFieldXlRequiredEndError -> TextField.Xl.RequiredEnd.Error
        TextFieldStyles.TextFieldXlOuterLabelDefault -> TextField.Xl.OuterLabel.Default
        TextFieldStyles.TextFieldXlOuterLabelSuccess -> TextField.Xl.OuterLabel.Success
        TextFieldStyles.TextFieldXlOuterLabelWarning -> TextField.Xl.OuterLabel.Warning
        TextFieldStyles.TextFieldXlOuterLabelError -> TextField.Xl.OuterLabel.Error
        TextFieldStyles.TextFieldXlOuterLabelRequiredStartDefault ->
            TextField.Xl.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldXlOuterLabelRequiredStartSuccess ->
            TextField.Xl.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldXlOuterLabelRequiredStartWarning ->
            TextField.Xl.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldXlOuterLabelRequiredStartError ->
            TextField.Xl.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldXlOuterLabelRequiredEndDefault ->
            TextField.Xl.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldXlOuterLabelRequiredEndSuccess ->
            TextField.Xl.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldXlOuterLabelRequiredEndWarning ->
            TextField.Xl.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldXlOuterLabelRequiredEndError ->
            TextField.Xl.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldXlInnerLabelDefault -> TextField.Xl.InnerLabel.Default
        TextFieldStyles.TextFieldXlInnerLabelSuccess -> TextField.Xl.InnerLabel.Success
        TextFieldStyles.TextFieldXlInnerLabelWarning -> TextField.Xl.InnerLabel.Warning
        TextFieldStyles.TextFieldXlInnerLabelError -> TextField.Xl.InnerLabel.Error
        TextFieldStyles.TextFieldXlInnerLabelRequiredStartDefault ->
            TextField.Xl.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldXlInnerLabelRequiredStartSuccess ->
            TextField.Xl.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldXlInnerLabelRequiredStartWarning ->
            TextField.Xl.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldXlInnerLabelRequiredStartError ->
            TextField.Xl.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldXlInnerLabelRequiredEndDefault ->
            TextField.Xl.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldXlInnerLabelRequiredEndSuccess ->
            TextField.Xl.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldXlInnerLabelRequiredEndWarning ->
            TextField.Xl.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldXlInnerLabelRequiredEndError ->
            TextField.Xl.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearXsDefault -> TextFieldClear.Xs.Default
        TextFieldStyles.TextFieldClearXsSuccess -> TextFieldClear.Xs.Success
        TextFieldStyles.TextFieldClearXsWarning -> TextFieldClear.Xs.Warning
        TextFieldStyles.TextFieldClearXsError -> TextFieldClear.Xs.Error
        TextFieldStyles.TextFieldClearXsRequiredStartDefault ->
            TextFieldClear.Xs.RequiredStart.Default
        TextFieldStyles.TextFieldClearXsRequiredStartSuccess ->
            TextFieldClear.Xs.RequiredStart.Success
        TextFieldStyles.TextFieldClearXsRequiredStartWarning ->
            TextFieldClear.Xs.RequiredStart.Warning
        TextFieldStyles.TextFieldClearXsRequiredStartError -> TextFieldClear.Xs.RequiredStart.Error
        TextFieldStyles.TextFieldClearXsRequiredEndDefault -> TextFieldClear.Xs.RequiredEnd.Default
        TextFieldStyles.TextFieldClearXsRequiredEndSuccess -> TextFieldClear.Xs.RequiredEnd.Success
        TextFieldStyles.TextFieldClearXsRequiredEndWarning -> TextFieldClear.Xs.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearXsRequiredEndError -> TextFieldClear.Xs.RequiredEnd.Error
        TextFieldStyles.TextFieldClearXsOuterLabelDefault -> TextFieldClear.Xs.OuterLabel.Default
        TextFieldStyles.TextFieldClearXsOuterLabelSuccess -> TextFieldClear.Xs.OuterLabel.Success
        TextFieldStyles.TextFieldClearXsOuterLabelWarning -> TextFieldClear.Xs.OuterLabel.Warning
        TextFieldStyles.TextFieldClearXsOuterLabelError -> TextFieldClear.Xs.OuterLabel.Error
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartDefault ->
            TextFieldClear.Xs.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartSuccess ->
            TextFieldClear.Xs.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartWarning ->
            TextFieldClear.Xs.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartError ->
            TextFieldClear.Xs.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndDefault ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndSuccess ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndWarning ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredEndError ->
            TextFieldClear.Xs.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearSDefault -> TextFieldClear.S.Default
        TextFieldStyles.TextFieldClearSSuccess -> TextFieldClear.S.Success
        TextFieldStyles.TextFieldClearSWarning -> TextFieldClear.S.Warning
        TextFieldStyles.TextFieldClearSError -> TextFieldClear.S.Error
        TextFieldStyles.TextFieldClearSRequiredStartDefault -> TextFieldClear.S.RequiredStart.Default
        TextFieldStyles.TextFieldClearSRequiredStartSuccess -> TextFieldClear.S.RequiredStart.Success
        TextFieldStyles.TextFieldClearSRequiredStartWarning -> TextFieldClear.S.RequiredStart.Warning
        TextFieldStyles.TextFieldClearSRequiredStartError -> TextFieldClear.S.RequiredStart.Error
        TextFieldStyles.TextFieldClearSRequiredEndDefault -> TextFieldClear.S.RequiredEnd.Default
        TextFieldStyles.TextFieldClearSRequiredEndSuccess -> TextFieldClear.S.RequiredEnd.Success
        TextFieldStyles.TextFieldClearSRequiredEndWarning -> TextFieldClear.S.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearSRequiredEndError -> TextFieldClear.S.RequiredEnd.Error
        TextFieldStyles.TextFieldClearSOuterLabelDefault -> TextFieldClear.S.OuterLabel.Default
        TextFieldStyles.TextFieldClearSOuterLabelSuccess -> TextFieldClear.S.OuterLabel.Success
        TextFieldStyles.TextFieldClearSOuterLabelWarning -> TextFieldClear.S.OuterLabel.Warning
        TextFieldStyles.TextFieldClearSOuterLabelError -> TextFieldClear.S.OuterLabel.Error
        TextFieldStyles.TextFieldClearSOuterLabelRequiredStartDefault ->
            TextFieldClear.S.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearSOuterLabelRequiredStartSuccess ->
            TextFieldClear.S.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearSOuterLabelRequiredStartWarning ->
            TextFieldClear.S.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearSOuterLabelRequiredStartError ->
            TextFieldClear.S.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndDefault ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndSuccess ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndWarning ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearSOuterLabelRequiredEndError ->
            TextFieldClear.S.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearSInnerLabelDefault -> TextFieldClear.S.InnerLabel.Default
        TextFieldStyles.TextFieldClearSInnerLabelSuccess -> TextFieldClear.S.InnerLabel.Success
        TextFieldStyles.TextFieldClearSInnerLabelWarning -> TextFieldClear.S.InnerLabel.Warning
        TextFieldStyles.TextFieldClearSInnerLabelError -> TextFieldClear.S.InnerLabel.Error
        TextFieldStyles.TextFieldClearSInnerLabelRequiredStartDefault ->
            TextFieldClear.S.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearSInnerLabelRequiredStartSuccess ->
            TextFieldClear.S.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearSInnerLabelRequiredStartWarning ->
            TextFieldClear.S.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearSInnerLabelRequiredStartError ->
            TextFieldClear.S.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndDefault ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndSuccess ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndWarning ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearSInnerLabelRequiredEndError ->
            TextFieldClear.S.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearMDefault -> TextFieldClear.M.Default
        TextFieldStyles.TextFieldClearMSuccess -> TextFieldClear.M.Success
        TextFieldStyles.TextFieldClearMWarning -> TextFieldClear.M.Warning
        TextFieldStyles.TextFieldClearMError -> TextFieldClear.M.Error
        TextFieldStyles.TextFieldClearMRequiredStartDefault -> TextFieldClear.M.RequiredStart.Default
        TextFieldStyles.TextFieldClearMRequiredStartSuccess -> TextFieldClear.M.RequiredStart.Success
        TextFieldStyles.TextFieldClearMRequiredStartWarning -> TextFieldClear.M.RequiredStart.Warning
        TextFieldStyles.TextFieldClearMRequiredStartError -> TextFieldClear.M.RequiredStart.Error
        TextFieldStyles.TextFieldClearMRequiredEndDefault -> TextFieldClear.M.RequiredEnd.Default
        TextFieldStyles.TextFieldClearMRequiredEndSuccess -> TextFieldClear.M.RequiredEnd.Success
        TextFieldStyles.TextFieldClearMRequiredEndWarning -> TextFieldClear.M.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearMRequiredEndError -> TextFieldClear.M.RequiredEnd.Error
        TextFieldStyles.TextFieldClearMOuterLabelDefault -> TextFieldClear.M.OuterLabel.Default
        TextFieldStyles.TextFieldClearMOuterLabelSuccess -> TextFieldClear.M.OuterLabel.Success
        TextFieldStyles.TextFieldClearMOuterLabelWarning -> TextFieldClear.M.OuterLabel.Warning
        TextFieldStyles.TextFieldClearMOuterLabelError -> TextFieldClear.M.OuterLabel.Error
        TextFieldStyles.TextFieldClearMOuterLabelRequiredStartDefault ->
            TextFieldClear.M.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearMOuterLabelRequiredStartSuccess ->
            TextFieldClear.M.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearMOuterLabelRequiredStartWarning ->
            TextFieldClear.M.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearMOuterLabelRequiredStartError ->
            TextFieldClear.M.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearMOuterLabelRequiredEndDefault ->
            TextFieldClear.M.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearMOuterLabelRequiredEndSuccess ->
            TextFieldClear.M.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearMOuterLabelRequiredEndWarning ->
            TextFieldClear.M.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearMOuterLabelRequiredEndError ->
            TextFieldClear.M.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearMInnerLabelDefault -> TextFieldClear.M.InnerLabel.Default
        TextFieldStyles.TextFieldClearMInnerLabelSuccess -> TextFieldClear.M.InnerLabel.Success
        TextFieldStyles.TextFieldClearMInnerLabelWarning -> TextFieldClear.M.InnerLabel.Warning
        TextFieldStyles.TextFieldClearMInnerLabelError -> TextFieldClear.M.InnerLabel.Error
        TextFieldStyles.TextFieldClearMInnerLabelRequiredStartDefault ->
            TextFieldClear.M.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearMInnerLabelRequiredStartSuccess ->
            TextFieldClear.M.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearMInnerLabelRequiredStartWarning ->
            TextFieldClear.M.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearMInnerLabelRequiredStartError ->
            TextFieldClear.M.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearMInnerLabelRequiredEndDefault ->
            TextFieldClear.M.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearMInnerLabelRequiredEndSuccess ->
            TextFieldClear.M.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearMInnerLabelRequiredEndWarning ->
            TextFieldClear.M.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearMInnerLabelRequiredEndError ->
            TextFieldClear.M.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearLDefault -> TextFieldClear.L.Default
        TextFieldStyles.TextFieldClearLSuccess -> TextFieldClear.L.Success
        TextFieldStyles.TextFieldClearLWarning -> TextFieldClear.L.Warning
        TextFieldStyles.TextFieldClearLError -> TextFieldClear.L.Error
        TextFieldStyles.TextFieldClearLRequiredStartDefault -> TextFieldClear.L.RequiredStart.Default
        TextFieldStyles.TextFieldClearLRequiredStartSuccess -> TextFieldClear.L.RequiredStart.Success
        TextFieldStyles.TextFieldClearLRequiredStartWarning -> TextFieldClear.L.RequiredStart.Warning
        TextFieldStyles.TextFieldClearLRequiredStartError -> TextFieldClear.L.RequiredStart.Error
        TextFieldStyles.TextFieldClearLRequiredEndDefault -> TextFieldClear.L.RequiredEnd.Default
        TextFieldStyles.TextFieldClearLRequiredEndSuccess -> TextFieldClear.L.RequiredEnd.Success
        TextFieldStyles.TextFieldClearLRequiredEndWarning -> TextFieldClear.L.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearLRequiredEndError -> TextFieldClear.L.RequiredEnd.Error
        TextFieldStyles.TextFieldClearLOuterLabelDefault -> TextFieldClear.L.OuterLabel.Default
        TextFieldStyles.TextFieldClearLOuterLabelSuccess -> TextFieldClear.L.OuterLabel.Success
        TextFieldStyles.TextFieldClearLOuterLabelWarning -> TextFieldClear.L.OuterLabel.Warning
        TextFieldStyles.TextFieldClearLOuterLabelError -> TextFieldClear.L.OuterLabel.Error
        TextFieldStyles.TextFieldClearLOuterLabelRequiredStartDefault ->
            TextFieldClear.L.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearLOuterLabelRequiredStartSuccess ->
            TextFieldClear.L.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearLOuterLabelRequiredStartWarning ->
            TextFieldClear.L.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearLOuterLabelRequiredStartError ->
            TextFieldClear.L.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearLOuterLabelRequiredEndDefault ->
            TextFieldClear.L.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearLOuterLabelRequiredEndSuccess ->
            TextFieldClear.L.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearLOuterLabelRequiredEndWarning ->
            TextFieldClear.L.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearLOuterLabelRequiredEndError ->
            TextFieldClear.L.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearLInnerLabelDefault -> TextFieldClear.L.InnerLabel.Default
        TextFieldStyles.TextFieldClearLInnerLabelSuccess -> TextFieldClear.L.InnerLabel.Success
        TextFieldStyles.TextFieldClearLInnerLabelWarning -> TextFieldClear.L.InnerLabel.Warning
        TextFieldStyles.TextFieldClearLInnerLabelError -> TextFieldClear.L.InnerLabel.Error
        TextFieldStyles.TextFieldClearLInnerLabelRequiredStartDefault ->
            TextFieldClear.L.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearLInnerLabelRequiredStartSuccess ->
            TextFieldClear.L.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearLInnerLabelRequiredStartWarning ->
            TextFieldClear.L.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearLInnerLabelRequiredStartError ->
            TextFieldClear.L.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearLInnerLabelRequiredEndDefault ->
            TextFieldClear.L.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearLInnerLabelRequiredEndSuccess ->
            TextFieldClear.L.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearLInnerLabelRequiredEndWarning ->
            TextFieldClear.L.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearLInnerLabelRequiredEndError ->
            TextFieldClear.L.InnerLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearXlDefault -> TextFieldClear.Xl.Default
        TextFieldStyles.TextFieldClearXlSuccess -> TextFieldClear.Xl.Success
        TextFieldStyles.TextFieldClearXlWarning -> TextFieldClear.Xl.Warning
        TextFieldStyles.TextFieldClearXlError -> TextFieldClear.Xl.Error
        TextFieldStyles.TextFieldClearXlRequiredStartDefault ->
            TextFieldClear.Xl.RequiredStart.Default
        TextFieldStyles.TextFieldClearXlRequiredStartSuccess ->
            TextFieldClear.Xl.RequiredStart.Success
        TextFieldStyles.TextFieldClearXlRequiredStartWarning ->
            TextFieldClear.Xl.RequiredStart.Warning
        TextFieldStyles.TextFieldClearXlRequiredStartError -> TextFieldClear.Xl.RequiredStart.Error
        TextFieldStyles.TextFieldClearXlRequiredEndDefault -> TextFieldClear.Xl.RequiredEnd.Default
        TextFieldStyles.TextFieldClearXlRequiredEndSuccess -> TextFieldClear.Xl.RequiredEnd.Success
        TextFieldStyles.TextFieldClearXlRequiredEndWarning -> TextFieldClear.Xl.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearXlRequiredEndError -> TextFieldClear.Xl.RequiredEnd.Error
        TextFieldStyles.TextFieldClearXlOuterLabelDefault -> TextFieldClear.Xl.OuterLabel.Default
        TextFieldStyles.TextFieldClearXlOuterLabelSuccess -> TextFieldClear.Xl.OuterLabel.Success
        TextFieldStyles.TextFieldClearXlOuterLabelWarning -> TextFieldClear.Xl.OuterLabel.Warning
        TextFieldStyles.TextFieldClearXlOuterLabelError -> TextFieldClear.Xl.OuterLabel.Error
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartDefault ->
            TextFieldClear.Xl.OuterLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartSuccess ->
            TextFieldClear.Xl.OuterLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartWarning ->
            TextFieldClear.Xl.OuterLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartError ->
            TextFieldClear.Xl.OuterLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndDefault ->
            TextFieldClear.Xl.OuterLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndSuccess ->
            TextFieldClear.Xl.OuterLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndWarning ->
            TextFieldClear.Xl.OuterLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndError ->
            TextFieldClear.Xl.OuterLabel.RequiredEnd.Error
        TextFieldStyles.TextFieldClearXlInnerLabelDefault -> TextFieldClear.Xl.InnerLabel.Default
        TextFieldStyles.TextFieldClearXlInnerLabelSuccess -> TextFieldClear.Xl.InnerLabel.Success
        TextFieldStyles.TextFieldClearXlInnerLabelWarning -> TextFieldClear.Xl.InnerLabel.Warning
        TextFieldStyles.TextFieldClearXlInnerLabelError -> TextFieldClear.Xl.InnerLabel.Error
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartDefault ->
            TextFieldClear.Xl.InnerLabel.RequiredStart.Default
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartSuccess ->
            TextFieldClear.Xl.InnerLabel.RequiredStart.Success
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartWarning ->
            TextFieldClear.Xl.InnerLabel.RequiredStart.Warning
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartError ->
            TextFieldClear.Xl.InnerLabel.RequiredStart.Error
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndDefault ->
            TextFieldClear.Xl.InnerLabel.RequiredEnd.Default
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndSuccess ->
            TextFieldClear.Xl.InnerLabel.RequiredEnd.Success
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndWarning ->
            TextFieldClear.Xl.InnerLabel.RequiredEnd.Warning
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndError ->
            TextFieldClear.Xl.InnerLabel.RequiredEnd.Error
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field
 */
public fun TextFieldStyles.Default.resolve(
    size: TextFieldDefaultSize = TextFieldDefaultSize.Xl,
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
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsRequiredStartDefault
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXsRequiredStartSuccess
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXsRequiredStartWarning
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsRequiredStartError
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
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXsOuterLabelRequiredStartDefault
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXsOuterLabelRequiredStartSuccess
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXsOuterLabelRequiredStartWarning
    size == TextFieldDefaultSize.Xs && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXsOuterLabelRequiredStartError
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
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSRequiredStartDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSRequiredStartSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSRequiredStartWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSRequiredStartError
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
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSOuterLabelRequiredStartDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSOuterLabelRequiredStartSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSOuterLabelRequiredStartWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSOuterLabelRequiredStartError
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
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldSInnerLabelRequiredStartDefault
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldSInnerLabelRequiredStartSuccess
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldSInnerLabelRequiredStartWarning
    size == TextFieldDefaultSize.S && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldSInnerLabelRequiredStartError
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
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMRequiredStartDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMRequiredStartSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMRequiredStartWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMRequiredStartError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMRequiredEndDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMRequiredEndSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMRequiredEndWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMRequiredEndError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMOuterLabelDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMOuterLabelSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMOuterLabelWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMOuterLabelError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMOuterLabelRequiredStartDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMOuterLabelRequiredStartSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMOuterLabelRequiredStartWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMOuterLabelRequiredStartError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMOuterLabelRequiredEndDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMOuterLabelRequiredEndSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMOuterLabelRequiredEndWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMOuterLabelRequiredEndError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMInnerLabelDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMInnerLabelSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMInnerLabelWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMInnerLabelError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMInnerLabelRequiredStartDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMInnerLabelRequiredStartSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMInnerLabelRequiredStartWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMInnerLabelRequiredStartError
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldMInnerLabelRequiredEndDefault
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldMInnerLabelRequiredEndSuccess
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldMInnerLabelRequiredEndWarning
    size == TextFieldDefaultSize.M && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldMInnerLabelRequiredEndError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLRequiredStartDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLRequiredStartSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLRequiredStartWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLRequiredStartError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLRequiredEndDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLRequiredEndSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLRequiredEndWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLRequiredEndError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLOuterLabelDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLOuterLabelSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLOuterLabelWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLOuterLabelError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLOuterLabelRequiredStartDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLOuterLabelRequiredStartSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLOuterLabelRequiredStartWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLOuterLabelRequiredStartError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLOuterLabelRequiredEndDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLOuterLabelRequiredEndSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLOuterLabelRequiredEndWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLOuterLabelRequiredEndError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLInnerLabelDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLInnerLabelSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLInnerLabelWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLInnerLabelError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLInnerLabelRequiredStartDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLInnerLabelRequiredStartSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLInnerLabelRequiredStartWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLInnerLabelRequiredStartError
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldLInnerLabelRequiredEndDefault
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldLInnerLabelRequiredEndSuccess
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldLInnerLabelRequiredEndWarning
    size == TextFieldDefaultSize.L && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldLInnerLabelRequiredEndError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlRequiredStartDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlRequiredStartSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlRequiredStartWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlRequiredStartError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlRequiredEndDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlRequiredEndSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlRequiredEndWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.None && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlRequiredEndError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlOuterLabelDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlOuterLabelSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlOuterLabelWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlOuterLabelError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlOuterLabelRequiredStartDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlOuterLabelRequiredStartSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlOuterLabelRequiredStartWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlOuterLabelRequiredStartError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlOuterLabelRequiredEndDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlOuterLabelRequiredEndSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlOuterLabelRequiredEndWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Outer && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlOuterLabelRequiredEndError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlInnerLabelDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlInnerLabelSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlInnerLabelWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.None &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlInnerLabelError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlInnerLabelRequiredStartDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlInnerLabelRequiredStartSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlInnerLabelRequiredStartWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.Start &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlInnerLabelRequiredStartError
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Default -> TextFieldStyles.TextFieldXlInnerLabelRequiredEndDefault
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Success -> TextFieldStyles.TextFieldXlInnerLabelRequiredEndSuccess
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Warning -> TextFieldStyles.TextFieldXlInnerLabelRequiredEndWarning
    size == TextFieldDefaultSize.Xl && requiredPlacement == TextFieldDefaultRequiredPlacement.End &&
        labelPlacement == TextFieldDefaultLabelPlacement.Inner && view ==
        TextFieldDefaultView.Error -> TextFieldStyles.TextFieldXlInnerLabelRequiredEndError
    else -> error("Unsupported text-field style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field
 */
@Composable
public fun TextFieldStyles.Default.style(
    size: TextFieldDefaultSize = TextFieldDefaultSize.Xl,
    requiredPlacement: TextFieldDefaultRequiredPlacement = TextFieldDefaultRequiredPlacement.None,
    labelPlacement: TextFieldDefaultLabelPlacement = TextFieldDefaultLabelPlacement.None,
    view: TextFieldDefaultView = TextFieldDefaultView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, requiredPlacement, labelPlacement, view).style(modify)

/**
 * Возвращает экземпляр [TextFieldStyles] для text-field-clear
 */
public fun TextFieldStyles.Clear.resolve(
    size: TextFieldClearSize = TextFieldClearSize.Xl,
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
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearXsRequiredStartDefault
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearXsRequiredStartSuccess
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearXsRequiredStartWarning
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXsRequiredStartError
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
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartDefault
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartSuccess
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartWarning
    size == TextFieldClearSize.Xs && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXsOuterLabelRequiredStartError
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
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearSRequiredStartDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearSRequiredStartSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearSRequiredStartWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSRequiredStartError
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
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSOuterLabelRequiredStartDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearSOuterLabelRequiredStartSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearSOuterLabelRequiredStartWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSOuterLabelRequiredStartError
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
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearSInnerLabelRequiredStartDefault
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearSInnerLabelRequiredStartSuccess
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearSInnerLabelRequiredStartWarning
    size == TextFieldClearSize.S && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearSInnerLabelRequiredStartError
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
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearMDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearMSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearMWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearMRequiredStartDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearMRequiredStartSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearMRequiredStartWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMRequiredStartError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearMRequiredEndDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearMRequiredEndSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearMRequiredEndWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMRequiredEndError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMOuterLabelDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearMOuterLabelSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearMOuterLabelWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMOuterLabelError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMOuterLabelRequiredStartDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearMOuterLabelRequiredStartSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearMOuterLabelRequiredStartWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMOuterLabelRequiredStartError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMOuterLabelRequiredEndDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearMOuterLabelRequiredEndSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearMOuterLabelRequiredEndWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMOuterLabelRequiredEndError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMInnerLabelDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearMInnerLabelSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearMInnerLabelWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMInnerLabelError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMInnerLabelRequiredStartDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearMInnerLabelRequiredStartSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearMInnerLabelRequiredStartWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMInnerLabelRequiredStartError
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearMInnerLabelRequiredEndDefault
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearMInnerLabelRequiredEndSuccess
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearMInnerLabelRequiredEndWarning
    size == TextFieldClearSize.M && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearMInnerLabelRequiredEndError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearLDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearLSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearLWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearLRequiredStartDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearLRequiredStartSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearLRequiredStartWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLRequiredStartError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearLRequiredEndDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearLRequiredEndSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearLRequiredEndWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLRequiredEndError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLOuterLabelDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearLOuterLabelSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearLOuterLabelWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLOuterLabelError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLOuterLabelRequiredStartDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearLOuterLabelRequiredStartSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearLOuterLabelRequiredStartWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLOuterLabelRequiredStartError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLOuterLabelRequiredEndDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearLOuterLabelRequiredEndSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearLOuterLabelRequiredEndWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLOuterLabelRequiredEndError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLInnerLabelDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearLInnerLabelSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearLInnerLabelWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLInnerLabelError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLInnerLabelRequiredStartDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearLInnerLabelRequiredStartSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearLInnerLabelRequiredStartWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLInnerLabelRequiredStartError
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearLInnerLabelRequiredEndDefault
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearLInnerLabelRequiredEndSuccess
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearLInnerLabelRequiredEndWarning
    size == TextFieldClearSize.L && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearLInnerLabelRequiredEndError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearXlDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearXlSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearXlWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearXlRequiredStartDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearXlRequiredStartSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearXlRequiredStartWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlRequiredStartError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Default ->
        TextFieldStyles.TextFieldClearXlRequiredEndDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Success ->
        TextFieldStyles.TextFieldClearXlRequiredEndSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Warning ->
        TextFieldStyles.TextFieldClearXlRequiredEndWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.None && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlRequiredEndError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXlOuterLabelDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXlOuterLabelSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXlOuterLabelWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlOuterLabelError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredStartError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Outer && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlOuterLabelRequiredEndError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXlInnerLabelDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXlInnerLabelSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXlInnerLabelWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.None &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlInnerLabelError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.Start &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredStartError
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Default -> TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndDefault
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Success -> TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndSuccess
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view ==
        TextFieldClearView.Warning -> TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndWarning
    size == TextFieldClearSize.Xl && requiredPlacement == TextFieldClearRequiredPlacement.End &&
        labelPlacement == TextFieldClearLabelPlacement.Inner && view == TextFieldClearView.Error ->
        TextFieldStyles.TextFieldClearXlInnerLabelRequiredEndError
    else -> error("Unsupported text-field-clear style combination")
}

/**
 * Возвращает [TextFieldStyle] для text-field-clear
 */
@Composable
public fun TextFieldStyles.Clear.style(
    size: TextFieldClearSize = TextFieldClearSize.Xl,
    requiredPlacement: TextFieldClearRequiredPlacement = TextFieldClearRequiredPlacement.None,
    labelPlacement: TextFieldClearLabelPlacement = TextFieldClearLabelPlacement.None,
    view: TextFieldClearView = TextFieldClearView.Default,
    modify: @Composable TextFieldStyleBuilder.() -> Unit = {},
): TextFieldStyle = resolve(size, requiredPlacement, labelPlacement, view).style(modify)
