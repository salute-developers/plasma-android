// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.codeinput

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.CodeInputStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCodeInput : BuilderWrapper<CodeInputStyle, CodeInputStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCodeInputS(
    public override val builder: CodeInputStyleBuilder,
) : WrapperCodeInput

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCodeInputM(
    public override val builder: CodeInputStyleBuilder,
) : WrapperCodeInput

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCodeInputL(
    public override val builder: CodeInputStyleBuilder,
) : WrapperCodeInput

private val CodeInputStyleBuilder.invariantProps: CodeInputStyleBuilder
    @Composable
    get() = this
        .colors {
            codeColor(
                StarDsTheme.colors.textDefaultPrimary.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StarDsTheme.colors.textDefaultNegative,
                ),
            )
            captionColor(
                StarDsTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StarDsTheme.colors.textDefaultNegative,
                ),
            )
            fillColor(
                StarDsTheme.colors.surfaceDefaultSolidDefault.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StarDsTheme.colors.surfaceDefaultNegative,
                ),
            )
            strokeColor(
                StarDsTheme.colors.outlineDefaultSolidDefault.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StarDsTheme.colors.outlineDefaultNegative,
                    setOf(CodeInputStates.Focused)
                        to StarDsTheme.colors.outlineDefaultAccentMain,
                ),
            )
        }

public val CodeInput.S: WrapperCodeInputS
    @Composable
    @JvmName("WrapperCodeInputS")
    get() = CodeInputStyle.builder(this)
        .invariantProps
        .codeStyle(StarDsTheme.typography.displaySBold)
        .captionStyle(StarDsTheme.typography.headerH5Normal)
        .dimensions {
            circleSize(
                dimensionResource(R.dimen.sdkit_cmp_code_input_circle_size_s).asStatefulValue(
                    setOf(CodeInputStates.Focused) to
                        dimensionResource(R.dimen.sdkit_cmp_code_input_circle_size_s_0),
                ),
            )
            strokeWidth(dimensionResource(R.dimen.sdkit_cmp_code_input_stroke_width_s))
            itemHeight(dimensionResource(R.dimen.sdkit_cmp_code_input_item_height_s))
            itemWidth(dimensionResource(R.dimen.sdkit_cmp_code_input_item_width_s))
            itemSpacing(dimensionResource(R.dimen.sdkit_cmp_code_input_item_spacing_s))
            groupSpacing(dimensionResource(R.dimen.sdkit_cmp_code_input_group_spacing_s))
            captionPadding(dimensionResource(R.dimen.sdkit_cmp_code_input_caption_padding_s))
        }
        .wrap(::WrapperCodeInputS)

public val CodeInput.M: WrapperCodeInputM
    @Composable
    @JvmName("WrapperCodeInputM")
    get() = CodeInputStyle.builder(this)
        .invariantProps
        .codeStyle(StarDsTheme.typography.displayMBold)
        .captionStyle(StarDsTheme.typography.headerH4Normal)
        .dimensions {
            circleSize(
                dimensionResource(R.dimen.sdkit_cmp_code_input_circle_size_m).asStatefulValue(
                    setOf(CodeInputStates.Focused) to
                        dimensionResource(R.dimen.sdkit_cmp_code_input_circle_size_m_0),
                ),
            )
            strokeWidth(dimensionResource(R.dimen.sdkit_cmp_code_input_stroke_width_m))
            itemHeight(dimensionResource(R.dimen.sdkit_cmp_code_input_item_height_m))
            itemWidth(dimensionResource(R.dimen.sdkit_cmp_code_input_item_width_m))
            itemSpacing(dimensionResource(R.dimen.sdkit_cmp_code_input_item_spacing_m))
            groupSpacing(dimensionResource(R.dimen.sdkit_cmp_code_input_group_spacing_m))
            captionPadding(dimensionResource(R.dimen.sdkit_cmp_code_input_caption_padding_m))
        }
        .wrap(::WrapperCodeInputM)

public val CodeInput.L: WrapperCodeInputL
    @Composable
    @JvmName("WrapperCodeInputL")
    get() = CodeInputStyle.builder(this)
        .invariantProps
        .codeStyle(StarDsTheme.typography.displayLBold)
        .captionStyle(StarDsTheme.typography.headerH3Normal)
        .dimensions {
            circleSize(
                dimensionResource(R.dimen.sdkit_cmp_code_input_circle_size_l).asStatefulValue(
                    setOf(CodeInputStates.Focused) to
                        dimensionResource(R.dimen.sdkit_cmp_code_input_circle_size_l_0),
                ),
            )
            strokeWidth(dimensionResource(R.dimen.sdkit_cmp_code_input_stroke_width_l))
            itemHeight(dimensionResource(R.dimen.sdkit_cmp_code_input_item_height_l))
            itemWidth(dimensionResource(R.dimen.sdkit_cmp_code_input_item_width_l))
            itemSpacing(dimensionResource(R.dimen.sdkit_cmp_code_input_item_spacing_l))
            groupSpacing(dimensionResource(R.dimen.sdkit_cmp_code_input_group_spacing_l))
            captionPadding(dimensionResource(R.dimen.sdkit_cmp_code_input_caption_padding_l))
        }
        .wrap(::WrapperCodeInputL)
