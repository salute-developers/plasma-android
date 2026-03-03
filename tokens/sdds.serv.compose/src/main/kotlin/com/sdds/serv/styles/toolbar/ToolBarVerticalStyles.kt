// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.toolbar

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
import com.sdds.serv.styles.divider.Default
import com.sdds.serv.styles.divider.Divider
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperToolBarVertical : BuilderWrapper<ToolBarStyle, ToolBarStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperToolBarVerticalL(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

/**
 * Обертка для вариации LHasShadow
 */
@JvmInline
public value class WrapperToolBarVerticalLHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperToolBarVerticalM(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

/**
 * Обертка для вариации MHasShadow
 */
@JvmInline
public value class WrapperToolBarVerticalMHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperToolBarVerticalS(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

/**
 * Обертка для вариации SHasShadow
 */
@JvmInline
public value class WrapperToolBarVerticalSHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperToolBarVerticalXs(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

/**
 * Обертка для вариации XsHasShadow
 */
@JvmInline
public value class WrapperToolBarVerticalXsHasShadow(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBarVertical

private val ToolBarStyleBuilder.invariantProps: ToolBarStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())
        .orientation(ToolBarOrientation.Vertical)
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }

public val ToolBarVertical.L: WrapperToolBarVerticalL
    @Composable
    @JvmName("WrapperToolBarVerticalL")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXl)
        .dimensions {
            sectionPadding(12.0.dp)
            dividerMargin(12.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .wrap(::WrapperToolBarVerticalL)

public val WrapperToolBarVerticalL.HasShadow: WrapperToolBarVerticalLHasShadow
    @Composable
    @JvmName("WrapperToolBarVerticalLHasShadow")
    get() = builder
        .shadow(SddsServTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarVerticalLHasShadow)

public val ToolBarVertical.M: WrapperToolBarVerticalM
    @Composable
    @JvmName("WrapperToolBarVerticalM")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
        .dimensions {
            sectionPadding(10.0.dp)
            dividerMargin(10.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
        }
        .wrap(::WrapperToolBarVerticalM)

public val WrapperToolBarVerticalM.HasShadow: WrapperToolBarVerticalMHasShadow
    @Composable
    @JvmName("WrapperToolBarVerticalMHasShadow")
    get() = builder
        .shadow(SddsServTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarVerticalMHasShadow)

public val ToolBarVertical.S: WrapperToolBarVerticalS
    @Composable
    @JvmName("WrapperToolBarVerticalS")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            sectionPadding(8.0.dp)
            dividerMargin(8.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
        }
        .wrap(::WrapperToolBarVerticalS)

public val WrapperToolBarVerticalS.HasShadow: WrapperToolBarVerticalSHasShadow
    @Composable
    @JvmName("WrapperToolBarVerticalSHasShadow")
    get() = builder
        .shadow(SddsServTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarVerticalSHasShadow)

public val ToolBarVertical.Xs: WrapperToolBarVerticalXs
    @Composable
    @JvmName("WrapperToolBarVerticalXs")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .dimensions {
            sectionPadding(8.0.dp)
            dividerMargin(6.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
        }
        .wrap(::WrapperToolBarVerticalXs)

public val WrapperToolBarVerticalXs.HasShadow: WrapperToolBarVerticalXsHasShadow
    @Composable
    @JvmName("WrapperToolBarVerticalXsHasShadow")
    get() = builder
        .shadow(SddsServTheme.shadows.downSoftS)
        .wrap(::WrapperToolBarVerticalXsHasShadow)
