// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.`file`

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
import com.sdds.plasma.giga.app.styles.iconbutton.Clear
import com.sdds.plasma.giga.app.styles.iconbutton.IconButton
import com.sdds.plasma.giga.app.styles.iconbutton.Xs
import com.sdds.plasma.giga.app.styles.progressbar.Default
import com.sdds.plasma.giga.app.styles.progressbar.Negative
import com.sdds.plasma.giga.app.styles.progressbar.ProgressBar
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperFileLinearProgress : BuilderWrapper<FileStyle, FileStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileLinearProgressView : WrapperFileLinearProgress

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperFileLinearProgressTerminate(
    public override val builder: FileStyleBuilder,
) : WrapperFileLinearProgress

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileLinearProgressXsView : WrapperFileLinearProgressView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperFileLinearProgressXs(
    public override val builder: FileStyleBuilder,
) : WrapperFileLinearProgressXsView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileLinearProgressSView : WrapperFileLinearProgressView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperFileLinearProgressS(
    public override val builder: FileStyleBuilder,
) : WrapperFileLinearProgressSView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileLinearProgressMView : WrapperFileLinearProgressView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperFileLinearProgressM(
    public override val builder: FileStyleBuilder,
) : WrapperFileLinearProgressMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFileLinearProgressLView : WrapperFileLinearProgressView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperFileLinearProgressL(
    public override val builder: FileStyleBuilder,
) : WrapperFileLinearProgressLView

public val WrapperFileLinearProgressView.Default: WrapperFileLinearProgressTerminate
    @Composable
    get() = builder
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val WrapperFileLinearProgressView.Negative: WrapperFileLinearProgressTerminate
    @Composable
    get() = builder
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

private val FileStyleBuilder.invariantProps: FileStyleBuilder
    @Composable
    get() = this
        .progressPlacement(FileProgressPlacement.Outer)
        .actionPlacement(FileActionPlacement.End)
        .actionButtonStyle(IconButton.Xs.Clear.style())
        .colors {
            labelColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryActive,
                ),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryActive,
                ),
            )
        }
        .dimensions {
            bottomContentPadding(8.0.dp)
            descriptionPadding(2.0.dp)
        }

public val WrapperFileLinearProgressXsView.Default: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressXsViewDefault")
    get() = builder
        .progressBarStyle(ProgressBar.Default.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val WrapperFileLinearProgressXsView.Negative: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressXsViewNegative")
    get() = builder
        .progressBarStyle(ProgressBar.Negative.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val FileLinearProgress.Xs: WrapperFileLinearProgressXs
    @Composable
    @JvmName("WrapperFileLinearProgressXs")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            startContentPadding(6.0.dp)
            endContentPadding(6.0.dp)
        }
        .wrap(::WrapperFileLinearProgressXs)

public val WrapperFileLinearProgressSView.Default: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressSViewDefault")
    get() = builder
        .progressBarStyle(ProgressBar.Default.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val WrapperFileLinearProgressSView.Negative: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressSViewNegative")
    get() = builder
        .progressBarStyle(ProgressBar.Negative.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val FileLinearProgress.S: WrapperFileLinearProgressS
    @Composable
    @JvmName("WrapperFileLinearProgressS")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            startContentPadding(8.0.dp)
            endContentPadding(8.0.dp)
        }
        .wrap(::WrapperFileLinearProgressS)

public val WrapperFileLinearProgressMView.Default: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressMViewDefault")
    get() = builder
        .progressBarStyle(ProgressBar.Default.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val WrapperFileLinearProgressMView.Negative: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressMViewNegative")
    get() = builder
        .progressBarStyle(ProgressBar.Negative.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val FileLinearProgress.M: WrapperFileLinearProgressM
    @Composable
    @JvmName("WrapperFileLinearProgressM")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            startContentPadding(10.0.dp)
            endContentPadding(10.0.dp)
        }
        .wrap(::WrapperFileLinearProgressM)

public val WrapperFileLinearProgressLView.Default: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressLViewDefault")
    get() = builder
        .progressBarStyle(ProgressBar.Default.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val WrapperFileLinearProgressLView.Negative: WrapperFileLinearProgressTerminate
    @Composable
    @JvmName("WrapperFileLinearProgressLViewNegative")
    get() = builder
        .progressBarStyle(ProgressBar.Negative.style())
        .colors {
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeHover,
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultNegativeActive,
                ),
            )
        }
        .wrap(::WrapperFileLinearProgressTerminate)

public val FileLinearProgress.L: WrapperFileLinearProgressL
    @Composable
    @JvmName("WrapperFileLinearProgressL")
    get() = FileStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            startContentPadding(12.0.dp)
            endContentPadding(12.0.dp)
        }
        .wrap(::WrapperFileLinearProgressL)
