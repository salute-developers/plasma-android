// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента List
 */
public enum class ListStyles(
    public val key: String,
) {
    ListNormalXl("ListNormal.Xl"),
    ListNormalL("ListNormal.L"),
    ListNormalM("ListNormal.M"),
    ListNormalS("ListNormal.S"),
    ListNormalXs("ListNormal.Xs"),
    ListTightXl("ListTight.Xl"),
    ListTightL("ListTight.L"),
    ListTightM("ListTight.M"),
    ListTightS("ListTight.S"),
    ListTightXs("ListTight.Xs"),
    DropdownMenuListNormalXl("DropdownMenuListNormal.Xl"),
    DropdownMenuListNormalL("DropdownMenuListNormal.L"),
    DropdownMenuListNormalM("DropdownMenuListNormal.M"),
    DropdownMenuListNormalS("DropdownMenuListNormal.S"),
    DropdownMenuListNormalXs("DropdownMenuListNormal.Xs"),
    DropdownMenuListTightXl("DropdownMenuListTight.Xl"),
    DropdownMenuListTightL("DropdownMenuListTight.L"),
    DropdownMenuListTightM("DropdownMenuListTight.M"),
    DropdownMenuListTightS("DropdownMenuListTight.S"),
    DropdownMenuListTightXs("DropdownMenuListTight.Xs"),
    ;

    /**
     * Typed API для подбора стиля list-normal
     */
    public object Normal

    /**
     * Typed API для подбора стиля list-tight
     */
    public object Tight

    /**
     * Typed API для подбора стиля dropdown-menu-list-normal
     */
    public object DropdownMenuListNormal

    /**
     * Typed API для подбора стиля dropdown-menu-list-tight
     */
    public object DropdownMenuListTight
}

/**
 * Возможные значения свойства size для list-normal
 */
public enum class ListNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для list-tight
 */
public enum class ListTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для dropdown-menu-list-normal
 */
public enum class DropdownMenuListNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для dropdown-menu-list-tight
 */
public enum class DropdownMenuListTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [ListStyle] для [ListStyles]
 */
@Composable
public fun ListStyles.style(modify: @Composable ListStyleBuilder.() -> Unit = {}): ListStyle {
    val builder = when (this) {
        ListStyles.ListNormalXl -> ListNormal.Xl
        ListStyles.ListNormalL -> ListNormal.L
        ListStyles.ListNormalM -> ListNormal.M
        ListStyles.ListNormalS -> ListNormal.S
        ListStyles.ListNormalXs -> ListNormal.Xs
        ListStyles.ListTightXl -> ListTight.Xl
        ListStyles.ListTightL -> ListTight.L
        ListStyles.ListTightM -> ListTight.M
        ListStyles.ListTightS -> ListTight.S
        ListStyles.ListTightXs -> ListTight.Xs
        ListStyles.DropdownMenuListNormalXl -> DropdownMenuListNormal.Xl
        ListStyles.DropdownMenuListNormalL -> DropdownMenuListNormal.L
        ListStyles.DropdownMenuListNormalM -> DropdownMenuListNormal.M
        ListStyles.DropdownMenuListNormalS -> DropdownMenuListNormal.S
        ListStyles.DropdownMenuListNormalXs -> DropdownMenuListNormal.Xs
        ListStyles.DropdownMenuListTightXl -> DropdownMenuListTight.Xl
        ListStyles.DropdownMenuListTightL -> DropdownMenuListTight.L
        ListStyles.DropdownMenuListTightM -> DropdownMenuListTight.M
        ListStyles.DropdownMenuListTightS -> DropdownMenuListTight.S
        ListStyles.DropdownMenuListTightXs -> DropdownMenuListTight.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListStyles] для list-normal
 */
public fun ListStyles.Normal.resolve(size: ListNormalSize = ListNormalSize.Xl): ListStyles = when {
    size == ListNormalSize.Xl -> ListStyles.ListNormalXl
    size == ListNormalSize.L -> ListStyles.ListNormalL
    size == ListNormalSize.M -> ListStyles.ListNormalM
    size == ListNormalSize.S -> ListStyles.ListNormalS
    size == ListNormalSize.Xs -> ListStyles.ListNormalXs
    else -> error("Unsupported list-normal style combination")
}

/**
 * Возвращает [ListStyle] для list-normal
 */
@Composable
public fun ListStyles.Normal.style(
    size: ListNormalSize = ListNormalSize.Xl,
    modify: @Composable
    ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListStyles] для list-tight
 */
public fun ListStyles.Tight.resolve(size: ListTightSize = ListTightSize.Xl): ListStyles = when {
    size == ListTightSize.Xl -> ListStyles.ListTightXl
    size == ListTightSize.L -> ListStyles.ListTightL
    size == ListTightSize.M -> ListStyles.ListTightM
    size == ListTightSize.S -> ListStyles.ListTightS
    size == ListTightSize.Xs -> ListStyles.ListTightXs
    else -> error("Unsupported list-tight style combination")
}

/**
 * Возвращает [ListStyle] для list-tight
 */
@Composable
public fun ListStyles.Tight.style(
    size: ListTightSize = ListTightSize.Xl,
    modify: @Composable
    ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListStyles] для dropdown-menu-list-normal
 */
public fun ListStyles.DropdownMenuListNormal.resolve(
    size: DropdownMenuListNormalSize =
        DropdownMenuListNormalSize.Xl,
): ListStyles = when {
    size == DropdownMenuListNormalSize.Xl -> ListStyles.DropdownMenuListNormalXl
    size == DropdownMenuListNormalSize.L -> ListStyles.DropdownMenuListNormalL
    size == DropdownMenuListNormalSize.M -> ListStyles.DropdownMenuListNormalM
    size == DropdownMenuListNormalSize.S -> ListStyles.DropdownMenuListNormalS
    size == DropdownMenuListNormalSize.Xs -> ListStyles.DropdownMenuListNormalXs
    else -> error("Unsupported dropdown-menu-list-normal style combination")
}

/**
 * Возвращает [ListStyle] для dropdown-menu-list-normal
 */
@Composable
public fun ListStyles.DropdownMenuListNormal.style(
    size: DropdownMenuListNormalSize =
        DropdownMenuListNormalSize.Xl,
    modify: @Composable ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListStyles] для dropdown-menu-list-tight
 */
public fun ListStyles.DropdownMenuListTight.resolve(
    size: DropdownMenuListTightSize =
        DropdownMenuListTightSize.Xl,
): ListStyles = when {
    size == DropdownMenuListTightSize.Xl -> ListStyles.DropdownMenuListTightXl
    size == DropdownMenuListTightSize.L -> ListStyles.DropdownMenuListTightL
    size == DropdownMenuListTightSize.M -> ListStyles.DropdownMenuListTightM
    size == DropdownMenuListTightSize.S -> ListStyles.DropdownMenuListTightS
    size == DropdownMenuListTightSize.Xs -> ListStyles.DropdownMenuListTightXs
    else -> error("Unsupported dropdown-menu-list-tight style combination")
}

/**
 * Возвращает [ListStyle] для dropdown-menu-list-tight
 */
@Composable
public fun ListStyles.DropdownMenuListTight.style(
    size: DropdownMenuListTightSize =
        DropdownMenuListTightSize.Xl,
    modify: @Composable ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size).style(modify)
