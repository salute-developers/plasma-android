package com.sdds.compose.uikit.internal.common

import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Shader

internal expect fun compositeShader(dst: Shader, src: Shader, blendMode: BlendMode): Shader
