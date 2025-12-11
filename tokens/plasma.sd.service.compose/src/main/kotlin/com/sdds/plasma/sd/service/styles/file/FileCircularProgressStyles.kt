// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.`file`

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.FileProgressPlacement
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.FileStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.sd.service.styles.circularprogressbar.Default
import com.sdds.plasma.sd.service.styles.circularprogressbar.Negative
import com.sdds.plasma.sd.service.styles.circularprogressbar.S
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xs
import com.sdds.plasma.sd.service.styles.iconbutton.Clear
import com.sdds.plasma.sd.service.styles.iconbutton.IconButton
import com.sdds.plasma.sd.service.styles.iconbutton.S
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperFileCircularProgress : BuilderWrapper<FileStyle, FileStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileCircularProgressView : WrapperFileCircularProgress

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperFileCircularProgressTerminate(
    public override val builder: FileStyleBuilder,
) : WrapperFileCircularProgress

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileCircularProgressXsView : WrapperFileCircularProgressView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperFileCircularProgressXs(
    public override val builder: FileStyleBuilder,
) : WrapperFileCircularProgressXsView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileCircularProgressSView : WrapperFileCircularProgressView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperFileCircularProgressS(
    public override val builder: FileStyleBuilder,
) : WrapperFileCircularProgressSView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileCircularProgressMView : WrapperFileCircularProgressView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperFileCircularProgressM(
    public override val builder: FileStyleBuilder,
) : WrapperFileCircularProgressMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileCircularProgressLView : WrapperFileCircularProgressView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperFileCircularProgressL(
    public override val builder: FileStyleBuilder,
) : WrapperFileCircularProgressLView

public val WrapperFileCircularProgressView.Default: WrapperFileCircularProgressTerminate
    @Composable
    get() = builder
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val WrapperFileCircularProgressView.Negative: WrapperFileCircularProgressTerminate
    @Composable
    get() = builder
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

private val FileStyleBuilder.invariantProps: FileStyleBuilder
    @Composable
    get() = this
        .progressPlacement(FileProgressPlacement.Inner)
        .actionPlacement(FileActionPlacement.End)
        .colors {
            labelColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                ),
            )
        }
        .dimensions {
            descriptionPadding(2.0.dp)
        }

public val WrapperFileCircularProgressXsView.Default: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressXsViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.Xs.Default.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val WrapperFileCircularProgressXsView.Negative: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressXsViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.Xs.Negative.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val FileCircularProgress.Xs: WrapperFileCircularProgressXs
    @Composable
    @JvmName("WrapperFileCircularProgressXs")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .dimensions {
            startContentPadding(6.0.dp)
            endContentPadding(6.0.dp)
        }
        .wrap(::WrapperFileCircularProgressXs)

public val WrapperFileCircularProgressSView.Default: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressSViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Default.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val WrapperFileCircularProgressSView.Negative: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressSViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Negative.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val FileCircularProgress.S: WrapperFileCircularProgressS
    @Composable
    @JvmName("WrapperFileCircularProgressS")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .actionButtonStyle(IconButton.S.Clear.style())
        .dimensions {
            startContentPadding(8.0.dp)
            endContentPadding(8.0.dp)
        }
        .wrap(::WrapperFileCircularProgressS)

public val WrapperFileCircularProgressMView.Default: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressMViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Default.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val WrapperFileCircularProgressMView.Negative: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressMViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Negative.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val FileCircularProgress.M: WrapperFileCircularProgressM
    @Composable
    @JvmName("WrapperFileCircularProgressM")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .actionButtonStyle(IconButton.S.Clear.style())
        .dimensions {
            startContentPadding(10.0.dp)
            endContentPadding(10.0.dp)
        }
        .wrap(::WrapperFileCircularProgressM)

public val WrapperFileCircularProgressLView.Default: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressLViewDefault")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Default.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val WrapperFileCircularProgressLView.Negative: WrapperFileCircularProgressTerminate
    @Composable
    @JvmName("WrapperFileCircularProgressLViewNegative")
    get() = builder
        .circularProgressBarStyle(CircularProgressBar.S.Negative.style())
        .colors {
            descriptionColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileCircularProgressTerminate)

public val FileCircularProgress.L: WrapperFileCircularProgressL
    @Composable
    @JvmName("WrapperFileCircularProgressL")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .actionButtonStyle(IconButton.S.Clear.style())
        .dimensions {
            startContentPadding(12.0.dp)
            endContentPadding(12.0.dp)
        }
        .wrap(::WrapperFileCircularProgressL)
