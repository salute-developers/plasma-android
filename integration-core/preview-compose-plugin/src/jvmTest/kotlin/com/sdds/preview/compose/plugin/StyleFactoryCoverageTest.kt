package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.sandbox.StoryRegistry
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Сверяет три набора: компоненты `uikit-compose-api-meta.json`, сгенерированные фабрики стилей и истории реестра.
 * Расхождение, которого нет в [storiesWithoutPreview], роняет тест.
 */
class StyleFactoryCoverageTest {
    /** Истории без компонента меты: `ComponentKey.value` на причину. */
    private val storiesWithoutPreview = mapOf(
        "Icon" to "стиль NoStyle: у иконки нет настраиваемого стиля",
        "Text" to "стиль NoStyle: у текста нет настраиваемого стиля",
        "IconTabs" to "компонента IconTabs нет в мете, стиль TabsStyle принадлежит компоненту Tabs",
        "Mask" to "компонента Mask нет в мете, стиль TextFieldStyle принадлежит TextField и TextArea",
    )

    private val metaStyles: Map<String, String> = run {
        val text = requireNotNull(
            javaClass.classLoader.getResource("sdds/api/uikit-compose-api-meta.json"),
        ) { "Нет ресурса api-меты на classpath" }.readText()
        Json.parseToJsonElement(text).jsonArray.associate {
            val component = it.jsonObject
            component.getValue("componentName").jsonPrimitive.content to
                component.getValue("styleQualifiedName").jsonPrimitive.content
        }
    }

    private val factories = GeneratedPreviewStyleFactories.all

    @BeforeTest
    fun register() {
        StoryRegistry.clear()
        registerStories()
    }

    @Test
    fun `every api meta component has a generated factory and nothing else does`() {
        assertEquals(metaStyles.keys, factories.keys)
    }

    @Test
    fun `factory builds the style class named in the api meta`() {
        metaStyles.forEach { (name, style) ->
            assertEquals(style, factories.getValue(name).styleQualifiedName, "Стиль фабрики $name")
        }
    }

    @Test
    fun `every api meta component has a story and its style class matches the factory`() {
        val entries = StoryRegistry.previewEntries().associateBy { it.componentId }

        assertEquals(metaStyles.keys, entries.keys)
        entries.forEach { (id, entry) ->
            assertEquals(
                factories.getValue(id).styleQualifiedName,
                entry.styleQualifiedName,
                "Класс стиля истории и фабрики $id",
            )
        }
    }

    @Test
    fun `stories outside the preview registry are exactly the documented exclusions`() {
        val previewKeys = StoryRegistry.previewEntries().map { it.story.component }.toSet()
        val excluded = StoryRegistry.registeredStories().map { it.component }.filterNot { it in previewKeys }

        assertEquals(storiesWithoutPreview.keys, excluded.map { it.value }.toSet())
    }

    @Test
    fun `every nested style type is built by some factory`() {
        val builtStyles = factories.values.map { it.styleQualifiedName }.toSet()

        factories.forEach { (name, factory) ->
            factory.nestedStyleTypes.forEach { (property, style) ->
                assertTrue(style in builtStyles, "$name.$property ожидает $style, которого не строит ни одна фабрика")
            }
        }
    }
}
