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
import com.sdds.compose.uikit.interactions.InteractiveState
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
public interface WrapperTextField : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTextFieldDefault(
    public override val builder: TextFieldStyleBuilder,
) : WrapperTextField

public val TextField.Default: WrapperTextFieldDefault
    @Composable
    @JvmName("WrapperTextFieldDefault")
    get() = TextFieldStyle.builder(this)
        .singleLine(false)
        .shape(SddsSbComTheme.shapes.roundL)
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(8.0.dp)
            boxPaddingBottom(8.0.dp)
            boxMinHeight(52.0.dp)
            alignmentLineHeight(52.0.dp)
            labelPadding(2.0.dp)
            helperTextPadding(4.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(8.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .captionStyle(SddsSbComTheme.typography.bodyXsNormal)
        .labelStyle(SddsSbComTheme.typography.bodyXsNormal)
        .valueStyle(SddsSbComTheme.typography.bodyLNormal)
        .placeholderStyle(SddsSbComTheme.typography.bodyLNormal)
        .counterStyle(SddsSbComTheme.typography.bodyXsNormal)
        .labelPlacement(TextFieldLabelPlacement.Inner)
        .captionPlacement(TextFieldHelperTextPlacement.Outer)
        .counterPlacement(TextFieldHelperTextPlacement.Outer)
        .colors {
            labelColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            valueColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endContentColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                ),
            )
            captionColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            counterColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            cursorColor(
                SddsSbComTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperTextFieldDefault)
