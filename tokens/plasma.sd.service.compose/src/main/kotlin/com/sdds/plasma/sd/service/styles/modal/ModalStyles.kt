// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.modal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.ModalStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
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
        .shape(PlasmaSdServiceTheme.shapes.roundXl)
        .shadow(PlasmaSdServiceTheme.shadows.downSoftL)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(32.0.dp)
            paddingEnd(32.0.dp)
            paddingTop(32.0.dp)
            paddingBottom(32.0.dp)
            closeSize(24.0.dp)
        }
        .wrap(::WrapperModalDefault)
