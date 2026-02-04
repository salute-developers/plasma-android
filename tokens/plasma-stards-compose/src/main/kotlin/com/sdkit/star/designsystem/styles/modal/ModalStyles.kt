// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.modal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.ModalStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.overlay.Default
import com.sdkit.star.designsystem.styles.overlay.Overlay
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperModal : BuilderWrapper<ModalStyle, ModalStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperModalDefault(
    public override val builder: ModalStyleBuilder,
) : WrapperModal

public val Modal.Default: WrapperModalDefault
    @Composable
    @JvmName("WrapperModalDefault")
    get() = ModalStyle.builder(this)
        .shape(StarDsTheme.shapes.roundXl)
        .shadow(StarDsTheme.shadows.downSoftL)
        .colors {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_modal_padding_start_Default))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_modal_padding_end_Default))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_modal_padding_top_Default))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_modal_padding_bottom_Default))
            closeSize(dimensionResource(R.dimen.sdkit_cmp_modal_close_size_Default))
        }
        .overlayStyle(Overlay.Default.style())
        .wrap(::WrapperModalDefault)
