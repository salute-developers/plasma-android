import org.gradle.api.artifacts.component.ModuleComponentSelector

plugins {
    id("base")
}

subprojects {
    configurations.all {
        resolutionStrategy.dependencySubstitution.all {
            val moduleSelector = requested as? ModuleComponentSelector
            if (moduleSelector == null || moduleSelector.group != "io.github.salute-developers") {
                return@all
            }
            println("requested module ${moduleSelector.module}")
            when (moduleSelector.module) {
                "sdds-uikit-compose" -> useTarget(
                    "sdds-core:uikit-compose:*",
                    "we work with the unreleased development version"
                )

                "sdds-uikit" -> useTarget(
                    "sdds-core:uikit:*",
                    "we work with the unreleased development version"
                )

                "sdds-icons" -> useTarget(
                    "sdds-core:icons:*",
                    "we work with the unreleased development version"
                )
            }
        }
    }
}