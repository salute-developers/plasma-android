// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.collapsingnavigationbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CollapsingNavigationBarStates
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.CollapsingNavigationBarStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
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
public interface WrapperCollapsingNavigationBarMainPage :
    BuilderWrapper<CollapsingNavigationBarStyle, CollapsingNavigationBarStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperCollapsingNavigationBarMainPageDefault(
    public override val builder: CollapsingNavigationBarStyleBuilder,
) : WrapperCollapsingNavigationBarMainPage

public val CollapsingNavigationBarMainPage.Default: WrapperCollapsingNavigationBarMainPageDefault
    @Composable
    @JvmName("WrapperCollapsingNavigationBarMainPageDefault")
    get() = CollapsingNavigationBarStyle.builder(this)
        .titleStyle(
            PlasmaHomeDsTheme.typography.headerH2Normal.asStatefulValue(
                setOf(CollapsingNavigationBarStates.Collapsed) to
                    PlasmaHomeDsTheme.typography.bodyMNormal,
            ),
        )
        .descriptionStyle(
            PlasmaHomeDsTheme.typography.bodyMNormal.asStatefulValue(
                setOf(CollapsingNavigationBarStates.Collapsed) to
                    PlasmaHomeDsTheme.typography.bodyXsNormal,
            ),
        )
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultClear.asStatefulValue(),
            )
            titleColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asStatefulValue(),
            )
            descriptionColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asStatefulValue(),
            )
            actionStartColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asStatefulValue(),
            )
            actionEndColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asStatefulValue(),
            )
        }
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            textBlockTopMargin(16.0.dp)
            horizontalSpacing(8.0.dp)
            descriptionPadding(
                12.0.dp.asStatefulValue(
                    setOf(CollapsingNavigationBarStates.Collapsed) to 4.0.dp,
                ),
            )
        }
        .actionButtonStyle(IconButton.S.Secondary.style())
        .wrap(::WrapperCollapsingNavigationBarMainPageDefault)
