// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.chipgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.styles.chip.Accent
import com.sdds.finai.styles.chip.Default
import com.sdds.finai.styles.chip.EmbeddedChip
import com.sdds.finai.styles.chip.Negative
import com.sdds.finai.styles.chip.Positive
import com.sdds.finai.styles.chip.S
import com.sdds.finai.styles.chip.Secondary
import com.sdds.finai.styles.chip.Warning
import com.sdds.finai.styles.chip.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperEmbeddedChipGroup : BuilderWrapper<ChipGroupStyle, ChipGroupStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupSView : WrapperEmbeddedChipGroup

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperEmbeddedChipGroupTerminate(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroup

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperEmbeddedChipGroupS(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupSView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipGroupXsView : WrapperEmbeddedChipGroup

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperEmbeddedChipGroupXs(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperEmbeddedChipGroupXsView

private val ChipGroupStyleBuilder.invariantProps: ChipGroupStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .dimensions {
            gap(2.0.dp)
            lineSpacing(2.0.dp)
        }

public val WrapperEmbeddedChipGroupSView.Default: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupSViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.S.Default.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupSView.Accent: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupSViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.S.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupSView.Negative: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupSViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.S.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupSView.Positive: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupSViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.S.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupSView.Secondary: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupSViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.S.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupSView.Warning: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupSViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.S.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val EmbeddedChipGroup.S: WrapperEmbeddedChipGroupS
    @Composable
    @JvmName("WrapperEmbeddedChipGroupS")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupS)

public val WrapperEmbeddedChipGroupXsView.Default: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupXsViewDefault")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Default.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupXsView.Accent: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupXsViewAccent")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Accent.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupXsView.Negative: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupXsViewNegative")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Negative.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupXsView.Positive: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupXsViewPositive")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Positive.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupXsView.Secondary: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupXsViewSecondary")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Secondary.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val WrapperEmbeddedChipGroupXsView.Warning: WrapperEmbeddedChipGroupTerminate
    @Composable
    @JvmName("WrapperEmbeddedChipGroupXsViewWarning")
    get() = builder
        .chipStyle(EmbeddedChip.Xs.Warning.style())
        .wrap(::WrapperEmbeddedChipGroupTerminate)

public val EmbeddedChipGroup.Xs: WrapperEmbeddedChipGroupXs
    @Composable
    @JvmName("WrapperEmbeddedChipGroupXs")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .wrap(::WrapperEmbeddedChipGroupXs)
