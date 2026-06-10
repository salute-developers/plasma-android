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
import com.sdds.serv.styles.iconbutton.AiHeaderEmbeddedIconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import com.sdds.serv.styles.iconbutton.Xl
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiHeaderEmbeddedIconButtonGroup :
    BuilderWrapper<ButtonGroupStyle, ButtonGroupStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonGroupS(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonGroup

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonGroupM(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonGroup

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonGroupL(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonGroup

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonGroupXl(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonGroup

private val ButtonGroupStyleBuilder.invariantProps: ButtonGroupStyleBuilder
    @Composable
    get() = this
        .dimensions {
            spacing(0.0.dp)
        }

public val AiHeaderEmbeddedIconButtonGroup.S: WrapperAiHeaderEmbeddedIconButtonGroupS
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonGroupS")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(AiHeaderEmbeddedIconButton.S.Secondary.style())
        .wrap(::WrapperAiHeaderEmbeddedIconButtonGroupS)

public val AiHeaderEmbeddedIconButtonGroup.M: WrapperAiHeaderEmbeddedIconButtonGroupM
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonGroupM")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(AiHeaderEmbeddedIconButton.M.Secondary.style())
        .wrap(::WrapperAiHeaderEmbeddedIconButtonGroupM)

public val AiHeaderEmbeddedIconButtonGroup.L: WrapperAiHeaderEmbeddedIconButtonGroupL
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonGroupL")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(AiHeaderEmbeddedIconButton.L.Secondary.style())
        .wrap(::WrapperAiHeaderEmbeddedIconButtonGroupL)

public val AiHeaderEmbeddedIconButtonGroup.Xl: WrapperAiHeaderEmbeddedIconButtonGroupXl
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonGroupXl")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(AiHeaderEmbeddedIconButton.Xl.Secondary.style())
        .wrap(::WrapperAiHeaderEmbeddedIconButtonGroupXl)
