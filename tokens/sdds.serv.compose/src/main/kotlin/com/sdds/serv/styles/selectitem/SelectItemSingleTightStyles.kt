// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.selectitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectItemStyleBuilder
import com.sdds.compose.uikit.SelectItemType
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.cell.Cell
import com.sdds.serv.styles.cell.L
import com.sdds.serv.styles.cell.M
import com.sdds.serv.styles.cell.S
import com.sdds.serv.styles.cell.Xs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelectItemSingleTight :
    BuilderWrapper<SelectItemStyle, SelectItemStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectItemSingleTightXl(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectItemSingleTightL(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectItemSingleTightM(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectItemSingleTightS(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectItemSingleTightXs(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleTight

private val SelectItemStyleBuilder.invariantProps: SelectItemStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .itemType(SelectItemType.Single)
        .colors {
            iconColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }

public val SelectItemSingleTight.Xl: WrapperSelectItemSingleTightXl
    @Composable
    @JvmName("WrapperSelectItemSingleTightXl")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.L.style())
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            controlMargin(8.0.dp)
            controlSize(24.0.dp)
            height(56.0.dp)
        }
        .wrap(::WrapperSelectItemSingleTightXl)

public val SelectItemSingleTight.L: WrapperSelectItemSingleTightL
    @Composable
    @JvmName("WrapperSelectItemSingleTightL")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.L.style())
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(48.0.dp)
        }
        .wrap(::WrapperSelectItemSingleTightL)

public val SelectItemSingleTight.M: WrapperSelectItemSingleTightM
    @Composable
    @JvmName("WrapperSelectItemSingleTightM")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.M.style())
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(40.0.dp)
        }
        .wrap(::WrapperSelectItemSingleTightM)

public val SelectItemSingleTight.S: WrapperSelectItemSingleTightS
    @Composable
    @JvmName("WrapperSelectItemSingleTightS")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.S.style())
        .dimensions {
            paddingStart(10.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(7.0.dp)
            paddingBottom(7.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(32.0.dp)
        }
        .wrap(::WrapperSelectItemSingleTightS)

public val SelectItemSingleTight.Xs: WrapperSelectItemSingleTightXs
    @Composable
    @JvmName("WrapperSelectItemSingleTightXs")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .icon(com.sdds.icons.R.drawable.ic_done_16)
        .cellStyle(Cell.Xs.style())
        .dimensions {
            paddingStart(6.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            controlMargin(4.0.dp)
            controlSize(16.0.dp)
            height(24.0.dp)
        }
        .wrap(::WrapperSelectItemSingleTightXs)
