package com.sdds.testing.vs.image

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.ImageView

/**
 * Тест-кейсы для [Image]
 */
@Suppress("UndocumentedPublicFunction")
abstract class ImageTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2128
     */
    abstract fun testImageRatio1x1()

    /**
     * PLASMA-T2129
     */
    abstract fun testImageRatio3x4()

    /**
     * PLASMA-T2130
     */
    abstract fun testImageRatio4x3()

    /**
     * PLASMA-T2131
     */
    abstract fun testImageRatio9x16()

    /**
     * PLASMA-T2132
     */
    abstract fun testImageRatio16x9()

    /**
     * PLASMA-T2133
     */
    abstract fun testImageRatio1x2()

    /**
     * PLASMA-T2134
     */
    abstract fun testImageRatio2x1()

    fun ComponentScope.imageTest(style: Int): ImageView =
        margins {
            image(
                context = context,
                style = style,
            )
        }
}
