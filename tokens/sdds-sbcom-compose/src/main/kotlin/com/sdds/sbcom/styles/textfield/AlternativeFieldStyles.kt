// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
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
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAlternativeField : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperAlternativeFieldDefault(
    public override val builder: TextFieldStyleBuilder,
) : WrapperAlternativeField

public val AlternativeField.Default: WrapperAlternativeFieldDefault
    @Composable
    @JvmName("WrapperAlternativeFieldDefault")
    get() = TextFieldStyle.builder(this)
        .shape(SddsSbComTheme.shapes.roundL)
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsSbComTheme.typography.bodyLNormal)
        .counterStyle(SddsSbComTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsSbComTheme.typography.bodyLNormal)
        .singleLine(false)
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(14.0.dp)
            boxPaddingBottom(14.0.dp)
            labelPadding(0.0.dp)
            helperTextPadding(0.0.dp)
            startContentPadding(12.0.dp)
            endContentPadding(12.0.dp)
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
            backgroundColor(SddsSbComTheme.colors.surfaceDefaultClear.asInteractive())
            dividerColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefault.asInteractive())
        }
        .scrollBar {
            scrollBarThickness(4.0.dp)
            scrollBarPaddingTop(10.0.dp)
            scrollBarPaddingBottom(10.0.dp)
            scrollBarPaddingEnd(6.0.dp)
            scrollBarTrackColor(SddsSbComTheme.colors.surfaceDefaultClear.asInteractive())
            scrollBarThumbColor(SddsSbComTheme.colors.textDefaultTertiary.asInteractive())
        }
        .wrap(::WrapperAlternativeFieldDefault)
