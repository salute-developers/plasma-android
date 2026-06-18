// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.aiinput

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.ai.AiInputMode
import com.sdds.compose.uikit.ai.AiInputStyle
import com.sdds.compose.uikit.ai.AiInputStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.buttongroup.AiInputIconButtonGroup
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.`file`.AiInputFileCircularProgress
import com.sdds.serv.styles.`file`.Default
import com.sdds.serv.styles.`file`.L
import com.sdds.serv.styles.`file`.M
import com.sdds.serv.styles.`file`.S
import com.sdds.serv.styles.`file`.Xs
import com.sdds.serv.styles.iconbutton.Accent
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.styles.scrollbar.S
import com.sdds.serv.styles.scrollbar.ScrollBar
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiInputCondensed : BuilderWrapper<AiInputStyle, AiInputStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiInputCondensedXs(
    public override val builder: AiInputStyleBuilder,
) : WrapperAiInputCondensed

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiInputCondensedS(
    public override val builder: AiInputStyleBuilder,
) : WrapperAiInputCondensed

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiInputCondensedM(
    public override val builder: AiInputStyleBuilder,
) : WrapperAiInputCondensed

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiInputCondensedL(
    public override val builder: AiInputStyleBuilder,
) : WrapperAiInputCondensed

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAiInputCondensedXl(
    public override val builder: AiInputStyleBuilder,
) : WrapperAiInputCondensed

private val AiInputStyleBuilder.invariantProps: AiInputStyleBuilder
    @Composable
    get() = this
        .mode(AiInputMode.Condensed)
        .scrollBarStyle(ScrollBar.S.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPrimary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            inputColor(SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue())
            placeholderColor(SolidColor(SddsServTheme.colors.textDefaultSecondary).asStatefulValue())
            cursorColor(SolidColor(SddsServTheme.colors.textDefaultAccent).asStatefulValue())
        }

public val AiInputCondensed.Xs: WrapperAiInputCondensedXs
    @Composable
    @JvmName("WrapperAiInputCondensedXs")
    get() = AiInputStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .inputStyle(SddsServTheme.typography.bodyXsNormal)
        .placeholderStyle(SddsServTheme.typography.bodyXsNormal)
        .fileStyle(AiInputFileCircularProgress.Xs.Default.style())
        .startButtonGroupStyle(AiInputIconButtonGroup.Xs.NoGap.Default.style())
        .endButtonGroupStyle(AiInputIconButtonGroup.Xs.NoGap.Default.style())
        .sendButtonStyle(IconButton.Xs.Accent.style())
        .dimensions {
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            textFieldPaddingStart(10.0.dp)
            textFieldPaddingEnd(10.0.dp)
            textFieldPaddingTop(9.0.dp)
            textFieldPaddingBottom(9.0.dp)
            contentPadding(4.0.dp)
            contentSpacing(2.0.dp)
            scrollBarPaddingStart(0.0.dp)
            scrollBarPaddingTop(3.0.dp)
            scrollBarPaddingBottom(3.0.dp)
        }
        .wrap(::WrapperAiInputCondensedXs)

public val AiInputCondensed.S: WrapperAiInputCondensedS
    @Composable
    @JvmName("WrapperAiInputCondensedS")
    get() = AiInputStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .inputStyle(SddsServTheme.typography.bodySNormal)
        .placeholderStyle(SddsServTheme.typography.bodySNormal)
        .fileStyle(AiInputFileCircularProgress.Xs.Default.style())
        .startButtonGroupStyle(AiInputIconButtonGroup.Xs.NoGap.Default.style())
        .endButtonGroupStyle(AiInputIconButtonGroup.Xs.NoGap.Default.style())
        .sendButtonStyle(IconButton.Xs.Accent.style())
        .dimensions {
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
            textFieldPaddingStart(10.0.dp)
            textFieldPaddingEnd(10.0.dp)
            textFieldPaddingTop(7.0.dp)
            textFieldPaddingBottom(7.0.dp)
            contentPadding(6.0.dp)
            contentSpacing(2.0.dp)
            scrollBarPaddingStart(2.0.dp)
            scrollBarPaddingTop(12.0.dp)
            scrollBarPaddingBottom(12.0.dp)
        }
        .wrap(::WrapperAiInputCondensedS)

