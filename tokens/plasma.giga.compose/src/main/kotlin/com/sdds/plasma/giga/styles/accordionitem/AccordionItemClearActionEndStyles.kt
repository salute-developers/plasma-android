// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.accordionitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AccordionIconPlacement
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.AccordionItemStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAccordionItemClearActionEnd :
    BuilderWrapper<AccordionItemStyle, AccordionItemStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndXs(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndS(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndM(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndL(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndH2(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndH3(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndH4(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionItemClearActionEndH5(
    public override val builder: AccordionItemStyleBuilder,
) : WrapperAccordionItemClearActionEnd

private val AccordionItemStyleBuilder.invariantProps: AccordionItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            contentTextColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .iconPlacement(AccordionIconPlacement.End)
        .iconRotation(90.0f)

public val AccordionItemClearActionEnd.Xs: WrapperAccordionItemClearActionEndXs
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndXs")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.bodyXsBold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .dimensions {
            contentPaddingBottom(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            iconPadding(10.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemClearActionEndXs)

public val AccordionItemClearActionEnd.S: WrapperAccordionItemClearActionEndS
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndS")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.bodySBold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodySNormal)
        .dimensions {
            contentPaddingBottom(12.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            iconPadding(12.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemClearActionEndS)

public val AccordionItemClearActionEnd.M: WrapperAccordionItemClearActionEndM
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndM")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.bodyMBold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingBottom(14.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            iconPadding(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemClearActionEndM)

public val AccordionItemClearActionEnd.L: WrapperAccordionItemClearActionEndL
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndL")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.bodyLBold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingBottom(16.0.dp)
            paddingTop(17.0.dp)
            paddingBottom(17.0.dp)
            iconPadding(16.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemClearActionEndL)

public val AccordionItemClearActionEnd.H2: WrapperAccordionItemClearActionEndH2
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndH2")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.headerH2Bold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingBottom(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            iconPadding(16.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_24)
        .wrap(::WrapperAccordionItemClearActionEndH2)

public val AccordionItemClearActionEnd.H3: WrapperAccordionItemClearActionEndH3
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndH3")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.headerH3Bold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .dimensions {
            contentPaddingBottom(14.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            iconPadding(14.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_24)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_24)
        .wrap(::WrapperAccordionItemClearActionEndH3)

public val AccordionItemClearActionEnd.H4: WrapperAccordionItemClearActionEndH4
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndH4")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.headerH4Bold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingBottom(12.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            iconPadding(12.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemClearActionEndH4)

public val AccordionItemClearActionEnd.H5: WrapperAccordionItemClearActionEndH5
    @Composable
    @JvmName("WrapperAccordionItemClearActionEndH5")
    get() = AccordionItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaGigaTheme.typography.headerH5Bold)
        .contentTextStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingBottom(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            iconPadding(10.0.dp)
        }
        .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
        .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
        .wrap(::WrapperAccordionItemClearActionEndH5)
