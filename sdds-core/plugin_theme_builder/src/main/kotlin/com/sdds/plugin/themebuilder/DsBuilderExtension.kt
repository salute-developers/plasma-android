@file:Suppress("CompanionObjectInEnd", "UnnecessaryAbstractClass")

package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.sandbox.SandboxScheme
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.SetProperty
import org.gradle.kotlin.dsl.newInstance
import javax.inject.Inject

/**
 * Public configuration entry point of the Design System Builder plugin.
 *
 * [sddsDirectory] defaults to `.sdds` in the current project and then to
 * `.sdds` in its immediate parent project. An explicit value always wins.
 */
abstract class DsBuilderExtension @Inject constructor(
    objects: ObjectFactory,
) {

    /** Shared directory containing DS Builder metadata. */
    abstract val sddsDirectory: DirectoryProperty

    /** Standard DS Builder configuration at `.sdds/config.json`. */
    abstract val configFile: RegularFileProperty

    /** Kotlin package shared by theme and component generation. */
    abstract val packageName: Property<String>

    /** Android resource prefix shared by theme and component generation. */
    abstract val resourcePrefix: Property<String>

    /** Android UI targets shared by theme and component generation. */
    abstract val targets: SetProperty<DsBuilderPlatform>

    /** Parents shared by generated View themes and components. */
    abstract val viewThemeParents: SetProperty<ViewThemeParent>

    /** Shape mappings shared by generated View themes and components. */
    abstract val viewShapeAppearance: SetProperty<ShapeAppearanceConfig>

    /** Output location shared by theme and component generation. */
    abstract val outputLocation: Property<OutputLocation>

    /** Dimension settings shared by theme and component generation. */
    abstract val dimensions: Property<DimensionsConfig>

    /** Whether shared Compose generation targets a multiplatform source set. */
    abstract val multiplatform: Property<Boolean>

    /** Theme generation settings. */
    val theme: ThemeCapability = objects.newInstance()

    /** Component generation settings. */
    val components: ComponentsCapability = objects.newInstance()

    /** Android documentation aggregation settings. */
    val documentation: DocumentationCapability = objects.newInstance()

    /** Sandbox adapter generation settings. */
    val sandbox: SandboxCapability = objects.newInstance()

    init {
        targets.convention(emptySet())
        viewThemeParents.convention(emptySet())
        viewShapeAppearance.convention(emptySet())
        outputLocation.convention(OutputLocation.BUILD)
        dimensions.convention(DimensionsConfig())
        multiplatform.convention(false)

        listOf(theme, components).forEach { capability ->
            capability.packageName.convention(packageName)
            capability.resourcesPrefix.convention(resourcePrefix)
            capability.targets.convention(targets)
            capability.viewThemeParents.convention(viewThemeParents)
            capability.viewShapeAppearance.convention(viewShapeAppearance)
            capability.outputLocation.convention(outputLocation)
            capability.dimensions.convention(dimensions)
            capability.multiplatform.convention(multiplatform)
        }
        sandbox.outputLocation.convention(outputLocation)
    }

    /** Enables Compose generation for both theme and components. */
    fun compose(multiplatform: Boolean = false) {
        targets.add(DsBuilderPlatform.COMPOSE)
        this.multiplatform.set(multiplatform)
    }

    /** Enables View generation for both theme and components. */
    fun view(action: ViewConfigBuilder.() -> Unit = {}) {
        val builder = ViewConfigBuilder().apply(action)
        targets.add(DsBuilderPlatform.VIEW)
        viewThemeParents.set(builder.themeParents)
        viewShapeAppearance.set(builder.shapeAppearanceConfig)
    }

    /** Configures dimensions for both theme and components. */
    fun dimensions(action: DimensionsConfigBuilder.() -> Unit) {
        dimensions.set(DimensionsConfigBuilder().apply(action).build())
    }

    /** Enables and configures theme generation. */
    fun theme(action: Action<in ThemeCapability>) {
        theme.enabled.set(true)
        action.execute(theme)
    }

    /** Enables and configures component generation. */
    fun components(action: Action<in ComponentsCapability>) {
        components.enabled.set(true)
        action.execute(components)
    }

    /** Enables and configures documentation aggregation. */
    fun documentation(action: Action<in DocumentationCapability>) {
        documentation.enabled.set(true)
        action.execute(documentation)
        documentation.compose?.applyInfoConventions(DsBuilderPlatform.COMPOSE)
        documentation.view?.applyInfoConventions(DsBuilderPlatform.VIEW)
    }

    /** Enables and configures sandbox adapter generation. */
    fun sandbox(action: Action<in SandboxCapability>) {
        sandbox.enabled.set(true)
        action.execute(sandbox)
        sandbox.compose?.applyComponentsInfoConvention(DsBuilderPlatform.COMPOSE)
        sandbox.view?.applyComponentsInfoConvention(DsBuilderPlatform.VIEW)
    }

    internal companion object {
        fun Project.dsBuilderExt(): DsBuilderExtension {
            val extension = extensions.create("dsBuilder", DsBuilderExtension::class.java)
            extension.sddsDirectory.convention(
                layout.dir(
                    providers.provider {
                        SddsDirectoryResolver(projectDir, parent?.projectDir).resolveOrNull()
                    },
                ),
            )
            extension.configFile.convention(extension.sddsDirectory.file("config.json"))
            extension.documentation.outputDirectory.convention(extension.sddsDirectory.dir("temp/docs"))
            extension.documentation.userDocumentationRoot.convention(
                project.layout.projectDirectory.dir("override-docs"),
            )
            return extension
        }
    }

    private fun DocumentationPlatform.applyInfoConventions(platform: DsBuilderPlatform) {
        componentsInfoFile.convention(sddsDirectory.file(platform.componentsInfoName))
        themeInfoFile.convention(sddsDirectory.file(platform.themeInfoName))
    }

    private fun SandboxPlatform.applyComponentsInfoConvention(platform: DsBuilderPlatform) {
        componentsInfoFile.convention(sddsDirectory.file(platform.componentsInfoName))
    }
}

