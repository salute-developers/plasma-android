// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.sbcom.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.sbcom.tokens.TypographyLargeTokens
import com.sdds.sbcom.tokens.TypographyMediumTokens
import com.sdds.sbcom.tokens.TypographySmallTokens

/**
 * Типографика SddsSbCom
 */
@Immutable
public data class SddsSbComTypography internal constructor(
    /**
     * typography l body-xxs-bold
     */
    public val bodyXxsBold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2-medium
     */
    public val headerH2Medium: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-bold
     */
    public val displaySBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-medium
     */
    public val displaySMedium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1
     */
    public val headerH1Normal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1-bold
     */
    public val headerH1Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h1-medium
     */
    public val headerH1Medium: TextStyle = TextStyle.Default,
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
     * typography l header-h3-medium
     */
    public val headerH3Medium: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4
     */
    public val headerH4Normal: TextStyle = TextStyle.Default,
    /**
     * typography l display-s
     */
    public val displaySNormal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4-bold
     */
    public val headerH4Bold: TextStyle = TextStyle.Default,
    /**
     * typography l header-h4-medium
     */
    public val headerH4Medium: TextStyle = TextStyle.Default,
    /**
     * typography l body-l
     */
    public val bodyLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-l-bold
     */
    public val bodyLBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-s-bold
     */
    public val bodySBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-l-medium
     */
    public val bodyLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-m
     */
    public val bodyMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-s-medium
     */
    public val bodySMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs
     */
    public val bodyXsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs-bold
     */
    public val bodyXsBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-xs-medium
     */
    public val bodyXsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs
     */
    public val bodyXxsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-m-bold
     */
    public val bodyMBold: TextStyle = TextStyle.Default,
    /**
     * typography l body-m-medium
     */
    public val bodyMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-s
     */
    public val bodySNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs-medium
     */
    public val bodyXxsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-l
     */
    public val textLNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-s-medium
     */
    public val textSMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-l-bold
     */
    public val textLBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-m
     */
    public val textMNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-l-medium
     */
    public val textLMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-s
     */
    public val textSNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-s-bold
     */
    public val textSBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-m-bold
     */
    public val textMBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-m-medium
     */
    public val textMMedium: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs
     */
    public val textXsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs-bold
     */
    public val textXsBold: TextStyle = TextStyle.Default,
    /**
     * typography l text-xs-medium
     */
    public val textXsMedium: TextStyle = TextStyle.Default,
)

internal val LocalSddsSbComTypography: ProvidableCompositionLocal<SddsSbComTypography> =
    staticCompositionLocalOf {
        SddsSbComTypography()
    }

/**
 * Возвращает [SddsSbComTypography] для WindowSizeClass.Compact
 */
public fun smallSddsSbComTypography(): SddsSbComTypography = SddsSbComTypography(
    bodyXxsBold = TypographySmallTokens.BodyXxsBold,
    headerH2Medium = TypographySmallTokens.HeaderH2Medium,
    displaySBold = TypographySmallTokens.DisplaySBold,
    displaySMedium = TypographySmallTokens.DisplaySMedium,
    headerH1Normal = TypographySmallTokens.HeaderH1Normal,
    headerH1Bold = TypographySmallTokens.HeaderH1Bold,
    headerH1Medium = TypographySmallTokens.HeaderH1Medium,
    headerH2Normal = TypographySmallTokens.HeaderH2Normal,
    headerH2Bold = TypographySmallTokens.HeaderH2Bold,
    headerH3Normal = TypographySmallTokens.HeaderH3Normal,
    headerH3Bold = TypographySmallTokens.HeaderH3Bold,
    headerH3Medium = TypographySmallTokens.HeaderH3Medium,
    headerH4Normal = TypographySmallTokens.HeaderH4Normal,
    displaySNormal = TypographySmallTokens.DisplaySNormal,
    headerH4Bold = TypographySmallTokens.HeaderH4Bold,
    headerH4Medium = TypographySmallTokens.HeaderH4Medium,
    bodyLNormal = TypographySmallTokens.BodyLNormal,
    bodyLBold = TypographySmallTokens.BodyLBold,
    bodySBold = TypographySmallTokens.BodySBold,
    bodyLMedium = TypographySmallTokens.BodyLMedium,
    bodyMNormal = TypographySmallTokens.BodyMNormal,
    bodySMedium = TypographySmallTokens.BodySMedium,
    bodyXsNormal = TypographySmallTokens.BodyXsNormal,
    bodyXsBold = TypographySmallTokens.BodyXsBold,
    bodyXsMedium = TypographySmallTokens.BodyXsMedium,
    bodyXxsNormal = TypographySmallTokens.BodyXxsNormal,
    bodyMBold = TypographySmallTokens.BodyMBold,
    bodyMMedium = TypographySmallTokens.BodyMMedium,
    bodySNormal = TypographySmallTokens.BodySNormal,
    bodyXxsMedium = TypographySmallTokens.BodyXxsMedium,
    textLNormal = TypographySmallTokens.TextLNormal,
    textSMedium = TypographySmallTokens.TextSMedium,
    textLBold = TypographySmallTokens.TextLBold,
    textMNormal = TypographySmallTokens.TextMNormal,
    textLMedium = TypographySmallTokens.TextLMedium,
    textSNormal = TypographySmallTokens.TextSNormal,
    textSBold = TypographySmallTokens.TextSBold,
    textMBold = TypographySmallTokens.TextMBold,
    textMMedium = TypographySmallTokens.TextMMedium,
    textXsNormal = TypographySmallTokens.TextXsNormal,
    textXsBold = TypographySmallTokens.TextXsBold,
    textXsMedium = TypographySmallTokens.TextXsMedium,
)

