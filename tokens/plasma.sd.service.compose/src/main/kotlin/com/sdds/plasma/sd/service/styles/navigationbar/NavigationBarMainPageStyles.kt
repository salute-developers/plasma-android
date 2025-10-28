// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.navigationbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNavigationBarMainPage :
    BuilderWrapper<NavigationBarStyle, NavigationBarStyleBuilder>

/**
 * Обертка для вариации NoBackground
 */
@JvmInline
public value class WrapperNavigationBarMainPageNoBackground(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarMainPage

/**
 * Обертка для вариации NoBackgroundRounded
 */
@JvmInline
public value class WrapperNavigationBarMainPageNoBackgroundRounded(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarMainPage

/**
 * Обертка для вариации HasBackground
 */
@JvmInline
public value class WrapperNavigationBarMainPageHasBackground(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarMainPage

/**
 * Обертка для вариации HasBackgroundRounded
 */
@JvmInline
public value class WrapperNavigationBarMainPageHasBackgroundRounded(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarMainPage

/**
 * Обертка для вариации HasBackgroundShadow
 */
@JvmInline
public value class WrapperNavigationBarMainPageHasBackgroundShadow(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarMainPage

/**
 * Обертка для вариации HasBackgroundShadowRounded
 */
@JvmInline
public value class WrapperNavigationBarMainPageHasBackgroundShadowRounded(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarMainPage

private val NavigationBarStyleBuilder.invariantProps: NavigationBarStyleBuilder
    @Composable
    get() = this
        .textStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .colors {
            textColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
            actionStartColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
            actionEndColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(20.0.dp)
            textBlockTopMargin(16.0.dp)
            horizontalSpacing(16.0.dp)
        }

public val NavigationBarMainPage.NoBackground: WrapperNavigationBarMainPageNoBackground
    @Composable
    @JvmName("WrapperNavigationBarMainPageNoBackground")
    get() = NavigationBarStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .wrap(::WrapperNavigationBarMainPageNoBackground)

public val WrapperNavigationBarMainPageNoBackground.Rounded:
    WrapperNavigationBarMainPageNoBackgroundRounded
    @Composable
    @JvmName("WrapperNavigationBarMainPageNoBackgroundRounded")
    get() = builder
        .bottomShape(PlasmaSdServiceTheme.shapes.roundL)
        .wrap(::WrapperNavigationBarMainPageNoBackgroundRounded)

public val NavigationBarMainPage.HasBackground: WrapperNavigationBarMainPageHasBackground
    @Composable
    @JvmName("WrapperNavigationBarMainPageHasBackground")
    get() = NavigationBarStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
        }
        .wrap(::WrapperNavigationBarMainPageHasBackground)

public val WrapperNavigationBarMainPageHasBackground.Rounded:
    WrapperNavigationBarMainPageHasBackgroundRounded
    @Composable
    @JvmName("WrapperNavigationBarMainPageHasBackgroundRounded")
    get() = builder
        .bottomShape(PlasmaSdServiceTheme.shapes.roundL)
        .wrap(::WrapperNavigationBarMainPageHasBackgroundRounded)

public val WrapperNavigationBarMainPageHasBackground.Shadow:
    WrapperNavigationBarMainPageHasBackgroundShadow
    @Composable
    @JvmName("WrapperNavigationBarMainPageHasBackgroundShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftM)
        .wrap(::WrapperNavigationBarMainPageHasBackgroundShadow)

public val WrapperNavigationBarMainPageHasBackgroundShadow.Rounded:
    WrapperNavigationBarMainPageHasBackgroundShadowRounded
    @Composable
    @JvmName("WrapperNavigationBarMainPageHasBackgroundShadowRounded")
    get() = builder
        .bottomShape(PlasmaSdServiceTheme.shapes.roundL)
        .wrap(::WrapperNavigationBarMainPageHasBackgroundShadowRounded)
