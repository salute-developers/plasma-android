// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuItemNormal : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperDropdownMenuItemNormalView : WrapperDropdownMenuItemNormal

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperDropdownMenuItemNormalTerminate(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuItemNormalL(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemNormalView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuItemNormalM(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemNormalView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuItemNormalS(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemNormalView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuItemNormalXs(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemNormalView

public val WrapperDropdownMenuItemNormalView.Default: WrapperDropdownMenuItemNormalTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperDropdownMenuItemNormalTerminate)

public val WrapperDropdownMenuItemNormalView.Positive: WrapperDropdownMenuItemNormalTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperDropdownMenuItemNormalTerminate)

public val WrapperDropdownMenuItemNormalView.Negative: WrapperDropdownMenuItemNormalTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperDropdownMenuItemNormalTerminate)

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            disclosureIconColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val DropdownMenuItemNormal.L: WrapperDropdownMenuItemNormalL
    @Composable
    @JvmName("WrapperDropdownMenuItemNormalL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.bodyLNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(56.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemNormalL)

public val DropdownMenuItemNormal.M: WrapperDropdownMenuItemNormalM
    @Composable
    @JvmName("WrapperDropdownMenuItemNormalM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .titleStyle(StylesSaluteTheme.typography.bodyMNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(48.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemNormalM)

public val DropdownMenuItemNormal.S: WrapperDropdownMenuItemNormalS
    @Composable
    @JvmName("WrapperDropdownMenuItemNormalS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.bodySNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(40.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemNormalS)

public val DropdownMenuItemNormal.Xs: WrapperDropdownMenuItemNormalXs
    @Composable
    @JvmName("WrapperDropdownMenuItemNormalXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS)
        .titleStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(32.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemNormalXs)
