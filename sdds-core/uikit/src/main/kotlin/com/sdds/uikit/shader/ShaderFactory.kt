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
     * Обновляет границы [bounds] для [Shader]
     */
    fun updateBounds(bounds: RectF): Boolean

    /**
     * Возвращает [Shader], если в кэше есть значение для текущих границ,
     * иначе создает [Shader] при помощи [shaderFactory]
     */
    fun getShader(shaderFactory: ShaderFactory): Shader?

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

    override fun updateBounds(bounds: RectF): Boolean {
        if (_shaderBounds != bounds) {
            _shaderBounds.set(bounds)
            _shader = null
            return true
        }
        return false
    }

    override fun getShader(shaderFactory: ShaderFactory): Shader? {
        if (_shaderBounds.isEmpty) return null
        if (_shaderFactory != shaderFactory || _shader == null) {
            _shaderFactory = shaderFactory
            return shaderFactory.resize(_shaderBounds.width(), _shaderBounds.height()).also {
                _shader = it
            }
        }
        return _shader
    }
}
