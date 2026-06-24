// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.buttongroup

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonGroupStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.iconbutton.EmbeddedIconButton
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiUserMessageEmbeddedIconButtonGroup :
    BuilderWrapper<ButtonGroupStyle, ButtonGroupStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiUserMessageEmbeddedIconButtonGroupS(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiUserMessageEmbeddedIconButtonGroup

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiUserMessageEmbeddedIconButtonGroupM(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiUserMessageEmbeddedIconButtonGroup

private val ButtonGroupStyleBuilder.invariantProps: ButtonGroupStyleBuilder
    @Composable
    get() = this

public val AiUserMessageEmbeddedIconButtonGroup.S: WrapperAiUserMessageEmbeddedIconButtonGroupS
    @Composable
    @JvmName("WrapperAiUserMessageEmbeddedIconButtonGroupS")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.S.Secondary.style())
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperAiUserMessageEmbeddedIconButtonGroupS)

public val AiUserMessageEmbeddedIconButtonGroup.M: WrapperAiUserMessageEmbeddedIconButtonGroupM
    @Composable
    @JvmName("WrapperAiUserMessageEmbeddedIconButtonGroupM")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.M.Secondary.style())
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperAiUserMessageEmbeddedIconButtonGroupM)
