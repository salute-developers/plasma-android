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
    WheelH4("Wheel.H4"),
    WheelH4RightAlign("Wheel.H4.RightAlign"),
    WheelH4CenterAlign("Wheel.H4.CenterAlign"),
    WheelH4LeftAlign("Wheel.H4.LeftAlign"),
    WheelH4MixedAlign("Wheel.H4.MixedAlign"),
    ;

    /**
     * Typed API для подбора стиля wheel
     */
    public companion object
}

/**
 * Возможные значения свойства size для wheel
 */
public enum class WheelSize {
    H1,
    H4,
}

/**
 * Возможные значения свойства alignment для wheel
 */
public enum class WheelAlignment {
    Left,
    Right,
    Center,
    Mixed,
}

/**
 * Возвращает [WheelStyle] для [WheelStyles]
 */
@Composable
public fun WheelStyles.style(modify: @Composable WheelStyleBuilder.() -> Unit = {}): WheelStyle {
    val builder = when (this) {
        WheelStyles.WheelH1 -> Wheel.H1
        WheelStyles.WheelH1RightAlign -> Wheel.H1.RightAlign
        WheelStyles.WheelH1CenterAlign -> Wheel.H1.CenterAlign
        WheelStyles.WheelH1LeftAlign -> Wheel.H1.LeftAlign
        WheelStyles.WheelH1MixedAlign -> Wheel.H1.MixedAlign
        WheelStyles.WheelH4 -> Wheel.H4
        WheelStyles.WheelH4RightAlign -> Wheel.H4.RightAlign
        WheelStyles.WheelH4CenterAlign -> Wheel.H4.CenterAlign
        WheelStyles.WheelH4LeftAlign -> Wheel.H4.LeftAlign
        WheelStyles.WheelH4MixedAlign -> Wheel.H4.MixedAlign
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [WheelStyles] для wheel
 */
public fun WheelStyles.Companion.resolve(
    size: WheelSize = WheelSize.H4,
    alignment: WheelAlignment =
        WheelAlignment.Center,
): WheelStyles = when {
    size == WheelSize.H1 && alignment == WheelAlignment.Right -> WheelStyles.WheelH1RightAlign
    size == WheelSize.H1 && alignment == WheelAlignment.Center -> WheelStyles.WheelH1CenterAlign
    size == WheelSize.H1 && alignment == WheelAlignment.Left -> WheelStyles.WheelH1LeftAlign
    size == WheelSize.H1 && alignment == WheelAlignment.Mixed -> WheelStyles.WheelH1MixedAlign
    size == WheelSize.H4 && alignment == WheelAlignment.Right -> WheelStyles.WheelH4RightAlign
    size == WheelSize.H4 && alignment == WheelAlignment.Center -> WheelStyles.WheelH4CenterAlign
    size == WheelSize.H4 && alignment == WheelAlignment.Left -> WheelStyles.WheelH4LeftAlign
    size == WheelSize.H4 && alignment == WheelAlignment.Mixed -> WheelStyles.WheelH4MixedAlign
    size == WheelSize.H1 -> WheelStyles.WheelH1
    size == WheelSize.H4 -> WheelStyles.WheelH4
    else -> error("Unsupported wheel style combination")
}

/**
 * Возвращает [WheelStyle] для wheel
 */
@Composable
public fun WheelStyles.Companion.style(
    size: WheelSize = WheelSize.H4,
    alignment: WheelAlignment = WheelAlignment.Center,
    modify: @Composable WheelStyleBuilder.() -> Unit = {},
): WheelStyle = resolve(size, alignment).style(modify)
