// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.accordion

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.AccordionStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemClearActionStart
import com.sdds.plasma.giga.styles.accordionitem.H2
import com.sdds.plasma.giga.styles.accordionitem.H3
import com.sdds.plasma.giga.styles.accordionitem.H4
import com.sdds.plasma.giga.styles.accordionitem.H5
import com.sdds.plasma.giga.styles.accordionitem.L
import com.sdds.plasma.giga.styles.accordionitem.M
import com.sdds.plasma.giga.styles.accordionitem.S
import com.sdds.plasma.giga.styles.accordionitem.Xs
import com.sdds.plasma.giga.styles.divider.Default
import com.sdds.plasma.giga.styles.divider.Divider
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAccordionClearActionStart :
    BuilderWrapper<AccordionStyle, AccordionStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionClearActionStartXs(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionClearActionStartS(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionClearActionStartM(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionClearActionStartL(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionClearActionStartH2(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionClearActionStartH3(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionClearActionStartH4(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionClearActionStartH5(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionStart

private val AccordionStyleBuilder.invariantProps: AccordionStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())

public val AccordionClearActionStart.Xs: WrapperAccordionClearActionStartXs
    @Composable
    @JvmName("WrapperAccordionClearActionStartXs")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.Xs.style())
        .dimensions {
            itemSpacing(4.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartXs)

public val AccordionClearActionStart.S: WrapperAccordionClearActionStartS
    @Composable
    @JvmName("WrapperAccordionClearActionStartS")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.S.style())
        .dimensions {
            itemSpacing(6.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartS)

public val AccordionClearActionStart.M: WrapperAccordionClearActionStartM
    @Composable
    @JvmName("WrapperAccordionClearActionStartM")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.M.style())
        .dimensions {
            itemSpacing(8.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartM)

public val AccordionClearActionStart.L: WrapperAccordionClearActionStartL
    @Composable
    @JvmName("WrapperAccordionClearActionStartL")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.L.style())
        .dimensions {
            itemSpacing(10.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartL)

public val AccordionClearActionStart.H2: WrapperAccordionClearActionStartH2
    @Composable
    @JvmName("WrapperAccordionClearActionStartH2")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.H2.style())
        .dimensions {
            itemSpacing(16.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartH2)

public val AccordionClearActionStart.H3: WrapperAccordionClearActionStartH3
    @Composable
    @JvmName("WrapperAccordionClearActionStartH3")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.H3.style())
        .dimensions {
            itemSpacing(14.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartH3)

public val AccordionClearActionStart.H4: WrapperAccordionClearActionStartH4
    @Composable
    @JvmName("WrapperAccordionClearActionStartH4")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.H4.style())
        .dimensions {
            itemSpacing(12.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartH4)

public val AccordionClearActionStart.H5: WrapperAccordionClearActionStartH5
    @Composable
    @JvmName("WrapperAccordionClearActionStartH5")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionStart.H5.style())
        .dimensions {
            itemSpacing(10.0.dp)
        }
        .wrap(::WrapperAccordionClearActionStartH5)
