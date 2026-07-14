// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.tabs

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TabsStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Tabs
 */
public enum class TabsStyles(
    public val key: String,
) {
    TabsDefaultL("TabsDefault.L"),
    TabsDefaultLVertical("TabsDefault.L.Vertical"),
    TabsDefaultLHorizontal("TabsDefault.L.Horizontal"),
    TabsDefaultM("TabsDefault.M"),
    TabsDefaultMVertical("TabsDefault.M.Vertical"),
    TabsDefaultMHorizontal("TabsDefault.M.Horizontal"),
    TabsDefaultS("TabsDefault.S"),
    TabsDefaultSVertical("TabsDefault.S.Vertical"),
    TabsDefaultSHorizontal("TabsDefault.S.Horizontal"),
    TabsDefaultXs("TabsDefault.Xs"),
    TabsDefaultXsVertical("TabsDefault.Xs.Vertical"),
    TabsDefaultXsHorizontal("TabsDefault.Xs.Horizontal"),
    IconTabsL("IconTabs.L"),
    IconTabsLVertical("IconTabs.L.Vertical"),
    IconTabsLHorizontal("IconTabs.L.Horizontal"),
    IconTabsM("IconTabs.M"),
    IconTabsMVertical("IconTabs.M.Vertical"),
    IconTabsMHorizontal("IconTabs.M.Horizontal"),
    IconTabsS("IconTabs.S"),
    IconTabsSVertical("IconTabs.S.Vertical"),
    IconTabsSHorizontal("IconTabs.S.Horizontal"),
    IconTabsXs("IconTabs.Xs"),
    IconTabsXsVertical("IconTabs.Xs.Vertical"),
    IconTabsXsHorizontal("IconTabs.Xs.Horizontal"),
    TabsHeaderH1("TabsHeader.H1"),
    TabsHeaderH2("TabsHeader.H2"),
    TabsHeaderH3("TabsHeader.H3"),
    TabsHeaderH4("TabsHeader.H4"),
    TabsHeaderH5("TabsHeader.H5"),
    ;

    /**
     * Typed API для подбора стиля tabs-default
     */
    public object Default

    /**
     * Typed API для подбора стиля icon-tabs
     */
    public object IconTabs

    /**
     * Typed API для подбора стиля tabs-header
     */
    public object Header
}

/**
 * Возможные значения свойства size для tabs-default
 */
public enum class TabsDefaultSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства orientation для tabs-default
 */
public enum class TabsDefaultOrientation {
    Default,
    Horizontal,
    Vertical,
}

/**
 * Возможные значения свойства size для icon-tabs
 */
public enum class IconTabsSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства orientation для icon-tabs
 */
public enum class IconTabsOrientation {
    Default,
    Horizontal,
    Vertical,
}

/**
 * Возможные значения свойства size для tabs-header
 */
public enum class TabsHeaderSize {
    H1,
    H2,
    H3,
    H4,
    H5,
}

/**
 * Возвращает [TabsStyle] для [TabsStyles]
 */
