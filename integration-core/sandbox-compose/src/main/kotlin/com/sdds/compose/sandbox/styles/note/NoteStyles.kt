// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.note

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.linkbutton.Info
import com.sdds.compose.sandbox.styles.linkbutton.L
import com.sdds.compose.sandbox.styles.linkbutton.LinkButton
import com.sdds.compose.sandbox.styles.linkbutton.M
import com.sdds.compose.sandbox.styles.linkbutton.Negative
import com.sdds.compose.sandbox.styles.linkbutton.Positive
import com.sdds.compose.sandbox.styles.linkbutton.S
import com.sdds.compose.sandbox.styles.linkbutton.Warning
import com.sdds.compose.sandbox.styles.linkbutton.Xs
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.ContentBeforeVerticalArrangement
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.NoteStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNote : BuilderWrapper<NoteStyle, NoteStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteView : WrapperNote

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperNoteTerminate(
    public override val builder: NoteStyleBuilder,
) : WrapperNote

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteLView : WrapperNoteView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperNoteL(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteLView

/**
 * Обертка для вариации LHasClose
 */
@JvmInline
public value class WrapperNoteLHasClose(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteLView

/**
 * Обертка для вариации LContentScalable
 */
@JvmInline
public value class WrapperNoteLContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteLView

/**
 * Обертка для вариации LHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteLHasCloseContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteLView

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteMView : WrapperNoteView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperNoteM(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteMView

/**
 * Обертка для вариации MHasClose
 */
@JvmInline
public value class WrapperNoteMHasClose(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteMView

/**
 * Обертка для вариации MContentScalable
 */
@JvmInline
public value class WrapperNoteMContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteMView

/**
 * Обертка для вариации MHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteMHasCloseContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteMView

/**
 * Интерфейс, который реализуют все обертки вариации s
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteSView : WrapperNoteView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperNoteS(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteSView

/**
 * Обертка для вариации SHasClose
 */
@JvmInline
public value class WrapperNoteSHasClose(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteSView

/**
 * Обертка для вариации SContentScalable
 */
@JvmInline
public value class WrapperNoteSContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteSView

/**
 * Обертка для вариации SHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteSHasCloseContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteSView

/**
 * Интерфейс, который реализуют все обертки вариации xs
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNoteXsView : WrapperNoteView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperNoteXs(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteXsView

/**
 * Обертка для вариации XsHasClose
 */
@JvmInline
public value class WrapperNoteXsHasClose(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteXsView

/**
 * Обертка для вариации XsContentScalable
 */
@JvmInline
public value class WrapperNoteXsContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteXsView

/**
 * Обертка для вариации XsHasCloseContentScalable
 */
@JvmInline
public value class WrapperNoteXsHasCloseContentScalable(
    public override val builder: NoteStyleBuilder,
) : WrapperNoteXsView

public val WrapperNoteView.Default: WrapperNoteTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteView.Positive: WrapperNoteTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteView.Negative: WrapperNoteTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteView.Warning: WrapperNoteTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteView.Info: WrapperNoteTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

private val NoteStyleBuilder.invariantProps: NoteStyleBuilder
    @Composable
    get() = this
        .colors {
            closeColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }

public val WrapperNoteLView.Default: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteLViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.L.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteLView.Positive: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteLViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.L.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteLView.Negative: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteLViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.L.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteLView.Warning: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteLViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.L.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteLView.Info: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteLViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.L.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val Note.L: WrapperNoteL
    @Composable
    @JvmName("WrapperNoteL")
    get() = NoteStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsSandboxTheme.typography.textLBold)
        .textStyle(SddsSandboxTheme.typography.textLNormal)
        .dimensions {
            paddingStart(28.0.dp)
            paddingEnd(28.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(7.0.dp)
            iconSize(24.0.dp)
            closeTopMargin(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
            textTopMargin(4.0.dp)
            titlePaddingEnd(0.0.dp)
            closeEndMargin(0.0.dp)
            actionTopMargin(0.0.dp)
        }
        .wrap(::WrapperNoteL)

public val WrapperNoteL.HasClose: WrapperNoteLHasClose
    @Composable
    @JvmName("WrapperNoteLHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            closeSize(24.0.dp)
            closeTopMargin(16.0.dp)
            titlePaddingEnd(30.0.dp)
            closeEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteLHasClose)

public val WrapperNoteL.ContentScalable: WrapperNoteLContentScalable
    @Composable
    @JvmName("WrapperNoteLContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            iconSize(0.0.dp)
            contentBeforeEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteLContentScalable)

public val WrapperNoteL.HasCloseContentScalable: WrapperNoteLHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteLHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            closeSize(24.0.dp)
            iconSize(0.0.dp)
            closeTopMargin(16.0.dp)
            contentBeforeEndMargin(16.0.dp)
            titlePaddingEnd(30.0.dp)
            closeEndMargin(16.0.dp)
        }
        .wrap(::WrapperNoteLHasCloseContentScalable)

public val WrapperNoteMView.Default: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteMViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.M.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteMView.Positive: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteMViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.M.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteMView.Negative: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteMViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.M.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteMView.Warning: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteMViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.M.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteMView.Info: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteMViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.M.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val Note.M: WrapperNoteM
    @Composable
    @JvmName("WrapperNoteM")
    get() = NoteStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM)
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsSandboxTheme.typography.textMBold)
        .textStyle(SddsSandboxTheme.typography.textMNormal)
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(8.0.dp)
            iconSize(24.0.dp)
            closeTopMargin(0.0.dp)
            contentBeforeEndMargin(10.0.dp)
            textTopMargin(2.0.dp)
            titlePaddingEnd(0.0.dp)
            closeEndMargin(0.0.dp)
            actionTopMargin(0.0.dp)
        }
        .wrap(::WrapperNoteM)

public val WrapperNoteM.HasClose: WrapperNoteMHasClose
    @Composable
    @JvmName("WrapperNoteMHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            closeSize(24.0.dp)
            closeTopMargin(12.0.dp)
            titlePaddingEnd(28.0.dp)
            closeEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteMHasClose)

public val WrapperNoteM.ContentScalable: WrapperNoteMContentScalable
    @Composable
    @JvmName("WrapperNoteMContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            iconSize(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteMContentScalable)

public val WrapperNoteM.HasCloseContentScalable: WrapperNoteMHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteMHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            closeSize(24.0.dp)
            iconSize(0.0.dp)
            closeTopMargin(12.0.dp)
            contentBeforeEndMargin(12.0.dp)
            titlePaddingEnd(28.0.dp)
            closeEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteMHasCloseContentScalable)

public val WrapperNoteSView.Default: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteSViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.S.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteSView.Positive: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteSViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.S.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteSView.Negative: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteSViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.S.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteSView.Warning: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteSViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.S.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteSView.Info: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteSViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.S.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val Note.S: WrapperNoteS
    @Composable
    @JvmName("WrapperNoteS")
    get() = NoteStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsSandboxTheme.typography.textMBold)
        .textStyle(SddsSandboxTheme.typography.textMNormal)
        .dimensions {
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(5.0.dp)
            iconSize(16.0.dp)
            closeTopMargin(0.0.dp)
            contentBeforeEndMargin(8.0.dp)
            textTopMargin(2.0.dp)
            titlePaddingEnd(0.0.dp)
            closeEndMargin(0.0.dp)
            actionTopMargin(0.0.dp)
        }
        .wrap(::WrapperNoteS)

public val WrapperNoteS.HasClose: WrapperNoteSHasClose
    @Composable
    @JvmName("WrapperNoteSHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            closeSize(24.0.dp)
            closeTopMargin(10.0.dp)
            titlePaddingEnd(26.0.dp)
            closeEndMargin(10.0.dp)
        }
        .wrap(::WrapperNoteSHasClose)

public val WrapperNoteS.ContentScalable: WrapperNoteSContentScalable
    @Composable
    @JvmName("WrapperNoteSContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            iconSize(0.0.dp)
            contentBeforeEndMargin(12.0.dp)
        }
        .wrap(::WrapperNoteSContentScalable)

public val WrapperNoteS.HasCloseContentScalable: WrapperNoteSHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteSHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_24)
        .dimensions {
            closeSize(24.0.dp)
            iconSize(0.0.dp)
            closeTopMargin(10.0.dp)
            contentBeforeEndMargin(12.0.dp)
            titlePaddingEnd(26.0.dp)
            closeEndMargin(10.0.dp)
        }
        .wrap(::WrapperNoteSHasCloseContentScalable)

