// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.toolbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ToolBarOrientation
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.ToolBarStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperToolBar : BuilderWrapper<ToolBarStyle, ToolBarStyleBuilder>

/**
 * Обертка для вариации TypeDefault
 */
@JvmInline
public value class WrapperToolBarTypeDefault(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBar

/**
 * Обертка для вариации TypeGroup
 */
@JvmInline
public value class WrapperToolBarTypeGroup(
    public override val builder: ToolBarStyleBuilder,
) : WrapperToolBar

private val ToolBarStyleBuilder.invariantProps: ToolBarStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())
        .orientation(ToolBarOrientation.Horizontal)
        .dimensions {
            dividerMargin(4.0.dp)
        }

public val ToolBar.TypeDefault: WrapperToolBarTypeDefault
    @Composable
    @JvmName("WrapperToolBarTypeDefault")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(CircleShape)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue())
        }
        .dimensions {
            sectionPadding(8.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
        }
        .wrap(::WrapperToolBarTypeDefault)

public val ToolBar.TypeGroup: WrapperToolBarTypeGroup
    @Composable
    @JvmName("WrapperToolBarTypeGroup")
    get() = ToolBarStyle.builder(this)
        .invariantProps
        .shape(CircleShape)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
        }
        .dimensions {
            sectionPadding(8.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
        }
        .wrap(::WrapperToolBarTypeGroup)
