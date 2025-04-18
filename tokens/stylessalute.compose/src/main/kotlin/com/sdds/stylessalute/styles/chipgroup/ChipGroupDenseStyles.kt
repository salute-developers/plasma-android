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
public interface WrapperChipGroupDense : BuilderWrapper<ChipGroupStyle, ChipGroupStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseLView : WrapperChipGroupDense

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperChipGroupDenseTerminate(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDense

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperChipGroupDenseL(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseLView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseLPilledView : WrapperChipGroupDenseLView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperChipGroupDenseLPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseLPilledView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseMView : WrapperChipGroupDense

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperChipGroupDenseM(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseMView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseMPilledView : WrapperChipGroupDenseMView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperChipGroupDenseMPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseMPilledView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseSView : WrapperChipGroupDense

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperChipGroupDenseS(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseSView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseSPilledView : WrapperChipGroupDenseSView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperChipGroupDenseSPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseSPilledView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseXsView : WrapperChipGroupDense

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperChipGroupDenseXs(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseXsView

/**
 * Интерфейс, который реализуют все обертки вариации pilled
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipGroupDenseXsPilledView : WrapperChipGroupDenseXsView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperChipGroupDenseXsPilled(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroupDenseXsPilledView

private val ChipGroupStyleBuilder.invariantProps: ChipGroupStyleBuilder
    @Composable
    get() = this
        .dimensions {
            gap(2.0.dp)
            lineSpacing(2.0.dp)
        }
        .disableAlpha(0.4f)

public val WrapperChipGroupDenseLView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseLViewDefault")
    get() = builder
        .chipStyle(Chip.L.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseLView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseLViewAccent")
    get() = builder
        .chipStyle(Chip.L.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseLView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseLViewSecondary")
    get() = builder
        .chipStyle(Chip.L.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val ChipGroupDense.L: WrapperChipGroupDenseL
    @Composable
    @JvmName("WrapperChipGroupDenseL")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupDenseL)

public val WrapperChipGroupDenseLPilledView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseLPilledViewDefault")
    get() = builder
        .chipStyle(Chip.L.Pilled.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseLPilledView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseLPilledViewAccent")
    get() = builder
        .chipStyle(Chip.L.Pilled.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseLPilledView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseLPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.L.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseL.Pilled: WrapperChipGroupDenseLPilled
    @Composable
    @JvmName("WrapperChipGroupDenseLPilled")
    get() = builder
        .wrap(::WrapperChipGroupDenseLPilled)

public val WrapperChipGroupDenseMView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseMViewDefault")
    get() = builder
        .chipStyle(Chip.M.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseMView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseMViewAccent")
    get() = builder
        .chipStyle(Chip.M.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseMView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseMViewSecondary")
    get() = builder
        .chipStyle(Chip.M.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val ChipGroupDense.M: WrapperChipGroupDenseM
    @Composable
    @JvmName("WrapperChipGroupDenseM")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupDenseM)

public val WrapperChipGroupDenseMPilledView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseMPilledViewDefault")
    get() = builder
        .chipStyle(Chip.M.Pilled.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseMPilledView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseMPilledViewAccent")
    get() = builder
        .chipStyle(Chip.M.Pilled.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseMPilledView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseMPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.M.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseM.Pilled: WrapperChipGroupDenseMPilled
    @Composable
    @JvmName("WrapperChipGroupDenseMPilled")
    get() = builder
        .wrap(::WrapperChipGroupDenseMPilled)

public val WrapperChipGroupDenseSView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseSViewDefault")
    get() = builder
        .chipStyle(Chip.S.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseSView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseSViewAccent")
    get() = builder
        .chipStyle(Chip.S.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseSView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseSViewSecondary")
    get() = builder
        .chipStyle(Chip.S.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val ChipGroupDense.S: WrapperChipGroupDenseS
    @Composable
    @JvmName("WrapperChipGroupDenseS")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupDenseS)

public val WrapperChipGroupDenseSPilledView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseSPilledViewDefault")
    get() = builder
        .chipStyle(Chip.S.Pilled.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseSPilledView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseSPilledViewAccent")
    get() = builder
        .chipStyle(Chip.S.Pilled.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseSPilledView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseSPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.S.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseS.Pilled: WrapperChipGroupDenseSPilled
    @Composable
    @JvmName("WrapperChipGroupDenseSPilled")
    get() = builder
        .wrap(::WrapperChipGroupDenseSPilled)

public val WrapperChipGroupDenseXsView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseXsViewDefault")
    get() = builder
        .chipStyle(Chip.Xs.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseXsView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseXsViewAccent")
    get() = builder
        .chipStyle(Chip.Xs.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseXsView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseXsViewSecondary")
    get() = builder
        .chipStyle(Chip.Xs.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val ChipGroupDense.Xs: WrapperChipGroupDenseXs
    @Composable
    @JvmName("WrapperChipGroupDenseXs")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperChipGroupDenseXs)

public val WrapperChipGroupDenseXsPilledView.Default: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseXsPilledViewDefault")
    get() = builder
        .chipStyle(Chip.Xs.Pilled.Default.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseXsPilledView.Accent: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseXsPilledViewAccent")
    get() = builder
        .chipStyle(Chip.Xs.Pilled.Accent.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseXsPilledView.Secondary: WrapperChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperChipGroupDenseXsPilledViewSecondary")
    get() = builder
        .chipStyle(Chip.Xs.Pilled.Secondary.style())
        .wrap(::WrapperChipGroupDenseTerminate)

public val WrapperChipGroupDenseXs.Pilled: WrapperChipGroupDenseXsPilled
    @Composable
    @JvmName("WrapperChipGroupDenseXsPilled")
    get() = builder
        .wrap(::WrapperChipGroupDenseXsPilled)
