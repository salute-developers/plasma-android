import tasks.integration.ComponentsTarget
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.kotlin.dsl.register
import tasks.integration.GenerateComponentsDictionary
import tasks.integration.Scheme
import utils.baseDetektConfigDirPath
import utils.baseDetektConfigPath


tasks.register<GenerateComponentsDictionary>("generateComposeIntegration") {
    val configuredConfigPath = properties["integration.compose.config-path"]?.toString()
        ?: throw GradleException("integration.compose.config-path is not specified")
    val configuredConfigFile = rootProject.file(configuredConfigPath)
    val sddsConfigFile = configuredConfigFile.parentFile.resolve(".sdds/${configuredConfigFile.name}")
    configInputFile.set(
        if (configuredConfigFile.exists()) configuredConfigFile else sddsConfigFile
    )
    packageName.set(
        properties["integration.compose.package-name"]?.toString()
            ?: throw GradleException("integration.compose.package-name is not specified")
    )
    themeAlias.set(properties["theme-alias"]?.toString())
    multiplatform.set(
        providers.gradleProperty("integration.compose.multiplatform")
            .map { it.toBooleanStrict() }
            .orElse(provider { plugins.hasPlugin("org.jetbrains.kotlin.multiplatform") }),
    )
    scheme.set(
        when (properties["integration.compose.scheme"]?.toString()) {
            "V2" -> Scheme.V2
            else -> Scheme.V1
        }
    )

    target.set(ComponentsTarget.COMPOSE)
}

configure<DetektExtension> {
    val integrationConfig = "${project.baseDetektConfigDirPath()}/integration-config.yml"
    if (file(integrationConfig).exists()) {
        config = files(project.baseDetektConfigPath(), integrationConfig)
    }
}
