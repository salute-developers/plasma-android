package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentInfo
import com.sdds.plugin.themebuilder.internal.components.ConfigInfo
import com.sdds.plugin.themebuilder.internal.components.VariationInfo
import com.sdds.plugin.themebuilder.internal.components.VariationReference
import com.sdds.plugin.themebuilder.internal.components.componentDelegates
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.squareup.kotlinpoet.ClassName
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import io.mockk.verify
import kotlinx.serialization.decodeFromString
import org.gradle.testfixtures.ProjectBuilder
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class GenerateComponentsTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Before
    fun setUp() {
        mockkStatic(COMPONENT_DELEGATES_KT)
        every {
            componentDelegates(any(), any())
        } returns emptyMap<String, ComponentConfigDelegate<*>>()
    }

    @After
    fun tearDown() {
        unmockkStatic(COMPONENT_DELEGATES_KT)
    }

    @Test
    fun `generate при пустом meta не создает config info файлы`() {
        val (task, projectDir) = createConfigureTask()
        task.generate()

        assertFalse(projectDir.resolve(".sdds/config-info-compose.json").exists())
        assertFalse(projectDir.resolve(".sdds/config-info-view-system.json").exists())
    }

    @Test
    fun `generate при включенном componentsMetaStyleClass и пустом meta не падает`() {
        val (task, projectDir) = createConfigureTask(
            componentsMetaStyleClass = true,
        )
        task.generate()

        assertFalse(projectDir.resolve(".sdds/config-info-compose.json").exists())
        assertFalse(projectDir.resolve(".sdds/config-info-view-system.json").exists())
    }

    @Test
    fun `generate при componentsMetaStyleClass true и compose componentInfo создает kt файл`() {
        val componentInfo = composeComponentInfo()
        mockComponentDelegates()
        mockComposeDelegateResult(componentInfo)

        val (task, projectDir) = createConfigureTask(
            target = ThemeBuilderTarget.COMPOSE,
            componentsMetaStyleClass = true,
            componentsJson = componentsJson(),
        )
        task.generate()

        val generatedFile = projectDir
            .resolve("build/generated/theme-builder")
            .walkTopDown()
            .filter { it.isFile && it.extension == "kt" }
            .toList()

        generatedFile.single()

        assertTrue(generatedFile.isNotEmpty())
    }

    @Test
    fun `generate при target view_system не создает config info файлы`() {
        val (task, projectDir) = createConfigureTask(target = ThemeBuilderTarget.VIEW_SYSTEM)
        task.generate()

        assertFalse(projectDir.resolve(".sdds/config-info-compose.json").exists())
        assertFalse(projectDir.resolve(".sdds/config-info-view-system.json").exists())
    }

    @Test
    fun `generate при target compose и fromResources true не падает`() {
        val (task, projectDir) = createConfigureTask(
            dimensionsConfig = DimensionsConfig(fromResources = true),
        )
        task.generate()

        assertFalse(projectDir.resolve(".sdds/config-info-compose.json").exists())
        assertFalse(projectDir.resolve(".sdds/config-info-view-system.json").exists())
    }

    @Test
    fun `generate при target compose и несуществующем uikitMetaFile не падает`() {
        val (task, projectDir) = createConfigureTask()
        task.uikitApiMetaFile.set(projectDir.resolve("missing-uikit-meta.json"))

        task.generate()

        assertFalse(projectDir.resolve(".sdds/config-info-compose.json").exists())
        assertFalse(projectDir.resolve(".sdds/config-info-view-system.json").exists())
    }

    @Test
    fun `generate при неизвестном компоненте не создает config info файлы compose`() {
        val projectDir = temporaryFolder.root
        val componentsDir = temporaryFolder.newFolder("components")
        createComponentsMetaFile(
            componentsDir = componentsDir,
            componentsJson = """
                [
                  { 
                  "componentName": "UnknownComponent",
                   "styleName": "UnknownStyle",
                   "config": "unknown.json"
                  }
                ]
            """.trimIndent(),
        )
        componentsDir.resolve("unknown.json").writeText("{}")
        val task = createGenerateComponentsTask(projectDir)

        configureTask(
            task = task,
            componentsDir = componentsDir,
            target = ThemeBuilderTarget.COMPOSE,
        )
        task.generate()

        assertFalse(projectDir.resolve(".sdds/config-info-compose.json").exists())
        assertFalse(projectDir.resolve(".sdds/config-info-view-system.json").exists())
    }

    @Test
    fun `generate при неизвестном компоненте не создает config info файлы view system`() {
        val projectDir = temporaryFolder.root
        val componentsDir = temporaryFolder.newFolder("components")
        createComponentsMetaFile(
            componentsDir = componentsDir,
            componentsJson = """
                [
                  { 
                  "componentName": "UnknownComponent",
                   "styleName": "UnknownStyle",
                   "config": "unknown.json"
                  }
                ]
            """.trimIndent(),
        )
        componentsDir.resolve("unknown.json").writeText("{}")
        val task = createGenerateComponentsTask(projectDir)

        configureTask(
            task = task,
            componentsDir = componentsDir,
            target = ThemeBuilderTarget.VIEW_SYSTEM,
        )
        task.generate()

        assertFalse(projectDir.resolve(".sdds/config-info-compose.json").exists())
        assertFalse(projectDir.resolve(".sdds/config-info-view-system.json").exists())
    }

    @Test
    fun `generate при target view_system записывает config info если delegate вернул componentInfo`() {
        val componentInfo = viewSystemComponentInfo()
        mockComponentDelegates()
        mockViewDelegateResult(componentInfo)

        val (task, projectDir) = createConfigureTask(
            target = ThemeBuilderTarget.VIEW_SYSTEM,
            componentsJson = componentsJson(),
        )

        task.generate()

        val configInfo = readViewConfigInfo(projectDir)

        assertEquals("TestTheme", configInfo.name)
        assertEquals("com.test", configInfo.packageName)
        assertEquals(listOf(componentInfo), configInfo.components)

        verify(exactly = 1) {
            componentsDelegate.generateViewSystemStyles(
                any(),
                any(),
                any(),
            )
        }
        verify(exactly = 0) {
            componentsDelegate.generateComposeStyles(any(), any(), any())
        }
    }

    @Test
    fun `generate при target compose записывает config info если delegate вернул componentInfo`() {
        val componentInfo = composeComponentInfo()
        mockComponentDelegates()
        mockComposeDelegateResult(componentInfo)

        val (task, projectDir) = createConfigureTask(
            target = ThemeBuilderTarget.COMPOSE,
            componentsJson = componentsJson(),
        )

        task.generate()
        val configInfo = readComposeConfigInfo(projectDir)

        val actualComponent = configInfo.components.single()

        assertEquals("TestTheme", configInfo.name)
        assertEquals("com.test", configInfo.packageName)
        assertEquals(TEST_COMPONENT_NAME, actualComponent.key)
        assertEquals("TestComponent", actualComponent.coreName)
        assertEquals("TestStyle", actualComponent.styleName)
        assertEquals(componentInfo.variations, actualComponent.variations)

        assertNotNull(actualComponent.styleApi)

        verify(exactly = 1) {
            componentsDelegate.generateComposeStyles(
                file = any(),
                deps = any(),
                component = any(),
            )
        }
        verify(exactly = 0) {
            componentsDelegate.generateViewSystemStyles(any(), any(), any())
        }
    }

    private fun composeComponentInfo(
        key: String = TEST_COMPONENT_NAME,
    ): ComponentInfo {
        return ComponentInfo(
            key = key,
            appearance = "Default",
            coreName = "TestComponent",
            styleName = "TestStyle",
            styleClassName = ClassName("com.test.component", "TestComponentStyle"),
            styleBuilderClassName = ClassName("com.test.component", "TestComponentStyleBuilder"),
            componentPackage = "com.test.component",
            variations = listOf(
                VariationInfo(
                    name = "default",
                    composeReference = VariationReference("TestComponentDefault.defaultStyle"),
                ),
            ),
        )
    }

    private fun viewSystemComponentInfo(
        key: String = TEST_COMPONENT_NAME,
    ): ComponentInfo {
        return ComponentInfo(
            key = key,
            coreName = "TestComponent",
            styleName = "TestStyle",
            variations = listOf(
                VariationInfo(
                    name = "default",
                    viewReference = VariationReference("@style/TestComponent.Default"),
                ),
            ),
        )
    }

    private fun componentsJson(
        componentName: String = TEST_COMPONENT_NAME,
        styleName: String = "TestStyle",
        config: String = "test.json",
    ): String {
        return """
            [
              {
                "componentName": "$componentName",
                "styleName": "$styleName",
                "config": "$config"
              }
            ] 
        """.trimIndent()
    }

    private fun mockComponentDelegates(
        componentName: String = TEST_COMPONENT_NAME,
        delegate: ComponentConfigDelegate<*> = componentsDelegate,
    ) {
        every {
            componentDelegates(any(), any())
        } returns mapOf(componentName to delegate)
    }

    private fun mockViewDelegateResult(
        componentInfo: ComponentInfo = viewSystemComponentInfo(),
    ) {
        every {
            componentsDelegate.generateViewSystemStyles(any(), any(), any())
        } returns componentInfo
    }

    private fun mockComposeDelegateResult(
        componentInfo: ComponentInfo = composeComponentInfo(),
    ) {
        every {
            componentsDelegate.generateComposeStyles(any(), any(), any())
        } returns componentInfo
    }

    private fun readViewConfigInfo(projectDir: File): ConfigInfo {
        return Serializer.configInfo.decodeFromString(
            projectDir.resolve(".sdds/config-info-view-system.json").readText(),
        )
    }

    private fun readComposeConfigInfo(projectDir: File): ConfigInfo {
        return Serializer.configInfo.decodeFromString(
            projectDir.resolve(".sdds/config-info-compose.json").readText(),
        )
    }

    private val componentsDelegate = mockk<ComponentConfigDelegate<*>>(relaxed = true)

    private companion object {
        const val TEST_COMPONENT_NAME = "test-component"
        const val COMPONENT_DELEGATES_KT =
            "com.sdds.plugin.themebuilder.internal.components.ComponentDelegatesKt"
    }

    private fun createComponentsMetaFile(
        componentsDir: File,
        componentsJson: String,
    ) {
        componentsDir.resolve("meta.json").writeText(
            """
              {
                "name": "TestTheme",
                "version": "1.0.0",
                "components": $componentsJson
              }
            """.trimIndent(),
        )
    }

    private fun createGenerateComponentsTask(
        projectDir: File,
    ): GenerateComponentsTask {
        val project = ProjectBuilder.builder()
            .withProjectDir(projectDir)
            .build()
        return project.tasks.create("generateComponents", GenerateComponentsTask::class.java)
    }

    private fun configureTask(
        task: GenerateComponentsTask,
        componentsDir: File,
        target: ThemeBuilderTarget = ThemeBuilderTarget.COMPOSE,
        componentsMetaStyleClass: Boolean = false,
        dimensionsConfig: DimensionsConfig = DimensionsConfig(),
    ) {
        task.componentsDir.set(componentsDir)
        task.projectDir.set(task.project.layout.projectDirectory)
        task.outputDirPath.set("build/generated/theme-builder")
        task.outputResDirPath.set("build/generated/theme-builder-res")
        task.packageName.set("com.test")
        task.namespace.set("com.test")
        task.dimensionsConfig.set(dimensionsConfig)
        task.resourcesPrefixConfig.set(
            ResourcePrefixConfig(
                resourcePrefix = "test",
                shouldGenerateResPrefixStyle = false,
            ),
        )
        task.themeName.set("TestTheme")
        task.target.set(target)
        task.componentsMetaStyleClass.set(componentsMetaStyleClass)
    }

    private fun createConfigureTask(
        target: ThemeBuilderTarget = ThemeBuilderTarget.COMPOSE,
        componentsMetaStyleClass: Boolean = false,
        dimensionsConfig: DimensionsConfig = DimensionsConfig(),
        componentsJson: String = "[]",
    ): Pair<GenerateComponentsTask, File> {
        val projectDir = temporaryFolder.root
        val componentsDir = temporaryFolder.newFolder("components")

        createComponentsMetaFile(
            componentsDir = componentsDir,
            componentsJson = componentsJson,
        )

        componentsDir.resolve("test.json").writeText("{}")

        val task = createGenerateComponentsTask(projectDir)

        configureTask(
            task = task,
            componentsDir = componentsDir,
            target = target,
            componentsMetaStyleClass = componentsMetaStyleClass,
            dimensionsConfig = dimensionsConfig,
        )
        return task to projectDir
    }
}
