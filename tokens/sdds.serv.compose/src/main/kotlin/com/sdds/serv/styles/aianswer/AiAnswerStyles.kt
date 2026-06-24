// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.aianswer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ai.AiAnswerStyle
import com.sdds.compose.uikit.ai.AiAnswerStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.buttongroup.AiAnswerBasicButtonGroup
import com.sdds.serv.styles.buttongroup.AiAnswerIconButtonGroup
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.chipgroup.AiAnswerChipGroup
import com.sdds.serv.styles.chipgroup.L
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.chipgroup.S
import com.sdds.serv.styles.chipgroup.Xs
import com.sdds.serv.styles.note.L
import com.sdds.serv.styles.note.M
import com.sdds.serv.styles.note.Negative
import com.sdds.serv.styles.note.Note
import com.sdds.serv.styles.note.S
import com.sdds.serv.styles.note.Xs
import com.sdds.serv.styles.spinner.Default
import com.sdds.serv.styles.spinner.Spinner
import com.sdds.serv.styles.spinner.Xs
import com.sdds.serv.styles.spinner.Xxs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiAnswer : BuilderWrapper<AiAnswerStyle, AiAnswerStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAiAnswerXl(
    public override val builder: AiAnswerStyleBuilder,
) : WrapperAiAnswer

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiAnswerL(
    public override val builder: AiAnswerStyleBuilder,
) : WrapperAiAnswer

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiAnswerM(
    public override val builder: AiAnswerStyleBuilder,
) : WrapperAiAnswer

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiAnswerS(
    public override val builder: AiAnswerStyleBuilder,
) : WrapperAiAnswer

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiAnswerXs(
    public override val builder: AiAnswerStyleBuilder,
) : WrapperAiAnswer

private val AiAnswerStyleBuilder.invariantProps: AiAnswerStyleBuilder
    @Composable
    get() = this
        .colors {
            background(SolidColor(SddsServTheme.colors.surfaceDefaultClear).asStatefulValue())
            titleColor(SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue())
            contentColor(SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue())
            loadingTextColor(SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
        }

public val AiAnswer.Xl: WrapperAiAnswerXl
    @Composable
    @JvmName("WrapperAiAnswerXl")
    get() = AiAnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH3Normal)
        .loadingTextStyle(SddsServTheme.typography.bodyLNormal)
        .noteStyle(Note.L.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.M.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.L.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.L.style())
        .dimensions {
            contentGap(30.0.dp)
            actionsGap(20.0.dp)
            suggestionsGap(20.0.dp)
            loadingGap(8.0.dp)
        }
        .wrap(::WrapperAiAnswerXl)

public val AiAnswer.L: WrapperAiAnswerL
    @Composable
    @JvmName("WrapperAiAnswerL")
    get() = AiAnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH3Normal)
        .loadingTextStyle(SddsServTheme.typography.bodyLNormal)
        .noteStyle(Note.L.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.M.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.S.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.M.style())
        .dimensions {
            contentGap(26.0.dp)
            actionsGap(16.0.dp)
            suggestionsGap(20.0.dp)
            loadingGap(8.0.dp)
        }
        .wrap(::WrapperAiAnswerL)

public val AiAnswer.M: WrapperAiAnswerM
    @Composable
    @JvmName("WrapperAiAnswerM")
    get() = AiAnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH4Normal)
        .loadingTextStyle(SddsServTheme.typography.bodyMNormal)
        .noteStyle(Note.M.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.M.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.S.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.S.style())
        .dimensions {
            contentGap(22.0.dp)
            actionsGap(12.0.dp)
            suggestionsGap(20.0.dp)
            loadingGap(8.0.dp)
        }
        .wrap(::WrapperAiAnswerM)

public val AiAnswer.S: WrapperAiAnswerS
    @Composable
    @JvmName("WrapperAiAnswerS")
    get() = AiAnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH5Normal)
        .loadingTextStyle(SddsServTheme.typography.bodySNormal)
        .noteStyle(Note.S.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.S.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.Xs.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.Xs.style())
        .dimensions {
            contentGap(20.0.dp)
            actionsGap(10.0.dp)
            suggestionsGap(16.0.dp)
            loadingGap(8.0.dp)
        }
        .wrap(::WrapperAiAnswerS)

public val AiAnswer.Xs: WrapperAiAnswerXs
    @Composable
    @JvmName("WrapperAiAnswerXs")
    get() = AiAnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH5Normal)
        .loadingTextStyle(SddsServTheme.typography.bodySNormal)
        .noteStyle(Note.Xs.Negative.style())
        .loadingSpinnerStyle(Spinner.Xxs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.S.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.Xs.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.Xs.style())
        .dimensions {
            contentGap(18.0.dp)
            actionsGap(8.0.dp)
            suggestionsGap(16.0.dp)
            loadingGap(8.0.dp)
        }
        .wrap(::WrapperAiAnswerXs)
