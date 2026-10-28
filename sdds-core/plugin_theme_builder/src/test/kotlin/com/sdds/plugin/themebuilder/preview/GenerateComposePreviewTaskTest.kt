package com.sdds.plugin.themebuilder.preview

import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class GenerateComposePreviewTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    private val sampleComponents = listOf("AvatarGroup", "BasicButton", "CheckBox", "Tabs")

    @Test
    fun `вывод совпадает с эталонными файлами`() {
        val output = generate(metaJar())

        val expected = goldenFiles()
        assertEquals(expected.keys, relativeFiles(output))
        expected.forEach { (path, golden) ->
            assertEquals("Файл $path отличается от эталона", golden, File(output, path).readText())
        }
    }

    @Test
    fun `каждая запись меты даёт фабрику и попадает в реестр и список компонентов`() {
        val output = generate(metaJar())

        val registry = File(output, "com/sdds/preview/compose/generated/GeneratedPreviewStyleFactories.kt").readText()
        val listed = File(output, PREVIEW_COMPONENTS_FILE).readLines().filter { it.isNotBlank() }
        assertEquals(sampleComponents, listed)
        sampleComponents.forEach { name ->
            assertTrue(File(output, "com/sdds/preview/compose/generated/${name}PreviewStyleFactory.kt").isFile)
            assertTrue("В реестре нет $name", "\"$name\" to ${name}PreviewStyleFactory" in registry)
        }
    }

    @Test
    fun `генерация детерминирована`() {
        val meta = metaJar()

        val first = generate(meta).let { dir -> relativeFiles(dir).associateWith { File(dir, it).readText() } }
        val second = generate(meta).let { dir -> relativeFiles(dir).associateWith { File(dir, it).readText() } }

        assertEquals(first, second)
    }

    @Test
    fun `ограничение набора компонентов`() {
        val output = generate(metaJar(), components = "CheckBox, Tabs")

        val listed = File(output, PREVIEW_COMPONENTS_FILE).readLines().filter { it.isNotBlank() }
        assertEquals(listOf("CheckBox", "Tabs"), listed)
        assertTrue(!File(output, "com/sdds/preview/compose/generated/BasicButtonPreviewStyleFactory.kt").exists())
    }

    @Test
    fun `неизвестный компонент в фильтре роняет задачу`() {
        try {
            generate(metaJar(), components = "CheckBox,Missing")
            fail("Ожидалась ошибка")
        } catch (expected: Exception) {
            assertTrue(expected.message.orEmpty().contains("Missing"))
        }
    }

    @Test
    fun `мета недоступна - ошибка с путём ресурса`() {
        val empty = temporaryFolder.newFile("empty.jar").also { file ->
            ZipOutputStream(file.outputStream()).use {
                it.putNextEntry(ZipEntry("other.txt"))
                it.closeEntry()
            }
        }
        try {
            generate(empty)
            fail("Ожидалась ошибка")
        } catch (expected: Exception) {
            val message = generateSequence<Throwable>(expected) { it.cause }.mapNotNull { it.message }.joinToString()
            assertTrue(message, message.contains("uikit-compose-api-meta.json") && message.contains("empty.jar"))
        }
    }

    private fun generate(meta: File, components: String? = null): File {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.newFolder()).build()
        val output = temporaryFolder.newFolder()
        val task = project.tasks.register("generateComposePreview", GenerateComposePreviewTask::class.java).get()
        task.metaClasspath.from(meta)
        components?.let { task.components.set(it) }
        task.outputDirectory.set(output)
        task.generate()
        return output
    }

    private fun metaJar(): File {
        val sample = requireNotNull(
            javaClass.classLoader.getResource("preview/uikit-compose-api-meta-sample.json"),
        ).readText()
        val jar = temporaryFolder.newFile("uikit-compose.jar")
        ZipOutputStream(jar.outputStream()).use { zip ->
            zip.putNextEntry(ZipEntry("sdds/api/uikit-compose-api-meta.json"))
            zip.write(sample.toByteArray())
            zip.closeEntry()
        }
        return jar
    }

    private fun relativeFiles(directory: File): Set<String> =
        directory.walkTopDown().filter { it.isFile }.map { it.relativeTo(directory).invariantSeparatorsPath }.toSet()

    private fun goldenFiles(): Map<String, String> {
        val root = File(requireNotNull(javaClass.classLoader.getResource("preview/golden")).toURI())
        return root.walkTopDown().filter { it.isFile }.associate {
            it.relativeTo(root).invariantSeparatorsPath.removeSuffix(".txt") to it.readText()
        }
    }
}
