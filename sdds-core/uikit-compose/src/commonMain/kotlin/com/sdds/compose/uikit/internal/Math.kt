package com.sdds.compose.uikit.internal

import kotlin.math.PI

internal fun Double.toRadians(): Double = this * PI / 180.0

internal fun Float.toRadians(): Float = this * (PI / 180.0).toFloat()
