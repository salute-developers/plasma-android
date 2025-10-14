import org.gradle.kotlin.dsl.register
import tasks.integration.ComponentsTarget
import tasks.integration.GenerateComponentsDictionary


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