package com.sdds.plugin.themebuilder.internal.generator.data

/**
 * Данные о токенах градиента.
 *
 * @property composeTokens данные о токенах для Compose
 * @property viewXmlTokens данные о токенах для View
 */
internal data class GradientTokenResult(
    val composeTokens: ComposeTokenData,
    val viewXmlTokens: ViewTokenData,
) {

    internal data class ViewTokenData(
        val light: Map<String, Gradient>,
        val dark: Map<String, Gradient>,
    ) {
        internal data class Gradient(
            val nameSnakeCase: String,
            val layers: List<Layer>,
            val description: String,
            val isTextGradient: Boolean,
        ) {
            internal sealed class Layer {
                data class Linear(
                    val angle: String,
                    val colors: String,
                    val stops: String,
                    val startX: String? = null,
                    val startY: String? = null,
                    val endX: String? = null,
                    val endY: String? = null,
                ) : Layer()

                data class Radial(
                    val centerX: String,
                    val centerY: String,
                    val radius: String,
                    val colors: String,
                    val stops: String,
                ) : Layer()

                data class Sweep(
                    val centerX: String,
                    val centerY: String,
                    val colors: String,
                    val stops: String,
                ) : Layer()

                data class Solid(
                    val colors: String,
                ) : Layer()
            }
        }
    }

    /**
     * Выходные данные о токене градиента
     */
    internal data class ComposeTokenData(
        val light: Map<String, List<Gradient>>,
        val dark: Map<String, List<Gradient>>,
    ) {

        /**
         * Возвращает описание токена градиента
         */
        fun description(gradient: String): String =
            (light[gradient] ?: dark[gradient])?.firstOrNull()?.description.orEmpty()

        /**
         * Параметры градиента
         */
        internal data class Gradient(
            val tokenRefs: List<String>,
            val gradientType: GradientType,
            val description: String = "",
        )

        /**
         * Тип градиента
         */
        internal enum class GradientType {
            LINEAR, RADIAL, SWEEP, BACKGROUND
        }
    }
}

internal fun GradientTokenResult.ComposeTokenData.mergedLightAndDark(): Set<String> {
    return light.keys + dark.keys
}

internal fun GradientTokenResult.ViewTokenData.mergedLightAndDark(): Set<String> {
    return light.keys + dark.keys
}
