// Copyright 2023, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

@file:OptIn(InternalHazeApi::class)

package com.sdds.haze.blur

import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Shader
import com.sdds.haze.HazeBlendMode
import com.sdds.haze.InternalHazeApi
import com.sdds.haze.PlatformContext
import com.sdds.haze.PlatformRenderEffect
import com.sdds.haze.createBlendImageFilter
import com.sdds.haze.createBlurImageFilter
import com.sdds.haze.createColorFilterImageFilter
import com.sdds.haze.createFractalNoiseShader
import com.sdds.haze.createShaderImageFilter
import org.jetbrains.skia.ColorFilter
import org.jetbrains.skia.ColorMatrix

private val NOISE_SHADER by lazy(LazyThreadSafetyMode.NONE) {
    createFractalNoiseShader(
        baseFrequencyX = 0.45f,
        baseFrequencyY = 0.45f,
        numOctaves = 4,
        seed = 2.0f,
    )
}

internal actual fun createNoiseEffect(
    context: PlatformContext,
    noiseFactor: Float,
    mask: Shader?,
    scale: Float,
): PlatformRenderEffect {
    val source = createShaderImageFilter(NOISE_SHADER)

    val noiseEffect = if (noiseFactor < 1f) {
        val matrix = ColorMatrix(
            1f, 0f, 0f, 0f, 0f,
            0f, 1f, 0f, 0f, 0f,
            0f, 0f, 1f, 0f, 0f,
            0f, 0f, 0f, noiseFactor, 0f,
        )

        createColorFilterImageFilter(ColorFilter.makeMatrix(matrix), source)
    } else {
        source
    }

    return when {
        mask != null -> {
            createBlendImageFilter(
                blendMode = HazeBlendMode.SrcIn,
                background = createShaderImageFilter(mask),
                foreground = noiseEffect,
            )
        }

        else -> {
            noiseEffect
        }
    }
}

internal actual fun createBlurRenderEffect(
    blurRadiusPx: Float,
    params: RenderEffectParams,
): PlatformRenderEffect {
    val sigma = BlurEffect.convertRadiusToSigma(blurRadiusPx)
    return createBlurImageFilter(sigmaX = sigma, sigmaY = sigma, tileMode = params.blurTileMode)
}
