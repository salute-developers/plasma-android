// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.listitem

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
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuItemTight : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperDropdownMenuItemTightView : WrapperDropdownMenuItemTight

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperDropdownMenuItemTightTerminate(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTight

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuItemTightXl(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuItemTightL(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuItemTightM(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuItemTightS(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuItemTightXs(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

public val WrapperDropdownMenuItemTightView.Default: WrapperDropdownMenuItemTightTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

public val WrapperDropdownMenuItemTightView.Positive: WrapperDropdownMenuItemTightTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

public val WrapperDropdownMenuItemTightView.Negative: WrapperDropdownMenuItemTightTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            disclosureIconColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val DropdownMenuItemTight.Xl: WrapperDropdownMenuItemTightXl
    @Composable
    @JvmName("WrapperDropdownMenuItemTightXl")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .titleStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(56.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightXl)

public val DropdownMenuItemTight.L: WrapperDropdownMenuItemTightL
    @Composable
    @JvmName("WrapperDropdownMenuItemTightL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(48.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightL)

public val DropdownMenuItemTight.M: WrapperDropdownMenuItemTightM
    @Composable
    @JvmName("WrapperDropdownMenuItemTightM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .titleStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(40.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightM)

public val DropdownMenuItemTight.S: WrapperDropdownMenuItemTightS
    @Composable
    @JvmName("WrapperDropdownMenuItemTightS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(7.0.dp)
            paddingBottom(7.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightS)

public val DropdownMenuItemTight.Xs: WrapperDropdownMenuItemTightXs
    @Composable
    @JvmName("WrapperDropdownMenuItemTightXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .titleStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(24.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightXs)
