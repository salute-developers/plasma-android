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
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.EmbeddedIconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiAnswerIconButtonGroup :
    BuilderWrapper<ButtonGroupStyle, ButtonGroupStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiAnswerIconButtonGroupXs(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerIconButtonGroup

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiAnswerIconButtonGroupS(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerIconButtonGroup

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiAnswerIconButtonGroupM(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerIconButtonGroup

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiAnswerIconButtonGroupL(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerIconButtonGroup

private val ButtonGroupStyleBuilder.invariantProps: ButtonGroupStyleBuilder
    @Composable
    get() = this

public val AiAnswerIconButtonGroup.Xs: WrapperAiAnswerIconButtonGroupXs
    @Composable
    @JvmName("WrapperAiAnswerIconButtonGroupXs")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.Xs.Default.style())
        .dimensions {
            spacing(6.0.dp)
        }
        .wrap(::WrapperAiAnswerIconButtonGroupXs)

public val AiAnswerIconButtonGroup.S: WrapperAiAnswerIconButtonGroupS
    @Composable
    @JvmName("WrapperAiAnswerIconButtonGroupS")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.S.Default.style())
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperAiAnswerIconButtonGroupS)

public val AiAnswerIconButtonGroup.M: WrapperAiAnswerIconButtonGroupM
    @Composable
    @JvmName("WrapperAiAnswerIconButtonGroupM")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.M.Default.style())
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperAiAnswerIconButtonGroupM)

public val AiAnswerIconButtonGroup.L: WrapperAiAnswerIconButtonGroupL
    @Composable
    @JvmName("WrapperAiAnswerIconButtonGroupL")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .buttonStyle(EmbeddedIconButton.L.Default.style())
        .dimensions {
            spacing(8.0.dp)
        }
        .wrap(::WrapperAiAnswerIconButtonGroupL)
