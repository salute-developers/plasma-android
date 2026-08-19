// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.textfield

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.TextFieldType
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSearchBar : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperSearchBarDefault(
    public override val builder: TextFieldStyleBuilder,
) : WrapperSearchBar

public val SearchBar.Default: WrapperSearchBarDefault
    @Composable
    @JvmName("WrapperSearchBarDefault")
    get() = TextFieldStyle.builder(this)
        .shape(CircleShape)
        .labelPlacement(TextFieldLabelPlacement.None)
        .fieldType(TextFieldType.Optional)
        .valueStyle(SddsSbComTheme.typography.bodyLNormal)
        .placeholderStyle(SddsSbComTheme.typography.bodyLNormal)
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(16.0.dp)
            boxPaddingBottom(16.0.dp)
            startContentPadding(16.0.dp)
            endContentPadding(16.0.dp)
            boxMinHeight(56.0.dp)
            alignmentLineHeight(56.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .colors {
            cursorColor(SolidColor(SddsSbComTheme.colors.textDefaultAccent).asStatefulValue())
            startContentColor(SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue())
            endContentColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue())
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentPrimary).asStatefulValue())
        }
        .wrap(::WrapperSearchBarDefault)
