// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.notecompact

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ContentBeforeVerticalArrangement
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.NoteCompactStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.linkbutton.Info
import com.sdds.serv.styles.linkbutton.L
import com.sdds.serv.styles.linkbutton.LinkButton
import com.sdds.serv.styles.linkbutton.M
import com.sdds.serv.styles.linkbutton.Negative
import com.sdds.serv.styles.linkbutton.Positive
import com.sdds.serv.styles.linkbutton.S
import com.sdds.serv.styles.linkbutton.Warning
import com.sdds.serv.styles.linkbutton.Xs
import com.sdds.serv.theme.SddsServTheme
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
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteCompactLView : WrapperNoteCompactView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperNoteCompactL(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactLView

/**
 * Обертка для вариации LHasClose
 */
@JvmInline
public value class WrapperNoteCompactLHasClose(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactLView

/**
 * Обертка для вариации LContentScalable
 */
@JvmInline
public value class WrapperNoteCompactLContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactLView

/**
 * Обертка для вариации LHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteCompactLHasCloseContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactLView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteCompactMView : WrapperNoteCompactView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperNoteCompactM(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactMView

/**
 * Обертка для вариации MHasClose
 */
@JvmInline
public value class WrapperNoteCompactMHasClose(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactMView

/**
 * Обертка для вариации MContentScalable
 */
@JvmInline
public value class WrapperNoteCompactMContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactMView

/**
 * Обертка для вариации MHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteCompactMHasCloseContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactMView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteCompactSView : WrapperNoteCompactView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperNoteCompactS(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactSView

/**
 * Обертка для вариации SHasClose
 */
@JvmInline
public value class WrapperNoteCompactSHasClose(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactSView

/**
 * Обертка для вариации SContentScalable
 */
@JvmInline
public value class WrapperNoteCompactSContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactSView

/**
 * Обертка для вариации SHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteCompactSHasCloseContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactSView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteCompactXsView : WrapperNoteCompactView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperNoteCompactXs(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactXsView

/**
 * Обертка для вариации XsHasClose
 */
@JvmInline
public value class WrapperNoteCompactXsHasClose(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactXsView

/**
 * Обертка для вариации XsContentScalable
 */
@JvmInline
public value class WrapperNoteCompactXsContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactXsView

/**
 * Обертка для вариации XsHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteCompactXsHasCloseContentScalable(
    public override val builder: NoteCompactStyleBuilder,
) : WrapperNoteCompactXsView

public val WrapperNoteCompactView.Default: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Positive: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Negative: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Warning: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactView.Info: WrapperNoteCompactTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

private val NoteCompactStyleBuilder.invariantProps: NoteCompactStyleBuilder
    @Composable
    get() = this
        .colors {
            closeColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }

public val WrapperNoteCompactLView.Default: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactLViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.L.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactLView.Positive: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactLViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.L.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactLView.Negative: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactLViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.L.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactLView.Warning: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactLViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.L.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactLView.Info: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactLViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.L.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val NoteCompact.L: WrapperNoteCompactL
    @Composable
    @JvmName("WrapperNoteCompactL")
    get() = NoteCompactStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsServTheme.typography.textLBold)
        .textStyle(SddsServTheme.typography.textLNormal)
        .dimensions {
            paddingStart(30.0.dp)
            paddingEnd(30.0.dp)
            paddingTop(7.0.dp)
            paddingBottom(24.0.dp)
            iconSize(24.0.dp)
            contentBeforeEndMargin(12.0.dp)
            textTopMargin(4.0.dp)
            closeStartMargin(0.0.dp)
            actionStartMargin(16.0.dp)
            actionEndMargin(0.0.dp)
        }
        .wrap(::WrapperNoteCompactL)

public val WrapperNoteCompactL.HasClose: WrapperNoteCompactLHasClose
    @Composable
    @JvmName("WrapperNoteCompactLHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingEnd(16.0.dp)
            closeSize(24.0.dp)
            closeStartMargin(4.0.dp)
            actionEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteCompactLHasClose)

public val WrapperNoteCompactL.ContentScalable: WrapperNoteCompactLContentScalable
    @Composable
    @JvmName("WrapperNoteCompactLContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            paddingStart(28.0.dp)
            paddingEnd(28.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteCompactLContentScalable)

public val WrapperNoteCompactL.HasCloseContentScalable: WrapperNoteCompactLHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteCompactLHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingStart(28.0.dp)
            paddingEnd(16.0.dp)
            closeSize(24.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(16.0.dp)
            closeStartMargin(4.0.dp)
            actionEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteCompactLHasCloseContentScalable)

public val WrapperNoteCompactMView.Default: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactMViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.M.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactMView.Positive: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactMViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.M.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactMView.Negative: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactMViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.M.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactMView.Warning: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactMViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.M.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactMView.Info: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactMViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.M.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val NoteCompact.M: WrapperNoteCompactM
    @Composable
    @JvmName("WrapperNoteCompactM")
    get() = NoteCompactStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsServTheme.typography.textMBold)
        .textStyle(SddsServTheme.typography.textMNormal)
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(20.0.dp)
            iconSize(24.0.dp)
            contentBeforeEndMargin(10.0.dp)
            textTopMargin(2.0.dp)
            closeStartMargin(0.0.dp)
            actionStartMargin(16.0.dp)
            actionEndMargin(0.0.dp)
        }
        .wrap(::WrapperNoteCompactM)

public val WrapperNoteCompactM.HasClose: WrapperNoteCompactMHasClose
    @Composable
    @JvmName("WrapperNoteCompactMHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingEnd(12.0.dp)
            closeSize(24.0.dp)
            closeStartMargin(4.0.dp)
            actionEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteCompactMHasClose)

public val WrapperNoteCompactM.ContentScalable: WrapperNoteCompactMContentScalable
    @Composable
    @JvmName("WrapperNoteCompactMContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteCompactMContentScalable)

public val WrapperNoteCompactM.HasCloseContentScalable: WrapperNoteCompactMHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteCompactMHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingStart(20.0.dp)
            paddingEnd(12.0.dp)
            closeSize(24.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
            closeStartMargin(4.0.dp)
            actionEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteCompactMHasCloseContentScalable)

public val WrapperNoteCompactSView.Default: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactSViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.S.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactSView.Positive: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactSViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.S.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactSView.Negative: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactSViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.S.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactSView.Warning: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactSViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.S.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactSView.Info: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactSViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.S.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val NoteCompact.S: WrapperNoteCompactS
    @Composable
    @JvmName("WrapperNoteCompactS")
    get() = NoteCompactStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsServTheme.typography.textSBold)
        .textStyle(SddsServTheme.typography.textSNormal)
        .dimensions {
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(16.0.dp)
            iconSize(16.0.dp)
            contentBeforeEndMargin(8.0.dp)
            textTopMargin(2.0.dp)
            closeStartMargin(0.0.dp)
            actionStartMargin(12.0.dp)
            actionEndMargin(0.0.dp)
        }
        .wrap(::WrapperNoteCompactS)

public val WrapperNoteCompactS.HasClose: WrapperNoteCompactSHasClose
    @Composable
    @JvmName("WrapperNoteCompactSHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingEnd(10.0.dp)
            closeSize(24.0.dp)
            closeStartMargin(2.0.dp)
            actionEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteCompactSHasClose)

public val WrapperNoteCompactS.ContentScalable: WrapperNoteCompactSContentScalable
    @Composable
    @JvmName("WrapperNoteCompactSContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(20.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteCompactSContentScalable)

public val WrapperNoteCompactS.HasCloseContentScalable: WrapperNoteCompactSHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteCompactSHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(10.0.dp)
            closeSize(24.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
            closeStartMargin(2.0.dp)
            actionEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteCompactSHasCloseContentScalable)

public val WrapperNoteCompactXsView.Default: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactXsViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactXsView.Positive: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactXsViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactXsView.Negative: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactXsViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactXsView.Warning: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactXsViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val WrapperNoteCompactXsView.Info: WrapperNoteCompactTerminate
    @Composable
    @JvmName("WrapperNoteCompactXsViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteCompactTerminate)

public val NoteCompact.Xs: WrapperNoteCompactXs
    @Composable
    @JvmName("WrapperNoteCompactXs")
    get() = NoteCompactStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsServTheme.typography.textXsBold)
        .textStyle(SddsServTheme.typography.textXsNormal)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(3.0.dp)
            paddingBottom(12.0.dp)
            iconSize(16.0.dp)
            contentBeforeEndMargin(6.0.dp)
            textTopMargin(2.0.dp)
            closeStartMargin(0.0.dp)
            actionStartMargin(12.0.dp)
            actionEndMargin(0.0.dp)
        }
        .wrap(::WrapperNoteCompactXs)

public val WrapperNoteCompactXs.HasClose: WrapperNoteCompactXsHasClose
    @Composable
    @JvmName("WrapperNoteCompactXsHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_16)
        .dimensions {
            paddingEnd(10.0.dp)
            closeSize(16.0.dp)
            closeStartMargin(2.0.dp)
            actionEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteCompactXsHasClose)

public val WrapperNoteCompactXs.ContentScalable: WrapperNoteCompactXsContentScalable
    @Composable
    @JvmName("WrapperNoteCompactXsContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(16.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(8.0.dp)
        }
        .wrap(::WrapperNoteCompactXsContentScalable)

public val WrapperNoteCompactXs.HasCloseContentScalable: WrapperNoteCompactXsHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteCompactXsHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_16)
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(10.0.dp)
            closeSize(16.0.dp)
            iconSize(0.0.dp)
            contentBeforeEndMargin(8.0.dp)
            closeStartMargin(2.0.dp)
            actionEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteCompactXsHasCloseContentScalable)
