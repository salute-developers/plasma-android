@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.customcomponents.productformitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.components.productformitem.ProductFormItemStyle
import com.sdds.plasma.homeds.components.productformitem.ProductFormItemStyleBuilder
import com.sdds.plasma.homeds.styles.editable.Editable
import com.sdds.plasma.homeds.styles.editable.H2
import com.sdds.plasma.homeds.styles.editable.H3
import com.sdds.plasma.homeds.styles.formitem.Default
import com.sdds.plasma.homeds.styles.formitem.FormItem
import com.sdds.plasma.homeds.styles.formitem.Negative
import com.sdds.plasma.homeds.styles.formitem.Positive
import com.sdds.plasma.homeds.styles.formitem.Warning
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperProductFormItem : BuilderWrapper<ProductFormItemStyle, ProductFormItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperProductFormItemView : WrapperProductFormItem

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperProductFormItemTerminate(
    public override val builder: ProductFormItemStyleBuilder,
) : WrapperProductFormItem

/**
 * Интерфейс, который реализуют все обертки вариации H2
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperProductFormItemH2View : WrapperProductFormItemView

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperProductFormItemH2(
    public override val builder: ProductFormItemStyleBuilder,
) : WrapperProductFormItemH2View

/**
 * Интерфейс, который реализуют все обертки вариации H2
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperProductFormItemH3View : WrapperProductFormItemView

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperProductFormItemH3(
    public override val builder: ProductFormItemStyleBuilder,
) : WrapperProductFormItemH3View

public val WrapperProductFormItemView.Default: WrapperProductFormItemTerminate
    @Composable
    get() = builder
        .formItemStyle(FormItem.Default.style())
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemView.Positive: WrapperProductFormItemTerminate
    @Composable
    get() = builder
        .formItemStyle(FormItem.Positive.style())
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemView.Negative: WrapperProductFormItemTerminate
    @Composable
    get() = builder
        .formItemStyle(FormItem.Negative.style())
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemView.Warning: WrapperProductFormItemTerminate
    @Composable
    get() = builder
        .formItemStyle(FormItem.Warning.style())
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemH2.Default: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH2Default")
    get() = builder
        .formItemStyle(
            FormItem.Default.modify {
                dimensions {
                    captionPadding(12.dp)
                    counterPadding(12.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemH2.Positive: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH2Positive")
    get() = builder
        .formItemStyle(
            FormItem.Positive.modify {
                dimensions {
                    captionPadding(12.dp)
                    counterPadding(12.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemH2.Negative: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH2Negative")
    get() = builder
        .formItemStyle(
            FormItem.Negative.modify {
                dimensions {
                    captionPadding(12.dp)
                    counterPadding(12.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemH2.Warning: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH2Warning")
    get() = builder
        .formItemStyle(
            FormItem.Warning.modify {
                dimensions {
                    captionPadding(12.dp)
                    counterPadding(12.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val ProductFormItem.H2: WrapperProductFormItemH2
    @Composable
    @JvmName("WrapperProductFormItemH2")
    get() = ProductFormItemStyle.builder(this)
        .editableStyle(
            Editable.H2.modify {
                disableAlpha(1.0f)
                textStyle(PlasmaHomeDsTheme.typography.headerH2Normal)
            }.style(),
        )
        .wrap(::WrapperProductFormItemH2)

public val WrapperProductFormItemH3.Default: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH3Default")
    get() = builder
        .formItemStyle(
            FormItem.Default.modify {
                dimensions {
                    captionPadding(8.dp)
                    counterPadding(8.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemH3.Positive: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH3Positive")
    get() = builder
        .formItemStyle(
            FormItem.Positive.modify {
                dimensions {
                    captionPadding(8.dp)
                    counterPadding(8.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemH3.Negative: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH3Negative")
    get() = builder
        .formItemStyle(
            FormItem.Negative.modify {
                dimensions {
                    captionPadding(8.dp)
                    counterPadding(8.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val WrapperProductFormItemH3.Warning: WrapperProductFormItemTerminate
    @Composable
    @JvmName("WrapperProductFormItemH3Warning")
    get() = builder
        .formItemStyle(
            FormItem.Warning.modify {
                dimensions {
                    captionPadding(8.dp)
                    counterPadding(8.dp)
                }
            }.style(),
        )
        .wrap(::WrapperProductFormItemTerminate)

public val ProductFormItem.H3: WrapperProductFormItemH3
    @Composable
    @JvmName("WrapperProductFormItemH3")
    get() = ProductFormItemStyle.builder(this)
        .editableStyle(
            Editable.H3.modify {
                disableAlpha(1.0f)
                textStyle(PlasmaHomeDsTheme.typography.headerH3Normal)
            }.style(),
        )
        .wrap(::WrapperProductFormItemH3)
