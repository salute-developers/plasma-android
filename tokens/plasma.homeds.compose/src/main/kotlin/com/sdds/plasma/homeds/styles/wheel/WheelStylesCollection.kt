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
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [WheelStyles] для wheel
 */
public fun WheelStyles.Companion.resolve(
    size: WheelSize = WheelSize.H1,
    alignment: WheelAlignment =
        WheelAlignment.Left,
): WheelStyles = when {
    size == WheelSize.H1 && alignment == WheelAlignment.Right -> WheelStyles.WheelH1RightAlign
    size == WheelSize.H1 && alignment == WheelAlignment.Center -> WheelStyles.WheelH1CenterAlign
    size == WheelSize.H1 && alignment == WheelAlignment.Left -> WheelStyles.WheelH1LeftAlign
    size == WheelSize.H1 && alignment == WheelAlignment.Mixed -> WheelStyles.WheelH1MixedAlign
    size == WheelSize.H1 -> WheelStyles.WheelH1
    else -> error("Unsupported wheel style combination")
}

/**
 * Возвращает [WheelStyle] для wheel
 */
@Composable
public fun WheelStyles.Companion.style(
    size: WheelSize = WheelSize.H1,
    alignment: WheelAlignment = WheelAlignment.Left,
    modify: @Composable WheelStyleBuilder.() -> Unit = {},
): WheelStyle = resolve(size, alignment).style(modify)
