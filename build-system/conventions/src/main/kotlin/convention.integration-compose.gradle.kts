import tasks.integration.ComponentsTarget
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.kotlin.dsl.register
import tasks.integration.GenerateComponentsDictionary
import tasks.integration.Scheme
import utils.baseDetektConfigDirPath
import utils.baseDetektConfigPath


tasks.register<GenerateComponentsDictionary>("generateComposeIntegration") {
    configInputFile.set(
        rootProject.file(
            properties["integration.compose.config-path"]
                ?: throw GradleException("integration.compose.config-path is not specified")
        )
    )
    packageName.set(
        properties["integration.compose.package-name"]?.toString()
            ?: throw GradleException("integration.compose.package-name is not specified")
    )
    themeAlias.set(properties["theme-alias"]?.toString())
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