// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.textfield

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTextField : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTextFieldTerminate(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

public val TextField.Default: WrapperTextFieldTerminate
    @Composable
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .colors {
            labelColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

public val TextField.Error: WrapperTextFieldTerminate
    @Composable
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .colors {
            labelColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .singleLine(true)
        .shape(CircleShape)
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            boxMinHeight(56.0.dp)
            alignmentLineHeight(56.0.dp)
            labelPadding(2.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(8.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .labelStyle(SddsSbComTheme.typography.bodyXsNormal)
        .valueStyle(SddsSbComTheme.typography.bodyLNormal)
        .placeholderStyle(SddsSbComTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .colors {
            valueColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endContentColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            cursorColor(
                SddsSbComTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
