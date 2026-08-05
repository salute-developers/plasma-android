// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.aiusermessage

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.ai.AiUserMessageState
import com.sdds.compose.uikit.ai.AiUserMessageStyle
import com.sdds.compose.uikit.ai.AiUserMessageStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.buttongroup.AiUserMessageEmbeddedIconButtonGroup
import com.sdds.serv.styles.buttongroup.BasicButtonGroup
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Xxs
import com.sdds.serv.styles.editable.AiUserMessageEditable
import com.sdds.serv.styles.editable.L
import com.sdds.serv.styles.editable.M
import com.sdds.serv.styles.editable.S
import com.sdds.serv.styles.editable.Xl
import com.sdds.serv.styles.editable.Xs
import com.sdds.serv.styles.`file`.FileCircularProgress
import com.sdds.serv.styles.`file`.L
import com.sdds.serv.styles.`file`.M
import com.sdds.serv.styles.`file`.S
import com.sdds.serv.styles.`file`.Xs
import com.sdds.serv.styles.image.Image
import com.sdds.serv.styles.image.Ratio1x1
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAiUserMessage :
    BuilderWrapper<AiUserMessageStyle, AiUserMessageStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiUserMessageView : WrapperAiUserMessage

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperAiUserMessageTerminate(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessage

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAiUserMessageXl(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации XlContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageXlContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации XlContentTypeFile
 */
@JvmInline
public value class WrapperAiUserMessageXlContentTypeFile(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации XlContentTypeFileContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageXlContentTypeFileContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiUserMessageL(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации LContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageLContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации LContentTypeFile
 */
@JvmInline
public value class WrapperAiUserMessageLContentTypeFile(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации LContentTypeFileContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageLContentTypeFileContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiUserMessageM(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации MContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageMContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации MContentTypeFile
 */
@JvmInline
public value class WrapperAiUserMessageMContentTypeFile(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации MContentTypeFileContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageMContentTypeFileContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiUserMessageS(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации SContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageSContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации SContentTypeFile
 */
@JvmInline
public value class WrapperAiUserMessageSContentTypeFile(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации SContentTypeFileContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageSContentTypeFileContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperAiUserMessageXs(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации XsContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageXsContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации XsContentTypeFile
 */
@JvmInline
public value class WrapperAiUserMessageXsContentTypeFile(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

/**
 * Обертка для вариации XsContentTypeFileContentViewSecondary
 */
@JvmInline
public value class WrapperAiUserMessageXsContentTypeFileContentViewSecondary(
    public override val builder: AiUserMessageStyleBuilder,
) : WrapperAiUserMessageView

public val WrapperAiUserMessageView.Default: WrapperAiUserMessageTerminate
    @Composable
    get() = builder
        .colors {
            messageBackground(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue(
                    setOf(AiUserMessageState.InEdit)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidTertiary),
                ),
            )
        }
        .wrap(::WrapperAiUserMessageTerminate)

public val WrapperAiUserMessageView.Secondary: WrapperAiUserMessageTerminate
    @Composable
    get() = builder
        .colors {
            messageBackground(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue(
                    setOf(AiUserMessageState.InEdit)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidTertiary),
                ),
            )
        }
        .wrap(::WrapperAiUserMessageTerminate)

public val WrapperAiUserMessageView.Accent: WrapperAiUserMessageTerminate
    @Composable
    get() = builder
        .colors {
            messageBackground(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentAccent).asStatefulValue(
                    setOf(AiUserMessageState.InEdit)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidTertiary),
                ),
            )
        }
        .wrap(::WrapperAiUserMessageTerminate)

public val WrapperAiUserMessageView.Positive: WrapperAiUserMessageTerminate
    @Composable
    get() = builder
        .colors {
            messageBackground(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue(
                    setOf(AiUserMessageState.InEdit)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidTertiary),
                ),
            )
        }
        .wrap(::WrapperAiUserMessageTerminate)

public val WrapperAiUserMessageView.Negative: WrapperAiUserMessageTerminate
    @Composable
    get() = builder
        .colors {
            messageBackground(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(
                    setOf(AiUserMessageState.InEdit)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidTertiary),
                ),
            )
        }
        .wrap(::WrapperAiUserMessageTerminate)

public val WrapperAiUserMessageView.Warning: WrapperAiUserMessageTerminate
    @Composable
    get() = builder
        .colors {
            messageBackground(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue(
                    setOf(AiUserMessageState.InEdit)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidTertiary),
                ),
            )
        }
        .wrap(::WrapperAiUserMessageTerminate)

private val AiUserMessageStyleBuilder.invariantProps: AiUserMessageStyleBuilder
    @Composable
    get() = this
        .uploadingImageStyle(Image.Ratio1x1.style())
        .colors {
            textColor(SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue())
        }

public val AiUserMessage.Xl: WrapperAiUserMessageXl
    @Composable
    @JvmName("WrapperAiUserMessageXl")
    get() = AiUserMessageStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyLNormal)
        .uploadingShape(SddsServTheme.shapes.roundL)
        .messageShape(SddsServTheme.shapes.roundL)
        .editableStyle(AiUserMessageEditable.Xl.style())
        .actionsButtonGroupStyle(AiUserMessageEmbeddedIconButtonGroup.M.style())
        .editableActionsButtonGroupStyle(BasicButtonGroup.M.Dense.Default.style())
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
        }
        .dimensions {
            uploadingPaddingStart(0.0.dp)
            uploadingPaddingEnd(0.0.dp)
            uploadingPaddingTop(0.0.dp)
            uploadingPaddingBottom(0.0.dp)
            messagePaddingStart(18.0.dp)
            messagePaddingEnd(18.0.dp)
            messagePaddingTop(21.0.dp)
            messagePaddingBottom(21.0.dp)
            uploadingGroupGap(10.0.dp)
            uploadingFilesGap(0.0.dp)
            actionsGap(12.0.dp)
            editableActionsGap(16.0.dp)
        }
        .wrap(::WrapperAiUserMessageXl)

public val WrapperAiUserMessageXl.ContentViewSecondary: WrapperAiUserMessageXlContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageXlContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageXlContentViewSecondary)

public val WrapperAiUserMessageXl.ContentTypeFile: WrapperAiUserMessageXlContentTypeFile
    @Composable
    @JvmName("WrapperAiUserMessageXlContentTypeFile")
    get() = builder
        .uploadingFileStyle(FileCircularProgress.L.style())
        .dimensions {
            uploadingPaddingStart(14.0.dp)
            uploadingPaddingEnd(14.0.dp)
            uploadingPaddingTop(12.0.dp)
            uploadingPaddingBottom(12.0.dp)
            uploadingFilesGap(10.0.dp)
        }
        .wrap(::WrapperAiUserMessageXlContentTypeFile)

public val WrapperAiUserMessageXlContentTypeFile.ContentViewSecondary:
    WrapperAiUserMessageXlContentTypeFileContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageXlContentTypeFileContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageXlContentTypeFileContentViewSecondary)

