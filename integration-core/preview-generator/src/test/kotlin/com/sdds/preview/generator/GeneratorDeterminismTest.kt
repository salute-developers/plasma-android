package com.sdds.preview.generator

import java.io.File
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GeneratorDeterminismTest {
    private val meta = readApiMeta(
        File(requireNotNull(System.getProperty("preview.api.meta.jar")) { "Нет preview.api.meta.jar" }),
    ).sortedBy { it.componentName }

    private fun generateInto(directory: File): Map<String, String> {
        FactoryGenerator(meta).generate(directory)
        return directory.walkTopDown().filter { it.isFile }
            .associate { it.relativeTo(directory).path to it.readText() }
    }

    @Test
    fun `two runs on the same meta produce identical sources`() {
        val first = generateInto(Files.createTempDirectory("factories-a").toFile())
        val second = generateInto(Files.createTempDirectory("factories-b").toFile())

        assertEquals(first.keys, second.keys)
        first.forEach { (path, content) -> assertEquals(content, second.getValue(path), "Файл $path") }
    }

    @Test
    fun `one factory file per meta component plus the registry`() {
        val files = generateInto(Files.createTempDirectory("factories-c").toFile())

        assertEquals(meta.size + 1, files.size)
        assertTrue(files.keys.any { it.endsWith("GeneratedPreviewStyleFactories.kt") })
        meta.forEach { component ->
            assertTrue(
                files.keys.any { it.endsWith("${component.componentName}PreviewStyleFactory.kt") },
                "Нет фабрики ${component.componentName}",
            )
        }
    }

    @Test
    fun `registry lists every component in alphabetical order`() {
        val files = generateInto(Files.createTempDirectory("factories-d").toFile())
        val registry = files.entries.single { it.key.endsWith("GeneratedPreviewStyleFactories.kt") }.value

        val pattern = Regex("\"(\\w+)\" to \\w+PreviewStyleFactory")
        val listed = pattern.findAll(registry).map { it.groupValues[1] }.toList()

        assertEquals(meta.map { it.componentName }, listed)
    }
}