public val AiInputCondensed.M: WrapperAiInputCondensedM
    @Composable
    @JvmName("WrapperAiInputCondensedM")
    get() = AiInputStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXl.adjustBy(all = -2.0.dp))
        .inputStyle(SddsServTheme.typography.bodyMNormal)
        .placeholderStyle(SddsServTheme.typography.bodyMNormal)
        .fileStyle(AiInputFileCircularProgress.S.Default.style())
        .startButtonGroupStyle(AiInputIconButtonGroup.S.NoGap.Default.style())
        .endButtonGroupStyle(AiInputIconButtonGroup.S.NoGap.Default.style())
        .sendButtonStyle(IconButton.S.Accent.style())
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textFieldPaddingStart(10.0.dp)
            textFieldPaddingEnd(10.0.dp)
            textFieldPaddingTop(10.0.dp)
            textFieldPaddingBottom(10.0.dp)
            contentPadding(6.0.dp)
            contentSpacing(2.0.dp)
            scrollBarPaddingStart(4.0.dp)
            scrollBarPaddingTop(12.0.dp)
            scrollBarPaddingBottom(12.0.dp)
        }
        .wrap(::WrapperAiInputCondensedM)

public val AiInputCondensed.L: WrapperAiInputCondensedL
    @Composable
    @JvmName("WrapperAiInputCondensedL")
    get() = AiInputStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXl)
        .inputStyle(SddsServTheme.typography.bodyLNormal)
        .placeholderStyle(SddsServTheme.typography.bodyLNormal)
        .fileStyle(AiInputFileCircularProgress.M.Default.style())
        .startButtonGroupStyle(AiInputIconButtonGroup.M.NoGap.Default.style())
        .endButtonGroupStyle(AiInputIconButtonGroup.M.NoGap.Default.style())
        .sendButtonStyle(IconButton.M.Accent.style())
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textFieldPaddingStart(12.0.dp)
            textFieldPaddingEnd(12.0.dp)
            textFieldPaddingTop(12.0.dp)
            textFieldPaddingBottom(12.0.dp)
            contentPadding(8.0.dp)
            contentSpacing(2.0.dp)
            scrollBarPaddingStart(4.0.dp)
            scrollBarPaddingTop(12.0.dp)
            scrollBarPaddingBottom(12.0.dp)
        }
        .wrap(::WrapperAiInputCondensedL)

public val AiInputCondensed.Xl: WrapperAiInputCondensedXl
    @Composable
    @JvmName("WrapperAiInputCondensedXl")
    get() = AiInputStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXl.adjustBy(all = 2.0.dp))
        .inputStyle(SddsServTheme.typography.bodyLNormal)
        .placeholderStyle(SddsServTheme.typography.bodyLNormal)
        .fileStyle(AiInputFileCircularProgress.L.Default.style())
        .startButtonGroupStyle(AiInputIconButtonGroup.L.NoGap.Default.style())
        .endButtonGroupStyle(AiInputIconButtonGroup.L.NoGap.Default.style())
        .sendButtonStyle(IconButton.L.Accent.style())
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textFieldPaddingStart(18.0.dp)
            textFieldPaddingEnd(18.0.dp)
            textFieldPaddingTop(16.0.dp)
            textFieldPaddingBottom(16.0.dp)
            contentPadding(8.0.dp)
            contentSpacing(2.0.dp)
            scrollBarPaddingStart(4.0.dp)
            scrollBarPaddingTop(12.0.dp)
            scrollBarPaddingBottom(12.0.dp)
        }
        .wrap(::WrapperAiInputCondensedXl)
