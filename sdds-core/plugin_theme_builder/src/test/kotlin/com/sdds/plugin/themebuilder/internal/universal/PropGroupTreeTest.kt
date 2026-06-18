package com.sdds.plugin.themebuilder.internal.universal

import org.junit.Assert.assertEquals
import org.junit.Test

class PropGroupTreeTest {

    @Test
    fun `пустое дерево возвращает пустой список`() {
        val tree = PropGroupTree()
        assertEquals(emptyList<String>(), tree.render())
    }

    @Test
    fun `blank группа добавляет вызовы с префиксом точки`() {
        val tree = PropGroupTree()
        tree.add("", "shape(roundS)")
        tree.add("", "labelPlacement(outer)")

        assertEquals(listOf(".shape(roundS)", ".labelPlacement(outer)"), tree.render())
    }

    @Test
    fun `root группа добавляет вызовы с префиксом точки`() {
        val tree = PropGroupTree()
        tree.add("root", "dividerStyle(style)")

        assertEquals(listOf(".dividerStyle(style)"), tree.render())
    }

    @Test
    fun `одноуровневая группа оборачивает вызовы в блок`() {
        val tree = PropGroupTree()
        tree.add("colors", "backgroundColor(surface)")
        tree.add("colors", "labelColor(text)")

        val result = tree.render()
        assertEquals(1, result.size)
        val block = result[0]
        assert(block.startsWith(".colors {")) { "Блок должен начинаться с '.colors {'" }
        assert("backgroundColor(surface)" in block)
        assert("labelColor(text)" in block)
        assert(block.trimEnd().endsWith("}")) { "Блок должен заканчиваться на '}'" }
    }

    @Test
    fun `вложенная группа рендерится внутри родительского блока`() {
        val tree = PropGroupTree()
        tree.add("dimensions", "boxPaddingStart(8.dp)")
        tree.add("dimensions.indicatorDimensions", "horizontalPadding(4.dp)")
        tree.add("dimensions.indicatorDimensions", "verticalPadding(4.dp)")

        val result = tree.render()
        assertEquals(1, result.size)

        val block = result[0]
        assert(block.startsWith(".dimensions {")) { "Блок должен начинаться с '.dimensions {'" }
        assert("boxPaddingStart(8.dp)" in block)
        assert("indicatorDimensions {" in block)
        assert("horizontalPadding(4.dp)" in block)
        assert("verticalPadding(4.dp)" in block)

        val dimensionsStart = block.indexOf(".dimensions {")
        val indicatorStart = block.indexOf("indicatorDimensions {")
        assert(dimensionsStart < indicatorStart) {
            "indicatorDimensions должен быть внутри dimensions"
        }
        assert(".indicatorDimensions" !in block) {
            "Вложенный блок не должен иметь точку-префикс"
        }
    }

    @Test
    fun `вложенная группа без вызовов в родителе генерирует только дочерний блок`() {
        val tree = PropGroupTree()
        tree.add("dimensions.indicatorDimensions", "indicatorSize(6.dp)")

        val result = tree.render()
        assertEquals(1, result.size)
        val block = result[0]
        assert(block.startsWith(".dimensions {"))
        assert("indicatorDimensions {" in block)
        assert("indicatorSize(6.dp)" in block)
        assert(".indicatorDimensions" !in block)
    }

    @Test
    fun `смешанные группы сохраняют порядок`() {
        val tree = PropGroupTree()
        tree.add("", "shape(roundS)")
        tree.add("colors", "backgroundColor(surface)")
        tree.add("dimensions", "boxPaddingStart(8.dp)")
        tree.add("dimensions.indicatorDimensions", "indicatorSize(6.dp)")

        val result = tree.render()
        assertEquals(3, result.size)
        assert(result[0] == ".shape(roundS)")
        assert(result[1].startsWith(".colors {"))
        assert(result[2].startsWith(".dimensions {"))
        assert("indicatorDimensions {" in result[2])
    }

    @Test
    fun `дедупликация параметров выбирает InteractiveColor над Color`() {
        val color = colorMeta("cursorColor", "androidx.compose.ui.graphics.Color")
        val interactive = colorMeta("cursorColor", "com.sdds.compose.uikit.interactions.InteractiveColor")

        val params = listOf(color, interactive)
        val seen = linkedMapOf<String, PropertyMeta>()
        params.forEach { meta ->
            val existing = seen[meta.id]
            if (existing == null || meta.overloadPriority() > existing.overloadPriority()) {
                seen[meta.id] = meta
            }
        }

        val selected = seen.values.single()
        assertEquals("com.sdds.compose.uikit.interactions.InteractiveColor", selected.paramQualifiedType)
    }

    @Test
    fun `дедупликация параметров выбирает StatefulValue над InteractiveColor`() {
        val interactive = colorMeta("cursorColor", "com.sdds.compose.uikit.interactions.InteractiveColor")
        val stateful = colorMeta("cursorColor", "com.sdds.compose.uikit.StatefulValue")

        val params = listOf(interactive, stateful)
        val seen = linkedMapOf<String, PropertyMeta>()
        params.forEach { meta ->
            val existing = seen[meta.id]
            if (existing == null || meta.overloadPriority() > existing.overloadPriority()) {
                seen[meta.id] = meta
            }
        }

        val selected = seen.values.single()
        assertEquals("com.sdds.compose.uikit.StatefulValue", selected.paramQualifiedType)
    }

    private fun colorMeta(id: String, qualifiedType: String) = ColorPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = qualifiedType,
        paramSimpleType = qualifiedType.substringAfterLast("."),
        group = "colors",
    )
}
