// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.bottomsheet

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.ModalBottomSheetStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperModalBottomSheet :
    BuilderWrapper<ModalBottomSheetStyle, ModalBottomSheetStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperModalBottomSheetDefault(
    public override val builder: ModalBottomSheetStyleBuilder,
) : WrapperModalBottomSheet

public val ModalBottomSheet.Default: WrapperModalBottomSheetDefault
    @Composable
    @JvmName("WrapperModalBottomSheetDefault")
    get() = ModalBottomSheetStyle.builder(this)
        .shape(PlasmaGigaTheme.shapes.roundXl)
        .handleShape(CircleShape)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            handleHeight(4.0.dp)
            handleWidth(48.0.dp)
            handleOffset(6.0.dp)
        }
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
            handleColor(
                PlasmaGigaTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
            )
        }
        .handlePlacement(BottomSheetHandlePlacement.Auto)
        .wrap(::WrapperModalBottomSheetDefault)
