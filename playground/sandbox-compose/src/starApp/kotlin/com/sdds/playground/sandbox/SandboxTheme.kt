package com.sdds.playground.sandbox

import android.app.Activity
import android.graphics.Color
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.compose.LocalNavigationViewStyle
import com.sdds.playground.sandbox.core.compose.LocalPropertiesListStyle
import com.sdds.playground.sandbox.core.compose.LocalPropertyEditorStyle
import com.sdds.playground.sandbox.core.compose.LocalSandboxStyle
import com.sdds.playground.sandbox.core.compose.LocalTopBarStyle
import com.sdds.playground.sandbox.core.compose.NavigationViewStyle
import com.sdds.playground.sandbox.core.compose.PropertiesListStyle
import com.sdds.playground.sandbox.core.compose.PropertyEditorStyle
import com.sdds.playground.sandbox.core.compose.SandboxStyle
import com.sdds.playground.sandbox.core.compose.TopBarStyle
import com.sdds.serv.styles.switcher.M
import com.sdkit.star.designsystem.styles.button.basic.M
import com.sdkit.star.designsystem.styles.button.icon.M
import com.sdkit.star.designsystem.styles.button.icon.Pilled
import com.sdkit.star.designsystem.styles.button.icon.Xs
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.darkStarDsColors
import com.sdkit.star.designsystem.theme.darkStarDsGradients
import com.sdkit.star.designsystem.theme.lightStarDsColors
import com.sdkit.star.designsystem.theme.lightStarDsGradients
import androidx.compose.ui.graphics.Color.Companion as ComposeUiGraphicsColor

private val DarkColors = darkStarDsColors()
private val LightColor = lightStarDsColors()
private val DarkGradients = darkStarDsGradients()
private val LightGradients = lightStarDsGradients()

internal const val TextFieldFocusSelectorModeSwitch = false

/**
 * Тема демо-приложения
 */
@Composable
fun SandboxTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColors else LightColor
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as? Activity)?.window?.apply {
                statusBarColor = Color.TRANSPARENT
                navigationBarColor = Color.TRANSPARENT
                decorView.setBackgroundColor(colorScheme.backgroundDefaultPrimary.toArgb())
                WindowCompat.getInsetsController(this, view).apply {
                    isAppearanceLightStatusBars = !darkTheme
                    isAppearanceLightNavigationBars = !darkTheme
                }
            }
        }
    }

    StarDsTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = {
            CompositionLocalProvider(
                LocalSandboxStyle provides SandboxStyle.create(
                    drawerBackgroundColor = colorScheme.surfaceDefaultSolidSecondary,
                    sheetBackgroundColor = colorScheme.surfaceDefaultSolidCard,
                    sheetShape = StarDsTheme.shapes.roundS.copy(CornerSize(0.dp), CornerSize(0.dp)),
                ),
                LocalNavigationViewStyle provides NavigationViewStyle.create(
                    itemTextStyle = StarDsTheme.typography.bodyMBold,
                    itemTextColor = colorScheme.textDefaultPrimary.asInteractive(
                        focused = colorScheme.textInversePrimary,
                    ),
                    itemBackground = ComposeUiGraphicsColor.Transparent.asInteractive(
                        focused = StarDsTheme.colors.surfaceDefaultSolidDefault,
                    ),
                ),
                LocalTopBarStyle provides TopBarStyle.create(
                    titleStyle = StarDsTheme.typography.bodyMBold,
                    titleColor = colorScheme.textDefaultPrimary,
                    backgroundColor = colorScheme.surfaceDefaultClear,
                    contentColor = colorScheme.textDefaultPrimary,
                    navigationButtonStyle = IconButton.M.Pilled.style(),
                    actionButtonStyle = IconButton.M.Pilled.style(),
                ),
                LocalPropertiesListStyle provides defaultPropertiesListStyle(),
                LocalPropertyEditorStyle provides PropertyEditorStyle.create(
                    labelTextStyle = StarDsTheme.typography.headerH3Bold,
                    labelTextColor = colorScheme.textDefaultPrimary,
                    confirmButtonStyle = BasicButton.M.style(),
                ),
                content = content,
            )
        },
    )
}

@Composable
private fun defaultPropertiesListStyle(): PropertiesListStyle =
    PropertiesListStyle.create(
        shape = StarDsTheme.shapes.roundM,
        borderWidth = 1.dp,
        borderColor = StarDsTheme.colors.surfaceDefaultSolidTertiary,
        backgroundColor = StarDsTheme.colors.surfaceDefaultSolidCard,
        headerBackgroundColor = StarDsTheme.colors.surfaceDefaultSolidSecondary,
        headerHeight = 56.dp,
        headerPaddings = PaddingValues(16.dp),
        headerTextStyle = StarDsTheme.typography.bodyMBold,
        headerTextColor = StarDsTheme.colors.textDefaultSecondary,
        propertyLabelTextStyle = StarDsTheme.typography.bodyMBold,
        propertyLabelTextColor = StarDsTheme.colors.textDefaultPrimary.asInteractive(
            focused = StarDsTheme.colors.textInversePrimary,
        ),
        propertyValueTextStyle = StarDsTheme.typography.bodyMBold,
        propertyValueTextColor = StarDsTheme.colors.textDefaultSecondary.asInteractive(
            focused = StarDsTheme.colors.textInverseSecondary,
        ),
        propertyBackgroundColor = ComposeUiGraphicsColor.Transparent.asInteractive(
            focused = StarDsTheme.colors.surfaceDefaultSolidDefault,
        ),
        propertyPaddings = PaddingValues(8.dp),
        propertySwitchStyle = Switch.M.style(),
        propertyHeight = 56.dp,
        dividerWidth = 1.dp,
        dividerColor = StarDsTheme.colors.surfaceDefaultSolidSecondary,
        resetButtonStyle = IconButton.Xs.Pilled.style(),
    )
