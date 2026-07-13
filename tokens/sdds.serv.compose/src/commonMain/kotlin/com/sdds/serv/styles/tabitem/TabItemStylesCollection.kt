// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.tabitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TabItem
 */
public enum class TabItemStyles(
    public val key: String,
) {
    TabItemDefaultL("TabItemDefault.L"),
    TabItemDefaultLHorizontal("TabItemDefault.L.Horizontal"),
    TabItemDefaultLVertical("TabItemDefault.L.Vertical"),
    TabItemDefaultM("TabItemDefault.M"),
    TabItemDefaultMHorizontal("TabItemDefault.M.Horizontal"),
    TabItemDefaultMVertical("TabItemDefault.M.Vertical"),
    TabItemDefaultS("TabItemDefault.S"),
    TabItemDefaultSHorizontal("TabItemDefault.S.Horizontal"),
    TabItemDefaultSVertical("TabItemDefault.S.Vertical"),
    TabItemDefaultXs("TabItemDefault.Xs"),
    TabItemDefaultXsHorizontal("TabItemDefault.Xs.Horizontal"),
    TabItemDefaultXsVertical("TabItemDefault.Xs.Vertical"),
    TabItemHeaderH1("TabItemHeader.H1"),
    TabItemHeaderH2("TabItemHeader.H2"),
    TabItemHeaderH3("TabItemHeader.H3"),
    TabItemHeaderH4("TabItemHeader.H4"),
    TabItemHeaderH5("TabItemHeader.H5"),
    ;

    /**
     * Typed API для подбора стиля tab-item-default
     */
    public object Default

    /**
     * Typed API для подбора стиля tab-item-header
     */
    public object Header
}

/**
 * Возможные значения свойства size для tab-item-default
 */
public enum class TabItemDefaultSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства orientation для tab-item-default
 */
public enum class TabItemDefaultOrientation {
    Default,
    Horizontal,
    Vertical,
}

/**
 * Возможные значения свойства size для tab-item-header
 */
public enum class TabItemHeaderSize {
    H1,
    H2,
    H3,
    H4,
    H5,
}

/**
 * Возвращает [TabItemStyle] для [TabItemStyles]
 */
@Composable
public fun TabItemStyles.style(modify: @Composable TabItemStyleBuilder.() -> Unit = {}): TabItemStyle {
    val builder = when (this) {
        TabItemStyles.TabItemDefaultL -> TabItemDefault.L
        TabItemStyles.TabItemDefaultLHorizontal -> TabItemDefault.L.Horizontal
        TabItemStyles.TabItemDefaultLVertical -> TabItemDefault.L.Vertical
        TabItemStyles.TabItemDefaultM -> TabItemDefault.M
        TabItemStyles.TabItemDefaultMHorizontal -> TabItemDefault.M.Horizontal
        TabItemStyles.TabItemDefaultMVertical -> TabItemDefault.M.Vertical
        TabItemStyles.TabItemDefaultS -> TabItemDefault.S
        TabItemStyles.TabItemDefaultSHorizontal -> TabItemDefault.S.Horizontal
        TabItemStyles.TabItemDefaultSVertical -> TabItemDefault.S.Vertical
        TabItemStyles.TabItemDefaultXs -> TabItemDefault.Xs
        TabItemStyles.TabItemDefaultXsHorizontal -> TabItemDefault.Xs.Horizontal
        TabItemStyles.TabItemDefaultXsVertical -> TabItemDefault.Xs.Vertical
        TabItemStyles.TabItemHeaderH1 -> TabItemHeader.H1
        TabItemStyles.TabItemHeaderH2 -> TabItemHeader.H2
        TabItemStyles.TabItemHeaderH3 -> TabItemHeader.H3
        TabItemStyles.TabItemHeaderH4 -> TabItemHeader.H4
        TabItemStyles.TabItemHeaderH5 -> TabItemHeader.H5
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TabItemStyles] для tab-item-default
 */
public fun TabItemStyles.Default.resolve(
    size: TabItemDefaultSize = TabItemDefaultSize.L,
    orientation: TabItemDefaultOrientation = TabItemDefaultOrientation.Default,
): TabItemStyles =
    when {
        size == TabItemDefaultSize.L && orientation == TabItemDefaultOrientation.Horizontal ->
            TabItemStyles.TabItemDefaultLHorizontal
        size == TabItemDefaultSize.L && orientation == TabItemDefaultOrientation.Vertical ->
            TabItemStyles.TabItemDefaultLVertical
        size == TabItemDefaultSize.M && orientation == TabItemDefaultOrientation.Horizontal ->
            TabItemStyles.TabItemDefaultMHorizontal
        size == TabItemDefaultSize.M && orientation == TabItemDefaultOrientation.Vertical ->
            TabItemStyles.TabItemDefaultMVertical
        size == TabItemDefaultSize.S && orientation == TabItemDefaultOrientation.Horizontal ->
            TabItemStyles.TabItemDefaultSHorizontal
        size == TabItemDefaultSize.S && orientation == TabItemDefaultOrientation.Vertical ->
            TabItemStyles.TabItemDefaultSVertical
        size == TabItemDefaultSize.Xs && orientation == TabItemDefaultOrientation.Horizontal ->
            TabItemStyles.TabItemDefaultXsHorizontal
        size == TabItemDefaultSize.Xs && orientation == TabItemDefaultOrientation.Vertical ->
            TabItemStyles.TabItemDefaultXsVertical
        size == TabItemDefaultSize.L -> TabItemStyles.TabItemDefaultL
        size == TabItemDefaultSize.M -> TabItemStyles.TabItemDefaultM
        size == TabItemDefaultSize.S -> TabItemStyles.TabItemDefaultS
        size == TabItemDefaultSize.Xs -> TabItemStyles.TabItemDefaultXs
        else -> error("Unsupported tab-item-default style combination")
    }

/**
 * Возвращает [TabItemStyle] для tab-item-default
 */
@Composable
public fun TabItemStyles.Default.style(
    size: TabItemDefaultSize = TabItemDefaultSize.L,
    orientation: TabItemDefaultOrientation = TabItemDefaultOrientation.Default,
    modify: @Composable TabItemStyleBuilder.() -> Unit = {},
): TabItemStyle = resolve(size, orientation).style(modify)

/**
 * Возвращает экземпляр [TabItemStyles] для tab-item-header
 */
public fun TabItemStyles.Header.resolve(size: TabItemHeaderSize = TabItemHeaderSize.H1): TabItemStyles = when {
    size == TabItemHeaderSize.H1 -> TabItemStyles.TabItemHeaderH1
    size == TabItemHeaderSize.H2 -> TabItemStyles.TabItemHeaderH2
    size == TabItemHeaderSize.H3 -> TabItemStyles.TabItemHeaderH3
    size == TabItemHeaderSize.H4 -> TabItemStyles.TabItemHeaderH4
    size == TabItemHeaderSize.H5 -> TabItemStyles.TabItemHeaderH5
    else -> error("Unsupported tab-item-header style combination")
}

/**
 * Возвращает [TabItemStyle] для tab-item-header
 */
@Composable
public fun TabItemStyles.Header.style(
    size: TabItemHeaderSize = TabItemHeaderSize.H1,
    modify: @Composable TabItemStyleBuilder.() -> Unit = {},
): TabItemStyle =
    resolve(size).style(modify)
