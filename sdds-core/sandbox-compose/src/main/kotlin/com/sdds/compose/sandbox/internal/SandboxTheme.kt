package com.sdds.compose.sandbox.internal

import android.app.Activity
import android.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
internal const val FieldFocusSelectorModeSwitch = true

/**
 * Тема демо-приложения
 */
@Composable
fun SandboxTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
//    val colorScheme = when {
//        darkTheme -> DarkColors
//        else -> LightColors
//    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.TRANSPARENT
            window.navigationBarColor = Color.TRANSPARENT
//            window.decorView.setBackgroundColor(colorScheme.backgroundDefaultPrimary.toArgb())
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    content()
//    SddsServTheme(
//        colors = colorScheme,
//        gradients = if (darkTheme) DarkGradients else LightGradients,
//        content = {
//            CompositionLocalProvider(
//                LocalFocusSelectorMode provides FocusSelectorMode.Border(
//                    borderStroke = BorderStroke(1.dp, colorScheme.surfaceDefaultAccent),
//                    strokePadding = 2.dp,
//                ),
//                LocalSandboxStyle provides SandboxStyle.create(
//                    drawerBackgroundColor = colorScheme.surfaceDefaultSolidSecondary,
//                    sheetBackgroundColor = colorScheme.surfaceDefaultSolidCard,
//                    sheetShape = SddsServTheme.shapes.roundS.copy(
//                        CornerSize(0.dp),
//                        CornerSize(0.dp),
//                    ),
//                    componentBackgroundColor = ComposeColor.Transparent.asStatefulValue(
//                        setOf(SubTheme.INVERSE) to colorScheme.backgroundInversePrimary,
//                        setOf(SubTheme.ON_DARK) to ComposeColor.Black,
//                        setOf(SubTheme.ON_LIGHT) to ComposeColor.White,
//                    ),
//                    componentBackgroundShape = SddsServTheme.shapes.roundM,
//                ),
//                LocalNavigationViewStyle provides NavigationViewStyle.create(
//                    itemTextStyle = SddsServTheme.typography.bodyMBold,
//                    itemTextColor = colorScheme.textDefaultPrimary.asInteractive(
//                        focused = if (darkTheme) {
//                            colorScheme.textInversePrimary
//                        } else {
//                            colorScheme.textDefaultPrimary
//                        },
//                    ),
//                    itemBackground = ComposeColor.Transparent.asInteractive(
//                        focused = if (darkTheme) {
//                            colorScheme.surfaceDefaultSolidDefault
//                        } else {
//                            colorScheme.surfaceDefaultTransparentSecondary
//                        },
//                    ),
//                    itemCard = CardSolid.L.builder
//                        .colors {
//                            backgroundColor(colorScheme.surfaceDefaultSolidCard)
//                        }
//                        .style(),
//                    headerTextColor = colorScheme.textDefaultPrimary,
//                    headerTextStyle = SddsServTheme.typography.bodyMBold,
//                ),
//                LocalTopBarStyle provides TopBarStyle.create(
//                    titleStyle = SddsServTheme.typography.bodyMBold,
//                    dropItemTextStyle = SddsServTheme.typography.bodyMNormal,
//                    titleColor = colorScheme.textDefaultPrimary.asInteractive(
//                        focused = colorScheme.textInversePrimary,
//                    ),
//                    backgroundColor = colorScheme.surfaceDefaultSolidCard,
//                    contentColor = colorScheme.textDefaultPrimary,
//                    navigationButtonStyle = IconButton.M.Pilled.Clear.style(),
//                    actionButtonStyle = IconButton.M.Pilled.Clear.style(),
//                    shapeDropDown = SddsServTheme.shapes.roundXxs,
//                    dropItemBackground = ComposeColor.Transparent.asInteractive(
//                        focused = colorScheme.surfaceDefaultSolidDefault,
//                        selected = colorScheme.surfaceDefaultSolidSecondary,
//                    ),
//                ),
//                LocalPropertiesListStyle provides defaultPropertiesListStyle(darkTheme),
//                LocalPropertyEditorStyle provides PropertyEditorStyle.create(
//                    headerHeight = 74.dp,
//                    shape = SddsServTheme.shapes.roundM,
//                    labelTextStyle = SddsServTheme.typography.bodyMBold,
//                    labelTextColor = colorScheme.textDefaultPrimary,
//                    editorItemBackground = ComposeColor.Transparent.asInteractive(
//                        focused = colorScheme.surfaceDefaultSolidDefault,
//                        selected = colorScheme.surfaceDefaultSolidSecondary,
//                    ),
//                    editorItemShape = SddsServTheme.shapes.roundXs,
//                    editorItemPadding = 6.dp,
//                    editorItemHeight = 24.dp,
//                    textEditorStyle = TextField.S.InnerLabel.builder
//                        .labelStyle(SddsServTheme.typography.bodyXsNormal)
//                        .valueStyle(SddsServTheme.typography.bodyLNormal)
//                        .dimensions {
//                            boxPaddingStart(6.dp)
//                        }
//                        .colors {
//                            labelColor(colorScheme.textDefaultSecondary)
//                            valueColor(colorScheme.textDefaultPrimary)
//                            backgroundColor(ComposeColor.Transparent)
//                            dividerColor(ComposeColor.Transparent)
//                        }.style(),
//                    backgroundColor = colorScheme.surfaceDefaultSolidCard,
//                    editorItemTextStyle = SddsServTheme.typography.bodyMNormal,
//                    editorItemTextColor = colorScheme.textDefaultPrimary.asInteractive(
//                        focused = colorScheme.textInversePrimary,
//                    ),
//                    choiceEditorTextColor = colorScheme.textDefaultSecondary,
//                    spacing = 14.dp,
//                ),
//                content = content,
//            )
//        },
//    )
}

