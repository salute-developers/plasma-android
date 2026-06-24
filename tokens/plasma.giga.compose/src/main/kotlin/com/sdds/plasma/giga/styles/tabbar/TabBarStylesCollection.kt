// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.tabbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TabBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TabBar
 */
public enum class TabBarStyles(
    public val key: String,
) {
    TabBarHasLabelClearMDefault("TabBarHasLabelClear.M.Default"),
    TabBarHasLabelClearMSecondary("TabBarHasLabelClear.M.Secondary"),
    TabBarHasLabelClearMAccent("TabBarHasLabelClear.M.Accent"),
    TabBarHasLabelClearMRoundedDefault("TabBarHasLabelClear.M.Rounded.Default"),
    TabBarHasLabelClearMRoundedSecondary("TabBarHasLabelClear.M.Rounded.Secondary"),
    TabBarHasLabelClearMRoundedAccent("TabBarHasLabelClear.M.Rounded.Accent"),
    TabBarHasLabelClearMShadowDefault("TabBarHasLabelClear.M.Shadow.Default"),
    TabBarHasLabelClearMShadowSecondary("TabBarHasLabelClear.M.Shadow.Secondary"),
    TabBarHasLabelClearMShadowAccent("TabBarHasLabelClear.M.Shadow.Accent"),
    TabBarHasLabelClearMShadowRoundedDefault("TabBarHasLabelClear.M.Shadow.Rounded.Default"),
    TabBarHasLabelClearMShadowRoundedSecondary("TabBarHasLabelClear.M.Shadow.Rounded.Secondary"),
    TabBarHasLabelClearMShadowRoundedAccent("TabBarHasLabelClear.M.Shadow.Rounded.Accent"),
    TabBarHasLabelClearMDividerDefault("TabBarHasLabelClear.M.Divider.Default"),
    TabBarHasLabelClearMDividerSecondary("TabBarHasLabelClear.M.Divider.Secondary"),
    TabBarHasLabelClearMDividerAccent("TabBarHasLabelClear.M.Divider.Accent"),
    TabBarHasLabelClearMDividerRoundedDefault("TabBarHasLabelClear.M.Divider.Rounded.Default"),
    TabBarHasLabelClearMDividerRoundedSecondary("TabBarHasLabelClear.M.Divider.Rounded.Secondary"),
    TabBarHasLabelClearMDividerRoundedAccent("TabBarHasLabelClear.M.Divider.Rounded.Accent"),
    TabBarHasLabelClearLDefault("TabBarHasLabelClear.L.Default"),
    TabBarHasLabelClearLSecondary("TabBarHasLabelClear.L.Secondary"),
    TabBarHasLabelClearLAccent("TabBarHasLabelClear.L.Accent"),
    TabBarHasLabelClearLRoundedDefault("TabBarHasLabelClear.L.Rounded.Default"),
    TabBarHasLabelClearLRoundedSecondary("TabBarHasLabelClear.L.Rounded.Secondary"),
    TabBarHasLabelClearLRoundedAccent("TabBarHasLabelClear.L.Rounded.Accent"),
    TabBarHasLabelClearLShadowDefault("TabBarHasLabelClear.L.Shadow.Default"),
    TabBarHasLabelClearLShadowSecondary("TabBarHasLabelClear.L.Shadow.Secondary"),
    TabBarHasLabelClearLShadowAccent("TabBarHasLabelClear.L.Shadow.Accent"),
    TabBarHasLabelClearLShadowRoundedDefault("TabBarHasLabelClear.L.Shadow.Rounded.Default"),
    TabBarHasLabelClearLShadowRoundedSecondary("TabBarHasLabelClear.L.Shadow.Rounded.Secondary"),
    TabBarHasLabelClearLShadowRoundedAccent("TabBarHasLabelClear.L.Shadow.Rounded.Accent"),
    TabBarHasLabelClearLDividerDefault("TabBarHasLabelClear.L.Divider.Default"),
    TabBarHasLabelClearLDividerSecondary("TabBarHasLabelClear.L.Divider.Secondary"),
    TabBarHasLabelClearLDividerAccent("TabBarHasLabelClear.L.Divider.Accent"),
    TabBarHasLabelClearLDividerRoundedDefault("TabBarHasLabelClear.L.Divider.Rounded.Default"),
    TabBarHasLabelClearLDividerRoundedSecondary("TabBarHasLabelClear.L.Divider.Rounded.Secondary"),
    TabBarHasLabelClearLDividerRoundedAccent("TabBarHasLabelClear.L.Divider.Rounded.Accent"),
    TabBarHasLabelSolidMDefault("TabBarHasLabelSolid.M.Default"),
    TabBarHasLabelSolidMSecondary("TabBarHasLabelSolid.M.Secondary"),
    TabBarHasLabelSolidMAccent("TabBarHasLabelSolid.M.Accent"),
    TabBarHasLabelSolidMRoundedDefault("TabBarHasLabelSolid.M.Rounded.Default"),
    TabBarHasLabelSolidMRoundedSecondary("TabBarHasLabelSolid.M.Rounded.Secondary"),
    TabBarHasLabelSolidMRoundedAccent("TabBarHasLabelSolid.M.Rounded.Accent"),
    TabBarHasLabelSolidMShadowDefault("TabBarHasLabelSolid.M.Shadow.Default"),
    TabBarHasLabelSolidMShadowSecondary("TabBarHasLabelSolid.M.Shadow.Secondary"),
    TabBarHasLabelSolidMShadowAccent("TabBarHasLabelSolid.M.Shadow.Accent"),
    TabBarHasLabelSolidMShadowRoundedDefault("TabBarHasLabelSolid.M.Shadow.Rounded.Default"),
    TabBarHasLabelSolidMShadowRoundedSecondary("TabBarHasLabelSolid.M.Shadow.Rounded.Secondary"),
    TabBarHasLabelSolidMShadowRoundedAccent("TabBarHasLabelSolid.M.Shadow.Rounded.Accent"),
    TabBarHasLabelSolidMDividerDefault("TabBarHasLabelSolid.M.Divider.Default"),
    TabBarHasLabelSolidMDividerSecondary("TabBarHasLabelSolid.M.Divider.Secondary"),
    TabBarHasLabelSolidMDividerAccent("TabBarHasLabelSolid.M.Divider.Accent"),
    TabBarHasLabelSolidMDividerRoundedDefault("TabBarHasLabelSolid.M.Divider.Rounded.Default"),
    TabBarHasLabelSolidMDividerRoundedSecondary("TabBarHasLabelSolid.M.Divider.Rounded.Secondary"),
    TabBarHasLabelSolidMDividerRoundedAccent("TabBarHasLabelSolid.M.Divider.Rounded.Accent"),
    TabBarHasLabelSolidLDefault("TabBarHasLabelSolid.L.Default"),
    TabBarHasLabelSolidLSecondary("TabBarHasLabelSolid.L.Secondary"),
    TabBarHasLabelSolidLAccent("TabBarHasLabelSolid.L.Accent"),
    TabBarHasLabelSolidLRoundedDefault("TabBarHasLabelSolid.L.Rounded.Default"),
    TabBarHasLabelSolidLRoundedSecondary("TabBarHasLabelSolid.L.Rounded.Secondary"),
    TabBarHasLabelSolidLRoundedAccent("TabBarHasLabelSolid.L.Rounded.Accent"),
    TabBarHasLabelSolidLShadowDefault("TabBarHasLabelSolid.L.Shadow.Default"),
    TabBarHasLabelSolidLShadowSecondary("TabBarHasLabelSolid.L.Shadow.Secondary"),
    TabBarHasLabelSolidLShadowAccent("TabBarHasLabelSolid.L.Shadow.Accent"),
    TabBarHasLabelSolidLShadowRoundedDefault("TabBarHasLabelSolid.L.Shadow.Rounded.Default"),
    TabBarHasLabelSolidLShadowRoundedSecondary("TabBarHasLabelSolid.L.Shadow.Rounded.Secondary"),
    TabBarHasLabelSolidLShadowRoundedAccent("TabBarHasLabelSolid.L.Shadow.Rounded.Accent"),
    TabBarHasLabelSolidLDividerDefault("TabBarHasLabelSolid.L.Divider.Default"),
    TabBarHasLabelSolidLDividerSecondary("TabBarHasLabelSolid.L.Divider.Secondary"),
    TabBarHasLabelSolidLDividerAccent("TabBarHasLabelSolid.L.Divider.Accent"),
    TabBarHasLabelSolidLDividerRoundedDefault("TabBarHasLabelSolid.L.Divider.Rounded.Default"),
    TabBarHasLabelSolidLDividerRoundedSecondary("TabBarHasLabelSolid.L.Divider.Rounded.Secondary"),
    TabBarHasLabelSolidLDividerRoundedAccent("TabBarHasLabelSolid.L.Divider.Rounded.Accent"),
    TabBarIslandHasLabelClearMDefault("TabBarIslandHasLabelClear.M.Default"),
    TabBarIslandHasLabelClearMSecondary("TabBarIslandHasLabelClear.M.Secondary"),
    TabBarIslandHasLabelClearMAccent("TabBarIslandHasLabelClear.M.Accent"),
    TabBarIslandHasLabelClearMShadowDefault("TabBarIslandHasLabelClear.M.Shadow.Default"),
    TabBarIslandHasLabelClearMShadowSecondary("TabBarIslandHasLabelClear.M.Shadow.Secondary"),
    TabBarIslandHasLabelClearMShadowAccent("TabBarIslandHasLabelClear.M.Shadow.Accent"),
    TabBarIslandHasLabelClearLDefault("TabBarIslandHasLabelClear.L.Default"),
    TabBarIslandHasLabelClearLSecondary("TabBarIslandHasLabelClear.L.Secondary"),
    TabBarIslandHasLabelClearLAccent("TabBarIslandHasLabelClear.L.Accent"),
    TabBarIslandHasLabelClearLShadowDefault("TabBarIslandHasLabelClear.L.Shadow.Default"),
    TabBarIslandHasLabelClearLShadowSecondary("TabBarIslandHasLabelClear.L.Shadow.Secondary"),
    TabBarIslandHasLabelClearLShadowAccent("TabBarIslandHasLabelClear.L.Shadow.Accent"),
    TabBarIslandHasLabelSolidMDefault("TabBarIslandHasLabelSolid.M.Default"),
    TabBarIslandHasLabelSolidMSecondary("TabBarIslandHasLabelSolid.M.Secondary"),
    TabBarIslandHasLabelSolidMAccent("TabBarIslandHasLabelSolid.M.Accent"),
    TabBarIslandHasLabelSolidMShadowDefault("TabBarIslandHasLabelSolid.M.Shadow.Default"),
    TabBarIslandHasLabelSolidMShadowSecondary("TabBarIslandHasLabelSolid.M.Shadow.Secondary"),
    TabBarIslandHasLabelSolidMShadowAccent("TabBarIslandHasLabelSolid.M.Shadow.Accent"),
    TabBarIslandHasLabelSolidLDefault("TabBarIslandHasLabelSolid.L.Default"),
    TabBarIslandHasLabelSolidLSecondary("TabBarIslandHasLabelSolid.L.Secondary"),
    TabBarIslandHasLabelSolidLAccent("TabBarIslandHasLabelSolid.L.Accent"),
    TabBarIslandHasLabelSolidLShadowDefault("TabBarIslandHasLabelSolid.L.Shadow.Default"),
    TabBarIslandHasLabelSolidLShadowSecondary("TabBarIslandHasLabelSolid.L.Shadow.Secondary"),
    TabBarIslandHasLabelSolidLShadowAccent("TabBarIslandHasLabelSolid.L.Shadow.Accent"),
    TabBarClearMDefault("TabBarClear.M.Default"),
    TabBarClearMSecondary("TabBarClear.M.Secondary"),
    TabBarClearMAccent("TabBarClear.M.Accent"),
    TabBarClearMRoundedDefault("TabBarClear.M.Rounded.Default"),
    TabBarClearMRoundedSecondary("TabBarClear.M.Rounded.Secondary"),
    TabBarClearMRoundedAccent("TabBarClear.M.Rounded.Accent"),
    TabBarClearMShadowDefault("TabBarClear.M.Shadow.Default"),
    TabBarClearMShadowSecondary("TabBarClear.M.Shadow.Secondary"),
    TabBarClearMShadowAccent("TabBarClear.M.Shadow.Accent"),
    TabBarClearMShadowRoundedDefault("TabBarClear.M.Shadow.Rounded.Default"),
    TabBarClearMShadowRoundedSecondary("TabBarClear.M.Shadow.Rounded.Secondary"),
    TabBarClearMShadowRoundedAccent("TabBarClear.M.Shadow.Rounded.Accent"),
    TabBarClearMDividerDefault("TabBarClear.M.Divider.Default"),
    TabBarClearMDividerSecondary("TabBarClear.M.Divider.Secondary"),
    TabBarClearMDividerAccent("TabBarClear.M.Divider.Accent"),
    TabBarClearMDividerRoundedDefault("TabBarClear.M.Divider.Rounded.Default"),
    TabBarClearMDividerRoundedSecondary("TabBarClear.M.Divider.Rounded.Secondary"),
    TabBarClearMDividerRoundedAccent("TabBarClear.M.Divider.Rounded.Accent"),
    TabBarClearLDefault("TabBarClear.L.Default"),
    TabBarClearLSecondary("TabBarClear.L.Secondary"),
    TabBarClearLAccent("TabBarClear.L.Accent"),
    TabBarClearLRoundedDefault("TabBarClear.L.Rounded.Default"),
    TabBarClearLRoundedSecondary("TabBarClear.L.Rounded.Secondary"),
    TabBarClearLRoundedAccent("TabBarClear.L.Rounded.Accent"),
    TabBarClearLShadowDefault("TabBarClear.L.Shadow.Default"),
    TabBarClearLShadowSecondary("TabBarClear.L.Shadow.Secondary"),
    TabBarClearLShadowAccent("TabBarClear.L.Shadow.Accent"),
    TabBarClearLShadowRoundedDefault("TabBarClear.L.Shadow.Rounded.Default"),
    TabBarClearLShadowRoundedSecondary("TabBarClear.L.Shadow.Rounded.Secondary"),
    TabBarClearLShadowRoundedAccent("TabBarClear.L.Shadow.Rounded.Accent"),
    TabBarClearLDividerDefault("TabBarClear.L.Divider.Default"),
    TabBarClearLDividerSecondary("TabBarClear.L.Divider.Secondary"),
    TabBarClearLDividerAccent("TabBarClear.L.Divider.Accent"),
    TabBarClearLDividerRoundedDefault("TabBarClear.L.Divider.Rounded.Default"),
    TabBarClearLDividerRoundedSecondary("TabBarClear.L.Divider.Rounded.Secondary"),
    TabBarClearLDividerRoundedAccent("TabBarClear.L.Divider.Rounded.Accent"),
    TabBarSolidMDefault("TabBarSolid.M.Default"),
    TabBarSolidMSecondary("TabBarSolid.M.Secondary"),
    TabBarSolidMAccent("TabBarSolid.M.Accent"),
    TabBarSolidMRoundedDefault("TabBarSolid.M.Rounded.Default"),
    TabBarSolidMRoundedSecondary("TabBarSolid.M.Rounded.Secondary"),
    TabBarSolidMRoundedAccent("TabBarSolid.M.Rounded.Accent"),
    TabBarSolidMShadowDefault("TabBarSolid.M.Shadow.Default"),
    TabBarSolidMShadowSecondary("TabBarSolid.M.Shadow.Secondary"),
    TabBarSolidMShadowAccent("TabBarSolid.M.Shadow.Accent"),
    TabBarSolidMShadowRoundedDefault("TabBarSolid.M.Shadow.Rounded.Default"),
    TabBarSolidMShadowRoundedSecondary("TabBarSolid.M.Shadow.Rounded.Secondary"),
    TabBarSolidMShadowRoundedAccent("TabBarSolid.M.Shadow.Rounded.Accent"),
    TabBarSolidMDividerDefault("TabBarSolid.M.Divider.Default"),
    TabBarSolidMDividerSecondary("TabBarSolid.M.Divider.Secondary"),
    TabBarSolidMDividerAccent("TabBarSolid.M.Divider.Accent"),
    TabBarSolidMDividerRoundedDefault("TabBarSolid.M.Divider.Rounded.Default"),
    TabBarSolidMDividerRoundedSecondary("TabBarSolid.M.Divider.Rounded.Secondary"),
    TabBarSolidMDividerRoundedAccent("TabBarSolid.M.Divider.Rounded.Accent"),
    TabBarSolidLDefault("TabBarSolid.L.Default"),
    TabBarSolidLSecondary("TabBarSolid.L.Secondary"),
    TabBarSolidLAccent("TabBarSolid.L.Accent"),
    TabBarSolidLRoundedDefault("TabBarSolid.L.Rounded.Default"),
    TabBarSolidLRoundedSecondary("TabBarSolid.L.Rounded.Secondary"),
    TabBarSolidLRoundedAccent("TabBarSolid.L.Rounded.Accent"),
    TabBarSolidLShadowDefault("TabBarSolid.L.Shadow.Default"),
    TabBarSolidLShadowSecondary("TabBarSolid.L.Shadow.Secondary"),
    TabBarSolidLShadowAccent("TabBarSolid.L.Shadow.Accent"),
    TabBarSolidLShadowRoundedDefault("TabBarSolid.L.Shadow.Rounded.Default"),
    TabBarSolidLShadowRoundedSecondary("TabBarSolid.L.Shadow.Rounded.Secondary"),
    TabBarSolidLShadowRoundedAccent("TabBarSolid.L.Shadow.Rounded.Accent"),
    TabBarSolidLDividerDefault("TabBarSolid.L.Divider.Default"),
    TabBarSolidLDividerSecondary("TabBarSolid.L.Divider.Secondary"),
    TabBarSolidLDividerAccent("TabBarSolid.L.Divider.Accent"),
    TabBarSolidLDividerRoundedDefault("TabBarSolid.L.Divider.Rounded.Default"),
    TabBarSolidLDividerRoundedSecondary("TabBarSolid.L.Divider.Rounded.Secondary"),
    TabBarSolidLDividerRoundedAccent("TabBarSolid.L.Divider.Rounded.Accent"),
    TabBarIslandClearMDefault("TabBarIslandClear.M.Default"),
    TabBarIslandClearMSecondary("TabBarIslandClear.M.Secondary"),
    TabBarIslandClearMAccent("TabBarIslandClear.M.Accent"),
    TabBarIslandClearMShadowDefault("TabBarIslandClear.M.Shadow.Default"),
    TabBarIslandClearMShadowSecondary("TabBarIslandClear.M.Shadow.Secondary"),
    TabBarIslandClearMShadowAccent("TabBarIslandClear.M.Shadow.Accent"),
    TabBarIslandClearLDefault("TabBarIslandClear.L.Default"),
    TabBarIslandClearLSecondary("TabBarIslandClear.L.Secondary"),
    TabBarIslandClearLAccent("TabBarIslandClear.L.Accent"),
    TabBarIslandClearLShadowDefault("TabBarIslandClear.L.Shadow.Default"),
    TabBarIslandClearLShadowSecondary("TabBarIslandClear.L.Shadow.Secondary"),
    TabBarIslandClearLShadowAccent("TabBarIslandClear.L.Shadow.Accent"),
    TabBarIslandSolidMDefault("TabBarIslandSolid.M.Default"),
    TabBarIslandSolidMSecondary("TabBarIslandSolid.M.Secondary"),
    TabBarIslandSolidMAccent("TabBarIslandSolid.M.Accent"),
    TabBarIslandSolidMShadowDefault("TabBarIslandSolid.M.Shadow.Default"),
    TabBarIslandSolidMShadowSecondary("TabBarIslandSolid.M.Shadow.Secondary"),
    TabBarIslandSolidMShadowAccent("TabBarIslandSolid.M.Shadow.Accent"),
    TabBarIslandSolidLDefault("TabBarIslandSolid.L.Default"),
    TabBarIslandSolidLSecondary("TabBarIslandSolid.L.Secondary"),
    TabBarIslandSolidLAccent("TabBarIslandSolid.L.Accent"),
    TabBarIslandSolidLShadowDefault("TabBarIslandSolid.L.Shadow.Default"),
    TabBarIslandSolidLShadowSecondary("TabBarIslandSolid.L.Shadow.Secondary"),
    TabBarIslandSolidLShadowAccent("TabBarIslandSolid.L.Shadow.Accent"),
    ;

    /**
     * Typed API для подбора стиля tab-bar-has-label-clear
     */
    public object HasLabelClear

    /**
     * Typed API для подбора стиля tab-bar-has-label-solid
     */
    public object HasLabelSolid

    /**
     * Typed API для подбора стиля tab-bar-island-has-label-clear
     */
    public object IslandHasLabelClear

    /**
     * Typed API для подбора стиля tab-bar-island-has-label-solid
     */
    public object IslandHasLabelSolid

    /**
     * Typed API для подбора стиля tab-bar-clear
     */
    public object Clear

    /**
     * Typed API для подбора стиля tab-bar-solid
     */
    public object Solid

    /**
     * Typed API для подбора стиля tab-bar-island-clear
     */
    public object IslandClear

    /**
     * Typed API для подбора стиля tab-bar-island-solid
     */
    public object IslandSolid
}

