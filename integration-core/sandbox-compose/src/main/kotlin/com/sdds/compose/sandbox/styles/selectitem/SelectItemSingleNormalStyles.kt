// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.selectitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.cell.Cell
import com.sdds.compose.sandbox.styles.cell.L
import com.sdds.compose.sandbox.styles.cell.M
import com.sdds.compose.sandbox.styles.cell.S
import com.sdds.compose.sandbox.styles.cell.Xs
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectItemStyleBuilder
import com.sdds.compose.uikit.SelectItemType
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelectItemSingleNormal :
    BuilderWrapper<SelectItemStyle, SelectItemStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSelectItemSingleNormalXl(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectItemSingleNormalL(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectItemSingleNormalM(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectItemSingleNormalS(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectItemSingleNormalXs(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItemSingleNormal

private val SelectItemStyleBuilder.invariantProps: SelectItemStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .itemType(SelectItemType.Single)
        .colors {
            iconColor(
                SddsSandboxTheme.colors.textDefaultAccent.asInteractive(),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
        }

public val SelectItemSingleNormal.Xl: WrapperSelectItemSingleNormalXl
    @Composable
    @JvmName("WrapperSelectItemSingleNormalXl")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL)
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.L.style())
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(20.0.dp)
            controlMargin(8.0.dp)
            controlSize(24.0.dp)
            height(64.0.dp)
        }
        .wrap(::WrapperSelectItemSingleNormalXl)

public val SelectItemSingleNormal.L: WrapperSelectItemSingleNormalL
    @Composable
    @JvmName("WrapperSelectItemSingleNormalL")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.L.style())
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(56.0.dp)
        }
        .wrap(::WrapperSelectItemSingleNormalL)

public val SelectItemSingleNormal.M: WrapperSelectItemSingleNormalM
    @Composable
    @JvmName("WrapperSelectItemSingleNormalM")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM)
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.M.style())
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(48.0.dp)
        }
        .wrap(::WrapperSelectItemSingleNormalM)

public val SelectItemSingleNormal.S: WrapperSelectItemSingleNormalS
    @Composable
    @JvmName("WrapperSelectItemSingleNormalS")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(Cell.S.style())
        .dimensions {
            paddingStart(10.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(6.0.dp)
            controlSize(24.0.dp)
            height(40.0.dp)
        }
        .wrap(::WrapperSelectItemSingleNormalS)

public val SelectItemSingleNormal.Xs: WrapperSelectItemSingleNormalXs
    @Composable
    @JvmName("WrapperSelectItemSingleNormalXs")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundS)
        .icon(com.sdds.icons.R.drawable.ic_done_16)
        .cellStyle(Cell.Xs.style())
        .dimensions {
            paddingStart(6.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            controlMargin(4.0.dp)
            controlSize(16.0.dp)
            height(32.0.dp)
        }
        .wrap(::WrapperSelectItemSingleNormalXs)
