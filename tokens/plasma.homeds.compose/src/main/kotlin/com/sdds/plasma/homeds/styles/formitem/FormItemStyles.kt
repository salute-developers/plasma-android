// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.formitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.FormItemStyleBuilder
import com.sdds.compose.uikit.FormTextAlignment
import com.sdds.compose.uikit.FormTitlePlacement
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperFormItem : BuilderWrapper<FormItemStyle, FormItemStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperFormItemTerminate(
    public override val builder: FormItemStyleBuilder,
) : WrapperFormItem

public val FormItem.Default: WrapperFormItemTerminate
    @Composable
    get() = FormItemStyle.builder(this)
        .invariantProps
        .colors {
            captionColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .wrap(::WrapperFormItemTerminate)

public val FormItem.Positive: WrapperFormItemTerminate
    @Composable
    get() = FormItemStyle.builder(this)
        .invariantProps
        .colors {
            captionColor(
                PlasmaHomeDsTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperFormItemTerminate)

public val FormItem.Negative: WrapperFormItemTerminate
    @Composable
    get() = FormItemStyle.builder(this)
        .invariantProps
        .colors {
            captionColor(
                PlasmaHomeDsTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperFormItemTerminate)

public val FormItem.Warning: WrapperFormItemTerminate
    @Composable
    get() = FormItemStyle.builder(this)
        .invariantProps
        .colors {
            captionColor(
                PlasmaHomeDsTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperFormItemTerminate)

private val FormItemStyleBuilder.invariantProps: FormItemStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .hintIcon(com.sdds.icons.R.drawable.ic_info_circle_outline_16)
        .titleStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .captionStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .titleCaptionStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .counterStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .optionalStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .titlePlacement(FormTitlePlacement.None)
        .topTextAlignment(FormTextAlignment.Center)
        .bottomTextAlignment(FormTextAlignment.Center)
        .colors {
            hintColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            optionalColor(
                PlasmaHomeDsTheme.colors.textDefaultTertiary.asInteractive(),
            )
            titleCaptionColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            counterColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensions {
            hintHeight(14.0.dp)
            hintWidth(16.0.dp)
            titleBlockPadding(4.0.dp)
            titleBlockSpacing(4.0.dp)
            titleCaptionPadding(4.0.dp)
            captionPadding(4.0.dp)
            counterPadding(4.0.dp)
        }
