// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.listitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ListItem
 */
public enum class ListItemStyles(
    public val key: String,
) {
    ListItemNormalXl("ListItemNormal.Xl"),
    ListItemNormalL("ListItemNormal.L"),
    ListItemNormalM("ListItemNormal.M"),
    ListItemNormalS("ListItemNormal.S"),
    ListItemNormalXs("ListItemNormal.Xs"),
    ListItemTightXl("ListItemTight.Xl"),
    ListItemTightL("ListItemTight.L"),
    ListItemTightM("ListItemTight.M"),
    ListItemTightS("ListItemTight.S"),
    ListItemTightXs("ListItemTight.Xs"),
    DropdownMenuItemNormalXlDefault("DropdownMenuItemNormal.Xl.Default"),
    DropdownMenuItemNormalXlPositive("DropdownMenuItemNormal.Xl.Positive"),
    DropdownMenuItemNormalXlNegative("DropdownMenuItemNormal.Xl.Negative"),
    DropdownMenuItemNormalLDefault("DropdownMenuItemNormal.L.Default"),
    DropdownMenuItemNormalLPositive("DropdownMenuItemNormal.L.Positive"),
    DropdownMenuItemNormalLNegative("DropdownMenuItemNormal.L.Negative"),
    DropdownMenuItemNormalMDefault("DropdownMenuItemNormal.M.Default"),
    DropdownMenuItemNormalMPositive("DropdownMenuItemNormal.M.Positive"),
    DropdownMenuItemNormalMNegative("DropdownMenuItemNormal.M.Negative"),
    DropdownMenuItemNormalSDefault("DropdownMenuItemNormal.S.Default"),
    DropdownMenuItemNormalSPositive("DropdownMenuItemNormal.S.Positive"),
    DropdownMenuItemNormalSNegative("DropdownMenuItemNormal.S.Negative"),
    DropdownMenuItemNormalXsDefault("DropdownMenuItemNormal.Xs.Default"),
    DropdownMenuItemNormalXsPositive("DropdownMenuItemNormal.Xs.Positive"),
    DropdownMenuItemNormalXsNegative("DropdownMenuItemNormal.Xs.Negative"),
    DropdownMenuItemTightXlDefault("DropdownMenuItemTight.Xl.Default"),
    DropdownMenuItemTightXlPositive("DropdownMenuItemTight.Xl.Positive"),
    DropdownMenuItemTightXlNegative("DropdownMenuItemTight.Xl.Negative"),
    DropdownMenuItemTightLDefault("DropdownMenuItemTight.L.Default"),
    DropdownMenuItemTightLPositive("DropdownMenuItemTight.L.Positive"),
    DropdownMenuItemTightLNegative("DropdownMenuItemTight.L.Negative"),
    DropdownMenuItemTightMDefault("DropdownMenuItemTight.M.Default"),
    DropdownMenuItemTightMPositive("DropdownMenuItemTight.M.Positive"),
    DropdownMenuItemTightMNegative("DropdownMenuItemTight.M.Negative"),
    DropdownMenuItemTightSDefault("DropdownMenuItemTight.S.Default"),
    DropdownMenuItemTightSPositive("DropdownMenuItemTight.S.Positive"),
    DropdownMenuItemTightSNegative("DropdownMenuItemTight.S.Negative"),
    DropdownMenuItemTightXsDefault("DropdownMenuItemTight.Xs.Default"),
    DropdownMenuItemTightXsPositive("DropdownMenuItemTight.Xs.Positive"),
    DropdownMenuItemTightXsNegative("DropdownMenuItemTight.Xs.Negative"),
    ;

    /**
     * Typed API для подбора стиля list-item-normal
     */
    public object Normal

    /**
     * Typed API для подбора стиля list-item-tight
     */
    public object Tight

    /**
     * Typed API для подбора стиля dropdown-menu-item-normal
     */
    public object DropdownMenuItemNormal

    /**
     * Typed API для подбора стиля dropdown-menu-item-tight
     */
    public object DropdownMenuItemTight
}

/**
 * Возможные значения свойства size для list-item-normal
 */
