// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.modal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.ModalStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.overlay.Default
import com.sdds.sbcom.styles.overlay.Overlay
import com.sdds.sbcom.theme.SddsSbComTheme
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
        .shape(SddsSbComTheme.shapes.roundXxl.adjustBy(all = -4.0.dp))
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(20.0.dp)
        }
        .overlayStyle(Overlay.Default.style())
        .wrap(::WrapperModalDefault)
