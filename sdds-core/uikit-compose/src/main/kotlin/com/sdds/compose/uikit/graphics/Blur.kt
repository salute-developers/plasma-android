package com.sdds.compose.uikit.graphics

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.BlurStyleImpl
import com.sdds.compose.uikit.internal.common.BlurSupported
import com.sdds.compose.uikit.internal.common.DefaultBlurStyle
import com.sdds.compose.uikit.internal.common.FallbackBackground
import com.sdds.compose.uikit.internal.common.ForegroundBlur
import com.sdds.compose.uikit.internal.common.ModifierLocalBlurState
import com.sdds.compose.uikit.internal.common.ModifierLocalBlurStyle
import com.sdds.compose.uikit.internal.common.applyBackgroundBlur
import com.sdds.compose.uikit.internal.common.applyBlurSource
import com.sdds.compose.uikit.internal.common.defaultBlurState

/**
 * Маркерный интерфейс состояния фонового блюра.
 *
 * Используется для связывания источника блюра ([Modifier.blurSource])
 * и цели блюра ([Modifier.blurEffect]) в рамках одного composable-дерева.
 * Конкретная реализация скрыта и создаётся через [rememberBlurState].
 */
@Stable
interface BlurState

/**
 * Описывает визуальный стиль фонового блюра.
 *
 * Содержит параметры формы, радиуса размытия, оттенка,
 * интенсивности шума и фолбэк-фона, используемого на платформах
 * без поддержки настоящего blur-эффекта.
 */
@Stable
interface BlurStyle {

    /**
     * Форма эффекта размытия
     */
    val shape: Shape

    /**
     * Радиус размытия
     */
    val blurRadius: Dp

    /**
     * Цвет размытия
     */
    val tint: Color

    /**
     * Интенсивность шума для имитации матового эффекта
     */
    val noiseFactor: Float

    /**
     * Фон при недоступном или выключенном эффекте размытия
     */
    val fallbackBackground: Brush

    /**
     * Фабричные методы для создания [BlurStyle].
     */
    @Stable
    companion object {

        /**
         * Создаёт экземпляр [BlurStyle] с заданными параметрами.
         *
         * @param shape форма области блюра
         * @param blurRadius радиус размытия
         * @param tint цветовой оттенок, накладываемый поверх блюра
         * @param noiseFactor интенсивность шума для имитации матового эффекта
         * @param fallbackBackground фон, используемый при отсутствии blur
         */
        fun create(
            shape: Shape = RectangleShape,
            blurRadius: Dp = 20.dp,
            tint: Color = Color.Unspecified,
            noiseFactor: Float = 0f,
            fallbackBackground: Brush = FallbackBackground,
        ): BlurStyle = BlurStyleImpl(
            shape = shape,
            blurRadius = blurRadius,
            tint = tint,
            noiseFactor = noiseFactor,
            fallbackBackground = fallbackBackground,
        )
    }
}

/**
 * Создаёт и запоминает состояние эффекта размытия.
 *
 * Один и тот же экземпляр состояния должен использоваться
 * как источником ([Modifier.blurSource]), так и целью ([Modifier.blurEffect]),
 * чтобы эффект размытия корректно применялся.
 */
@Composable
fun rememberBlurState(): BlurState {
    return remember { defaultBlurState() }
}

/**
 * Создаёт и запоминает стиль эффекта размытия
 * @param shape форма области блюра
 * @param blurRadius радиус размытия
 * @param tint цветовой оттенок, накладываемый поверх блюра
 * @param fallbackBackground фон, используемый при отсутствии blur
 */
@Composable
fun rememberBlurStyle(
    shape: Shape = RectangleShape,
    blurRadius: Dp = 20.dp,
    tint: Color = Color.Unspecified,
    fallbackBackground: Brush = FallbackBackground,
): BlurStyle {
    return remember(
        shape,
        blurRadius,
        tint,
        fallbackBackground,
    ) {
        BlurStyle.create(
            shape = shape,
            blurRadius = blurRadius,
            tint = tint,
            fallbackBackground = fallbackBackground,
        )
    }
}

/**
 * Помечает composable как источник фонового блюра.
 *
 * Контент, к которому применён этот модификатор, будет использован
 * для формирования blur-эффекта для соответствующих целей.
 *
 * @param state общее состояние блюра
 */
fun Modifier.blurSource(
    state: BlurState,
    zIndex: Float = 0f,
    key: Any? = null,
): Modifier = applyBlurSource(state, zIndex, key)

/**
 * Применяет blur к composable.
 * Если [state] указан, то будет применено размытие фона (background blur), иначе самого контента (foreground blur).
 *
 * Размытие берётся из источника, связанного через [state].
 * Если [style] не задан, используется стиль из [Modifier.blurStyle]
 * или значение по умолчанию.
 *
 * @param state общее состояние блюра
 * @param style опциональный стиль блюра
 */
fun Modifier.blurEffect(
    state: BlurState? = null,
    enabled: Boolean = BlurSupported,
    style: BlurStyle? = null,
): Modifier {
    return composed {
        var modifierLocalBlurStyle by remember { mutableStateOf(DefaultBlurStyle) }
        val consumer = Modifier.modifierLocalConsumer {
            modifierLocalBlurStyle = ModifierLocalBlurStyle.current
        }
        val provideState = state ?: ForegroundBlur
        this.then(
            consumer
                .modifierLocalProvider(ModifierLocalBlurState) { provideState }
                .applyBackgroundBlur(provideState, style ?: modifierLocalBlurStyle, enabled),
        )
    }
}

/**
 * Устанавливает стиль фонового блюра в ModifierLocal.
 *
 * Этот стиль будет автоматически использован всеми
 * [Modifier.blurEffect] ниже по дереву, если у них
 * не указан собственный стиль.
 *
 * @param style стиль фонового блюра
 */
fun Modifier.blurStyle(style: BlurStyle): Modifier {
    return this.modifierLocalProvider(ModifierLocalBlurStyle) { style }
}
