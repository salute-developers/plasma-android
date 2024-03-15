package com.sdds.plugin.themebuilder.internal.dimens

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Unit тесты [DimensAggregator]
 * @author Малышев Александр on 13.03.2024
 */
class DimensAggregatorTest {

    @Test
    fun `DimensAggregator сохраняет данные о размере`() {
        val dimen = DimenData("testDimen", 10f, DimenData.Type.DP)
        val underTest = DimensAggregator()

        underTest.addDimen(dimen)

        assertTrue(underTest.dimens.contains(dimen))
    }
}