@Composable
public fun TabsStyles.style(modify: @Composable TabsStyleBuilder.() -> Unit = {}): TabsStyle {
    val builder = when (this) {
        TabsStyles.TabsDefaultL -> TabsDefault.L
        TabsStyles.TabsDefaultLVertical -> TabsDefault.L.Vertical
        TabsStyles.TabsDefaultLHorizontal -> TabsDefault.L.Horizontal
        TabsStyles.TabsDefaultM -> TabsDefault.M
        TabsStyles.TabsDefaultMVertical -> TabsDefault.M.Vertical
        TabsStyles.TabsDefaultMHorizontal -> TabsDefault.M.Horizontal
        TabsStyles.TabsDefaultS -> TabsDefault.S
        TabsStyles.TabsDefaultSVertical -> TabsDefault.S.Vertical
        TabsStyles.TabsDefaultSHorizontal -> TabsDefault.S.Horizontal
        TabsStyles.TabsDefaultXs -> TabsDefault.Xs
        TabsStyles.TabsDefaultXsVertical -> TabsDefault.Xs.Vertical
        TabsStyles.TabsDefaultXsHorizontal -> TabsDefault.Xs.Horizontal
        TabsStyles.IconTabsL -> IconTabs.L
        TabsStyles.IconTabsLVertical -> IconTabs.L.Vertical
        TabsStyles.IconTabsLHorizontal -> IconTabs.L.Horizontal
        TabsStyles.IconTabsM -> IconTabs.M
        TabsStyles.IconTabsMVertical -> IconTabs.M.Vertical
        TabsStyles.IconTabsMHorizontal -> IconTabs.M.Horizontal
        TabsStyles.IconTabsS -> IconTabs.S
        TabsStyles.IconTabsSVertical -> IconTabs.S.Vertical
        TabsStyles.IconTabsSHorizontal -> IconTabs.S.Horizontal
        TabsStyles.IconTabsXs -> IconTabs.Xs
        TabsStyles.IconTabsXsVertical -> IconTabs.Xs.Vertical
        TabsStyles.IconTabsXsHorizontal -> IconTabs.Xs.Horizontal
        TabsStyles.TabsHeaderH1 -> TabsHeader.H1
        TabsStyles.TabsHeaderH2 -> TabsHeader.H2
        TabsStyles.TabsHeaderH3 -> TabsHeader.H3
        TabsStyles.TabsHeaderH4 -> TabsHeader.H4
        TabsStyles.TabsHeaderH5 -> TabsHeader.H5
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TabsStyles] для tabs-default
 */
public fun TabsStyles.Default.resolve(
    size: TabsDefaultSize = TabsDefaultSize.L,
    orientation: TabsDefaultOrientation = TabsDefaultOrientation.Default,
): TabsStyles = when {
    size == TabsDefaultSize.L && orientation == TabsDefaultOrientation.Vertical ->
        TabsStyles.TabsDefaultLVertical
    size == TabsDefaultSize.L && orientation == TabsDefaultOrientation.Horizontal ->
        TabsStyles.TabsDefaultLHorizontal
    size == TabsDefaultSize.M && orientation == TabsDefaultOrientation.Vertical ->
        TabsStyles.TabsDefaultMVertical
    size == TabsDefaultSize.M && orientation == TabsDefaultOrientation.Horizontal ->
        TabsStyles.TabsDefaultMHorizontal
    size == TabsDefaultSize.S && orientation == TabsDefaultOrientation.Vertical ->
        TabsStyles.TabsDefaultSVertical
    size == TabsDefaultSize.S && orientation == TabsDefaultOrientation.Horizontal ->
        TabsStyles.TabsDefaultSHorizontal
    size == TabsDefaultSize.Xs && orientation == TabsDefaultOrientation.Vertical ->
        TabsStyles.TabsDefaultXsVertical
    size == TabsDefaultSize.Xs && orientation == TabsDefaultOrientation.Horizontal ->
        TabsStyles.TabsDefaultXsHorizontal
    size == TabsDefaultSize.L -> TabsStyles.TabsDefaultL
    size == TabsDefaultSize.M -> TabsStyles.TabsDefaultM
    size == TabsDefaultSize.S -> TabsStyles.TabsDefaultS
    size == TabsDefaultSize.Xs -> TabsStyles.TabsDefaultXs
    else -> error("Unsupported tabs-default style combination")
}

/**
 * Возвращает [TabsStyle] для tabs-default
 */
@Composable
public fun TabsStyles.Default.style(
    size: TabsDefaultSize = TabsDefaultSize.L,
    orientation: TabsDefaultOrientation = TabsDefaultOrientation.Default,
    modify: @Composable TabsStyleBuilder.() -> Unit = {},
): TabsStyle = resolve(size, orientation).style(modify)

/**
 * Возвращает экземпляр [TabsStyles] для icon-tabs
 */
public fun TabsStyles.IconTabs.resolve(
    size: IconTabsSize = IconTabsSize.L,
    orientation: IconTabsOrientation = IconTabsOrientation.Default,
): TabsStyles = when {
    size == IconTabsSize.L && orientation == IconTabsOrientation.Vertical ->
        TabsStyles.IconTabsLVertical
    size == IconTabsSize.L && orientation == IconTabsOrientation.Horizontal ->
        TabsStyles.IconTabsLHorizontal
    size == IconTabsSize.M && orientation == IconTabsOrientation.Vertical ->
        TabsStyles.IconTabsMVertical
    size == IconTabsSize.M && orientation == IconTabsOrientation.Horizontal ->
        TabsStyles.IconTabsMHorizontal
    size == IconTabsSize.S && orientation == IconTabsOrientation.Vertical ->
        TabsStyles.IconTabsSVertical
    size == IconTabsSize.S && orientation == IconTabsOrientation.Horizontal ->
        TabsStyles.IconTabsSHorizontal
    size == IconTabsSize.Xs && orientation == IconTabsOrientation.Vertical ->
        TabsStyles.IconTabsXsVertical
    size == IconTabsSize.Xs && orientation == IconTabsOrientation.Horizontal ->
        TabsStyles.IconTabsXsHorizontal
    size == IconTabsSize.L -> TabsStyles.IconTabsL
    size == IconTabsSize.M -> TabsStyles.IconTabsM
    size == IconTabsSize.S -> TabsStyles.IconTabsS
    size == IconTabsSize.Xs -> TabsStyles.IconTabsXs
    else -> error("Unsupported icon-tabs style combination")
}

/**
 * Возвращает [TabsStyle] для icon-tabs
 */
@Composable
public fun TabsStyles.IconTabs.style(
    size: IconTabsSize = IconTabsSize.L,
    orientation: IconTabsOrientation = IconTabsOrientation.Default,
    modify: @Composable TabsStyleBuilder.() -> Unit = {},
): TabsStyle = resolve(size, orientation).style(modify)

/**
 * Возвращает экземпляр [TabsStyles] для tabs-header
 */
public fun TabsStyles.Header.resolve(size: TabsHeaderSize = TabsHeaderSize.H1): TabsStyles = when {
    size == TabsHeaderSize.H1 -> TabsStyles.TabsHeaderH1
    size == TabsHeaderSize.H2 -> TabsStyles.TabsHeaderH2
    size == TabsHeaderSize.H3 -> TabsStyles.TabsHeaderH3
    size == TabsHeaderSize.H4 -> TabsStyles.TabsHeaderH4
    size == TabsHeaderSize.H5 -> TabsStyles.TabsHeaderH5
    else -> error("Unsupported tabs-header style combination")
}

/**
 * Возвращает [TabsStyle] для tabs-header
 */
@Composable
public fun TabsStyles.Header.style(
    size: TabsHeaderSize = TabsHeaderSize.H1,
    modify: @Composable
    TabsStyleBuilder.() -> Unit = {},
): TabsStyle = resolve(size).style(modify)
