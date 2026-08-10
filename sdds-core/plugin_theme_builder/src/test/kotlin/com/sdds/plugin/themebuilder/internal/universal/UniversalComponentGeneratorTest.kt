package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ApiMeta
import com.sdds.plugin.themebuilder.internal.universal.view.COLOR_STATE_SCOPE_VARIETY
import com.sdds.plugin.themebuilder.internal.universal.view.ComponentIdentity
import com.sdds.plugin.themebuilder.internal.universal.view.ComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewMetaIndex
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import io.mockk.every
import io.mockk.mockk
import org.gradle.api.file.DirectoryProperty
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

/**
 * Сведение компонента конфига темы с метой uikit: реестра компонентов нет, имя в мете
 * выводится из ключа компонента.
 */
class UniversalComponentGeneratorTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

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

    @Test
    fun `generateCompose возвращает component info если compose meta найдена`() {
        val component = Component(
            componentName = "button",
            styleName = "PrimaryButton",
            config = "button.json",
        )
        val generator = universalGenerator(
            composeMetas = listOf(
                composeMeta(
                    componentName = "Button",
                    packageName = "widgets",
                    builderFunName = "createButtonStyle",
                ),
            ),
            allComponents = listOf(component),
        )

        val result = requireNotNull(
            generator.generateCompose(emptyConfigFile(), testDeps(), component),
        )

        assertEquals("button", result.key)
        assertEquals("PrimaryButton", result.appearance)
        assertEquals("Button", result.coreName)
        assertEquals("PrimaryButton", result.styleName)
        assertEquals("com.test.styles.widgets", result.componentPackage)
        assertEquals("com.test.ButtonStyle", result.styleClassName.toString())
        assertEquals("com.test.ButtonStyleBuilder", result.styleBuilderClassName.toString())
    }

    @Test
    fun `generateCompose использует packageName компонента если packageName в meta пустой`() {
        val component = Component(
            componentName = "button",
            styleName = "Button",
            config = "button.json",
        )
        val generator = universalGenerator(
            composeMetas = listOf(
                composeMeta(
                    componentName = "Button",
                    packageName = "",
                    builderFunName = "",
                ),
            ),
            allComponents = listOf(component),
        )

        val result = requireNotNull(
            generator.generateCompose(emptyConfigFile(), testDeps(), component),
        )

        assertEquals("com.test.styles.button", result.componentPackage)
    }

    @Test
    fun `generateView возвращает component info если view meta найдена`() {
        val component = Component(
            componentName = "avatar",
            styleName = "Avatar",
            config = "avatar.json",
        )
        val generator = universalGenerator(
            viewMetas = listOf(
                viewMeta(
                    componentName = "Avatar",
                    identity = ComponentIdentity(
                        coreName = "Avatar",
                        defStyleAttr = "sd_avatarStyle",
                        parent = "Sdds.Components.Avatar",
                        styleName = "CustomAvatar",
                        colorStateScope = COLOR_STATE_SCOPE_VARIETY,
                    ),
                ),
            ),
            allComponents = listOf(component),
        )

        val result = requireNotNull(
            generator.generateView(emptyConfigFile(), testDeps(), component),
        )

        assertEquals("avatar", result.key)
        assertEquals("Avatar", result.appearance)
        assertEquals("Avatar", result.coreName)
        assertEquals("CustomAvatar", result.styleName)
        assertEquals("default", result.variations.single().name)
    }

    @Test
    fun `generateView использует styleName компонента если styleName в meta пустой`() {
        val component = Component(
            componentName = "avatar",
            styleName = "avatar-primary",
            config = "avatar.json",
        )
        val generator = universalGenerator(
            viewMetas = listOf(
                viewMeta(
                    componentName = "Avatar",
                    identity = ComponentIdentity(
                        coreName = "Avatar",
                        defStyleAttr = "sd_avatarStyle",
                        parent = "Sdds.Components.Avatar",
                        styleName = "",
                    ),
                ),
            ),
            allComponents = listOf(
                component,
                Component(
                    componentName = "unknown-component",
                    styleName = "unknown-style",
                    config = "unknown.json",
                ),
            ),
        )

        val result = requireNotNull(
            generator.generateView(emptyConfigFile(), testDeps(), component),
        )

        assertEquals("AvatarPrimary", result.styleName)
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

    private fun universalGenerator(
        composeMetas: List<ComposeComponentMeta> = emptyList(),
        viewMetas: List<ComponentMeta> = emptyList(),
        allComponents: List<Component> = emptyList(),
    ) = UniversalComponentGenerator(
        allMeta = composeMetas,
        viewIndex = ViewMetaIndex(ApiMeta(components = viewMetas)),
        allComponents = allComponents,
    )

    private fun composeMeta(
        componentName: String,
        packageName: String = "",
        builderFunName: String = "",
    ) = ComposeComponentMeta(
        componentName = componentName,
        qualifiedName = "com.test.${componentName}StyleBuilder",
        resolvedTypes = emptyList(),
        params = emptyList(),
        packageName = packageName,
        builderFunName = builderFunName,
    )

    private fun viewMeta(
        componentName: String,
        identity: ComponentIdentity = ComponentIdentity(
            coreName = componentName,
            defStyleAttr = "sd_${componentName}Style",
            parent = "Sdds.Components.$componentName",
        ),
    ) = ComponentMeta(
        componentNames = listOf(componentName),
        styleableName = componentName,
        identity = mapOf(componentName to identity),
        params = emptyList(),
    )

    private fun emptyConfigFile(): File {
        return temporaryFolder.newFile().apply {
            writeText("{}")
        }
    }

    private fun testDeps(): StyleGeneratorDependencies {
        val packageResolver = PackageResolver("com.test")
        val outputDir = temporaryFolder.newFolder("kt")
        val outputResDir = temporaryFolder.newFolder("res")
        val resourcePrefixConfig = ResourcePrefixConfig(
            resourcePrefix = "thmbldr",
            shouldGenerateResPrefixStyle = true,
        )
        val xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme")
        val ktFileBuilder = mockk<KtFileBuilder>(relaxed = true)
        val ktFileBuilderFactory = mockk<KtFileBuilderFactory> {
            every { create(any<String>(), any<String>()) } returns ktFileBuilder
            every { create(any<String>(), any<TargetPackage>()) } returns ktFileBuilder
        }

        return StyleGeneratorDependencies(
            outputResDir = outputResDir,
            outputDir = outputDir,
            projectDir = mockk<DirectoryProperty>(relaxed = true),
            ktFileBuilderFactory = ktFileBuilderFactory,
            xmlBuilderFactory = xmlBuilderFactory,
            themeClassName = "TestTheme",
            packageResolver = packageResolver,
            namespace = "com.test",
            dimensionsConfig = DimensionsConfig(fromResources = false, multiplier = 1f),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
            resourcePrefixConfig = resourcePrefixConfig,
            viewColorStateGeneratorFactory = ViewColorStateGeneratorFactory(
                ktFileBuilderFactory = ktFileBuilderFactory,
                xmlBuilderFactory = xmlBuilderFactory,
                outputResDir = outputResDir,
                colorStateOutputLocation = KtFileBuilder.OutputLocation.Directory(outputDir),
                resourcePrefixConfig = resourcePrefixConfig,
                namespace = "com.test",
                packageResolver = packageResolver,
            ),
            colorStateListGeneratorFactory = ColorStateListGeneratorFactory(
                xmlBuilderFactory = xmlBuilderFactory,
                resourcePrefixConfig = resourcePrefixConfig,
                outputResDir = outputResDir,
            ),
            target = ThemeBuilderTarget.ALL,
        )
    }
}
