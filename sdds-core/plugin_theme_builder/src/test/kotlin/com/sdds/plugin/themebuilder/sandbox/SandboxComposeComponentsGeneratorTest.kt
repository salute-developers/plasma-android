package com.sdds.plugin.themebuilder.sandbox

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class SandboxComposeComponentsGeneratorTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate для compose v1 создает provider components но не создает register theme`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = ComposeComponentsGenerator(
            config = Config(
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
                                composeReference = "Button.Default",
                            ),
                        ),
                    ),
                ),
            ),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V1,
            themeAlias = "TestTheme",
            multiplatform = false,
        )

        generator.generate()

        assertTrue(packageDir.resolve("TestThemeButtonVariationsCompose.kt").exists())
        assertTrue(packageDir.resolve("TestThemeComposeComponents.kt").exists())
        assertFalse(packageDir.resolve("TestThemeRegisterTheme.kt").exists())
    }

    @Test
    fun `generate для compose v2 создает provider components и register theme`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = ComposeComponentsGenerator(
            config = Config(
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
                                composeReference = "Button.Default",
                            ),
                        ),
                    ),
                ),
            ),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V2,
            themeAlias = "TestTheme",
            multiplatform = false,
        )

        generator.generate()

        assertTrue(packageDir.resolve("TestThemeButtonVariationsCompose.kt").exists())
        assertTrue(packageDir.resolve("TestThemeComposeComponents.kt").exists())
        assertTrue(packageDir.resolve("TestThemeRegisterTheme.kt").exists())
    }

    @Test
    fun `generate использует правильный core style class`() {
        assertGeneratedCoreStyleClass(
            coreName = "BasicButton",
            expectedStyleClass = "ButtonStyle",
        )
        assertGeneratedCoreStyleClass(
            coreName = "TextArea",
            expectedStyleClass = "TextFieldStyle",
        )
        assertGeneratedCoreStyleClass(
            coreName = "IconBadge",
            expectedStyleClass = "BadgeStyle",
        )
        assertGeneratedCoreStyleClass(
            coreName = "BottomSheet",
            expectedStyleClass = "ModalBottomSheetStyle",
        )
        assertGeneratedCoreStyleClass(
            coreName = "TabItem",
            expectedStyleClass = "TabItemStyle",
        )
        assertGeneratedCoreStyleClass(
            coreName = "Card",
            expectedStyleClass = "CardStyle",
        )
    }

    @Test
    fun `generate для styleApi params создает binding declarations`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = ComposeComponentsGenerator(
            config = Config(
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
                                composeReference = "Button.Default",
                            ),
                        ),
                        styleApi = StyleApiInfo(
                            stylesClassName = "ButtonStyles",
                            receiverClassName = "ButtonStyles.Companion",
                            returnTypeQualifiedName = "com.test.theme.styles.button.ButtonStyles",
                            params = listOf(
                                StyleApiParam(
                                    name = "disabled",
                                    type = "boolean",
                                    defaultValue = StyleApiValue(
                                        value = "false",
                                        codeName = "false",
                                    ),
                                ),
                                StyleApiParam(
                                    name = "size",
                                    type = "enum",
                                    typeQualifiedName = "com.test.theme.Size",
                                    defaultValue = StyleApiValue(
                                        value = "medium",
                                        codeName = "Medium",
                                    ),
                                    values = listOf(
                                        StyleApiValue(
                                            value = "small",
                                            codeName = "Small",
                                        ),
                                        StyleApiValue(
                                            value = "medium",
                                            codeName = "Medium",
                                        ),
                                    ),
                                ),
                            ),
                        ),
                    ),
                ),
            ),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V2,
            themeAlias = "TestTheme",
            multiplatform = false,
        )

        generator.generate()

        val generatedFile = packageDir.resolve("TestThemeButtonVariationsCompose.kt")
        val content = generatedFile.readText()

        assertTrue(content.contains("ButtonStyles"))
        assertTrue(content.contains("disabled"))
        assertTrue(content.contains("false"))
        assertTrue(content.contains("size"))
        assertTrue(content.contains("Size.Medium"))
        assertTrue(content.contains("Size.Small"))
    }

    @Test
    fun `generate для compose v2 multiplatform создает register theme из cmp template`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = ComposeComponentsGenerator(
            config = Config(
                name = "TestTheme",
                packageName = "com.test.theme",
                components = listOf(
                    Component(
                        key = "Button",
                        coreName = "BasicButton",
                        styleName = "Button",
                        variations = listOf(
                            VariationInfo(
                                name = "default",
                                composeReference = "Button.Default",
                            ),
                        ),
                    ),
                ),
            ),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V2,
            themeAlias = "TestTheme",
            multiplatform = true,
        )
        generator.generate()

        val registerThemeFile = packageDir.resolve("TestThemeRegisterTheme.kt")
        assertTrue(registerThemeFile.exists())

        val content = registerThemeFile.readText()

        assertTrue(content.contains("fun registerTheme("))
        assertFalse(content.contains("SandboxActivity.registerTheme"))
        assertFalse(content.contains("import com.sdds.compose.sandbox.ui.SandboxActivity"))
    }

    @Test
    fun `generate падает если styleApi param без defaultValue и values`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = ComposeComponentsGenerator(
            config = Config(
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
                                composeReference = "Button.Default",
                            ),
                        ),
                        styleApi = StyleApiInfo(
                            stylesClassName = "ButtonStyles",
                            receiverClassName = "ButtonStyles.Companion",
                            returnTypeQualifiedName = "com.test.theme.styles.button.ButtonStyles",
                            params = listOf(
                                StyleApiParam(
                                    name = "size",
                                    type = "enum",
                                    typeQualifiedName = "com.test.theme.Size",
                                    defaultValue = null,
                                    values = emptyList(),
                                ),
                            ),
                        ),
                    ),
                ),
            ),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V2,
            themeAlias = "TestTheme",
            multiplatform = false,
        )

        val exception = assertThrows(IllegalStateException::class.java) {
            generator.generate()
        }
        assertEquals(
            "Style API param `size` has no defaultValue and no values",
            exception.message,
        )
    }

    @Test
    fun `generate для styleApi без optional values использует fallback значения`() {
        val packageDir = temporaryFolder.newFolder("generated")

        val generator = ComposeComponentsGenerator(
            config = configWithStyleApiFallbacks(),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V2,
            themeAlias = "TestTheme",
            multiplatform = false,
        )

        generator.generate()

        val content = packageDir
            .resolve("TestThemeButtonVariationsCompose.kt")
            .readText()

        assertTrue(content.contains("import com.sdds.compose.uikit.ButtonStyle"))
        assertTrue(content.contains("disabled"))
        assertTrue(content.contains("false"))
        assertTrue(content.contains("ButtonStyles"))
        assertTrue(content.contains("resolve"))
        assertTrue(content.contains("Small"))
    }

    private fun configWithStyleApiFallbacks(): Config {
        return Config(
            name = "TestTheme",
            packageName = "com.test.theme",
            components = listOf(
                Component(
                    key = "button",
                    coreName = "BasicButton",
                    styleName = "Button",
                    variations = listOf(defaultVariation()),
                    styleApi = StyleApiInfo(
                        stylesClassName = "ButtonStyles",
                        receiverClassName = "",
                        returnTypeQualifiedName = "",
                        params = listOf(
                            StyleApiParam(
                                name = "disabled",
                                type = "boolean",
                                defaultValue = null,
                            ),
                            StyleApiParam(
                                name = "size",
                                type = "enum",
                                typeQualifiedName = "",
                                defaultValue = null,
                                values = listOf(
                                    StyleApiValue(
                                        value = "small",
                                        codeName = "Small",
                                    ),
                                ),
                            ),
                        ),
                    ),
                ),
            ),
        )
    }

    private fun defaultVariation(): VariationInfo {
        return VariationInfo(
            name = "default",
            composeReference = "Button.Default",
        )
    }


    private fun assertGeneratedCoreStyleClass(
        coreName: String,
        expectedStyleClass: String,
    ) {
        val packageDir = temporaryFolder.newFolder("generated-$coreName")

        val generator = ComposeComponentsGenerator(
            config = Config(
                name = "TestTheme",
                packageName = "com.test.theme",
                components = listOf(
                    Component(
                        key = coreName,
                        coreName = coreName,
                        styleName = coreName,
                        variations = listOf(
                            VariationInfo(
                                name = "default",
                                composeReference = "$coreName.Default",
                            ),
                        ),
                    ),
                ),
            ),
            packageName = "com.test.sandbox",
            packageDir = packageDir,
            scheme = SandboxScheme.V2,
            themeAlias = "TestTheme",
            multiplatform = false,
        )

        generator.generate()

        val generatedFile = packageDir.resolve("TestTheme${coreName}VariationsCompose.kt")

        assertTrue(generatedFile.exists())
        assertTrue(generatedFile.readText().contains(expectedStyleClass))
    }
}
