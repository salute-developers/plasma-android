// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.bottomsheet

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.ModalBottomSheetStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
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
        .shape(SddsSbComTheme.shapes.roundXxl.adjustBy(all = -4.0.dp))
        .handleShape(CircleShape)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            handleHeight(4.0.dp)
            handleWidth(32.0.dp)
            handleOffset(16.0.dp)
        }
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
            handleColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .handlePlacement(BottomSheetHandlePlacement.Inner)
        .wrap(::WrapperModalBottomSheetDefault)
