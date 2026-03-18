import com.diffplug.gradle.spotless.SpotlessExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.kotlin.dsl.register
import tasks.integration.ComponentsTarget
import tasks.integration.GenerateComponentsDictionary
import utils.baseDetektConfigDirPath
import utils.baseDetektConfigPath
import utils.withVersionCatalogs


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
    target.set(ComponentsTarget.COMPOSE)
}

configure<DetektExtension> {
    val integrationConfig = "${project.baseDetektConfigDirPath()}/integration-config.yml"
    if (file(integrationConfig).exists()) {
        config = files(project.baseDetektConfigPath(), integrationConfig)
    }
}