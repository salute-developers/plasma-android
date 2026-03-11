// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.navigationbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarStyleBuilder
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNavigationBarInternalPage :
    BuilderWrapper<NavigationBarStyle, NavigationBarStyleBuilder>

/**
 * Обертка для вариации NoBackground
 */
@JvmInline
public value class WrapperNavigationBarInternalPageNoBackground(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarInternalPage

/**
 * Обертка для вариации NoBackgroundRounded
 */
@JvmInline
public value class WrapperNavigationBarInternalPageNoBackgroundRounded(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarInternalPage

/**
 * Обертка для вариации HasBackground
 */
@JvmInline
public value class WrapperNavigationBarInternalPageHasBackground(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarInternalPage

/**
 * Обертка для вариации HasBackgroundRounded
 */
@JvmInline
public value class WrapperNavigationBarInternalPageHasBackgroundRounded(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarInternalPage

/**
 * Обертка для вариации HasBackgroundShadow
 */
@JvmInline
public value class WrapperNavigationBarInternalPageHasBackgroundShadow(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarInternalPage

/**
 * Обертка для вариации HasBackgroundShadowRounded
 */
@JvmInline
public value class WrapperNavigationBarInternalPageHasBackgroundShadowRounded(
    public override val builder: NavigationBarStyleBuilder,
) : WrapperNavigationBarInternalPage

private val NavigationBarStyleBuilder.invariantProps: NavigationBarStyleBuilder
    @Composable
    get() = this
        .textStyle(SddsSandboxTheme.typography.bodyLBold)
        .titleStyle(
            SddsSandboxTheme.typography.headerH2Normal.asStatefulValue(
                setOf(NavigationBarTextPlacement.Inline) to
                    SddsSandboxTheme.typography.bodyMNormal,
            ),
        )
        .descriptionStyle(
            SddsSandboxTheme.typography.bodyMNormal.asStatefulValue(
                setOf(NavigationBarTextPlacement.Inline) to
                    SddsSandboxTheme.typography.bodyXsNormal,
            ),
        )
        .backIcon(com.sdds.icons.R.drawable.ic_disclosure_left_outline_24)
        .colors {
            backIconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            titleColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
            )
            actionStartColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            actionEndColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(20.0.dp)
            backIconMargin(4.0.dp)
            textBlockTopMargin(16.0.dp)
            horizontalSpacing(16.0.dp)
            descriptionPadding(
                12.0.dp.asStatefulValue(
                    setOf(NavigationBarTextPlacement.Inline) to 4.0.dp,
                ),
            )
        }

public val NavigationBarInternalPage.NoBackground: WrapperNavigationBarInternalPageNoBackground
    @Composable
    @JvmName("WrapperNavigationBarInternalPageNoBackground")
    get() = NavigationBarStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .wrap(::WrapperNavigationBarInternalPageNoBackground)

public val WrapperNavigationBarInternalPageNoBackground.Rounded:
    WrapperNavigationBarInternalPageNoBackgroundRounded
    @Composable
    @JvmName("WrapperNavigationBarInternalPageNoBackgroundRounded")
    get() = builder
        .bottomShape(SddsSandboxTheme.shapes.roundL)
        .wrap(::WrapperNavigationBarInternalPageNoBackgroundRounded)

public val NavigationBarInternalPage.HasBackground: WrapperNavigationBarInternalPageHasBackground
    @Composable
    @JvmName("WrapperNavigationBarInternalPageHasBackground")
    get() = NavigationBarStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
        }
        .wrap(::WrapperNavigationBarInternalPageHasBackground)

public val WrapperNavigationBarInternalPageHasBackground.Rounded:
    WrapperNavigationBarInternalPageHasBackgroundRounded
    @Composable
    @JvmName("WrapperNavigationBarInternalPageHasBackgroundRounded")
    get() = builder
        .bottomShape(SddsSandboxTheme.shapes.roundL)
        .wrap(::WrapperNavigationBarInternalPageHasBackgroundRounded)

public val WrapperNavigationBarInternalPageHasBackground.Shadow:
    WrapperNavigationBarInternalPageHasBackgroundShadow
    @Composable
    @JvmName("WrapperNavigationBarInternalPageHasBackgroundShadow")
    get() = builder
        .shadow(SddsSandboxTheme.shadows.downSoftM)
        .wrap(::WrapperNavigationBarInternalPageHasBackgroundShadow)

public val WrapperNavigationBarInternalPageHasBackgroundShadow.Rounded:
    WrapperNavigationBarInternalPageHasBackgroundShadowRounded
    @Composable
    @JvmName("WrapperNavigationBarInternalPageHasBackgroundShadowRounded")
    get() = builder
        .bottomShape(SddsSandboxTheme.shapes.roundL)
        .wrap(::WrapperNavigationBarInternalPageHasBackgroundShadowRounded)
