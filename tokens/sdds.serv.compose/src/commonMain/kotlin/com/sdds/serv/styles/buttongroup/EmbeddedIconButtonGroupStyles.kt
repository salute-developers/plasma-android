// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.buttongroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.EmbeddedIconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperEmbeddedIconButtonGroup :
    BuilderWrapper<ButtonGroupStyle, ButtonGroupStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupXs(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации XsWide
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupXsWide(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации XsDense
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupXsDense(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации XsNoGap
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupXsNoGap(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupS(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации SWide
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupSWide(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации SDense
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupSDense(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации SNoGap
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupSNoGap(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupM(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации MWide
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupMWide(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации MDense
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupMDense(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации MNoGap
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupMNoGap(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupL(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации LWide
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupLWide(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации LDense
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupLDense(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

/**
 * Обертка для вариации LNoGap
 */
@JvmInline
public value class WrapperEmbeddedIconButtonGroupLNoGap(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperEmbeddedIconButtonGroup

private val ButtonGroupStyleBuilder.invariantProps: ButtonGroupStyleBuilder
    @Composable
    get() = this

public val EmbeddedIconButtonGroup.Xs: WrapperEmbeddedIconButtonGroupXs
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupXs")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.Xs.Default.style())
        .wrap(::WrapperEmbeddedIconButtonGroupXs)

public val WrapperEmbeddedIconButtonGroupXs.Wide: WrapperEmbeddedIconButtonGroupXsWide
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupXsWide")
    get() = builder
        .dimensions {
            spacing(6.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupXsWide)

public val WrapperEmbeddedIconButtonGroupXs.Dense: WrapperEmbeddedIconButtonGroupXsDense
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupXsDense")
    get() = builder
        .dimensions {
            spacing(2.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupXsDense)

public val WrapperEmbeddedIconButtonGroupXs.NoGap: WrapperEmbeddedIconButtonGroupXsNoGap
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupXsNoGap")
    get() = builder
        .dimensions {
            spacing(0.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupXsNoGap)

public val EmbeddedIconButtonGroup.S: WrapperEmbeddedIconButtonGroupS
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupS")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.S.Default.style())
        .wrap(::WrapperEmbeddedIconButtonGroupS)

public val WrapperEmbeddedIconButtonGroupS.Wide: WrapperEmbeddedIconButtonGroupSWide
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupSWide")
    get() = builder
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupSWide)

public val WrapperEmbeddedIconButtonGroupS.Dense: WrapperEmbeddedIconButtonGroupSDense
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupSDense")
    get() = builder
        .dimensions {
            spacing(2.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupSDense)

public val WrapperEmbeddedIconButtonGroupS.NoGap: WrapperEmbeddedIconButtonGroupSNoGap
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupSNoGap")
    get() = builder
        .dimensions {
            spacing(0.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupSNoGap)

public val EmbeddedIconButtonGroup.M: WrapperEmbeddedIconButtonGroupM
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupM")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.M.Default.style())
        .wrap(::WrapperEmbeddedIconButtonGroupM)

public val WrapperEmbeddedIconButtonGroupM.Wide: WrapperEmbeddedIconButtonGroupMWide
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupMWide")
    get() = builder
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupMWide)

public val WrapperEmbeddedIconButtonGroupM.Dense: WrapperEmbeddedIconButtonGroupMDense
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupMDense")
    get() = builder
        .dimensions {
            spacing(2.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupMDense)

public val WrapperEmbeddedIconButtonGroupM.NoGap: WrapperEmbeddedIconButtonGroupMNoGap
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupMNoGap")
    get() = builder
        .dimensions {
            spacing(0.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupMNoGap)

public val EmbeddedIconButtonGroup.L: WrapperEmbeddedIconButtonGroupL
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupL")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.L.Default.style())
        .wrap(::WrapperEmbeddedIconButtonGroupL)

public val WrapperEmbeddedIconButtonGroupL.Wide: WrapperEmbeddedIconButtonGroupLWide
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupLWide")
    get() = builder
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupLWide)

public val WrapperEmbeddedIconButtonGroupL.Dense: WrapperEmbeddedIconButtonGroupLDense
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupLDense")
    get() = builder
        .dimensions {
            spacing(2.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupLDense)

public val WrapperEmbeddedIconButtonGroupL.NoGap: WrapperEmbeddedIconButtonGroupLNoGap
    @Composable
    @JvmName("WrapperEmbeddedIconButtonGroupLNoGap")
    get() = builder
        .dimensions {
            spacing(0.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonGroupLNoGap)
