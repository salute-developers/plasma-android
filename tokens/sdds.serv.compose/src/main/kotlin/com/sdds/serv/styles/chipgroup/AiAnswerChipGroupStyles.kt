// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.chipgroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.chip.Chip
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.Pilled
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiAnswerChipGroup : BuilderWrapper<ChipGroupStyle, ChipGroupStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiAnswerChipGroupL(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperAiAnswerChipGroup

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiAnswerChipGroupM(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperAiAnswerChipGroup

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiAnswerChipGroupS(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperAiAnswerChipGroup

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiAnswerChipGroupXs(
    public override val builder: ChipGroupStyleBuilder,
) : WrapperAiAnswerChipGroup

private val ChipGroupStyleBuilder.invariantProps: ChipGroupStyleBuilder
    @Composable
    get() = this
        .dimensions {
            gap(10.0.dp)
            lineSpacing(10.0.dp)
        }
        .disableAlpha(0.4f)

public val AiAnswerChipGroup.L: WrapperAiAnswerChipGroupL
    @Composable
    @JvmName("WrapperAiAnswerChipGroupL")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .chipStyle(Chip.L.Pilled.Secondary.style())
        .wrap(::WrapperAiAnswerChipGroupL)

public val AiAnswerChipGroup.M: WrapperAiAnswerChipGroupM
    @Composable
    @JvmName("WrapperAiAnswerChipGroupM")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .chipStyle(Chip.M.Pilled.Secondary.style())
        .wrap(::WrapperAiAnswerChipGroupM)

public val AiAnswerChipGroup.S: WrapperAiAnswerChipGroupS
    @Composable
    @JvmName("WrapperAiAnswerChipGroupS")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .chipStyle(Chip.S.Pilled.Secondary.style())
        .wrap(::WrapperAiAnswerChipGroupS)

public val AiAnswerChipGroup.Xs: WrapperAiAnswerChipGroupXs
    @Composable
    @JvmName("WrapperAiAnswerChipGroupXs")
    get() = ChipGroupStyle.builder(this)
        .invariantProps
        .chipStyle(Chip.Xs.Pilled.Secondary.style())
        .wrap(::WrapperAiAnswerChipGroupXs)
