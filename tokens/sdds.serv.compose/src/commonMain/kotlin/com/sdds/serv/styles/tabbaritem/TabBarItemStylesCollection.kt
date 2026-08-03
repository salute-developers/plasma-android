// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.tabbaritem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.TabBarItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TabBarItem
 */
public enum class TabBarItemStyles(
    public val key: String,
) {
    TabBarItemClearMDefault("TabBarItemClear.M.Default"),
    TabBarItemClearMAccent("TabBarItemClear.M.Accent"),
    TabBarItemClearMSecondary("TabBarItemClear.M.Secondary"),
    TabBarItemClearMLabelDefault("TabBarItemClear.M.Label.Default"),
    TabBarItemClearMLabelAccent("TabBarItemClear.M.Label.Accent"),
    TabBarItemClearMLabelSecondary("TabBarItemClear.M.Label.Secondary"),
    TabBarItemClearLDefault("TabBarItemClear.L.Default"),
    TabBarItemClearLAccent("TabBarItemClear.L.Accent"),
    TabBarItemClearLSecondary("TabBarItemClear.L.Secondary"),
    TabBarItemClearLLabelDefault("TabBarItemClear.L.Label.Default"),
    TabBarItemClearLLabelAccent("TabBarItemClear.L.Label.Accent"),
    TabBarItemClearLLabelSecondary("TabBarItemClear.L.Label.Secondary"),
    TabBarItemSolidMDefault("TabBarItemSolid.M.Default"),
    TabBarItemSolidMAccent("TabBarItemSolid.M.Accent"),
    TabBarItemSolidMSecondary("TabBarItemSolid.M.Secondary"),
    TabBarItemSolidMLabelDefault("TabBarItemSolid.M.Label.Default"),
    TabBarItemSolidMLabelAccent("TabBarItemSolid.M.Label.Accent"),
    TabBarItemSolidMLabelSecondary("TabBarItemSolid.M.Label.Secondary"),
    TabBarItemSolidLDefault("TabBarItemSolid.L.Default"),
    TabBarItemSolidLAccent("TabBarItemSolid.L.Accent"),
    TabBarItemSolidLSecondary("TabBarItemSolid.L.Secondary"),
    TabBarItemSolidLLabelDefault("TabBarItemSolid.L.Label.Default"),
    TabBarItemSolidLLabelAccent("TabBarItemSolid.L.Label.Accent"),
    TabBarItemSolidLLabelSecondary("TabBarItemSolid.L.Label.Secondary"),
    ;

    /**
     * Typed API для подбора стиля tab-bar-item-clear
     */
    public object Clear

    /**
     * Typed API для подбора стиля tab-bar-item-solid
     */
    public object Solid
}

/**
 * Возможные значения свойства size для tab-bar-item-clear
 */
public enum class TabBarItemClearSize {
    M,
    L,
}

/**
 * Возможные значения свойства label-placement для tab-bar-item-clear
 */
public enum class TabBarItemClearLabelPlacement {
    None,
    Bottom,
}

/**
 * Возможные значения свойства view для tab-bar-item-clear
 */
public enum class TabBarItemClearView {
    Default,
    Accent,
    Secondary,
}

/**
 * Возможные значения свойства size для tab-bar-item-solid
 */
public enum class TabBarItemSolidSize {
    M,
    L,
}

/**
 * Возможные значения свойства label-placement для tab-bar-item-solid
 */
public enum class TabBarItemSolidLabelPlacement {
    None,
    Bottom,
}

/**
 * Возможные значения свойства view для tab-bar-item-solid
 */
public enum class TabBarItemSolidView {
    Default,
    Accent,
    Secondary,
}

/**
 * Возвращает [TabBarItemStyle] для [TabBarItemStyles]
 */
