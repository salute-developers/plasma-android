// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.chipgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.chip.Accent
import com.sdds.stylessalute.styles.chip.Chip
import com.sdds.stylessalute.styles.chip.Default
import com.sdds.stylessalute.styles.chip.L
import com.sdds.stylessalute.styles.chip.M
import com.sdds.stylessalute.styles.chip.Pilled
import com.sdds.stylessalute.styles.chip.S
import com.sdds.stylessalute.styles.chip.Secondary
import com.sdds.stylessalute.styles.chip.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperChipGroupWide : BuilderWrapper<ChipGroupStyle, ChipGroupStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideLView : WrapperChipGroupWide

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperChipGroupWideTerminate(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWide

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperChipGroupWideL(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideLView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideLPilledView : WrapperChipGroupWideLView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperChipGroupWideLPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideLPilledView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideMView : WrapperChipGroupWide

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperChipGroupWideM(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideMView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideMPilledView : WrapperChipGroupWideMView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperChipGroupWideMPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideMPilledView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideSView : WrapperChipGroupWide

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperChipGroupWideS(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideSView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideSPilledView : WrapperChipGroupWideSView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperChipGroupWideSPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideSPilledView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideXsView : WrapperChipGroupWide

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperChipGroupWideXs(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideXsView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupWideXsPilledView : WrapperChipGroupWideXsView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperChipGroupWideXsPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupWideXsPilledView

private val ChipGroupStyleBuilder.invariantProps: ChipGroupStyleBuilder
    @Composable
    get() = this
        .dimensions {
            gap(8.0.dp)
            lineSpacing(8.0.dp)
        }
        .disableAlpha(0.4f)

public val WrapperChipGroupWideLView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideLViewDefault")
    get() = builder
        .chipStyle(Chip.L.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideLView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideLViewAccent")
    get() = builder
        .chipStyle(Chip.L.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideLView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideLViewSecondary")
    get() = builder
        .chipStyle(Chip.L.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val ChipGroupWide.L: WrapperChipGroupWideL
    @Composable
    @JvmName("WrapperChipGroupWideL")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupWideL)

public val WrapperChipGroupWideLPilledView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideLPilledViewDefault")
    get() = builder
        .chipStyle(Chip.L.Pilled.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideLPilledView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideLPilledViewAccent")
    get() = builder
        .chipStyle(Chip.L.Pilled.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideLPilledView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideLPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.L.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideL.Pilled: WrapperChipGroupWideLPilled
    @Composable
    @JvmName("WrapperChipGroupWideLPilled")
    get() = builder
        .wrap(::WrapperChipGroupWideLPilled)

public val WrapperChipGroupWideMView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideMViewDefault")
    get() = builder
        .chipStyle(Chip.M.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideMView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideMViewAccent")
    get() = builder
        .chipStyle(Chip.M.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideMView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideMViewSecondary")
    get() = builder
        .chipStyle(Chip.M.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val ChipGroupWide.M: WrapperChipGroupWideM
    @Composable
    @JvmName("WrapperChipGroupWideM")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupWideM)

public val WrapperChipGroupWideMPilledView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideMPilledViewDefault")
    get() = builder
        .chipStyle(Chip.M.Pilled.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideMPilledView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideMPilledViewAccent")
    get() = builder
        .chipStyle(Chip.M.Pilled.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideMPilledView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideMPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.M.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideM.Pilled: WrapperChipGroupWideMPilled
    @Composable
    @JvmName("WrapperChipGroupWideMPilled")
    get() = builder
        .wrap(::WrapperChipGroupWideMPilled)

public val WrapperChipGroupWideSView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideSViewDefault")
    get() = builder
        .chipStyle(Chip.S.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideSView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideSViewAccent")
    get() = builder
        .chipStyle(Chip.S.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideSView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideSViewSecondary")
    get() = builder
        .chipStyle(Chip.S.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val ChipGroupWide.S: WrapperChipGroupWideS
    @Composable
    @JvmName("WrapperChipGroupWideS")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupWideS)

public val WrapperChipGroupWideSPilledView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideSPilledViewDefault")
    get() = builder
        .chipStyle(Chip.S.Pilled.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideSPilledView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideSPilledViewAccent")
    get() = builder
        .chipStyle(Chip.S.Pilled.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideSPilledView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideSPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.S.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideS.Pilled: WrapperChipGroupWideSPilled
    @Composable
    @JvmName("WrapperChipGroupWideSPilled")
    get() = builder
        .wrap(::WrapperChipGroupWideSPilled)

public val WrapperChipGroupWideXsView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideXsViewDefault")
    get() = builder
        .chipStyle(Chip.Xs.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideXsView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideXsViewAccent")
    get() = builder
        .chipStyle(Chip.Xs.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideXsView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideXsViewSecondary")
    get() = builder
        .chipStyle(Chip.Xs.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val ChipGroupWide.Xs: WrapperChipGroupWideXs
    @Composable
    @JvmName("WrapperChipGroupWideXs")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupWideXs)

public val WrapperChipGroupWideXsPilledView.Default: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideXsPilledViewDefault")
    get() = builder
        .chipStyle(Chip.Xs.Pilled.Default.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideXsPilledView.Accent: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideXsPilledViewAccent")
    get() = builder
        .chipStyle(Chip.Xs.Pilled.Accent.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideXsPilledView.Secondary: WrapperChipGroupWideTerminate
    @Composable
    @JvmName("WrapperChipGroupWideXsPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.Xs.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupWideTerminate)

public val WrapperChipGroupWideXs.Pilled: WrapperChipGroupWideXsPilled
    @Composable
    @JvmName("WrapperChipGroupWideXsPilled")
    get() = builder
        .wrap(::WrapperChipGroupWideXsPilled)
