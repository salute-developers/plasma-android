package com.sdds.compose.uikit

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.switch.BaseSwitchLayout
import com.sdds.compose.uikit.internal.switch.SwitchToggle
import com.sdds.compose.uikit.internal.switch.switchDescription
import com.sdds.compose.uikit.internal.switch.switchLabel

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param label лейбл
 * @param description описание
 * @param style стиль компонента [SwitchStyle]
 * @param dimensions размеры и отступы [SwitchDimensions]
 * @param colors цвета [SwitchColors]
 * @param labelTextStyle стиль текста лэйбла
 * @param descriptionTextStyle стиль текста описания
 * @param labelMaxLines количество строк в лейбле
 * @param descriptionMaxLines количество строк в описании
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взамодействий
 */
@Composable
fun Switch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    dimensions: SwitchDimensions = style.dimensions,
    colors: SwitchColors = style.colors,
    labelTextStyle: TextStyle = style.labelTextStyle,
    descriptionTextStyle: TextStyle = style.descriptionTextStyle,
    labelMaxLines: Int = Int.MAX_VALUE,
    descriptionMaxLines: Int = Int.MAX_VALUE,
    animationDuration: Int = style.animationDurationMillis,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val toggleableModifier =
        if (onActiveChanged != null) {
            Modifier.toggleable(
                value = active,
                onValueChange = onActiveChanged,
                enabled = enabled,
                role = Role.Switch,
                interactionSource = interactionSource,
                indication = null,
            )
        } else {
            Modifier
        }
    BaseSwitchLayout(
        modifier = modifier
            .then(toggleableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else 0.4f },
        switch = {
            SwitchToggle(
                active = active,
                modifier = it,
                colors = colors,
                dimensions = dimensions,
                animationDuration = animationDuration,
                enabled = enabled,
                interactionSource = interactionSource,
            )
        },
        label = switchLabel(
            value = label,
            textStyle = labelTextStyle,
            maxLines = labelMaxLines,
            color = colors.labelColor(interactionSource = interactionSource).value,
        ),
        description = switchDescription(
            value = description,
            textStyle = descriptionTextStyle,
            maxLines = descriptionMaxLines,
            color = colors.descriptionColor(interactionSource = interactionSource).value,
        ),
        verticalSpacing = dimensions.verticalSpacing,
        horizontalSpacing = dimensions.horizontalSpacing,
    )
}

/**
 * CompositionLocal для стиля компонента [Switch]
 */
val LocalSwitchStyle = compositionLocalOf { SwitchStyle.create() }

/**
 * Стиль компонента [Switch]
 */
@Stable
interface SwitchStyle {

    /**
     * Размеры и отступы
     */
    val dimensions: SwitchDimensions

    /**
     * Цвета
     */
    val colors: SwitchColors

    /**
     * Стиль текста-подписи
     */
    val labelTextStyle: TextStyle

    /**
     * Стиль текста описания
     */
    val descriptionTextStyle: TextStyle

    /**
     * Длительность анимации в миллисекундах
     */
    val animationDurationMillis: Int

    companion object {

        private const val DEFAULT_ANIMATION_DURATION = 200

        /**
         * Создает объект [SwitchStyle] с заданными параметрами.
         * @param dimensions размеры и отступы
         * @param colors цвета
         * @param labelTextStyle стиль текста подписи
         * @param descriptionTextStyle стиль текста описания
         * @param animationDurationMillis длительность анимации в миллисекундах
         */
        fun create(
            dimensions: SwitchDimensions = SwitchDimensions(),
            colors: SwitchColors = SwitchColors.create(),
            labelTextStyle: TextStyle = TextStyle.Default,
            descriptionTextStyle: TextStyle = TextStyle.Default,
            animationDurationMillis: Int = DEFAULT_ANIMATION_DURATION,
        ): SwitchStyle = DefaultSwitchStyle(
            colors = colors,
            dimensions = dimensions,
            labelTextStyle = labelTextStyle,
            descriptionTextStyle = descriptionTextStyle,
            animationDurationMillis = animationDurationMillis,
        )
    }
}

/**
 * Цветовая схема компонента [Switch]
 */
