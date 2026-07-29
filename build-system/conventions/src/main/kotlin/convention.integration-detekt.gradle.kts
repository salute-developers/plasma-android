import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import utils.baseDetektConfigDirPath
import utils.baseDetektConfigPath

tasks.withType<Detekt>().configureEach {
    exclude("**/*Samples.kt")
}

configure<DetektExtension> {
    val integrationConfig = "${project.baseDetektConfigDirPath()}/integration-config.yml"

    if (file(integrationConfig).exists()) {
        config = files(project.baseDetektConfigPath(), integrationConfig)
    }
}
