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
import com.sdds.serv.styles.checkbox.CheckBox
import com.sdds.serv.styles.checkbox.Default
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.S
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelectItemMultipleNormal :
    BuilderWrapper<SelectItemStyle, SelectItemStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectItemMultipleNormalXl(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultipleNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectItemMultipleNormalL(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultipleNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectItemMultipleNormalM(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultipleNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectItemMultipleNormalS(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultipleNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectItemMultipleNormalXs(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemMultipleNormal

private val SelectItemStyleBuilder.invariantProps: SelectItemStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .itemType(SelectItemType.Multiple)
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }

public val SelectItemMultipleNormal.Xl: WrapperSelectItemMultipleNormalXl
    @Composable
    @JvmName("WrapperSelectItemMultipleNormalXl")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
        .cellStyle(Cell.L.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(20.0.dp)
            controlMargin(8.0.dp)
            controlSize(24.0.dp)
            height(64.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleNormalXl)

public val SelectItemMultipleNormal.L: WrapperSelectItemMultipleNormalL
    @Composable
    @JvmName("WrapperSelectItemMultipleNormalL")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .cellStyle(Cell.L.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(56.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleNormalL)

public val SelectItemMultipleNormal.M: WrapperSelectItemMultipleNormalM
    @Composable
    @JvmName("WrapperSelectItemMultipleNormalM")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .cellStyle(Cell.M.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(48.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleNormalM)

public val SelectItemMultipleNormal.S: WrapperSelectItemMultipleNormalS
    @Composable
    @JvmName("WrapperSelectItemMultipleNormalS")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .cellStyle(Cell.S.style())
        .checkboxStyle(CheckBox.M.Default.style())
        .dimensions {
            paddingStart(10.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(40.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleNormalS)

public val SelectItemMultipleNormal.Xs: WrapperSelectItemMultipleNormalXs
    @Composable
    @JvmName("WrapperSelectItemMultipleNormalXs")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .cellStyle(Cell.Xs.style())
        .checkboxStyle(CheckBox.S.Default.style())
        .dimensions {
            paddingStart(6.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(4.0.dp)
            controlSize(16.0.dp)
            height(32.0.dp)
        }
        .wrap(::WrapperSelectItemMultipleNormalXs)
