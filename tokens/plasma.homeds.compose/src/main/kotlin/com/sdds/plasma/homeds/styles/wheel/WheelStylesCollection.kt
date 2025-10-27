// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.wheel

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.WheelStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Wheel
 */
public enum class WheelStyles(
    public val key: String,
) {
    WheelH1("Wheel.H1"),
    WheelH1RightAlign("Wheel.H1.RightAlign"),
    WheelH1CenterAlign("Wheel.H1.CenterAlign"),
    WheelH1LeftAlign("Wheel.H1.LeftAlign"),
    WheelH1MixedAlign("Wheel.H1.MixedAlign"),
}

/**
 * Возвращает [WheelStyle] для [WheelStyles]
 */
@Composable
public fun WheelStyles.style(modifyAction: @Composable WheelStyleBuilder.() -> Unit = {}): WheelStyle {
    val builder = when (this) {
        WheelStyles.WheelH1 -> Wheel.H1
        WheelStyles.WheelH1RightAlign -> Wheel.H1.RightAlign
        WheelStyles.WheelH1CenterAlign -> Wheel.H1.CenterAlign
        WheelStyles.WheelH1LeftAlign -> Wheel.H1.LeftAlign
        WheelStyles.WheelH1MixedAlign -> Wheel.H1.MixedAlign
    }
    return builder.modify(modifyAction).style()
}