@Stable
interface SwitchColors {

    /**
     * Цвет текста подписи.
     * @param interactionSource [InteractionSource]
     */
    @Composable
    fun labelColor(interactionSource: InteractionSource): State<Color>

    /**
     * Цвет текста описания.
     * @param interactionSource [InteractionSource]
     */
    @Composable
    fun descriptionColor(interactionSource: InteractionSource): State<Color>

    /**
     * Цвет подвижного элемента переключателя (thumb) в зависимости от состояния.
     * @param enabled доступен ли переключатель
     * @param active активен ли переключатель
     * @param interactionSource [InteractionSource]
     */
    @Composable
    fun thumbColor(
        enabled: Boolean,
        active: Boolean,
        interactionSource: InteractionSource,
    ): State<Color>

    /**
     * Цвет неподвижного элемента переключателя (track) в зависимости от состояния.
     * @param enabled доступен ли переключатель
     * @param active активен ли переключатель
     * @param interactionSource [InteractionSource]
     */
    @Composable
    fun trackColor(
        enabled: Boolean,
        active: Boolean,
        interactionSource: InteractionSource,
    ): State<Color>

    companion object {

        /**
         * Создает экземпляр [SwitchColors] с заданными параметрами.
         * @param labelColor цвет текста подписи
         * @param descriptionColor цвет описания
         * @param thumbColor цвет подвижного элемента
         * @param activeTrackColor цвет неподвижного элемента в состоянии active = true
         * @param inactiveTrackColor цвет неподвижного элемента в состоянии active = false
         */
        fun create(
            labelColor: Color = Color.Black,
            descriptionColor: Color = Color.Black,
            thumbColor: Color = Color.White,
            activeTrackColor: Color = Color.Green,
            inactiveTrackColor: Color = Color.Gray,
        ): SwitchColors = DefaultSwitchColors(
            labelColor = labelColor,
            descriptionColor = descriptionColor,
            thumbColor = thumbColor,
            activeTrackColor = activeTrackColor,
            inactiveTrackColor = inactiveTrackColor,
        )
    }
}

/**
 * Размеры и отступы [Switch]
 * @property toggleWidth ширина переключателя
 * @property toggleHeight высота переключателя
 * @property thumbDiameter диаметр подвижного элемента
 * @property trackCornerRadius радиус закругления
 * @property togglePadding внутренний отступ тоггла
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между переключателем и текстом
 */
@Immutable
data class SwitchDimensions(
    val toggleWidth: Dp = 44.dp,
    val toggleHeight: Dp = 28.dp,
    val thumbDiameter: Dp = 24.dp,
    val trackCornerRadius: Dp = 14.dp,
    val togglePadding: Dp = 2.dp,
    val verticalSpacing: Dp = 2.dp,
    val horizontalSpacing: Dp = 12.dp,
)

@Immutable
private class DefaultSwitchStyle(
    override val colors: SwitchColors,
    override val dimensions: SwitchDimensions,
    override val labelTextStyle: TextStyle,
    override val descriptionTextStyle: TextStyle,
    override val animationDurationMillis: Int,
) : SwitchStyle

@Immutable
private class DefaultSwitchColors(
    private val labelColor: Color,
    private val descriptionColor: Color,
    private val thumbColor: Color,
    private val activeTrackColor: Color,
    private val inactiveTrackColor: Color,
) : SwitchColors {

    @Composable
    override fun labelColor(interactionSource: InteractionSource): State<Color> {
        return rememberUpdatedState(labelColor)
    }

    @Composable
    override fun descriptionColor(interactionSource: InteractionSource): State<Color> {
        return rememberUpdatedState(descriptionColor)
    }

    @Composable
    override fun thumbColor(enabled: Boolean, active: Boolean, interactionSource: InteractionSource): State<Color> {
        return rememberUpdatedState(thumbColor)
    }

    @Composable
    override fun trackColor(enabled: Boolean, active: Boolean, interactionSource: InteractionSource): State<Color> {
        return animateColorAsState(
            if (active) {
                activeTrackColor
            } else {
                inactiveTrackColor
            },
            label = "trackColor",
        )
    }
}
