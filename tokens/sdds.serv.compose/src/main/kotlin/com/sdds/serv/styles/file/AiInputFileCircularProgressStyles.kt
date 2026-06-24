// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.`file`

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.FileProgressPlacement
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.FileStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.circularprogressbar.CircularProgressBar
import com.sdds.serv.styles.circularprogressbar.Default
import com.sdds.serv.styles.circularprogressbar.Negative
import com.sdds.serv.styles.circularprogressbar.S
import com.sdds.serv.styles.circularprogressbar.Xs
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiInputFileCircularProgress : BuilderWrapper<FileStyle, FileStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiInputFileCircularProgressView : WrapperAiInputFileCircularProgress

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperAiInputFileCircularProgressTerminate(
    public override val builder: FileStyleBuilder,
) : WrapperAiInputFileCircularProgress

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiInputFileCircularProgressXsView : WrapperAiInputFileCircularProgressView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiInputFileCircularProgressXs(
    public override val builder: FileStyleBuilder,
) : WrapperAiInputFileCircularProgressXsView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiInputFileCircularProgressSView : WrapperAiInputFileCircularProgressView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiInputFileCircularProgressS(
    public override val builder: FileStyleBuilder,
) : WrapperAiInputFileCircularProgressSView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiInputFileCircularProgressMView : WrapperAiInputFileCircularProgressView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiInputFileCircularProgressM(
    public override val builder: FileStyleBuilder,
) : WrapperAiInputFileCircularProgressMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiInputFileCircularProgressLView : WrapperAiInputFileCircularProgressView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiInputFileCircularProgressL(
    public override val builder: FileStyleBuilder,
) : WrapperAiInputFileCircularProgressLView

public val WrapperAiInputFileCircularProgressView.Default:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    get() = builder
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val WrapperAiInputFileCircularProgressView.Negative:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    get() = builder
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

private val FileStyleBuilder.invariantProps: FileStyleBuilder
    @Composable
    get() = this
        .progressPlacement(FileProgressPlacement.Inner)
        .actionPlacement(FileActionPlacement.End)
        .colors {
            backgroundColor(SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultPrimaryActive,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultPrimaryActive,
                ),
            )
        }
        .dimensions {
            descriptionPadding(2.0.dp)
        }

public val WrapperAiInputFileCircularProgressXsView.Default:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressXsViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.Xs.Default.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val WrapperAiInputFileCircularProgressXsView.Negative:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressXsViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.Xs.Negative.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val AiInputFileCircularProgress.Xs: WrapperAiInputFileCircularProgressXs
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressXs")
    get() = FileStyle.builder(this)
        .invariantProps
        .actionButtonStyle(IconButton.Xs.Clear.style())
        .shape(SddsServTheme.shapes.roundS)
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .descriptionStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            paddingStart(4.0.dp)
            paddingTop(3.0.dp)
            paddingEnd(4.0.dp)
            paddingBottom(3.0.dp)
            startContentPadding(6.0.dp)
            endContentPadding(6.0.dp)
        }
        .wrap(::WrapperAiInputFileCircularProgressXs)

public val WrapperAiInputFileCircularProgressSView.Default:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressSViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Default.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val WrapperAiInputFileCircularProgressSView.Negative:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressSViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Negative.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val AiInputFileCircularProgress.S: WrapperAiInputFileCircularProgressS
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressS")
    get() = FileStyle.builder(this)
        .invariantProps
        .actionButtonStyle(IconButton.S.Clear.style())
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .descriptionStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            paddingStart(4.0.dp)
            paddingTop(3.0.dp)
            paddingEnd(4.0.dp)
            paddingBottom(3.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(8.0.dp)
        }
        .wrap(::WrapperAiInputFileCircularProgressS)

public val WrapperAiInputFileCircularProgressMView.Default:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressMViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Default.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val WrapperAiInputFileCircularProgressMView.Negative:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressMViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Negative.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val AiInputFileCircularProgress.M: WrapperAiInputFileCircularProgressM
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressM")
    get() = FileStyle.builder(this)
        .invariantProps
        .actionButtonStyle(IconButton.S.Clear.style())
        .shape(SddsServTheme.shapes.roundM)
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .descriptionStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            paddingStart(6.0.dp)
            paddingTop(4.0.dp)
            paddingEnd(6.0.dp)
            paddingBottom(4.0.dp)
            startContentPadding(10.0.dp)
            endContentPadding(10.0.dp)
        }
        .wrap(::WrapperAiInputFileCircularProgressM)

public val WrapperAiInputFileCircularProgressLView.Default:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressLViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Default.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val WrapperAiInputFileCircularProgressLView.Negative:
    WrapperAiInputFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressLViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Negative.style())
        .colors {
            descriptionColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed) to
                        SddsServTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperAiInputFileCircularProgressTerminate)

public val AiInputFileCircularProgress.L: WrapperAiInputFileCircularProgressL
    @Composable
    @JvmName("WrapperAiInputFileCircularProgressL")
    get() = FileStyle.builder(this)
        .invariantProps
        .actionButtonStyle(IconButton.S.Clear.style())
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .labelStyle(SddsServTheme.typography.bodyLNormal)
        .descriptionStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            paddingStart(8.0.dp)
            paddingTop(8.0.dp)
            paddingEnd(8.0.dp)
            paddingBottom(8.0.dp)
            startContentPadding(12.0.dp)
            endContentPadding(12.0.dp)
        }
        .wrap(::WrapperAiInputFileCircularProgressL)
