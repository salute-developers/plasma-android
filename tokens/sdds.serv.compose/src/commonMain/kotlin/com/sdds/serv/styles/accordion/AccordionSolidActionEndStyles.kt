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
import com.sdds.serv.styles.accordionitem.AccordionItemSolidActionEnd
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
public interface WrapperAccordionSolidActionEnd :
    BuilderWrapper<AccordionStyle, AccordionStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionSolidActionEndXs(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionSolidActionEndS(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionSolidActionEndM(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionSolidActionEndL(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionSolidActionEndH2(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionSolidActionEndH3(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionSolidActionEndH4(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionSolidActionEndH5(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionSolidActionEnd

private val AccordionStyleBuilder.invariantProps: AccordionStyleBuilder
    @Composable
    get() = this
        .dimensions {
            itemSpacing(2.0.dp)
        }

public val AccordionSolidActionEnd.Xs: WrapperAccordionSolidActionEndXs
    @Composable
    @JvmName("WrapperAccordionSolidActionEndXs")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.Xs.style())
        .wrap(::WrapperAccordionSolidActionEndXs)

public val AccordionSolidActionEnd.S: WrapperAccordionSolidActionEndS
    @Composable
    @JvmName("WrapperAccordionSolidActionEndS")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.S.style())
        .wrap(::WrapperAccordionSolidActionEndS)

public val AccordionSolidActionEnd.M: WrapperAccordionSolidActionEndM
    @Composable
    @JvmName("WrapperAccordionSolidActionEndM")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.M.style())
        .wrap(::WrapperAccordionSolidActionEndM)

public val AccordionSolidActionEnd.L: WrapperAccordionSolidActionEndL
    @Composable
    @JvmName("WrapperAccordionSolidActionEndL")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.L.style())
        .wrap(::WrapperAccordionSolidActionEndL)

public val AccordionSolidActionEnd.H2: WrapperAccordionSolidActionEndH2
    @Composable
    @JvmName("WrapperAccordionSolidActionEndH2")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.H2.style())
        .wrap(::WrapperAccordionSolidActionEndH2)

public val AccordionSolidActionEnd.H3: WrapperAccordionSolidActionEndH3
    @Composable
    @JvmName("WrapperAccordionSolidActionEndH3")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.H3.style())
        .wrap(::WrapperAccordionSolidActionEndH3)

public val AccordionSolidActionEnd.H4: WrapperAccordionSolidActionEndH4
    @Composable
    @JvmName("WrapperAccordionSolidActionEndH4")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.H4.style())
        .wrap(::WrapperAccordionSolidActionEndH4)

public val AccordionSolidActionEnd.H5: WrapperAccordionSolidActionEndH5
    @Composable
    @JvmName("WrapperAccordionSolidActionEndH5")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemSolidActionEnd.H5.style())
        .wrap(::WrapperAccordionSolidActionEndH5)
