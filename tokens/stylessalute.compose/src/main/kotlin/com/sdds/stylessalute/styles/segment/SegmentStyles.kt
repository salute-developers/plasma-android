// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.segment

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
import com.sdds.stylessalute.styles.segmentitem.L
import com.sdds.stylessalute.styles.segmentitem.M
import com.sdds.stylessalute.styles.segmentitem.Pilled
import com.sdds.stylessalute.styles.segmentitem.Primary
import com.sdds.stylessalute.styles.segmentitem.S
import com.sdds.stylessalute.styles.segmentitem.Secondary
import com.sdds.stylessalute.styles.segmentitem.SegmentItem
import com.sdds.stylessalute.styles.segmentitem.Xs
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSegment : BuilderWrapper<SegmentStyle, SegmentStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperLView : WrapperSegment

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSegmentTerminate(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegment

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSegmentL(
    public override val builder: SegmentStyleBuilder,
) : WrapperLView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperLPilledView : WrapperLView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperSegmentLPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperLPilledView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperMView : WrapperSegment

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSegmentM(
    public override val builder: SegmentStyleBuilder,
) : WrapperMView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperMPilledView : WrapperMView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperSegmentMPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperMPilledView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSView : WrapperSegment

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSegmentS(
    public override val builder: SegmentStyleBuilder,
) : WrapperSView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSPilledView : WrapperSView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperSegmentSPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperSPilledView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperXsView : WrapperSegment

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSegmentXs(
    public override val builder: SegmentStyleBuilder,
) : WrapperXsView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperXsPilledView : WrapperXsView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperSegmentXsPilled(
    public override val builder: SegmentStyleBuilder,
) : WrapperXsPilledView

private val SegmentStyleBuilder.invariantProps: SegmentStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
        }

public val WrapperLView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperLViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperLView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperLViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.L: WrapperSegmentL
    @Composable
    @JvmName("WrapperSegmentL")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentL)

public val WrapperLPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperLPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperLPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperLPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.L.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentL.Pilled: WrapperSegmentLPilled
    @Composable
    @JvmName("WrapperSegmentLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentLPilled)

public val WrapperMView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperMViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperMView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperMViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.M: WrapperSegmentM
    @Composable
    @JvmName("WrapperSegmentM")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentM)

public val WrapperMPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperMPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperMPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperMPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.M.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentM.Pilled: WrapperSegmentMPilled
    @Composable
    @JvmName("WrapperSegmentMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentMPilled)

public val WrapperSView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.S: WrapperSegmentS
    @Composable
    @JvmName("WrapperSegmentS")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentS)

public val WrapperSPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperSPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.S.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentS.Pilled: WrapperSegmentSPilled
    @Composable
    @JvmName("WrapperSegmentSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentSPilled)

public val WrapperXsView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperXsViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperXsView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperXsViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val Segment.Xs: WrapperSegmentXs
    @Composable
    @JvmName("WrapperSegmentXs")
    get() = SegmentStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .dimensions {
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .wrap(::WrapperSegmentXs)

public val WrapperXsPilledView.Primary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperXsPilledViewPrimary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Pilled.Primary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperXsPilledView.Secondary: WrapperSegmentTerminate
    @Composable
    @JvmName("WrapperXsPilledViewSecondary")
    get() = builder
        .segmentItemStyle(SegmentItem.Xs.Pilled.Secondary.style())
        .wrap(::WrapperSegmentTerminate)

public val WrapperSegmentXs.Pilled: WrapperSegmentXsPilled
    @Composable
    @JvmName("WrapperSegmentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperSegmentXsPilled)
