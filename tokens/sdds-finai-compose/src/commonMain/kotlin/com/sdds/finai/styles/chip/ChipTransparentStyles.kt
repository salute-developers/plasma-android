// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperChipTransparent : BuilderWrapper<ChipStyle, ChipStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipTransparentView : WrapperChipTransparent

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperChipTransparentTerminate(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparent

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperChipTransparentM(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperChipTransparentMPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperChipTransparentS(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperChipTransparentSPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperChipTransparentXs(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperChipTransparentXsPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperChipTransparentXxs(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

/**
 * Обертка для вариации XxsPilled
 */
@JvmInline
public value class WrapperChipTransparentXxsPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipTransparentView

public val WrapperChipTransparentView.Default: WrapperChipTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultTertiary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultTertiaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultTertiaryHover),
                ),
            )
        }
        .wrap(::WrapperChipTransparentTerminate)

public val WrapperChipTransparentView.Accent: WrapperChipTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentAccentHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultAccentHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultAccentHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultAccentHover),
                ),
            )
        }
        .wrap(::WrapperChipTransparentTerminate)

public val WrapperChipTransparentView.Negative: WrapperChipTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentNegativeHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultNegativeHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultNegativeHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultNegativeHover),
                ),
            )
        }
        .wrap(::WrapperChipTransparentTerminate)

public val WrapperChipTransparentView.Positive: WrapperChipTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentPositiveHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPositiveHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPositiveHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPositiveHover),
                ),
            )
        }
        .wrap(::WrapperChipTransparentTerminate)

public val WrapperChipTransparentView.Warning: WrapperChipTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentWarningHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultWarningHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultWarningHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultWarningHover),
                ),
            )
        }
        .wrap(::WrapperChipTransparentTerminate)

private val ChipStyleBuilder.invariantProps: ChipStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val ChipTransparent.M: WrapperChipTransparentM
    @Composable
    @JvmName("WrapperChipTransparentM")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS.adjustBy(all = -2.0.dp))
        .labelStyle(SddsFinAiTheme.typography.bodyMNormal)
        .dimensions {
            height(40.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
            contentStartPadding(6.0.dp)
            contentEndPadding(6.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(10.0.dp)
        }
        .wrap(::WrapperChipTransparentM)

public val WrapperChipTransparentM.Pilled: WrapperChipTransparentMPilled
    @Composable
    @JvmName("WrapperChipTransparentMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipTransparentMPilled)

public val ChipTransparent.S: WrapperChipTransparentS
    @Composable
    @JvmName("WrapperChipTransparentS")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs)
        .labelStyle(SddsFinAiTheme.typography.bodySNormal)
        .dimensions {
            height(32.0.dp)
            contentStartSize(16.0.dp)
            contentEndSize(16.0.dp)
            contentStartPadding(2.0.dp)
            contentEndPadding(2.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperChipTransparentS)

public val WrapperChipTransparentS.Pilled: WrapperChipTransparentSPilled
    @Composable
    @JvmName("WrapperChipTransparentSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipTransparentSPilled)

public val ChipTransparent.Xs: WrapperChipTransparentXs
    @Composable
    @JvmName("WrapperChipTransparentXs")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs.adjustBy(all = -2.0.dp))
        .labelStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .dimensions {
            height(24.0.dp)
            contentStartSize(12.0.dp)
            contentEndSize(12.0.dp)
            contentStartPadding(2.0.dp)
            contentEndPadding(2.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(6.0.dp)
        }
        .wrap(::WrapperChipTransparentXs)

public val WrapperChipTransparentXs.Pilled: WrapperChipTransparentXsPilled
    @Composable
    @JvmName("WrapperChipTransparentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipTransparentXsPilled)

public val ChipTransparent.Xxs: WrapperChipTransparentXxs
    @Composable
    @JvmName("WrapperChipTransparentXxs")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs.adjustBy(all = -2.0.dp))
        .labelStyle(SddsFinAiTheme.typography.bodyXxsNormal)
        .dimensions {
            height(24.0.dp)
            contentStartSize(12.0.dp)
            contentEndSize(12.0.dp)
            contentStartPadding(2.0.dp)
            contentEndPadding(2.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(4.0.dp)
        }
        .wrap(::WrapperChipTransparentXxs)

public val WrapperChipTransparentXxs.Pilled: WrapperChipTransparentXxsPilled
    @Composable
    @JvmName("WrapperChipTransparentXxsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipTransparentXxsPilled)
