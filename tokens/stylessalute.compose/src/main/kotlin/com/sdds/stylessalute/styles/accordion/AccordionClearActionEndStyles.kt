// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.accordion

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.AccordionStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.accordionitem.AccordionItemClearActionEnd
import com.sdds.stylessalute.styles.accordionitem.H2
import com.sdds.stylessalute.styles.accordionitem.H3
import com.sdds.stylessalute.styles.accordionitem.H4
import com.sdds.stylessalute.styles.accordionitem.H5
import com.sdds.stylessalute.styles.accordionitem.L
import com.sdds.stylessalute.styles.accordionitem.M
import com.sdds.stylessalute.styles.accordionitem.S
import com.sdds.stylessalute.styles.accordionitem.Xs
import com.sdds.stylessalute.styles.divider.Default
import com.sdds.stylessalute.styles.divider.Divider
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAccordionClearActionEnd :
    BuilderWrapper<AccordionStyle, AccordionStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAccordionClearActionEndXs(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAccordionClearActionEndS(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAccordionClearActionEndM(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAccordionClearActionEndL(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAccordionClearActionEndH2(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAccordionClearActionEndH3(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAccordionClearActionEndH4(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAccordionClearActionEndH5(
    public override val builder: AccordionStyleBuilder,
) : WrapperAccordionClearActionEnd

private val AccordionStyleBuilder.invariantProps: AccordionStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())

public val AccordionClearActionEnd.Xs: WrapperAccordionClearActionEndXs
    @Composable
    @JvmName("WrapperAccordionClearActionEndXs")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.Xs.style())
        .dimensions {
            itemSpacing(4.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndXs)

public val AccordionClearActionEnd.S: WrapperAccordionClearActionEndS
    @Composable
    @JvmName("WrapperAccordionClearActionEndS")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.S.style())
        .dimensions {
            itemSpacing(6.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndS)

public val AccordionClearActionEnd.M: WrapperAccordionClearActionEndM
    @Composable
    @JvmName("WrapperAccordionClearActionEndM")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.M.style())
        .dimensions {
            itemSpacing(8.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndM)

public val AccordionClearActionEnd.L: WrapperAccordionClearActionEndL
    @Composable
    @JvmName("WrapperAccordionClearActionEndL")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.L.style())
        .dimensions {
            itemSpacing(10.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndL)

public val AccordionClearActionEnd.H2: WrapperAccordionClearActionEndH2
    @Composable
    @JvmName("WrapperAccordionClearActionEndH2")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.H2.style())
        .dimensions {
            itemSpacing(16.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndH2)

public val AccordionClearActionEnd.H3: WrapperAccordionClearActionEndH3
    @Composable
    @JvmName("WrapperAccordionClearActionEndH3")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.H3.style())
        .dimensions {
            itemSpacing(14.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndH3)

public val AccordionClearActionEnd.H4: WrapperAccordionClearActionEndH4
    @Composable
    @JvmName("WrapperAccordionClearActionEndH4")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.H4.style())
        .dimensions {
            itemSpacing(12.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndH4)

public val AccordionClearActionEnd.H5: WrapperAccordionClearActionEndH5
    @Composable
    @JvmName("WrapperAccordionClearActionEndH5")
    get() = AccordionStyle.builder(this)
        .invariantProps
        .accordionItemStyle(AccordionItemClearActionEnd.H5.style())
        .dimensions {
            itemSpacing(10.0.dp)
        }
        .wrap(::WrapperAccordionClearActionEndH5)
