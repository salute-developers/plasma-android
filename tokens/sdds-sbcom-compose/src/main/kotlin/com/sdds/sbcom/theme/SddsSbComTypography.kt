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
     * typography l body-xs-medium
     */
    public val bodyXsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs-medium
     */
    public val bodyXxsMedium: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs
     */
    public val bodyXxsNormal: TextStyle = TextStyle.Default,
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
     * typography l header-h4-medium
     */
    public val headerH4Medium: TextStyle = TextStyle.Default,
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
     * typography l body-xs
     */
    public val bodyXsNormal: TextStyle = TextStyle.Default,
    /**
     * typography l body-xxs-bold
     */
    public val bodyXxsBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-bold
     */
    public val displaySBold: TextStyle = TextStyle.Default,
    /**
     * typography l display-s
     */
    public val displaySNormal: TextStyle = TextStyle.Default,
    /**
     * typography l header-h2-medium
     */
    public val headerH2Medium: TextStyle = TextStyle.Default,
    /**
     * typography l display-s-medium
     */
    public val displaySMedium: TextStyle = TextStyle.Default,
)

internal val LocalSddsSbComTypography: ProvidableCompositionLocal<SddsSbComTypography> =
    staticCompositionLocalOf {
        SddsSbComTypography()
    }

/**
 * Возвращает [SddsSbComTypography] для WindowSizeClass.Compact
 */
public fun smallSddsSbComTypography(): SddsSbComTypography = SddsSbComTypography(
    bodyXsMedium = TypographySmallTokens.BodyXsMedium,
    bodyXxsMedium = TypographySmallTokens.BodyXxsMedium,
    bodyXxsNormal = TypographySmallTokens.BodyXxsNormal,
    headerH1Bold = TypographySmallTokens.HeaderH1Bold,
    headerH1Medium = TypographySmallTokens.HeaderH1Medium,
    headerH1Normal = TypographySmallTokens.HeaderH1Normal,
    headerH3Bold = TypographySmallTokens.HeaderH3Bold,
    headerH3Medium = TypographySmallTokens.HeaderH3Medium,
    headerH3Normal = TypographySmallTokens.HeaderH3Normal,
    headerH4Medium = TypographySmallTokens.HeaderH4Medium,
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
    bodyXsNormal = TypographySmallTokens.BodyXsNormal,
    bodyXxsBold = TypographySmallTokens.BodyXxsBold,
    displaySBold = TypographySmallTokens.DisplaySBold,
    displaySNormal = TypographySmallTokens.DisplaySNormal,
    headerH2Medium = TypographySmallTokens.HeaderH2Medium,
    displaySMedium = TypographySmallTokens.DisplaySMedium,
)

/**
 * Возвращает [SddsSbComTypography] для WindowSizeClass.Medium
 */
public fun mediumSddsSbComTypography(): SddsSbComTypography = SddsSbComTypography(
    bodyXsMedium = TypographyMediumTokens.BodyXsMedium,
    bodyXxsMedium = TypographyMediumTokens.BodyXxsMedium,
    bodyXxsNormal = TypographyMediumTokens.BodyXxsNormal,
    headerH1Bold = TypographyMediumTokens.HeaderH1Bold,
    headerH1Medium = TypographyMediumTokens.HeaderH1Medium,
    headerH1Normal = TypographyMediumTokens.HeaderH1Normal,
    headerH3Bold = TypographyMediumTokens.HeaderH3Bold,
    headerH3Medium = TypographyMediumTokens.HeaderH3Medium,
    headerH3Normal = TypographyMediumTokens.HeaderH3Normal,
    headerH4Medium = TypographyMediumTokens.HeaderH4Medium,
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
    bodyXsNormal = TypographyMediumTokens.BodyXsNormal,
    bodyXxsBold = TypographyMediumTokens.BodyXxsBold,
    displaySBold = TypographyMediumTokens.DisplaySBold,
    displaySNormal = TypographyMediumTokens.DisplaySNormal,
    headerH2Medium = TypographyMediumTokens.HeaderH2Medium,
    displaySMedium = TypographyMediumTokens.DisplaySMedium,
)

/**
 * Возвращает [SddsSbComTypography] для WindowSizeClass.Expanded
 */
public fun largeSddsSbComTypography(): SddsSbComTypography = SddsSbComTypography(
    bodyXsMedium = TypographyLargeTokens.BodyXsMedium,
    bodyXxsMedium = TypographyLargeTokens.BodyXxsMedium,
    bodyXxsNormal = TypographyLargeTokens.BodyXxsNormal,
    headerH1Bold = TypographyLargeTokens.HeaderH1Bold,
    headerH1Medium = TypographyLargeTokens.HeaderH1Medium,
    headerH1Normal = TypographyLargeTokens.HeaderH1Normal,
    headerH3Bold = TypographyLargeTokens.HeaderH3Bold,
    headerH3Medium = TypographyLargeTokens.HeaderH3Medium,
    headerH3Normal = TypographyLargeTokens.HeaderH3Normal,
    headerH4Medium = TypographyLargeTokens.HeaderH4Medium,
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
    bodyXsNormal = TypographyLargeTokens.BodyXsNormal,
    bodyXxsBold = TypographyLargeTokens.BodyXxsBold,
    displaySBold = TypographyLargeTokens.DisplaySBold,
    displaySNormal = TypographyLargeTokens.DisplaySNormal,
    headerH2Medium = TypographyLargeTokens.HeaderH2Medium,
    displaySMedium = TypographyLargeTokens.DisplaySMedium,
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
