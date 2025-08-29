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
import com.sdkit.star.designsystem.styles.iconbutton.IconButton
import com.sdkit.star.designsystem.styles.iconbutton.M
import com.sdkit.star.designsystem.styles.iconbutton.Pilled
import com.sdkit.star.designsystem.styles.iconbutton.Xs
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.Switch
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextField
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

internal const val FieldFocusSelectorModeSwitch = false

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
                    itemTextStyle = StarDsTheme.typography.bodyXsNormal,
                    itemTextColor = colorScheme.textDefaultPrimary.asInteractive(
                        focused = colorScheme.textInversePrimary,
                    ),
                    itemBackground = ComposeUiGraphicsColor.Transparent.asInteractive(
                        focused = colorScheme.surfaceDefaultSolidDefault,
                        selected = colorScheme.surfaceDefaultSolidSecondary,
                    ),
                    itemHeight = 24.dp,
                    itemPaddings = 6.dp,
                    menuBackground = colorScheme.surfaceDefaultSolidCard,
                    menuShape = StarDsTheme.shapes.roundL,
                    menuWidth = 240.dp,
                    headerHeight = 72.dp,
                    headerTextStyle = StarDsTheme.typography.bodyXsBold,
                    headerTextColor = colorScheme.textDefaultPrimary,
                    selectedShape = StarDsTheme.shapes.roundXs,
                ),
                LocalTopBarStyle provides TopBarStyle.create(
                    titleStyle = StarDsTheme.typography.bodyMBold,
                    titleColor = colorScheme.textDefaultPrimary.asInteractive(
                        focused = colorScheme.textInversePrimary,
                    ),
                    backgroundColor = colorScheme.surfaceDefaultClear,
                    contentColor = colorScheme.textDefaultPrimary,
                    navigationButtonStyle = IconButton.M.Pilled.style(),
                    actionButtonStyle = IconButton.M.Pilled.style(),
                ),
                LocalPropertiesListStyle provides defaultPropertiesListStyle(),
                LocalPropertyEditorStyle provides PropertyEditorStyle.create(
                    headerHeight = 72.dp,
                    shape = StarDsTheme.shapes.roundM,
                    labelTextStyle = StarDsTheme.typography.bodyXsNormal,
                    labelTextColor = colorScheme.textDefaultPrimary,
                    editorItemBackground = ComposeUiGraphicsColor.Transparent.asInteractive(
                        focused = colorScheme.surfaceDefaultSolidDefault,
                        selected = colorScheme.surfaceDefaultSolidSecondary,
                    ),
                    editorItemShape = StarDsTheme.shapes.roundXs,
                    editorItemPadding = 6.dp,
                    editorItemHeight = 24.dp,
                    textEditorStyle = TextField.S.InnerLabel.builder
                        .labelStyle(StarDsTheme.typography.bodyXsNormal)
                        .valueStyle(StarDsTheme.typography.bodyLNormal)
                        .dimensions {
                            boxPaddingStart(6.dp)
                        }
                        .colors {
                            labelColor(colorScheme.textDefaultSecondary)
                            valueColor(colorScheme.textDefaultPrimary)
                            backgroundColor(androidx.compose.ui.graphics.Color.Transparent)
                            dividerColor(androidx.compose.ui.graphics.Color.Transparent)
                        }.style(),
                    backgroundColor = colorScheme.surfaceDefaultSolidCard,
                    editorItemTextStyle = StarDsTheme.typography.bodyXsNormal,
                    editorItemTextColor = colorScheme.textDefaultPrimary.asInteractive(
                        focused = colorScheme.textInverseSecondary,
                    ),
                    choiceEditorTextColor = colorScheme.textDefaultSecondary,
                    spacing = 14.dp,
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
        headerHeight = 72.dp,
        headerPaddings = PaddingValues(16.dp),
        headerTextStyle = StarDsTheme.typography.bodyXsBold,
        headerTextColor = StarDsTheme.colors.textDefaultPrimary,
        headerDescriptionTextColor = StarDsTheme.colors.textDefaultSecondary,
        propertyLabelTextStyle = StarDsTheme.typography.bodyXsNormal,
        propertyLabelTextColor = StarDsTheme.colors.textDefaultSecondary.asInteractive(
            focused = StarDsTheme.colors.textInverseSecondary,
        ),
        propertyValueTextStyle = StarDsTheme.typography.bodyXsNormal,
        propertyValueTextColor = StarDsTheme.colors.textDefaultPrimary.asInteractive(
            focused = StarDsTheme.colors.textInversePrimary,
        ),
        propertyBackgroundColor = ComposeUiGraphicsColor.Transparent.asInteractive(
            focused = StarDsTheme.colors.surfaceDefaultSolidDefault,
        ),
        propertyPaddings = 6.dp,
        spaceBetweenProperties = 14.dp,
        propertySwitchStyle = Switch.M.builder.dimensionValues {
            toggleTrackWidth(32.dp)
            toggleTrackHeight(20.dp)
            toggleThumbWidth(16.dp)
            toggleThumbHeight(16.dp)
        }.style(),
        propertyHeight = 24.dp,
        propertyItemShape = StarDsTheme.shapes.roundXs,
        dividerWidth = 1.dp,
        dividerColor = StarDsTheme.colors.surfaceDefaultSolidSecondary,
        resetButtonStyle = IconButton.Xs.style(),
    )
