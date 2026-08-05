package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class GenerateThemeTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate падает если colorFiles count не совпадает с themeTenants count`() {
        val (task, _) = createConfigureTask(
            tenants = listOf("", "dark"),
            colorFiles = listOf(temporaryFolder.newFile("colors.json")),
        )
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "colorFiles count and themeTenants count must be the same",
            exception.message,
        )
    }

    @Test
    fun `generate падает если gradientFiles count не совпадает с themeTenants count`() {
        val (task, _) = createConfigureTask(
            tenants = listOf("", "dark"),
            gradientFiles = listOf(temporaryFolder.newFile("gradients.json")),
        )
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "gradientFiles count and themeTenants count must be the same",
            exception.message,
        )
    }

    @Test
    fun `generate падает если fontFiles count не совпадает с themeTenants count`() {
        val (task, _) = createConfigureTask(
            tenants = listOf("", "dark"),
            fontFiles = listOf(temporaryFolder.newFile("fonts.json")),
        )
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "fontFiles count and themeTenants count must be the same",
            exception.message,
        )
    }

    @Test
    fun `generate падает если typographyFiles count не совпадает с themeTenants count`() {
        val (task, _) = createConfigureTask(
            tenants = listOf("", "dark"),
            typographyFiles = listOf(temporaryFolder.newFile("typography.json")),
        )
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "typographyFiles count and themeTenants count must be the same",
            exception.message,
        )
    }

    @Test
    fun `generate падает если shapeFiles count не совпадает с themeTenants count`() {
        val (task, _) = createConfigureTask(
            tenants = listOf("", "dark"),
            shapeFiles = listOf(temporaryFolder.newFile("shapes.json")),
        )
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "shapeFiles count and themeTenants count must be the same",
            exception.message,
        )
    }

    @Test
    fun `generate падает если shadowFiles count не совпадает с themeTenants count`() {
        val (task, _) = createConfigureTask(
            tenants = listOf("", "dark"),
            shadowFiles = listOf(temporaryFolder.newFile("shadows.json")),
        )
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "shadowFiles count and themeTenants count must be the same",
            exception.message,
        )
    }

    @Test
    fun `generate падает если spacingFiles count не совпадает с themeTenants count`() {
        val (task, _) = createConfigureTask(
            tenants = listOf("", "dark"),
            spacingFiles = listOf(temporaryFolder.newFile("spacing.json")),
        )
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "spacingFiles count and themeTenants count must be the same",
            exception.message,
        )
    }

    @Test
    fun `generate падает если metaFile не существует`() {
        val (task, themeDir) = createConfigureTask(tenants = listOf(""))

        val missingMetaFile = themeDir.resolve("missing-meta.json")
        task.metaFile.set(missingMetaFile)
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals("Required theme file is missing: ${missingMetaFile.path}", exception.message)
    }

    @Test
    fun `generate падает если color файла не существует`() {
        val (task, themeDir) = createConfigureTask(tenants = listOf(""))
        createMetaFile(themeDir)

        val missingColorFile = themeDir.resolve("missing-colors.json")
        task.colorFiles.setFrom(missingColorFile)

        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals("Required theme file is missing: ${missingColorFile.path}", exception.message)
    }

    @Test
    fun `generate читает токен файлы default tenant и падает если paletteFile не существует`() {
        val (task, themeDir) = createConfigureTask(tenants = listOf(""))
        createMetaFile(themeDir)

        createEmptyThemeFiles(task.colorFiles.files)
        createEmptyThemeFiles(task.gradientFiles.files)
        createEmptyThemeFiles(task.fontFiles.files)
        createEmptyThemeFiles(task.typographyFiles.files)
        createEmptyThemeFiles(task.shapeFiles.files)
        createEmptyThemeFiles(task.shadowFiles.files)
        createEmptyThemeFiles(task.spacingFiles.files)

        val missingPaletteFile = themeDir.resolve("missing-palette.json")
        task.paletteFile.set(missingPaletteFile)

        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "Required palette file is missing: ${missingPaletteFile.path}",
            exception.message,
        )
    }

    @Test
    fun `generate падает если нет default tenant`() {
        val (task, themeDir) = createConfigureTask(
            tenants = listOf("dark"),
        )
        createMetaFile(themeDir)
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals("Theme must have default tenant", exception.message)
    }

    @Test
    fun `generate читает colors для tenant и падает если tenant gradient не существует`() {
        val missingDarkGradientFile = temporaryFolder.root.resolve("missing-dark-gradients.json")

        val (task, themeDir) = createConfigureTask(
            tenants = listOf("", "dark"),
            colorFiles = listOf(
                createJsonFile("default-colors.json", """{"primary": "#FFFFFF"}"""),
                createJsonFile("dark-colors.json", """{"primary": "#000000"}"""),
            ),
            gradientFiles = listOf(
                createJsonFile("default-gradients.json"),
                missingDarkGradientFile,
            ),
            fontFiles = listOf(
                createJsonFile("default-fonts.json"),
                temporaryFolder.root.resolve("dark-fonts.json"),
            ),
            typographyFiles = listOf(
                createJsonFile("default-typography.json"),
                temporaryFolder.root.resolve("dark-typography.json"),
            ),
            shapeFiles = listOf(
                createJsonFile("default-shapes.json"),
                temporaryFolder.root.resolve("dark-shapes.json"),
            ),
            shadowFiles = listOf(
                createJsonFile("default-shadows.json"),
                temporaryFolder.root.resolve("dark-shadows.json"),
            ),
            spacingFiles = listOf(
                createJsonFile("default-spacings.json"),
                temporaryFolder.root.resolve("dark-spacings.json"),
            ),
        )
        createMetaFile(themeDir)

        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "Required theme file is missing: ${missingDarkGradientFile.path}",
            exception.message,
        )
    }

    @Test
    fun `generate читает token файлы tenant и падает если tenant spacing не существует`() {
        val missingDarkSpacingFile = temporaryFolder.root.resolve("missing-dark-spacing.json")

        val (task, themeDir) = createConfigureTask(
            tenants = listOf("", "dark"),
            colorFiles = listOf(
                createJsonFile("default-colors.json"),
                createJsonFile("dark-colors.json"),
            ),
            gradientFiles = listOf(
                createJsonFile("default-gradients.json"),
                createJsonFile("dark-gradients.json"),
            ),
            fontFiles = listOf(
                createJsonFile("default-fonts.json"),
                createJsonFile("dark-fonts.json"),
            ),
            typographyFiles = listOf(
                createJsonFile("default-typography.json"),
                createJsonFile("dark-typography.json"),
            ),
            shapeFiles = listOf(
                createJsonFile("default-shapes.json"),
                createJsonFile("dark-shapes.json"),
            ),
            shadowFiles = listOf(
                createJsonFile("default-shadows.json"),
                createJsonFile("dark-shadows.json"),
            ),
            spacingFiles = listOf(
                createJsonFile("spacings.json"),
                missingDarkSpacingFile,
            ),
        )
        createMetaFile(themeDir)
        val exception = assertThrows(ThemeBuilderException::class.java) {
            task.generate()
        }

        assertEquals(
            "Required theme file is missing: ${missingDarkSpacingFile.path}",
            exception.message,
        )
    }

    @Test
    fun `generate при пустых валидных файлах создает генераторы`() {
        val (task, themeDir) = createConfigureTask(
            tenants = listOf(""),
            colorFiles = listOf(createJsonFile("colors.json")),
            gradientFiles = listOf(createJsonFile("gradients.json")),
            fontFiles = listOf(createJsonFile("fonts.json")),
            typographyFiles = listOf(createJsonFile("typography.json")),
            shapeFiles = listOf(createJsonFile("shapes.json")),
            shadowFiles = listOf(createJsonFile("shadows.json")),
            spacingFiles = listOf(createJsonFile("spacings.json")),
        )
        createMetaFile(themeDir)
        createPaletteFile(themeDir)

        task.generate()

        assertTrue(temporaryFolder.root.resolve(".sdds/theme-info-compose.json").exists())
    }

    @Test
    fun `generate обрабатывает color token из meta`() {
        val (task, themeDir) = createConfigureTask(
            tenants = listOf(""),
            colorFiles = listOf(
                createJsonFile(
                    "colors.json",
                    """{"dark.text.primary": "#FFFFFF"}""",
                ),
            ),
            gradientFiles = listOf(createJsonFile("gradients.json")),
            fontFiles = listOf(createJsonFile("fonts.json")),
            typographyFiles = listOf(createJsonFile("typography.json")),
            shapeFiles = listOf(createJsonFile("shapes.json")),
            shadowFiles = listOf(createJsonFile("shadows.json")),
            spacingFiles = listOf(createJsonFile("spacing.json")),
        )
        task.metaFile.fileValue(createColorMetaFile(themeDir))
        task.paletteFile.fileValue(createPaletteFile(themeDir))

        task.generate()

        assertTrue(temporaryFolder.root.resolve(".sdds/theme-info-compose.json").exists())
        assertTrue(
            temporaryFolder.root.resolve(".sdds/theme-info-compose.json").readText().isNotBlank(),
        )
    }

    @Test
    fun `generate обрабатывает spacing token из meta`() {
        val (task, themeDir) = createConfigureTask(
            tenants = listOf(""),
            colorFiles = listOf(createJsonFile("colors.json")),
            gradientFiles = listOf(createJsonFile("gradients.json")),
            fontFiles = listOf(createJsonFile("fonts.json")),
            typographyFiles = listOf(createJsonFile("typography.json")),
            shapeFiles = listOf(createJsonFile("shapes.json")),
            shadowFiles = listOf(createJsonFile("shadows.json")),
            spacingFiles = listOf(
                createJsonFile(
                    "spacing.json",
                    """{"spacing.1x": {"value": 2.0}}""",
                ),
            ),
        )
        task.metaFile.fileValue(createSpacingMetaFile(themeDir))
        task.paletteFile.fileValue(createPaletteFile(themeDir))

        task.generate()

        assertTrue(temporaryFolder.root.resolve(".sdds/theme-info-compose.json").exists())
        assertTrue(
            temporaryFolder.root.resolve(".sdds/theme-info-compose.json").readText().isNotBlank(),
        )
    }

    private fun createConfigureTask(
        tenants: List<String> = listOf(""),
        colorFiles: List<File> = tenantFiles(tenants, "colors"),
        gradientFiles: List<File> = tenantFiles(tenants, "gradients"),
        fontFiles: List<File> = tenantFiles(tenants, "fonts"),
        typographyFiles: List<File> = tenantFiles(tenants, "typography"),
        shapeFiles: List<File> = tenantFiles(tenants, "shapes"),
        shadowFiles: List<File> = tenantFiles(tenants, "shadows"),
        spacingFiles: List<File> = tenantFiles(tenants, "spacings"),
        ignoreDisabledTokens: Boolean = false,
    ): Pair<GenerateThemeTask, File> {
        val projectDir = temporaryFolder.root
        val themeDir = temporaryFolder.newFolder("theme")
        val task = createGenerateThemeTask(projectDir)

        configureTask(
            task = task,
            themeDir = themeDir,
            tenants = tenants,
            colorFiles = colorFiles,
            gradientFiles = gradientFiles,
            fontFiles = fontFiles,
            typographyFiles = typographyFiles,
            shapeFiles = shapeFiles,
            shadowFiles = shadowFiles,
            spacingFiles = spacingFiles,
            ignoreDisabledTokens = ignoreDisabledTokens,
        )
        return task to themeDir
    }

    private fun createGenerateThemeTask(projectDir: File): GenerateThemeTask {
        val project = ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()

        return project.tasks.create("generateTheme", GenerateThemeTask::class.java)
    }

    private fun configureTask(
        task: GenerateThemeTask,
        themeDir: File,
        tenants: List<String>,
        colorFiles: List<File>,
        gradientFiles: List<File>,
        fontFiles: List<File>,
        typographyFiles: List<File>,
        shapeFiles: List<File>,
        shadowFiles: List<File>,
        spacingFiles: List<File>,
        ignoreDisabledTokens: Boolean,
    ) {
        task.themeName.set("test_theme")
        task.paletteFile.set(themeDir.resolve("palette.json"))
        task.themeTenants.set(tenants)
        task.metaFile.set(themeDir.resolve("meta.json"))

        task.colorFiles.setFrom(colorFiles)
        task.gradientFiles.setFrom(gradientFiles)
        task.fontFiles.setFrom(fontFiles)
        task.typographyFiles.setFrom(typographyFiles)
        task.shapeFiles.setFrom(shapeFiles)
        task.shadowFiles.setFrom(shadowFiles)
        task.spacingFiles.setFrom(spacingFiles)

        task.packageName.set("com.test")
        task.namespace.set("com.test")
        task.resourcesPrefixConfig.set(
            ResourcePrefixConfig(
                resourcePrefix = "test",
                shouldGenerateResPrefixStyle = false,
            ),
        )
        task.viewThemeParents.set(emptyList())
        task.viewShapeAppearanceConfig.set(emptyList())
        task.generatorMode.set(ThemeBuilderMode.THEME)
        task.target.set(ThemeBuilderTarget.COMPOSE)
        task.projectDir.set(task.project.layout.projectDirectory)
        task.outputDirPath.set("build/generated/theme-builder")
        task.outputResDirPath.set("build/generated/theme-builder/res")
        task.dimensionsConfig.set(DimensionsConfig())
        task.defaultThemeTypography.set(DefaultThemeTypography.DYNAMIC)
        task.ignoreDisabledTokens.set(ignoreDisabledTokens)
        task.useDefaultFonts.set(false)
    }

    private fun createMetaFile(themeDir: File) {
        themeDir.resolve("meta.json").writeText(
            """
            {
            "name": "TestTheme",
            "version": "1.0.0",
            "tokens": []
            }
            """.trimIndent(),
        )
    }

    private fun tenantFiles(
        tenants: List<String>,
        fileType: String,
    ): List<File> {
        return tenants.map { tenant ->
            temporaryFolder.root.resolve("${tenant}_$fileType.json")
        }
    }

    private fun createJsonFile(
        fileName: String,
        content: String = "{}",
    ): File {
        return temporaryFolder.newFile(fileName).apply {
            writeText(content)
        }
    }

    private fun createPaletteFile(themeDir: File): File {
        return themeDir.resolve("palette.json").apply {
            writeText("{}")
        }
    }

    private fun createEmptyThemeFiles(files: Collection<File>) {
        files.forEach { file ->
            file.parentFile?.mkdirs()
            file.writeText("{}")
        }
    }

    private fun createColorMetaFile(themeDir: File): File {
        return themeDir.resolve("meta.json").apply {
            writeText(
                """
                {
                  "name": "TestTheme", 
                  "version": "1.0.0", 
                  "tokens": [
                    {
                  "type": "color",
                  "name": "dark.text.primary",
                  "tags": ["dark", "text", "primary"],
                  "displayName": "textPrimary",
                  "description": "Text primary",
                  "enabled": true
                    }
                  ]
                }
                """.trimIndent(),
            )
        }
    }

    private fun createSpacingMetaFile(themeDir: File): File {
        return themeDir.resolve("meta.json").apply {
            writeText(
                """
                {
                "name": "TestTheme",
                "version": "1.0.0",
                "tokens": [
                   { 
                     "type": "spacing",
                     "name": "spacing.1x",
                     "tags": ["spacing"],
                     "displayName": "spacing1x",
                     "description": "Spacing 1x",
                     "enabled": true
                   }
                 ]
               }
                """.trimIndent(),
            )
        }
    }
}
