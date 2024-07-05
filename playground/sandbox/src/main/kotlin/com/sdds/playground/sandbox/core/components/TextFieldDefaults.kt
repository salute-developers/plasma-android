package com.sdds.playground.sandbox.core.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

/**
 * Цвета текстового поля
 */
@Stable
internal interface TextFieldColors {

    /**
     * Цвет значения текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun valueColor(state: InputState): State<Color>

    /**
     * Цвет фона текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun backgroundColor(state: InputState): State<Color>

    /**
     * Цвет заглушки текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun placeholderColor(state: InputState): State<Color>

    /**
     * Цвет лейбла текстового поля
     *
     * @param state состояние текстового поля
     * @param type тип лейбла
     */
    @Composable
    fun labelColor(state: InputState, type: SandboxTextField.LabelType): State<Color>

    /**
     * Цвет иконки в начале текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun leadingIconColor(state: InputState): State<Color>

    /**
     * Цвет иконки в конце текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun trailingIconColor(state: InputState): State<Color>

    /**
     * Цвет подписи текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun captionColor(state: InputState): State<Color>

    /**
     * Цвет курсора текстового поля
     *
     * @param state состояние текстового поля
     */
    @Composable
    fun cursorColor(state: InputState): State<Color>
}

/**
 * Текстовые стили поля
 */
@Stable
internal interface TextFieldStyles {

    /**
     * Текстовый стиль внешнего лейбла
     * @param size размер текстового поля
     */
    @Composable
    fun outerLabelStyle(size: SandboxTextField.Size): State<TextStyle>

    /**
     * Текстовый стиль внутреннего лейбла
     * @param size размер текстового поля
     * @param isFocused true, если поле в фокусе
     * @param isEmpty true, если поле пустое
     */
    @Composable
    fun innerLabelStyle(
        size: SandboxTextField.Size,
        isFocused: Boolean,
        isEmpty: Boolean,
    ): State<TextStyle>

    /**
     * Текстовый стиль значения поля
     * @param size размер текстового поля
     */
    @Composable
    fun valueStyle(size: SandboxTextField.Size): State<TextStyle>

    /**
     * Текстовый стиль подписи поля
     * @param size размер текстового поля
     */
    @Composable
    fun captionStyle(size: SandboxTextField.Size): State<TextStyle>

    /**
     * Текстовый стиль заглушки поля
     * @param size размер текстового поля
     */
    @Composable
    fun placeholderStyle(size: SandboxTextField.Size): State<TextStyle>
}

/**
 * Значения по-умолчанию текстового поля
 */
@Immutable
internal object TextFieldDefaults {

    /**
     * Длительность анимации
     */
    const val AnimationDuration = 150

    /**
     * Значение прозрачности поля во включенном состоянии
     */
    const val EnabledAlpha = 1f

    /**
     * Значение прозрачности поля в выключенном состоянии
     */
    const val DisabledAlpha = 0.4f

    /**
     * Длительность анимации заглушки
     */
    const val PlaceholderAnimationDuration = 83

    /**
     * Задержка или длительность анимации заглушки
     */
    const val PlaceholderAnimationDelayOrDuration = 67

    /**
     * Корректировка формы
     */
    val ShapeAdjustment = 2.dp

    /**
     * Внутренние отступы
     */
    val TextFieldPadding = 16.dp

    /**
     * Отступ между внутренним лейблом и значением поля
     */
    val TextFieldTopPadding = 2.dp

    /**
     * Отступ между значением и иконкой
     */
    val HorizontalIconPadding = 8.dp

    /**
     * Размер иконки по-умолчанию
     */
    val IconDefaultSizeModifier = Modifier.defaultMinSize(24.dp, 24.dp)

    /**
     * Отступы в текстовом поле
     * @param size размер текстового поля
     * @param labelType тип лейбла
     */
    fun textFieldPadding(
        size: SandboxTextField.Size = SandboxTextField.Size.L,
        labelType: SandboxTextField.LabelType = SandboxTextField.LabelType.Outer,
    ): PaddingValues {
        if (labelType == SandboxTextField.LabelType.Outer) {
            return PaddingValues(TextFieldPadding, 0.dp, TextFieldPadding, 0.dp)
        }
        return when (size) {
            SandboxTextField.Size.L -> PaddingValues(TextFieldPadding, 25.dp, TextFieldPadding, 9.dp)
            SandboxTextField.Size.M -> PaddingValues(TextFieldPadding, 22.dp, TextFieldPadding, 6.dp)
            SandboxTextField.Size.S -> PaddingValues(TextFieldPadding, 17.dp, TextFieldPadding, 5.dp)
            SandboxTextField.Size.XS -> PaddingValues(TextFieldPadding, 0.dp, TextFieldPadding, 0.dp)
        }
    }

    /**
     *  Цветовые настройки поля
     */
    @Composable
    fun textFieldColors(): TextFieldColors = DefaultTextFieldColors()

    /**
     *  Текстовые стили поля
     */
    @Composable
    fun textFieldStyles(): TextFieldStyles = DefaultTextFieldStyles()

    /**
     * Размер иконки поля [Dp] в зависимости от размера поля [SandboxTextField.Size]
     */
    @Composable
    fun textFieldIconSize(size: SandboxTextField.Size) = when (size) {
        SandboxTextField.Size.XS -> 16.dp
        SandboxTextField.Size.S,
        SandboxTextField.Size.M,
        SandboxTextField.Size.L,
        -> 24.dp
    }

    /**
     * Форма в зависимости от размера поля [SandboxTextField.Size]
     */
    @Composable
    fun textFieldShapeFor(size: SandboxTextField.Size) = when (size) {
        SandboxTextField.Size.XS -> DefaultTheme.shapes.roundXs
        SandboxTextField.Size.S -> DefaultTheme.shapes.roundS
        SandboxTextField.Size.M -> DefaultTheme.shapes.roundM
        SandboxTextField.Size.L -> DefaultTheme.shapes.roundL
    }.adjustBy(ShapeAdjustment)
}

