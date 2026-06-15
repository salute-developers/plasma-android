package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class SddsThemeSourceReaderTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `reader uses alias or name and directoryPath`() {
        val projectDir = temporaryFolder.root
        createConfig(
            projectDir,
            """
                {
                  "tenants": [
                    {
                      "name": "base",
                      "alias": "BaseAlias",
                      "directoryPath": "custom/base"
                    },
                    {
                      "name": "tenant_one",
                      "alias": "TenantAlias",
                      "directoryPath": "custom/tenant"
                    }
                  ]
                }
            """.trimIndent(),
        )
        createTenantFiles(projectDir.resolve("custom/base"))
        createTenantFiles(projectDir.resolve("custom/tenant"))

        val result = SddsThemeSourceReader(projectDir).read()

        assertEquals("BaseAlias", result.baseAlias)
        assertEquals(listOf("", "TenantAlias"), result.sources.map { it.tenant })
        assertEquals(listOf("BaseAlias", "TenantAlias"), result.sources.map { it.themeName })
        assertEquals(
            listOf(projectDir.resolve("custom/base"), projectDir.resolve("custom/tenant")),
            result.sources.map { (it as ThemeBuilderSource.LocalDirectory).directory },
        )
        assertEquals(projectDir.resolve(".sdds/tenants/palette.json"), result.paletteFile)
    }

    @Test
    fun `reader uses palettePath when it is present`() {
        val projectDir = temporaryFolder.root
        createConfig(
            projectDir,
            """
                {
                  "palettePath": "custom/palette.json",
                  "tenants": [
                    {
                      "name": "base"
                    }
                  ]
                }
            """.trimIndent(),
        )
        projectDir.resolve("custom/palette.json").apply {
            parentFile.mkdirs()
            writeText("{}")
        }
        createTenantFiles(projectDir.resolve(".sdds/base"))

        val result = SddsThemeSourceReader(projectDir).read()

        assertEquals(projectDir.resolve("custom/palette.json"), result.paletteFile)
    }

    @Test
    fun `reader uses fallback tenant directory when directoryPath is missing`() {
        val projectDir = temporaryFolder.root
        createConfig(
            projectDir,
            """
                {
                  "tenants": [
                    {
                      "name": "base"
                    },
                    {
                      "name": "tenant_one"
                    }
                  ]
                }
            """.trimIndent(),
        )
        createTenantFiles(projectDir.resolve(".sdds/base"))
        createTenantFiles(projectDir.resolve(".sdds/tenant_one"))

        val result = SddsThemeSourceReader(projectDir).read()

        assertEquals(listOf("", "tenant_one"), result.sources.map { it.tenant })
        assertEquals(
            listOf(projectDir.resolve(".sdds/base"), projectDir.resolve(".sdds/tenant_one")),
            result.sources.map { (it as ThemeBuilderSource.LocalDirectory).directory },
        )
    }

    @Test
    fun `resolver returns explicit sources before reading sdds config`() {
        val explicitSources = ThemeBuilderSources(
            baseAlias = "Explicit",
            sources = listOf(ThemeBuilderSource.withNameAndVersion("remote", "1.0.0", "Explicit")),
        )

        val result = ThemeSourceResolver(temporaryFolder.root).resolve(explicitSources)

        assertSame(explicitSources, result)
    }

    @Test
    fun `reader fails when config is missing`() {
        val error = assertFailsWithThemeBuilderException {
            SddsThemeSourceReader(temporaryFolder.root).read()
        }

        assertTrue(error.message.orEmpty().contains("themeSource(s) or .sdds/config.json must be provided"))
    }

    @Test
    fun `reader fails when tenants are empty`() {
        val projectDir = temporaryFolder.root
        createConfig(projectDir, """{ "tenants": [] }""")

        val error = assertFailsWithThemeBuilderException {
            SddsThemeSourceReader(projectDir).read()
        }

        assertTrue(error.message.orEmpty().contains(".sdds/config.json must contain at least one tenant"))
    }

    @Test
    fun `reader resolves tenant directory when required files are missing`() {
        val projectDir = temporaryFolder.root
        createConfig(
            projectDir,
            """
                {
                  "tenants": [
                    {
                      "name": "base"
                    }
                  ]
                }
            """.trimIndent(),
        )
        val tenantDir = projectDir.resolve(".sdds/base")

        val result = SddsThemeSourceReader(projectDir).read()

        assertEquals(listOf(tenantDir), result.sources.map { (it as ThemeBuilderSource.LocalDirectory).directory })
    }

    @Test
    fun `reader resolves palette path when palette file is missing`() {
        val projectDir = temporaryFolder.root
        createConfig(
            projectDir,
            """
                {
                  "palettePath": "missing/palette.json",
                  "tenants": [
                    {
                      "name": "base"
                    }
                  ]
                }
            """.trimIndent(),
        )
        createTenantFiles(projectDir.resolve(".sdds/base"))

        val result = SddsThemeSourceReader(projectDir).read()

        assertEquals(projectDir.resolve("missing/palette.json"), result.paletteFile)
    }

    private fun createConfig(projectDir: File, content: String) {
        projectDir.resolve(".sdds").mkdirs()
        projectDir.resolve(".sdds/config.json").writeText(content)
        projectDir.resolve(".sdds/tenants/palette.json").apply {
            parentFile.mkdirs()
            writeText("{}")
        }
    }

    private fun createTenantFiles(directory: File) {
        directory.resolve("android").mkdirs()
        directory.resolve("meta.json").writeText("{}")
        tokenFileNames.forEach {
            directory.resolve("android/$it").writeText("{}")
        }
    }

    private fun assertFailsWithThemeBuilderException(block: () -> Unit): ThemeBuilderException {
        return try {
            block()
            error("Expected ThemeBuilderException")
        } catch (exception: ThemeBuilderException) {
            exception
        }
    }

    private companion object {
        val tokenFileNames = listOf(
            "android_color.json",
            "android_gradient.json",
            "android_typography.json",
            "android_fontFamily.json",
            "android_shape.json",
            "android_shadow.json",
            "android_spacing.json",
        )
    }
}
