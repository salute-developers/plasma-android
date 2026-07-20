import utils.addDefaultTargets

plugins {
    id("convention.cmp-lib")
    id("convention.maven-publish")
    id("convention.core-fixtures")
    alias(libs.plugins.ksp)
}

group = "integration-core"

android {
    namespace = "com.sdds.compose.uikit.fixtures"
}

ksp {
    arg("packageName", "com.sdds.compose.docs")
    arg("sandbox.packageName", "com.sdds.compose.uikit.fixtures.stories")
}

kotlin {
    addDefaultTargets()

    sourceSets {
        commonMain {
            kotlin.setSrcDirs(
                listOf(
                    "src/main/kotlin/com/sdds/compose/uikit/fixtures/stories",
                    "build/generated/ksp/metadata/commonMain/kotlin",
                    "build/generated/compose/resourceGenerator/kotlin/commonResClass",
                    "build/generated/compose/resourceGenerator/kotlin/commonMainResourceAccessors",
                    "build/generated/compose/resourceGenerator/kotlin/commonMainResourceCollectors",
                ),
            )

            dependencies {
                implementation(project(":sandbox-core"))
                implementation(project(":sandbox-compose"))
                implementation("sdds-core:uikit-compose")
                implementation("sdds-core:icons-compose")
                implementation(compose.foundation)
                implementation(compose.components.resources)
                implementation(compose.ui)
            }
        }

        androidMain {
            kotlin.setSrcDirs(
                listOf(
                    "src/main/kotlin/com/sdds/compose/uikit/fixtures/samples",
                    "build/generated/compose/resourceGenerator/kotlin/androidMainResourceCollectors",
                ),
            )
            resources.srcDir("src/main/res")

            dependencies {
                implementation("sdds-core:docs")
                implementation("sdds-core:icons")
                implementation(libs.base.androidX.appcompat)
                implementation(libs.base.koil.compose)
            }
        }

        matching { it.name == "androidDebug" || it.name == "androidRelease" }
            .configureEach {
                kotlin.setSrcDirs(emptyList<String>())
            }
    }
}

compose.resources {
    publicResClass = true
    packageOfResClass = "com.sdds.compose.uikit.fixtures.generated.resources"
}

dependencies {
    add("kspCommonMainMetadata", project(":sandbox-ksp"))
    add("kspAndroid", "sdds-core:docs")
}

tasks.matching { it.name == "kspCommonMainKotlinMetadata" }.configureEach {
    dependsOn("generateResourceAccessorsForCommonMain")
}

tasks.matching { it.name.startsWith("compile") && it.name.contains("Kotlin") }
    .configureEach {
        dependsOn("kspCommonMainKotlinMetadata")
    }

tasks.matching {
    it.name.startsWith("ksp") &&
        it.name.endsWith("KotlinAndroid") &&
        it.name != "kspCommonMainKotlinMetadata"
}.configureEach {
    dependsOn("kspCommonMainKotlinMetadata")
}
