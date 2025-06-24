// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.divider

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.DividerStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDivider : BuilderWrapper<DividerStyle, DividerStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperDividerDefault(
    public override val builder: DividerStyleBuilder,
) : WrapperDivider

public val Divider.Default: WrapperDividerDefault
    @Composable
    @JvmName("WrapperDividerDefault")
    get() = DividerStyle.builder(this)
        .shape(CircleShape)
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            thickness(dimensionResource(R.dimen.sdkit_cmp_divider_thickness_Default))
        }
        .wrap(::WrapperDividerDefault)
