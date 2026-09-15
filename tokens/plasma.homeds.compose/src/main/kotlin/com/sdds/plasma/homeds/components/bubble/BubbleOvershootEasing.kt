package com.sdds.plasma.homeds.components.bubble

import androidx.compose.animation.core.Easing

/**
 * "Пружинный" overshoot-easing (`easeOutBack`): значение проскакивает мимо цели и плавно
 * возвращается к ней. [tension] управляет силой перелёта.
 */
internal class BubbleOvershootEasing(private val tension: Float) : Easing {
    override fun transform(fraction: Float): Float {
        val u = fraction - 1f
        return 1f + u * u * ((tension + 1f) * u + tension)
    }
}

/**
 * Овершут для "пружинного" масштаба тела при разворачивании — ~10% перелёта мимо цели.
 */
internal val BubbleBounceEasing = BubbleOvershootEasing(BUBBLE_BOUNCE_TENSION)

/**
 * Овершут для поворота обводки — ~15% перелёта мимо цели.
 */
internal val BubbleRotationOvershootEasing = BubbleOvershootEasing(BUBBLE_ROTATION_OVERSHOOT_TENSION)

private const val BUBBLE_BOUNCE_TENSION = 1.70158f
private const val BUBBLE_ROTATION_OVERSHOOT_TENSION = 2.163f
