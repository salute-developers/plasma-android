// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.codeinput

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.CodeInputStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
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
                StylesSaluteTheme.colors.textDefaultPrimary.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StylesSaluteTheme.colors.textDefaultNegative,
                ),
            )
            captionColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StylesSaluteTheme.colors.textDefaultNegative,
                ),
            )
            fillColor(
                StylesSaluteTheme.colors.surfaceDefaultSolidDefault.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StylesSaluteTheme.colors.surfaceDefaultNegative,
                ),
            )
            strokeColor(
                StylesSaluteTheme.colors.outlineDefaultSolidDefault.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to StylesSaluteTheme.colors.outlineDefaultNegative,
                ),
            )
        }

public val CodeInput.S: WrapperCodeInputS
    @Composable
    @JvmName("WrapperCodeInputS")
    get() = CodeInputStyle.builder(this)
        .invariantProps
        .codeStyle(StylesSaluteTheme.typography.displaySBold)
        .captionStyle(StylesSaluteTheme.typography.headerH5Normal)
        .dimensions {
            dotSize(12.0.dp)
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
        .codeStyle(StylesSaluteTheme.typography.displayMBold)
        .captionStyle(StylesSaluteTheme.typography.headerH4Normal)
        .dimensions {
            dotSize(16.0.dp)
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
        .codeStyle(StylesSaluteTheme.typography.displayLBold)
        .captionStyle(StylesSaluteTheme.typography.headerH3Normal)
        .dimensions {
            dotSize(24.0.dp)
            strokeWidth(2.0.dp)
            itemHeight(92.0.dp)
            itemWidth(56.0.dp)
            itemSpacing(12.0.dp)
            groupSpacing(36.0.dp)
            captionPadding(40.0.dp)
        }
        .wrap(::WrapperCodeInputL)
