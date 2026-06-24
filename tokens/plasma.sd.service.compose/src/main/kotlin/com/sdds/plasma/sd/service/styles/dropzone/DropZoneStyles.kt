// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.dropzone

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropZoneBorderType
import com.sdds.compose.uikit.DropZoneIconPlacement
import com.sdds.compose.uikit.DropZoneState
import com.sdds.compose.uikit.DropZoneStyle
import com.sdds.compose.uikit.DropZoneStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.overlay.Default
import com.sdds.plasma.sd.service.styles.overlay.Overlay
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropZone : BuilderWrapper<DropZoneStyle, DropZoneStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperDropZoneDefault(
    public override val builder: DropZoneStyleBuilder,
) : WrapperDropZone

public val DropZone.Default: WrapperDropZoneDefault
    @Composable
    @JvmName("WrapperDropZoneDefault")
    get() = DropZoneStyle.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundXl)
        .iconPlacement(DropZoneIconPlacement.Top)
        .borderType(DropZoneBorderType.Dashes)
        .titleStyle(PlasmaSdServiceTheme.typography.headerH4Bold)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .disableAlpha(0.4f)
        .overlayStyle(Overlay.Default.style())
        .colors {
            background(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidCardHover),
                ),
            )
            titleColor(SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimary).asStatefulValue())
            descriptionColor(SolidColor(PlasmaSdServiceTheme.colors.textDefaultTertiary).asStatefulValue())
            iconColor(SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimary).asStatefulValue())
            borderColor(
                SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultSolidSecondary).asStatefulValue(
                    setOf(DropZoneState.DraggingOver)
                        to SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultAccent),
                    setOf(InteractiveState.Focused) to
                        SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultSolidSecondaryHover),
                ),
            )
        }
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(24.0.dp)
            borderThickness(1.0.dp)
            borderDashWidth(8.0.dp)
            borderDashGap(6.0.dp)
            iconSize(24.0.dp)
            iconPadding(8.0.dp)
            gap(12.0.dp)
        }
        .wrap(::WrapperDropZoneDefault)
