// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.homeds.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.plasma.homeds.tokens.TypographyLargeTokens
import com.sdds.plasma.homeds.tokens.TypographyMediumTokens
import com.sdds.plasma.homeds.tokens.TypographySmallTokens

/**
 * Типографика PlasmaHomeDs
 */
@Immutable
public data class PlasmaHomeDsTypography internal constructor(
    /**
     * typography l display-l-bold
     */
    public val displayLBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-l-medium
     */
    public val displayLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l display-l
     */
    public val displayLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l display-m-bold
     */
    public val displayMBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-m-medium
     */
    public val displayMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l display-m
     */
    public val displayMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-bold
     */
    public val displaySBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-medium
     */
    public val displaySMedium: TextStyle = TextStyle.Default,
    /**
     * typography l display-s
     */
    public val displaySNormal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1-bold
     */
    public val headerH1Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1-medium
     */
    public val headerH1Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1
     */
    public val headerH1Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2-bold
     */
    public val headerH2Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2-medium
     */
    public val headerH2Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2
     */
    public val headerH2Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h3-bold
     */
    public val headerH3Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h3-medium
     */
    public val headerH3Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h3
     */
    public val headerH3Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4-bold
     */
    public val headerH4Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4-medium
     */
    public val headerH4Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4
     */
    public val headerH4Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h5-bold
     */
    public val headerH5Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h5-medium
     */
    public val headerH5Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h5
     */
    public val headerH5Normal: TextStyle = TextStyle.Default,
    /**
     * typography l body-l-bold
     */
    public val bodyLBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-l-medium
     */
    public val bodyLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-l
     */
    public val bodyLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-m-bold
     */
    public val bodyMBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-m-medium
     */
    public val bodyMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-m
     */
    public val bodyMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-s-bold
     */
    public val bodySBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-s-medium
     */
    public val bodySMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-s
     */
    public val bodySNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs-bold
     */
    public val bodyXsBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs-medium
     */
    public val bodyXsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs
     */
    public val bodyXsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs-bold
     */
    public val bodyXxsBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs-medium
     */
    public val bodyXxsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs
     */
    public val bodyXxsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-l-bold
     */
    public val textLBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-l-medium
     */
    public val textLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-l
     */
    public val textLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-m-bold
     */
    public val textMBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-m-medium
     */
    public val textMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-m
     */
    public val textMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-s-bold
     */
    public val textSBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-s-medium
     */
    public val textSMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-s
     */
    public val textSNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs-bold
     */
    public val textXsBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs-medium
     */
    public val textXsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs
     */
    public val textXsNormal: TextStyle = TextStyle.Default,
)

internal val LocalPlasmaHomeDsTypography: ProvidableCompositionLocal<PlasmaHomeDsTypography> =
    staticCompositionLocalOf {
        PlasmaHomeDsTypography()
    }

/**
 * Возвращает [PlasmaHomeDsTypography] для WindowSizeClass.Compact
 */
public fun smallPlasmaHomeDsTypography(): PlasmaHomeDsTypography = PlasmaHomeDsTypography(
    displayLBold = TypographySmallTokens.DisplayLBold,
    displayLMedium = TypographySmallTokens.DisplayLMedium,
    displayLNormal = TypographySmallTokens.DisplayLNormal,
    displayMBold = TypographySmallTokens.DisplayMBold,
    displayMMedium = TypographySmallTokens.DisplayMMedium,
    displayMNormal = TypographySmallTokens.DisplayMNormal,
    displaySBold = TypographySmallTokens.DisplaySBold,
    displaySMedium = TypographySmallTokens.DisplaySMedium,
    displaySNormal = TypographySmallTokens.DisplaySNormal,
    headerH1Bold = TypographySmallTokens.HeaderH1Bold,
    headerH1Medium = TypographySmallTokens.HeaderH1Medium,
    headerH1Normal = TypographySmallTokens.HeaderH1Normal,
    headerH2Bold = TypographySmallTokens.HeaderH2Bold,
    headerH2Medium = TypographySmallTokens.HeaderH2Medium,
    headerH2Normal = TypographySmallTokens.HeaderH2Normal,
    headerH3Bold = TypographySmallTokens.HeaderH3Bold,
    headerH3Medium = TypographySmallTokens.HeaderH3Medium,
    headerH3Normal = TypographySmallTokens.HeaderH3Normal,
    headerH4Bold = TypographySmallTokens.HeaderH4Bold,
    headerH4Medium = TypographySmallTokens.HeaderH4Medium,
    headerH4Normal = TypographySmallTokens.HeaderH4Normal,
    headerH5Bold = TypographySmallTokens.HeaderH5Bold,
    headerH5Medium = TypographySmallTokens.HeaderH5Medium,
    headerH5Normal = TypographySmallTokens.HeaderH5Normal,
    bodyLBold = TypographySmallTokens.BodyLBold,
    bodyLMedium = TypographySmallTokens.BodyLMedium,
    bodyLNormal = TypographySmallTokens.BodyLNormal,
    bodyMBold = TypographySmallTokens.BodyMBold,
    bodyMMedium = TypographySmallTokens.BodyMMedium,
    bodyMNormal = TypographySmallTokens.BodyMNormal,
    bodySBold = TypographySmallTokens.BodySBold,
    bodySMedium = TypographySmallTokens.BodySMedium,
    bodySNormal = TypographySmallTokens.BodySNormal,
    bodyXsBold = TypographySmallTokens.BodyXsBold,
    bodyXsMedium = TypographySmallTokens.BodyXsMedium,
    bodyXsNormal = TypographySmallTokens.BodyXsNormal,
    bodyXxsBold = TypographySmallTokens.BodyXxsBold,
    bodyXxsMedium = TypographySmallTokens.BodyXxsMedium,
    bodyXxsNormal = TypographySmallTokens.BodyXxsNormal,
    textLBold = TypographySmallTokens.TextLBold,
    textLMedium = TypographySmallTokens.TextLMedium,
    textLNormal = TypographySmallTokens.TextLNormal,
    textMBold = TypographySmallTokens.TextMBold,
    textMMedium = TypographySmallTokens.TextMMedium,
    textMNormal = TypographySmallTokens.TextMNormal,
    textSBold = TypographySmallTokens.TextSBold,
    textSMedium = TypographySmallTokens.TextSMedium,
    textSNormal = TypographySmallTokens.TextSNormal,
    textXsBold = TypographySmallTokens.TextXsBold,
    textXsMedium = TypographySmallTokens.TextXsMedium,
    textXsNormal = TypographySmallTokens.TextXsNormal,
)

