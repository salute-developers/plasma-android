// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ToolBarOrientation
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.ToolBarStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.divider.Default
import com.sdds.plasma.sd.service.styles.divider.Divider
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperToolBarHorizontal : BuilderWrapper<ToolBarStyle, ToolBarStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperToolBarHorizontalL(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

/**
 * Обертка для вариации LHasShadow
 */
@JvmInline
public value class WrapperToolBarHorizontalLHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperToolBarHorizontalM(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

/**
 * Обертка для вариации MHasShadow
 */
@JvmInline
public value class WrapperToolBarHorizontalMHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperToolBarHorizontalS(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

/**
 * Обертка для вариации SHasShadow
 */
@JvmInline
public value class WrapperToolBarHorizontalSHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperToolBarHorizontalXs(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

/**
 * Обертка для вариации XsHasShadow
 */
@JvmInline
public value class WrapperToolBarHorizontalXsHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarHorizontal

private val ToolBarStyleBuilder.invariantProps: ToolBarStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())
        .orientation(ToolBarOrientation.Horizontal)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }

public val ToolBarHorizontal.L: WrapperToolBarHorizontalL
    @Composable
    @JvmName("WrapperToolBarHorizontalL")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXl)
        .dimensions {
            sectionPadding(12.0.dp)
            dividerMargin(12.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .wrap(::WrapperToolBarHorizontalL)

public val WrapperToolBarHorizontalL.HasShadow: WrapperToolBarHorizontalLHasShadow
    @Composable
    @JvmName("WrapperToolBarHorizontalLHasShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarHorizontalLHasShadow)

public val ToolBarHorizontal.M: WrapperToolBarHorizontalM
    @Composable
    @JvmName("WrapperToolBarHorizontalM")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .dimensions {
            sectionPadding(10.0.dp)
            dividerMargin(10.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
        }
        .wrap(::WrapperToolBarHorizontalM)

public val WrapperToolBarHorizontalM.HasShadow: WrapperToolBarHorizontalMHasShadow
    @Composable
    @JvmName("WrapperToolBarHorizontalMHasShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarHorizontalMHasShadow)

public val ToolBarHorizontal.S: WrapperToolBarHorizontalS
    @Composable
    @JvmName("WrapperToolBarHorizontalS")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            sectionPadding(8.0.dp)
            dividerMargin(8.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
        }
        .wrap(::WrapperToolBarHorizontalS)

public val WrapperToolBarHorizontalS.HasShadow: WrapperToolBarHorizontalSHasShadow
    @Composable
    @JvmName("WrapperToolBarHorizontalSHasShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarHorizontalSHasShadow)

public val ToolBarHorizontal.Xs: WrapperToolBarHorizontalXs
    @Composable
    @JvmName("WrapperToolBarHorizontalXs")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .dimensions {
            sectionPadding(8.0.dp)
            dividerMargin(6.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
        }
        .wrap(::WrapperToolBarHorizontalXs)

public val WrapperToolBarHorizontalXs.HasShadow: WrapperToolBarHorizontalXsHasShadow
    @Composable
    @JvmName("WrapperToolBarHorizontalXsHasShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarHorizontalXsHasShadow)
