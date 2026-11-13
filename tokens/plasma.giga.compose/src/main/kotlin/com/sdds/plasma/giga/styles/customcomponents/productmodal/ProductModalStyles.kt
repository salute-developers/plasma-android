@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.customcomponents.productmodal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.components.productmodal.ProductModalStyle
import com.sdds.plasma.giga.components.productmodal.ProductModalStyleBuilder
import com.sdds.plasma.giga.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.giga.styles.buttongroup.Default
import com.sdds.plasma.giga.styles.buttongroup.M
import com.sdds.plasma.giga.styles.buttongroup.Wide
import com.sdds.plasma.giga.styles.iconbutton.Clear
import com.sdds.plasma.giga.styles.iconbutton.Default
import com.sdds.plasma.giga.styles.iconbutton.IconButton
import com.sdds.plasma.giga.styles.iconbutton.M
import com.sdds.plasma.giga.styles.iconbutton.S
import com.sdds.plasma.giga.styles.modal.Default
import com.sdds.plasma.giga.styles.modal.Modal
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperProductModal : BuilderWrapper<ProductModalStyle, ProductModalStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperProductModalM(
    public override val builder: ProductModalStyleBuilder,
) : WrapperProductModal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperProductModalS(
    public override val builder: ProductModalStyleBuilder,
) : WrapperProductModal

private val ProductModalStyleBuilder.invariantProps: ProductModalStyleBuilder
    @Composable
    get() = this
        .modalStyle(
            Modal.Default.modify {
                shape(PlasmaGigaTheme.shapes.roundXxl)
                dimensions {
                    paddingStart(0.dp)
                    paddingEnd(0.dp)
                    paddingTop(0.dp)
                    paddingBottom(0.dp)
                }
            }.style(),
        )
        .colors {
            headerTextColor(SolidColor(PlasmaGigaTheme.colors.textDefaultPrimary).asStatefulValue())
            footerTextColor(SolidColor(PlasmaGigaTheme.colors.textDefaultSecondary).asStatefulValue())
        }
        .footerTextStyle(PlasmaGigaTheme.typography.bodyXxsNormal)
        .buttonGroupStyle(BasicButtonGroup.M.Wide.Default.style())
        .iconButtonStyle(IconButton.S.Clear.style())

public val ProductModal.M: WrapperProductModalM
    @Composable
    @JvmName("WrapperProductModalM")
    get() = ProductModalStyle.builder(this)
        .invariantProps
        .headerTextStyle(PlasmaGigaTheme.typography.headerH2Bold)
        .dimensions {
            headerPaddingStart(32.0.dp)
            headerPaddingTop(32.0.dp)
            headerPaddingEnd(32.0.dp)
            headerPaddingBottom(32.0.dp)
            extraPaddingStart(32.0.dp)
            extraPaddingTop(32.0.dp)
            extraPaddingEnd(32.0.dp)
            extraPaddingBottom(0.0.dp)
            footerPaddingStart(32.0.dp)
            footerPaddingTop(32.0.dp)
            footerPaddingEnd(32.0.dp)
            footerPaddingBottom(32.0.dp)
            footerTextPadding(16.0.dp)
            closePaddingEnd(32.0.dp)
            closePaddingTop(32.0.dp)
        }
        .wrap(::WrapperProductModalM)

public val ProductModal.S: WrapperProductModalS
    @Composable
    @JvmName("WrapperProductModalS")
    get() = ProductModalStyle.builder(this)
        .invariantProps
        .headerTextStyle(PlasmaGigaTheme.typography.headerH3Bold)
        .dimensions {
            headerPaddingStart(24.0.dp)
            headerPaddingTop(24.0.dp)
            headerPaddingEnd(24.0.dp)
            headerPaddingBottom(12.0.dp)
            extraPaddingStart(24.0.dp)
            extraPaddingTop(24.0.dp)
            extraPaddingEnd(24.0.dp)
            extraPaddingBottom(0.0.dp)
            footerPaddingStart(24.0.dp)
            footerPaddingTop(24.0.dp)
            footerPaddingEnd(24.0.dp)
            footerPaddingBottom(24.0.dp)
            footerTextPadding(16.0.dp)
            closePaddingEnd(24.0.dp)
            closePaddingTop(19.0.dp)
        }
        .wrap(::WrapperProductModalS)
