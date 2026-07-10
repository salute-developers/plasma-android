// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.accordionitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AccordionIconPlacement
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.AccordionItemStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
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
        .iconRotation(180.0f)
        .iconPlacement(AccordionIconPlacement.Start)
        .colors {
            titleColor(SddsServTheme.colors.textDefaultPrimary.asInteractive())
            contentTextColor(SddsServTheme.colors.textDefaultPrimary.asInteractive())
            iconColor(SddsServTheme.colors.textDefaultPrimary.asInteractive())
        }
        .dimensions {
            iconPadding(4.0.dp)
        }

public val AccordionItemClearActionStart.Xs: WrapperAccordionItemClearActionStartXs
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartXs")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyXsBold)
        .contentTextStyle(SddsServTheme.typography.bodyXsNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16))
        .dimensions {
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            contentPaddingStart(20.0.dp)
            contentPaddingBottom(8.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartXs)

public val AccordionItemClearActionStart.S: WrapperAccordionItemClearActionStartS
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartS")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodySBold)
        .contentTextStyle(SddsServTheme.typography.bodySNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16))
        .dimensions {
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(12.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartS)

public val AccordionItemClearActionStart.M: WrapperAccordionItemClearActionStartM
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartM")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyMBold)
        .contentTextStyle(SddsServTheme.typography.bodyMNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16))
        .dimensions {
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(14.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartM)

public val AccordionItemClearActionStart.L: WrapperAccordionItemClearActionStartL
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartL")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyLBold)
        .contentTextStyle(SddsServTheme.typography.bodyLNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16))
        .dimensions {
            paddingTop(17.0.dp)
            paddingBottom(17.0.dp)
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(16.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartL)

public val AccordionItemClearActionStart.H2: WrapperAccordionItemClearActionStartH2
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH2")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH2Bold)
        .contentTextStyle(SddsServTheme.typography.bodyLNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_24))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_24))
        .dimensions {
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            contentPaddingStart(32.0.dp)
            contentPaddingBottom(16.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartH2)

public val AccordionItemClearActionStart.H3: WrapperAccordionItemClearActionStartH3
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH3")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH3Bold)
        .contentTextStyle(SddsServTheme.typography.bodyLNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_24))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_24))
        .dimensions {
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            contentPaddingStart(30.0.dp)
            contentPaddingBottom(14.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartH3)

public val AccordionItemClearActionStart.H4: WrapperAccordionItemClearActionStartH4
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH4")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH4Bold)
        .contentTextStyle(SddsServTheme.typography.bodyMNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16))
        .dimensions {
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            contentPaddingStart(22.0.dp)
            contentPaddingBottom(12.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartH4)

public val AccordionItemClearActionStart.H5: WrapperAccordionItemClearActionStartH5
    @Composable
    @JvmName("WrapperAccordionItemClearActionStartH5")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH5Bold)
        .contentTextStyle(SddsServTheme.typography.bodyMNormal)
        .iconClosed(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_down_fill_16))
        .iconOpened(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_up_fill_16))
        .dimensions {
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            contentPaddingStart(20.0.dp)
            contentPaddingBottom(8.0.dp)
        }
        .wrap(::WrapperAccordionItemClearActionStartH5)
