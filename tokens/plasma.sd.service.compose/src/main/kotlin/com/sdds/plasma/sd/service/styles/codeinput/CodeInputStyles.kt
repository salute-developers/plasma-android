// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.codeinput

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.CodeInputStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
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
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to PlasmaSdServiceTheme.colors.textDefaultNegative,
                ),
            )
            captionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to PlasmaSdServiceTheme.colors.textDefaultNegative,
                ),
            )
            fillColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultNegative,
                ),
            )
            strokeColor(
                PlasmaSdServiceTheme.colors.outlineDefaultSolidDefault.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to PlasmaSdServiceTheme.colors.outlineDefaultNegative,
                    setOf(CodeInputStates.Focused)
                        to PlasmaSdServiceTheme.colors.outlineDefaultAccent,
                ),
            )
        }

public val CodeInput.S: WrapperCodeInputS
    @Composable
    @JvmName("WrapperCodeInputS")
    get() = CodeInputStyle.builder(this)
        .invariantProps
        .codeStyle(PlasmaSdServiceTheme.typography.displaySBold)
        .captionStyle(PlasmaSdServiceTheme.typography.headerH5Normal)
        .dimensions {
            circleSize(
                12.0.dp.asStatefulValue(
                    setOf(CodeInputStates.Focused) to 16.0.dp,
                ),
            )
            strokeWidth(1.0.dp)
            itemHeight(44.0.dp)
            itemWidth(26.0.dp)
            itemSpacing(4.0.dp)
            groupSpacing(16.0.dp)
            captionPadding(24.0.dp)
        }
        .wrap(::WrapperCodeInputS)

public val CodeInput.M: WrapperCodeInputM
    @Composable
    @JvmName("WrapperCodeInputM")
    get() = CodeInputStyle.builder(this)
        .invariantProps
        .codeStyle(PlasmaSdServiceTheme.typography.displayMBold)
        .captionStyle(PlasmaSdServiceTheme.typography.headerH4Normal)
        .dimensions {
            circleSize(
                16.0.dp.asStatefulValue(
                    setOf(CodeInputStates.Focused) to 24.0.dp,
                ),
            )
            strokeWidth(1.5.dp)
            itemHeight(60.0.dp)
            itemWidth(36.0.dp)
            itemSpacing(8.0.dp)
            groupSpacing(28.0.dp)
            captionPadding(28.0.dp)
        }
        .wrap(::WrapperCodeInputM)

public val CodeInput.L: WrapperCodeInputL
    @Composable
    @JvmName("WrapperCodeInputL")
    get() = CodeInputStyle.builder(this)
        .invariantProps
        .codeStyle(PlasmaSdServiceTheme.typography.displayLBold)
        .captionStyle(PlasmaSdServiceTheme.typography.headerH3Normal)
        .dimensions {
            circleSize(
                24.0.dp.asStatefulValue(
                    setOf(CodeInputStates.Focused) to 36.0.dp,
                ),
            )
            strokeWidth(2.0.dp)
            itemHeight(92.0.dp)
            itemWidth(56.0.dp)
            itemSpacing(12.0.dp)
            groupSpacing(36.0.dp)
            captionPadding(40.0.dp)
        }
        .wrap(::WrapperCodeInputL)
