// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.stylessalute.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.stylessalute.tokens.TypographyLargeTokens
import com.sdds.stylessalute.tokens.TypographyMediumTokens
import com.sdds.stylessalute.tokens.TypographySmallTokens

/**
 * Типографика StylesSalute
 */
@Immutable
public data class StylesSaluteTypography internal constructor(
    /**
     * typography l display-l
     */
    public val displayLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l display-l-bold
     */
    public val displayLBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-m
     */
    public val displayMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l display-m-bold
     */
    public val displayMBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-s
     */
    public val displaySNormal: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-bold
     */
    public val displaySBold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1
     */
    public val headerH1Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1-bold
     */
    public val headerH1Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2
     */
    public val headerH2Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2-bold
     */
    public val headerH2Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h3
     */
    public val headerH3Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h3-bold
     */
    public val headerH3Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4
     */
    public val headerH4Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4-bold
     */
    public val headerH4Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h5
     */
    public val headerH5Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h5-bold
     */
    public val headerH5Bold: TextStyle = TextStyle.Default,
    /**
     * typography l body-l
     */
    public val bodyLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-l-bold
     */
    public val bodyLBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-m
     */
    public val bodyMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-m-bold
     */
    public val bodyMBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-s
     */
    public val bodySNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-s-bold
     */
    public val bodySBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs
     */
    public val bodyXsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs-bold
     */
    public val bodyXsBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs
     */
    public val bodyXxsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs-bold
     */
    public val bodyXxsBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-l
     */
    public val textLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-l-bold
     */
    public val textLBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-m
     */
    public val textMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-m-bold
     */
    public val textMBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-s
     */
    public val textSNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-s-bold
     */
    public val textSBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs
     */
    public val textXsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs-bold
     */
    public val textXsBold: TextStyle = TextStyle.Default,
)

internal val LocalStylesSaluteTypography: ProvidableCompositionLocal<StylesSaluteTypography> =
    staticCompositionLocalOf {
        StylesSaluteTypography()
    }

/**
 * Возвращает [StylesSaluteTypography] для WindowSizeClass.Compact
 */
public fun smallStylesSaluteTypography(): StylesSaluteTypography = StylesSaluteTypography(
    displayLNormal = TypographySmallTokens.DisplayLNormal,
    displayLBold = TypographySmallTokens.DisplayLBold,
    displayMNormal = TypographySmallTokens.DisplayMNormal,
    displayMBold = TypographySmallTokens.DisplayMBold,
    displaySNormal = TypographySmallTokens.DisplaySNormal,
    displaySBold = TypographySmallTokens.DisplaySBold,
    headerH1Normal = TypographySmallTokens.HeaderH1Normal,
    headerH1Bold = TypographySmallTokens.HeaderH1Bold,
    headerH2Normal = TypographySmallTokens.HeaderH2Normal,
    headerH2Bold = TypographySmallTokens.HeaderH2Bold,
    headerH3Normal = TypographySmallTokens.HeaderH3Normal,
    headerH3Bold = TypographySmallTokens.HeaderH3Bold,
    headerH4Normal = TypographySmallTokens.HeaderH4Normal,
    headerH4Bold = TypographySmallTokens.HeaderH4Bold,
    headerH5Normal = TypographySmallTokens.HeaderH5Normal,
    headerH5Bold = TypographySmallTokens.HeaderH5Bold,
    bodyLNormal = TypographySmallTokens.BodyLNormal,
    bodyLBold = TypographySmallTokens.BodyLBold,
    bodyMNormal = TypographySmallTokens.BodyMNormal,
    bodyMBold = TypographySmallTokens.BodyMBold,
    bodySNormal = TypographySmallTokens.BodySNormal,
    bodySBold = TypographySmallTokens.BodySBold,
    bodyXsNormal = TypographySmallTokens.BodyXsNormal,
    bodyXsBold = TypographySmallTokens.BodyXsBold,
    bodyXxsNormal = TypographySmallTokens.BodyXxsNormal,
    bodyXxsBold = TypographySmallTokens.BodyXxsBold,
    textLNormal = TypographySmallTokens.TextLNormal,
    textLBold = TypographySmallTokens.TextLBold,
    textMNormal = TypographySmallTokens.TextMNormal,
    textMBold = TypographySmallTokens.TextMBold,
    textSNormal = TypographySmallTokens.TextSNormal,
    textSBold = TypographySmallTokens.TextSBold,
    textXsNormal = TypographySmallTokens.TextXsNormal,
    textXsBold = TypographySmallTokens.TextXsBold,
)

/**
 * Возвращает [StylesSaluteTypography] для WindowSizeClass.Medium
 */