/**
 * Возвращает [SddsSbComTypography] для WindowSizeClass.Medium
 */
public fun mediumSddsSbComTypography(): SddsSbComTypography = SddsSbComTypography(
    bodyXxsBold = TypographyMediumTokens.BodyXxsBold,
    headerH2Medium = TypographyMediumTokens.HeaderH2Medium,
    displaySBold = TypographyMediumTokens.DisplaySBold,
    displaySMedium = TypographyMediumTokens.DisplaySMedium,
    headerH1Normal = TypographyMediumTokens.HeaderH1Normal,
    headerH1Bold = TypographyMediumTokens.HeaderH1Bold,
    headerH1Medium = TypographyMediumTokens.HeaderH1Medium,
    headerH2Normal = TypographyMediumTokens.HeaderH2Normal,
    headerH2Bold = TypographyMediumTokens.HeaderH2Bold,
    headerH3Normal = TypographyMediumTokens.HeaderH3Normal,
    headerH3Bold = TypographyMediumTokens.HeaderH3Bold,
    headerH3Medium = TypographyMediumTokens.HeaderH3Medium,
    headerH4Normal = TypographyMediumTokens.HeaderH4Normal,
    displaySNormal = TypographyMediumTokens.DisplaySNormal,
    headerH4Bold = TypographyMediumTokens.HeaderH4Bold,
    headerH4Medium = TypographyMediumTokens.HeaderH4Medium,
    bodyLNormal = TypographyMediumTokens.BodyLNormal,
    bodyLBold = TypographyMediumTokens.BodyLBold,
    bodySBold = TypographyMediumTokens.BodySBold,
    bodyLMedium = TypographyMediumTokens.BodyLMedium,
    bodyMNormal = TypographyMediumTokens.BodyMNormal,
    bodySMedium = TypographyMediumTokens.BodySMedium,
    bodyXsNormal = TypographyMediumTokens.BodyXsNormal,
    bodyXsBold = TypographyMediumTokens.BodyXsBold,
    bodyXsMedium = TypographyMediumTokens.BodyXsMedium,
    bodyXxsNormal = TypographyMediumTokens.BodyXxsNormal,
    bodyMBold = TypographyMediumTokens.BodyMBold,
    bodyMMedium = TypographyMediumTokens.BodyMMedium,
    bodySNormal = TypographyMediumTokens.BodySNormal,
    bodyXxsMedium = TypographyMediumTokens.BodyXxsMedium,
    textLNormal = TypographyMediumTokens.TextLNormal,
    textSMedium = TypographyMediumTokens.TextSMedium,
    textLBold = TypographyMediumTokens.TextLBold,
    textMNormal = TypographyMediumTokens.TextMNormal,
    textLMedium = TypographyMediumTokens.TextLMedium,
    textSNormal = TypographyMediumTokens.TextSNormal,
    textSBold = TypographyMediumTokens.TextSBold,
    textMBold = TypographyMediumTokens.TextMBold,
    textMMedium = TypographyMediumTokens.TextMMedium,
    textXsNormal = TypographyMediumTokens.TextXsNormal,
    textXsBold = TypographyMediumTokens.TextXsBold,
    textXsMedium = TypographyMediumTokens.TextXsMedium,
)

