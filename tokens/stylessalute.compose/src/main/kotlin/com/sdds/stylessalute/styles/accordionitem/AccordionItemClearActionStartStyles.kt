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
public interface WrapperAccordionItemClearActionStart :
    BuilderWrapper<AccordionItemStyle, AccordionItemStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartXs(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartS(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartM(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartL(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartH2(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartH3(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartH4(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionItemClearActionStartH5(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionStart

private val AccordionItemStyleBuilder.invariantProps: AccordionItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            contentTextColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .dimensions {
            iconPadding(4.0.dp)
        }
        .iconPlacement(AccordionIconPlacement.Start)
        .iconRotation(180.0f)

public val AccordionItemClearActionStart.Xs: WrapperAccordionItemClearActionStartXs
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartXs")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.bodyXsBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .dimensions {
            contentPaddingStart(20.0.dp)
            contentPaddingBottom(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemClearActionStartXs)

public val AccordionItemClearActionStart.S: WrapperAccordionItemClearActionStartS
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartS")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.bodySBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodySNormal)
        .dimensions {
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(12.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemClearActionStartS)

public val AccordionItemClearActionStart.M: WrapperAccordionItemClearActionStartM
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartM")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.bodyMBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(14.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemClearActionStartM)

public val AccordionItemClearActionStart.L: WrapperAccordionItemClearActionStartL
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartL")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.bodyLBold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(16.0.dp)
            paddingTop(17.0.dp)
            paddingBottom(17.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemClearActionStartL)

public val AccordionItemClearActionStart.H2: WrapperAccordionItemClearActionStartH2
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH2")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.headerH2Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(32.0.dp)
            contentPaddingBottom(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_24)
        .wrap(::WrapperAccordionItemClearActionStartH2)

public val AccordionItemClearActionStart.H3: WrapperAccordionItemClearActionStartH3
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH3")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.headerH3Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingStart(30.0.dp)
            contentPaddingBottom(14.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_24)
        .wrap(::WrapperAccordionItemClearActionStartH3)

public val AccordionItemClearActionStart.H4: WrapperAccordionItemClearActionStartH4
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH4")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.headerH4Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(12.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemClearActionStartH4)

public val AccordionItemClearActionStart.H5: WrapperAccordionItemClearActionStartH5
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH5")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(StylesSaluteTheme.typography.headerH5Bold)
        .contentTextStyle(StylesSaluteTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingStart(20.0.dp)
            contentPaddingBottom(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16)
        .wrap(::WrapperAccordionItemClearActionStartH5)
