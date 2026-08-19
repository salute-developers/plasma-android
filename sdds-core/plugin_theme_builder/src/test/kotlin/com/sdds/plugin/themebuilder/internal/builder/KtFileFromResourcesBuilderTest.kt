package com.sdds.plugin.themebuilder.internal.builder

import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.ByteArrayOutputStream

class KtFileFromResourcesBuilderTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `buildFromResource записывает resource в stream`() {
        val output = ByteArrayOutputStream()
        val underTest = KtFileFromResourcesBuilder("com.test.generated")

        underTest.buildFromResource(
            inputRes = "theme-outputs/ThemeOutputKt.txt",
            outputLocation = KtFileBuilder.OutputLocation.Stream(output),
            outputFileName = "CopiedTheme",
        )

        val result = output.toString()
        assertTrue(result.contains("package com.test.generated"))
        assertTrue(result.contains("TestTheme"))
    }

    @Test
    fun `buildFromResource записывает resource в directory`() {
        val outputDir = temporaryFolder.newFolder("generated")
        outputDir.resolve("com/test/generated").mkdirs()
        val underTest = KtFileFromResourcesBuilder("com.test.generated")

        underTest.buildFromResource(
            inputRes = "theme-outputs/ThemeOutputKt.txt",
            outputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
            outputFileName = "CopiedTheme",
        )

        val resultFile = outputDir.resolve("com/test/generated/CopiedTheme.kt")
        assertTrue(resultFile.isFile)
        assertTrue(resultFile.readText().contains("package com.test.generated"))
        assertTrue(resultFile.readText().contains("TestTheme"))
    }
}