/**
 * Возможные значения свойства size для tab-bar-has-label-clear
 */
public enum class TabBarHasLabelClearSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-has-label-clear
 */
public enum class TabBarHasLabelClearView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возможные значения свойства size для tab-bar-has-label-solid
 */
public enum class TabBarHasLabelSolidSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-has-label-solid
 */
public enum class TabBarHasLabelSolidView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возможные значения свойства size для tab-bar-island-has-label-clear
 */
public enum class TabBarIslandHasLabelClearSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-island-has-label-clear
 */
public enum class TabBarIslandHasLabelClearView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возможные значения свойства size для tab-bar-island-has-label-solid
 */
public enum class TabBarIslandHasLabelSolidSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-island-has-label-solid
 */
public enum class TabBarIslandHasLabelSolidView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возможные значения свойства size для tab-bar-clear
 */
public enum class TabBarClearSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-clear
 */
public enum class TabBarClearView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возможные значения свойства size для tab-bar-solid
 */
public enum class TabBarSolidSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-solid
 */
public enum class TabBarSolidView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возможные значения свойства size для tab-bar-island-clear
 */
public enum class TabBarIslandClearSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-island-clear
 */
public enum class TabBarIslandClearView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возможные значения свойства size для tab-bar-island-solid
 */
public enum class TabBarIslandSolidSize {
    L,
    M,
}

