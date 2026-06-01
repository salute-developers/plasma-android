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
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiAnswerBasicButtonGroup :
    BuilderWrapper<ButtonGroupStyle, ButtonGroupStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiAnswerBasicButtonGroupXs(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerBasicButtonGroup

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiAnswerBasicButtonGroupS(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerBasicButtonGroup

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiAnswerBasicButtonGroupM(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerBasicButtonGroup

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiAnswerBasicButtonGroupL(
    public override val builder: ButtonGroupStyleBuilder,
) : WrapperAiAnswerBasicButtonGroup

private val ButtonGroupStyleBuilder.invariantProps: ButtonGroupStyleBuilder
    @Composable
    get() = this

public val AiAnswerBasicButtonGroup.Xs: WrapperAiAnswerBasicButtonGroupXs
    @Composable
    @JvmName("WrapperAiAnswerBasicButtonGroupXs")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .internalShape(SddsServTheme.shapes.roundXs)
        .externalShape(SddsServTheme.shapes.roundXs)
        .dimensions {
            spacing(8.0.dp)
        }
        .buttonStyle(BasicButton.Xs.Secondary.style())
        .wrap(::WrapperAiAnswerBasicButtonGroupXs)

public val AiAnswerBasicButtonGroup.S: WrapperAiAnswerBasicButtonGroupS
    @Composable
    @JvmName("WrapperAiAnswerBasicButtonGroupS")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .internalShape(SddsServTheme.shapes.roundS)
        .externalShape(SddsServTheme.shapes.roundS)
        .dimensions {
            spacing(8.0.dp)
        }
        .buttonStyle(BasicButton.S.Secondary.style())
        .wrap(::WrapperAiAnswerBasicButtonGroupS)

public val AiAnswerBasicButtonGroup.M: WrapperAiAnswerBasicButtonGroupM
    @Composable
    @JvmName("WrapperAiAnswerBasicButtonGroupM")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .internalShape(SddsServTheme.shapes.roundM)
        .externalShape(SddsServTheme.shapes.roundM)
        .dimensions {
            spacing(8.0.dp)
        }
        .buttonStyle(BasicButton.M.Secondary.style())
        .wrap(::WrapperAiAnswerBasicButtonGroupM)

public val AiAnswerBasicButtonGroup.L: WrapperAiAnswerBasicButtonGroupL
    @Composable
    @JvmName("WrapperAiAnswerBasicButtonGroupL")
    get() = ButtonGroupStyle.builder(this)
        .invariantProps
        .internalShape(SddsServTheme.shapes.roundM)
        .externalShape(SddsServTheme.shapes.roundM)
        .dimensions {
            spacing(8.0.dp)
        }
        .buttonStyle(BasicButton.L.Secondary.style())
        .wrap(::WrapperAiAnswerBasicButtonGroupL)
