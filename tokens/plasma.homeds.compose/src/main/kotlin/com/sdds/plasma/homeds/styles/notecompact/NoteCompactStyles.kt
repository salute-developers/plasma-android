// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.notecompact

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ContentBeforeVerticalArrangement
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.NoteCompactStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.linkbutton.Info
import com.sdds.plasma.homeds.styles.linkbutton.LinkButton
import com.sdds.plasma.homeds.styles.linkbutton.Negative
import com.sdds.plasma.homeds.styles.linkbutton.Positive
import com.sdds.plasma.homeds.styles.linkbutton.S
import com.sdds.plasma.homeds.styles.linkbutton.Warning
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNoteCompact : BuilderWrapper<NoteCompactStyle, NoteCompactStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteCompactView : WrapperNoteCompact

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperNoteCompactTerminate(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompact

/**
 * Обертка для вариации ContentBeforeFixed
 */
@JvmInline
public value class WrapperNoteCompactContentBeforeFixed(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactView

/**
 * Обертка для вариации ContentBeforeFixedHasClose
 */
@JvmInline
public value class WrapperNoteCompactContentBeforeFixedHasClose(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactView

/**
 * Обертка для вариации ContentBeforeScalable
 */
@JvmInline
public value class WrapperNoteCompactContentBeforeScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactView

/**
 * Обертка для вариации ContentBeforeScalableHasClose
 */
@JvmInline
public value class WrapperNoteCompactContentBeforeScalableHasClose(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactView

public val WrapperNoteCompactView.Default: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .linkButtonStyle(LinkButton.S.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue(),
            )
            iconColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Positive: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .linkButtonStyle(LinkButton.S.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultPositiveMinor).asStatefulValue(),
            )
            iconColor(
                PlasmaHomeDsTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Negative: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .linkButtonStyle(LinkButton.S.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultNegativeMinor).asStatefulValue(),
            )
            iconColor(
                PlasmaHomeDsTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Warning: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .linkButtonStyle(LinkButton.S.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultWarningMinor).asStatefulValue(),
            )
            iconColor(
                PlasmaHomeDsTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Info: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .linkButtonStyle(LinkButton.S.Info.style())
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultInfoMinor).asStatefulValue(),
            )
            iconColor(
                PlasmaHomeDsTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

private val NoteCompactStyleBuilder.invariantProps: NoteCompactStyleBuilder
    @Composable
    get() = this
        .shape(PlasmaHomeDsTheme.shapes.roundXl)
        .colors {
            closeColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .titleStyle(PlasmaHomeDsTheme.typography.textSBold)
        .textStyle(PlasmaHomeDsTheme.typography.textSNormal)
        .dimensions {
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(16.0.dp)
            textTopMargin(2.0.dp)
            closeStartMargin(0.0.dp)
            actionStartMargin(12.0.dp)
            actionEndMargin(0.0.dp)
        }

public val NoteCompact.ContentBeforeFixed: WrapperNoteCompactContentBeforeFixed
    @Composable
    @JvmName("WrapperNoteCompactContentBeforeFixed")
    get() = NoteCompactStyle.builder(this)
        .invariantProps
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .dimensions {
            iconSize(16.0.dp)
            contentBeforeEndMargin(8.0.dp)
        }
        .wrap(::WrapperNoteCompactContentBeforeFixed)

public val WrapperNoteCompactContentBeforeFixed.HasClose:
    WrapperNoteCompactContentBeforeFixedHasClose
    @Composable
    @JvmName("WrapperNoteCompactContentBeforeFixedHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingEnd(10.0.dp)
            closeSize(24.0.dp)
            closeStartMargin(2.0.dp)
            actionEndMargin(14.0.dp)
        }
        .wrap(::WrapperNoteCompactContentBeforeFixedHasClose)

public val NoteCompact.ContentBeforeScalable: WrapperNoteCompactContentBeforeScalable
    @Composable
    @JvmName("WrapperNoteCompactContentBeforeScalable")
    get() = NoteCompactStyle.builder(this)
        .invariantProps
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(20.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteCompactContentBeforeScalable)

public val WrapperNoteCompactContentBeforeScalable.HasClose:
    WrapperNoteCompactContentBeforeScalableHasClose
    @Composable
    @JvmName("WrapperNoteCompactContentBeforeScalableHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingEnd(10.0.dp)
            closeSize(24.0.dp)
            closeStartMargin(2.0.dp)
            actionEndMargin(14.0.dp)
        }
        .wrap(::WrapperNoteCompactContentBeforeScalableHasClose)
