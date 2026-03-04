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
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.cell.Cell
import com.sdds.serv.styles.cell.L
import com.sdds.serv.styles.cell.M
import com.sdds.serv.styles.cell.S
import com.sdds.serv.styles.cell.Xs
import com.sdds.serv.styles.checkbox.CheckBox
import com.sdds.serv.styles.checkbox.Default
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.S
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelectItemMultiple : BuilderWrapper<SelectItemStyle, SelectItemStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectItemMultipleXl(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultiple

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectItemMultipleL(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultiple

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectItemMultipleM(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultiple

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectItemMultipleS(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultiple

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectItemMultipleXs(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultiple

private val SelectItemStyleBuilder.invariantProps: SelectItemStyleBuilder
    @Composable
    get() = this
        .itemType(SelectItemType.Multiple)

public val SelectItemMultiple.Xl: WrapperSelectItemMultipleXl
    @Composable
    @JvmName("WrapperSelectItemMultipleXl")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .cellStyle(Cell.L.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(20.0.dp)
            controlMargin(8.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleXl)

public val SelectItemMultiple.L: WrapperSelectItemMultipleL
    @Composable
    @JvmName("WrapperSelectItemMultipleL")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .cellStyle(Cell.L.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleL)

public val SelectItemMultiple.M: WrapperSelectItemMultipleM
    @Composable
    @JvmName("WrapperSelectItemMultipleM")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .cellStyle(Cell.M.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleM)

public val SelectItemMultiple.S: WrapperSelectItemMultipleS
    @Composable
    @JvmName("WrapperSelectItemMultipleS")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .cellStyle(Cell.S.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(10.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleS)

public val SelectItemMultiple.Xs: WrapperSelectItemMultipleXs
    @Composable
    @JvmName("WrapperSelectItemMultipleXs")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .cellStyle(Cell.Xs.style())
        .checkboxStyle(CheckBox.S.Default.style())
        .dimensions {
            paddingStart(6.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(4.0.dp)
            controlSize(16.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleXs)
