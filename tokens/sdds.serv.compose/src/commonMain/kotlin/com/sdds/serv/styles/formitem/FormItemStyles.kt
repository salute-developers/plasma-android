// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.formitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.FormIndicatorAlignment
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.FormItemStyleBuilder
import com.sdds.compose.uikit.FormTitlePlacement
import com.sdds.compose.uikit.FormType
import com.sdds.compose.uikit.IndicatorMode
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.icons.compose.InfoCircleOutline16
import com.sdds.icons.compose.InfoCircleOutline24
import com.sdds.icons.compose.SddsIcons
import com.sdds.serv.styles.indicator.Indicator
import com.sdds.serv.styles.indicator.M
import com.sdds.serv.styles.indicator.Negative
import com.sdds.serv.styles.indicator.S
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperFormItem : BuilderWrapper<FormItemStyle, FormItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperFormItemView : WrapperFormItem

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperFormItemTerminate(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItem

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperFormItemXs(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsRequiredStart
 */
@JvmInline
public value class WrapperFormItemXsRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsRequiredEnd
 */
@JvmInline
public value class WrapperFormItemXsRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsTitleTop
 */
@JvmInline
public value class WrapperFormItemXsTitleTop(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsTitleTopRequiredStart
 */
@JvmInline
public value class WrapperFormItemXsTitleTopRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsTitleTopRequiredEnd
 */
@JvmInline
public value class WrapperFormItemXsTitleTopRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsTitleStart
 */
@JvmInline
public value class WrapperFormItemXsTitleStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsTitleStartRequiredStart
 */
@JvmInline
public value class WrapperFormItemXsTitleStartRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации XsTitleStartRequiredEnd
 */
@JvmInline
public value class WrapperFormItemXsTitleStartRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperFormItemS(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации SRequiredStart
 */
@JvmInline
public value class WrapperFormItemSRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации SRequiredEnd
 */
@JvmInline
public value class WrapperFormItemSRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации STitleTop
 */
@JvmInline
public value class WrapperFormItemSTitleTop(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации STitleTopRequiredStart
 */
@JvmInline
public value class WrapperFormItemSTitleTopRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации STitleTopRequiredEnd
 */
@JvmInline
public value class WrapperFormItemSTitleTopRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации STitleStart
 */
@JvmInline
public value class WrapperFormItemSTitleStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации STitleStartRequiredStart
 */
@JvmInline
public value class WrapperFormItemSTitleStartRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации STitleStartRequiredEnd
 */
@JvmInline
public value class WrapperFormItemSTitleStartRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperFormItemM(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MRequiredStart
 */
@JvmInline
public value class WrapperFormItemMRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MRequiredEnd
 */
@JvmInline
public value class WrapperFormItemMRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MTitleTop
 */
@JvmInline
public value class WrapperFormItemMTitleTop(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MTitleTopRequiredStart
 */
@JvmInline
public value class WrapperFormItemMTitleTopRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MTitleTopRequiredEnd
 */
@JvmInline
public value class WrapperFormItemMTitleTopRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MTitleStart
 */
@JvmInline
public value class WrapperFormItemMTitleStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MTitleStartRequiredStart
 */
@JvmInline
public value class WrapperFormItemMTitleStartRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации MTitleStartRequiredEnd
 */
@JvmInline
public value class WrapperFormItemMTitleStartRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperFormItemL(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LRequiredStart
 */
@JvmInline
public value class WrapperFormItemLRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LRequiredEnd
 */
@JvmInline
public value class WrapperFormItemLRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LTitleTop
 */
@JvmInline
public value class WrapperFormItemLTitleTop(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LTitleTopRequiredStart
 */
@JvmInline
public value class WrapperFormItemLTitleTopRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LTitleTopRequiredEnd
 */
@JvmInline
public value class WrapperFormItemLTitleTopRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LTitleStart
 */
@JvmInline
public value class WrapperFormItemLTitleStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LTitleStartRequiredStart
 */
@JvmInline
public value class WrapperFormItemLTitleStartRequiredStart(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

/**
 * Обертка для вариации LTitleStartRequiredEnd
 */
@JvmInline
public value class WrapperFormItemLTitleStartRequiredEnd(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItemView

public val WrapperFormItemView.Default: WrapperFormItemTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(SddsServTheme.colors.textDefaultSecondary.asInteractive())
        }
        .wrap(::WrapperFormItemTerminate)

public val WrapperFormItemView.Positive: WrapperFormItemTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(SddsServTheme.colors.textDefaultPositive.asInteractive())
        }
        .wrap(::WrapperFormItemTerminate)

public val WrapperFormItemView.Negative: WrapperFormItemTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(SddsServTheme.colors.textDefaultNegative.asInteractive())
        }
        .wrap(::WrapperFormItemTerminate)

public val WrapperFormItemView.Warning: WrapperFormItemTerminate
    @Composable
    get() = builder
        .colors {
            captionColor(SddsServTheme.colors.textDefaultWarning.asInteractive())
        }
        .wrap(::WrapperFormItemTerminate)

private val FormItemStyleBuilder.invariantProps: FormItemStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .titleCaptionStyle(SddsServTheme.typography.bodyXsNormal)
        .captionStyle(SddsServTheme.typography.bodyXsNormal)
        .counterStyle(SddsServTheme.typography.bodyXsNormal)
        .colors {
            titleColor(SddsServTheme.colors.textDefaultPrimary.asInteractive())
            optionalColor(SddsServTheme.colors.textDefaultTertiary.asInteractive())
            titleCaptionColor(SddsServTheme.colors.textDefaultSecondary.asInteractive())
            counterColor(SddsServTheme.colors.textDefaultSecondary.asInteractive())
            hintColor(SddsServTheme.colors.textDefaultSecondary.asInteractive())
        }
        .dimensions {
            titleBlockSpacing(4.0.dp)
            captionPadding(5.0.dp)
            counterPadding(5.0.dp)
        }

public val FormItem.Xs: WrapperFormItemXs
    @Composable
    @JvmName("WrapperFormItemXs")
    get() = FormItemStyle.builder(this)
        .invariantProps
        .titlePlacement(FormTitlePlacement.None)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .dimensions {
            titleBlockPadding(8.0.dp)
            titleCaptionPadding(4.0.dp)
            hintWidth(16.0.dp)
            hintHeight(14.0.dp)
        }
        .wrap(::WrapperFormItemXs)

public val WrapperFormItemXs.RequiredStart: WrapperFormItemXsRequiredStart
    @Composable
    @JvmName("WrapperFormItemXsRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopStart)
        .wrap(::WrapperFormItemXsRequiredStart)

public val WrapperFormItemXs.RequiredEnd: WrapperFormItemXsRequiredEnd
    @Composable
    @JvmName("WrapperFormItemXsRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .wrap(::WrapperFormItemXsRequiredEnd)

public val WrapperFormItemXs.TitleTop: WrapperFormItemXsTitleTop
    @Composable
    @JvmName("WrapperFormItemXsTitleTop")
    get() = builder
        .titlePlacement(FormTitlePlacement.Top)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(6.0.dp)
            titleCaptionPadding(6.0.dp)
            hintWidth(16.0.dp)
            hintHeight(14.0.dp)
        }
        .wrap(::WrapperFormItemXsTitleTop)

public val WrapperFormItemXsTitleTop.RequiredStart: WrapperFormItemXsTitleTopRequiredStart
    @Composable
    @JvmName("WrapperFormItemXsTitleTopRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemXsTitleTopRequiredStart)

public val WrapperFormItemXsTitleTop.RequiredEnd: WrapperFormItemXsTitleTopRequiredEnd
    @Composable
    @JvmName("WrapperFormItemXsTitleTopRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(2.0.dp)
        }
        .wrap(::WrapperFormItemXsTitleTopRequiredEnd)

public val WrapperFormItemXs.TitleStart: WrapperFormItemXsTitleStart
    @Composable
    @JvmName("WrapperFormItemXsTitleStart")
    get() = builder
        .titlePlacement(FormTitlePlacement.Start)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodyXsNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(6.0.dp)
            titleBlockWidth(102.0.dp)
            hintWidth(16.0.dp)
            hintHeight(14.0.dp)
        }
        .wrap(::WrapperFormItemXsTitleStart)

public val WrapperFormItemXsTitleStart.RequiredStart: WrapperFormItemXsTitleStartRequiredStart
    @Composable
    @JvmName("WrapperFormItemXsTitleStartRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemXsTitleStartRequiredStart)

public val WrapperFormItemXsTitleStart.RequiredEnd: WrapperFormItemXsTitleStartRequiredEnd
    @Composable
    @JvmName("WrapperFormItemXsTitleStartRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(2.0.dp)
        }
        .wrap(::WrapperFormItemXsTitleStartRequiredEnd)

public val FormItem.S: WrapperFormItemS
    @Composable
    @JvmName("WrapperFormItemS")
    get() = FormItemStyle.builder(this)
        .invariantProps
        .titlePlacement(FormTitlePlacement.None)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline24))
        .dimensions {
            titleBlockPadding(12.0.dp)
            titleCaptionPadding(4.0.dp)
            hintWidth(24.0.dp)
            hintHeight(24.0.dp)
        }
        .wrap(::WrapperFormItemS)

public val WrapperFormItemS.RequiredStart: WrapperFormItemSRequiredStart
    @Composable
    @JvmName("WrapperFormItemSRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.M.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopStart)
        .wrap(::WrapperFormItemSRequiredStart)

public val WrapperFormItemS.RequiredEnd: WrapperFormItemSRequiredEnd
    @Composable
    @JvmName("WrapperFormItemSRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.M.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .wrap(::WrapperFormItemSRequiredEnd)

public val WrapperFormItemS.TitleTop: WrapperFormItemSTitleTop
    @Composable
    @JvmName("WrapperFormItemSTitleTop")
    get() = builder
        .titlePlacement(FormTitlePlacement.Top)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodySNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(8.0.dp)
            titleCaptionPadding(9.0.dp)
            hintWidth(16.0.dp)
            hintHeight(16.0.dp)
        }
        .wrap(::WrapperFormItemSTitleTop)

public val WrapperFormItemSTitleTop.RequiredStart: WrapperFormItemSTitleTopRequiredStart
    @Composable
    @JvmName("WrapperFormItemSTitleTopRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemSTitleTopRequiredStart)

public val WrapperFormItemSTitleTop.RequiredEnd: WrapperFormItemSTitleTopRequiredEnd
    @Composable
    @JvmName("WrapperFormItemSTitleTopRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(4.0.dp)
        }
        .wrap(::WrapperFormItemSTitleTopRequiredEnd)

public val WrapperFormItemS.TitleStart: WrapperFormItemSTitleStart
    @Composable
    @JvmName("WrapperFormItemSTitleStart")
    get() = builder
        .titlePlacement(FormTitlePlacement.Start)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodySNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(12.0.dp)
            titleBlockWidth(116.0.dp)
            hintWidth(16.0.dp)
            hintHeight(14.0.dp)
        }
        .wrap(::WrapperFormItemSTitleStart)

public val WrapperFormItemSTitleStart.RequiredStart: WrapperFormItemSTitleStartRequiredStart
    @Composable
    @JvmName("WrapperFormItemSTitleStartRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemSTitleStartRequiredStart)

public val WrapperFormItemSTitleStart.RequiredEnd: WrapperFormItemSTitleStartRequiredEnd
    @Composable
    @JvmName("WrapperFormItemSTitleStartRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(4.0.dp)
        }
        .wrap(::WrapperFormItemSTitleStartRequiredEnd)

public val FormItem.M: WrapperFormItemM
    @Composable
    @JvmName("WrapperFormItemM")
    get() = FormItemStyle.builder(this)
        .invariantProps
        .titlePlacement(FormTitlePlacement.None)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline24))
        .dimensions {
            titleBlockPadding(14.0.dp)
            titleCaptionPadding(4.0.dp)
            hintWidth(24.0.dp)
            hintHeight(24.0.dp)
        }
        .wrap(::WrapperFormItemM)

public val WrapperFormItemM.RequiredStart: WrapperFormItemMRequiredStart
    @Composable
    @JvmName("WrapperFormItemMRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.M.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopStart)
        .wrap(::WrapperFormItemMRequiredStart)

public val WrapperFormItemM.RequiredEnd: WrapperFormItemMRequiredEnd
    @Composable
    @JvmName("WrapperFormItemMRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.M.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .wrap(::WrapperFormItemMRequiredEnd)

public val WrapperFormItemM.TitleTop: WrapperFormItemMTitleTop
    @Composable
    @JvmName("WrapperFormItemMTitleTop")
    get() = builder
        .titlePlacement(FormTitlePlacement.Top)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodyMNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(10.0.dp)
            titleCaptionPadding(11.0.dp)
            hintWidth(16.0.dp)
            hintHeight(16.0.dp)
        }
        .wrap(::WrapperFormItemMTitleTop)

public val WrapperFormItemMTitleTop.RequiredStart: WrapperFormItemMTitleTopRequiredStart
    @Composable
    @JvmName("WrapperFormItemMTitleTopRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemMTitleTopRequiredStart)

public val WrapperFormItemMTitleTop.RequiredEnd: WrapperFormItemMTitleTopRequiredEnd
    @Composable
    @JvmName("WrapperFormItemMTitleTopRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(4.0.dp)
        }
        .wrap(::WrapperFormItemMTitleTopRequiredEnd)

public val WrapperFormItemM.TitleStart: WrapperFormItemMTitleStart
    @Composable
    @JvmName("WrapperFormItemMTitleStart")
    get() = builder
        .titlePlacement(FormTitlePlacement.Start)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodyMNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(14.0.dp)
            titleBlockWidth(132.0.dp)
            hintWidth(16.0.dp)
            hintHeight(16.0.dp)
        }
        .wrap(::WrapperFormItemMTitleStart)

public val WrapperFormItemMTitleStart.RequiredStart: WrapperFormItemMTitleStartRequiredStart
    @Composable
    @JvmName("WrapperFormItemMTitleStartRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemMTitleStartRequiredStart)

public val WrapperFormItemMTitleStart.RequiredEnd: WrapperFormItemMTitleStartRequiredEnd
    @Composable
    @JvmName("WrapperFormItemMTitleStartRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(4.0.dp)
        }
        .wrap(::WrapperFormItemMTitleStartRequiredEnd)

public val FormItem.L: WrapperFormItemL
    @Composable
    @JvmName("WrapperFormItemL")
    get() = FormItemStyle.builder(this)
        .invariantProps
        .titlePlacement(FormTitlePlacement.None)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline24))
        .dimensions {
            titleBlockPadding(16.0.dp)
            titleCaptionPadding(4.0.dp)
            hintWidth(24.0.dp)
            hintHeight(24.0.dp)
        }
        .wrap(::WrapperFormItemL)

public val WrapperFormItemL.RequiredStart: WrapperFormItemLRequiredStart
    @Composable
    @JvmName("WrapperFormItemLRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.M.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopStart)
        .wrap(::WrapperFormItemLRequiredStart)

public val WrapperFormItemL.RequiredEnd: WrapperFormItemLRequiredEnd
    @Composable
    @JvmName("WrapperFormItemLRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.M.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Inner)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .wrap(::WrapperFormItemLRequiredEnd)

public val WrapperFormItemL.TitleTop: WrapperFormItemLTitleTop
    @Composable
    @JvmName("WrapperFormItemLTitleTop")
    get() = builder
        .titlePlacement(FormTitlePlacement.Top)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(12.0.dp)
            titleCaptionPadding(14.0.dp)
            hintWidth(16.0.dp)
            hintHeight(16.0.dp)
        }
        .wrap(::WrapperFormItemLTitleTop)

public val WrapperFormItemLTitleTop.RequiredStart: WrapperFormItemLTitleTopRequiredStart
    @Composable
    @JvmName("WrapperFormItemLTitleTopRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemLTitleTopRequiredStart)

public val WrapperFormItemLTitleTop.RequiredEnd: WrapperFormItemLTitleTopRequiredEnd
    @Composable
    @JvmName("WrapperFormItemLTitleTopRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(4.0.dp)
        }
        .wrap(::WrapperFormItemLTitleTopRequiredEnd)

public val WrapperFormItemL.TitleStart: WrapperFormItemLTitleStart
    @Composable
    @JvmName("WrapperFormItemLTitleStart")
    get() = builder
        .titlePlacement(FormTitlePlacement.Start)
        .hintIcon(imageVectorSource(SddsIcons.InfoCircleOutline16))
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .optionalStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            titleBlockPadding(16.0.dp)
            titleBlockWidth(142.0.dp)
            hintWidth(16.0.dp)
            hintHeight(16.0.dp)
        }
        .wrap(::WrapperFormItemLTitleStart)

public val WrapperFormItemLTitleStart.RequiredStart: WrapperFormItemLTitleStartRequiredStart
    @Composable
    @JvmName("WrapperFormItemLTitleStartRequiredStart")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.CenterStart)
        .dimensions {
            indicatorOffsetX(4.0.dp)
        }
        .wrap(::WrapperFormItemLTitleStartRequiredStart)

public val WrapperFormItemLTitleStart.RequiredEnd: WrapperFormItemLTitleStartRequiredEnd
    @Composable
    @JvmName("WrapperFormItemLTitleStartRequiredEnd")
    get() = builder
        .indicatorStyle(Indicator.S.Negative.style())
        .formItemType(FormType.Required)
        .indicatorAlignmentMode(IndicatorMode.Outer)
        .indicatorAlignment(FormIndicatorAlignment.TopEnd)
        .dimensions {
            indicatorOffsetX(4.0.dp)
            indicatorOffsetY(4.0.dp)
        }
        .wrap(::WrapperFormItemLTitleStartRequiredEnd)
