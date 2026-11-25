// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.navigationbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarStyleBuilder
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.iconbutton.IconButton
import com.sdds.plasma.homeds.styles.iconbutton.S
import com.sdds.plasma.homeds.styles.iconbutton.Secondary
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNavigationBarInternalPage :
    BuilderWrapper<NavigationBarStyle, NavigationBarStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperNavigationBarInternalPageDefault(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarInternalPage

public val NavigationBarInternalPage.Default: WrapperNavigationBarInternalPageDefault
    @Composable
    @JvmName("WrapperNavigationBarInternalPageDefault")
    get() = NavigationBarStyle.builder(this)
        .textStyle(PlasmaHomeDsTheme.typography.headerH5Normal)
        .titleStyle(
            PlasmaHomeDsTheme.typography.headerH2Normal.asStatefulValue(
                setOf(NavigationBarTextPlacement.Inline)
                    to PlasmaHomeDsTheme.typography.bodyMNormal,
            ),
        )
        .descriptionStyle(
            PlasmaHomeDsTheme.typography.bodyMNormal.asStatefulValue(
                setOf(NavigationBarTextPlacement.Inline)
                    to PlasmaHomeDsTheme.typography.bodyXsNormal,
            ),
        )
        .backIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_chevron_left_24))
        .actionButtonStyle(IconButton.S.Secondary.style())
        .colors {
            backgroundColor(SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultClear).asStatefulValue())
            backIconColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            actionStartColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            actionEndColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            textColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            titleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            descriptionColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
        }
        .dimensions {
            backIconMargin(4.0.dp)
            textBlockTopMargin(16.0.dp)
            horizontalSpacing(8.0.dp)
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            descriptionPadding(12.0.dp.asStatefulValue(setOf(NavigationBarTextPlacement.Inline) to 4.0.dp))
            minContentHeight(24.0.dp)
        }
        .wrap(::WrapperNavigationBarInternalPageDefault)