/**
 * Возможные значения свойства view для tab-bar-island-solid
 */
public enum class TabBarIslandSolidView {
    Default,
    Secondary,
    Accent,
}

/**
 * Возвращает [TabBarStyle] для [TabBarStyles]
 */
@Composable
public fun TabBarStyles.style(modify: @Composable TabBarStyleBuilder.() -> Unit = {}): TabBarStyle {
    val builder = when (this) {
        TabBarStyles.TabBarHasLabelClearMDefault -> TabBarHasLabelClear.M.Default
        TabBarStyles.TabBarHasLabelClearMSecondary -> TabBarHasLabelClear.M.Secondary
        TabBarStyles.TabBarHasLabelClearMAccent -> TabBarHasLabelClear.M.Accent
        TabBarStyles.TabBarHasLabelClearMRoundedDefault -> TabBarHasLabelClear.M.Rounded.Default
        TabBarStyles.TabBarHasLabelClearMRoundedSecondary -> TabBarHasLabelClear.M.Rounded.Secondary
        TabBarStyles.TabBarHasLabelClearMRoundedAccent -> TabBarHasLabelClear.M.Rounded.Accent
        TabBarStyles.TabBarHasLabelClearMShadowDefault -> TabBarHasLabelClear.M.Shadow.Default
        TabBarStyles.TabBarHasLabelClearMShadowSecondary -> TabBarHasLabelClear.M.Shadow.Secondary
        TabBarStyles.TabBarHasLabelClearMShadowAccent -> TabBarHasLabelClear.M.Shadow.Accent
        TabBarStyles.TabBarHasLabelClearMShadowRoundedDefault ->
            TabBarHasLabelClear.M.Shadow.Rounded.Default
        TabBarStyles.TabBarHasLabelClearMShadowRoundedSecondary ->
            TabBarHasLabelClear.M.Shadow.Rounded.Secondary
        TabBarStyles.TabBarHasLabelClearMShadowRoundedAccent ->
            TabBarHasLabelClear.M.Shadow.Rounded.Accent
        TabBarStyles.TabBarHasLabelClearMDividerDefault -> TabBarHasLabelClear.M.Divider.Default
        TabBarStyles.TabBarHasLabelClearMDividerSecondary -> TabBarHasLabelClear.M.Divider.Secondary
        TabBarStyles.TabBarHasLabelClearMDividerAccent -> TabBarHasLabelClear.M.Divider.Accent
        TabBarStyles.TabBarHasLabelClearMDividerRoundedDefault ->
            TabBarHasLabelClear.M.Divider.Rounded.Default
        TabBarStyles.TabBarHasLabelClearMDividerRoundedSecondary ->
            TabBarHasLabelClear.M.Divider.Rounded.Secondary
        TabBarStyles.TabBarHasLabelClearMDividerRoundedAccent ->
            TabBarHasLabelClear.M.Divider.Rounded.Accent
        TabBarStyles.TabBarHasLabelClearLDefault -> TabBarHasLabelClear.L.Default
        TabBarStyles.TabBarHasLabelClearLSecondary -> TabBarHasLabelClear.L.Secondary
        TabBarStyles.TabBarHasLabelClearLAccent -> TabBarHasLabelClear.L.Accent
        TabBarStyles.TabBarHasLabelClearLRoundedDefault -> TabBarHasLabelClear.L.Rounded.Default
        TabBarStyles.TabBarHasLabelClearLRoundedSecondary -> TabBarHasLabelClear.L.Rounded.Secondary
        TabBarStyles.TabBarHasLabelClearLRoundedAccent -> TabBarHasLabelClear.L.Rounded.Accent
        TabBarStyles.TabBarHasLabelClearLShadowDefault -> TabBarHasLabelClear.L.Shadow.Default
        TabBarStyles.TabBarHasLabelClearLShadowSecondary -> TabBarHasLabelClear.L.Shadow.Secondary
        TabBarStyles.TabBarHasLabelClearLShadowAccent -> TabBarHasLabelClear.L.Shadow.Accent
        TabBarStyles.TabBarHasLabelClearLShadowRoundedDefault ->
            TabBarHasLabelClear.L.Shadow.Rounded.Default
        TabBarStyles.TabBarHasLabelClearLShadowRoundedSecondary ->
            TabBarHasLabelClear.L.Shadow.Rounded.Secondary
        TabBarStyles.TabBarHasLabelClearLShadowRoundedAccent ->
            TabBarHasLabelClear.L.Shadow.Rounded.Accent
        TabBarStyles.TabBarHasLabelClearLDividerDefault -> TabBarHasLabelClear.L.Divider.Default
        TabBarStyles.TabBarHasLabelClearLDividerSecondary -> TabBarHasLabelClear.L.Divider.Secondary
        TabBarStyles.TabBarHasLabelClearLDividerAccent -> TabBarHasLabelClear.L.Divider.Accent
        TabBarStyles.TabBarHasLabelClearLDividerRoundedDefault ->
            TabBarHasLabelClear.L.Divider.Rounded.Default
        TabBarStyles.TabBarHasLabelClearLDividerRoundedSecondary ->
            TabBarHasLabelClear.L.Divider.Rounded.Secondary
        TabBarStyles.TabBarHasLabelClearLDividerRoundedAccent ->
            TabBarHasLabelClear.L.Divider.Rounded.Accent
        TabBarStyles.TabBarHasLabelSolidMDefault -> TabBarHasLabelSolid.M.Default
        TabBarStyles.TabBarHasLabelSolidMSecondary -> TabBarHasLabelSolid.M.Secondary
        TabBarStyles.TabBarHasLabelSolidMAccent -> TabBarHasLabelSolid.M.Accent
        TabBarStyles.TabBarHasLabelSolidMRoundedDefault -> TabBarHasLabelSolid.M.Rounded.Default
        TabBarStyles.TabBarHasLabelSolidMRoundedSecondary -> TabBarHasLabelSolid.M.Rounded.Secondary
        TabBarStyles.TabBarHasLabelSolidMRoundedAccent -> TabBarHasLabelSolid.M.Rounded.Accent
        TabBarStyles.TabBarHasLabelSolidMShadowDefault -> TabBarHasLabelSolid.M.Shadow.Default
        TabBarStyles.TabBarHasLabelSolidMShadowSecondary -> TabBarHasLabelSolid.M.Shadow.Secondary
        TabBarStyles.TabBarHasLabelSolidMShadowAccent -> TabBarHasLabelSolid.M.Shadow.Accent
        TabBarStyles.TabBarHasLabelSolidMShadowRoundedDefault ->
            TabBarHasLabelSolid.M.Shadow.Rounded.Default
        TabBarStyles.TabBarHasLabelSolidMShadowRoundedSecondary ->
            TabBarHasLabelSolid.M.Shadow.Rounded.Secondary
        TabBarStyles.TabBarHasLabelSolidMShadowRoundedAccent ->
            TabBarHasLabelSolid.M.Shadow.Rounded.Accent
        TabBarStyles.TabBarHasLabelSolidMDividerDefault -> TabBarHasLabelSolid.M.Divider.Default
        TabBarStyles.TabBarHasLabelSolidMDividerSecondary -> TabBarHasLabelSolid.M.Divider.Secondary
        TabBarStyles.TabBarHasLabelSolidMDividerAccent -> TabBarHasLabelSolid.M.Divider.Accent
        TabBarStyles.TabBarHasLabelSolidMDividerRoundedDefault ->
            TabBarHasLabelSolid.M.Divider.Rounded.Default
        TabBarStyles.TabBarHasLabelSolidMDividerRoundedSecondary ->
            TabBarHasLabelSolid.M.Divider.Rounded.Secondary
        TabBarStyles.TabBarHasLabelSolidMDividerRoundedAccent ->
            TabBarHasLabelSolid.M.Divider.Rounded.Accent
        TabBarStyles.TabBarHasLabelSolidLDefault -> TabBarHasLabelSolid.L.Default
        TabBarStyles.TabBarHasLabelSolidLSecondary -> TabBarHasLabelSolid.L.Secondary
        TabBarStyles.TabBarHasLabelSolidLAccent -> TabBarHasLabelSolid.L.Accent
        TabBarStyles.TabBarHasLabelSolidLRoundedDefault -> TabBarHasLabelSolid.L.Rounded.Default
        TabBarStyles.TabBarHasLabelSolidLRoundedSecondary -> TabBarHasLabelSolid.L.Rounded.Secondary
        TabBarStyles.TabBarHasLabelSolidLRoundedAccent -> TabBarHasLabelSolid.L.Rounded.Accent
        TabBarStyles.TabBarHasLabelSolidLShadowDefault -> TabBarHasLabelSolid.L.Shadow.Default
        TabBarStyles.TabBarHasLabelSolidLShadowSecondary -> TabBarHasLabelSolid.L.Shadow.Secondary
        TabBarStyles.TabBarHasLabelSolidLShadowAccent -> TabBarHasLabelSolid.L.Shadow.Accent
        TabBarStyles.TabBarHasLabelSolidLShadowRoundedDefault ->
            TabBarHasLabelSolid.L.Shadow.Rounded.Default
        TabBarStyles.TabBarHasLabelSolidLShadowRoundedSecondary ->
            TabBarHasLabelSolid.L.Shadow.Rounded.Secondary
        TabBarStyles.TabBarHasLabelSolidLShadowRoundedAccent ->
            TabBarHasLabelSolid.L.Shadow.Rounded.Accent
        TabBarStyles.TabBarHasLabelSolidLDividerDefault -> TabBarHasLabelSolid.L.Divider.Default
        TabBarStyles.TabBarHasLabelSolidLDividerSecondary -> TabBarHasLabelSolid.L.Divider.Secondary
        TabBarStyles.TabBarHasLabelSolidLDividerAccent -> TabBarHasLabelSolid.L.Divider.Accent
        TabBarStyles.TabBarHasLabelSolidLDividerRoundedDefault ->
            TabBarHasLabelSolid.L.Divider.Rounded.Default
        TabBarStyles.TabBarHasLabelSolidLDividerRoundedSecondary ->
            TabBarHasLabelSolid.L.Divider.Rounded.Secondary
        TabBarStyles.TabBarHasLabelSolidLDividerRoundedAccent ->
            TabBarHasLabelSolid.L.Divider.Rounded.Accent
        TabBarStyles.TabBarIslandHasLabelClearMDefault -> TabBarIslandHasLabelClear.M.Default
        TabBarStyles.TabBarIslandHasLabelClearMSecondary -> TabBarIslandHasLabelClear.M.Secondary
        TabBarStyles.TabBarIslandHasLabelClearMAccent -> TabBarIslandHasLabelClear.M.Accent
        TabBarStyles.TabBarIslandHasLabelClearMShadowDefault ->
            TabBarIslandHasLabelClear.M.Shadow.Default
        TabBarStyles.TabBarIslandHasLabelClearMShadowSecondary ->
            TabBarIslandHasLabelClear.M.Shadow.Secondary
        TabBarStyles.TabBarIslandHasLabelClearMShadowAccent ->
            TabBarIslandHasLabelClear.M.Shadow.Accent
        TabBarStyles.TabBarIslandHasLabelClearLDefault -> TabBarIslandHasLabelClear.L.Default
        TabBarStyles.TabBarIslandHasLabelClearLSecondary -> TabBarIslandHasLabelClear.L.Secondary
        TabBarStyles.TabBarIslandHasLabelClearLAccent -> TabBarIslandHasLabelClear.L.Accent
        TabBarStyles.TabBarIslandHasLabelClearLShadowDefault ->
            TabBarIslandHasLabelClear.L.Shadow.Default
        TabBarStyles.TabBarIslandHasLabelClearLShadowSecondary ->
            TabBarIslandHasLabelClear.L.Shadow.Secondary
        TabBarStyles.TabBarIslandHasLabelClearLShadowAccent ->
            TabBarIslandHasLabelClear.L.Shadow.Accent
        TabBarStyles.TabBarIslandHasLabelSolidMDefault -> TabBarIslandHasLabelSolid.M.Default
        TabBarStyles.TabBarIslandHasLabelSolidMSecondary -> TabBarIslandHasLabelSolid.M.Secondary
        TabBarStyles.TabBarIslandHasLabelSolidMAccent -> TabBarIslandHasLabelSolid.M.Accent
        TabBarStyles.TabBarIslandHasLabelSolidMShadowDefault ->
            TabBarIslandHasLabelSolid.M.Shadow.Default
        TabBarStyles.TabBarIslandHasLabelSolidMShadowSecondary ->
            TabBarIslandHasLabelSolid.M.Shadow.Secondary
        TabBarStyles.TabBarIslandHasLabelSolidMShadowAccent ->
            TabBarIslandHasLabelSolid.M.Shadow.Accent
        TabBarStyles.TabBarIslandHasLabelSolidLDefault -> TabBarIslandHasLabelSolid.L.Default
        TabBarStyles.TabBarIslandHasLabelSolidLSecondary -> TabBarIslandHasLabelSolid.L.Secondary
        TabBarStyles.TabBarIslandHasLabelSolidLAccent -> TabBarIslandHasLabelSolid.L.Accent
        TabBarStyles.TabBarIslandHasLabelSolidLShadowDefault ->
            TabBarIslandHasLabelSolid.L.Shadow.Default
        TabBarStyles.TabBarIslandHasLabelSolidLShadowSecondary ->
            TabBarIslandHasLabelSolid.L.Shadow.Secondary
        TabBarStyles.TabBarIslandHasLabelSolidLShadowAccent ->
            TabBarIslandHasLabelSolid.L.Shadow.Accent
        TabBarStyles.TabBarClearMDefault -> TabBarClear.M.Default
        TabBarStyles.TabBarClearMSecondary -> TabBarClear.M.Secondary
        TabBarStyles.TabBarClearMAccent -> TabBarClear.M.Accent
        TabBarStyles.TabBarClearMRoundedDefault -> TabBarClear.M.Rounded.Default
        TabBarStyles.TabBarClearMRoundedSecondary -> TabBarClear.M.Rounded.Secondary
        TabBarStyles.TabBarClearMRoundedAccent -> TabBarClear.M.Rounded.Accent
        TabBarStyles.TabBarClearMShadowDefault -> TabBarClear.M.Shadow.Default
        TabBarStyles.TabBarClearMShadowSecondary -> TabBarClear.M.Shadow.Secondary
        TabBarStyles.TabBarClearMShadowAccent -> TabBarClear.M.Shadow.Accent
        TabBarStyles.TabBarClearMShadowRoundedDefault -> TabBarClear.M.Shadow.Rounded.Default
        TabBarStyles.TabBarClearMShadowRoundedSecondary -> TabBarClear.M.Shadow.Rounded.Secondary
        TabBarStyles.TabBarClearMShadowRoundedAccent -> TabBarClear.M.Shadow.Rounded.Accent
        TabBarStyles.TabBarClearMDividerDefault -> TabBarClear.M.Divider.Default
        TabBarStyles.TabBarClearMDividerSecondary -> TabBarClear.M.Divider.Secondary
        TabBarStyles.TabBarClearMDividerAccent -> TabBarClear.M.Divider.Accent
        TabBarStyles.TabBarClearMDividerRoundedDefault -> TabBarClear.M.Divider.Rounded.Default
        TabBarStyles.TabBarClearMDividerRoundedSecondary -> TabBarClear.M.Divider.Rounded.Secondary
        TabBarStyles.TabBarClearMDividerRoundedAccent -> TabBarClear.M.Divider.Rounded.Accent
        TabBarStyles.TabBarClearLDefault -> TabBarClear.L.Default
        TabBarStyles.TabBarClearLSecondary -> TabBarClear.L.Secondary
        TabBarStyles.TabBarClearLAccent -> TabBarClear.L.Accent
        TabBarStyles.TabBarClearLRoundedDefault -> TabBarClear.L.Rounded.Default
        TabBarStyles.TabBarClearLRoundedSecondary -> TabBarClear.L.Rounded.Secondary
        TabBarStyles.TabBarClearLRoundedAccent -> TabBarClear.L.Rounded.Accent
        TabBarStyles.TabBarClearLShadowDefault -> TabBarClear.L.Shadow.Default
        TabBarStyles.TabBarClearLShadowSecondary -> TabBarClear.L.Shadow.Secondary
        TabBarStyles.TabBarClearLShadowAccent -> TabBarClear.L.Shadow.Accent
        TabBarStyles.TabBarClearLShadowRoundedDefault -> TabBarClear.L.Shadow.Rounded.Default
        TabBarStyles.TabBarClearLShadowRoundedSecondary -> TabBarClear.L.Shadow.Rounded.Secondary
        TabBarStyles.TabBarClearLShadowRoundedAccent -> TabBarClear.L.Shadow.Rounded.Accent
        TabBarStyles.TabBarClearLDividerDefault -> TabBarClear.L.Divider.Default
        TabBarStyles.TabBarClearLDividerSecondary -> TabBarClear.L.Divider.Secondary
        TabBarStyles.TabBarClearLDividerAccent -> TabBarClear.L.Divider.Accent
        TabBarStyles.TabBarClearLDividerRoundedDefault -> TabBarClear.L.Divider.Rounded.Default
        TabBarStyles.TabBarClearLDividerRoundedSecondary -> TabBarClear.L.Divider.Rounded.Secondary
        TabBarStyles.TabBarClearLDividerRoundedAccent -> TabBarClear.L.Divider.Rounded.Accent
        TabBarStyles.TabBarSolidMDefault -> TabBarSolid.M.Default
        TabBarStyles.TabBarSolidMSecondary -> TabBarSolid.M.Secondary
        TabBarStyles.TabBarSolidMAccent -> TabBarSolid.M.Accent
        TabBarStyles.TabBarSolidMRoundedDefault -> TabBarSolid.M.Rounded.Default
        TabBarStyles.TabBarSolidMRoundedSecondary -> TabBarSolid.M.Rounded.Secondary
        TabBarStyles.TabBarSolidMRoundedAccent -> TabBarSolid.M.Rounded.Accent
        TabBarStyles.TabBarSolidMShadowDefault -> TabBarSolid.M.Shadow.Default
        TabBarStyles.TabBarSolidMShadowSecondary -> TabBarSolid.M.Shadow.Secondary
        TabBarStyles.TabBarSolidMShadowAccent -> TabBarSolid.M.Shadow.Accent
        TabBarStyles.TabBarSolidMShadowRoundedDefault -> TabBarSolid.M.Shadow.Rounded.Default
        TabBarStyles.TabBarSolidMShadowRoundedSecondary -> TabBarSolid.M.Shadow.Rounded.Secondary
        TabBarStyles.TabBarSolidMShadowRoundedAccent -> TabBarSolid.M.Shadow.Rounded.Accent
        TabBarStyles.TabBarSolidMDividerDefault -> TabBarSolid.M.Divider.Default
        TabBarStyles.TabBarSolidMDividerSecondary -> TabBarSolid.M.Divider.Secondary
        TabBarStyles.TabBarSolidMDividerAccent -> TabBarSolid.M.Divider.Accent
        TabBarStyles.TabBarSolidMDividerRoundedDefault -> TabBarSolid.M.Divider.Rounded.Default
        TabBarStyles.TabBarSolidMDividerRoundedSecondary -> TabBarSolid.M.Divider.Rounded.Secondary
        TabBarStyles.TabBarSolidMDividerRoundedAccent -> TabBarSolid.M.Divider.Rounded.Accent
        TabBarStyles.TabBarSolidLDefault -> TabBarSolid.L.Default
        TabBarStyles.TabBarSolidLSecondary -> TabBarSolid.L.Secondary
        TabBarStyles.TabBarSolidLAccent -> TabBarSolid.L.Accent
        TabBarStyles.TabBarSolidLRoundedDefault -> TabBarSolid.L.Rounded.Default
        TabBarStyles.TabBarSolidLRoundedSecondary -> TabBarSolid.L.Rounded.Secondary
        TabBarStyles.TabBarSolidLRoundedAccent -> TabBarSolid.L.Rounded.Accent
        TabBarStyles.TabBarSolidLShadowDefault -> TabBarSolid.L.Shadow.Default
        TabBarStyles.TabBarSolidLShadowSecondary -> TabBarSolid.L.Shadow.Secondary
        TabBarStyles.TabBarSolidLShadowAccent -> TabBarSolid.L.Shadow.Accent
        TabBarStyles.TabBarSolidLShadowRoundedDefault -> TabBarSolid.L.Shadow.Rounded.Default
        TabBarStyles.TabBarSolidLShadowRoundedSecondary -> TabBarSolid.L.Shadow.Rounded.Secondary
        TabBarStyles.TabBarSolidLShadowRoundedAccent -> TabBarSolid.L.Shadow.Rounded.Accent
        TabBarStyles.TabBarSolidLDividerDefault -> TabBarSolid.L.Divider.Default
        TabBarStyles.TabBarSolidLDividerSecondary -> TabBarSolid.L.Divider.Secondary
        TabBarStyles.TabBarSolidLDividerAccent -> TabBarSolid.L.Divider.Accent
        TabBarStyles.TabBarSolidLDividerRoundedDefault -> TabBarSolid.L.Divider.Rounded.Default
        TabBarStyles.TabBarSolidLDividerRoundedSecondary -> TabBarSolid.L.Divider.Rounded.Secondary
        TabBarStyles.TabBarSolidLDividerRoundedAccent -> TabBarSolid.L.Divider.Rounded.Accent
        TabBarStyles.TabBarIslandClearMDefault -> TabBarIslandClear.M.Default
        TabBarStyles.TabBarIslandClearMSecondary -> TabBarIslandClear.M.Secondary
        TabBarStyles.TabBarIslandClearMAccent -> TabBarIslandClear.M.Accent
        TabBarStyles.TabBarIslandClearMShadowDefault -> TabBarIslandClear.M.Shadow.Default
        TabBarStyles.TabBarIslandClearMShadowSecondary -> TabBarIslandClear.M.Shadow.Secondary
        TabBarStyles.TabBarIslandClearMShadowAccent -> TabBarIslandClear.M.Shadow.Accent
        TabBarStyles.TabBarIslandClearLDefault -> TabBarIslandClear.L.Default
        TabBarStyles.TabBarIslandClearLSecondary -> TabBarIslandClear.L.Secondary
        TabBarStyles.TabBarIslandClearLAccent -> TabBarIslandClear.L.Accent
        TabBarStyles.TabBarIslandClearLShadowDefault -> TabBarIslandClear.L.Shadow.Default
        TabBarStyles.TabBarIslandClearLShadowSecondary -> TabBarIslandClear.L.Shadow.Secondary
        TabBarStyles.TabBarIslandClearLShadowAccent -> TabBarIslandClear.L.Shadow.Accent
        TabBarStyles.TabBarIslandSolidMDefault -> TabBarIslandSolid.M.Default
        TabBarStyles.TabBarIslandSolidMSecondary -> TabBarIslandSolid.M.Secondary
        TabBarStyles.TabBarIslandSolidMAccent -> TabBarIslandSolid.M.Accent
        TabBarStyles.TabBarIslandSolidMShadowDefault -> TabBarIslandSolid.M.Shadow.Default
        TabBarStyles.TabBarIslandSolidMShadowSecondary -> TabBarIslandSolid.M.Shadow.Secondary
        TabBarStyles.TabBarIslandSolidMShadowAccent -> TabBarIslandSolid.M.Shadow.Accent
        TabBarStyles.TabBarIslandSolidLDefault -> TabBarIslandSolid.L.Default
        TabBarStyles.TabBarIslandSolidLSecondary -> TabBarIslandSolid.L.Secondary
        TabBarStyles.TabBarIslandSolidLAccent -> TabBarIslandSolid.L.Accent
        TabBarStyles.TabBarIslandSolidLShadowDefault -> TabBarIslandSolid.L.Shadow.Default
        TabBarStyles.TabBarIslandSolidLShadowSecondary -> TabBarIslandSolid.L.Shadow.Secondary
        TabBarStyles.TabBarIslandSolidLShadowAccent -> TabBarIslandSolid.L.Shadow.Accent
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-has-label-clear
 */
public fun TabBarStyles.HasLabelClear.resolve(
    size: TabBarHasLabelClearSize = TabBarHasLabelClearSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarHasLabelClearView,
): TabBarStyles = when {
    size == TabBarHasLabelClearSize.M && rounded == true && hasShadow == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearMShadowRoundedDefault
    size == TabBarHasLabelClearSize.M && rounded == true && hasShadow == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearMShadowRoundedSecondary
    size == TabBarHasLabelClearSize.M && rounded == true && hasShadow == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearMShadowRoundedAccent
    size == TabBarHasLabelClearSize.M && rounded == true && divider == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearMDividerRoundedDefault
    size == TabBarHasLabelClearSize.M && rounded == true && divider == true && view ==
        TabBarHasLabelClearView.Secondary ->
        TabBarStyles.TabBarHasLabelClearMDividerRoundedSecondary
    size == TabBarHasLabelClearSize.M && rounded == true && divider == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearMDividerRoundedAccent
    size == TabBarHasLabelClearSize.L && rounded == true && hasShadow == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearLShadowRoundedDefault
    size == TabBarHasLabelClearSize.L && rounded == true && hasShadow == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearLShadowRoundedSecondary
    size == TabBarHasLabelClearSize.L && rounded == true && hasShadow == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearLShadowRoundedAccent
    size == TabBarHasLabelClearSize.L && rounded == true && divider == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearLDividerRoundedDefault
    size == TabBarHasLabelClearSize.L && rounded == true && divider == true && view ==
        TabBarHasLabelClearView.Secondary ->
        TabBarStyles.TabBarHasLabelClearLDividerRoundedSecondary
    size == TabBarHasLabelClearSize.L && rounded == true && divider == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearLDividerRoundedAccent
    size == TabBarHasLabelClearSize.M && rounded == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearMRoundedDefault
    size == TabBarHasLabelClearSize.M && rounded == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearMRoundedSecondary
    size == TabBarHasLabelClearSize.M && rounded == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearMRoundedAccent
    size == TabBarHasLabelClearSize.M && hasShadow == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearMShadowDefault
    size == TabBarHasLabelClearSize.M && hasShadow == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearMShadowSecondary
    size == TabBarHasLabelClearSize.M && hasShadow == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearMShadowAccent
    size == TabBarHasLabelClearSize.M && divider == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearMDividerDefault
    size == TabBarHasLabelClearSize.M && divider == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearMDividerSecondary
    size == TabBarHasLabelClearSize.M && divider == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearMDividerAccent
    size == TabBarHasLabelClearSize.L && rounded == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearLRoundedDefault
    size == TabBarHasLabelClearSize.L && rounded == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearLRoundedSecondary
    size == TabBarHasLabelClearSize.L && rounded == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearLRoundedAccent
    size == TabBarHasLabelClearSize.L && hasShadow == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearLShadowDefault
    size == TabBarHasLabelClearSize.L && hasShadow == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearLShadowSecondary
    size == TabBarHasLabelClearSize.L && hasShadow == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearLShadowAccent
    size == TabBarHasLabelClearSize.L && divider == true && view ==
        TabBarHasLabelClearView.Default -> TabBarStyles.TabBarHasLabelClearLDividerDefault
    size == TabBarHasLabelClearSize.L && divider == true && view ==
        TabBarHasLabelClearView.Secondary -> TabBarStyles.TabBarHasLabelClearLDividerSecondary
    size == TabBarHasLabelClearSize.L && divider == true && view ==
        TabBarHasLabelClearView.Accent -> TabBarStyles.TabBarHasLabelClearLDividerAccent
    size == TabBarHasLabelClearSize.M && view == TabBarHasLabelClearView.Default ->
        TabBarStyles.TabBarHasLabelClearMDefault
    size == TabBarHasLabelClearSize.M && view == TabBarHasLabelClearView.Secondary ->
        TabBarStyles.TabBarHasLabelClearMSecondary
    size == TabBarHasLabelClearSize.M && view == TabBarHasLabelClearView.Accent ->
        TabBarStyles.TabBarHasLabelClearMAccent
    size == TabBarHasLabelClearSize.L && view == TabBarHasLabelClearView.Default ->
        TabBarStyles.TabBarHasLabelClearLDefault
    size == TabBarHasLabelClearSize.L && view == TabBarHasLabelClearView.Secondary ->
        TabBarStyles.TabBarHasLabelClearLSecondary
    size == TabBarHasLabelClearSize.L && view == TabBarHasLabelClearView.Accent ->
        TabBarStyles.TabBarHasLabelClearLAccent
    else -> error("Unsupported tab-bar-has-label-clear style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-has-label-clear
 */
@Composable
public fun TabBarStyles.HasLabelClear.style(
    size: TabBarHasLabelClearSize = TabBarHasLabelClearSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarHasLabelClearView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, rounded, hasShadow, divider, view).style(modify)

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-has-label-solid
 */
public fun TabBarStyles.HasLabelSolid.resolve(
    size: TabBarHasLabelSolidSize = TabBarHasLabelSolidSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarHasLabelSolidView,
): TabBarStyles = when {
    size == TabBarHasLabelSolidSize.M && rounded == true && hasShadow == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidMShadowRoundedDefault
    size == TabBarHasLabelSolidSize.M && rounded == true && hasShadow == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidMShadowRoundedSecondary
    size == TabBarHasLabelSolidSize.M && rounded == true && hasShadow == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidMShadowRoundedAccent
    size == TabBarHasLabelSolidSize.M && rounded == true && divider == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidMDividerRoundedDefault
    size == TabBarHasLabelSolidSize.M && rounded == true && divider == true && view ==
        TabBarHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarHasLabelSolidMDividerRoundedSecondary
    size == TabBarHasLabelSolidSize.M && rounded == true && divider == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidMDividerRoundedAccent
    size == TabBarHasLabelSolidSize.L && rounded == true && hasShadow == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidLShadowRoundedDefault
    size == TabBarHasLabelSolidSize.L && rounded == true && hasShadow == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidLShadowRoundedSecondary
    size == TabBarHasLabelSolidSize.L && rounded == true && hasShadow == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidLShadowRoundedAccent
    size == TabBarHasLabelSolidSize.L && rounded == true && divider == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidLDividerRoundedDefault
    size == TabBarHasLabelSolidSize.L && rounded == true && divider == true && view ==
        TabBarHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarHasLabelSolidLDividerRoundedSecondary
    size == TabBarHasLabelSolidSize.L && rounded == true && divider == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidLDividerRoundedAccent
    size == TabBarHasLabelSolidSize.M && rounded == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidMRoundedDefault
    size == TabBarHasLabelSolidSize.M && rounded == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidMRoundedSecondary
    size == TabBarHasLabelSolidSize.M && rounded == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidMRoundedAccent
    size == TabBarHasLabelSolidSize.M && hasShadow == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidMShadowDefault
    size == TabBarHasLabelSolidSize.M && hasShadow == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidMShadowSecondary
    size == TabBarHasLabelSolidSize.M && hasShadow == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidMShadowAccent
    size == TabBarHasLabelSolidSize.M && divider == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidMDividerDefault
    size == TabBarHasLabelSolidSize.M && divider == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidMDividerSecondary
    size == TabBarHasLabelSolidSize.M && divider == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidMDividerAccent
    size == TabBarHasLabelSolidSize.L && rounded == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidLRoundedDefault
    size == TabBarHasLabelSolidSize.L && rounded == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidLRoundedSecondary
    size == TabBarHasLabelSolidSize.L && rounded == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidLRoundedAccent
    size == TabBarHasLabelSolidSize.L && hasShadow == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidLShadowDefault
    size == TabBarHasLabelSolidSize.L && hasShadow == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidLShadowSecondary
    size == TabBarHasLabelSolidSize.L && hasShadow == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidLShadowAccent
    size == TabBarHasLabelSolidSize.L && divider == true && view ==
        TabBarHasLabelSolidView.Default -> TabBarStyles.TabBarHasLabelSolidLDividerDefault
    size == TabBarHasLabelSolidSize.L && divider == true && view ==
        TabBarHasLabelSolidView.Secondary -> TabBarStyles.TabBarHasLabelSolidLDividerSecondary
    size == TabBarHasLabelSolidSize.L && divider == true && view ==
        TabBarHasLabelSolidView.Accent -> TabBarStyles.TabBarHasLabelSolidLDividerAccent
    size == TabBarHasLabelSolidSize.M && view == TabBarHasLabelSolidView.Default ->
        TabBarStyles.TabBarHasLabelSolidMDefault
    size == TabBarHasLabelSolidSize.M && view == TabBarHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarHasLabelSolidMSecondary
    size == TabBarHasLabelSolidSize.M && view == TabBarHasLabelSolidView.Accent ->
        TabBarStyles.TabBarHasLabelSolidMAccent
    size == TabBarHasLabelSolidSize.L && view == TabBarHasLabelSolidView.Default ->
        TabBarStyles.TabBarHasLabelSolidLDefault
    size == TabBarHasLabelSolidSize.L && view == TabBarHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarHasLabelSolidLSecondary
    size == TabBarHasLabelSolidSize.L && view == TabBarHasLabelSolidView.Accent ->
        TabBarStyles.TabBarHasLabelSolidLAccent
    else -> error("Unsupported tab-bar-has-label-solid style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-has-label-solid
 */
@Composable
public fun TabBarStyles.HasLabelSolid.style(
    size: TabBarHasLabelSolidSize = TabBarHasLabelSolidSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarHasLabelSolidView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, rounded, hasShadow, divider, view).style(modify)

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-island-has-label-clear
 */
public fun TabBarStyles.IslandHasLabelClear.resolve(
    size: TabBarIslandHasLabelClearSize = TabBarIslandHasLabelClearSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandHasLabelClearView,
): TabBarStyles = when {
    size == TabBarIslandHasLabelClearSize.M && hasShadow == true && view ==
        TabBarIslandHasLabelClearView.Default ->
        TabBarStyles.TabBarIslandHasLabelClearMShadowDefault
    size == TabBarIslandHasLabelClearSize.M && hasShadow == true && view ==
        TabBarIslandHasLabelClearView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelClearMShadowSecondary
    size == TabBarIslandHasLabelClearSize.M && hasShadow == true && view ==
        TabBarIslandHasLabelClearView.Accent -> TabBarStyles.TabBarIslandHasLabelClearMShadowAccent
    size == TabBarIslandHasLabelClearSize.L && hasShadow == true && view ==
        TabBarIslandHasLabelClearView.Default ->
        TabBarStyles.TabBarIslandHasLabelClearLShadowDefault
    size == TabBarIslandHasLabelClearSize.L && hasShadow == true && view ==
        TabBarIslandHasLabelClearView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelClearLShadowSecondary
    size == TabBarIslandHasLabelClearSize.L && hasShadow == true && view ==
        TabBarIslandHasLabelClearView.Accent -> TabBarStyles.TabBarIslandHasLabelClearLShadowAccent
    size == TabBarIslandHasLabelClearSize.M && view == TabBarIslandHasLabelClearView.Default ->
        TabBarStyles.TabBarIslandHasLabelClearMDefault
    size == TabBarIslandHasLabelClearSize.M && view == TabBarIslandHasLabelClearView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelClearMSecondary
    size == TabBarIslandHasLabelClearSize.M && view == TabBarIslandHasLabelClearView.Accent ->
        TabBarStyles.TabBarIslandHasLabelClearMAccent
    size == TabBarIslandHasLabelClearSize.L && view == TabBarIslandHasLabelClearView.Default ->
        TabBarStyles.TabBarIslandHasLabelClearLDefault
    size == TabBarIslandHasLabelClearSize.L && view == TabBarIslandHasLabelClearView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelClearLSecondary
    size == TabBarIslandHasLabelClearSize.L && view == TabBarIslandHasLabelClearView.Accent ->
        TabBarStyles.TabBarIslandHasLabelClearLAccent
    else -> error("Unsupported tab-bar-island-has-label-clear style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-island-has-label-clear
 */
@Composable
public fun TabBarStyles.IslandHasLabelClear.style(
    size: TabBarIslandHasLabelClearSize = TabBarIslandHasLabelClearSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandHasLabelClearView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, hasShadow, view).style(modify)

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-island-has-label-solid
 */
public fun TabBarStyles.IslandHasLabelSolid.resolve(
    size: TabBarIslandHasLabelSolidSize = TabBarIslandHasLabelSolidSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandHasLabelSolidView,
): TabBarStyles = when {
    size == TabBarIslandHasLabelSolidSize.M && hasShadow == true && view ==
        TabBarIslandHasLabelSolidView.Default ->
        TabBarStyles.TabBarIslandHasLabelSolidMShadowDefault
    size == TabBarIslandHasLabelSolidSize.M && hasShadow == true && view ==
        TabBarIslandHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelSolidMShadowSecondary
    size == TabBarIslandHasLabelSolidSize.M && hasShadow == true && view ==
        TabBarIslandHasLabelSolidView.Accent -> TabBarStyles.TabBarIslandHasLabelSolidMShadowAccent
    size == TabBarIslandHasLabelSolidSize.L && hasShadow == true && view ==
        TabBarIslandHasLabelSolidView.Default ->
        TabBarStyles.TabBarIslandHasLabelSolidLShadowDefault
    size == TabBarIslandHasLabelSolidSize.L && hasShadow == true && view ==
        TabBarIslandHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelSolidLShadowSecondary
    size == TabBarIslandHasLabelSolidSize.L && hasShadow == true && view ==
        TabBarIslandHasLabelSolidView.Accent -> TabBarStyles.TabBarIslandHasLabelSolidLShadowAccent
    size == TabBarIslandHasLabelSolidSize.M && view == TabBarIslandHasLabelSolidView.Default ->
        TabBarStyles.TabBarIslandHasLabelSolidMDefault
    size == TabBarIslandHasLabelSolidSize.M && view == TabBarIslandHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelSolidMSecondary
    size == TabBarIslandHasLabelSolidSize.M && view == TabBarIslandHasLabelSolidView.Accent ->
        TabBarStyles.TabBarIslandHasLabelSolidMAccent
    size == TabBarIslandHasLabelSolidSize.L && view == TabBarIslandHasLabelSolidView.Default ->
        TabBarStyles.TabBarIslandHasLabelSolidLDefault
    size == TabBarIslandHasLabelSolidSize.L && view == TabBarIslandHasLabelSolidView.Secondary ->
        TabBarStyles.TabBarIslandHasLabelSolidLSecondary
    size == TabBarIslandHasLabelSolidSize.L && view == TabBarIslandHasLabelSolidView.Accent ->
        TabBarStyles.TabBarIslandHasLabelSolidLAccent
    else -> error("Unsupported tab-bar-island-has-label-solid style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-island-has-label-solid
 */
@Composable
public fun TabBarStyles.IslandHasLabelSolid.style(
    size: TabBarIslandHasLabelSolidSize = TabBarIslandHasLabelSolidSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandHasLabelSolidView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, hasShadow, view).style(modify)

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-clear
 */
public fun TabBarStyles.Clear.resolve(
    size: TabBarClearSize = TabBarClearSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarClearView,
): TabBarStyles = when {
    size == TabBarClearSize.M && rounded == true && hasShadow == true && view ==
        TabBarClearView.Default -> TabBarStyles.TabBarClearMShadowRoundedDefault
    size == TabBarClearSize.M && rounded == true && hasShadow == true && view ==
        TabBarClearView.Secondary -> TabBarStyles.TabBarClearMShadowRoundedSecondary
    size == TabBarClearSize.M && rounded == true && hasShadow == true && view ==
        TabBarClearView.Accent -> TabBarStyles.TabBarClearMShadowRoundedAccent
    size == TabBarClearSize.M && rounded == true && divider == true && view ==
        TabBarClearView.Default -> TabBarStyles.TabBarClearMDividerRoundedDefault
    size == TabBarClearSize.M && rounded == true && divider == true && view ==
        TabBarClearView.Secondary -> TabBarStyles.TabBarClearMDividerRoundedSecondary
    size == TabBarClearSize.M && rounded == true && divider == true && view ==
        TabBarClearView.Accent -> TabBarStyles.TabBarClearMDividerRoundedAccent
    size == TabBarClearSize.L && rounded == true && hasShadow == true && view ==
        TabBarClearView.Default -> TabBarStyles.TabBarClearLShadowRoundedDefault
    size == TabBarClearSize.L && rounded == true && hasShadow == true && view ==
        TabBarClearView.Secondary -> TabBarStyles.TabBarClearLShadowRoundedSecondary
    size == TabBarClearSize.L && rounded == true && hasShadow == true && view ==
        TabBarClearView.Accent -> TabBarStyles.TabBarClearLShadowRoundedAccent
    size == TabBarClearSize.L && rounded == true && divider == true && view ==
        TabBarClearView.Default -> TabBarStyles.TabBarClearLDividerRoundedDefault
    size == TabBarClearSize.L && rounded == true && divider == true && view ==
        TabBarClearView.Secondary -> TabBarStyles.TabBarClearLDividerRoundedSecondary
    size == TabBarClearSize.L && rounded == true && divider == true && view ==
        TabBarClearView.Accent -> TabBarStyles.TabBarClearLDividerRoundedAccent
    size == TabBarClearSize.M && rounded == true && view == TabBarClearView.Default ->
        TabBarStyles.TabBarClearMRoundedDefault
    size == TabBarClearSize.M && rounded == true && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearMRoundedSecondary
    size == TabBarClearSize.M && rounded == true && view == TabBarClearView.Accent ->
        TabBarStyles.TabBarClearMRoundedAccent
    size == TabBarClearSize.M && hasShadow == true && view == TabBarClearView.Default ->
        TabBarStyles.TabBarClearMShadowDefault
    size == TabBarClearSize.M && hasShadow == true && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearMShadowSecondary
    size == TabBarClearSize.M && hasShadow == true && view == TabBarClearView.Accent ->
        TabBarStyles.TabBarClearMShadowAccent
    size == TabBarClearSize.M && divider == true && view == TabBarClearView.Default ->
        TabBarStyles.TabBarClearMDividerDefault
    size == TabBarClearSize.M && divider == true && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearMDividerSecondary
    size == TabBarClearSize.M && divider == true && view == TabBarClearView.Accent ->
        TabBarStyles.TabBarClearMDividerAccent
    size == TabBarClearSize.L && rounded == true && view == TabBarClearView.Default ->
        TabBarStyles.TabBarClearLRoundedDefault
    size == TabBarClearSize.L && rounded == true && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearLRoundedSecondary
    size == TabBarClearSize.L && rounded == true && view == TabBarClearView.Accent ->
        TabBarStyles.TabBarClearLRoundedAccent
    size == TabBarClearSize.L && hasShadow == true && view == TabBarClearView.Default ->
        TabBarStyles.TabBarClearLShadowDefault
    size == TabBarClearSize.L && hasShadow == true && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearLShadowSecondary
    size == TabBarClearSize.L && hasShadow == true && view == TabBarClearView.Accent ->
        TabBarStyles.TabBarClearLShadowAccent
    size == TabBarClearSize.L && divider == true && view == TabBarClearView.Default ->
        TabBarStyles.TabBarClearLDividerDefault
    size == TabBarClearSize.L && divider == true && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearLDividerSecondary
    size == TabBarClearSize.L && divider == true && view == TabBarClearView.Accent ->
        TabBarStyles.TabBarClearLDividerAccent
    size == TabBarClearSize.M && view == TabBarClearView.Default -> TabBarStyles.TabBarClearMDefault
    size == TabBarClearSize.M && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearMSecondary
    size == TabBarClearSize.M && view == TabBarClearView.Accent -> TabBarStyles.TabBarClearMAccent
    size == TabBarClearSize.L && view == TabBarClearView.Default -> TabBarStyles.TabBarClearLDefault
    size == TabBarClearSize.L && view == TabBarClearView.Secondary ->
        TabBarStyles.TabBarClearLSecondary
    size == TabBarClearSize.L && view == TabBarClearView.Accent -> TabBarStyles.TabBarClearLAccent
    else -> error("Unsupported tab-bar-clear style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-clear
 */
@Composable
public fun TabBarStyles.Clear.style(
    size: TabBarClearSize = TabBarClearSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarClearView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, rounded, hasShadow, divider, view).style(modify)

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-solid
 */
public fun TabBarStyles.Solid.resolve(
    size: TabBarSolidSize = TabBarSolidSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarSolidView,
): TabBarStyles = when {
    size == TabBarSolidSize.M && rounded == true && hasShadow == true && view ==
        TabBarSolidView.Default -> TabBarStyles.TabBarSolidMShadowRoundedDefault
    size == TabBarSolidSize.M && rounded == true && hasShadow == true && view ==
        TabBarSolidView.Secondary -> TabBarStyles.TabBarSolidMShadowRoundedSecondary
    size == TabBarSolidSize.M && rounded == true && hasShadow == true && view ==
        TabBarSolidView.Accent -> TabBarStyles.TabBarSolidMShadowRoundedAccent
    size == TabBarSolidSize.M && rounded == true && divider == true && view ==
        TabBarSolidView.Default -> TabBarStyles.TabBarSolidMDividerRoundedDefault
    size == TabBarSolidSize.M && rounded == true && divider == true && view ==
        TabBarSolidView.Secondary -> TabBarStyles.TabBarSolidMDividerRoundedSecondary
    size == TabBarSolidSize.M && rounded == true && divider == true && view ==
        TabBarSolidView.Accent -> TabBarStyles.TabBarSolidMDividerRoundedAccent
    size == TabBarSolidSize.L && rounded == true && hasShadow == true && view ==
        TabBarSolidView.Default -> TabBarStyles.TabBarSolidLShadowRoundedDefault
    size == TabBarSolidSize.L && rounded == true && hasShadow == true && view ==
        TabBarSolidView.Secondary -> TabBarStyles.TabBarSolidLShadowRoundedSecondary
    size == TabBarSolidSize.L && rounded == true && hasShadow == true && view ==
        TabBarSolidView.Accent -> TabBarStyles.TabBarSolidLShadowRoundedAccent
    size == TabBarSolidSize.L && rounded == true && divider == true && view ==
        TabBarSolidView.Default -> TabBarStyles.TabBarSolidLDividerRoundedDefault
    size == TabBarSolidSize.L && rounded == true && divider == true && view ==
        TabBarSolidView.Secondary -> TabBarStyles.TabBarSolidLDividerRoundedSecondary
    size == TabBarSolidSize.L && rounded == true && divider == true && view ==
        TabBarSolidView.Accent -> TabBarStyles.TabBarSolidLDividerRoundedAccent
    size == TabBarSolidSize.M && rounded == true && view == TabBarSolidView.Default ->
        TabBarStyles.TabBarSolidMRoundedDefault
    size == TabBarSolidSize.M && rounded == true && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidMRoundedSecondary
    size == TabBarSolidSize.M && rounded == true && view == TabBarSolidView.Accent ->
        TabBarStyles.TabBarSolidMRoundedAccent
    size == TabBarSolidSize.M && hasShadow == true && view == TabBarSolidView.Default ->
        TabBarStyles.TabBarSolidMShadowDefault
    size == TabBarSolidSize.M && hasShadow == true && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidMShadowSecondary
    size == TabBarSolidSize.M && hasShadow == true && view == TabBarSolidView.Accent ->
        TabBarStyles.TabBarSolidMShadowAccent
    size == TabBarSolidSize.M && divider == true && view == TabBarSolidView.Default ->
        TabBarStyles.TabBarSolidMDividerDefault
    size == TabBarSolidSize.M && divider == true && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidMDividerSecondary
    size == TabBarSolidSize.M && divider == true && view == TabBarSolidView.Accent ->
        TabBarStyles.TabBarSolidMDividerAccent
    size == TabBarSolidSize.L && rounded == true && view == TabBarSolidView.Default ->
        TabBarStyles.TabBarSolidLRoundedDefault
    size == TabBarSolidSize.L && rounded == true && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidLRoundedSecondary
    size == TabBarSolidSize.L && rounded == true && view == TabBarSolidView.Accent ->
        TabBarStyles.TabBarSolidLRoundedAccent
    size == TabBarSolidSize.L && hasShadow == true && view == TabBarSolidView.Default ->
        TabBarStyles.TabBarSolidLShadowDefault
    size == TabBarSolidSize.L && hasShadow == true && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidLShadowSecondary
    size == TabBarSolidSize.L && hasShadow == true && view == TabBarSolidView.Accent ->
        TabBarStyles.TabBarSolidLShadowAccent
    size == TabBarSolidSize.L && divider == true && view == TabBarSolidView.Default ->
        TabBarStyles.TabBarSolidLDividerDefault
    size == TabBarSolidSize.L && divider == true && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidLDividerSecondary
    size == TabBarSolidSize.L && divider == true && view == TabBarSolidView.Accent ->
        TabBarStyles.TabBarSolidLDividerAccent
    size == TabBarSolidSize.M && view == TabBarSolidView.Default -> TabBarStyles.TabBarSolidMDefault
    size == TabBarSolidSize.M && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidMSecondary
    size == TabBarSolidSize.M && view == TabBarSolidView.Accent -> TabBarStyles.TabBarSolidMAccent
    size == TabBarSolidSize.L && view == TabBarSolidView.Default -> TabBarStyles.TabBarSolidLDefault
    size == TabBarSolidSize.L && view == TabBarSolidView.Secondary ->
        TabBarStyles.TabBarSolidLSecondary
    size == TabBarSolidSize.L && view == TabBarSolidView.Accent -> TabBarStyles.TabBarSolidLAccent
    else -> error("Unsupported tab-bar-solid style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-solid
 */
@Composable
public fun TabBarStyles.Solid.style(
    size: TabBarSolidSize = TabBarSolidSize.L,
    rounded: Boolean = false,
    hasShadow: Boolean = false,
    divider: Boolean = false,
    view: TabBarSolidView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, rounded, hasShadow, divider, view).style(modify)

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-island-clear
 */
public fun TabBarStyles.IslandClear.resolve(
    size: TabBarIslandClearSize = TabBarIslandClearSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandClearView,
): TabBarStyles = when {
    size == TabBarIslandClearSize.M && hasShadow == true && view == TabBarIslandClearView.Default ->
        TabBarStyles.TabBarIslandClearMShadowDefault
    size == TabBarIslandClearSize.M && hasShadow == true && view ==
        TabBarIslandClearView.Secondary -> TabBarStyles.TabBarIslandClearMShadowSecondary
    size == TabBarIslandClearSize.M && hasShadow == true && view == TabBarIslandClearView.Accent ->
        TabBarStyles.TabBarIslandClearMShadowAccent
    size == TabBarIslandClearSize.L && hasShadow == true && view == TabBarIslandClearView.Default ->
        TabBarStyles.TabBarIslandClearLShadowDefault
    size == TabBarIslandClearSize.L && hasShadow == true && view ==
        TabBarIslandClearView.Secondary -> TabBarStyles.TabBarIslandClearLShadowSecondary
    size == TabBarIslandClearSize.L && hasShadow == true && view == TabBarIslandClearView.Accent ->
        TabBarStyles.TabBarIslandClearLShadowAccent
    size == TabBarIslandClearSize.M && view == TabBarIslandClearView.Default ->
        TabBarStyles.TabBarIslandClearMDefault
    size == TabBarIslandClearSize.M && view == TabBarIslandClearView.Secondary ->
        TabBarStyles.TabBarIslandClearMSecondary
    size == TabBarIslandClearSize.M && view == TabBarIslandClearView.Accent ->
        TabBarStyles.TabBarIslandClearMAccent
    size == TabBarIslandClearSize.L && view == TabBarIslandClearView.Default ->
        TabBarStyles.TabBarIslandClearLDefault
    size == TabBarIslandClearSize.L && view == TabBarIslandClearView.Secondary ->
        TabBarStyles.TabBarIslandClearLSecondary
    size == TabBarIslandClearSize.L && view == TabBarIslandClearView.Accent ->
        TabBarStyles.TabBarIslandClearLAccent
    else -> error("Unsupported tab-bar-island-clear style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-island-clear
 */
@Composable
public fun TabBarStyles.IslandClear.style(
    size: TabBarIslandClearSize = TabBarIslandClearSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandClearView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, hasShadow, view).style(modify)

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar-island-solid
 */
public fun TabBarStyles.IslandSolid.resolve(
    size: TabBarIslandSolidSize = TabBarIslandSolidSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandSolidView,
): TabBarStyles = when {
    size == TabBarIslandSolidSize.M && hasShadow == true && view == TabBarIslandSolidView.Default ->
        TabBarStyles.TabBarIslandSolidMShadowDefault
    size == TabBarIslandSolidSize.M && hasShadow == true && view ==
        TabBarIslandSolidView.Secondary -> TabBarStyles.TabBarIslandSolidMShadowSecondary
    size == TabBarIslandSolidSize.M && hasShadow == true && view == TabBarIslandSolidView.Accent ->
        TabBarStyles.TabBarIslandSolidMShadowAccent
    size == TabBarIslandSolidSize.L && hasShadow == true && view == TabBarIslandSolidView.Default ->
        TabBarStyles.TabBarIslandSolidLShadowDefault
    size == TabBarIslandSolidSize.L && hasShadow == true && view ==
        TabBarIslandSolidView.Secondary -> TabBarStyles.TabBarIslandSolidLShadowSecondary
    size == TabBarIslandSolidSize.L && hasShadow == true && view == TabBarIslandSolidView.Accent ->
        TabBarStyles.TabBarIslandSolidLShadowAccent
    size == TabBarIslandSolidSize.M && view == TabBarIslandSolidView.Default ->
        TabBarStyles.TabBarIslandSolidMDefault
    size == TabBarIslandSolidSize.M && view == TabBarIslandSolidView.Secondary ->
        TabBarStyles.TabBarIslandSolidMSecondary
    size == TabBarIslandSolidSize.M && view == TabBarIslandSolidView.Accent ->
        TabBarStyles.TabBarIslandSolidMAccent
    size == TabBarIslandSolidSize.L && view == TabBarIslandSolidView.Default ->
        TabBarStyles.TabBarIslandSolidLDefault
    size == TabBarIslandSolidSize.L && view == TabBarIslandSolidView.Secondary ->
        TabBarStyles.TabBarIslandSolidLSecondary
    size == TabBarIslandSolidSize.L && view == TabBarIslandSolidView.Accent ->
        TabBarStyles.TabBarIslandSolidLAccent
    else -> error("Unsupported tab-bar-island-solid style combination")
}

/**
 * Возвращает [TabBarStyle] для tab-bar-island-solid
 */
@Composable
public fun TabBarStyles.IslandSolid.style(
    size: TabBarIslandSolidSize = TabBarIslandSolidSize.L,
    hasShadow: Boolean = false,
    view: TabBarIslandSolidView,
    modify: @Composable TabBarStyleBuilder.() -> Unit = {},
): TabBarStyle = resolve(size, hasShadow, view).style(modify)