public enum class ListItemNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для list-item-tight
 */
public enum class ListItemTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для dropdown-menu-item-normal
 */
public enum class ListItemDropdownMenuItemNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для dropdown-menu-item-normal
 */
public enum class ListItemDropdownMenuItemNormalView {
    Default,
    Positive,
    Negative,
}

/**
 * Возможные значения свойства size для dropdown-menu-item-tight
 */
public enum class ListItemDropdownMenuItemTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для dropdown-menu-item-tight
 */
public enum class ListItemDropdownMenuItemTightView {
    Default,
    Positive,
    Negative,
}

/**
 * Возвращает [ListItemStyle] для [ListItemStyles]
 */
@Composable
public fun ListItemStyles.style(modify: @Composable ListItemStyleBuilder.() -> Unit = {}): ListItemStyle {
    val builder = when (this) {
        ListItemStyles.ListItemNormalXl -> ListItemNormal.Xl
        ListItemStyles.ListItemNormalL -> ListItemNormal.L
        ListItemStyles.ListItemNormalM -> ListItemNormal.M
        ListItemStyles.ListItemNormalS -> ListItemNormal.S
        ListItemStyles.ListItemNormalXs -> ListItemNormal.Xs
        ListItemStyles.ListItemTightXl -> ListItemTight.Xl
        ListItemStyles.ListItemTightL -> ListItemTight.L
        ListItemStyles.ListItemTightM -> ListItemTight.M
        ListItemStyles.ListItemTightS -> ListItemTight.S
        ListItemStyles.ListItemTightXs -> ListItemTight.Xs
        ListItemStyles.DropdownMenuItemNormalXlDefault -> DropdownMenuItemNormal.Xl.Default
        ListItemStyles.DropdownMenuItemNormalXlPositive -> DropdownMenuItemNormal.Xl.Positive
        ListItemStyles.DropdownMenuItemNormalXlNegative -> DropdownMenuItemNormal.Xl.Negative
        ListItemStyles.DropdownMenuItemNormalLDefault -> DropdownMenuItemNormal.L.Default
        ListItemStyles.DropdownMenuItemNormalLPositive -> DropdownMenuItemNormal.L.Positive
        ListItemStyles.DropdownMenuItemNormalLNegative -> DropdownMenuItemNormal.L.Negative
        ListItemStyles.DropdownMenuItemNormalMDefault -> DropdownMenuItemNormal.M.Default
        ListItemStyles.DropdownMenuItemNormalMPositive -> DropdownMenuItemNormal.M.Positive
        ListItemStyles.DropdownMenuItemNormalMNegative -> DropdownMenuItemNormal.M.Negative
        ListItemStyles.DropdownMenuItemNormalSDefault -> DropdownMenuItemNormal.S.Default
        ListItemStyles.DropdownMenuItemNormalSPositive -> DropdownMenuItemNormal.S.Positive
        ListItemStyles.DropdownMenuItemNormalSNegative -> DropdownMenuItemNormal.S.Negative
        ListItemStyles.DropdownMenuItemNormalXsDefault -> DropdownMenuItemNormal.Xs.Default
        ListItemStyles.DropdownMenuItemNormalXsPositive -> DropdownMenuItemNormal.Xs.Positive
        ListItemStyles.DropdownMenuItemNormalXsNegative -> DropdownMenuItemNormal.Xs.Negative
        ListItemStyles.DropdownMenuItemTightXlDefault -> DropdownMenuItemTight.Xl.Default
        ListItemStyles.DropdownMenuItemTightXlPositive -> DropdownMenuItemTight.Xl.Positive
        ListItemStyles.DropdownMenuItemTightXlNegative -> DropdownMenuItemTight.Xl.Negative
        ListItemStyles.DropdownMenuItemTightLDefault -> DropdownMenuItemTight.L.Default
        ListItemStyles.DropdownMenuItemTightLPositive -> DropdownMenuItemTight.L.Positive
        ListItemStyles.DropdownMenuItemTightLNegative -> DropdownMenuItemTight.L.Negative
        ListItemStyles.DropdownMenuItemTightMDefault -> DropdownMenuItemTight.M.Default
        ListItemStyles.DropdownMenuItemTightMPositive -> DropdownMenuItemTight.M.Positive
        ListItemStyles.DropdownMenuItemTightMNegative -> DropdownMenuItemTight.M.Negative
        ListItemStyles.DropdownMenuItemTightSDefault -> DropdownMenuItemTight.S.Default
        ListItemStyles.DropdownMenuItemTightSPositive -> DropdownMenuItemTight.S.Positive
        ListItemStyles.DropdownMenuItemTightSNegative -> DropdownMenuItemTight.S.Negative
        ListItemStyles.DropdownMenuItemTightXsDefault -> DropdownMenuItemTight.Xs.Default
        ListItemStyles.DropdownMenuItemTightXsPositive -> DropdownMenuItemTight.Xs.Positive
        ListItemStyles.DropdownMenuItemTightXsNegative -> DropdownMenuItemTight.Xs.Negative
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListItemStyles] для list-item-normal
 */
public fun ListItemStyles.Normal.resolve(size: ListItemNormalSize = ListItemNormalSize.Xl): ListItemStyles = when {
    size == ListItemNormalSize.Xl -> ListItemStyles.ListItemNormalXl
    size == ListItemNormalSize.L -> ListItemStyles.ListItemNormalL
    size == ListItemNormalSize.M -> ListItemStyles.ListItemNormalM
    size == ListItemNormalSize.S -> ListItemStyles.ListItemNormalS
    size == ListItemNormalSize.Xs -> ListItemStyles.ListItemNormalXs
    else -> error("Unsupported list-item-normal style combination")
}

/**
 * Возвращает [ListItemStyle] для list-item-normal
 */
@Composable
public fun ListItemStyles.Normal.style(
    size: ListItemNormalSize = ListItemNormalSize.Xl,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для list-item-tight
 */
public fun ListItemStyles.Tight.resolve(size: ListItemTightSize = ListItemTightSize.Xl): ListItemStyles = when {
    size == ListItemTightSize.Xl -> ListItemStyles.ListItemTightXl
    size == ListItemTightSize.L -> ListItemStyles.ListItemTightL
    size == ListItemTightSize.M -> ListItemStyles.ListItemTightM
    size == ListItemTightSize.S -> ListItemStyles.ListItemTightS
    size == ListItemTightSize.Xs -> ListItemStyles.ListItemTightXs
    else -> error("Unsupported list-item-tight style combination")
}

/**
 * Возвращает [ListItemStyle] для list-item-tight
 */
@Composable
public fun ListItemStyles.Tight.style(
    size: ListItemTightSize = ListItemTightSize.Xl,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для dropdown-menu-item-normal
 */
public fun ListItemStyles.DropdownMenuItemNormal.resolve(
    size: ListItemDropdownMenuItemNormalSize =
        ListItemDropdownMenuItemNormalSize.Xl,
    view: ListItemDropdownMenuItemNormalView =
        ListItemDropdownMenuItemNormalView.Default,
): ListItemStyles = when {
    size == ListItemDropdownMenuItemNormalSize.Xl && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalXlDefault
    size == ListItemDropdownMenuItemNormalSize.Xl && view ==
        ListItemDropdownMenuItemNormalView.Positive ->
        ListItemStyles.DropdownMenuItemNormalXlPositive
    size == ListItemDropdownMenuItemNormalSize.Xl && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalXlNegative
    size == ListItemDropdownMenuItemNormalSize.L && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalLDefault
    size == ListItemDropdownMenuItemNormalSize.L && view ==
        ListItemDropdownMenuItemNormalView.Positive ->
        ListItemStyles.DropdownMenuItemNormalLPositive
    size == ListItemDropdownMenuItemNormalSize.L && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalLNegative
    size == ListItemDropdownMenuItemNormalSize.M && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalMDefault
    size == ListItemDropdownMenuItemNormalSize.M && view ==
        ListItemDropdownMenuItemNormalView.Positive ->
        ListItemStyles.DropdownMenuItemNormalMPositive
    size == ListItemDropdownMenuItemNormalSize.M && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalMNegative
    size == ListItemDropdownMenuItemNormalSize.S && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalSDefault
    size == ListItemDropdownMenuItemNormalSize.S && view ==
        ListItemDropdownMenuItemNormalView.Positive ->
        ListItemStyles.DropdownMenuItemNormalSPositive
    size == ListItemDropdownMenuItemNormalSize.S && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalSNegative
    size == ListItemDropdownMenuItemNormalSize.Xs && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalXsDefault
    size == ListItemDropdownMenuItemNormalSize.Xs && view ==
        ListItemDropdownMenuItemNormalView.Positive ->
        ListItemStyles.DropdownMenuItemNormalXsPositive
    size == ListItemDropdownMenuItemNormalSize.Xs && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalXsNegative
    else -> error("Unsupported dropdown-menu-item-normal style combination")
}

/**
 * Возвращает [ListItemStyle] для dropdown-menu-item-normal
 */
@Composable
public fun ListItemStyles.DropdownMenuItemNormal.style(
    size: ListItemDropdownMenuItemNormalSize = ListItemDropdownMenuItemNormalSize.Xl,
    view: ListItemDropdownMenuItemNormalView = ListItemDropdownMenuItemNormalView.Default,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle = resolve(size, view).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для dropdown-menu-item-tight
 */
public fun ListItemStyles.DropdownMenuItemTight.resolve(
    size: ListItemDropdownMenuItemTightSize =
        ListItemDropdownMenuItemTightSize.Xl,
    view: ListItemDropdownMenuItemTightView =
        ListItemDropdownMenuItemTightView.Default,
): ListItemStyles = when {
    size == ListItemDropdownMenuItemTightSize.Xl && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightXlDefault
    size == ListItemDropdownMenuItemTightSize.Xl && view ==
        ListItemDropdownMenuItemTightView.Positive -> ListItemStyles.DropdownMenuItemTightXlPositive
    size == ListItemDropdownMenuItemTightSize.Xl && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightXlNegative
    size == ListItemDropdownMenuItemTightSize.L && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightLDefault
    size == ListItemDropdownMenuItemTightSize.L && view ==
        ListItemDropdownMenuItemTightView.Positive -> ListItemStyles.DropdownMenuItemTightLPositive
    size == ListItemDropdownMenuItemTightSize.L && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightLNegative
    size == ListItemDropdownMenuItemTightSize.M && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightMDefault
    size == ListItemDropdownMenuItemTightSize.M && view ==
        ListItemDropdownMenuItemTightView.Positive -> ListItemStyles.DropdownMenuItemTightMPositive
    size == ListItemDropdownMenuItemTightSize.M && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightMNegative
    size == ListItemDropdownMenuItemTightSize.S && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightSDefault
    size == ListItemDropdownMenuItemTightSize.S && view ==
        ListItemDropdownMenuItemTightView.Positive -> ListItemStyles.DropdownMenuItemTightSPositive
    size == ListItemDropdownMenuItemTightSize.S && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightSNegative
    size == ListItemDropdownMenuItemTightSize.Xs && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightXsDefault
    size == ListItemDropdownMenuItemTightSize.Xs && view ==
        ListItemDropdownMenuItemTightView.Positive -> ListItemStyles.DropdownMenuItemTightXsPositive
    size == ListItemDropdownMenuItemTightSize.Xs && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightXsNegative
    else -> error("Unsupported dropdown-menu-item-tight style combination")
}

/**
 * Возвращает [ListItemStyle] для dropdown-menu-item-tight
 */
@Composable
public fun ListItemStyles.DropdownMenuItemTight.style(
    size: ListItemDropdownMenuItemTightSize = ListItemDropdownMenuItemTightSize.Xl,
    view: ListItemDropdownMenuItemTightView = ListItemDropdownMenuItemTightView.Default,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle = resolve(size, view).style(modify)
