package com.sdds.plugin.themebuilder.internal.compare

import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

/**
 * Семантическое сравнение двух деревьев сгенерированных ресурсов темы.
 *
 * Нужно потому, что переход на универсальный View-генератор меняет порядок эмиссии
 * `<item>` внутри `<style>` (генератор идёт по порядку объявления атрибутов в
 * `declare-styleable`, а рукописные генераторы — в произвольном), но не должен менять
 * ничего семантически. Текстовый `diff` такую перестановку показывает как расхождение,
 * поэтому нужен сравниватель, который отличает безобидную перестановку от регрессии.
 *
 * Правила:
 * - `<style>` сопоставляются по имени; набор `<item>` сравнивается как отображение
 *   «имя → значение», порядок не важен ([DifferenceKind.ITEM_ORDER] — единственный
 *   класс, попадающий в [ComparisonReport.reorderOnly]);
 * - state-list/selector-ресурсы (`color/`, `xml/`, `drawable/`) сравниваются как
 *   **упорядоченная** последовательность элементов: в Android выигрывает первое
 *   совпадение, поэтому перестановка здесь семантична;
 * - остальные ресурсы (`dimen`, `color`, `attr`, `declare-styleable`) сравниваются
 *   по имени и содержимому.
 *
 * Класс не зависит от Gradle-типов и покрывается unit-тестами.
 */
internal class GeneratedResourceComparator {

    /**
     * Сравнивает эталонное дерево ресурсов [baseline] с актуальным [actual].
     */
    fun compare(baseline: File, actual: File): ComparisonReport {
        val expected = readTree(baseline)
        val current = readTree(actual)
        val differences = mutableListOf<ResourceDifference>()

        (expected.keys - current.keys).sorted().forEach {
            differences += ResourceDifference(DifferenceKind.MISSING, it, "ресурс отсутствует в новом выводе")
        }
        (current.keys - expected.keys).sorted().forEach {
            differences += ResourceDifference(DifferenceKind.UNEXPECTED, it, "ресурс появился в новом выводе")
        }
        (expected.keys intersect current.keys).sorted().forEach { key ->
            differences += diff(key, expected.getValue(key), current.getValue(key))
        }

        return ComparisonReport(
            reorderOnly = differences.filter { it.kind == DifferenceKind.ITEM_ORDER },
            semantic = differences.filter { it.kind != DifferenceKind.ITEM_ORDER },
        )
    }

    private fun diff(key: String, expected: ResourceEntry, actual: ResourceEntry): List<ResourceDifference> =
        when {
            expected is ResourceEntry.Style && actual is ResourceEntry.Style -> diffStyle(key, expected, actual)
            expected is ResourceEntry.Sequence && actual is ResourceEntry.Sequence ->
                diffSequence(key, expected, actual)
            expected is ResourceEntry.Value && actual is ResourceEntry.Value ->
                if (expected.value == actual.value) {
                    emptyList()
                } else {
                    listOf(
                        ResourceDifference(
                            DifferenceKind.VALUE_CHANGED,
                            key,
                            "было '${expected.value}', стало '${actual.value}'",
                        ),
                    )
                }
            else -> listOf(
                ResourceDifference(DifferenceKind.TYPE_CHANGED, key, "изменился тип ресурса"),
            )
        }

    private fun diffStyle(key: String, expected: ResourceEntry.Style, actual: ResourceEntry.Style):
        List<ResourceDifference> {
        val differences = mutableListOf<ResourceDifference>()
        if (expected.parent != actual.parent) {
            differences += ResourceDifference(
                DifferenceKind.PARENT_CHANGED, key,
                "родитель: было '${expected.parent}', стало '${actual.parent}'",
            )
        }
        (expected.items.keys - actual.items.keys).sorted().forEach {
            differences += ResourceDifference(DifferenceKind.MISSING, "$key/$it", "item пропал")
        }
        (actual.items.keys - expected.items.keys).sorted().forEach {
            differences += ResourceDifference(DifferenceKind.UNEXPECTED, "$key/$it", "item появился")
        }
        (expected.items.keys intersect actual.items.keys).sorted().forEach { item ->
            val was = expected.items.getValue(item)
            val now = actual.items.getValue(item)
            if (was != now) {
                differences += ResourceDifference(
                    DifferenceKind.VALUE_CHANGED, "$key/$item", "было '$was', стало '$now'",
                )
            }
        }
        if (differences.isEmpty() && expected.order != actual.order) {
            differences += ResourceDifference(
                DifferenceKind.ITEM_ORDER, key,
                "порядок item изменился: ${expected.order} → ${actual.order}",
            )
        }
        return differences
    }

    private fun diffSequence(key: String, expected: ResourceEntry.Sequence, actual: ResourceEntry.Sequence):
        List<ResourceDifference> {
        if (expected.elements == actual.elements) return emptyList()
        val detail = if (expected.elements.toSet() == actual.elements.toSet()) {
            "изменился порядок элементов (в state-list порядок семантичен)"
        } else {
            "было ${expected.elements.size} элементов, стало ${actual.elements.size}"
        }
        return listOf(ResourceDifference(DifferenceKind.SEQUENCE_CHANGED, key, detail))
    }

