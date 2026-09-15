package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class SddsComponentsSourceReaderTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `reader строит LocalDirectory на sdds components с именем из meta json`() {
        val projectDir = temporaryFolder.root
        createComponentsMeta(
            sddsDirectory = projectDir.resolve(".sdds"),
            content = """{ "name": "PlasmaComponents", "version": "1.0.0", "components": [] }""",
        )

        val result = SddsComponentsSourceReader(projectDir.resolve(".sdds")).read() as ThemeBuilderSource.LocalDirectory

        assertEquals(projectDir.resolve(".sdds/components"), result.directory)
        assertEquals("PlasmaComponents", result.themeName)
    }

    @Test
    fun `reader fails when sdds components is missing`() {
        val error = assertFailsWithThemeBuilderException {
            SddsComponentsSourceReader(temporaryFolder.root.resolve(".sdds")).read()
        }

        assertTrue(error.message.orEmpty().contains("componentSource or components/meta.json must be provided"))
    }

    @Test
    fun `reader fails when meta json is missing`() {
        val projectDir = temporaryFolder.root
        projectDir.resolve(".sdds/components").mkdirs()

        val error = assertFailsWithThemeBuilderException {
            SddsComponentsSourceReader(projectDir.resolve(".sdds")).read()
        }

        assertTrue(error.message.orEmpty().contains("Missing file"))
    }

    @Test
    fun `reader читает components из custom sdds directory`() {
        val projectDir = temporaryFolder.root
        val customSdds = projectDir.resolve("metadata/sdds")
        createComponentsMeta(
            sddsDirectory = customSdds,
            content = """{ "name": "CustomComponents", "version": "2.0.0", "components": [] }""",
        )

        val result = SddsComponentsSourceReader(customSdds).read() as ThemeBuilderSource.LocalDirectory

        assertEquals(customSdds.resolve("components"), result.directory)
        assertEquals("CustomComponents", result.themeName)
    }

    private fun createComponentsMeta(sddsDirectory: File, content: String) {
        sddsDirectory.resolve("components").mkdirs()
        sddsDirectory.resolve("components/meta.json").writeText(content)
    }

    private fun assertFailsWithThemeBuilderException(block: () -> Unit): ThemeBuilderException {
        return try {
            block()
            error("Expected ThemeBuilderException")
        } catch (exception: ThemeBuilderException) {
            exception
        }
    }
}
