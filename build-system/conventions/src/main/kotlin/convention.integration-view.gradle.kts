import com.diffplug.gradle.spotless.SpotlessExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.kotlin.dsl.register
import tasks.integration.ComponentsTarget
import tasks.integration.GenerateComponentsDictionary
import tasks.integration.Scheme
import utils.baseDetektConfigDirPath
import utils.baseDetektConfigPath
import utils.withVersionCatalogs

tasks.register<GenerateComponentsDictionary>("generateViewIntegration") {
    val currentScheme = properties["integration.view.scheme"]
        ?.toString()
        ?.let { Scheme.valueOf(it) }
        ?: Scheme.V1
    scheme.set(currentScheme)
    val sourceProject = when(currentScheme) {
        Scheme.V1 -> rootProject
        Scheme.V2 -> project
    }
    configInputFile.set(
        sourceProject.file(
            properties["integration.view.config-path"]
                ?: throw GradleException("integration.view.config-path is not specified")
        )
    )
    packageName.set(
        properties["integration.view.package-name"]?.toString()
            ?: throw GradleException("integration.view.package-name is not specified")
    )
    target.set(ComponentsTarget.XML)

}

configure<DetektExtension> {
    val integrationConfig = "${project.baseDetektConfigDirPath()}/integration-config.yml"

    if (file(integrationConfig).exists()) {
        config = files(project.baseDetektConfigPath(), integrationConfig)
    }
}