public val WrapperNoteXsView.Default: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteXsViewDefault")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteXsView.Positive: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteXsViewPositive")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Positive.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteXsView.Negative: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteXsViewNegative")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Negative.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteXsView.Warning: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteXsViewWarning")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Warning.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val WrapperNoteXsView.Info: WrapperNoteTerminate
    @Composable
    @JvmName("WrapperNoteXsViewInfo")
    get() = builder
        .linkButtonStyle(LinkButton.Xs.Info.style())
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentInfo).asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNoteTerminate)

public val Note.Xs: WrapperNoteXs
    @Composable
    @JvmName("WrapperNoteXs")
    get() = NoteStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundS)
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
        .titleStyle(SddsSandboxTheme.typography.textMBold)
        .textStyle(SddsSandboxTheme.typography.textMNormal)
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(3.0.dp)
            iconSize(16.0.dp)
            closeTopMargin(0.0.dp)
            contentBeforeEndMargin(6.0.dp)
            textTopMargin(2.0.dp)
            titlePaddingEnd(0.0.dp)
            closeEndMargin(0.0.dp)
            actionTopMargin(0.0.dp)
        }
        .wrap(::WrapperNoteXs)

public val WrapperNoteXs.HasClose: WrapperNoteXsHasClose
    @Composable
    @JvmName("WrapperNoteXsHasClose")
    get() = builder
        .closeIcon(com.sdds.icons.R.drawable.ic_close_16)
        .dimensions {
            closeSize(16.0.dp)
            closeTopMargin(10.0.dp)
            titlePaddingEnd(24.0.dp)
            closeEndMargin(10.0.dp)
        }
        .wrap(::WrapperNoteXsHasClose)

public val WrapperNoteXs.ContentScalable: WrapperNoteXsContentScalable
    @Composable
    @JvmName("WrapperNoteXsContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .dimensions {
            iconSize(0.0.dp)
            contentBeforeEndMargin(8.0.dp)
        }
        .wrap(::WrapperNoteXsContentScalable)

public val WrapperNoteXs.HasCloseContentScalable: WrapperNoteXsHasCloseContentScalable
    @Composable
    @JvmName("WrapperNoteXsHasCloseContentScalable")
    get() = builder
        .contentBeforeArrangement(ContentBeforeVerticalArrangement.Center)
        .closeIcon(com.sdds.icons.R.drawable.ic_close_16)
        .dimensions {
            closeSize(16.0.dp)
            iconSize(0.0.dp)
            closeTopMargin(10.0.dp)
            contentBeforeEndMargin(8.0.dp)
            titlePaddingEnd(24.0.dp)
            closeEndMargin(10.0.dp)
        }
        .wrap(::WrapperNoteXsHasCloseContentScalable)
