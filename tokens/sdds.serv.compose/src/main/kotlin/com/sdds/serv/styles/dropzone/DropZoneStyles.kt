// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.dropzone

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropZoneBorderType
import com.sdds.compose.uikit.DropZoneIconPlacement
import com.sdds.compose.uikit.DropZoneState
import com.sdds.compose.uikit.DropZoneStyle
import com.sdds.compose.uikit.DropZoneStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.overlay.Default
import com.sdds.serv.styles.overlay.Overlay
import com.sdds.serv.theme.SddsServTheme
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
        .shape(SddsServTheme.shapes.roundXl)
        .borderType(DropZoneBorderType.Dashes)
        .iconPlacement(DropZoneIconPlacement.Top)
        .colors {
            background(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidCardHover),
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            titleColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                SddsServTheme.colors.textDefaultTertiary.asInteractive(),
            )
            borderColor(
                SddsServTheme.colors.outlineDefaultSolidSecondary.asInteractive(
                    setOf(DropZoneState.DraggingOver)
                        to SddsServTheme.colors.outlineDefaultAccent,
                    setOf(InteractiveState.Focused)
                        to SddsServTheme.colors.outlineDefaultSolidSecondaryHover,
                ),
            )
        }
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(24.0.dp)
            iconSize(24.0.dp)
            borderThickness(1.0.dp)
            borderDashWidth(6.0.dp)
            borderDashGap(8.0.dp)
            iconPadding(8.0.dp)
            gap(12.0.dp)
        }
        .disableAlpha(0.4f)
        .overlayStyle(Overlay.Default.style())
        .titleStyle(SddsServTheme.typography.headerH4Bold)
        .descriptionStyle(SddsServTheme.typography.bodySNormal)
        .wrap(::WrapperDropZoneDefault)
