// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Switch
 */
public enum class SwitchStyles(
    public val key: String,
) {
    SwitchL("Switch.L"),
    SwitchLToggleS("Switch.L.ToggleS"),
    SwitchM("Switch.M"),
    SwitchMToggleS("Switch.M.ToggleS"),
    SwitchS("Switch.S"),
    SwitchSToggleS("Switch.S.ToggleS"),
}

/**
 * Возвращает [SwitchStyle] для [SwitchStyles]
 */
@Composable
public fun SwitchStyles.style(modifyAction: @Composable SwitchStyleBuilder.() -> Unit = {}): SwitchStyle {
    val builder = when (this) {
        SwitchStyles.SwitchL -> Switch.L
        SwitchStyles.SwitchLToggleS -> Switch.L.ToggleS
        SwitchStyles.SwitchM -> Switch.M
        SwitchStyles.SwitchMToggleS -> Switch.M.ToggleS
        SwitchStyles.SwitchS -> Switch.S
        SwitchStyles.SwitchSToggleS -> Switch.S.ToggleS
    }
    return builder.modify(modifyAction).style()
}
