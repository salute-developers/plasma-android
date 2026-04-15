// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.buttongroup

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.ModeAccentGrey
import com.sdds.sbcom.styles.basicbutton.Size40
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBasicButtonGroup : BuilderWrapper<ButtonGroupStyle, ButtonGroupStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperBasicButtonGroupDefault(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperBasicButtonGroup

public val BasicButtonGroup.Default: WrapperBasicButtonGroupDefault
    @Composable
    @JvmName("WrapperBasicButtonGroupDefault")
    get() = ButtonGroupStyle.builder(this)
        .internalShape(CircleShape)
        .externalShape(CircleShape)
        .dimensions {
            spacing(8.0.dp)
        }
        .buttonStyle(BasicButton.Size40.ModeAccentGrey.style())
        .wrap(::WrapperBasicButtonGroupDefault)