/**
 * Возвращает [SddsSbComTypography] для WindowSizeClass.Expanded
 */
public fun largeSddsSbComTypography(): SddsSbComTypography = SddsSbComTypography(
    bodyXxsBold = TypographyLargeTokens.BodyXxsBold,
    headerH2Medium = TypographyLargeTokens.HeaderH2Medium,
    displaySBold = TypographyLargeTokens.DisplaySBold,
    displaySMedium = TypographyLargeTokens.DisplaySMedium,
    headerH1Normal = TypographyLargeTokens.HeaderH1Normal,
    headerH1Bold = TypographyLargeTokens.HeaderH1Bold,
    headerH1Medium = TypographyLargeTokens.HeaderH1Medium,
    headerH2Normal = TypographyLargeTokens.HeaderH2Normal,
    headerH2Bold = TypographyLargeTokens.HeaderH2Bold,
    headerH3Normal = TypographyLargeTokens.HeaderH3Normal,
    headerH3Bold = TypographyLargeTokens.HeaderH3Bold,
    headerH3Medium = TypographyLargeTokens.HeaderH3Medium,
    headerH4Normal = TypographyLargeTokens.HeaderH4Normal,
    displaySNormal = TypographyLargeTokens.DisplaySNormal,
    headerH4Bold = TypographyLargeTokens.HeaderH4Bold,
    headerH4Medium = TypographyLargeTokens.HeaderH4Medium,
    bodyLNormal = TypographyLargeTokens.BodyLNormal,
    bodyLBold = TypographyLargeTokens.BodyLBold,
    bodySBold = TypographyLargeTokens.BodySBold,
    bodyLMedium = TypographyLargeTokens.BodyLMedium,
    bodyMNormal = TypographyLargeTokens.BodyMNormal,
    bodySMedium = TypographyLargeTokens.BodySMedium,
    bodyXsNormal = TypographyLargeTokens.BodyXsNormal,
    bodyXsBold = TypographyLargeTokens.BodyXsBold,
    bodyXsMedium = TypographyLargeTokens.BodyXsMedium,
    bodyXxsNormal = TypographyLargeTokens.BodyXxsNormal,
    bodyMBold = TypographyLargeTokens.BodyMBold,
    bodyMMedium = TypographyLargeTokens.BodyMMedium,
    bodySNormal = TypographyLargeTokens.BodySNormal,
    bodyXxsMedium = TypographyLargeTokens.BodyXxsMedium,
    textLNormal = TypographyLargeTokens.TextLNormal,
    textSMedium = TypographyLargeTokens.TextSMedium,
    textLBold = TypographyLargeTokens.TextLBold,
    textMNormal = TypographyLargeTokens.TextMNormal,
    textLMedium = TypographyLargeTokens.TextLMedium,
    textSNormal = TypographyLargeTokens.TextSNormal,
    textSBold = TypographyLargeTokens.TextSBold,
    textMBold = TypographyLargeTokens.TextMBold,
    textMMedium = TypographyLargeTokens.TextMMedium,
    textXsNormal = TypographyLargeTokens.TextXsNormal,
    textXsBold = TypographyLargeTokens.TextXsBold,
    textXsMedium = TypographyLargeTokens.TextXsMedium,
)

/**
 * Возвращает разные [SddsSbComTypography] в зависимости от ширины окна. Значение динамически
 * изменяется при изменении ширины окна.
 */
@Composable
public fun dynamicSddsSbComTypography(): SddsSbComTypography {
    val widthClass = collectWindowSizeInfoAsState().value.widthClass
    return when (widthClass) {
        WindowSizeClass.Expanded -> largeSddsSbComTypography()
        WindowSizeClass.Medium -> mediumSddsSbComTypography()
        WindowSizeClass.Compact -> smallSddsSbComTypography()
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
