package com.sdds.testing.vs.badge

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Badge
import com.sdds.uikit.IconBadge

/**
 * Тест-кейсы для [Badge], [IconBadge]
 */
@Suppress("UndocumentedPublicFunction")
abstract class BadgeTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1356
     */
    abstract fun testBadgeSizeLDefaultContentLeft()

    /**
     * PLASMA-T1357
     */
    abstract fun testBadgeSizeMAccentContentRight()

    /**
     * PLASMA-T1358
     */
    abstract fun testBadgeSizeSPositivePilled()

    /**
     * PLASMA-T1359
     */
    abstract fun testBadgeSizeXsWarning()

    /**
     * PLASMA-T1360
     */
    abstract fun testBadgeSizeLNegative()

    /**
     * PLASMA-T1361
     */
    abstract fun testBadgeSizeMDark()

    /**
     * PLASMA-T1362
     */
    abstract fun testBadgeSizeSLight()

    /**
     * PLASMA-T1363
     */
    abstract fun testBadgeSizeLDefaultClear()

    /**
     * PLASMA-T1364
     */
    abstract fun testBadgeSizeLDefaultTransparent()

    /**
     * PLASMA-T1873
     */
    abstract fun testBadgeSizeMNegativeClear()

    /**
     * PLASMA-T1874
     */
    abstract fun testBadgeSizeSWarningPilledTransparent()

    /**
     * PLASMA-T1876
     */
    abstract fun testIconBadgeSizeLDefault()

    /**
     * PLASMA-T1877
     */
    abstract fun testIconBadgeSizeMAccentPilled()

    /**
     * PLASMA-T1878
     */
    abstract fun testIconBadgeSizeSPositiveClear()

    /**
     * PLASMA-T1879
     */
    abstract fun testIconBadgeSizeXsWarningTransparent()

    /**
     * PLASMA-T1880
     */
    abstract fun testIconBadgeSizeLNegative()

    /**
     * PLASMA-T1881
     */
    abstract fun testIconBadgeSizeMBlack()

    /**
     * PLASMA-T1882
     */
    abstract fun testIconBadgeSizeSWhite()

    fun ComponentScope.badgeSizeLDefaultContentLeft(style: Int): Badge =
        badge(
            context,
            style,
            BadgeUiState(
                label = "Label",
                contentLeft = true,
                contentRight = false,
            ),
        )

    fun ComponentScope.badgeSizeMAccentContentRight(style: Int): Badge =
        badge(
            context,
            style,
            BadgeUiState(
                label = "Label",
                contentLeft = false,
                contentRight = true,
            ),
        )

    fun ComponentScope.badgeCommon(style: Int): Badge =
        badge(
            context,
            style,
            BadgeUiState(
                label = "Label",
                contentLeft = false,
                contentRight = false,
            ),
        )

    fun ComponentScope.iconBadgeCommon(style: Int): IconBadge =
        iconBadge(
            context,
            style,
        )
}
