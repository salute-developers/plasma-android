// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.chipgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.chip.Accent
import com.sdds.plasma.sd.service.styles.chip.Default
import com.sdds.plasma.sd.service.styles.chip.EmbeddedChip
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.Negative
import com.sdds.plasma.sd.service.styles.chip.Positive
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.plasma.sd.service.styles.chip.Warning
import com.sdds.plasma.sd.service.styles.chip.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperEmbeddedChipGroupWide :
    BuilderWrapper<ChipGroupStyle, ChipGroupStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupWideLView : WrapperEmbeddedChipGroupWide

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperEmbeddedChipGroupWideTerminate(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupWide

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperEmbeddedChipGroupWideL(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupWideLView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupWideMView : WrapperEmbeddedChipGroupWide

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperEmbeddedChipGroupWideM(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupWideMView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupWideSView : WrapperEmbeddedChipGroupWide

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperEmbeddedChipGroupWideS(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupWideSView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupWideXsView : WrapperEmbeddedChipGroupWide

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperEmbeddedChipGroupWideXs(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupWideXsView

private val ChipGroupStyleBuilder.invariantProps: ChipGroupStyleBuilder
    @Composable
    get() = this
        .dimensions {
            gap(8.0.dp)
            lineSpacing(8.0.dp)
        }
        .disableAlpha(0.4f)

public val WrapperEmbeddedChipGroupWideLView.Default: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideLViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.L.Default.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideLView.Accent: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideLViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.L.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideLView.Negative: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideLViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.L.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideLView.Positive: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideLViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.L.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideLView.Secondary: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideLViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.L.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideLView.Warning: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideLViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.L.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val EmbeddedChipGroupWide.L: WrapperEmbeddedChipGroupWideL
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideL")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupWideL)

public val WrapperEmbeddedChipGroupWideMView.Default: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideMViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.M.Default.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideMView.Accent: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideMViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.M.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideMView.Negative: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideMViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.M.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideMView.Positive: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideMViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.M.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideMView.Secondary: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideMViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.M.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideMView.Warning: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideMViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.M.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val EmbeddedChipGroupWide.M: WrapperEmbeddedChipGroupWideM
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideM")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupWideM)

public val WrapperEmbeddedChipGroupWideSView.Default: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideSViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.S.Default.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideSView.Accent: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideSViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.S.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideSView.Negative: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideSViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.S.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideSView.Positive: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideSViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.S.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideSView.Secondary: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideSViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideSView.Warning: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideSViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.S.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val EmbeddedChipGroupWide.S: WrapperEmbeddedChipGroupWideS
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideS")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupWideS)

public val WrapperEmbeddedChipGroupWideXsView.Default: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideXsViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Default.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideXsView.Accent: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideXsViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideXsView.Negative: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideXsViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideXsView.Positive: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideXsViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideXsView.Secondary: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideXsViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val WrapperEmbeddedChipGroupWideXsView.Warning: WrapperEmbeddedChipGroupWideTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideXsViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupWideTerminate)

public val EmbeddedChipGroupWide.Xs: WrapperEmbeddedChipGroupWideXs
    @Composable
    @JvmName("WrapperEmbeddedChipGroupWideXs")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupWideXs)
