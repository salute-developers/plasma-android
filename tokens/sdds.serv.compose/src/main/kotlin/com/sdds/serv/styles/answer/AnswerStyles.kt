// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.answer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ai.AnswerStyle
import com.sdds.compose.uikit.ai.AnswerStyleBuilder
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
public interface WrapperAnswer : BuilderWrapper<AnswerStyle, AnswerStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAnswerXl(
    public override val builder: AnswerStyleBuilder,
) : WrapperAnswer

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAnswerL(
    public override val builder: AnswerStyleBuilder,
) : WrapperAnswer

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAnswerM(
    public override val builder: AnswerStyleBuilder,
) : WrapperAnswer

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAnswerS(
    public override val builder: AnswerStyleBuilder,
) : WrapperAnswer

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAnswerXs(
    public override val builder: AnswerStyleBuilder,
) : WrapperAnswer

private val AnswerStyleBuilder.invariantProps: AnswerStyleBuilder
    @Composable
    get() = this
        .colors {
            background(
                SolidColor(SddsServTheme.colors.surfaceDefaultClear).asStatefulValue(),
            )
            titleColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
            contentColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
            loadingTextColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
        }
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
        }

public val Answer.Xl: WrapperAnswerXl
    @Composable
    @JvmName("WrapperAnswerXl")
    get() = AnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH3Normal)
        .loadingTextStyle(SddsServTheme.typography.bodyLNormal)
        .dimensions {
            contentGap(30.0.dp)
            actionsGap(20.0.dp)
            suggestionsGap(20.0.dp)
            loadingGap(8.0.dp)
        }
        .noteStyle(Note.L.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.M.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.L.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.L.style())
        .wrap(::WrapperAnswerXl)

public val Answer.L: WrapperAnswerL
    @Composable
    @JvmName("WrapperAnswerL")
    get() = AnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH3Normal)
        .loadingTextStyle(SddsServTheme.typography.bodyLNormal)
        .dimensions {
            contentGap(26.0.dp)
            actionsGap(16.0.dp)
            suggestionsGap(20.0.dp)
            loadingGap(8.0.dp)
        }
        .noteStyle(Note.L.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.M.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.S.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.M.style())
        .wrap(::WrapperAnswerL)

public val Answer.M: WrapperAnswerM
    @Composable
    @JvmName("WrapperAnswerM")
    get() = AnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH4Normal)
        .loadingTextStyle(SddsServTheme.typography.bodyMNormal)
        .dimensions {
            contentGap(22.0.dp)
            actionsGap(12.0.dp)
            suggestionsGap(20.0.dp)
            loadingGap(8.0.dp)
        }
        .noteStyle(Note.M.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.M.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.S.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.S.style())
        .wrap(::WrapperAnswerM)

public val Answer.S: WrapperAnswerS
    @Composable
    @JvmName("WrapperAnswerS")
    get() = AnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH5Normal)
        .loadingTextStyle(SddsServTheme.typography.bodySNormal)
        .dimensions {
            contentGap(20.0.dp)
            actionsGap(10.0.dp)
            suggestionsGap(16.0.dp)
            loadingGap(8.0.dp)
        }
        .noteStyle(Note.S.Negative.style())
        .loadingSpinnerStyle(Spinner.Xs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.S.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.Xs.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.Xs.style())
        .wrap(::WrapperAnswerS)

public val Answer.Xs: WrapperAnswerXs
    @Composable
    @JvmName("WrapperAnswerXs")
    get() = AnswerStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH5Normal)
        .loadingTextStyle(SddsServTheme.typography.bodySNormal)
        .dimensions {
            contentGap(18.0.dp)
            actionsGap(8.0.dp)
            suggestionsGap(16.0.dp)
            loadingGap(8.0.dp)
        }
        .noteStyle(Note.Xs.Negative.style())
        .loadingSpinnerStyle(Spinner.Xxs.Default.style())
        .actionsStartButtonGroupStyle(AiAnswerIconButtonGroup.S.style())
        .actionsEndButtonGroupStyle(AiAnswerBasicButtonGroup.Xs.style())
        .suggestionsChipGroupStyle(AiAnswerChipGroup.Xs.style())
        .wrap(::WrapperAnswerXs)
