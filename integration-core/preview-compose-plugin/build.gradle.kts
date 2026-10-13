import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsTargetDsl
import org.gradle.api.tasks.bundling.Zip
import org.gradle.api.tasks.Delete
import org.gradle.api.tasks.Sync
import org.gradle.api.attributes.Usage
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import utils.addDefaultTargets

plugins {
    id("convention.cmp-lib")
}

val cleanPreviewPluginWebpackOutput by tasks.registering(Delete::class) {
    delete(layout.buildDirectory.dir("kotlin-webpack/wasmJs/productionExecutable"))
}

val previewPluginArtifact by tasks.registering(Zip::class) {
    group = "distribution"
    description = "Собирает self-contained Compose preview plugin artifact."
    dependsOn("wasmJsBrowserProductionWebpack")
    from(layout.buildDirectory.dir("kotlin-webpack/wasmJs/productionExecutable")) {
        include("*.js", "*.wasm")
    }
    from("src/wasmJsMain/resources")
    archiveFileName.set("preview-compose-plugin.zip")
    destinationDirectory.set(layout.buildDirectory.dir("distributions"))
}

val unpackPreviewPluginArtifact by tasks.registering(Sync::class) {
    dependsOn(previewPluginArtifact)
    from(previewPluginArtifact.map { zipTree(it.archiveFile) })
    into(layout.buildDirectory.dir("browser-test/artifact"))
}

val previewPluginBrowserTest by tasks.registering(Exec::class) {
    group = "verification"
    description = "Проверяет production Compose preview artifact в headless Chrome."
    dependsOn(unpackPreviewPluginArtifact)
    val chromePath = providers.gradleProperty("previewChromePath")
        .orElse("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome")
    commandLine(
        "node",
        "src/browserTest/run-browser-test.mjs",
        layout.buildDirectory.dir("browser-test/artifact").get().asFile.absolutePath,
        file("src/browserTest/resources").absolutePath,
        file("../sandbox-compose/src/commonMain/composeResources/font/s_b_sans_text_regular.otf").absolutePath,
        chromePath.get(),
    )
}

group = "integration-core"

// Фабрики стилей генерируются по api-мете, которая лежит ресурсом в JVM-артефакте uikit-compose.
val previewApiMeta: Configuration by configurations.creating {
    isCanBeConsumed = false
    isCanBeResolved = true
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
        attribute(KotlinPlatformType.attribute, KotlinPlatformType.jvm)
    }
}
val previewGenerator: Configuration by configurations.creating {
    isCanBeConsumed = false
    isCanBeResolved = true
}
dependencies {
    previewApiMeta(libs.sdds.uikit.compose)
    previewGenerator(project(":preview-generator"))
}

val generatedFactoriesDir = layout.buildDirectory.dir("generated/preview-factories")
val generatePreviewFactories by tasks.registering(JavaExec::class) {
    group = "build"
    description = "Генерирует фабрики стилей Compose preview по uikit-compose-api-meta.json."
    classpath = previewGenerator
    mainClass.set("com.sdds.preview.generator.MainKt")
    inputs.files(previewApiMeta)
    inputs.files(previewGenerator)
    outputs.dir(generatedFactoriesDir)
    val components = providers.gradleProperty("previewComponents")
    doFirst {
        val metaJar = previewApiMeta.files.single {
            it.name.startsWith("uikit-compose-") || it.name.startsWith("uikit-compose.")
        }
        setArgs(listOfNotNull(metaJar.absolutePath, generatedFactoriesDir.get().asFile.absolutePath, components.orNull))
    }
}

android { namespace = "com.sdds.preview.compose.plugin" }

kotlin {
    addDefaultTargets(publishLibraryVariants = false)
    targets.named<KotlinJsTargetDsl>("wasmJs") {
        binaries.executable()
    }

    sourceSets {
        commonMain {
            kotlin.srcDir(generatePreviewFactories.map { generatedFactoriesDir.get().asFile })
        }
        commonMain.dependencies {
            implementation(project(":preview-contract"))
            implementation(project(":preview-sdk-compose"))
            implementation(project(":sandbox-core"))
            implementation(project(":uikit-compose-fixtures"))
            implementation(libs.sdds.uikit.compose)
            implementation(compose.foundation)
            implementation(compose.runtime)
            implementation(compose.ui)
            implementation(libs.base.kotlin.serialization.json)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
        }
    }
}

tasks.named("wasmJsProductionExecutableCompileSync") {
    dependsOn(cleanPreviewPluginWebpackOutput)
}
