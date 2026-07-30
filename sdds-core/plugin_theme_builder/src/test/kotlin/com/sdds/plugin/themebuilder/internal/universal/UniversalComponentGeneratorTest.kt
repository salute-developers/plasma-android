package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ApiMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ComponentIdentity
import com.sdds.plugin.themebuilder.internal.universal.view.ComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewMetaIndex
import io.mockk.mockk
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Test
import java.io.File

/**
 * Сведение компонента конфига темы с метой uikit: реестра компонентов нет, имя в мете
 * выводится из ключа компонента.
 */
class UniversalComponentGeneratorTest {

    private val deps = mockk<StyleGeneratorDependencies>(relaxed = true)
    private val configFile = File("nonexistent.json")

    @Test
    fun `component without meta is skipped for both targets`() {
        val generator = generator(composeNames = listOf("Avatar"), viewNames = listOf("Avatar"))
        val component = Component(componentName = "unknown-component", styleName = "Unknown", config = "c.json")

        assertNull(generator.generateCompose(configFile, deps, component))
        assertNull(generator.generateView(configFile, deps, component))
    }

    @Test
    fun `component key is resolved to the meta name`() {
        val generator = generator(composeNames = listOf("BasicButton"), viewNames = emptyList())
        val component = Component(componentName = "basic-button", styleName = "BasicButton", config = "c.json")

        // Мета найдена — генератор дошёл до чтения конфига, которого нет.
        assertThrows(Exception::class.java) { generator.generateCompose(configFile, deps, component) }
        // View-меты нет — цель пропускается.
        assertNull(generator.generateView(configFile, deps, component))
    }

    @Test
    fun `historical key mismatch is resolved through the alias`() {
        val generator = generator(composeNames = listOf("ModalBottomSheet"), viewNames = emptyList())
        val component = Component(componentName = "bottom-sheet", styleName = "BottomSheet", config = "c.json")

        assertThrows(Exception::class.java) { generator.generateCompose(configFile, deps, component) }
    }

    @Test
    fun `excluded platform is not generated even when meta exists`() {
        val generator = generator(composeNames = listOf("Avatar"), viewNames = listOf("Avatar"))
        val component = Component(
            componentName = "avatar",
            styleName = "Avatar",
            config = "c.json",
            excludePlatforms = listOf("compose", "view-system"),
        )

        assertNull(generator.generateCompose(configFile, deps, component))
        assertNull(generator.generateView(configFile, deps, component))
    }

    private fun generator(
        composeNames: List<String>,
        viewNames: List<String>,
    ) = UniversalComponentGenerator(
        allMeta = composeNames.map {
            ComposeComponentMeta(
                componentName = it,
                qualifiedName = "com.test.${it}StyleBuilder",
                resolvedTypes = emptyList(),
                params = emptyList(),
            )
        },
        viewIndex = ViewMetaIndex(
            ApiMeta(
                components = viewNames.map {
                    ComponentMeta(
                        componentNames = listOf(it),
                        styleableName = it,
                        identity = mapOf(it to ComponentIdentity(it, "sd_${it}Style", "Sdds.Components.$it")),
                        params = emptyList(),
                    )
                },
            ),
        ),
        allComponents = emptyList(),
    )
}
