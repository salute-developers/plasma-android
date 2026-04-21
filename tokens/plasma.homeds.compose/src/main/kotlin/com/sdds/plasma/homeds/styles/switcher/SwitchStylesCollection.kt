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
    ;

    /**
     * Typed API для подбора стиля switch
     */
    public companion object
}

/**
 * Возможные значения свойства size для switch
 */
public enum class SwitchSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства toggle-size для switch
 */
public enum class SwitchToggleSize {
    L,
    S,
}

/**
 * Возвращает [SwitchStyle] для [SwitchStyles]
 */
@Composable
public fun SwitchStyles.style(modify: @Composable SwitchStyleBuilder.() -> Unit = {}): SwitchStyle {
    val builder = when (this) {
        SwitchStyles.SwitchL -> Switch.L
        SwitchStyles.SwitchLToggleS -> Switch.L.ToggleS
        SwitchStyles.SwitchM -> Switch.M
        SwitchStyles.SwitchMToggleS -> Switch.M.ToggleS
        SwitchStyles.SwitchS -> Switch.S
        SwitchStyles.SwitchSToggleS -> Switch.S.ToggleS
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SwitchStyles] для switch
 */
public fun SwitchStyles.Companion.resolve(
    size: SwitchSize = SwitchSize.L,
    toggleSize: SwitchToggleSize = SwitchToggleSize.L,
): SwitchStyles = when {
    size == SwitchSize.L && toggleSize == SwitchToggleSize.L -> SwitchStyles.SwitchL
    size == SwitchSize.L && toggleSize == SwitchToggleSize.S -> SwitchStyles.SwitchLToggleS
    size == SwitchSize.M && toggleSize == SwitchToggleSize.L -> SwitchStyles.SwitchM
    size == SwitchSize.M && toggleSize == SwitchToggleSize.S -> SwitchStyles.SwitchMToggleS
    size == SwitchSize.S && toggleSize == SwitchToggleSize.L -> SwitchStyles.SwitchS
    size == SwitchSize.S && toggleSize == SwitchToggleSize.S -> SwitchStyles.SwitchSToggleS
    else -> error("Unsupported switch style combination")
}

/**
 * Возвращает [SwitchStyle] для switch
 */
@Composable
public fun SwitchStyles.Companion.style(
    size: SwitchSize = SwitchSize.L,
    toggleSize: SwitchToggleSize = SwitchToggleSize.L,
    modify: @Composable SwitchStyleBuilder.() -> Unit = {},
): SwitchStyle = resolve(size, toggleSize).style(modify)