/**
 * Возвращает [PlasmaHomeDsTypography] для WindowSizeClass.Medium
 */
public fun mediumPlasmaHomeDsTypography(): PlasmaHomeDsTypography = PlasmaHomeDsTypography(
    displayLBold = TypographyMediumTokens.DisplayLBold,
    displayLMedium = TypographyMediumTokens.DisplayLMedium,
    displayLNormal = TypographyMediumTokens.DisplayLNormal,
    displayMBold = TypographyMediumTokens.DisplayMBold,
    displayMMedium = TypographyMediumTokens.DisplayMMedium,
    displayMNormal = TypographyMediumTokens.DisplayMNormal,
    displaySBold = TypographyMediumTokens.DisplaySBold,
    displaySMedium = TypographyMediumTokens.DisplaySMedium,
    displaySNormal = TypographyMediumTokens.DisplaySNormal,
    headerH1Bold = TypographyMediumTokens.HeaderH1Bold,
    headerH1Medium = TypographyMediumTokens.HeaderH1Medium,
    headerH1Normal = TypographyMediumTokens.HeaderH1Normal,
    headerH2Bold = TypographyMediumTokens.HeaderH2Bold,
    headerH2Medium = TypographyMediumTokens.HeaderH2Medium,
    headerH2Normal = TypographyMediumTokens.HeaderH2Normal,
    headerH3Bold = TypographyMediumTokens.HeaderH3Bold,
    headerH3Medium = TypographyMediumTokens.HeaderH3Medium,
    headerH3Normal = TypographyMediumTokens.HeaderH3Normal,
    headerH4Bold = TypographyMediumTokens.HeaderH4Bold,
    headerH4Medium = TypographyMediumTokens.HeaderH4Medium,
    headerH4Normal = TypographyMediumTokens.HeaderH4Normal,
    headerH5Bold = TypographyMediumTokens.HeaderH5Bold,
    headerH5Medium = TypographyMediumTokens.HeaderH5Medium,
    headerH5Normal = TypographyMediumTokens.HeaderH5Normal,
    bodyLBold = TypographyMediumTokens.BodyLBold,
    bodyLMedium = TypographyMediumTokens.BodyLMedium,
    bodyLNormal = TypographyMediumTokens.BodyLNormal,
    bodyMBold = TypographyMediumTokens.BodyMBold,
    bodyMMedium = TypographyMediumTokens.BodyMMedium,
    bodyMNormal = TypographyMediumTokens.BodyMNormal,
    bodySBold = TypographyMediumTokens.BodySBold,
    bodySMedium = TypographyMediumTokens.BodySMedium,
    bodySNormal = TypographyMediumTokens.BodySNormal,
    bodyXsBold = TypographyMediumTokens.BodyXsBold,
    bodyXsMedium = TypographyMediumTokens.BodyXsMedium,
    bodyXsNormal = TypographyMediumTokens.BodyXsNormal,
    bodyXxsBold = TypographyMediumTokens.BodyXxsBold,
    bodyXxsMedium = TypographyMediumTokens.BodyXxsMedium,
    bodyXxsNormal = TypographyMediumTokens.BodyXxsNormal,
    textLBold = TypographyMediumTokens.TextLBold,
    textLMedium = TypographyMediumTokens.TextLMedium,
    textLNormal = TypographyMediumTokens.TextLNormal,
    textMBold = TypographyMediumTokens.TextMBold,
    textMMedium = TypographyMediumTokens.TextMMedium,
    textMNormal = TypographyMediumTokens.TextMNormal,
    textSBold = TypographyMediumTokens.TextSBold,
    textSMedium = TypographyMediumTokens.TextSMedium,
    textSNormal = TypographyMediumTokens.TextSNormal,
    textXsBold = TypographyMediumTokens.TextXsBold,
    textXsMedium = TypographyMediumTokens.TextXsMedium,
    textXsNormal = TypographyMediumTokens.TextXsNormal,
)