@Composable
public fun TabBarItemStyles.style(modify: @Composable TabBarItemStyleBuilder.() -> Unit = {}): TabBarItemStyle {
    val builder = when (this) {
        TabBarItemStyles.TabBarItemClearMDefault -> TabBarItemClear.M.Default
        TabBarItemStyles.TabBarItemClearMAccent -> TabBarItemClear.M.Accent
        TabBarItemStyles.TabBarItemClearMSecondary -> TabBarItemClear.M.Secondary
        TabBarItemStyles.TabBarItemClearMLabelDefault -> TabBarItemClear.M.Label.Default
        TabBarItemStyles.TabBarItemClearMLabelAccent -> TabBarItemClear.M.Label.Accent
        TabBarItemStyles.TabBarItemClearMLabelSecondary -> TabBarItemClear.M.Label.Secondary
        TabBarItemStyles.TabBarItemClearLDefault -> TabBarItemClear.L.Default
        TabBarItemStyles.TabBarItemClearLAccent -> TabBarItemClear.L.Accent
        TabBarItemStyles.TabBarItemClearLSecondary -> TabBarItemClear.L.Secondary
        TabBarItemStyles.TabBarItemClearLLabelDefault -> TabBarItemClear.L.Label.Default
        TabBarItemStyles.TabBarItemClearLLabelAccent -> TabBarItemClear.L.Label.Accent
        TabBarItemStyles.TabBarItemClearLLabelSecondary -> TabBarItemClear.L.Label.Secondary
        TabBarItemStyles.TabBarItemSolidMDefault -> TabBarItemSolid.M.Default
        TabBarItemStyles.TabBarItemSolidMAccent -> TabBarItemSolid.M.Accent
        TabBarItemStyles.TabBarItemSolidMSecondary -> TabBarItemSolid.M.Secondary
        TabBarItemStyles.TabBarItemSolidMLabelDefault -> TabBarItemSolid.M.Label.Default
        TabBarItemStyles.TabBarItemSolidMLabelAccent -> TabBarItemSolid.M.Label.Accent
        TabBarItemStyles.TabBarItemSolidMLabelSecondary -> TabBarItemSolid.M.Label.Secondary
        TabBarItemStyles.TabBarItemSolidLDefault -> TabBarItemSolid.L.Default
        TabBarItemStyles.TabBarItemSolidLAccent -> TabBarItemSolid.L.Accent
        TabBarItemStyles.TabBarItemSolidLSecondary -> TabBarItemSolid.L.Secondary
        TabBarItemStyles.TabBarItemSolidLLabelDefault -> TabBarItemSolid.L.Label.Default
        TabBarItemStyles.TabBarItemSolidLLabelAccent -> TabBarItemSolid.L.Label.Accent
        TabBarItemStyles.TabBarItemSolidLLabelSecondary -> TabBarItemSolid.L.Label.Secondary
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TabBarItemStyles] для tab-bar-item-clear
 */
public fun TabBarItemStyles.Clear.resolve(
    size: TabBarItemClearSize = TabBarItemClearSize.M,
    labelPlacement: TabBarItemClearLabelPlacement = TabBarItemClearLabelPlacement.None,
    view: TabBarItemClearView = TabBarItemClearView.Default,
): TabBarItemStyles = when {
    size == TabBarItemClearSize.M && labelPlacement == TabBarItemClearLabelPlacement.None && view ==
        TabBarItemClearView.Default -> TabBarItemStyles.TabBarItemClearMDefault
    size == TabBarItemClearSize.M && labelPlacement == TabBarItemClearLabelPlacement.None && view ==
        TabBarItemClearView.Accent -> TabBarItemStyles.TabBarItemClearMAccent
    size == TabBarItemClearSize.M && labelPlacement == TabBarItemClearLabelPlacement.None && view ==
        TabBarItemClearView.Secondary -> TabBarItemStyles.TabBarItemClearMSecondary
    size == TabBarItemClearSize.M && labelPlacement == TabBarItemClearLabelPlacement.Bottom && view
        == TabBarItemClearView.Default -> TabBarItemStyles.TabBarItemClearMLabelDefault
    size == TabBarItemClearSize.M && labelPlacement == TabBarItemClearLabelPlacement.Bottom && view
        == TabBarItemClearView.Accent -> TabBarItemStyles.TabBarItemClearMLabelAccent
    size == TabBarItemClearSize.M && labelPlacement == TabBarItemClearLabelPlacement.Bottom && view
        == TabBarItemClearView.Secondary -> TabBarItemStyles.TabBarItemClearMLabelSecondary
    size == TabBarItemClearSize.L && labelPlacement == TabBarItemClearLabelPlacement.None && view ==
        TabBarItemClearView.Default -> TabBarItemStyles.TabBarItemClearLDefault
    size == TabBarItemClearSize.L && labelPlacement == TabBarItemClearLabelPlacement.None && view ==
        TabBarItemClearView.Accent -> TabBarItemStyles.TabBarItemClearLAccent
    size == TabBarItemClearSize.L && labelPlacement == TabBarItemClearLabelPlacement.None && view ==
        TabBarItemClearView.Secondary -> TabBarItemStyles.TabBarItemClearLSecondary
    size == TabBarItemClearSize.L && labelPlacement == TabBarItemClearLabelPlacement.Bottom && view
        == TabBarItemClearView.Default -> TabBarItemStyles.TabBarItemClearLLabelDefault
    size == TabBarItemClearSize.L && labelPlacement == TabBarItemClearLabelPlacement.Bottom && view
        == TabBarItemClearView.Accent -> TabBarItemStyles.TabBarItemClearLLabelAccent
    size == TabBarItemClearSize.L && labelPlacement == TabBarItemClearLabelPlacement.Bottom && view
        == TabBarItemClearView.Secondary -> TabBarItemStyles.TabBarItemClearLLabelSecondary
    else -> error("Unsupported tab-bar-item-clear style combination")
}

/**
 * Возвращает [TabBarItemStyle] для tab-bar-item-clear
 */
@Composable
public fun TabBarItemStyles.Clear.style(
    size: TabBarItemClearSize = TabBarItemClearSize.M,
    labelPlacement: TabBarItemClearLabelPlacement = TabBarItemClearLabelPlacement.None,
    view: TabBarItemClearView = TabBarItemClearView.Default,
    modify: @Composable TabBarItemStyleBuilder.() -> Unit = {},
): TabBarItemStyle = resolve(size, labelPlacement, view).style(modify)

/**
 * Возвращает экземпляр [TabBarItemStyles] для tab-bar-item-solid
 */
public fun TabBarItemStyles.Solid.resolve(
    size: TabBarItemSolidSize = TabBarItemSolidSize.M,
    labelPlacement: TabBarItemSolidLabelPlacement = TabBarItemSolidLabelPlacement.None,
    view: TabBarItemSolidView = TabBarItemSolidView.Default,
): TabBarItemStyles = when {
    size == TabBarItemSolidSize.M && labelPlacement == TabBarItemSolidLabelPlacement.None && view ==
        TabBarItemSolidView.Default -> TabBarItemStyles.TabBarItemSolidMDefault
    size == TabBarItemSolidSize.M && labelPlacement == TabBarItemSolidLabelPlacement.None && view ==
        TabBarItemSolidView.Accent -> TabBarItemStyles.TabBarItemSolidMAccent
    size == TabBarItemSolidSize.M && labelPlacement == TabBarItemSolidLabelPlacement.None && view ==
        TabBarItemSolidView.Secondary -> TabBarItemStyles.TabBarItemSolidMSecondary
    size == TabBarItemSolidSize.M && labelPlacement == TabBarItemSolidLabelPlacement.Bottom && view
        == TabBarItemSolidView.Default -> TabBarItemStyles.TabBarItemSolidMLabelDefault
    size == TabBarItemSolidSize.M && labelPlacement == TabBarItemSolidLabelPlacement.Bottom && view
        == TabBarItemSolidView.Accent -> TabBarItemStyles.TabBarItemSolidMLabelAccent
    size == TabBarItemSolidSize.M && labelPlacement == TabBarItemSolidLabelPlacement.Bottom && view
        == TabBarItemSolidView.Secondary -> TabBarItemStyles.TabBarItemSolidMLabelSecondary
    size == TabBarItemSolidSize.L && labelPlacement == TabBarItemSolidLabelPlacement.None && view ==
        TabBarItemSolidView.Default -> TabBarItemStyles.TabBarItemSolidLDefault
    size == TabBarItemSolidSize.L && labelPlacement == TabBarItemSolidLabelPlacement.None && view ==
        TabBarItemSolidView.Accent -> TabBarItemStyles.TabBarItemSolidLAccent
    size == TabBarItemSolidSize.L && labelPlacement == TabBarItemSolidLabelPlacement.None && view ==
        TabBarItemSolidView.Secondary -> TabBarItemStyles.TabBarItemSolidLSecondary
    size == TabBarItemSolidSize.L && labelPlacement == TabBarItemSolidLabelPlacement.Bottom && view
        == TabBarItemSolidView.Default -> TabBarItemStyles.TabBarItemSolidLLabelDefault
    size == TabBarItemSolidSize.L && labelPlacement == TabBarItemSolidLabelPlacement.Bottom && view
        == TabBarItemSolidView.Accent -> TabBarItemStyles.TabBarItemSolidLLabelAccent
    size == TabBarItemSolidSize.L && labelPlacement == TabBarItemSolidLabelPlacement.Bottom && view
        == TabBarItemSolidView.Secondary -> TabBarItemStyles.TabBarItemSolidLLabelSecondary
    else -> error("Unsupported tab-bar-item-solid style combination")
}

/**
 * Возвращает [TabBarItemStyle] для tab-bar-item-solid
 */
@Composable
public fun TabBarItemStyles.Solid.style(
    size: TabBarItemSolidSize = TabBarItemSolidSize.M,
    labelPlacement: TabBarItemSolidLabelPlacement = TabBarItemSolidLabelPlacement.None,
    view: TabBarItemSolidView = TabBarItemSolidView.Default,
    modify: @Composable TabBarItemStyleBuilder.() -> Unit = {},
): TabBarItemStyle = resolve(size, labelPlacement, view).style(modify)