@Immutable
private class DefaultTextFieldColors : TextFieldColors {

    @Composable
    override fun leadingIconColor(state: InputState): State<Color> {
        return rememberUpdatedState(DefaultTheme.colors.textDefaultSecondary)
    }

    @Composable
    override fun trailingIconColor(state: InputState): State<Color> {
        var color = DefaultTheme.colors.textDefaultSecondary
        if (state == InputState.ReadOnly) {
            color = color.copy(alpha = color.alpha * TextFieldDefaults.DisabledAlpha)
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun backgroundColor(state: InputState): State<Color> {
        val surfaceAlpha = if (isSystemInDarkTheme()) 0.12f else 0.06f
        val readOnlyAlpha = if (isSystemInDarkTheme()) 0.02f else 0.01f
        val color = when (state) {
            InputState.Normal -> DefaultTheme.colors.surfaceDefaultTransparentPrimary
            InputState.Focused -> DefaultTheme.colors.surfaceDefaultTransparentSecondary
            InputState.Error -> DefaultTheme.colors.surfaceDefaultNegative.copy(alpha = surfaceAlpha)
            InputState.Warning -> DefaultTheme.colors.surfaceDefaultWarning.copy(alpha = surfaceAlpha)
            InputState.Success -> DefaultTheme.colors.surfaceDefaultPositive.copy(alpha = surfaceAlpha)
            InputState.ReadOnly -> DefaultTheme.colors.surfaceDefaultSolidDefault.copy(alpha = readOnlyAlpha)
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun placeholderColor(state: InputState): State<Color> {
        return rememberUpdatedState(
            if (state == InputState.Focused) {
                DefaultTheme.colors.textDefaultTertiary
            } else {
                DefaultTheme.colors.textDefaultSecondary
            },
        )
    }

    @Composable
    override fun labelColor(state: InputState, type: SandboxTextField.LabelType): State<Color> {
        val color = when (type) {
            SandboxTextField.LabelType.Outer -> textFieldTextColor(state = state)
            SandboxTextField.LabelType.Inner -> DefaultTheme.colors.textDefaultSecondary
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun valueColor(state: InputState): State<Color> {
        return rememberUpdatedState(textFieldTextColor(state = state))
    }

    @Composable
    override fun cursorColor(state: InputState): State<Color> {
        return rememberUpdatedState(DefaultTheme.colors.textDefaultAccent)
    }

    @Composable
    override fun captionColor(state: InputState): State<Color> {
        val color = when (state) {
            InputState.Normal,
            InputState.Focused,
            InputState.ReadOnly,
            -> DefaultTheme.colors.textDefaultSecondary

            InputState.Error -> DefaultTheme.colors.textDefaultNegative
            InputState.Warning -> DefaultTheme.colors.textDefaultWarning
            InputState.Success -> DefaultTheme.colors.textDefaultPositive
        }
        return rememberUpdatedState(newValue = color)
    }

    @Composable
    private fun textFieldTextColor(state: InputState) = when (state) {
        InputState.ReadOnly -> DefaultTheme.colors.textDefaultSecondary
        InputState.Normal,
        InputState.Focused,
        InputState.Error,
        InputState.Warning,
        InputState.Success,
        -> DefaultTheme.colors.textDefaultPrimary
    }
}

@Immutable
private class DefaultTextFieldStyles : TextFieldStyles {
    @Composable
    override fun outerLabelStyle(size: SandboxTextField.Size): State<TextStyle> {
        return rememberUpdatedState(textFieldTextStyle(size))
    }

    @Composable
    override fun innerLabelStyle(size: SandboxTextField.Size, isFocused: Boolean, isEmpty: Boolean): State<TextStyle> {
        val style = if (!isFocused && isEmpty) {
            when (size) {
                SandboxTextField.Size.XS -> DefaultTheme.typography.bodySNormal
                SandboxTextField.Size.S -> DefaultTheme.typography.bodySNormal
                SandboxTextField.Size.M -> DefaultTheme.typography.bodyMNormal
                SandboxTextField.Size.L -> DefaultTheme.typography.bodyLNormal
            }
        } else {
            when (size) {
                SandboxTextField.Size.XS -> DefaultTheme.typography.bodyXxsNormal
                SandboxTextField.Size.S -> DefaultTheme.typography.bodyXxsNormal
                SandboxTextField.Size.M -> DefaultTheme.typography.bodyXsNormal
                SandboxTextField.Size.L -> DefaultTheme.typography.bodyXsNormal
            }
        }
        return rememberUpdatedState(style)
    }

    @Composable
    override fun valueStyle(size: SandboxTextField.Size): State<TextStyle> {
        return rememberUpdatedState(textFieldTextStyle(size))
    }

    @Composable
    override fun captionStyle(size: SandboxTextField.Size): State<TextStyle> {
        return rememberUpdatedState(DefaultTheme.typography.bodyXsNormal)
    }

    @Composable
    override fun placeholderStyle(size: SandboxTextField.Size): State<TextStyle> {
        return rememberUpdatedState(textFieldTextStyle(size))
    }

    @Composable
    private fun textFieldTextStyle(size: SandboxTextField.Size) = when (size) {
        SandboxTextField.Size.XS -> DefaultTheme.typography.bodyXsNormal
        SandboxTextField.Size.S -> DefaultTheme.typography.bodySNormal
        SandboxTextField.Size.M -> DefaultTheme.typography.bodyMNormal
        SandboxTextField.Size.L -> DefaultTheme.typography.bodyLNormal
    }
}