public val AiUserMessage.L: WrapperAiUserMessageL
    @Composable
    @JvmName("WrapperAiUserMessageL")
    get() = AiUserMessageStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyLNormal)
        .uploadingShape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .messageShape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .editableStyle(AiUserMessageEditable.L.style())
        .actionsButtonGroupStyle(AiUserMessageEmbeddedIconButtonGroup.M.style())
        .editableActionsButtonGroupStyle(BasicButtonGroup.M.Dense.Default.style())
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
        }
        .dimensions {
            uploadingPaddingStart(0.0.dp)
            uploadingPaddingEnd(0.0.dp)
            uploadingPaddingTop(0.0.dp)
            uploadingPaddingBottom(0.0.dp)
            messagePaddingStart(16.0.dp)
            messagePaddingEnd(16.0.dp)
            messagePaddingTop(17.0.dp)
            messagePaddingBottom(17.0.dp)
            uploadingGroupGap(10.0.dp)
            uploadingFilesGap(0.0.dp)
            actionsGap(12.0.dp)
            editableActionsGap(16.0.dp)
        }
        .wrap(::WrapperAiUserMessageL)

public val WrapperAiUserMessageL.ContentViewSecondary: WrapperAiUserMessageLContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageLContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageLContentViewSecondary)

