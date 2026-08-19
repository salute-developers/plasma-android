package com.sdds.plugin.themebuilder.internal.compare

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

/**
 * Unit-тесты [GeneratedResourceComparator] — инструмента, которым проверяется
 * обратная совместимость при переходе на универсальный View-генератор.
 */
class GeneratedResourceComparatorTest {

    @get:Rule
    val tempFolder = TemporaryFolder()

    private val underTest = GeneratedResourceComparator()

    @Test
    fun `item reorder inside style is not a regression`() {
        val baseline = tree(
            "values/styles.xml" to style(
                """
                <item name="android:minWidth">@dimen/w</item>
                <item name="android:minHeight">@dimen/h</item>
                """,
            ),
        )
        val actual = tree(
            "values/styles.xml" to style(
                """
                <item name="android:minHeight">@dimen/h</item>
                <item name="android:minWidth">@dimen/w</item>
                """,
            ),
        )

        val report = underTest.compare(baseline, actual)

        assertTrue(report.format(), report.isCompatible)
        assertEquals(1, report.reorderOnly.size)
        assertEquals(DifferenceKind.ITEM_ORDER, report.reorderOnly.single().kind)
    }

    @Test
    fun `changed item value is semantic`() {
        val baseline = tree("values/styles.xml" to style("""<item name="sd_background">?serv_a</item>"""))
        val actual = tree("values/styles.xml" to style("""<item name="sd_background">?serv_b</item>"""))

        val report = underTest.compare(baseline, actual)

        assertEquals(1, report.semantic.size)
        assertEquals(DifferenceKind.VALUE_CHANGED, report.semantic.single().kind)
    }

    @Test
    fun `renamed resource is reported as missing and unexpected`() {
        val baseline = tree("values/dimens.xml" to resources("""<dimen name="serv_badge_bg_color">4dp</dimen>"""))
        val actual = tree("values/dimens.xml" to resources("""<dimen name="serv_badge_background">4dp</dimen>"""))

        val report = underTest.compare(baseline, actual)

        assertEquals(setOf(DifferenceKind.MISSING, DifferenceKind.UNEXPECTED), report.semantic.map { it.kind }.toSet())
    }

    @Test
    fun `state list element reorder is semantic`() {
        val baseline = tree(
            "color/selector.xml" to selector(
                """
                <item android:color="?serv_pressed" android:state_pressed="true" />
                <item android:color="?serv_default" />
                """,
            ),
        )
        val actual = tree(
            "color/selector.xml" to selector(
                """
                <item android:color="?serv_default" />
                <item android:color="?serv_pressed" android:state_pressed="true" />
                """,
            ),
        )

        val report = underTest.compare(baseline, actual)

        assertEquals(1, report.semantic.size)
        assertEquals(DifferenceKind.SEQUENCE_CHANGED, report.semantic.single().kind)
        assertTrue(report.semantic.single().detail.contains("порядок"))
    }

    @Test
    fun `missing state list file is semantic`() {
        val baseline = tree("color/selector.xml" to selector("""<item android:color="?serv_default" />"""))
        val actual = tree("values/styles.xml" to style(""))

        val report = underTest.compare(baseline, actual)

        assertTrue(report.semantic.any { it.kind == DifferenceKind.MISSING })
    }

    @Test
    fun `changed style parent is semantic`() {
        val baseline = tree("values/styles.xml" to style("", parent = "Sdds.Components.Avatar"))
        val actual = tree("values/styles.xml" to style("", parent = "Sdds.Components.AvatarGroup"))

        val report = underTest.compare(baseline, actual)

        assertEquals(DifferenceKind.PARENT_CHANGED, report.semantic.single().kind)
    }

    @Test
    fun `identical trees produce no differences`() {
        val content = "values/styles.xml" to style("""<item name="sd_background">?serv_a</item>""")
        val report = underTest.compare(tree(content), tree(content))

        assertTrue(report.isCompatible)
        assertTrue(report.reorderOnly.isEmpty())
    }

    @Test
    fun `compare возвращает UNEXPECTED если ресурс есть только в actual`() {
        val baseline = tree()
        val actual = tree("values/dimens.xml" to resources("""<dimen name="spacing_1x">4dp</dimen>"""))

        val report = underTest.compare(baseline, actual)

        assertEquals(1, report.semantic.size)
        assertEquals(DifferenceKind.UNEXPECTED, report.semantic.single().kind)
        assertEquals("values/dimen:spacing_1x", report.semantic.single().resource)
    }

    @Test
    fun `compare возвращает MISSING и UNEXPECTED если в style изменился набор item`() {
        val baseline = tree("values/styles.xml" to style("""<item name="sd_old">?attr/old</item>"""))
        val actual = tree("values/styles.xml" to style("""<item name="sd_new">?attr/new</item>"""))

        val report = underTest.compare(baseline, actual)

        assertEquals(
            setOf(DifferenceKind.MISSING, DifferenceKind.UNEXPECTED),
            report.semantic.map { it.kind }.toSet(),
        )
        assertEquals(
            setOf("values/style:Serv.Sdds.Components.Avatar/sd_old", "values/style:Serv.Sdds.Components.Avatar/sd_new"),
            report.semantic.map { it.resource }.toSet(),
        )
    }

    @Test
    fun `compare возвращает SEQUENCE_CHANGED если в selector изменилось количество item`() {
        val baseline = tree("color/selector.xml" to selector("""<item android:color="?serv_default" />"""))
        val actual = tree(
            "color/selector.xml" to selector(
                """
                <item android:color="?serv_pressed" android:state_pressed="true" />
                <item android:color="?serv_default" />
                """.trimIndent(),
            ),
        )

        val report = underTest.compare(baseline, actual)

        assertEquals(1, report.semantic.size)
        assertEquals(DifferenceKind.SEQUENCE_CHANGED, report.semantic.single().kind)
        assertTrue(report.semantic.single().detail.contains("1"))
        assertTrue(report.semantic.single().detail.contains("2"))
    }

    @Test
    fun `format обрезает semantic diff по limit`() {
        val report = ComparisonReport(
            reorderOnly = emptyList(),
            semantic = listOf(
                ResourceDifference(DifferenceKind.MISSING, "values/color:first", "first"),
                ResourceDifference(DifferenceKind.UNEXPECTED, "values/color:second", "second"),
            ),
        )

        val result = report.format(limit = 1)

        assertTrue(result.contains("values/color:first"))
        assertFalse(result.contains("values/color:second"))
        assertTrue(result.contains("1"))
    }

    @Test
    fun `compare не возвращает diff для одинакового value ресурса`() {
        val content = "values/colors.xml" to resources("""<color name="primary">#FFFFFFFF</color>""")

        val report = underTest.compare(tree(content), tree(content))

        assertTrue(report.isCompatible)
        assertTrue(report.semantic.isEmpty())
    }

    @Test
    fun `compare возвращает VALUE_CHANGED если value ресурс изменился`() {
        val baseline = tree("values/colors.xml" to resources("""<color name="primary">#FFFFFFFF</color>"""))
        val actual = tree("values/colors.xml" to resources("""<color name="primary">#FF000000</color>"""))

        val report = underTest.compare(baseline, actual)

        assertEquals(1, report.semantic.size)
        assertEquals(DifferenceKind.VALUE_CHANGED, report.semantic.single().kind)
        assertEquals("values/color:primary", report.semantic.single().resource)
    }

    @Test
    fun `compare не возвращает diff для одинакового selector`() {
        val content = "color/selector.xml" to selector(
            """
                <item android:color="?serv_pressed" android:state_pressed="true" />
                <item android:color="?serv_default" />
            """.trimIndent(),
        )

        val report = underTest.compare(tree(content), tree(content))

        assertTrue(report.isCompatible)
        assertTrue(report.semantic.isEmpty())
    }

    @Test
    fun `compare не возвращает diff для одинакового declare styleable`() {
        val content = "values/attrs.xml" to resources(
            """
                <declare-styleable name="TestView">
                    <attr name="testColor" />
                    <attr name="testSize" />
                </declare-styleable>
            """.trimIndent(),
        )

        val report = underTest.compare(tree(content), tree(content))

        assertTrue(report.isCompatible)
        assertTrue(report.semantic.isEmpty())
    }

    @Test
    fun `compare игнорирует values resource без name`() {
        val baseline = tree("values/colors.xml" to resources("""<color>#FFFFFFFF</color>"""))
        val actual = tree()

        val report = underTest.compare(baseline, actual)

        assertTrue(report.isCompatible)
        assertTrue(report.semantic.isEmpty())
    }

    @Test
    fun `compare падает если baseline не директория`() {
        val missingBaseline = tempFolder.root.resolve("missing-baseline")
        val actual = tree()

        val exception = assertThrows(IllegalArgumentException::class.java) {
            underTest.compare(missingBaseline, actual)
        }

        assertTrue(exception.message.orEmpty().contains(missingBaseline.absolutePath))
    }

    private fun style(items: String, parent: String = "Sdds.Components.Avatar"): String = resources(
        """<style name="Serv.Sdds.Components.Avatar" parent="$parent">$items</style>""",
    )

    private fun resources(content: String): String =
        """<?xml version="1.0" encoding="utf-8"?><resources>$content</resources>"""

    private fun selector(items: String): String =
        """<?xml version="1.0" encoding="utf-8"?>""" +
            """<selector xmlns:android="http://schemas.android.com/apk/res/android">$items</selector>"""

    private fun tree(vararg files: Pair<String, String>): File {
        val root = tempFolder.newFolder()
        files.forEach { (path, content) ->
            File(root, path).apply {
                parentFile.mkdirs()
                writeText(content)
            }
        }
        return root
    }
}