public fun mediumStylesSaluteTypography(): StylesSaluteTypography = StylesSaluteTypography(
    displayLNormal = TypographyMediumTokens.DisplayLNormal,
    displayLBold = TypographyMediumTokens.DisplayLBold,
    displayMNormal = TypographyMediumTokens.DisplayMNormal,
    displayMBold = TypographyMediumTokens.DisplayMBold,
    displaySNormal = TypographyMediumTokens.DisplaySNormal,
    displaySBold = TypographyMediumTokens.DisplaySBold,
    headerH1Normal = TypographyMediumTokens.HeaderH1Normal,
    headerH1Bold = TypographyMediumTokens.HeaderH1Bold,
    headerH2Normal = TypographyMediumTokens.HeaderH2Normal,
    headerH2Bold = TypographyMediumTokens.HeaderH2Bold,
    headerH3Normal = TypographyMediumTokens.HeaderH3Normal,
    headerH3Bold = TypographyMediumTokens.HeaderH3Bold,
    headerH4Normal = TypographyMediumTokens.HeaderH4Normal,
    headerH4Bold = TypographyMediumTokens.HeaderH4Bold,
    headerH5Normal = TypographyMediumTokens.HeaderH5Normal,
    headerH5Bold = TypographyMediumTokens.HeaderH5Bold,
    bodyLNormal = TypographyMediumTokens.BodyLNormal,
    bodyLBold = TypographyMediumTokens.BodyLBold,
    bodyMNormal = TypographyMediumTokens.BodyMNormal,
    bodyMBold = TypographyMediumTokens.BodyMBold,
    bodySNormal = TypographyMediumTokens.BodySNormal,
    bodySBold = TypographyMediumTokens.BodySBold,
    bodyXsNormal = TypographyMediumTokens.BodyXsNormal,
    bodyXsBold = TypographyMediumTokens.BodyXsBold,
    bodyXxsNormal = TypographyMediumTokens.BodyXxsNormal,
    bodyXxsBold = TypographyMediumTokens.BodyXxsBold,
    textLNormal = TypographyMediumTokens.TextLNormal,
    textLBold = TypographyMediumTokens.TextLBold,
    textMNormal = TypographyMediumTokens.TextMNormal,
    textMBold = TypographyMediumTokens.TextMBold,
    textSNormal = TypographyMediumTokens.TextSNormal,
    textSBold = TypographyMediumTokens.TextSBold,
    textXsNormal = TypographyMediumTokens.TextXsNormal,
    textXsBold = TypographyMediumTokens.TextXsBold,
)

/**
 * Возвращает [StylesSaluteTypography] для WindowSizeClass.Expanded
 */
public fun largeStylesSaluteTypography(): StylesSaluteTypography = StylesSaluteTypography(
    displayLNormal = TypographyLargeTokens.DisplayLNormal,
    displayLBold = TypographyLargeTokens.DisplayLBold,
    displayMNormal = TypographyLargeTokens.DisplayMNormal,
    displayMBold = TypographyLargeTokens.DisplayMBold,
    displaySNormal = TypographyLargeTokens.DisplaySNormal,
    displaySBold = TypographyLargeTokens.DisplaySBold,
    headerH1Normal = TypographyLargeTokens.HeaderH1Normal,
    headerH1Bold = TypographyLargeTokens.HeaderH1Bold,
    headerH2Normal = TypographyLargeTokens.HeaderH2Normal,
    headerH2Bold = TypographyLargeTokens.HeaderH2Bold,
    headerH3Normal = TypographyLargeTokens.HeaderH3Normal,
    headerH3Bold = TypographyLargeTokens.HeaderH3Bold,
    headerH4Normal = TypographyLargeTokens.HeaderH4Normal,
    headerH4Bold = TypographyLargeTokens.HeaderH4Bold,
    headerH5Normal = TypographyLargeTokens.HeaderH5Normal,
    headerH5Bold = TypographyLargeTokens.HeaderH5Bold,
    bodyLNormal = TypographyLargeTokens.BodyLNormal,
    bodyLBold = TypographyLargeTokens.BodyLBold,
    bodyMNormal = TypographyLargeTokens.BodyMNormal,
    bodyMBold = TypographyLargeTokens.BodyMBold,
    bodySNormal = TypographyLargeTokens.BodySNormal,
    bodySBold = TypographyLargeTokens.BodySBold,
    bodyXsNormal = TypographyLargeTokens.BodyXsNormal,
    bodyXsBold = TypographyLargeTokens.BodyXsBold,
    bodyXxsNormal = TypographyLargeTokens.BodyXxsNormal,
    bodyXxsBold = TypographyLargeTokens.BodyXxsBold,
    textLNormal = TypographyLargeTokens.TextLNormal,
    textLBold = TypographyLargeTokens.TextLBold,
    textMNormal = TypographyLargeTokens.TextMNormal,
    textMBold = TypographyLargeTokens.TextMBold,
    textSNormal = TypographyLargeTokens.TextSNormal,
    textSBold = TypographyLargeTokens.TextSBold,
    textXsNormal = TypographyLargeTokens.TextXsNormal,
    textXsBold = TypographyLargeTokens.TextXsBold,
)

/**
 * Возвращает разные [StylesSaluteTypography] в зависимости от ширины окна. Значение динамически
 * изменяется при изменении ширины окна.
 */
@Composable
public fun dynamicStylesSaluteTypography(): StylesSaluteTypography {
    val widthClass = collectWindowSizeInfoAsState().value.widthClass
    return when (widthClass) {
        WindowSizeClass.Expanded -> largeStylesSaluteTypography()
        WindowSizeClass.Medium -> mediumStylesSaluteTypography()
        WindowSizeClass.Compact -> smallStylesSaluteTypography()
    }
}

/**
 * Возвращает значение в dp - брейкпоинт по ширине для указанного класса размерности.
 */
public fun WindowSizeClass.widthBreakPoint(): Dp = when (this) {
    WindowSizeClass.Expanded -> 960.0.dp
    WindowSizeClass.Medium -> 560.0.dp
    WindowSizeClass.Compact -> 0.dp
}
