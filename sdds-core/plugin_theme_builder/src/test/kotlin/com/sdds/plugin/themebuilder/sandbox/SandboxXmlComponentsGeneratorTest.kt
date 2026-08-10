package com.sdds.plugin.themebuilder.sandbox

import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class SandboxXmlComponentsGeneratorTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate для xml v1 создает view provider и components`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = XmlComponentsGenerator(
            config = configWithViewButton(),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V1,
        )

        generator.generate()

        assertTrue(packageDir.resolve("TestThemeButtonVariationsView.kt").exists())
        assertTrue(packageDir.resolve("TestThemeViewComponents.kt").exists())
    }

    @Test
    fun `generate для xml v2 создает view provider и components`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = XmlComponentsGenerator(
            config = configWithViewButton(),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V2,
        )

        generator.generate()

        assertTrue(packageDir.resolve("TestThemeButtonVariationsView.kt").exists())
        assertTrue(packageDir.resolve("TestThemeViewComponents.kt").exists())
    }

    private fun configWithViewButton(): Config {
        return Config(
            name = "TestTheme",
            packageName = "com.test.theme",
            components = listOf(
                Component(
                    key = "button",
                    coreName = "BasicButton",
                    styleName = "Button",
                    variations = listOf(
                        VariationInfo(
                            name = "default",
                            viewOverlayReference = "Button.Default",
                        ),
                    ),
                ),
            ),
        )
    }
}