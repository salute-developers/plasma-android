// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.chipgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.chip.Accent
import com.sdds.plasma.giga.styles.chip.Default
import com.sdds.plasma.giga.styles.chip.EmbeddedChip
import com.sdds.plasma.giga.styles.chip.L
import com.sdds.plasma.giga.styles.chip.M
import com.sdds.plasma.giga.styles.chip.Negative
import com.sdds.plasma.giga.styles.chip.Positive
import com.sdds.plasma.giga.styles.chip.S
import com.sdds.plasma.giga.styles.chip.Secondary
import com.sdds.plasma.giga.styles.chip.Warning
import com.sdds.plasma.giga.styles.chip.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperEmbeddedChipGroupDense :
    BuilderWrapper<ChipGroupStyle, ChipGroupStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupDenseLView : WrapperEmbeddedChipGroupDense

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperEmbeddedChipGroupDenseTerminate(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupDense

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperEmbeddedChipGroupDenseL(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupDenseLView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupDenseMView : WrapperEmbeddedChipGroupDense

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperEmbeddedChipGroupDenseM(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupDenseMView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupDenseSView : WrapperEmbeddedChipGroupDense

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperEmbeddedChipGroupDenseS(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupDenseSView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupDenseXsView : WrapperEmbeddedChipGroupDense

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperEmbeddedChipGroupDenseXs(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupDenseXsView

private val ChipGroupStyleBuilder.invariantProps: ChipGroupStyleBuilder
    @Composable
    get() = this
        .dimensions {
            gap(2.0.dp)
            lineSpacing(2.0.dp)
        }
        .disableAlpha(0.4f)

public val WrapperEmbeddedChipGroupDenseLView.Default: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseLViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.L.Default.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseLView.Accent: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseLViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.L.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseLView.Negative: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseLViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.L.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseLView.Positive: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseLViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.L.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseLView.Secondary: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseLViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseLView.Warning: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseLViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.L.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val EmbeddedChipGroupDense.L: WrapperEmbeddedChipGroupDenseL
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseL")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupDenseL)

public val WrapperEmbeddedChipGroupDenseMView.Default: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseMViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.M.Default.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseMView.Accent: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseMViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.M.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseMView.Negative: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseMViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.M.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseMView.Positive: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseMViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.M.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseMView.Secondary: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseMViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseMView.Warning: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseMViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.M.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val EmbeddedChipGroupDense.M: WrapperEmbeddedChipGroupDenseM
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseM")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupDenseM)

public val WrapperEmbeddedChipGroupDenseSView.Default: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseSViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.S.Default.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseSView.Accent: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseSViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.S.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseSView.Negative: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseSViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.S.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseSView.Positive: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseSViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.S.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseSView.Secondary: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseSViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseSView.Warning: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseSViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.S.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val EmbeddedChipGroupDense.S: WrapperEmbeddedChipGroupDenseS
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseS")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupDenseS)

public val WrapperEmbeddedChipGroupDenseXsView.Default: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseXsViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Default.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseXsView.Accent: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseXsViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseXsView.Negative: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseXsViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseXsView.Positive: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseXsViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseXsView.Secondary: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseXsViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val WrapperEmbeddedChipGroupDenseXsView.Warning: WrapperEmbeddedChipGroupDenseTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseXsViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupDenseTerminate)

public val EmbeddedChipGroupDense.Xs: WrapperEmbeddedChipGroupDenseXs
    @Composable
    @JvmName("WrapperEmbeddedChipGroupDenseXs")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupDenseXs)
