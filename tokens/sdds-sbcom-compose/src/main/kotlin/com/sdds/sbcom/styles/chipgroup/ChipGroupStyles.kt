// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.chipgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.chip.Chip
import com.sdds.sbcom.styles.chip.Default
import com.sdds.sbcom.styles.chip.HasContentStart
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperChipGroup : BuilderWrapper<ChipGroupStyle, ChipGroupStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperChipGroupDefault(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroup

/**
 * Обертка для вариации HasContentStart
 */
@JvmInline
public value class WrapperChipGroupHasContentStart(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperChipGroup

private val ChipGroupStyleBuilder.invariantProps: ChipGroupStyleBuilder
    @Composable
    get() = this
        .dimensions {
            gap(6.0.dp)
            lineSpacing(6.0.dp)
        }
        .disableAlpha(0.4f)

public val ChipGroup.Default: WrapperChipGroupDefault
    @Composable
    @JvmName("WrapperChipGroupDefault")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .chipStyle(Chip.Default.style())
        .wrap(::WrapperChipGroupDefault)

public val ChipGroup.HasContentStart: WrapperChipGroupHasContentStart
    @Composable
    @JvmName("WrapperChipGroupHasContentStart")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .chipStyle(Chip.HasContentStart.style())
        .wrap(::WrapperChipGroupHasContentStart)
