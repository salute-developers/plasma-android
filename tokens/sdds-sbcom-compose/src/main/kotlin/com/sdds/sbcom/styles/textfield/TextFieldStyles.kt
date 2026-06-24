// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.TextFieldType
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
            labelColor(SddsSbComTheme.colors.textDefaultSecondary.asInteractive())
            captionColor(SddsSbComTheme.colors.textDefaultSecondary.asInteractive())
            counterColor(SddsSbComTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperTextFieldTerminate)

public val TextField.Success: WrapperTextFieldTerminate
    @Composable
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .colors {
            labelColor(SddsSbComTheme.colors.textDefaultPositive.asInteractive())
            captionColor(SddsSbComTheme.colors.textDefaultPositive.asInteractive())
            counterColor(SddsSbComTheme.colors.textDefaultPositive.asInteractive())
        }
        .wrap(::WrapperTextFieldTerminate)

public val TextField.Error: WrapperTextFieldTerminate
    @Composable
    get() = TextFieldStyle.builder(this)
        .invariantProps
        .colors {
            labelColor(SddsSbComTheme.colors.textDefaultNegative.asInteractive())
            captionColor(SddsSbComTheme.colors.textDefaultNegative.asInteractive())
            counterColor(SddsSbComTheme.colors.textDefaultNegative.asInteractive())
        }
        .wrap(::WrapperTextFieldTerminate)

private val TextFieldStyleBuilder.invariantProps: TextFieldStyleBuilder
    @Composable
    get() = this
        .shape(SddsSbComTheme.shapes.roundL)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .fieldType(TextFieldType.Optional)
        .labelStyle(SddsSbComTheme.typography.bodyXsNormal)
        .valueStyle(SddsSbComTheme.typography.bodyLNormal)
        .captionStyle(SddsSbComTheme.typography.bodyXsNormal)
        .counterStyle(SddsSbComTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsSbComTheme.typography.bodyLNormal)
        .singleLine(false)
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            labelPadding(2.0.dp)
            helperTextPadding(4.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(8.0.dp)
            boxMinHeight(52.0.dp)
            alignmentLineHeight(52.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .colors {
            cursorColor(SddsSbComTheme.colors.textDefaultAccent.asInteractive())
            startContentColor(SddsSbComTheme.colors.textDefaultSecondary.asInteractive())
            endContentColor(SddsSbComTheme.colors.textDefaultPrimary.asInteractive())
            labelColor(SddsSbComTheme.colors.textDefaultSecondary.asInteractive())
            valueColor(SddsSbComTheme.colors.textDefaultPrimary.asInteractive())
            captionColor(SddsSbComTheme.colors.textDefaultSecondary.asInteractive())
            counterColor(SddsSbComTheme.colors.textDefaultSecondary.asInteractive())
            backgroundColor(SddsSbComTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
        }
        .scrollBar {
            scrollBarThickness(4.0.dp)
            scrollBarPaddingTop(10.0.dp)
            scrollBarPaddingBottom(10.0.dp)
            scrollBarPaddingEnd(6.0.dp)
            scrollBarTrackColor(SddsSbComTheme.colors.surfaceDefaultClear.asInteractive())
            scrollBarThumbColor(SddsSbComTheme.colors.textDefaultTertiary.asInteractive())
        }
