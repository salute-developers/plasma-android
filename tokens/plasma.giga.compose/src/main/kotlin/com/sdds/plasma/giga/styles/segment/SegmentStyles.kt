// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.segment

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SegmentStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.segmentitem.Accent
import com.sdds.plasma.giga.styles.segmentitem.L
import com.sdds.plasma.giga.styles.segmentitem.M
import com.sdds.plasma.giga.styles.segmentitem.Pilled
import com.sdds.plasma.giga.styles.segmentitem.Primary
import com.sdds.plasma.giga.styles.segmentitem.S
import com.sdds.plasma.giga.styles.segmentitem.Secondary
import com.sdds.plasma.giga.styles.segmentitem.SegmentItem
import com.sdds.plasma.giga.styles.segmentitem.Xl
import com.sdds.plasma.giga.styles.segmentitem.Xs
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSegment : BuilderWrapper<SegmentStyle, SegmentStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации xl
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentXlView : WrapperSegment

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSegmentTerminate(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegment

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSegmentXl(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentXlView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentXlPilledView : WrapperSegmentXlView

/**
 * Обертка для вариации XlPilled
 */
@JvmInline
public value class WrapperSegmentXlPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentXlPilledView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentLView : WrapperSegment

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSegmentL(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentLView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentLPilledView : WrapperSegmentLView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperSegmentLPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentLPilledView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentMView : WrapperSegment

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSegmentM(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentMView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentMPilledView : WrapperSegmentMView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperSegmentMPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentMPilledView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentSView : WrapperSegment

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSegmentS(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentSView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentSPilledView : WrapperSegmentSView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperSegmentSPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentSPilledView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentXsView : WrapperSegment

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSegmentXs(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentXsView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentXsPilledView : WrapperSegmentXsView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperSegmentXsPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegmentXsPilledView

private val SegmentStyleBuilder.invariantProps: SegmentStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
        }

public val WrapperSegmentXlView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXlViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xl.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXlView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXlViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xl.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXlView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXlViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.Xl.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.Xl: WrapperSegmentXl
    @Composable
    @JvmName("WrapperSegmentXl")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundXl.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentXl)

public val WrapperSegmentXlPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXlPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xl.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXlPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXlPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xl.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXlPilledView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXlPilledViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.Xl.Pilled.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXl.Pilled: WrapperSegmentXlPilled
    @Composable
    @JvmName("WrapperSegmentXlPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentXlPilled)

public val WrapperSegmentLView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentLViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentLView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentLViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentLView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentLViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.L: WrapperSegmentL
    @Composable
    @JvmName("WrapperSegmentL")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentL)

public val WrapperSegmentLPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentLPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentLPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentLPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentLPilledView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentLPilledViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Pilled.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentL.Pilled: WrapperSegmentLPilled
    @Composable
    @JvmName("WrapperSegmentLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentLPilled)

public val WrapperSegmentMView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentMViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentMView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentMViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentMView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentMViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.M: WrapperSegmentM
    @Composable
    @JvmName("WrapperSegmentM")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM)
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentM)

public val WrapperSegmentMPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentMPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentMPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentMPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentMPilledView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentMPilledViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Pilled.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentM.Pilled: WrapperSegmentMPilled
    @Composable
    @JvmName("WrapperSegmentMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentMPilled)

public val WrapperSegmentSView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentSViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentSView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentSViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentSView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentSViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.S: WrapperSegmentS
    @Composable
    @JvmName("WrapperSegmentS")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentS)

public val WrapperSegmentSPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentSPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentSPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentSPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentSPilledView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentSPilledViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Pilled.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentS.Pilled: WrapperSegmentSPilled
    @Composable
    @JvmName("WrapperSegmentSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentSPilled)

public val WrapperSegmentXsView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXsViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXsView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXsViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXsView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXsViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.Xs: WrapperSegmentXs
    @Composable
    @JvmName("WrapperSegmentXs")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM)
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentXs)

public val WrapperSegmentXsPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXsPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXsPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXsPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXsPilledView.Accent: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSegmentXsPilledViewAccent")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Pilled.Accent.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXs.Pilled: WrapperSegmentXsPilled
    @Composable
    @JvmName("WrapperSegmentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentXsPilled)
