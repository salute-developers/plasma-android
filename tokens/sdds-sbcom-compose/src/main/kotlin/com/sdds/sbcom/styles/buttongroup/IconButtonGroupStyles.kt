// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.buttongroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.iconbutton.AccentGrey
import com.sdds.sbcom.styles.iconbutton.IconButton
import com.sdds.sbcom.styles.iconbutton.M
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIconButtonGroup : BuilderWrapper<ButtonGroupStyle, ButtonGroupStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperIconButtonGroupDefault(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperIconButtonGroup

public val IconButtonGroup.Default: WrapperIconButtonGroupDefault
    @Composable
    @JvmName("WrapperIconButtonGroupDefault")
    get() = ButtonGroupStyle.builder(this)
        .dimensions {
            spacing(8.0.dp)
        }
        .buttonStyle(IconButton.M.AccentGrey.style())
        .wrap(::WrapperIconButtonGroupDefault)
