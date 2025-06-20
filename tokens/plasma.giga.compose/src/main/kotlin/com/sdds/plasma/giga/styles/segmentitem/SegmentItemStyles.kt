// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.segmentitem

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.counter.Accent
import com.sdds.plasma.giga.styles.counter.Counter
import com.sdds.plasma.giga.styles.counter.S
import com.sdds.plasma.giga.styles.counter.Xs
import com.sdds.plasma.giga.styles.counter.Xxs
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSegmentItem : BuilderWrapper<SegmentItemStyle, SegmentItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemView : WrapperSegmentItem

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSegmentItemTerminate(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItem

/**
 * Интерфейс, который реализуют все обертки вариации xl
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemXlView : WrapperSegmentItemView

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSegmentItemXl(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemXlView

/**
 * Обертка для вариации XlPilled
 */
@JvmInline
public value class WrapperSegmentItemXlPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemXlView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemLView : WrapperSegmentItemView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSegmentItemL(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemLView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperSegmentItemLPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemLView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemMView : WrapperSegmentItemView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSegmentItemM(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemMView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperSegmentItemMPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemMView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemSView : WrapperSegmentItemView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSegmentItemS(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemSView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperSegmentItemSPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemSView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemXsView : WrapperSegmentItemView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSegmentItemXs(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemXsView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperSegmentItemXsPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemXsView

public val WrapperSegmentItemView.Primary: WrapperSegmentItemTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemView.Secondary: WrapperSegmentItemTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemView.Accent: WrapperSegmentItemTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

private val SegmentItemStyleBuilder.invariantProps: SegmentItemStyleBuilder
    @Composable
    get() = this

public val WrapperSegmentItemXlView.Accent: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemXlViewAccent")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .counterStyle(
            Counter.S.Accent.modify {
                colors {
                    backgroundColor(
                        PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault,
                        ),
                    )
                    textColor(
                        PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.textOnLightPrimary,
                        ),
                    )
                }
            }.style(),
        )
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemXlView.Primary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemXlViewPrimary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemXlView.Secondary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemXlViewSecondary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val SegmentItem.Xl: WrapperSegmentItemXl
    @Composable
    @JvmName("WrapperSegmentItemXl")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 0.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyLBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyLBold)
        .dimensions {
            minWidth(110.0.dp)
            minHeight(64.0.dp)
            paddingStart(28.0.dp)
            paddingEnd(28.0.dp)
            startContentPadding(6.0.dp)
            endContentPadding(6.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(6.0.dp)
        }
        .counterStyle(Counter.S.Accent.style())
        .wrap(::WrapperSegmentItemXl)

public val WrapperSegmentItemXl.Pilled: WrapperSegmentItemXlPilled
    @Composable
    @JvmName("WrapperSegmentItemXlPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(94.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
        }
        .wrap(::WrapperSegmentItemXlPilled)

public val WrapperSegmentItemLView.Accent: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemLViewAccent")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .counterStyle(
            Counter.S.Accent.modify {
                colors {
                    backgroundColor(
                        PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault,
                        ),
                    )
                    textColor(
                        PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.textOnLightPrimary,
                        ),
                    )
                }
            }.style(),
        )
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemLView.Primary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemLViewPrimary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemLView.Secondary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemLViewSecondary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val SegmentItem.L: WrapperSegmentItemL
    @Composable
    @JvmName("WrapperSegmentItemL")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyLBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyLBold)
        .dimensions {
            minWidth(102.0.dp)
            minHeight(56.0.dp)
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            startContentPadding(6.0.dp)
            endContentPadding(6.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(6.0.dp)
        }
        .counterStyle(Counter.S.Accent.style())
        .wrap(::WrapperSegmentItemL)

public val WrapperSegmentItemL.Pilled: WrapperSegmentItemLPilled
    @Composable
    @JvmName("WrapperSegmentItemLPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(86.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
        }
        .wrap(::WrapperSegmentItemLPilled)

public val WrapperSegmentItemMView.Accent: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemMViewAccent")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .counterStyle(
            Counter.Xs.Accent.modify {
                colors {
                    backgroundColor(
                        PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault,
                        ),
                    )
                    textColor(
                        PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.textOnLightPrimary,
                        ),
                    )
                }
            }.style(),
        )
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemMView.Primary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemMViewPrimary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemMView.Secondary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemMViewSecondary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val SegmentItem.M: WrapperSegmentItemM
    @Composable
    @JvmName("WrapperSegmentItemM")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = 0.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyMBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyMBold)
        .dimensions {
            minWidth(88.0.dp)
            minHeight(48.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            startContentPadding(4.0.dp)
            endContentPadding(4.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(4.0.dp)
        }
        .counterStyle(Counter.Xs.Accent.style())
        .wrap(::WrapperSegmentItemM)

public val WrapperSegmentItemM.Pilled: WrapperSegmentItemMPilled
    @Composable
    @JvmName("WrapperSegmentItemMPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(72.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
        }
        .wrap(::WrapperSegmentItemMPilled)

public val WrapperSegmentItemSView.Accent: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemSViewAccent")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .counterStyle(
            Counter.Xs.Accent.modify {
                colors {
                    backgroundColor(
                        PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault,
                        ),
                    )
                    textColor(
                        PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.textOnLightPrimary,
                        ),
                    )
                }
            }.style(),
        )
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemSView.Primary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemSViewPrimary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemSView.Secondary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemSViewSecondary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val SegmentItem.S: WrapperSegmentItemS
    @Composable
    @JvmName("WrapperSegmentItemS")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodySBold)
        .valueStyle(PlasmaGigaTheme.typography.bodySBold)
        .dimensions {
            minWidth(75.0.dp)
            minHeight(40.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            startContentPadding(2.0.dp)
            endContentPadding(2.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(2.0.dp)
        }
        .counterStyle(Counter.Xs.Accent.style())
        .wrap(::WrapperSegmentItemS)

public val WrapperSegmentItemS.Pilled: WrapperSegmentItemSPilled
    @Composable
    @JvmName("WrapperSegmentItemSPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(59.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperSegmentItemSPilled)

public val WrapperSegmentItemXsView.Accent: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemXsViewAccent")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .counterStyle(
            Counter.Xxs.Accent.modify {
                colors {
                    backgroundColor(
                        PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault,
                        ),
                    )
                    textColor(
                        PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                            setOf(InteractiveState.Selected)
                                to PlasmaGigaTheme.colors.textOnLightPrimary,
                        ),
                    )
                }
            }.style(),
        )
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemXsView.Primary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemXsViewPrimary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemXsView.Secondary: WrapperSegmentItemTerminate
    @Composable
    @JvmName("WrapperSegmentItemXsViewSecondary")
    get() = builder
        .colors {
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val SegmentItem.Xs: WrapperSegmentItemXs
    @Composable
    @JvmName("WrapperSegmentItemXs")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundS.adjustBy(all = 0.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyXsBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyXsBold)
        .dimensions {
            minWidth(61.0.dp)
            minHeight(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            startContentPadding(2.0.dp)
            endContentPadding(2.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            valueMargin(2.0.dp)
        }
        .counterStyle(Counter.Xxs.Accent.style())
        .wrap(::WrapperSegmentItemXs)

public val WrapperSegmentItemXs.Pilled: WrapperSegmentItemXsPilled
    @Composable
    @JvmName("WrapperSegmentItemXsPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(53.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperSegmentItemXsPilled)
