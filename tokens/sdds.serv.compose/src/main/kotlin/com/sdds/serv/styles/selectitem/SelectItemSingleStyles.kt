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
public interface WrapperSelectItemSingle : BuilderWrapper<SelectItemStyle, SelectItemStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectItemSingleXl(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingle

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectItemSingleL(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingle

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectItemSingleM(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingle

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectItemSingleS(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingle

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectItemSingleXs(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingle

private val SelectItemStyleBuilder.invariantProps: SelectItemStyleBuilder
    @Composable
    get() = this
        .itemType(SelectItemType.Single)
        .colors {
            iconColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
        }

public val SelectItemSingle.Xl: WrapperSelectItemSingleXl
    @Composable
    @JvmName("WrapperSelectItemSingleXl")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.L.style())
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(20.0.dp)
            controlMargin(8.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemSingleXl)

public val SelectItemSingle.L: WrapperSelectItemSingleL
    @Composable
    @JvmName("WrapperSelectItemSingleL")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.L.style())
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemSingleL)

public val SelectItemSingle.M: WrapperSelectItemSingleM
    @Composable
    @JvmName("WrapperSelectItemSingleM")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.M.style())
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemSingleM)

public val SelectItemSingle.S: WrapperSelectItemSingleS
    @Composable
    @JvmName("WrapperSelectItemSingleS")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.S.style())
        .dimensions {
            paddingStart(10.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemSingleS)

public val SelectItemSingle.Xs: WrapperSelectItemSingleXs
    @Composable
    @JvmName("WrapperSelectItemSingleXs")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .icon(com.sdds.icons.R.drawable.ic_done_16)
        .cellStyle(Cell.Xs.style())
        .dimensions {
            paddingStart(6.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(4.0.dp)
            controlSize(16.0.dp)
        }
        .wrap(::WrapperSelectItemSingleXs)
