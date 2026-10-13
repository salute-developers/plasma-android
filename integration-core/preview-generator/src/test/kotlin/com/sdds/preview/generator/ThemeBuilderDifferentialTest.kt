package com.sdds.preview.generator

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.Gradient
import com.sdds.plugin.themebuilder.internal.universal.SolidColor
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeColorPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposePropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.selectOverload
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.decodeFromStream
import java.io.File
import java.util.zip.ZipFile
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Выбор перегрузки билдера генератором фабрик preview должен совпадать с Theme Builder
 * (`UniversalComposeVariationGenerator.selectOverload`) для каждого свойства каждого компонента меты:
 * иначе preview разойдётся с кодом, который Theme Builder генерирует для приложения.
 */
@OptIn(ExperimentalSerializationApi::class)
class ThemeBuilderDifferentialTest {
    private val metaFile = File(
        requireNotNull(System.getProperty("preview.api.meta.jar")) { "Нет preview.api.meta.jar" },
    )

    private val themeBuilderMeta: List<ComposeComponentMeta> = ZipFile(metaFile).use { zip ->
        val entry = requireNotNull(zip.getEntry("sdds/api/uikit-compose-api-meta.json"))
        zip.getInputStream(entry).use { Serializer.componentConfig.decodeFromStream(it) }
    }

    private val generatorMeta: List<ComponentMeta> = readApiMeta(metaFile)

    /** Выбранная перегрузка; `valueType` сравнивается только у цветов (Theme Builder хранит его лишь у цветов). */
    private data class Choice(val method: String, val paramType: String, val valueType: String, val group: String)

    private fun ComposePropertyMeta.choice() = Choice(
        method = methodName,
        paramType = paramQualifiedType,
        valueType = (this as? ComposeColorPropertyMeta)?.valueQualifiedType.orEmpty(),
        group = group,
    )

    private fun ParamMeta.choice() = Choice(methodName, paramQualifiedType, valueQualifiedType, group)

    private fun ParamMeta.nonColourChoice() = Choice(methodName, paramQualifiedType, "", group)

    /** Группы перегрузок по `id` без устаревших свойств, как их собирает Theme Builder. */
    private fun themeBuilderGroups(component: ComposeComponentMeta): List<List<ComposePropertyMeta>> {
        val grouped = linkedMapOf<String, MutableList<ComposePropertyMeta>>()
        component.params.filter { it.deprecated == null }.forEach {
            grouped.getOrPut(it.id) { mutableListOf() }.add(it)
        }
        return grouped.values.toList()
    }

    @Test
    fun `component and property sets match Theme Builder`() {
        assertEquals(themeBuilderMeta.map { it.componentName }, generatorMeta.map { it.componentName })
        themeBuilderMeta.zip(generatorMeta).forEach { (themeBuilder, generator) ->
            val expected = themeBuilderGroups(themeBuilder).map { it.first().id to it.size }
            val actual = generator.params.filter { it.deprecated == null }.groupBy { it.id }
                .map { it.key to it.value.size }
            assertEquals(expected, actual, "Свойства ${generator.componentName}")
        }
    }

    @Test
    fun `non-colour overload selection matches Theme Builder for every property`() {
        var checked = 0
        themeBuilderMeta.zip(generatorMeta).forEach { (themeBuilder, generator) ->
            val ours = generator.params.filter { it.deprecated == null }.groupBy { it.id }
            themeBuilderGroups(themeBuilder).filter { it.first() !is ComposeColorPropertyMeta }.forEach { group ->
                // Значение не влияет на выбор не-цветового свойства: берём любой Stateful, например цвет.
                val expected = group.selectOverload(SolidColor("any")).choice()
                val actual = ours.getValue(group.first().id).selectOverload().nonColourChoice()
                assertEquals(expected, actual, "${generator.componentName}.${group.first().id}")
                checked++
            }
        }
        assertTrue(checked > 900, "Проверено слишком мало свойств: $checked")
    }

    @Test
    fun `colour overload selection matches Theme Builder for solid and gradient values`() {
        var solid = 0
        var gradient = 0
        themeBuilderMeta.zip(generatorMeta).forEach { (themeBuilder, generator) ->
            val ours = generator.params.filter { it.deprecated == null }.groupBy { it.id }
            themeBuilderGroups(themeBuilder).filter { it.first() is ComposeColorPropertyMeta }.forEach { group ->
                val id = group.first().id
                val name = "${generator.componentName}.$id"
                val candidates = ours.getValue(id)

                assertEquals(
                    group.selectOverload(SolidColor("any")).choice(),
                    candidates.selectSolidColorOverload().choice(),
                    "solid $name",
                )
                solid++

                val themeBuilderGradient = group.selectOverload(Gradient("any")).choice()
                val brush = candidates.selectBrushOverload()
                if (brush != null) {
                    assertEquals(themeBuilderGradient, brush.choice(), "gradient $name")
                } else {
                    // Нет перегрузки с Brush: Theme Builder откатывается на все перегрузки, мы пропускаем градиент.
                    assertTrue(candidates.none { it.acceptsBrush }, "gradient $name")
                }
                gradient++
            }
        }
        assertTrue(solid > 300 && gradient == solid, "Проверено цветовых свойств: $solid")
    }
}