    // region чтение дерева ресурсов

    private fun readTree(root: File): Map<String, ResourceEntry> {
        require(root.isDirectory) { "Каталог ресурсов не найден: ${root.absolutePath}" }
        val entries = mutableMapOf<String, ResourceEntry>()
        root.walkTopDown()
            .filter { it.isFile && it.extension == "xml" }
            .sortedBy { it.path }
            .forEach { file ->
                val qualifier = file.parentFile.name
                if (qualifier.startsWith(VALUES_DIR)) {
                    readValues(file, qualifier, entries)
                } else {
                    entries["$qualifier/${file.name}"] = ResourceEntry.Sequence(readElements(file))
                }
            }
        return entries
    }

    private fun readValues(file: File, qualifier: String, into: MutableMap<String, ResourceEntry>) {
        val root = parse(file) ?: return
        root.childElements().forEach { element ->
            val name = element.getAttribute("name").ifBlank { return@forEach }
            val key = "$qualifier/${element.tagName}:$name"
            into[key] = when (element.tagName) {
                TAG_STYLE -> ResourceEntry.Style(
                    parent = element.getAttribute("parent"),
                    items = element.childElements().associate { it.getAttribute("name") to it.textContent.trim() },
                    order = element.childElements().map { it.getAttribute("name") },
                )
                TAG_DECLARE_STYLEABLE -> ResourceEntry.Sequence(element.childElements().map { it.describe() })
                else -> ResourceEntry.Value(element.describe().toString())
            }
        }
    }

    private fun readElements(file: File): List<Map<String, String>> =
        parse(file)?.childElements()?.map { it.describe() }.orEmpty()

    private fun Element.describe(): Map<String, String> = buildMap {
        put(ELEMENT_KEY, tagName)
        val attributes = attributes
        (0 until attributes.length)
            .map { attributes.item(it) }
            .sortedBy { it.nodeName }
            .forEach { put(it.nodeName, it.nodeValue) }
        val text = childElements().takeIf { it.isEmpty() }?.let { textContent.trim() }.orEmpty()
        if (text.isNotEmpty()) put(TEXT_KEY, text)
        childElements().forEachIndexed { index, child -> put("$index", child.describe().toString()) }
    }

    private fun parse(file: File): Element? = runCatching {
        DocumentBuilderFactory.newInstance()
            .apply { isNamespaceAware = false }
            .newDocumentBuilder()
            .parse(file)
            .documentElement
    }.getOrNull()

    private fun Element.childElements(): List<Element> {
        val result = mutableListOf<Element>()
        val nodes = childNodes
        for (index in 0 until nodes.length) {
            val node = nodes.item(index)
            if (node.nodeType == Node.ELEMENT_NODE) result += node as Element
        }
        return result
    }

    // endregion

    private companion object {
        const val VALUES_DIR = "values"
        const val TAG_STYLE = "style"
        const val TAG_DECLARE_STYLEABLE = "declare-styleable"
        const val ELEMENT_KEY = "#element"
        const val TEXT_KEY = "#text"
    }
}

/**
 * Результат сравнения: расхождения, разделённые на безобидные перестановки и семантические.
 *
 * @property reorderOnly перестановки `<item>` внутри стиля — ожидаемы при переходе на
 *  универсальный генератор и не являются регрессией
 * @property semantic всё остальное — гейт раскатки требует пустого списка
 */
internal data class ComparisonReport(
    val reorderOnly: List<ResourceDifference>,
    val semantic: List<ResourceDifference>,
) {
    /** true, если семантических расхождений нет. */
    val isCompatible: Boolean get() = semantic.isEmpty()

    /** Человекочитаемый отчёт с разбивкой по классам расхождений. */
    fun format(limit: Int = DEFAULT_LIMIT): String = buildString {
        appendLine("Семантических расхождений: ${semantic.size}, перестановок item: ${reorderOnly.size}")
        semantic.take(limit).forEach { appendLine("  [${it.kind}] ${it.resource}: ${it.detail}") }
        if (semantic.size > limit) appendLine("  … и ещё ${semantic.size - limit}")
    }

    private companion object {
        const val DEFAULT_LIMIT = 50
    }
}

/**
 * Единичное расхождение между эталоном и новым выводом.
 *
 * @property kind класс расхождения
 * @property resource идентификатор ресурса (`values/style:Имя` либо `color/файл.xml`)
 * @property detail подробности для отчёта
 */
internal data class ResourceDifference(
    val kind: DifferenceKind,
    val resource: String,
    val detail: String,
)

/** Классы расхождений; в [ComparisonReport.reorderOnly] попадает только [ITEM_ORDER]. */
internal enum class DifferenceKind {
    MISSING,
    UNEXPECTED,
    VALUE_CHANGED,
    PARENT_CHANGED,
    SEQUENCE_CHANGED,
    TYPE_CHANGED,
    ITEM_ORDER,
}

private sealed interface ResourceEntry {
    data class Style(
        val parent: String,
        val items: Map<String, String>,
        val order: List<String>,
    ) : ResourceEntry

    data class Sequence(val elements: List<Map<String, String>>) : ResourceEntry

    data class Value(val value: String) : ResourceEntry
}
