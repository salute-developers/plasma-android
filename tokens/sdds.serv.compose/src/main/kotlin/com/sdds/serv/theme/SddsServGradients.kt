// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import com.sdds.compose.uikit.graphics.Gradients
import com.sdds.serv.tokens.DarkGradientTokens
import com.sdds.serv.tokens.LightGradientTokens
import kotlin.Float
import kotlin.FloatArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Градиенты SddsServ
 */
@Immutable
public class SddsServGradients(
    private val gradients: Map<String, List<ShaderBrush>>,
) {
    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом
     */
    public val textDefaultAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом
     */
    public val textDefaultAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом
     */
    public val textDefaultAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Промо цвет с градиентом
     */
    public val textDefaultPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо цвет с градиентом
     */
    public val textDefaultPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо цвет с градиентом
     */
    public val textDefaultPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет с градиентом
     */
    public val textDefaultPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет с градиентом
     */
    public val textDefaultPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет с градиентом
     */
    public val textDefaultPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный цвет с градиентом
     */
    public val textInverseAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный цвет с градиентом
     */
    public val textInverseAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный цвет с градиентом
     */
    public val textInverseAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо цвет с градиентом
     */
    public val textInversePromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо цвет с градиентом
     */
    public val textInversePromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо цвет с градиентом
     */
    public val textInversePromoGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо цвет с градиентом
     */
    public val textInversePromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо цвет с градиентом
     */
    public val textInversePromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо цвет с градиентом
     */
    public val textInversePromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentPromoGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentPromoGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentPromoGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentPromoGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом
     */
    public val outlineDefaultAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом
     */
    public val outlineDefaultAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом
     */
    public val outlineDefaultAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом
     */
    public val outlineDefaultTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом
     */
    public val outlineDefaultTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом
     */
    public val outlineDefaultTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный минорный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoGradient: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Минорный промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный цвет обводки с градиентом
     */
    public val outlineInverseAccentMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный цвет обводки с градиентом
     */
    public val outlineInverseAccentMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный минорный цвет обводки с градиентом
     */
    public val outlineInverseAccentMinorGradient: List<ShaderBrush> by gradients

    /**
     * Прозрачный инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseTransparentAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Прозрачный инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseTransparentAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Прозрачный инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseTransparentAccentGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо цвет обводки с градиентом
     */
    public val outlineInversePromoGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо цвет обводки с градиентом
     */
    public val outlineInversePromoGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный промо цвет обводки с градиентом
     */
    public val outlineInversePromoGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо цвет обводки с градиентом
     */
    public val outlineInversePromoMinorGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо цвет обводки с градиентом
     */
    public val outlineInversePromoMinorGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный минорный промо цвет обводки с градиентом
     */
    public val outlineInversePromoMinorGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Возвращает копию [SddsServGradients]. Предоставляет возможность переопределять градиенты.
     */
    public fun copy(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsServGradients {
        val gradientOverrideScope = GradientOverrideScope()
        overrideGradients.invoke(gradientOverrideScope)
        val overrideMap = gradientOverrideScope.overrideMap
        return SddsServGradients(gradients.mapValues { overrideMap[it.key] ?: it.value })
    }
}

/**
 * Скоуп переопределения градиентов
 */
public class GradientOverrideScope {
    private val _overrideMap: MutableMap<String, List<ShaderBrush>> = mutableMapOf()

    internal val overrideMap: Map<String, List<ShaderBrush>>
        get() = _overrideMap.toMap()

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientHover: String = "textDefaultAccentGradientHover"

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientActive: String = "textDefaultAccentGradientActive"

    /**
     * Акцентный минорный цвет с градиентом
     */
    public val textDefaultAccentMinorGradientHover: String = "textDefaultAccentMinorGradientHover"

    /**
     * Акцентный минорный цвет с градиентом
     */
    public val textDefaultAccentMinorGradientActive: String = "textDefaultAccentMinorGradientActive"

    /**
     * Акцентный минорный цвет с градиентом
     */
    public val textDefaultAccentMinorGradient: String = "textDefaultAccentMinorGradient"

    /**
     * Промо цвет с градиентом
     */
    public val textDefaultPromoGradientHover: String = "textDefaultPromoGradientHover"

    /**
     * Промо цвет с градиентом
     */
    public val textDefaultPromoGradientActive: String = "textDefaultPromoGradientActive"

    /**
     * Промо цвет с градиентом
     */
    public val textDefaultPromoGradient: String = "textDefaultPromoGradient"

    /**
     * Минорный промо цвет с градиентом
     */
    public val textDefaultPromoMinorGradientHover: String = "textDefaultPromoMinorGradientHover"

    /**
     * Минорный промо цвет с градиентом
     */
    public val textDefaultPromoMinorGradientActive: String = "textDefaultPromoMinorGradientActive"

    /**
     * Минорный промо цвет с градиентом
     */
    public val textDefaultPromoMinorGradient: String = "textDefaultPromoMinorGradient"

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradient: String = "textDefaultAccentGradient"

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientHover: String = "textOnDarkAccentGradientHover"

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientActive: String = "textOnDarkAccentGradientActive"

    /**
     * Акцентный минорный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentMinorGradientHover: String = "textOnDarkAccentMinorGradientHover"

    /**
     * Акцентный минорный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentMinorGradientActive: String = "textOnDarkAccentMinorGradientActive"

    /**
     * Акцентный минорный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentMinorGradient: String = "textOnDarkAccentMinorGradient"

    /**
     * Промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoGradientHover: String = "textOnDarkPromoGradientHover"

    /**
     * Промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoGradientActive: String = "textOnDarkPromoGradientActive"

    /**
     * Промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoGradient: String = "textOnDarkPromoGradient"

    /**
     * Минорный промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoMinorGradientHover: String = "textOnDarkPromoMinorGradientHover"

    /**
     * Минорный промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoMinorGradientActive: String = "textOnDarkPromoMinorGradientActive"

    /**
     * Минорный промо цвет на темном фоне с градиентом
     */
    public val textOnDarkPromoMinorGradient: String = "textOnDarkPromoMinorGradient"

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradient: String = "textOnDarkAccentGradient"

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientHover: String = "textOnLightAccentGradientHover"

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientActive: String = "textOnLightAccentGradientActive"

    /**
     * Акцентный минорный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentMinorGradientHover: String = "textOnLightAccentMinorGradientHover"

    /**
     * Акцентный минорный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentMinorGradientActive: String = "textOnLightAccentMinorGradientActive"

    /**
     * Акцентный минорный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentMinorGradient: String = "textOnLightAccentMinorGradient"

    /**
     * Промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoGradientHover: String = "textOnLightPromoGradientHover"

    /**
     * Промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoGradientActive: String = "textOnLightPromoGradientActive"

    /**
     * Промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoGradient: String = "textOnLightPromoGradient"

    /**
     * Минорный промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoMinorGradientHover: String = "textOnLightPromoMinorGradientHover"

    /**
     * Минорный промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoMinorGradientActive: String = "textOnLightPromoMinorGradientActive"

    /**
     * Минорный промо цвет на светлом фоне с градиентом
     */
    public val textOnLightPromoMinorGradient: String = "textOnLightPromoMinorGradient"

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradient: String = "textOnLightAccentGradient"

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientHover: String = "textInverseAccentGradientHover"

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientActive: String = "textInverseAccentGradientActive"

    /**
     * Инвертированный акцентный минорный цвет с градиентом
     */
    public val textInverseAccentMinorGradientHover: String = "textInverseAccentMinorGradientHover"

    /**
     * Инвертированный акцентный минорный цвет с градиентом
     */
    public val textInverseAccentMinorGradientActive: String = "textInverseAccentMinorGradientActive"

    /**
     * Инвертированный акцентный минорный цвет с градиентом
     */
    public val textInverseAccentMinorGradient: String = "textInverseAccentMinorGradient"

    /**
     * Инвертированный промо цвет с градиентом
     */
    public val textInversePromoGradientHover: String = "textInversePromoGradientHover"

    /**
     * Инвертированный промо цвет с градиентом
     */
    public val textInversePromoGradientActive: String = "textInversePromoGradientActive"

    /**
     * Инвертированный промо цвет с градиентом
     */
    public val textInversePromoGradient: String = "textInversePromoGradient"

    /**
     * Инвертированный минорный промо цвет с градиентом
     */
    public val textInversePromoMinorGradientHover: String = "textInversePromoMinorGradientHover"

    /**
     * Инвертированный минорный промо цвет с градиентом
     */
    public val textInversePromoMinorGradientActive: String = "textInversePromoMinorGradientActive"

    /**
     * Инвертированный минорный промо цвет с градиентом
     */
    public val textInversePromoMinorGradient: String = "textInversePromoMinorGradient"

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradient: String = "textInverseAccentGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientHover: String = "surfaceDefaultAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientActive: String = "surfaceDefaultAccentGradientActive"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentMinorGradientHover: String =
        "surfaceDefaultAccentMinorGradientHover"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentMinorGradientActive: String =
        "surfaceDefaultAccentMinorGradientActive"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentMinorGradient: String = "surfaceDefaultAccentMinorGradient"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentAccentGradientHover: String =
        "surfaceDefaultTransparentAccentGradientHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentAccentGradientActive: String =
        "surfaceDefaultTransparentAccentGradientActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentAccentGradient: String =
        "surfaceDefaultTransparentAccentGradient"

    /**
     * Промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoGradientHover: String = "surfaceDefaultPromoGradientHover"

    /**
     * Промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoGradientActive: String = "surfaceDefaultPromoGradientActive"

    /**
     * Промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoGradient: String = "surfaceDefaultPromoGradient"

    /**
     * Минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoMinorGradientHover: String =
        "surfaceDefaultPromoMinorGradientHover"

    /**
     * Минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoMinorGradientActive: String =
        "surfaceDefaultPromoMinorGradientActive"

    /**
     * Минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultPromoMinorGradient: String = "surfaceDefaultPromoMinorGradient"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentPromoGradientHover: String =
        "surfaceDefaultTransparentPromoGradientHover"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentPromoGradientActive: String =
        "surfaceDefaultTransparentPromoGradientActive"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultTransparentPromoGradient: String =
        "surfaceDefaultTransparentPromoGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradient: String = "surfaceDefaultAccentGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradient: String = "surfaceDefaultSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientHover: String = "surfaceDefaultSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientActive: String = "surfaceDefaultSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradient: String = "surfaceDefaultSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientHover: String =
        "surfaceDefaultSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: String =
        "surfaceDefaultSkeletonDeepGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientHover: String = "surfaceOnDarkAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientActive: String = "surfaceOnDarkAccentGradientActive"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentMinorGradientHover: String =
        "surfaceOnDarkAccentMinorGradientHover"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentMinorGradientActive: String =
        "surfaceOnDarkAccentMinorGradientActive"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentMinorGradient: String = "surfaceOnDarkAccentMinorGradient"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentAccentGradientHover: String =
        "surfaceOnDarkTransparentAccentGradientHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentAccentGradientActive: String =
        "surfaceOnDarkTransparentAccentGradientActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentAccentGradient: String =
        "surfaceOnDarkTransparentAccentGradient"

    /**
     * Промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoGradientHover: String = "surfaceOnDarkPromoGradientHover"

    /**
     * Промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoGradientActive: String = "surfaceOnDarkPromoGradientActive"

    /**
     * Промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoGradient: String = "surfaceOnDarkPromoGradient"

    /**
     * Минорный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoMinorGradientHover: String = "surfaceOnDarkPromoMinorGradientHover"

    /**
     * Минорный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoMinorGradientActive: String =
        "surfaceOnDarkPromoMinorGradientActive"

    /**
     * Минорный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkPromoMinorGradient: String = "surfaceOnDarkPromoMinorGradient"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentPromoGradientHover: String =
        "surfaceOnDarkTransparentPromoGradientHover"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentPromoGradientActive: String =
        "surfaceOnDarkTransparentPromoGradientActive"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkTransparentPromoGradient: String =
        "surfaceOnDarkTransparentPromoGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradient: String = "surfaceOnDarkAccentGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradient: String = "surfaceOnDarkSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientHover: String = "surfaceOnDarkSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientActive: String = "surfaceOnDarkSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradient: String = "surfaceOnDarkSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientHover: String =
        "surfaceOnDarkSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientActive: String =
        "surfaceOnDarkSkeletonDeepGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientHover: String = "surfaceOnLightAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientActive: String = "surfaceOnLightAccentGradientActive"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentMinorGradientHover: String =
        "surfaceOnLightAccentMinorGradientHover"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentMinorGradientActive: String =
        "surfaceOnLightAccentMinorGradientActive"

    /**
     * Акцентный минорный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentMinorGradient: String = "surfaceOnLightAccentMinorGradient"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentAccentGradientHover: String =
        "surfaceOnLightTransparentAccentGradientHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentAccentGradientActive: String =
        "surfaceOnLightTransparentAccentGradientActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentAccentGradient: String =
        "surfaceOnLightTransparentAccentGradient"

    /**
     * Промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoGradientHover: String = "surfaceOnLightPromoGradientHover"

    /**
     * Промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoGradientActive: String = "surfaceOnLightPromoGradientActive"

    /**
     * Промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoGradient: String = "surfaceOnLightPromoGradient"

    /**
     * Минорный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoMinorGradientHover: String =
        "surfaceOnLightPromoMinorGradientHover"

    /**
     * Минорный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoMinorGradientActive: String =
        "surfaceOnLightPromoMinorGradientActive"

    /**
     * Минорный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightPromoMinorGradient: String = "surfaceOnLightPromoMinorGradient"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentPromoGradientHover: String =
        "surfaceOnLightTransparentPromoGradientHover"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentPromoGradientActive: String =
        "surfaceOnLightTransparentPromoGradientActive"

    /**
     * Прозрачный промо фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightTransparentPromoGradient: String =
        "surfaceOnLightTransparentPromoGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradient: String = "surfaceOnLightAccentGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: String = "surfaceOnLightSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: String = "surfaceOnLightSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: String = "surfaceOnLightSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: String = "surfaceOnLightSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: String =
        "surfaceOnLightSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: String =
        "surfaceOnLightSkeletonDeepGradientActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientHover: String = "surfaceInverseAccentGradientHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientActive: String = "surfaceInverseAccentGradientActive"

    /**
     * Инвертированный акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentMinorGradientHover: String =
        "surfaceInverseAccentMinorGradientHover"

    /**
     * Инвертированный акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentMinorGradientActive: String =
        "surfaceInverseAccentMinorGradientActive"

    /**
     * Инвертированный акцентный минорный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentMinorGradient: String = "surfaceInverseAccentMinorGradient"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentAccentGradientHover: String =
        "surfaceInverseTransparentAccentGradientHover"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentAccentGradientActive: String =
        "surfaceInverseTransparentAccentGradientActive"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentAccentGradient: String =
        "surfaceInverseTransparentAccentGradient"

    /**
     * Инвертированный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoGradientHover: String = "surfaceInversePromoGradientHover"

    /**
     * Инвертированный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoGradientActive: String = "surfaceInversePromoGradientActive"

    /**
     * Инвертированный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoGradient: String = "surfaceInversePromoGradient"

    /**
     * Инвертированный минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoMinorGradientHover: String =
        "surfaceInversePromoMinorGradientHover"

    /**
     * Инвертированный минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoMinorGradientActive: String =
        "surfaceInversePromoMinorGradientActive"

    /**
     * Инвертированный минорный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInversePromoMinorGradient: String = "surfaceInversePromoMinorGradient"

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentPromoGradientHover: String =
        "surfaceInverseTransparentPromoGradientHover"

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentPromoGradientActive: String =
        "surfaceInverseTransparentPromoGradientActive"

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола с градиентом
     */
    public val surfaceInverseTransparentPromoGradient: String =
        "surfaceInverseTransparentPromoGradient"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradient: String = "surfaceInverseAccentGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradient: String = "surfaceInverseSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientHover: String = "surfaceInverseSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientActive: String = "surfaceInverseSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradient: String = "surfaceInverseSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: String =
        "surfaceInverseSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: String =
        "surfaceInverseSkeletonDeepGradientActive"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientHover: String = "outlineDefaultAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientActive: String = "outlineDefaultAccentGradientActive"

    /**
     * Акцентный минорный цвет обводки с градиентом
     */
    public val outlineDefaultAccentMinorGradientHover: String =
        "outlineDefaultAccentMinorGradientHover"

    /**
     * Акцентный минорный цвет обводки с градиентом
     */
    public val outlineDefaultAccentMinorGradientActive: String =
        "outlineDefaultAccentMinorGradientActive"

    /**
     * Акцентный минорный цвет обводки с градиентом
     */
    public val outlineDefaultAccentMinorGradient: String = "outlineDefaultAccentMinorGradient"

    /**
     * Прозрачный акцентный цвет обводки с градиентом
     */
    public val outlineDefaultTransparentAccentGradientHover: String =
        "outlineDefaultTransparentAccentGradientHover"

    /**
     * Прозрачный акцентный цвет обводки с градиентом
     */
    public val outlineDefaultTransparentAccentGradientActive: String =
        "outlineDefaultTransparentAccentGradientActive"

    /**
     * Прозрачный акцентный цвет обводки с градиентом
     */
    public val outlineDefaultTransparentAccentGradient: String =
        "outlineDefaultTransparentAccentGradient"

    /**
     * Промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoGradientHover: String = "outlineDefaultPromoGradientHover"

    /**
     * Промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoGradientActive: String = "outlineDefaultPromoGradientActive"

    /**
     * Промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoGradient: String = "outlineDefaultPromoGradient"

    /**
     * Минорный промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoMinorGradientHover: String =
        "outlineDefaultPromoMinorGradientHover"

    /**
     * Минорный промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoMinorGradientActive: String =
        "outlineDefaultPromoMinorGradientActive"

    /**
     * Минорный промо цвет обводки с градиентом
     */
    public val outlineDefaultPromoMinorGradient: String = "outlineDefaultPromoMinorGradient"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradient: String = "outlineDefaultAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientHover: String = "outlineOnDarkAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientActive: String = "outlineOnDarkAccentGradientActive"

    /**
     * Акцентный минорный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentMinorGradientHover: String =
        "outlineOnDarkAccentMinorGradientHover"

    /**
     * Акцентный минорный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentMinorGradientActive: String =
        "outlineOnDarkAccentMinorGradientActive"

    /**
     * Акцентный минорный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentMinorGradient: String = "outlineOnDarkAccentMinorGradient"

    /**
     * Прозрачный акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkTransparentAccentGradientHover: String =
        "outlineOnDarkTransparentAccentGradientHover"

    /**
     * Прозрачный акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkTransparentAccentGradientActive: String =
        "outlineOnDarkTransparentAccentGradientActive"

    /**
     * Прозрачный акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkTransparentAccentGradient: String =
        "outlineOnDarkTransparentAccentGradient"

    /**
     * Промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoGradientHover: String = "outlineOnDarkPromoGradientHover"

    /**
     * Промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoGradientActive: String = "outlineOnDarkPromoGradientActive"

    /**
     * Промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoGradient: String = "outlineOnDarkPromoGradient"

    /**
     * Минорный промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoMinorGradientHover: String = "outlineOnDarkPromoMinorGradientHover"

    /**
     * Минорный промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoMinorGradientActive: String =
        "outlineOnDarkPromoMinorGradientActive"

    /**
     * Минорный промо цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkPromoMinorGradient: String = "outlineOnDarkPromoMinorGradient"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradient: String = "outlineOnDarkAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientHover: String = "outlineOnLightAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientActive: String = "outlineOnLightAccentGradientActive"

    /**
     * Акцентный минорный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentMinorGradientHover: String =
        "outlineOnLightAccentMinorGradientHover"

    /**
     * Акцентный минорный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentMinorGradientActive: String =
        "outlineOnLightAccentMinorGradientActive"

    /**
     * Акцентный минорный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentMinorGradient: String = "outlineOnLightAccentMinorGradient"

    /**
     * Прозрачный акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightTransparentAccentGradientHover: String =
        "outlineOnLightTransparentAccentGradientHover"

    /**
     * Прозрачный акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightTransparentAccentGradientActive: String =
        "outlineOnLightTransparentAccentGradientActive"

    /**
     * Прозрачный акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightTransparentAccentGradient: String =
        "outlineOnLightTransparentAccentGradient"

    /**
     * Промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoGradientHover: String = "outlineOnLightPromoGradientHover"

    /**
     * Промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoGradientActive: String = "outlineOnLightPromoGradientActive"

    /**
     * Промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoGradient: String = "outlineOnLightPromoGradient"

    /**
     * Минорный промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoMinorGradientHover: String =
        "outlineOnLightPromoMinorGradientHover"

    /**
     * Минорный промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoMinorGradientActive: String =
        "outlineOnLightPromoMinorGradientActive"

    /**
     * Минорный промо цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightPromoMinorGradient: String = "outlineOnLightPromoMinorGradient"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradient: String = "outlineOnLightAccentGradient"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientHover: String = "outlineInverseAccentGradientHover"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientActive: String = "outlineInverseAccentGradientActive"

    /**
     * Инвертированный акцентный минорный цвет обводки с градиентом
     */
    public val outlineInverseAccentMinorGradientHover: String =
        "outlineInverseAccentMinorGradientHover"

    /**
     * Инвертированный акцентный минорный цвет обводки с градиентом
     */
    public val outlineInverseAccentMinorGradientActive: String =
        "outlineInverseAccentMinorGradientActive"

    /**
     * Инвертированный акцентный минорный цвет обводки с градиентом
     */
    public val outlineInverseAccentMinorGradient: String = "outlineInverseAccentMinorGradient"

    /**
     * Прозрачный инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseTransparentAccentGradientHover: String =
        "outlineInverseTransparentAccentGradientHover"

    /**
     * Прозрачный инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseTransparentAccentGradientActive: String =
        "outlineInverseTransparentAccentGradientActive"

    /**
     * Прозрачный инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseTransparentAccentGradient: String =
        "outlineInverseTransparentAccentGradient"

    /**
     * Инвертированный промо цвет обводки с градиентом
     */
    public val outlineInversePromoGradientHover: String = "outlineInversePromoGradientHover"

    /**
     * Инвертированный промо цвет обводки с градиентом
     */
    public val outlineInversePromoGradientActive: String = "outlineInversePromoGradientActive"

    /**
     * Инвертированный промо цвет обводки с градиентом
     */
    public val outlineInversePromoGradient: String = "outlineInversePromoGradient"

    /**
     * Инвертированный минорный промо цвет обводки с градиентом
     */
    public val outlineInversePromoMinorGradientHover: String =
        "outlineInversePromoMinorGradientHover"

    /**
     * Инвертированный минорный промо цвет обводки с градиентом
     */
    public val outlineInversePromoMinorGradientActive: String =
        "outlineInversePromoMinorGradientActive"

    /**
     * Инвертированный минорный промо цвет обводки с градиентом
     */
    public val outlineInversePromoMinorGradient: String = "outlineInversePromoMinorGradient"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradient: String = "outlineInverseAccentGradient"

    /**
     * Переопределяет аттрибут градиента.
     */
    public infix fun String.overrideBy(gradient: List<ShaderBrush>) {
        _overrideMap[this] = gradient
    }
}

internal val LocalSddsServGradients: ProvidableCompositionLocal<SddsServGradients> =
    staticCompositionLocalOf {
        lightSddsServGradients()
    }

private fun MutableMap<String, List<ShaderBrush>>.add(
    attribute: String,
    defaultTokenValue: List<ShaderBrush>,
    overwriteMap: Map<String, List<ShaderBrush>>,
) {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Градиенты [SddsServGradients] для светлой темы
 */
@Suppress("LongMethod")
public fun lightSddsServGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsServGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add(
        "textDefaultAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientHover.colors,
                LightGradientTokens.TextDefaultAccentGradientHover.positions,
                LightGradientTokens.TextDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientActive.colors,
                LightGradientTokens.TextDefaultAccentGradientActive.positions,
                LightGradientTokens.TextDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentMinorGradientHover.colors,
                LightGradientTokens.TextDefaultAccentMinorGradientHover.positions,
                LightGradientTokens.TextDefaultAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentMinorGradientActive.colors,
                LightGradientTokens.TextDefaultAccentMinorGradientActive.positions,
                LightGradientTokens.TextDefaultAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentMinorGradient.colors,
                LightGradientTokens.TextDefaultAccentMinorGradient.positions,
                LightGradientTokens.TextDefaultAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultPromoGradientHover.colors,
                LightGradientTokens.TextDefaultPromoGradientHover.positions,
                LightGradientTokens.TextDefaultPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultPromoGradientActive.colors,
                LightGradientTokens.TextDefaultPromoGradientActive.positions,
                LightGradientTokens.TextDefaultPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultPromoGradient.colors,
                LightGradientTokens.TextDefaultPromoGradient.positions,
                LightGradientTokens.TextDefaultPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultPromoMinorGradientHover.colors,
                LightGradientTokens.TextDefaultPromoMinorGradientHover.positions,
                LightGradientTokens.TextDefaultPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultPromoMinorGradientActive.colors,
                LightGradientTokens.TextDefaultPromoMinorGradientActive.positions,
                LightGradientTokens.TextDefaultPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultPromoMinorGradient.colors,
                LightGradientTokens.TextDefaultPromoMinorGradient.positions,
                LightGradientTokens.TextDefaultPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradient.colors,
                LightGradientTokens.TextDefaultAccentGradient.positions,
                LightGradientTokens.TextDefaultAccentGradient.angle,
                LightGradientTokens.TextDefaultAccentGradient.startPoint,
                LightGradientTokens.TextDefaultAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientHover.colors,
                LightGradientTokens.TextOnDarkAccentGradientHover.positions,
                LightGradientTokens.TextOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientActive.colors,
                LightGradientTokens.TextOnDarkAccentGradientActive.positions,
                LightGradientTokens.TextOnDarkAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentMinorGradientHover.colors,
                LightGradientTokens.TextOnDarkAccentMinorGradientHover.positions,
                LightGradientTokens.TextOnDarkAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentMinorGradientActive.colors,
                LightGradientTokens.TextOnDarkAccentMinorGradientActive.positions,
                LightGradientTokens.TextOnDarkAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentMinorGradient.colors,
                LightGradientTokens.TextOnDarkAccentMinorGradient.positions,
                LightGradientTokens.TextOnDarkAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkPromoGradientHover.colors,
                LightGradientTokens.TextOnDarkPromoGradientHover.positions,
                LightGradientTokens.TextOnDarkPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkPromoGradientActive.colors,
                LightGradientTokens.TextOnDarkPromoGradientActive.positions,
                LightGradientTokens.TextOnDarkPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkPromoGradient.colors,
                LightGradientTokens.TextOnDarkPromoGradient.positions,
                LightGradientTokens.TextOnDarkPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkPromoMinorGradientHover.colors,
                LightGradientTokens.TextOnDarkPromoMinorGradientHover.positions,
                LightGradientTokens.TextOnDarkPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkPromoMinorGradientActive.colors,
                LightGradientTokens.TextOnDarkPromoMinorGradientActive.positions,
                LightGradientTokens.TextOnDarkPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkPromoMinorGradient.colors,
                LightGradientTokens.TextOnDarkPromoMinorGradient.positions,
                LightGradientTokens.TextOnDarkPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradient.colors,
                LightGradientTokens.TextOnDarkAccentGradient.positions,
                LightGradientTokens.TextOnDarkAccentGradient.angle,
                LightGradientTokens.TextOnDarkAccentGradient.startPoint,
                LightGradientTokens.TextOnDarkAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientHover.colors,
                LightGradientTokens.TextOnLightAccentGradientHover.positions,
                LightGradientTokens.TextOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientActive.colors,
                LightGradientTokens.TextOnLightAccentGradientActive.positions,
                LightGradientTokens.TextOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentMinorGradientHover.colors,
                LightGradientTokens.TextOnLightAccentMinorGradientHover.positions,
                LightGradientTokens.TextOnLightAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentMinorGradientActive.colors,
                LightGradientTokens.TextOnLightAccentMinorGradientActive.positions,
                LightGradientTokens.TextOnLightAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentMinorGradient.colors,
                LightGradientTokens.TextOnLightAccentMinorGradient.positions,
                LightGradientTokens.TextOnLightAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightPromoGradientHover.colors,
                LightGradientTokens.TextOnLightPromoGradientHover.positions,
                LightGradientTokens.TextOnLightPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightPromoGradientActive.colors,
                LightGradientTokens.TextOnLightPromoGradientActive.positions,
                LightGradientTokens.TextOnLightPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightPromoGradient.colors,
                LightGradientTokens.TextOnLightPromoGradient.positions,
                LightGradientTokens.TextOnLightPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightPromoMinorGradientHover.colors,
                LightGradientTokens.TextOnLightPromoMinorGradientHover.positions,
                LightGradientTokens.TextOnLightPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightPromoMinorGradientActive.colors,
                LightGradientTokens.TextOnLightPromoMinorGradientActive.positions,
                LightGradientTokens.TextOnLightPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightPromoMinorGradient.colors,
                LightGradientTokens.TextOnLightPromoMinorGradient.positions,
                LightGradientTokens.TextOnLightPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradient.colors,
                LightGradientTokens.TextOnLightAccentGradient.positions,
                LightGradientTokens.TextOnLightAccentGradient.angle,
                LightGradientTokens.TextOnLightAccentGradient.startPoint,
                LightGradientTokens.TextOnLightAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientHover.colors,
                LightGradientTokens.TextInverseAccentGradientHover.positions,
                LightGradientTokens.TextInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientActive.colors,
                LightGradientTokens.TextInverseAccentGradientActive.positions,
                LightGradientTokens.TextInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentMinorGradientHover.colors,
                LightGradientTokens.TextInverseAccentMinorGradientHover.positions,
                LightGradientTokens.TextInverseAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentMinorGradientActive.colors,
                LightGradientTokens.TextInverseAccentMinorGradientActive.positions,
                LightGradientTokens.TextInverseAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentMinorGradient.colors,
                LightGradientTokens.TextInverseAccentMinorGradient.positions,
                LightGradientTokens.TextInverseAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextInversePromoGradientHover.colors,
                LightGradientTokens.TextInversePromoGradientHover.positions,
                LightGradientTokens.TextInversePromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextInversePromoGradientActive.colors,
                LightGradientTokens.TextInversePromoGradientActive.positions,
                LightGradientTokens.TextInversePromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextInversePromoGradient.colors,
                LightGradientTokens.TextInversePromoGradient.positions,
                LightGradientTokens.TextInversePromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextInversePromoMinorGradientHover.colors,
                LightGradientTokens.TextInversePromoMinorGradientHover.positions,
                LightGradientTokens.TextInversePromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextInversePromoMinorGradientActive.colors,
                LightGradientTokens.TextInversePromoMinorGradientActive.positions,
                LightGradientTokens.TextInversePromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextInversePromoMinorGradient.colors,
                LightGradientTokens.TextInversePromoMinorGradient.positions,
                LightGradientTokens.TextInversePromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradient.colors,
                LightGradientTokens.TextInverseAccentGradient.positions,
                LightGradientTokens.TextInverseAccentGradient.angle,
                LightGradientTokens.TextInverseAccentGradient.startPoint,
                LightGradientTokens.TextInverseAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentGradientHover.colors,
                LightGradientTokens.SurfaceDefaultAccentGradientHover.positions,
                LightGradientTokens.SurfaceDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentGradientActive.colors,
                LightGradientTokens.SurfaceDefaultAccentGradientActive.positions,
                LightGradientTokens.SurfaceDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentMinorGradientHover.colors,
                LightGradientTokens.SurfaceDefaultAccentMinorGradientHover.positions,
                LightGradientTokens.SurfaceDefaultAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentMinorGradientActive.colors,
                LightGradientTokens.SurfaceDefaultAccentMinorGradientActive.positions,
                LightGradientTokens.SurfaceDefaultAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentMinorGradient.colors,
                LightGradientTokens.SurfaceDefaultAccentMinorGradient.positions,
                LightGradientTokens.SurfaceDefaultAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentAccentGradientHover.colors,
                LightGradientTokens.SurfaceDefaultTransparentAccentGradientHover.positions,
                LightGradientTokens.SurfaceDefaultTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentAccentGradientActive.colors,
                LightGradientTokens.SurfaceDefaultTransparentAccentGradientActive.positions,
                LightGradientTokens.SurfaceDefaultTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentAccentGradient.colors,
                LightGradientTokens.SurfaceDefaultTransparentAccentGradient.positions,
                LightGradientTokens.SurfaceDefaultTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultPromoGradientHover.colors,
                LightGradientTokens.SurfaceDefaultPromoGradientHover.positions,
                LightGradientTokens.SurfaceDefaultPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultPromoGradientActive.colors,
                LightGradientTokens.SurfaceDefaultPromoGradientActive.positions,
                LightGradientTokens.SurfaceDefaultPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultPromoGradient.colors,
                LightGradientTokens.SurfaceDefaultPromoGradient.positions,
                LightGradientTokens.SurfaceDefaultPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultPromoMinorGradientHover.colors,
                LightGradientTokens.SurfaceDefaultPromoMinorGradientHover.positions,
                LightGradientTokens.SurfaceDefaultPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultPromoMinorGradientActive.colors,
                LightGradientTokens.SurfaceDefaultPromoMinorGradientActive.positions,
                LightGradientTokens.SurfaceDefaultPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultPromoMinorGradient.colors,
                LightGradientTokens.SurfaceDefaultPromoMinorGradient.positions,
                LightGradientTokens.SurfaceDefaultPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentPromoGradientHover.colors,
                LightGradientTokens.SurfaceDefaultTransparentPromoGradientHover.positions,
                LightGradientTokens.SurfaceDefaultTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentPromoGradientActive.colors,
                LightGradientTokens.SurfaceDefaultTransparentPromoGradientActive.positions,
                LightGradientTokens.SurfaceDefaultTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentPromoGradient.colors,
                LightGradientTokens.SurfaceDefaultTransparentPromoGradient.positions,
                LightGradientTokens.SurfaceDefaultTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentGradient.colors,
                LightGradientTokens.SurfaceDefaultAccentGradient.positions,
                LightGradientTokens.SurfaceDefaultAccentGradient.angle,
                LightGradientTokens.SurfaceDefaultAccentGradient.startPoint,
                LightGradientTokens.SurfaceDefaultAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonGradient.colors,
                LightGradientTokens.SurfaceDefaultSkeletonGradient.positions,
                LightGradientTokens.SurfaceDefaultSkeletonGradient.angle,
                LightGradientTokens.SurfaceDefaultSkeletonGradient.startPoint,
                LightGradientTokens.SurfaceDefaultSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceDefaultSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceDefaultSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceDefaultSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceDefaultSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.angle,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.startPoint,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkAccentGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkAccentGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentMinorGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkAccentMinorGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentMinorGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkAccentMinorGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentMinorGradient.colors,
                LightGradientTokens.SurfaceOnDarkAccentMinorGradient.positions,
                LightGradientTokens.SurfaceOnDarkAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradient.colors,
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradient.positions,
                LightGradientTokens.SurfaceOnDarkTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkPromoGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkPromoGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkPromoGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkPromoGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkPromoGradient.colors,
                LightGradientTokens.SurfaceOnDarkPromoGradient.positions,
                LightGradientTokens.SurfaceOnDarkPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkPromoMinorGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkPromoMinorGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkPromoMinorGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkPromoMinorGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkPromoMinorGradient.colors,
                LightGradientTokens.SurfaceOnDarkPromoMinorGradient.positions,
                LightGradientTokens.SurfaceOnDarkPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradient.colors,
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradient.positions,
                LightGradientTokens.SurfaceOnDarkTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentGradient.colors,
                LightGradientTokens.SurfaceOnDarkAccentGradient.positions,
                LightGradientTokens.SurfaceOnDarkAccentGradient.angle,
                LightGradientTokens.SurfaceOnDarkAccentGradient.startPoint,
                LightGradientTokens.SurfaceOnDarkAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.angle,
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.startPoint,
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.angle,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.startPoint,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentGradientHover.colors,
                LightGradientTokens.SurfaceOnLightAccentGradientHover.positions,
                LightGradientTokens.SurfaceOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentGradientActive.colors,
                LightGradientTokens.SurfaceOnLightAccentGradientActive.positions,
                LightGradientTokens.SurfaceOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentMinorGradientHover.colors,
                LightGradientTokens.SurfaceOnLightAccentMinorGradientHover.positions,
                LightGradientTokens.SurfaceOnLightAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentMinorGradientActive.colors,
                LightGradientTokens.SurfaceOnLightAccentMinorGradientActive.positions,
                LightGradientTokens.SurfaceOnLightAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentMinorGradient.colors,
                LightGradientTokens.SurfaceOnLightAccentMinorGradient.positions,
                LightGradientTokens.SurfaceOnLightAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentAccentGradientHover.colors,
                LightGradientTokens.SurfaceOnLightTransparentAccentGradientHover.positions,
                LightGradientTokens.SurfaceOnLightTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentAccentGradientActive.colors,
                LightGradientTokens.SurfaceOnLightTransparentAccentGradientActive.positions,
                LightGradientTokens.SurfaceOnLightTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentAccentGradient.colors,
                LightGradientTokens.SurfaceOnLightTransparentAccentGradient.positions,
                LightGradientTokens.SurfaceOnLightTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightPromoGradientHover.colors,
                LightGradientTokens.SurfaceOnLightPromoGradientHover.positions,
                LightGradientTokens.SurfaceOnLightPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightPromoGradientActive.colors,
                LightGradientTokens.SurfaceOnLightPromoGradientActive.positions,
                LightGradientTokens.SurfaceOnLightPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightPromoGradient.colors,
                LightGradientTokens.SurfaceOnLightPromoGradient.positions,
                LightGradientTokens.SurfaceOnLightPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightPromoMinorGradientHover.colors,
                LightGradientTokens.SurfaceOnLightPromoMinorGradientHover.positions,
                LightGradientTokens.SurfaceOnLightPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightPromoMinorGradientActive.colors,
                LightGradientTokens.SurfaceOnLightPromoMinorGradientActive.positions,
                LightGradientTokens.SurfaceOnLightPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightPromoMinorGradient.colors,
                LightGradientTokens.SurfaceOnLightPromoMinorGradient.positions,
                LightGradientTokens.SurfaceOnLightPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentPromoGradientHover.colors,
                LightGradientTokens.SurfaceOnLightTransparentPromoGradientHover.positions,
                LightGradientTokens.SurfaceOnLightTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentPromoGradientActive.colors,
                LightGradientTokens.SurfaceOnLightTransparentPromoGradientActive.positions,
                LightGradientTokens.SurfaceOnLightTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentPromoGradient.colors,
                LightGradientTokens.SurfaceOnLightTransparentPromoGradient.positions,
                LightGradientTokens.SurfaceOnLightTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentGradient.colors,
                LightGradientTokens.SurfaceOnLightAccentGradient.positions,
                LightGradientTokens.SurfaceOnLightAccentGradient.angle,
                LightGradientTokens.SurfaceOnLightAccentGradient.startPoint,
                LightGradientTokens.SurfaceOnLightAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonGradient.colors,
                LightGradientTokens.SurfaceOnLightSkeletonGradient.positions,
                LightGradientTokens.SurfaceOnLightSkeletonGradient.angle,
                LightGradientTokens.SurfaceOnLightSkeletonGradient.startPoint,
                LightGradientTokens.SurfaceOnLightSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceOnLightSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceOnLightSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceOnLightSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceOnLightSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.angle,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.startPoint,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentGradientHover.colors,
                LightGradientTokens.SurfaceInverseAccentGradientHover.positions,
                LightGradientTokens.SurfaceInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentGradientActive.colors,
                LightGradientTokens.SurfaceInverseAccentGradientActive.positions,
                LightGradientTokens.SurfaceInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentMinorGradientHover.colors,
                LightGradientTokens.SurfaceInverseAccentMinorGradientHover.positions,
                LightGradientTokens.SurfaceInverseAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentMinorGradientActive.colors,
                LightGradientTokens.SurfaceInverseAccentMinorGradientActive.positions,
                LightGradientTokens.SurfaceInverseAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentMinorGradient.colors,
                LightGradientTokens.SurfaceInverseAccentMinorGradient.positions,
                LightGradientTokens.SurfaceInverseAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentAccentGradientHover.colors,
                LightGradientTokens.SurfaceInverseTransparentAccentGradientHover.positions,
                LightGradientTokens.SurfaceInverseTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentAccentGradientActive.colors,
                LightGradientTokens.SurfaceInverseTransparentAccentGradientActive.positions,
                LightGradientTokens.SurfaceInverseTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentAccentGradient.colors,
                LightGradientTokens.SurfaceInverseTransparentAccentGradient.positions,
                LightGradientTokens.SurfaceInverseTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInversePromoGradientHover.colors,
                LightGradientTokens.SurfaceInversePromoGradientHover.positions,
                LightGradientTokens.SurfaceInversePromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInversePromoGradientActive.colors,
                LightGradientTokens.SurfaceInversePromoGradientActive.positions,
                LightGradientTokens.SurfaceInversePromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInversePromoGradient.colors,
                LightGradientTokens.SurfaceInversePromoGradient.positions,
                LightGradientTokens.SurfaceInversePromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInversePromoMinorGradientHover.colors,
                LightGradientTokens.SurfaceInversePromoMinorGradientHover.positions,
                LightGradientTokens.SurfaceInversePromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInversePromoMinorGradientActive.colors,
                LightGradientTokens.SurfaceInversePromoMinorGradientActive.positions,
                LightGradientTokens.SurfaceInversePromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInversePromoMinorGradient.colors,
                LightGradientTokens.SurfaceInversePromoMinorGradient.positions,
                LightGradientTokens.SurfaceInversePromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentPromoGradientHover.colors,
                LightGradientTokens.SurfaceInverseTransparentPromoGradientHover.positions,
                LightGradientTokens.SurfaceInverseTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentPromoGradientActive.colors,
                LightGradientTokens.SurfaceInverseTransparentPromoGradientActive.positions,
                LightGradientTokens.SurfaceInverseTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentPromoGradient.colors,
                LightGradientTokens.SurfaceInverseTransparentPromoGradient.positions,
                LightGradientTokens.SurfaceInverseTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentGradient.colors,
                LightGradientTokens.SurfaceInverseAccentGradient.positions,
                LightGradientTokens.SurfaceInverseAccentGradient.angle,
                LightGradientTokens.SurfaceInverseAccentGradient.startPoint,
                LightGradientTokens.SurfaceInverseAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonGradient.colors,
                LightGradientTokens.SurfaceInverseSkeletonGradient.positions,
                LightGradientTokens.SurfaceInverseSkeletonGradient.angle,
                LightGradientTokens.SurfaceInverseSkeletonGradient.startPoint,
                LightGradientTokens.SurfaceInverseSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceInverseSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceInverseSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceInverseSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceInverseSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.angle,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.startPoint,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentGradientHover.colors,
                LightGradientTokens.OutlineDefaultAccentGradientHover.positions,
                LightGradientTokens.OutlineDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentGradientActive.colors,
                LightGradientTokens.OutlineDefaultAccentGradientActive.positions,
                LightGradientTokens.OutlineDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentMinorGradientHover.colors,
                LightGradientTokens.OutlineDefaultAccentMinorGradientHover.positions,
                LightGradientTokens.OutlineDefaultAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentMinorGradientActive.colors,
                LightGradientTokens.OutlineDefaultAccentMinorGradientActive.positions,
                LightGradientTokens.OutlineDefaultAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentMinorGradient.colors,
                LightGradientTokens.OutlineDefaultAccentMinorGradient.positions,
                LightGradientTokens.OutlineDefaultAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentAccentGradientHover.colors,
                LightGradientTokens.OutlineDefaultTransparentAccentGradientHover.positions,
                LightGradientTokens.OutlineDefaultTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentAccentGradientActive.colors,
                LightGradientTokens.OutlineDefaultTransparentAccentGradientActive.positions,
                LightGradientTokens.OutlineDefaultTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentAccentGradient.colors,
                LightGradientTokens.OutlineDefaultTransparentAccentGradient.positions,
                LightGradientTokens.OutlineDefaultTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultPromoGradientHover.colors,
                LightGradientTokens.OutlineDefaultPromoGradientHover.positions,
                LightGradientTokens.OutlineDefaultPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultPromoGradientActive.colors,
                LightGradientTokens.OutlineDefaultPromoGradientActive.positions,
                LightGradientTokens.OutlineDefaultPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultPromoGradient.colors,
                LightGradientTokens.OutlineDefaultPromoGradient.positions,
                LightGradientTokens.OutlineDefaultPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultPromoMinorGradientHover.colors,
                LightGradientTokens.OutlineDefaultPromoMinorGradientHover.positions,
                LightGradientTokens.OutlineDefaultPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultPromoMinorGradientActive.colors,
                LightGradientTokens.OutlineDefaultPromoMinorGradientActive.positions,
                LightGradientTokens.OutlineDefaultPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultPromoMinorGradient.colors,
                LightGradientTokens.OutlineDefaultPromoMinorGradient.positions,
                LightGradientTokens.OutlineDefaultPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentGradient.colors,
                LightGradientTokens.OutlineDefaultAccentGradient.positions,
                LightGradientTokens.OutlineDefaultAccentGradient.angle,
                LightGradientTokens.OutlineDefaultAccentGradient.startPoint,
                LightGradientTokens.OutlineDefaultAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentGradientHover.colors,
                LightGradientTokens.OutlineOnDarkAccentGradientHover.positions,
                LightGradientTokens.OutlineOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentGradientActive.colors,
                LightGradientTokens.OutlineOnDarkAccentGradientActive.positions,
                LightGradientTokens.OutlineOnDarkAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentMinorGradientHover.colors,
                LightGradientTokens.OutlineOnDarkAccentMinorGradientHover.positions,
                LightGradientTokens.OutlineOnDarkAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentMinorGradientActive.colors,
                LightGradientTokens.OutlineOnDarkAccentMinorGradientActive.positions,
                LightGradientTokens.OutlineOnDarkAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentMinorGradient.colors,
                LightGradientTokens.OutlineOnDarkAccentMinorGradient.positions,
                LightGradientTokens.OutlineOnDarkAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkTransparentAccentGradientHover.colors,
                LightGradientTokens.OutlineOnDarkTransparentAccentGradientHover.positions,
                LightGradientTokens.OutlineOnDarkTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkTransparentAccentGradientActive.colors,
                LightGradientTokens.OutlineOnDarkTransparentAccentGradientActive.positions,
                LightGradientTokens.OutlineOnDarkTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkTransparentAccentGradient.colors,
                LightGradientTokens.OutlineOnDarkTransparentAccentGradient.positions,
                LightGradientTokens.OutlineOnDarkTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkPromoGradientHover.colors,
                LightGradientTokens.OutlineOnDarkPromoGradientHover.positions,
                LightGradientTokens.OutlineOnDarkPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkPromoGradientActive.colors,
                LightGradientTokens.OutlineOnDarkPromoGradientActive.positions,
                LightGradientTokens.OutlineOnDarkPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkPromoGradient.colors,
                LightGradientTokens.OutlineOnDarkPromoGradient.positions,
                LightGradientTokens.OutlineOnDarkPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkPromoMinorGradientHover.colors,
                LightGradientTokens.OutlineOnDarkPromoMinorGradientHover.positions,
                LightGradientTokens.OutlineOnDarkPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkPromoMinorGradientActive.colors,
                LightGradientTokens.OutlineOnDarkPromoMinorGradientActive.positions,
                LightGradientTokens.OutlineOnDarkPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkPromoMinorGradient.colors,
                LightGradientTokens.OutlineOnDarkPromoMinorGradient.positions,
                LightGradientTokens.OutlineOnDarkPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentGradient.colors,
                LightGradientTokens.OutlineOnDarkAccentGradient.positions,
                LightGradientTokens.OutlineOnDarkAccentGradient.angle,
                LightGradientTokens.OutlineOnDarkAccentGradient.startPoint,
                LightGradientTokens.OutlineOnDarkAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentGradientHover.colors,
                LightGradientTokens.OutlineOnLightAccentGradientHover.positions,
                LightGradientTokens.OutlineOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentGradientActive.colors,
                LightGradientTokens.OutlineOnLightAccentGradientActive.positions,
                LightGradientTokens.OutlineOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentMinorGradientHover.colors,
                LightGradientTokens.OutlineOnLightAccentMinorGradientHover.positions,
                LightGradientTokens.OutlineOnLightAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentMinorGradientActive.colors,
                LightGradientTokens.OutlineOnLightAccentMinorGradientActive.positions,
                LightGradientTokens.OutlineOnLightAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentMinorGradient.colors,
                LightGradientTokens.OutlineOnLightAccentMinorGradient.positions,
                LightGradientTokens.OutlineOnLightAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightTransparentAccentGradientHover.colors,
                LightGradientTokens.OutlineOnLightTransparentAccentGradientHover.positions,
                LightGradientTokens.OutlineOnLightTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightTransparentAccentGradientActive.colors,
                LightGradientTokens.OutlineOnLightTransparentAccentGradientActive.positions,
                LightGradientTokens.OutlineOnLightTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightTransparentAccentGradient.colors,
                LightGradientTokens.OutlineOnLightTransparentAccentGradient.positions,
                LightGradientTokens.OutlineOnLightTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightPromoGradientHover.colors,
                LightGradientTokens.OutlineOnLightPromoGradientHover.positions,
                LightGradientTokens.OutlineOnLightPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightPromoGradientActive.colors,
                LightGradientTokens.OutlineOnLightPromoGradientActive.positions,
                LightGradientTokens.OutlineOnLightPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightPromoGradient.colors,
                LightGradientTokens.OutlineOnLightPromoGradient.positions,
                LightGradientTokens.OutlineOnLightPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightPromoMinorGradientHover.colors,
                LightGradientTokens.OutlineOnLightPromoMinorGradientHover.positions,
                LightGradientTokens.OutlineOnLightPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightPromoMinorGradientActive.colors,
                LightGradientTokens.OutlineOnLightPromoMinorGradientActive.positions,
                LightGradientTokens.OutlineOnLightPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightPromoMinorGradient.colors,
                LightGradientTokens.OutlineOnLightPromoMinorGradient.positions,
                LightGradientTokens.OutlineOnLightPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentGradient.colors,
                LightGradientTokens.OutlineOnLightAccentGradient.positions,
                LightGradientTokens.OutlineOnLightAccentGradient.angle,
                LightGradientTokens.OutlineOnLightAccentGradient.startPoint,
                LightGradientTokens.OutlineOnLightAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentGradientHover.colors,
                LightGradientTokens.OutlineInverseAccentGradientHover.positions,
                LightGradientTokens.OutlineInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentGradientActive.colors,
                LightGradientTokens.OutlineInverseAccentGradientActive.positions,
                LightGradientTokens.OutlineInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentMinorGradientHover.colors,
                LightGradientTokens.OutlineInverseAccentMinorGradientHover.positions,
                LightGradientTokens.OutlineInverseAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentMinorGradientActive.colors,
                LightGradientTokens.OutlineInverseAccentMinorGradientActive.positions,
                LightGradientTokens.OutlineInverseAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentMinorGradient.colors,
                LightGradientTokens.OutlineInverseAccentMinorGradient.positions,
                LightGradientTokens.OutlineInverseAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseTransparentAccentGradientHover.colors,
                LightGradientTokens.OutlineInverseTransparentAccentGradientHover.positions,
                LightGradientTokens.OutlineInverseTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseTransparentAccentGradientActive.colors,
                LightGradientTokens.OutlineInverseTransparentAccentGradientActive.positions,
                LightGradientTokens.OutlineInverseTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseTransparentAccentGradient.colors,
                LightGradientTokens.OutlineInverseTransparentAccentGradient.positions,
                LightGradientTokens.OutlineInverseTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInversePromoGradientHover.colors,
                LightGradientTokens.OutlineInversePromoGradientHover.positions,
                LightGradientTokens.OutlineInversePromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInversePromoGradientActive.colors,
                LightGradientTokens.OutlineInversePromoGradientActive.positions,
                LightGradientTokens.OutlineInversePromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInversePromoGradient.colors,
                LightGradientTokens.OutlineInversePromoGradient.positions,
                LightGradientTokens.OutlineInversePromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInversePromoMinorGradientHover.colors,
                LightGradientTokens.OutlineInversePromoMinorGradientHover.positions,
                LightGradientTokens.OutlineInversePromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInversePromoMinorGradientActive.colors,
                LightGradientTokens.OutlineInversePromoMinorGradientActive.positions,
                LightGradientTokens.OutlineInversePromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInversePromoMinorGradient.colors,
                LightGradientTokens.OutlineInversePromoMinorGradient.positions,
                LightGradientTokens.OutlineInversePromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentGradient.colors,
                LightGradientTokens.OutlineInverseAccentGradient.positions,
                LightGradientTokens.OutlineInverseAccentGradient.angle,
                LightGradientTokens.OutlineInverseAccentGradient.startPoint,
                LightGradientTokens.OutlineInverseAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    return SddsServGradients(initial)
}

/**
 * Градиенты [SddsServGradients] для темной темы
 */
@Suppress("LongMethod")
public fun darkSddsServGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsServGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add(
        "textDefaultAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientHover.colors,
                DarkGradientTokens.TextDefaultAccentGradientHover.positions,
                DarkGradientTokens.TextDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientActive.colors,
                DarkGradientTokens.TextDefaultAccentGradientActive.positions,
                DarkGradientTokens.TextDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentMinorGradientHover.colors,
                DarkGradientTokens.TextDefaultAccentMinorGradientHover.positions,
                DarkGradientTokens.TextDefaultAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentMinorGradientActive.colors,
                DarkGradientTokens.TextDefaultAccentMinorGradientActive.positions,
                DarkGradientTokens.TextDefaultAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentMinorGradient.colors,
                DarkGradientTokens.TextDefaultAccentMinorGradient.positions,
                DarkGradientTokens.TextDefaultAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultPromoGradientHover.colors,
                DarkGradientTokens.TextDefaultPromoGradientHover.positions,
                DarkGradientTokens.TextDefaultPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultPromoGradientActive.colors,
                DarkGradientTokens.TextDefaultPromoGradientActive.positions,
                DarkGradientTokens.TextDefaultPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultPromoGradient.colors,
                DarkGradientTokens.TextDefaultPromoGradient.positions,
                DarkGradientTokens.TextDefaultPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultPromoMinorGradientHover.colors,
                DarkGradientTokens.TextDefaultPromoMinorGradientHover.positions,
                DarkGradientTokens.TextDefaultPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultPromoMinorGradientActive.colors,
                DarkGradientTokens.TextDefaultPromoMinorGradientActive.positions,
                DarkGradientTokens.TextDefaultPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultPromoMinorGradient.colors,
                DarkGradientTokens.TextDefaultPromoMinorGradient.positions,
                DarkGradientTokens.TextDefaultPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradient.colors,
                DarkGradientTokens.TextDefaultAccentGradient.positions,
                DarkGradientTokens.TextDefaultAccentGradient.angle,
                DarkGradientTokens.TextDefaultAccentGradient.startPoint,
                DarkGradientTokens.TextDefaultAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientHover.colors,
                DarkGradientTokens.TextOnDarkAccentGradientHover.positions,
                DarkGradientTokens.TextOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientActive.colors,
                DarkGradientTokens.TextOnDarkAccentGradientActive.positions,
                DarkGradientTokens.TextOnDarkAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentMinorGradientHover.colors,
                DarkGradientTokens.TextOnDarkAccentMinorGradientHover.positions,
                DarkGradientTokens.TextOnDarkAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentMinorGradientActive.colors,
                DarkGradientTokens.TextOnDarkAccentMinorGradientActive.positions,
                DarkGradientTokens.TextOnDarkAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentMinorGradient.colors,
                DarkGradientTokens.TextOnDarkAccentMinorGradient.positions,
                DarkGradientTokens.TextOnDarkAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkPromoGradientHover.colors,
                DarkGradientTokens.TextOnDarkPromoGradientHover.positions,
                DarkGradientTokens.TextOnDarkPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkPromoGradientActive.colors,
                DarkGradientTokens.TextOnDarkPromoGradientActive.positions,
                DarkGradientTokens.TextOnDarkPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkPromoGradient.colors,
                DarkGradientTokens.TextOnDarkPromoGradient.positions,
                DarkGradientTokens.TextOnDarkPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkPromoMinorGradientHover.colors,
                DarkGradientTokens.TextOnDarkPromoMinorGradientHover.positions,
                DarkGradientTokens.TextOnDarkPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkPromoMinorGradientActive.colors,
                DarkGradientTokens.TextOnDarkPromoMinorGradientActive.positions,
                DarkGradientTokens.TextOnDarkPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkPromoMinorGradient.colors,
                DarkGradientTokens.TextOnDarkPromoMinorGradient.positions,
                DarkGradientTokens.TextOnDarkPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradient.colors,
                DarkGradientTokens.TextOnDarkAccentGradient.positions,
                DarkGradientTokens.TextOnDarkAccentGradient.angle,
                DarkGradientTokens.TextOnDarkAccentGradient.startPoint,
                DarkGradientTokens.TextOnDarkAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientHover.colors,
                DarkGradientTokens.TextOnLightAccentGradientHover.positions,
                DarkGradientTokens.TextOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientActive.colors,
                DarkGradientTokens.TextOnLightAccentGradientActive.positions,
                DarkGradientTokens.TextOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentMinorGradientHover.colors,
                DarkGradientTokens.TextOnLightAccentMinorGradientHover.positions,
                DarkGradientTokens.TextOnLightAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentMinorGradientActive.colors,
                DarkGradientTokens.TextOnLightAccentMinorGradientActive.positions,
                DarkGradientTokens.TextOnLightAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentMinorGradient.colors,
                DarkGradientTokens.TextOnLightAccentMinorGradient.positions,
                DarkGradientTokens.TextOnLightAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightPromoGradientHover.colors,
                DarkGradientTokens.TextOnLightPromoGradientHover.positions,
                DarkGradientTokens.TextOnLightPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightPromoGradientActive.colors,
                DarkGradientTokens.TextOnLightPromoGradientActive.positions,
                DarkGradientTokens.TextOnLightPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightPromoGradient.colors,
                DarkGradientTokens.TextOnLightPromoGradient.positions,
                DarkGradientTokens.TextOnLightPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightPromoMinorGradientHover.colors,
                DarkGradientTokens.TextOnLightPromoMinorGradientHover.positions,
                DarkGradientTokens.TextOnLightPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightPromoMinorGradientActive.colors,
                DarkGradientTokens.TextOnLightPromoMinorGradientActive.positions,
                DarkGradientTokens.TextOnLightPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightPromoMinorGradient.colors,
                DarkGradientTokens.TextOnLightPromoMinorGradient.positions,
                DarkGradientTokens.TextOnLightPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradient.colors,
                DarkGradientTokens.TextOnLightAccentGradient.positions,
                DarkGradientTokens.TextOnLightAccentGradient.angle,
                DarkGradientTokens.TextOnLightAccentGradient.startPoint,
                DarkGradientTokens.TextOnLightAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientHover.colors,
                DarkGradientTokens.TextInverseAccentGradientHover.positions,
                DarkGradientTokens.TextInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientActive.colors,
                DarkGradientTokens.TextInverseAccentGradientActive.positions,
                DarkGradientTokens.TextInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentMinorGradientHover.colors,
                DarkGradientTokens.TextInverseAccentMinorGradientHover.positions,
                DarkGradientTokens.TextInverseAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentMinorGradientActive.colors,
                DarkGradientTokens.TextInverseAccentMinorGradientActive.positions,
                DarkGradientTokens.TextInverseAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentMinorGradient.colors,
                DarkGradientTokens.TextInverseAccentMinorGradient.positions,
                DarkGradientTokens.TextInverseAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInversePromoGradientHover.colors,
                DarkGradientTokens.TextInversePromoGradientHover.positions,
                DarkGradientTokens.TextInversePromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInversePromoGradientActive.colors,
                DarkGradientTokens.TextInversePromoGradientActive.positions,
                DarkGradientTokens.TextInversePromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInversePromoGradient.colors,
                DarkGradientTokens.TextInversePromoGradient.positions,
                DarkGradientTokens.TextInversePromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInversePromoMinorGradientHover.colors,
                DarkGradientTokens.TextInversePromoMinorGradientHover.positions,
                DarkGradientTokens.TextInversePromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInversePromoMinorGradientActive.colors,
                DarkGradientTokens.TextInversePromoMinorGradientActive.positions,
                DarkGradientTokens.TextInversePromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInversePromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInversePromoMinorGradient.colors,
                DarkGradientTokens.TextInversePromoMinorGradient.positions,
                DarkGradientTokens.TextInversePromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradient.colors,
                DarkGradientTokens.TextInverseAccentGradient.positions,
                DarkGradientTokens.TextInverseAccentGradient.angle,
                DarkGradientTokens.TextInverseAccentGradient.startPoint,
                DarkGradientTokens.TextInverseAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultAccentGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultAccentGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentMinorGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultAccentMinorGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentMinorGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultAccentMinorGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentMinorGradient.colors,
                DarkGradientTokens.SurfaceDefaultAccentMinorGradient.positions,
                DarkGradientTokens.SurfaceDefaultAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradient.colors,
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradient.positions,
                DarkGradientTokens.SurfaceDefaultTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultPromoGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultPromoGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultPromoGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultPromoGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultPromoGradient.colors,
                DarkGradientTokens.SurfaceDefaultPromoGradient.positions,
                DarkGradientTokens.SurfaceDefaultPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultPromoMinorGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultPromoMinorGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultPromoMinorGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultPromoMinorGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultPromoMinorGradient.colors,
                DarkGradientTokens.SurfaceDefaultPromoMinorGradient.positions,
                DarkGradientTokens.SurfaceDefaultPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradient.colors,
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradient.positions,
                DarkGradientTokens.SurfaceDefaultTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentGradient.colors,
                DarkGradientTokens.SurfaceDefaultAccentGradient.positions,
                DarkGradientTokens.SurfaceDefaultAccentGradient.angle,
                DarkGradientTokens.SurfaceDefaultAccentGradient.startPoint,
                DarkGradientTokens.SurfaceDefaultAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.angle,
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.startPoint,
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.angle,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.startPoint,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkAccentGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkAccentGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradient.colors,
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradient.positions,
                DarkGradientTokens.SurfaceOnDarkAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradient.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradient.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkPromoGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkPromoGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkPromoGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkPromoGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkPromoGradient.colors,
                DarkGradientTokens.SurfaceOnDarkPromoGradient.positions,
                DarkGradientTokens.SurfaceOnDarkPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradient.colors,
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradient.positions,
                DarkGradientTokens.SurfaceOnDarkPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradient.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradient.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentGradient.colors,
                DarkGradientTokens.SurfaceOnDarkAccentGradient.positions,
                DarkGradientTokens.SurfaceOnDarkAccentGradient.angle,
                DarkGradientTokens.SurfaceOnDarkAccentGradient.startPoint,
                DarkGradientTokens.SurfaceOnDarkAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.angle,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.startPoint,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.angle,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.startPoint,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightAccentGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightAccentGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentMinorGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightAccentMinorGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentMinorGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightAccentMinorGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentMinorGradient.colors,
                DarkGradientTokens.SurfaceOnLightAccentMinorGradient.positions,
                DarkGradientTokens.SurfaceOnLightAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradient.colors,
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradient.positions,
                DarkGradientTokens.SurfaceOnLightTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightPromoGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightPromoGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightPromoGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightPromoGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightPromoGradient.colors,
                DarkGradientTokens.SurfaceOnLightPromoGradient.positions,
                DarkGradientTokens.SurfaceOnLightPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightPromoMinorGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightPromoMinorGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightPromoMinorGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightPromoMinorGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightPromoMinorGradient.colors,
                DarkGradientTokens.SurfaceOnLightPromoMinorGradient.positions,
                DarkGradientTokens.SurfaceOnLightPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradient.colors,
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradient.positions,
                DarkGradientTokens.SurfaceOnLightTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentGradient.colors,
                DarkGradientTokens.SurfaceOnLightAccentGradient.positions,
                DarkGradientTokens.SurfaceOnLightAccentGradient.angle,
                DarkGradientTokens.SurfaceOnLightAccentGradient.startPoint,
                DarkGradientTokens.SurfaceOnLightAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.angle,
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.startPoint,
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.angle,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.startPoint,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentGradientHover.colors,
                DarkGradientTokens.SurfaceInverseAccentGradientHover.positions,
                DarkGradientTokens.SurfaceInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentGradientActive.colors,
                DarkGradientTokens.SurfaceInverseAccentGradientActive.positions,
                DarkGradientTokens.SurfaceInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentMinorGradientHover.colors,
                DarkGradientTokens.SurfaceInverseAccentMinorGradientHover.positions,
                DarkGradientTokens.SurfaceInverseAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentMinorGradientActive.colors,
                DarkGradientTokens.SurfaceInverseAccentMinorGradientActive.positions,
                DarkGradientTokens.SurfaceInverseAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentMinorGradient.colors,
                DarkGradientTokens.SurfaceInverseAccentMinorGradient.positions,
                DarkGradientTokens.SurfaceInverseAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentAccentGradientHover.colors,
                DarkGradientTokens.SurfaceInverseTransparentAccentGradientHover.positions,
                DarkGradientTokens.SurfaceInverseTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentAccentGradientActive.colors,
                DarkGradientTokens.SurfaceInverseTransparentAccentGradientActive.positions,
                DarkGradientTokens.SurfaceInverseTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentAccentGradient.colors,
                DarkGradientTokens.SurfaceInverseTransparentAccentGradient.positions,
                DarkGradientTokens.SurfaceInverseTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInversePromoGradientHover.colors,
                DarkGradientTokens.SurfaceInversePromoGradientHover.positions,
                DarkGradientTokens.SurfaceInversePromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInversePromoGradientActive.colors,
                DarkGradientTokens.SurfaceInversePromoGradientActive.positions,
                DarkGradientTokens.SurfaceInversePromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInversePromoGradient.colors,
                DarkGradientTokens.SurfaceInversePromoGradient.positions,
                DarkGradientTokens.SurfaceInversePromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInversePromoMinorGradientHover.colors,
                DarkGradientTokens.SurfaceInversePromoMinorGradientHover.positions,
                DarkGradientTokens.SurfaceInversePromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInversePromoMinorGradientActive.colors,
                DarkGradientTokens.SurfaceInversePromoMinorGradientActive.positions,
                DarkGradientTokens.SurfaceInversePromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInversePromoMinorGradient.colors,
                DarkGradientTokens.SurfaceInversePromoMinorGradient.positions,
                DarkGradientTokens.SurfaceInversePromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentPromoGradientHover.colors,
                DarkGradientTokens.SurfaceInverseTransparentPromoGradientHover.positions,
                DarkGradientTokens.SurfaceInverseTransparentPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentPromoGradientActive.colors,
                DarkGradientTokens.SurfaceInverseTransparentPromoGradientActive.positions,
                DarkGradientTokens.SurfaceInverseTransparentPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentPromoGradient.colors,
                DarkGradientTokens.SurfaceInverseTransparentPromoGradient.positions,
                DarkGradientTokens.SurfaceInverseTransparentPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentGradient.colors,
                DarkGradientTokens.SurfaceInverseAccentGradient.positions,
                DarkGradientTokens.SurfaceInverseAccentGradient.angle,
                DarkGradientTokens.SurfaceInverseAccentGradient.startPoint,
                DarkGradientTokens.SurfaceInverseAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonGradient.colors,
                DarkGradientTokens.SurfaceInverseSkeletonGradient.positions,
                DarkGradientTokens.SurfaceInverseSkeletonGradient.angle,
                DarkGradientTokens.SurfaceInverseSkeletonGradient.startPoint,
                DarkGradientTokens.SurfaceInverseSkeletonGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceInverseSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceInverseSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceInverseSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceInverseSkeletonGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.angle,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.startPoint,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentGradientHover.colors,
                DarkGradientTokens.OutlineDefaultAccentGradientHover.positions,
                DarkGradientTokens.OutlineDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentGradientActive.colors,
                DarkGradientTokens.OutlineDefaultAccentGradientActive.positions,
                DarkGradientTokens.OutlineDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentMinorGradientHover.colors,
                DarkGradientTokens.OutlineDefaultAccentMinorGradientHover.positions,
                DarkGradientTokens.OutlineDefaultAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentMinorGradientActive.colors,
                DarkGradientTokens.OutlineDefaultAccentMinorGradientActive.positions,
                DarkGradientTokens.OutlineDefaultAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentMinorGradient.colors,
                DarkGradientTokens.OutlineDefaultAccentMinorGradient.positions,
                DarkGradientTokens.OutlineDefaultAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultTransparentAccentGradientHover.colors,
                DarkGradientTokens.OutlineDefaultTransparentAccentGradientHover.positions,
                DarkGradientTokens.OutlineDefaultTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultTransparentAccentGradientActive.colors,
                DarkGradientTokens.OutlineDefaultTransparentAccentGradientActive.positions,
                DarkGradientTokens.OutlineDefaultTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultTransparentAccentGradient.colors,
                DarkGradientTokens.OutlineDefaultTransparentAccentGradient.positions,
                DarkGradientTokens.OutlineDefaultTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultPromoGradientHover.colors,
                DarkGradientTokens.OutlineDefaultPromoGradientHover.positions,
                DarkGradientTokens.OutlineDefaultPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultPromoGradientActive.colors,
                DarkGradientTokens.OutlineDefaultPromoGradientActive.positions,
                DarkGradientTokens.OutlineDefaultPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultPromoGradient.colors,
                DarkGradientTokens.OutlineDefaultPromoGradient.positions,
                DarkGradientTokens.OutlineDefaultPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultPromoMinorGradientHover.colors,
                DarkGradientTokens.OutlineDefaultPromoMinorGradientHover.positions,
                DarkGradientTokens.OutlineDefaultPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultPromoMinorGradientActive.colors,
                DarkGradientTokens.OutlineDefaultPromoMinorGradientActive.positions,
                DarkGradientTokens.OutlineDefaultPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultPromoMinorGradient.colors,
                DarkGradientTokens.OutlineDefaultPromoMinorGradient.positions,
                DarkGradientTokens.OutlineDefaultPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentGradient.colors,
                DarkGradientTokens.OutlineDefaultAccentGradient.positions,
                DarkGradientTokens.OutlineDefaultAccentGradient.angle,
                DarkGradientTokens.OutlineDefaultAccentGradient.startPoint,
                DarkGradientTokens.OutlineDefaultAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentGradientHover.colors,
                DarkGradientTokens.OutlineOnDarkAccentGradientHover.positions,
                DarkGradientTokens.OutlineOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentGradientActive.colors,
                DarkGradientTokens.OutlineOnDarkAccentGradientActive.positions,
                DarkGradientTokens.OutlineOnDarkAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentMinorGradientHover.colors,
                DarkGradientTokens.OutlineOnDarkAccentMinorGradientHover.positions,
                DarkGradientTokens.OutlineOnDarkAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentMinorGradientActive.colors,
                DarkGradientTokens.OutlineOnDarkAccentMinorGradientActive.positions,
                DarkGradientTokens.OutlineOnDarkAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentMinorGradient.colors,
                DarkGradientTokens.OutlineOnDarkAccentMinorGradient.positions,
                DarkGradientTokens.OutlineOnDarkAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradientHover.colors,
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradientHover.positions,
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradientActive.colors,
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradientActive.positions,
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradient.colors,
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradient.positions,
                DarkGradientTokens.OutlineOnDarkTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkPromoGradientHover.colors,
                DarkGradientTokens.OutlineOnDarkPromoGradientHover.positions,
                DarkGradientTokens.OutlineOnDarkPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkPromoGradientActive.colors,
                DarkGradientTokens.OutlineOnDarkPromoGradientActive.positions,
                DarkGradientTokens.OutlineOnDarkPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkPromoGradient.colors,
                DarkGradientTokens.OutlineOnDarkPromoGradient.positions,
                DarkGradientTokens.OutlineOnDarkPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkPromoMinorGradientHover.colors,
                DarkGradientTokens.OutlineOnDarkPromoMinorGradientHover.positions,
                DarkGradientTokens.OutlineOnDarkPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkPromoMinorGradientActive.colors,
                DarkGradientTokens.OutlineOnDarkPromoMinorGradientActive.positions,
                DarkGradientTokens.OutlineOnDarkPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkPromoMinorGradient.colors,
                DarkGradientTokens.OutlineOnDarkPromoMinorGradient.positions,
                DarkGradientTokens.OutlineOnDarkPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentGradient.colors,
                DarkGradientTokens.OutlineOnDarkAccentGradient.positions,
                DarkGradientTokens.OutlineOnDarkAccentGradient.angle,
                DarkGradientTokens.OutlineOnDarkAccentGradient.startPoint,
                DarkGradientTokens.OutlineOnDarkAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentGradientHover.colors,
                DarkGradientTokens.OutlineOnLightAccentGradientHover.positions,
                DarkGradientTokens.OutlineOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentGradientActive.colors,
                DarkGradientTokens.OutlineOnLightAccentGradientActive.positions,
                DarkGradientTokens.OutlineOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentMinorGradientHover.colors,
                DarkGradientTokens.OutlineOnLightAccentMinorGradientHover.positions,
                DarkGradientTokens.OutlineOnLightAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentMinorGradientActive.colors,
                DarkGradientTokens.OutlineOnLightAccentMinorGradientActive.positions,
                DarkGradientTokens.OutlineOnLightAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentMinorGradient.colors,
                DarkGradientTokens.OutlineOnLightAccentMinorGradient.positions,
                DarkGradientTokens.OutlineOnLightAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightTransparentAccentGradientHover.colors,
                DarkGradientTokens.OutlineOnLightTransparentAccentGradientHover.positions,
                DarkGradientTokens.OutlineOnLightTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightTransparentAccentGradientActive.colors,
                DarkGradientTokens.OutlineOnLightTransparentAccentGradientActive.positions,
                DarkGradientTokens.OutlineOnLightTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightTransparentAccentGradient.colors,
                DarkGradientTokens.OutlineOnLightTransparentAccentGradient.positions,
                DarkGradientTokens.OutlineOnLightTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightPromoGradientHover.colors,
                DarkGradientTokens.OutlineOnLightPromoGradientHover.positions,
                DarkGradientTokens.OutlineOnLightPromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightPromoGradientActive.colors,
                DarkGradientTokens.OutlineOnLightPromoGradientActive.positions,
                DarkGradientTokens.OutlineOnLightPromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightPromoGradient.colors,
                DarkGradientTokens.OutlineOnLightPromoGradient.positions,
                DarkGradientTokens.OutlineOnLightPromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightPromoMinorGradientHover.colors,
                DarkGradientTokens.OutlineOnLightPromoMinorGradientHover.positions,
                DarkGradientTokens.OutlineOnLightPromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightPromoMinorGradientActive.colors,
                DarkGradientTokens.OutlineOnLightPromoMinorGradientActive.positions,
                DarkGradientTokens.OutlineOnLightPromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightPromoMinorGradient.colors,
                DarkGradientTokens.OutlineOnLightPromoMinorGradient.positions,
                DarkGradientTokens.OutlineOnLightPromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentGradient.colors,
                DarkGradientTokens.OutlineOnLightAccentGradient.positions,
                DarkGradientTokens.OutlineOnLightAccentGradient.angle,
                DarkGradientTokens.OutlineOnLightAccentGradient.startPoint,
                DarkGradientTokens.OutlineOnLightAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentGradientHover.colors,
                DarkGradientTokens.OutlineInverseAccentGradientHover.positions,
                DarkGradientTokens.OutlineInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentGradientActive.colors,
                DarkGradientTokens.OutlineInverseAccentGradientActive.positions,
                DarkGradientTokens.OutlineInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentMinorGradientHover.colors,
                DarkGradientTokens.OutlineInverseAccentMinorGradientHover.positions,
                DarkGradientTokens.OutlineInverseAccentMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentMinorGradientActive.colors,
                DarkGradientTokens.OutlineInverseAccentMinorGradientActive.positions,
                DarkGradientTokens.OutlineInverseAccentMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentMinorGradient.colors,
                DarkGradientTokens.OutlineInverseAccentMinorGradient.positions,
                DarkGradientTokens.OutlineInverseAccentMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentAccentGradientHover.colors,
                DarkGradientTokens.OutlineInverseTransparentAccentGradientHover.positions,
                DarkGradientTokens.OutlineInverseTransparentAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentAccentGradientActive.colors,
                DarkGradientTokens.OutlineInverseTransparentAccentGradientActive.positions,
                DarkGradientTokens.OutlineInverseTransparentAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentAccentGradient.colors,
                DarkGradientTokens.OutlineInverseTransparentAccentGradient.positions,
                DarkGradientTokens.OutlineInverseTransparentAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInversePromoGradientHover.colors,
                DarkGradientTokens.OutlineInversePromoGradientHover.positions,
                DarkGradientTokens.OutlineInversePromoGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInversePromoGradientActive.colors,
                DarkGradientTokens.OutlineInversePromoGradientActive.positions,
                DarkGradientTokens.OutlineInversePromoGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInversePromoGradient.colors,
                DarkGradientTokens.OutlineInversePromoGradient.positions,
                DarkGradientTokens.OutlineInversePromoGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInversePromoMinorGradientHover.colors,
                DarkGradientTokens.OutlineInversePromoMinorGradientHover.positions,
                DarkGradientTokens.OutlineInversePromoMinorGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInversePromoMinorGradientActive.colors,
                DarkGradientTokens.OutlineInversePromoMinorGradientActive.positions,
                DarkGradientTokens.OutlineInversePromoMinorGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInversePromoMinorGradient.colors,
                DarkGradientTokens.OutlineInversePromoMinorGradient.positions,
                DarkGradientTokens.OutlineInversePromoMinorGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentGradient.colors,
                DarkGradientTokens.OutlineInverseAccentGradient.positions,
                DarkGradientTokens.OutlineInverseAccentGradient.angle,
                DarkGradientTokens.OutlineInverseAccentGradient.startPoint,
                DarkGradientTokens.OutlineInverseAccentGradient.endPoint,
            ),
        ),
        overwrite,
    )
    return SddsServGradients(initial)
}

internal fun linearGradient(
    colors: List<Color>,
    positions: FloatArray,
    angle: Float = 0f,
    startPoint: Offset? = null,
    endPoint: Offset? = null,
): ShaderBrush = Gradients.Linear(colors, positions.toList(), angle, startPoint, endPoint)

internal fun radialGradient(
    colors: List<Color>,
    positions: FloatArray,
    radius: Float,
    centerX: Float,
    centerY: Float,
): ShaderBrush = Gradients.Radial(colors, positions.toList(), radius, centerX, centerY)

internal fun sweepGradient(
    colors: List<Color>,
    positions: FloatArray,
    centerX: Float,
    centerY: Float,
): ShaderBrush = Gradients.Sweep(colors, positions.toList(), centerX, centerY)

internal fun singleColor(color: Color): ShaderBrush = Gradients.Linear(
    listOf(color, color),
    listOf(0f, 1f),
)

/**
 * Модификатор, позволяющий применить композитный градиент.
 */
@Composable
public fun Modifier.compositeGradient(brushes: List<Brush>): Modifier = this then
    Modifier.drawBehind { brushes.forEach(::drawRect) }