/**
 * Возвращает [PlasmaHomeDsTypography] для WindowSizeClass.Expanded
 */
public fun largePlasmaHomeDsTypography(): PlasmaHomeDsTypography = PlasmaHomeDsTypography(
    displayLBold = TypographyLargeTokens.DisplayLBold,
    displayLMedium = TypographyLargeTokens.DisplayLMedium,
    displayLNormal = TypographyLargeTokens.DisplayLNormal,
    displayMBold = TypographyLargeTokens.DisplayMBold,
    displayMMedium = TypographyLargeTokens.DisplayMMedium,
    displayMNormal = TypographyLargeTokens.DisplayMNormal,
    displaySBold = TypographyLargeTokens.DisplaySBold,
    displaySMedium = TypographyLargeTokens.DisplaySMedium,
    displaySNormal = TypographyLargeTokens.DisplaySNormal,
    headerH1Bold = TypographyLargeTokens.HeaderH1Bold,
    headerH1Medium = TypographyLargeTokens.HeaderH1Medium,
    headerH1Normal = TypographyLargeTokens.HeaderH1Normal,
    headerH2Bold = TypographyLargeTokens.HeaderH2Bold,
    headerH2Medium = TypographyLargeTokens.HeaderH2Medium,
    headerH2Normal = TypographyLargeTokens.HeaderH2Normal,
    headerH3Bold = TypographyLargeTokens.HeaderH3Bold,
    headerH3Medium = TypographyLargeTokens.HeaderH3Medium,
    headerH3Normal = TypographyLargeTokens.HeaderH3Normal,
    headerH4Bold = TypographyLargeTokens.HeaderH4Bold,
    headerH4Medium = TypographyLargeTokens.HeaderH4Medium,
    headerH4Normal = TypographyLargeTokens.HeaderH4Normal,
    headerH5Bold = TypographyLargeTokens.HeaderH5Bold,
    headerH5Medium = TypographyLargeTokens.HeaderH5Medium,
    headerH5Normal = TypographyLargeTokens.HeaderH5Normal,
    bodyLBold = TypographyLargeTokens.BodyLBold,
    bodyLMedium = TypographyLargeTokens.BodyLMedium,
    bodyLNormal = TypographyLargeTokens.BodyLNormal,
    bodyMBold = TypographyLargeTokens.BodyMBold,
    bodyMMedium = TypographyLargeTokens.BodyMMedium,
    bodyMNormal = TypographyLargeTokens.BodyMNormal,
    bodySBold = TypographyLargeTokens.BodySBold,
    bodySMedium = TypographyLargeTokens.BodySMedium,
    bodySNormal = TypographyLargeTokens.BodySNormal,
    bodyXsBold = TypographyLargeTokens.BodyXsBold,
    bodyXsMedium = TypographyLargeTokens.BodyXsMedium,
    bodyXsNormal = TypographyLargeTokens.BodyXsNormal,
    bodyXxsBold = TypographyLargeTokens.BodyXxsBold,
    bodyXxsMedium = TypographyLargeTokens.BodyXxsMedium,
    bodyXxsNormal = TypographyLargeTokens.BodyXxsNormal,
    textLBold = TypographyLargeTokens.TextLBold,
    textLMedium = TypographyLargeTokens.TextLMedium,
    textLNormal = TypographyLargeTokens.TextLNormal,
    textMBold = TypographyLargeTokens.TextMBold,
    textMMedium = TypographyLargeTokens.TextMMedium,
    textMNormal = TypographyLargeTokens.TextMNormal,
    textSBold = TypographyLargeTokens.TextSBold,
    textSMedium = TypographyLargeTokens.TextSMedium,
    textSNormal = TypographyLargeTokens.TextSNormal,
    textXsBold = TypographyLargeTokens.TextXsBold,
    textXsMedium = TypographyLargeTokens.TextXsMedium,
    textXsNormal = TypographyLargeTokens.TextXsNormal,
)

/**
 * Возвращает разные [PlasmaHomeDsTypography] в зависимости от ширины окна. Значение динамически
 * изменяется при изменении ширины окна.
 */
@Composable
public fun dynamicPlasmaHomeDsTypography(): PlasmaHomeDsTypography {
    val widthClass = collectWindowSizeInfoAsState().value.widthClass
    return when (widthClass) {
        WindowSizeClass.Expanded -> largePlasmaHomeDsTypography()
        WindowSizeClass.Medium -> mediumPlasmaHomeDsTypography()
        WindowSizeClass.Compact -> smallPlasmaHomeDsTypography()
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