/** Settings shared by a lazily activated capability. */
abstract class DsBuilderCapability {
    /** Whether this capability was activated by its DSL block. */
    abstract val enabled: Property<Boolean>

    init {
        enabled.convention(false)
    }
}

/**
 * Theme generation settings.
 *
 * Existing theme generator options will be exposed by this composed model as
 * the legacy task registration is adapted to the new DSL.
 */
abstract class ThemeCapability : GenerationCapability() {
    /** Explicit theme sources. `.sdds/config.json` is used when absent. */
    internal abstract val sources: Property<ThemeBuilderSources>

    /** Palette URL used by remote theme sources. */
    abstract val paletteUrl: Property<String>

    /** Theme generator mode. */
    abstract val mode: Property<ThemeBuilderMode>

    /** Whether generation is attached to Android `preBuild`. */
    abstract val autoGenerate: Property<Boolean>

    /** Default typography strategy used by generated themes. */
    abstract val defaultTypography: Property<DefaultThemeTypography>

    /** Whether disabled tokens are omitted. */
    abstract val ignoreDisabledTokens: Property<Boolean>

    /** Whether Compose font tokens use the platform default family. */
    abstract val useDefaultFonts: Property<Boolean>

    init {
        paletteUrl.convention(DEFAULT_PALETTE_URL)
        mode.convention(ThemeBuilderMode.TOKENS_ONLY)
        autoGenerate.convention(true)
        defaultTypography.convention(DefaultThemeTypography.DYNAMIC)
        ignoreDisabledTokens.convention(false)
        useDefaultFonts.convention(false)
    }

