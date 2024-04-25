@file:Suppress("LongMethod", "LongParameterList", "UndocumentedPublicProperty", "UnnecessaryAbstractClass")

package com.sdds.compose.uikit.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily

/**
 * Контракт типографики SDDS
 * @author Малышев Александр 23.04.2024
 */
@Stable
abstract class CoreTypography {
    abstract val displayLarge: TypographyStyle
    abstract val displayMedium: TypographyStyle
    abstract val displaySmall: TypographyStyle
    abstract val h1: TypographyStyle
    abstract val h2: TypographyStyle
    abstract val h3: TypographyStyle
    abstract val h4: TypographyStyle
    abstract val h5: TypographyStyle
    abstract val bodyLarge: TypographyStyle
    abstract val bodyMedium: TypographyStyle
    abstract val bodySmall: TypographyStyle
    abstract val bodyXSmall: TypographyStyle
    abstract val bodyXXSmall: TypographyStyle
    abstract val textLarge: TypographyStyle
    abstract val textMedium: TypographyStyle
    abstract val textSmall: TypographyStyle
    abstract val textXSmall: TypographyStyle
}

/**
 * Стиль начертаний
 * @property bold жирное начертание
 * @property normal обычное начертание
 */
@Immutable
data class TypographyStyle(
    val bold: TextStyle,
    val normal: TextStyle,
) {

    /**
     * Устанавливает [fontFamily] по-умолчанию для [bold] и [normal]
     * @param fontFamily семейство шрифтов
     * @param bold жирное начертание
     * @param normal обычное начертание
     */
    constructor(
        fontFamily: FontFamily,
        bold: TextStyle,
        normal: TextStyle,
    ) : this(
        bold.withDefaultFontFamily(fontFamily),
        normal.withDefaultFontFamily(fontFamily),
    )
}

/**
 * CompositionLocal типографики
 */
val LocalTypography = staticCompositionLocalOf { debugTypography() }

private fun TextStyle.withDefaultFontFamily(default: FontFamily): TextStyle {
    return if (fontFamily != null) this else copy(fontFamily = default)
}

private fun debugTypography(): CoreTypography =
    CoreTypographyImpl(
        displayLarge = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        displayMedium = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        displaySmall = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        h1 = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        h2 = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        h3 = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        h4 = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        h5 = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        bodyLarge = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        bodyMedium = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        bodySmall = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        bodyXSmall = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        bodyXXSmall = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        textLarge = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        textMedium = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        textSmall = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
        textXSmall = TypographyStyle(
            fontFamily = FontFamily.Default,
            bold = TextStyle.Default,
            normal = TextStyle.Default,
        ),
    )

private class CoreTypographyImpl(
    override val displayLarge: TypographyStyle,
    override val displayMedium: TypographyStyle,
    override val displaySmall: TypographyStyle,
    override val h1: TypographyStyle,
    override val h2: TypographyStyle,
    override val h3: TypographyStyle,
    override val h4: TypographyStyle,
    override val h5: TypographyStyle,
    override val bodyLarge: TypographyStyle,
    override val bodyMedium: TypographyStyle,
    override val bodySmall: TypographyStyle,
    override val bodyXSmall: TypographyStyle,
    override val bodyXXSmall: TypographyStyle,
    override val textLarge: TypographyStyle,
    override val textMedium: TypographyStyle,
    override val textSmall: TypographyStyle,
    override val textXSmall: TypographyStyle,
) : CoreTypography()