public val WrapperAiUserMessageL.ContentTypeFile: WrapperAiUserMessageLContentTypeFile
    @Composable
    @JvmName("WrapperAiUserMessageLContentTypeFile")
    get() = builder
        .uploadingFileStyle(FileCircularProgress.M.style())
        .dimensions {
            uploadingPaddingStart(8.0.dp)
            uploadingPaddingEnd(8.0.dp)
            uploadingPaddingTop(10.0.dp)
            uploadingPaddingBottom(10.0.dp)
            uploadingFilesGap(10.0.dp)
        }
        .wrap(::WrapperAiUserMessageLContentTypeFile)

public val WrapperAiUserMessageLContentTypeFile.ContentViewSecondary:
    WrapperAiUserMessageLContentTypeFileContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageLContentTypeFileContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageLContentTypeFileContentViewSecondary)

public val AiUserMessage.M: WrapperAiUserMessageM
    @Composable
    @JvmName("WrapperAiUserMessageM")
    get() = AiUserMessageStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyMNormal)
        .uploadingShape(SddsServTheme.shapes.roundM)
        .messageShape(SddsServTheme.shapes.roundM)
        .editableStyle(AiUserMessageEditable.M.style())
        .actionsButtonGroupStyle(AiUserMessageEmbeddedIconButtonGroup.M.style())
        .editableActionsButtonGroupStyle(BasicButtonGroup.S.Dense.Default.style())
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
        }
        .dimensions {
            uploadingPaddingStart(0.0.dp)
            uploadingPaddingEnd(0.0.dp)
            uploadingPaddingTop(0.0.dp)
            uploadingPaddingBottom(0.0.dp)
            messagePaddingStart(14.0.dp)
            messagePaddingEnd(14.0.dp)
            messagePaddingTop(14.0.dp)
            messagePaddingBottom(14.0.dp)
            uploadingGroupGap(8.0.dp)
            uploadingFilesGap(0.0.dp)
            actionsGap(12.0.dp)
            editableActionsGap(14.0.dp)
        }
        .wrap(::WrapperAiUserMessageM)

public val WrapperAiUserMessageM.ContentViewSecondary: WrapperAiUserMessageMContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageMContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageMContentViewSecondary)

public val WrapperAiUserMessageM.ContentTypeFile: WrapperAiUserMessageMContentTypeFile
    @Composable
    @JvmName("WrapperAiUserMessageMContentTypeFile")
    get() = builder
        .uploadingFileStyle(FileCircularProgress.S.style())
        .dimensions {
            uploadingPaddingStart(8.0.dp)
            uploadingPaddingEnd(8.0.dp)
            uploadingPaddingTop(7.0.dp)
            uploadingPaddingBottom(7.0.dp)
            uploadingFilesGap(8.0.dp)
        }
        .wrap(::WrapperAiUserMessageMContentTypeFile)

public val WrapperAiUserMessageMContentTypeFile.ContentViewSecondary:
    WrapperAiUserMessageMContentTypeFileContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageMContentTypeFileContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageMContentTypeFileContentViewSecondary)

public val AiUserMessage.S: WrapperAiUserMessageS
    @Composable
    @JvmName("WrapperAiUserMessageS")
    get() = AiUserMessageStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodySNormal)
        .uploadingShape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .messageShape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .editableStyle(AiUserMessageEditable.S.style())
        .actionsButtonGroupStyle(AiUserMessageEmbeddedIconButtonGroup.S.style())
        .editableActionsButtonGroupStyle(BasicButtonGroup.S.Dense.Default.style())
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
        }
        .dimensions {
            uploadingPaddingStart(0.0.dp)
            uploadingPaddingEnd(0.0.dp)
            uploadingPaddingTop(0.0.dp)
            uploadingPaddingBottom(0.0.dp)
            messagePaddingStart(12.0.dp)
            messagePaddingEnd(12.0.dp)
            messagePaddingTop(11.0.dp)
            messagePaddingBottom(11.0.dp)
            uploadingGroupGap(6.0.dp)
            uploadingFilesGap(0.0.dp)
            actionsGap(12.0.dp)
            editableActionsGap(14.0.dp)
        }
        .wrap(::WrapperAiUserMessageS)

