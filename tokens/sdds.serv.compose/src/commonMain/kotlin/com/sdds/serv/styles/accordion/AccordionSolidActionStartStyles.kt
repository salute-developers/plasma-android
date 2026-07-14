// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.accordion

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.AccordionStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.accordionitem.AccordionItemSolidActionStart
import com.sdds.serv.styles.accordionitem.H2
import com.sdds.serv.styles.accordionitem.H3
import com.sdds.serv.styles.accordionitem.H4
import com.sdds.serv.styles.accordionitem.H5
import com.sdds.serv.styles.accordionitem.L
import com.sdds.serv.styles.accordionitem.M
import com.sdds.serv.styles.accordionitem.S
import com.sdds.serv.styles.accordionitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAccordionSolidActionStart :
    BuilderWrapper<AccordionStyle, AccordionStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionSolidActionStartXs(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionSolidActionStartS(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionSolidActionStartM(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionSolidActionStartL(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionSolidActionStartH2(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionSolidActionStartH3(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionSolidActionStartH4(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionSolidActionStartH5(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionStart

private val AccordionStyleBuilder.invariantProps: AccordionStyleBuilder
    @Composable
    get() = this
        .dimensions {
            itemSpacing(2.0.dp)
        }

public val AccordionSolidActionStart.Xs: WrapperAccordionSolidActionStartXs
    @Composable
    @JvmName("WrapperAccordionSolidActionStartXs")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.Xs.style())
        .wrap(::WrapperAccordionSolidActionStartXs)

public val AccordionSolidActionStart.S: WrapperAccordionSolidActionStartS
    @Composable
    @JvmName("WrapperAccordionSolidActionStartS")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.S.style())
        .wrap(::WrapperAccordionSolidActionStartS)

public val AccordionSolidActionStart.M: WrapperAccordionSolidActionStartM
    @Composable
    @JvmName("WrapperAccordionSolidActionStartM")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.M.style())
        .wrap(::WrapperAccordionSolidActionStartM)

public val AccordionSolidActionStart.L: WrapperAccordionSolidActionStartL
    @Composable
    @JvmName("WrapperAccordionSolidActionStartL")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.L.style())
        .wrap(::WrapperAccordionSolidActionStartL)

public val AccordionSolidActionStart.H2: WrapperAccordionSolidActionStartH2
    @Composable
    @JvmName("WrapperAccordionSolidActionStartH2")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.H2.style())
        .wrap(::WrapperAccordionSolidActionStartH2)

public val AccordionSolidActionStart.H3: WrapperAccordionSolidActionStartH3
    @Composable
    @JvmName("WrapperAccordionSolidActionStartH3")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.H3.style())
        .wrap(::WrapperAccordionSolidActionStartH3)

public val AccordionSolidActionStart.H4: WrapperAccordionSolidActionStartH4
    @Composable
    @JvmName("WrapperAccordionSolidActionStartH4")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.H4.style())
        .wrap(::WrapperAccordionSolidActionStartH4)

public val AccordionSolidActionStart.H5: WrapperAccordionSolidActionStartH5
    @Composable
    @JvmName("WrapperAccordionSolidActionStartH5")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionStart.H5.style())
        .wrap(::WrapperAccordionSolidActionStartH5)
