@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.plasma.homeds.styles.customcomponents.productbottomsheet

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.components.productbottomsheet.ProductBottomSheetStyle
import com.sdds.plasma.homeds.components.productbottomsheet.ProductBottomSheetStyleBuilder
import com.sdds.plasma.homeds.styles.bottomsheet.Default
import com.sdds.plasma.homeds.styles.bottomsheet.ModalBottomSheet
import com.sdds.plasma.homeds.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.homeds.styles.buttongroup.Default
import com.sdds.plasma.homeds.styles.buttongroup.M
import com.sdds.plasma.homeds.styles.buttongroup.Wide
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperProductBottomSheet :
    BuilderWrapper<ProductBottomSheetStyle, ProductBottomSheetStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperProductBottomSheetDefault(
    public override val builder: ProductBottomSheetStyleBuilder,
) : WrapperProductBottomSheet

/**
 * Обертка для вариации HasButtons
 */
@JvmInline
public value class WrapperProductBottomSheetHasButtons(
    public override val builder: ProductBottomSheetStyleBuilder,
) : WrapperProductBottomSheet

private val ProductBottomSheetStyleBuilder.invariantProps: ProductBottomSheetStyleBuilder
    @Composable
    get() = this
        .bottomSheetStyle(
            ModalBottomSheet.Default.builder
                .dimensions {
                    paddingStart(0.dp)
                    paddingTop(0.dp)
                    paddingEnd(0.dp)
                    paddingBottom(0.dp)
                }
                .style(),
        )
        .titleStyle(PlasmaHomeDsTheme.typography.headerH2Normal)
        .subTitleStyle(PlasmaHomeDsTheme.typography.textMNormal)

public val ProductBottomSheet.Default: WrapperProductBottomSheetDefault
    @Composable
    @JvmName("WrapperProductBottomSheetDefault")
    get() = ProductBottomSheetStyle.builder(this)
        .invariantProps
        .dimensions {
            headerPaddingStart(24.0.dp)
            headerPaddingEnd(24.0.dp)
            headerPaddingTop(24.0.dp)
            headerPaddingBottom(24.0.dp)
            bodyPaddingTop(16.0.dp)
            bodyPaddingBottom(16.0.dp)
            footerPaddingBottom(24.0.dp)
        }
        .wrap(::WrapperProductBottomSheetDefault)
public val ProductBottomSheet.HasButtons: WrapperProductBottomSheetHasButtons
    @Composable
    @JvmName("WrapperProductBottomSheetHasButtons")
    get() = ProductBottomSheetStyle.builder(this)
        .invariantProps
        .dimensions {
            headerPaddingStart(24.0.dp)
            headerPaddingEnd(24.0.dp)
            headerPaddingTop(24.0.dp)
            headerPaddingBottom(24.0.dp)
            bodyPaddingTop(16.0.dp)
            bodyPaddingBottom(16.0.dp)
            footerPaddingStart(8.0.dp)
            footerPaddingEnd(8.0.dp)
            footerPaddingTop(24.0.dp)
            footerPaddingBottom(24.0.dp)
        }
        .buttonGroupStyle(BasicButtonGroup.M.Wide.Default.style())
        .wrap(::WrapperProductBottomSheetHasButtons)