public val WrapperAiUserMessageS.ContentViewSecondary: WrapperAiUserMessageSContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageSContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageSContentViewSecondary)

public val WrapperAiUserMessageS.ContentTypeFile: WrapperAiUserMessageSContentTypeFile
    @Composable
    @JvmName("WrapperAiUserMessageSContentTypeFile")
    get() = builder
        .uploadingFileStyle(FileCircularProgress.Xs.style())
        .dimensions {
            uploadingPaddingStart(6.0.dp)
            uploadingPaddingEnd(6.0.dp)
            uploadingPaddingTop(5.0.dp)
            uploadingPaddingBottom(5.0.dp)
            uploadingFilesGap(6.0.dp)
        }
        .wrap(::WrapperAiUserMessageSContentTypeFile)

public val WrapperAiUserMessageSContentTypeFile.ContentViewSecondary:
    WrapperAiUserMessageSContentTypeFileContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageSContentTypeFileContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageSContentTypeFileContentViewSecondary)

public val AiUserMessage.Xs: WrapperAiUserMessageXs
    @Composable
    @JvmName("WrapperAiUserMessageXs")
    get() = AiUserMessageStyle.builder(this)
        .invariantProps
        .textStyle(SddsServTheme.typography.bodyXsNormal)
        .uploadingShape(SddsServTheme.shapes.roundS)
        .messageShape(SddsServTheme.shapes.roundS)
        .editableStyle(AiUserMessageEditable.Xs.style())
        .actionsButtonGroupStyle(AiUserMessageEmbeddedIconButtonGroup.S.style())
        .editableActionsButtonGroupStyle(BasicButtonGroup.Xxs.Dense.Default.style())
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
        }
        .dimensions {
            uploadingPaddingStart(0.0.dp)
            uploadingPaddingEnd(0.0.dp)
            uploadingPaddingTop(0.0.dp)
            uploadingPaddingBottom(0.0.dp)
            messagePaddingStart(10.0.dp)
            messagePaddingEnd(10.0.dp)
            messagePaddingTop(9.0.dp)
            messagePaddingBottom(9.0.dp)
            uploadingGroupGap(4.0.dp)
            uploadingFilesGap(0.0.dp)
            actionsGap(10.0.dp)
            editableActionsGap(10.0.dp)
        }
        .wrap(::WrapperAiUserMessageXs)

public val WrapperAiUserMessageXs.ContentViewSecondary: WrapperAiUserMessageXsContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageXsContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageXsContentViewSecondary)

public val WrapperAiUserMessageXs.ContentTypeFile: WrapperAiUserMessageXsContentTypeFile
    @Composable
    @JvmName("WrapperAiUserMessageXsContentTypeFile")
    get() = builder
        .uploadingFileStyle(FileCircularProgress.Xs.style())
        .dimensions {
            uploadingPaddingStart(4.0.dp)
            uploadingPaddingEnd(4.0.dp)
            uploadingPaddingTop(3.0.dp)
            uploadingPaddingBottom(3.0.dp)
            uploadingFilesGap(4.0.dp)
        }
        .wrap(::WrapperAiUserMessageXsContentTypeFile)

public val WrapperAiUserMessageXsContentTypeFile.ContentViewSecondary:
    WrapperAiUserMessageXsContentTypeFileContentViewSecondary
    @Composable
    @JvmName("WrapperAiUserMessageXsContentTypeFileContentViewSecondary")
    get() = builder
        .colors {
            uploadingBackground(SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .wrap(::WrapperAiUserMessageXsContentTypeFileContentViewSecondary)
