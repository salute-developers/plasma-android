import org.gradle.kotlin.dsl.register
import tasks.integration.ComponentsTarget
import tasks.integration.GenerateComponentsDictionary


tasks.register<GenerateComponentsDictionary>("generateViewIntegration") {
    configInputFile.set(
        rootProject.file(
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