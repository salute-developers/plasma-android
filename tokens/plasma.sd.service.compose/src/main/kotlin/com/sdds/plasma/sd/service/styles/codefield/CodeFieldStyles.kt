// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.codefield

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.CodeFieldStyleBuilder
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
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
public interface WrapperCodeField : BuilderWrapper<CodeFieldStyle, CodeFieldStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCodeFieldL(
    public override val builder: CodeFieldStyleBuilder,
) : WrapperCodeField

/**
 * Обертка для вариации LSegmented
 */
@JvmInline
public value class WrapperCodeFieldLSegmented(
    public override val builder: CodeFieldStyleBuilder,
) : WrapperCodeField

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCodeFieldM(
    public override val builder: CodeFieldStyleBuilder,
) : WrapperCodeField

/**
 * Обертка для вариации MSegmented
 */
@JvmInline
public value class WrapperCodeFieldMSegmented(
    public override val builder: CodeFieldStyleBuilder,
) : WrapperCodeField

private val CodeFieldStyleBuilder.invariantProps: CodeFieldStyleBuilder
    @Composable
    get() = this
        .colors {
            valueColor(
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
            dotColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultNegative,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPrimary.asStatefulValue(
                    setOf(CodeInputStates.Error)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentNegative,
                    setOf(InteractiveState.Activated)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            cursorColor(
                PlasmaSdServiceTheme.colors.textDefaultAccent.asStatefulValue(),
            )
        }
        .dimensions {
            itemSpacing(2.0.dp)
            groupSpacing(4.0.dp)
        }

public val CodeField.L: WrapperCodeFieldL
    @Composable
    @JvmName("WrapperCodeFieldL")
    get() = CodeFieldStyle.builder(this)
        .invariantProps
        .itemShape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = 2.0.dp))
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .captionStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .dimensions {
            dotSize(10.0.dp)
            height(56.0.dp)
            width(44.0.dp)
            captionSpacing(14.0.dp)
        }
        .wrap(::WrapperCodeFieldL)

public val WrapperCodeFieldL.Segmented: WrapperCodeFieldLSegmented
    @Composable
    @JvmName("WrapperCodeFieldLSegmented")
    get() = builder
        .itemShape(PlasmaSdServiceTheme.shapes.roundXs)
        .groupShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .wrap(::WrapperCodeFieldLSegmented)

public val CodeField.M: WrapperCodeFieldM
    @Composable
    @JvmName("WrapperCodeFieldM")
    get() = CodeFieldStyle.builder(this)
        .invariantProps
        .itemShape(PlasmaSdServiceTheme.shapes.roundM)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .captionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            dotSize(8.0.dp)
            height(48.0.dp)
            width(38.0.dp)
            captionSpacing(12.0.dp)
        }
        .wrap(::WrapperCodeFieldM)

public val WrapperCodeFieldM.Segmented: WrapperCodeFieldMSegmented
    @Composable
    @JvmName("WrapperCodeFieldMSegmented")
    get() = builder
        .itemShape(PlasmaSdServiceTheme.shapes.roundXxs)
        .groupShape(PlasmaSdServiceTheme.shapes.roundM)
        .wrap(::WrapperCodeFieldMSegmented)