//@Composable
//private fun defaultPropertiesListStyle(
//    darkTheme: Boolean,
//): PropertiesListStyle =
//    PropertiesListStyle.create(
//        shape = SddsServTheme.shapes.roundM,
//        borderWidth = 1.dp,
//        borderColor = SddsServTheme.colors.surfaceDefaultSolidTertiary,
//        backgroundColor = SddsServTheme.colors.surfaceDefaultSolidCard,
//        headerBackgroundColor = SddsServTheme.colors.surfaceDefaultSolidSecondary,
//        headerHeight = 74.dp,
//        headerPaddings = PaddingValues(16.dp),
//        headerTextStyle = SddsServTheme.typography.bodyMBold,
//        headerTextColor = SddsServTheme.colors.textDefaultPrimary,
//        headerDescriptionTextColor = SddsServTheme.colors.textDefaultSecondary,
//        propertyLabelTextStyle = SddsServTheme.typography.bodyMNormal,
//        propertyValueTextColor = SddsServTheme.colors.textDefaultPrimary.asInteractive(
//            focused = if (darkTheme) {
//                SddsServTheme.colors.textInversePrimary
//            } else {
//                SddsServTheme.colors.textDefaultPrimary
//            },
//        ),
//        propertyValueTextStyle = SddsServTheme.typography.bodyMNormal,
//        propertyLabelTextColor = SddsServTheme.colors.textDefaultSecondary.asInteractive(
//            focused = if (darkTheme) {
//                SddsServTheme.colors.textInverseSecondary
//            } else {
//                SddsServTheme.colors.textDefaultSecondary
//            },
//        ),
//        propertyBackgroundColor = ComposeColor.Transparent.asInteractive(
//            focused = if (darkTheme) {
//                SddsServTheme.colors.surfaceDefaultSolidDefault
//            } else {
//                SddsServTheme.colors.surfaceDefaultTransparentSecondary
//            },
//        ),
//        propertyPaddings = 6.dp,
//        spaceBetweenProperties = 14.dp,
//        propertySwitchStyle = Switch.M.ToggleS.style(),
//        propertyItemShape = SddsServTheme.shapes.roundXs,
//        propertyHeight = 24.dp,
//        dividerWidth = 1.dp,
//        dividerColor = SddsServTheme.colors.surfaceDefaultSolidSecondary,
//        resetButtonStyle = IconButton.Xs.Pilled.Clear.style(),
//    )