    /** Configures one remote theme source. */
    fun source(name: String, version: String = ThemeSourceBuilder.VERSION_LATEST, alias: String = name) {
        sources.set(
            ThemeBuilderSources(
                baseAlias = alias,
                sources = listOf(ThemeBuilderSource.withNameAndVersion(name, version, alias)),
            ),
        )
    }

    /** Configures one remote theme source by URL. */
    fun source(url: String, name: String) {
        sources.set(
            ThemeBuilderSources(
                baseAlias = name,
                sources = listOf(ThemeBuilderSource.withUrl(url, name)),
            ),
        )
    }

    /** Configures all tenant variations of one theme. */
    fun sources(baseAlias: String = "", action: ThemeSourcesBuilder.() -> Unit) {
        val builder = ThemeSourcesBuilder(baseAlias).apply(action)
        require(builder.defaultSourceWasDefined) {
            "Default source must be defined when using multitenant mode"
        }
        sources.set(ThemeBuilderSources(baseAlias, builder.sources))
    }

    private companion object {
        const val DEFAULT_PALETTE_URL =
            "https://raw.githubusercontent.com/salute-developers/plasma/dev/packages/plasma-colors/palette/general.json"
    }
}

/**
 * Component generation settings.
 *
 * Existing component generator options will be exposed by this composed model
 * as the legacy task registration is adapted to the new DSL.
 */
abstract class ComponentsCapability : GenerationCapability() {
    /** Remote component configuration source. */
    internal abstract val source: Property<ThemeBuilderSource>

    /** Whether generated Compose metadata includes style classes. */
    abstract val componentsMetaStyleClass: Property<Boolean>

    init {
        componentsMetaStyleClass.convention(false)
    }

    /** Configures a component source by name and version. */
    fun source(name: String, version: String = ThemeSourceBuilder.VERSION_LATEST, alias: String = name) {
        source.set(ThemeBuilderSource.withNameAndVersion(name, version, alias))
    }

    /** Configures a component source by URL. */
    fun source(url: String) {
        source.set(ThemeBuilderSource.withUrl(url))
    }
}

/** Typed output and platform options shared by theme and component generation. */
abstract class GenerationCapability : DsBuilderCapability() {
    /** Kotlin package of generated sources. */
    abstract val packageName: Property<String>

    /** Prefix of generated Android resources. */
    abstract val resourcesPrefix: Property<String>

    /** Selected Android UI targets. */
    abstract val targets: SetProperty<DsBuilderPlatform>

    /** Parents used for generated View themes. */
    abstract val viewThemeParents: SetProperty<ViewThemeParent>

    /** Shape mappings used for generated View themes. */
    abstract val viewShapeAppearance: SetProperty<ShapeAppearanceConfig>

    /** Location of generated source and resource files. */
    abstract val outputLocation: Property<OutputLocation>

    /** Dimension generation settings. */
    abstract val dimensions: Property<DimensionsConfig>

    /** Whether output targets Compose Multiplatform. */
    abstract val multiplatform: Property<Boolean>

    init {
        targets.convention(emptySet())
        viewThemeParents.convention(emptySet())
        viewShapeAppearance.convention(emptySet())
        outputLocation.convention(OutputLocation.BUILD)
        dimensions.convention(DimensionsConfig())
        multiplatform.convention(false)
    }

    /** Enables Compose generation. */
    fun compose(multiplatform: Boolean = false) {
        targets.add(DsBuilderPlatform.COMPOSE)
        this.multiplatform.set(multiplatform)
    }

    /** Enables View generation with optional theme configuration. */
    fun view(action: ViewConfigBuilder.() -> Unit = {}) {
        val builder = ViewConfigBuilder().apply(action)
        targets.add(DsBuilderPlatform.VIEW)
        viewThemeParents.set(builder.themeParents)
        viewShapeAppearance.set(builder.shapeAppearanceConfig)
    }

