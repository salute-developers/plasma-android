package com.sdds.uikit.shader

import android.graphics.Shader

/**
 * Фабрика [Shader].
 */
interface ShaderFactory {

    /**
     * Изменяет размер [Shader]
     * @param width ширина
     * @param height высота
     */
    fun resize(width: Float, height: Float): Shader
}
