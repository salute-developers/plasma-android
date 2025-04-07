// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.plasma.giga.tokens.TypographyLargeTokens
import com.sdds.plasma.giga.tokens.TypographyMediumTokens
import com.sdds.plasma.giga.tokens.TypographySmallTokens

/**
 * Типографика PlasmaGiga
 */
@Immutable
public data class PlasmaGigaTypography internal constructor(
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
    /**
     * typography l display-l-medium
     */
    public val displayLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l display-m-medium
     */
    public val displayMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-medium
     */
    public val displaySMedium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1-medium
     */
    public val headerH1Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2-medium
     */
    public val headerH2Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h3-medium
     */
    public val headerH3Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4-medium
     */
    public val headerH4Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h5-medium
     */
    public val headerH5Medium: TextStyle = TextStyle.Default,
    /**
     * typography l body-l-medium
     */
    public val bodyLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-m-medium
     */
    public val bodyMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-s-medium
     */
    public val bodySMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs-medium
     */
    public val bodyXsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs-medium
     */
    public val bodyXxsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-l-medium
     */
    public val textLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-m-medium
     */
    public val textMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-s-medium
     */
    public val textSMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs-medium
     */
    public val textXsMedium: TextStyle = TextStyle.Default,
)

internal val LocalPlasmaGigaTypography: ProvidableCompositionLocal<PlasmaGigaTypography> =
    staticCompositionLocalOf {
        PlasmaGigaTypography()
    }

/**
 * Возвращает [PlasmaGigaTypography] для WindowSizeClass.Compact
 */
public fun smallPlasmaGigaTypography(): PlasmaGigaTypography = PlasmaGigaTypography(
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
    displayLMedium = TypographySmallTokens.DisplayLMedium,
    displayMMedium = TypographySmallTokens.DisplayMMedium,
    displaySMedium = TypographySmallTokens.DisplaySMedium,
    headerH1Medium = TypographySmallTokens.HeaderH1Medium,
    headerH2Medium = TypographySmallTokens.HeaderH2Medium,
    headerH3Medium = TypographySmallTokens.HeaderH3Medium,
    headerH4Medium = TypographySmallTokens.HeaderH4Medium,
    headerH5Medium = TypographySmallTokens.HeaderH5Medium,
    bodyLMedium = TypographySmallTokens.BodyLMedium,
    bodyMMedium = TypographySmallTokens.BodyMMedium,
    bodySMedium = TypographySmallTokens.BodySMedium,
    bodyXsMedium = TypographySmallTokens.BodyXsMedium,
    bodyXxsMedium = TypographySmallTokens.BodyXxsMedium,
    textLMedium = TypographySmallTokens.TextLMedium,
    textMMedium = TypographySmallTokens.TextMMedium,
    textSMedium = TypographySmallTokens.TextSMedium,
    textXsMedium = TypographySmallTokens.TextXsMedium,
)

/**
 * Возвращает [PlasmaGigaTypography] для WindowSizeClass.Medium
 */
public fun mediumPlasmaGigaTypography(): PlasmaGigaTypography = PlasmaGigaTypography(
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
    displayLMedium = TypographyMediumTokens.DisplayLMedium,
    displayMMedium = TypographyMediumTokens.DisplayMMedium,
    displaySMedium = TypographyMediumTokens.DisplaySMedium,
    headerH1Medium = TypographyMediumTokens.HeaderH1Medium,
    headerH2Medium = TypographyMediumTokens.HeaderH2Medium,
    headerH3Medium = TypographyMediumTokens.HeaderH3Medium,
    headerH4Medium = TypographyMediumTokens.HeaderH4Medium,
    headerH5Medium = TypographyMediumTokens.HeaderH5Medium,
    bodyLMedium = TypographyMediumTokens.BodyLMedium,
    bodyMMedium = TypographyMediumTokens.BodyMMedium,
    bodySMedium = TypographyMediumTokens.BodySMedium,
    bodyXsMedium = TypographyMediumTokens.BodyXsMedium,
    bodyXxsMedium = TypographyMediumTokens.BodyXxsMedium,
    textLMedium = TypographyMediumTokens.TextLMedium,
    textMMedium = TypographyMediumTokens.TextMMedium,
    textSMedium = TypographyMediumTokens.TextSMedium,
    textXsMedium = TypographyMediumTokens.TextXsMedium,
)

/**
 * Возвращает [PlasmaGigaTypography] для WindowSizeClass.Expanded
 */
public fun largePlasmaGigaTypography(): PlasmaGigaTypography = PlasmaGigaTypography(
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
    displayLMedium = TypographyLargeTokens.DisplayLMedium,
    displayMMedium = TypographyLargeTokens.DisplayMMedium,
    displaySMedium = TypographyLargeTokens.DisplaySMedium,
    headerH1Medium = TypographyLargeTokens.HeaderH1Medium,
    headerH2Medium = TypographyLargeTokens.HeaderH2Medium,
    headerH3Medium = TypographyLargeTokens.HeaderH3Medium,
    headerH4Medium = TypographyLargeTokens.HeaderH4Medium,
    headerH5Medium = TypographyLargeTokens.HeaderH5Medium,
    bodyLMedium = TypographyLargeTokens.BodyLMedium,
    bodyMMedium = TypographyLargeTokens.BodyMMedium,
    bodySMedium = TypographyLargeTokens.BodySMedium,
    bodyXsMedium = TypographyLargeTokens.BodyXsMedium,
    bodyXxsMedium = TypographyLargeTokens.BodyXxsMedium,
    textLMedium = TypographyLargeTokens.TextLMedium,
    textMMedium = TypographyLargeTokens.TextMMedium,
    textSMedium = TypographyLargeTokens.TextSMedium,
    textXsMedium = TypographyLargeTokens.TextXsMedium,
)

/**
 * Возвращает разные [PlasmaGigaTypography] в зависимости от ширины окна. Значение динамически
 * изменяется при изменении ширины окна.
 */
@Composable
public fun dynamicPlasmaGigaTypography(): PlasmaGigaTypography {
    val widthClass = collectWindowSizeInfoAsState().value.widthClass
    return when (widthClass) {
        WindowSizeClass.Expanded -> largePlasmaGigaTypography()
        WindowSizeClass.Medium -> mediumPlasmaGigaTypography()
        WindowSizeClass.Compact -> smallPlasmaGigaTypography()
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
