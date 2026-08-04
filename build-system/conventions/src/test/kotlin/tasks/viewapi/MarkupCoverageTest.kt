package tasks.viewapi

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

/**
 * Гейт полноты разметки: сверяет `sdds:*`-разметку в `sdds-core/uikit` с фикстурой
 * `legacy-view-bindings.json`, снятой с рукописных `*StyleGeneratorView` до их удаления.
 *
 * Фикстура — единственный носитель знания о том, какой ключ токен-конфига в какой
 * XML-атрибут и в какое имя генерируемого ресурса проецировался. Для компонента с
 * `migrated = true` разметка обязана покрывать все его привязки: именно это позволяет
 * удалить рукописный генератор, не потеряв поведение.
 *
 * По мере расширения модели меты (идентичность, `resSuffix`, `placement`, состояния)
 * проверки в [assertCovered] дополняются соответствующими полями.
 */
class MarkupCoverageTest {

    private val fixture: List<JsonObject> by lazy {
        val stream = requireNotNull(javaClass.classLoader.getResourceAsStream(FIXTURE)) {
            "Не найдена фикстура $FIXTURE в test-ресурсах"
        }
        val root = Json.parseToJsonElement(stream.reader().readText()).jsonObject
        root.getValue("components").jsonArray.map { it.jsonObject }
    }

    private val metaByComponent: Map<String, List<ComponentMeta>> by lazy {
        val valuesDir = File(repoRoot(), UIKIT_VALUES)
        assertTrue(
            "Не найден каталог ресурсов uikit: ${valuesDir.absolutePath}",
            valuesDir.isDirectory,
        )
        val files = valuesDir.listFiles { f: File -> f.extension == "xml" }.orEmpty().sorted()
        val components = DeclareStyleableParser(resourcePrefix = "sd_").parse(files).components
        components
            .flatMap { meta -> meta.componentNames.map { name -> name to meta } }
            .groupBy({ (name, _) -> name }, { (_, meta) -> meta })
    }

    @Test
    fun `markup covers legacy bindings for migrated components`() {
        val migrated = fixture.filter { it.bool("migrated") }
        val failures = migrated.flatMap { component -> uncovered(component) }
        assertTrue(
            buildString {
                appendLine("Разметка не покрывает привязки мигрированных компонентов (${failures.size}):")
                failures.take(MAX_REPORTED).forEach { appendLine("  $it") }
                if (failures.size > MAX_REPORTED) appendLine("  … и ещё ${failures.size - MAX_REPORTED}")
            },
            failures.isEmpty(),
        )
    }

    /**
     * `sd_shapeAppearanceAdjustment` в стиле один на все формы компонента, поэтому его
     * владелец задаётся разметкой. Обратное направление (лишний владелец) не проверяется:
     * рукописные генераторы местами adjustment не печатали вовсе, и его появление —
     * принятый дрейф.
     */
    @Test
    fun `markup keeps legacy shape adjustment owners`() {
        val lost = fixture.flatMap { component ->
            val name = component.str("component")
            val params = metaByComponent[name].orEmpty().flatMap { it.params }
            component.getValue("bindings").jsonArray
                .map { it.jsonObject }
                .filter { it.bool("adjustment") }
                .filterNot { binding ->
                    params.any { it.attrName == binding.str("attrName") && it.shapeAdjustment }
                }
                .map { "$name: '${it.str("attrName")}' потерял владение sd_shapeAppearanceAdjustment" }
        }
        assertTrue(
            "Разметка отняла adjustment у свойств, которым его печатали рукописные генераторы:\n" +
                lost.joinToString("\n") { "  $it" },
            lost.isEmpty(),
        )
    }

    @Test
    fun `every migrated component is present in view meta`() {
        val missing = fixture.filter { it.bool("migrated") }
            .map { it.str("component") }
            .filter { metaByComponent[it].isNullOrEmpty() }
        assertTrue(
            "Компоненты помечены migrated, но отсутствуют во view-мете (sdds:api_info): $missing",
            missing.isEmpty(),
        )
    }

    /**
     * Информационный отчёт: показывает, сколько ещё предстоит доразметить.
     * Не падает — служит навигацией по волнам раскатки.
     */
    @Test
    fun `coverage report`() {
        val report = fixture.map { component ->
            val name = component.str("component")
            val total = component.getValue("bindings").jsonArray.size
            val gaps = uncovered(component).size
            Triple(name, total - gaps, total)
        }.sortedBy { (_, covered, total) -> if (total == 0) 1.0 else covered.toDouble() / total }
        val covered = report.sumOf { it.second }
        val total = report.sumOf { it.third }
        println("Покрытие разметкой: $covered/$total привязок по ${report.size} компонентам")
        report.forEach { (name, c, t) -> println("  %-24s %3d/%-3d".format(name, c, t)) }
    }

    private fun uncovered(component: JsonObject): List<String> {
        val name = component.str("component")
        val metas = metaByComponent[name].orEmpty()
        val params = metas.flatMap { it.params }
        return component.getValue("bindings").jsonArray
            .map { it.jsonObject }
            .filterNot { binding -> params.covers(binding) }
            .map { binding ->
                "$name: ключ '${binding.str("configKey")}' → атрибут '${binding.str("attrName")}'" +
                    (binding.strOrNull("underState")?.let { " (под состоянием '$it')" } ?: "")
            }
    }

    /**
     * Привязка покрыта, если ключ конфига попал в мету как самостоятельное свойство
     * либо — для значений под состоянием — как `stateValue` нужного свойства:
     * `sdds:api_state_value="readonly=labelColorReadOnly"` описывает ровно такую привязку.
     * Форма `alpha(<ключ>)` берёт значение базового ключа и меняет ему альфу, поэтому
     * покрывающим считается сам атрибут под тем же состоянием.
     */
    private fun List<PropertyMeta>.covers(binding: JsonObject): Boolean {
        val configKey = binding.str("configKey")
        val attrName = binding.str("attrName")
        val underState = binding.strOrNull("underState")
            ?: return any { it.id == configKey && it.attrName == attrName }
        return any { param ->
            param.attrName == attrName &&
                param.stateValues.any { stateValue ->
                    stateValue.state == underState &&
                        (stateValue.configKey == configKey || stateValue.kind == StateValueKind.ALPHA.key)
                }
        }
    }

    private fun JsonObject.str(key: String): String = getValue(key).jsonPrimitive.content

    private fun JsonObject.strOrNull(key: String): String? = get(key)?.jsonPrimitive?.contentOrNull

    private fun JsonObject.bool(key: String): Boolean = get(key)?.jsonPrimitive?.boolean ?: false

    private fun repoRoot(): File {
        var dir: File? = File(System.getProperty("user.dir"))
        while (dir != null) {
            if (File(dir, UIKIT_VALUES).isDirectory) return dir
            dir = dir.parentFile
        }
        error("Не найден корень репозитория: ни один родитель не содержит $UIKIT_VALUES")
    }

    private companion object {
        const val FIXTURE = "legacy-view-bindings.json"
        const val UIKIT_VALUES = "sdds-core/uikit/src/main/res/values"
        const val MAX_REPORTED = 40
    }
}
