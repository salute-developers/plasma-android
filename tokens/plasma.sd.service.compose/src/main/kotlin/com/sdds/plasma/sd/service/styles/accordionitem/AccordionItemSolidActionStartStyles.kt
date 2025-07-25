// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.accordionitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AccordionIconPlacement
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.AccordionItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
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
public interface WrapperAccordionItemSolidActionStart :
    BuilderWrapper<AccordionItemStyle, AccordionItemStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartXs(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartS(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartM(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartL(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartH2(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartH3(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartH4(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionItemSolidActionStartH5(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemSolidActionStart

private val AccordionItemStyleBuilder.invariantProps: AccordionItemStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
            titleColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
            contentTextColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .dimensions {
            iconPadding(4.0.dp)
        }
        .iconPlacement(AccordionIconPlacement.Start)
        .iconRotation(180.0f)

public val AccordionItemSolidActionStart.Xs: WrapperAccordionItemSolidActionStartXs
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartXs")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .titleStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            contentPaddingStart(32.0.dp)
            contentPaddingEnd(12.0.dp)
            contentPaddingBottom(10.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemSolidActionStartXs)

public val AccordionItemSolidActionStart.S: WrapperAccordionItemSolidActionStartS
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartS")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaSdServiceTheme.typography.bodySBold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .dimensions {
            contentPaddingStart(36.0.dp)
            contentPaddingEnd(14.0.dp)
            contentPaddingBottom(12.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemSolidActionStartS)

public val AccordionItemSolidActionStart.M: WrapperAccordionItemSolidActionStartM
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartM")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .titleStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(40.0.dp)
            contentPaddingEnd(18.0.dp)
            contentPaddingBottom(16.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemSolidActionStartM)

public val AccordionItemSolidActionStart.L: WrapperAccordionItemSolidActionStartL
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartL")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(42.0.dp)
            contentPaddingEnd(20.0.dp)
            contentPaddingBottom(18.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            paddingTop(17.0.dp)
            paddingBottom(17.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemSolidActionStartL)

public val AccordionItemSolidActionStart.H2: WrapperAccordionItemSolidActionStartH2
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartH2")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaSdServiceTheme.typography.headerH2Bold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(52.0.dp)
            contentPaddingEnd(20.0.dp)
            contentPaddingBottom(20.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_24)
        .wrap(::WrapperAccordionItemSolidActionStartH2)

public val AccordionItemSolidActionStart.H3: WrapperAccordionItemSolidActionStartH3
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartH3")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .titleStyle(PlasmaSdServiceTheme.typography.headerH3Bold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(48.0.dp)
            contentPaddingEnd(18.0.dp)
            contentPaddingBottom(18.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_24)
        .wrap(::WrapperAccordionItemSolidActionStartH3)

public val AccordionItemSolidActionStart.H4: WrapperAccordionItemSolidActionStartH4
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartH4")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaSdServiceTheme.typography.headerH4Bold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(36.0.dp)
            contentPaddingEnd(14.0.dp)
            contentPaddingBottom(14.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemSolidActionStartH4)

public val AccordionItemSolidActionStart.H5: WrapperAccordionItemSolidActionStartH5
    @Composable
    @JvmName("WrapperAccordionItemSolidActionStartH5")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .titleStyle(PlasmaSdServiceTheme.typography.headerH5Bold)
        .contentTextStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(12.0.dp)
            contentPaddingEnd(12.0.dp)
            contentPaddingBottom(12.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemSolidActionStartH5)
