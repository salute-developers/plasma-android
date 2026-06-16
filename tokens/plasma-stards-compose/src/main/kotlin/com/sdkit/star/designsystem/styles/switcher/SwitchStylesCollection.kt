// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.switcher

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
    SwitchLHasBackground("Switch.L.HasBackground"),
    SwitchM("Switch.M"),
    SwitchMHasBackground("Switch.M.HasBackground"),
    SwitchS("Switch.S"),
    SwitchSHasBackground("Switch.S.HasBackground"),
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
 * Возвращает [SwitchStyle] для [SwitchStyles]
 */
@Composable
public fun SwitchStyles.style(modify: @Composable SwitchStyleBuilder.() -> Unit = {}): SwitchStyle {
    val builder = when (this) {
        SwitchStyles.SwitchL -> Switch.L
        SwitchStyles.SwitchLHasBackground -> Switch.L.HasBackground
        SwitchStyles.SwitchM -> Switch.M
        SwitchStyles.SwitchMHasBackground -> Switch.M.HasBackground
        SwitchStyles.SwitchS -> Switch.S
        SwitchStyles.SwitchSHasBackground -> Switch.S.HasBackground
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SwitchStyles] для switch
 */
public fun SwitchStyles.Companion.resolve(size: SwitchSize = SwitchSize.L): SwitchStyles = when {
    size == SwitchSize.L -> SwitchStyles.SwitchL
    size == SwitchSize.L -> SwitchStyles.SwitchLHasBackground
    size == SwitchSize.M -> SwitchStyles.SwitchM
    size == SwitchSize.M -> SwitchStyles.SwitchMHasBackground
    size == SwitchSize.S -> SwitchStyles.SwitchS
    size == SwitchSize.S -> SwitchStyles.SwitchSHasBackground
    else -> error("Unsupported switch style combination")
}

/**
 * Возвращает [SwitchStyle] для switch
 */
@Composable
public fun SwitchStyles.Companion.style(
    size: SwitchSize = SwitchSize.L,
    modify: @Composable
    SwitchStyleBuilder.() -> Unit = {},
): SwitchStyle = resolve(size).style(modify)
