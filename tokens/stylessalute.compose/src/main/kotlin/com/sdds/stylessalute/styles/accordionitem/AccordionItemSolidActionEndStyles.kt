// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.accordionitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AccordionIconPlacement
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.AccordionItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
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
public interface WrapperAccordionItemSolidActionEnd :
    BuilderWrapper<AccordionItemStyle, AccordionItemStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndXs(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndS(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndM(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndL(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndH2(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndH3(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndH4(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionItemSolidActionEndH5(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionEnd

private val AccordionItemStyleBuilder.invariantProps: AccordionItemStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
            titleColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            contentTextColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .iconPlacement(AccordionIconPlacement.End)
        .iconRotation(90.0f)

public val AccordionItemSolidActionEnd.Xs: WrapperAccordionItemSolidActionEndXs
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndXs")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS)
        .titleStyle(StylesSaluteTheme.typography.bodyXsBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .dimensions {
            contentPaddingStart(12.0.dp)
            contentPaddingEnd(12.0.dp)
            contentPaddingBottom(10.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            iconPadding(10.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemSolidActionEndXs)

public val AccordionItemSolidActionEnd.S: WrapperAccordionItemSolidActionEndS
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndS")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.bodySBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodySNormal)
        .dimensions {
            contentPaddingStart(14.0.dp)
            contentPaddingEnd(14.0.dp)
            contentPaddingBottom(12.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            iconPadding(12.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemSolidActionEndS)

public val AccordionItemSolidActionEnd.M: WrapperAccordionItemSolidActionEndM
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndM")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .titleStyle(StylesSaluteTheme.typography.bodyMBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(18.0.dp)
            contentPaddingEnd(18.0.dp)
            contentPaddingBottom(16.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            iconPadding(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemSolidActionEndM)

public val AccordionItemSolidActionEnd.L: WrapperAccordionItemSolidActionEndL
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndL")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.bodyLBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(20.0.dp)
            contentPaddingEnd(20.0.dp)
            contentPaddingBottom(18.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            paddingTop(17.0.dp)
            paddingBottom(17.0.dp)
            iconPadding(16.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemSolidActionEndL)

public val AccordionItemSolidActionEnd.H2: WrapperAccordionItemSolidActionEndH2
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndH2")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.headerH2Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(20.0.dp)
            contentPaddingEnd(20.0.dp)
            contentPaddingBottom(20.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            iconPadding(16.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_24)
        .wrap(::WrapperAccordionItemSolidActionEndH2)

public val AccordionItemSolidActionEnd.H3: WrapperAccordionItemSolidActionEndH3
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndH3")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .titleStyle(StylesSaluteTheme.typography.headerH3Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(18.0.dp)
            contentPaddingEnd(18.0.dp)
            contentPaddingBottom(18.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            iconPadding(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_24)
        .wrap(::WrapperAccordionItemSolidActionEndH3)

public val AccordionItemSolidActionEnd.H4: WrapperAccordionItemSolidActionEndH4
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndH4")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.headerH4Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(14.0.dp)
            contentPaddingEnd(14.0.dp)
            contentPaddingBottom(14.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            iconPadding(12.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemSolidActionEndH4)

public val AccordionItemSolidActionEnd.H5: WrapperAccordionItemSolidActionEndH5
    @Composable
    @JvmName("WrapperAccordionItemSolidActionEndH5")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS)
        .titleStyle(StylesSaluteTheme.typography.headerH5Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(12.0.dp)
            contentPaddingEnd(12.0.dp)
            contentPaddingBottom(12.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            iconPadding(10.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemSolidActionEndH5)
