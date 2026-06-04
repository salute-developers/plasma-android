// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.aiheader

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ai.AiHeaderStyle
import com.sdds.compose.uikit.ai.AiHeaderStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.buttongroup.AiHeaderEmbeddedIconButtonGroup
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Xl
import com.sdds.serv.styles.iconbutton.AiHeaderEmbeddedIconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import com.sdds.serv.styles.iconbutton.Xl
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiHeader : BuilderWrapper<AiHeaderStyle, AiHeaderStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiHeaderView : WrapperAiHeader

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperAiHeaderTerminate(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeader

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiHeaderXs(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiHeaderS(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiHeaderM(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiHeaderL(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAiHeaderXl(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperAiHeaderH5(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperAiHeaderH4(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperAiHeaderH3(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperAiHeaderH2(
    public override val builder: AiHeaderStyleBuilder,
) : WrapperAiHeaderView

public val WrapperAiHeaderView.Default: WrapperAiHeaderTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }
        .wrap(::WrapperAiHeaderTerminate)

public val WrapperAiHeaderView.Secondary: WrapperAiHeaderTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPrimary).asStatefulValue(),
            )
        }
        .wrap(::WrapperAiHeaderTerminate)

public val WrapperAiHeaderView.Clear: WrapperAiHeaderTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultClear).asStatefulValue(),
            )
        }
        .wrap(::WrapperAiHeaderTerminate)

private val AiHeaderStyleBuilder.invariantProps: AiHeaderStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
            subtitleColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(),
            )
            dividerColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }

public val AiHeader.Xs: WrapperAiHeaderXs
    @Composable
    @JvmName("WrapperAiHeaderXs")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyXsBold)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            textPaddingStart(10.0.dp)
            textPaddingEnd(10.0.dp)
            textPaddingTop(9.0.dp)
            textPaddingBottom(9.0.dp)
            subtitlePadding(4.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.S.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.S.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.S.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.S.style())
        .wrap(::WrapperAiHeaderXs)

public val AiHeader.S: WrapperAiHeaderS
    @Composable
    @JvmName("WrapperAiHeaderS")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodySBold)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
            textPaddingStart(10.0.dp)
            textPaddingEnd(10.0.dp)
            textPaddingTop(7.0.dp)
            textPaddingBottom(7.0.dp)
            subtitlePadding(4.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.S.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.S.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.S.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.S.style())
        .wrap(::WrapperAiHeaderS)

public val AiHeader.M: WrapperAiHeaderM
    @Composable
    @JvmName("WrapperAiHeaderM")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyMBold)
        .subtitleStyle(SddsServTheme.typography.bodySNormal)
        .dimensions {
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textPaddingStart(8.0.dp)
            textPaddingEnd(8.0.dp)
            textPaddingTop(10.0.dp)
            textPaddingBottom(10.0.dp)
            subtitlePadding(6.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.M.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.M.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.M.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.M.style())
        .wrap(::WrapperAiHeaderM)

public val AiHeader.L: WrapperAiHeaderL
    @Composable
    @JvmName("WrapperAiHeaderL")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyLBold)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .dimensions {
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textPaddingStart(12.0.dp)
            textPaddingEnd(12.0.dp)
            textPaddingTop(13.0.dp)
            textPaddingBottom(13.0.dp)
            subtitlePadding(8.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.L.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.L.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.L.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.L.style())
        .wrap(::WrapperAiHeaderL)

public val AiHeader.Xl: WrapperAiHeaderXl
    @Composable
    @JvmName("WrapperAiHeaderXl")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyLBold)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .dimensions {
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textPaddingStart(18.0.dp)
            textPaddingEnd(18.0.dp)
            textPaddingTop(17.0.dp)
            textPaddingBottom(17.0.dp)
            subtitlePadding(8.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.Xl.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.Xl.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.Xl.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.Xl.style())
        .wrap(::WrapperAiHeaderXl)

public val AiHeader.H5: WrapperAiHeaderH5
    @Composable
    @JvmName("WrapperAiHeaderH5")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH5Bold)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .dimensions {
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
            textPaddingStart(10.0.dp)
            textPaddingEnd(10.0.dp)
            textPaddingTop(4.0.dp)
            textPaddingBottom(4.0.dp)
            subtitlePadding(4.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.S.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.S.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.S.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.S.style())
        .wrap(::WrapperAiHeaderH5)

public val AiHeader.H4: WrapperAiHeaderH4
    @Composable
    @JvmName("WrapperAiHeaderH4")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH4Bold)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textPaddingStart(8.0.dp)
            textPaddingEnd(8.0.dp)
            textPaddingTop(7.0.dp)
            textPaddingBottom(7.0.dp)
            subtitlePadding(6.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.M.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.M.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.M.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.M.style())
        .wrap(::WrapperAiHeaderH4)

public val AiHeader.H3: WrapperAiHeaderH3
    @Composable
    @JvmName("WrapperAiHeaderH3")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH3Bold)
        .subtitleStyle(SddsServTheme.typography.bodyLNormal)
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textPaddingStart(12.0.dp)
            textPaddingEnd(12.0.dp)
            textPaddingTop(9.0.dp)
            textPaddingBottom(9.0.dp)
            subtitlePadding(8.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.L.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.L.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.L.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.L.style())
        .wrap(::WrapperAiHeaderH3)

public val AiHeader.H2: WrapperAiHeaderH2
    @Composable
    @JvmName("WrapperAiHeaderH2")
    get() = AiHeaderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.headerH2Bold)
        .subtitleStyle(SddsServTheme.typography.bodyLNormal)
        .dimensions {
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textPaddingStart(18.0.dp)
            textPaddingEnd(18.0.dp)
            textPaddingTop(10.0.dp)
            textPaddingBottom(10.0.dp)
            subtitlePadding(8.0.dp)
        }
        .startButtonStyle(AiHeaderEmbeddedIconButton.Xl.Secondary.style())
        .endButtonStyle(AiHeaderEmbeddedIconButton.Xl.Secondary.style())
        .startButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.Xl.style())
        .endButtonGroupStyle(AiHeaderEmbeddedIconButtonGroup.Xl.style())
        .wrap(::WrapperAiHeaderH2)
