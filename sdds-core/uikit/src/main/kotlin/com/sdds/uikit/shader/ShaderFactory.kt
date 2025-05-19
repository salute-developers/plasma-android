package com.sdds.uikit.shader

import android.graphics.RectF
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

/**
 * Фабрика [Shader] с поддержкой кэша.
 */
interface CachedShaderFactory {

    /**
     * Возвращает [Shader], если в кэше есть значение для текущих границ,
     * иначе создает [Shader] при помощи [shaderFactory]
     */
    fun getShader(shaderFactory: ShaderFactory, bounds: RectF): Shader?

    companion object {

        /**
         * Создает [CachedShaderFactory]
         */
        fun create(): CachedShaderFactory = CachedShaderFactoryImpl()
    }
}

private class CachedShaderFactoryImpl : CachedShaderFactory {
    private var _shaderFactory: ShaderFactory? = null
    private var _shader: Shader? = null
    private var _shaderBounds: RectF = RectF()

    override fun getShader(shaderFactory: ShaderFactory, bounds: RectF): Shader? {
        if (bounds.isEmpty) return null
        if (_shaderFactory != shaderFactory || _shader == null || _shaderBounds != bounds) {
            _shaderBounds.set(bounds)
            _shaderFactory = shaderFactory
            return shaderFactory.resize(_shaderBounds.width(), _shaderBounds.height()).also {
                _shader = it
            }
        }
        return _shader
    }
}