    /** Configures generated dimension scaling and breakpoints. */
    fun dimensions(action: DimensionsConfigBuilder.() -> Unit) {
        dimensions.set(DimensionsConfigBuilder().apply(action).build())
    }

    internal fun target(): ThemeBuilderTarget? = when (targets.getOrElse(emptySet())) {
        setOf(DsBuilderPlatform.COMPOSE) -> ThemeBuilderTarget.COMPOSE
        setOf(DsBuilderPlatform.VIEW) -> ThemeBuilderTarget.VIEW_SYSTEM
        setOf(DsBuilderPlatform.COMPOSE, DsBuilderPlatform.VIEW) -> ThemeBuilderTarget.ALL
        else -> null
    }
}

/** Platform-specific documentation aggregation settings. */
abstract class DocumentationCapability @Inject constructor(
    private val objects: ObjectFactory,
) : DsBuilderCapability() {
    /** Platform enrichment root, conventionally `.sdds/temp/docs`. */
    abstract val outputDirectory: DirectoryProperty

    /** Optional design-system documentation root, conventionally `override-docs`. */
    abstract val userDocumentationRoot: DirectoryProperty

    /** Compose documentation settings, or `null` when Compose is not enabled. */
    var compose: DocumentationPlatform? = null
        private set

    /** View documentation settings, or `null` when View is not enabled. */
    var view: DocumentationPlatform? = null
        private set

    /** Enables Compose documentation aggregation. */
    fun compose(action: Action<in DocumentationPlatform> = Action {}) {
        compose = objects.newInstance<DocumentationPlatform>().also(action::execute)
    }

    /** Enables View documentation aggregation. */
    fun view(action: Action<in DocumentationPlatform> = Action {}) {
        view = objects.newInstance<DocumentationPlatform>().also(action::execute)
    }
}

/** Inputs of documentation aggregation for one Android UI platform. */
abstract class DocumentationPlatform {
    /** Override for the platform components info JSON. */
    abstract val componentsInfoFile: RegularFileProperty

    /** Override for the platform theme info JSON. */
    abstract val themeInfoFile: RegularFileProperty
}

/** Sandbox adapter generation settings. */
abstract class SandboxCapability @Inject constructor(
    private val objects: ObjectFactory,
) : DsBuilderCapability() {
    /** Location of generated sandbox adapter sources. */
    abstract val outputLocation: Property<OutputLocation>

    /** Compose adapter settings, or `null` when Compose is not enabled. */
    var compose: ComposeSandboxPlatform? = null
        private set

    /** View adapter settings, or `null` when View is not enabled. */
    var view: ViewSandboxPlatform? = null
        private set

    /** Enables Compose sandbox adapter generation. */
    fun compose(action: Action<in ComposeSandboxPlatform>) {
        compose = objects.newInstance<ComposeSandboxPlatform>().also(action::execute)
    }

    /** Enables View sandbox adapter generation. */
    fun view(action: Action<in ViewSandboxPlatform>) {
        view = objects.newInstance<ViewSandboxPlatform>().also(action::execute)
    }
}

/** Typed sandbox inputs shared by Compose and View generators. */
abstract class SandboxPlatform {
    /** Override for the platform components info JSON. */
    abstract val componentsInfoFile: RegularFileProperty

    /** Package of generated sandbox sources. */
    abstract val generatedPackageName: Property<String>

    /** Public name of the generated design-system theme. */
    abstract val themeAlias: Property<String>

    /** Generator API scheme. */
    abstract val scheme: Property<SandboxScheme>

    init {
        scheme.convention(SandboxScheme.V2)
    }
}

/** Compose sandbox adapter settings. */
abstract class ComposeSandboxPlatform : SandboxPlatform() {
    /** Whether generated sources target a Compose Multiplatform source set. */
    abstract val multiplatform: Property<Boolean>

    init {
        multiplatform.convention(false)
    }
}

/** View sandbox adapter settings. */
abstract class ViewSandboxPlatform : SandboxPlatform()
