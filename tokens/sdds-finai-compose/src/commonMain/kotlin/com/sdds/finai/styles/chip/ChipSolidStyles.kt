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
public interface WrapperChipSolid : BuilderWrapper<ChipStyle, ChipStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipSolidView : WrapperChipSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperChipSolidTerminate(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolid

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperChipSolidM(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperChipSolidMPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperChipSolidS(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperChipSolidSPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperChipSolidXs(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperChipSolidXsPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperChipSolidXxs(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

/**
 * Обертка для вариации XxsPilled
 */
@JvmInline
public value class WrapperChipSolidXxsPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipSolidView

public val WrapperChipSolidView.Default: WrapperChipSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperChipSolidTerminate)

public val WrapperChipSolidView.Accent: WrapperChipSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperChipSolidTerminate)

public val WrapperChipSolidView.Negative: WrapperChipSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperChipSolidTerminate)

public val WrapperChipSolidView.Positive: WrapperChipSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultPositiveHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperChipSolidTerminate)

public val WrapperChipSolidView.Warning: WrapperChipSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperChipSolidTerminate)

public val WrapperChipSolidView.Clear: WrapperChipSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultClearActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultClearHover),
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
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperChipSolidTerminate)

private val ChipStyleBuilder.invariantProps: ChipStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val ChipSolid.M: WrapperChipSolidM
    @Composable
    @JvmName("WrapperChipSolidM")
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
        .wrap(::WrapperChipSolidM)

public val WrapperChipSolidM.Pilled: WrapperChipSolidMPilled
    @Composable
    @JvmName("WrapperChipSolidMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipSolidMPilled)

public val ChipSolid.S: WrapperChipSolidS
    @Composable
    @JvmName("WrapperChipSolidS")
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
        .wrap(::WrapperChipSolidS)

public val WrapperChipSolidS.Pilled: WrapperChipSolidSPilled
    @Composable
    @JvmName("WrapperChipSolidSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipSolidSPilled)

public val ChipSolid.Xs: WrapperChipSolidXs
    @Composable
    @JvmName("WrapperChipSolidXs")
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
        .wrap(::WrapperChipSolidXs)

public val WrapperChipSolidXs.Pilled: WrapperChipSolidXsPilled
    @Composable
    @JvmName("WrapperChipSolidXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipSolidXsPilled)

public val ChipSolid.Xxs: WrapperChipSolidXxs
    @Composable
    @JvmName("WrapperChipSolidXxs")
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
        .wrap(::WrapperChipSolidXxs)

public val WrapperChipSolidXxs.Pilled: WrapperChipSolidXxsPilled
    @Composable
    @JvmName("WrapperChipSolidXxsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipSolidXxsPilled)
