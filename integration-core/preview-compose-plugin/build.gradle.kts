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

val generatedManifestDir = layout.buildDirectory.dir("generated/preview-manifest")
val generatedFactoriesDir = layout.buildDirectory.dir("generated/preview-factories")
val generatedIconsDir = layout.buildDirectory.dir("generated/preview-icons")
val generatedGroupsFile = layout.buildDirectory.file("generated/preview-groups/preview-groups.json")

// Группы компонентов берутся из реестра историй песочницы (`ComponentKey.group`): их знает только Kotlin-код,
// поэтому JSON строит главная функция JVM-цели модуля.
val generatePreviewGroups by tasks.registering(JavaExec::class) {
    group = "build"
    description = "Формирует группы компонентов Compose preview по реестру историй песочницы."
    dependsOn("compileKotlinJvm")
    val jvmMain = provider { kotlin.targets.getByName("jvm").compilations.getByName("main") }
    classpath = files(
        provider { jvmMain.get().output.allOutputs },
        provider { jvmMain.get().runtimeDependencyFiles },
    )
    mainClass.set("com.sdds.preview.compose.plugin.PreviewComponentGroupKt")
    val output = generatedGroupsFile
    outputs.file(output)
    javaLauncher.set(javaToolchains.launcherFor { languageVersion.set(JavaLanguageVersion.of(17)) })
    doFirst { setArgs(listOf(output.get().asFile.absolutePath)) }
}

// Список `components` manifest берётся из генератора фабрик, а не пишется вручную; тест покрытия и браузерный тест
// сверяют его с реестром историй плагина.
val generatePreviewManifest by tasks.registering {
    group = "build"
    description = "Собирает preview-plugin.json из шаблона и списка компонентов сгенерированных фабрик."
    dependsOn("generatePreviewFactories", generatePreviewGroups)
    val template = layout.projectDirectory.file("src/manifest/preview-plugin.template.json")
    val components = generatedFactoriesDir.map { it.file("components.txt") }
    val output = generatedManifestDir
    inputs.file(template)
    val groupsFile = generatedGroupsFile
    inputs.file(components)
    inputs.file(groupsFile)
    outputs.dir(output)
    doLast {
        @Suppress("UNCHECKED_CAST")
        val manifest = groovy.json.JsonSlurper().parse(template.asFile) as MutableMap<String, Any?>
        val componentNames = components.get().asFile.readLines().filter { it.isNotBlank() }
        manifest["components"] = componentNames
        @Suppress("UNCHECKED_CAST")
        val groups = (groovy.json.JsonSlurper().parse(groupsFile.get().asFile) as Map<String, Any?>)["groups"]
            as List<Map<String, Any?>>
        // Каждый компонент манифеста входит ровно в одну группу, и групп без компонентов манифеста нет.
        val grouped = groups.flatMap { (it["components"] as List<*>).map(Any?::toString) }
        val missing = componentNames - grouped.toSet()
        val unknown = grouped.toSet() - componentNames.toSet()
        val duplicated = grouped.groupBy { it }.filterValues { it.size > 1 }.keys
        check(missing.isEmpty() && unknown.isEmpty() && duplicated.isEmpty()) {
            "Группы манифеста расходятся с компонентами: без группы $missing, вне манифеста $unknown, в нескольких группах $duplicated"
        }
        manifest["groups"] = groups
        val directory = output.get().asFile
        directory.mkdirs()
        File(directory, "preview-plugin.json")
            .writeText(groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(manifest)) + "\n")
    }
}

val previewPluginArtifact by tasks.registering(Zip::class) {
    group = "distribution"
    description = "Собирает self-contained Compose preview plugin artifact."
    dependsOn("wasmJsBrowserProductionWebpack", "wasmJsProcessResources", generatePreviewManifest)
    from(generatedManifestDir)
    // Compose-ресурсы историй (иллюстрации, шрифты) загружаются во время работы относительно страницы плагина.
    from(layout.buildDirectory.dir("processedResources/wasmJs/main")) {
        include("composeResources/**")
    }
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

// Api-мета для галереи браузерного теста: тот же ресурс JVM-артефакта uikit-compose, что и при генерации фабрик.
val extractApiMetaForBrowserTest by tasks.registering(Copy::class) {
    from(provider { zipTree(previewApiMeta.files.single { it.name.startsWith("uikit-compose-") || it.name.startsWith("uikit-compose.") }) }) {
        include("sdds/api/uikit-compose-api-meta.json")
        eachFile { path = "api-meta.json" }
        includeEmptyDirs = false
    }
    into(layout.buildDirectory.dir("browser-test/api-meta"))
}

val previewPluginBrowserTest by tasks.registering(Exec::class) {
    group = "verification"
    description = "Проверяет production Compose preview artifact в headless Chrome."
    dependsOn(unpackPreviewPluginArtifact, extractApiMetaForBrowserTest)
    val chromePath = providers.gradleProperty("previewChromePath")
        .orElse("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome")
    commandLine(
        "node",
        "src/browserTest/run-browser-test.mjs",
        layout.buildDirectory.dir("browser-test/artifact").get().asFile.absolutePath,
        file("src/browserTest/resources").absolutePath,
        file("../sandbox-compose/src/commonMain/composeResources/font/s_b_sans_text_regular.otf").absolutePath,
        chromePath.get(),
        layout.buildDirectory.dir("browser-test/gallery").get().asFile.absolutePath,
        layout.buildDirectory.dir("browser-test/api-meta").get().asFile.absolutePath,
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

private val JVM_FOR_GENERATOR = 17

val generatePreviewFactories by tasks.registering(JavaExec::class) {
    group = "build"
    description = "Генерирует фабрики стилей Compose preview по uikit-compose-api-meta.json."
    classpath = previewGenerator
    mainClass.set("com.sdds.preview.generator.MainKt")
    inputs.files(previewApiMeta)
    inputs.files(previewGenerator)
    outputs.dir(generatedFactoriesDir)
    val components = providers.gradleProperty("previewComponents")
    inputs.property("previewComponents", components.orElse(""))
    // Генератор и Theme Builder собраны под JVM 17, поэтому запускаем его на нём независимо от JVM самого Gradle.
    javaLauncher.set(javaToolchains.launcherFor { languageVersion.set(JavaLanguageVersion.of(JVM_FOR_GENERATOR)) })
    doFirst {
        val metaJar = previewApiMeta.files.single {
            it.name.startsWith("uikit-compose-") || it.name.startsWith("uikit-compose.")
        }
        setArgs(listOfNotNull(metaJar.absolutePath, generatedFactoriesDir.get().asFile.absolutePath, components.orNull))
    }
}

// Иконки, которые плагин рисует по имени из конфигурации компонента (`disclosure.down.fill.16`). Список лежит в
// репозитории: в wasm попадают только перечисленные иконки, а несуществующее имя ломает компиляцию реестра.
val generatePreviewIcons by tasks.registering {
    group = "build"
    description = "Генерирует реестр иконок Compose preview по src/icons/preview-icons.txt."
    val list = layout.projectDirectory.file("src/icons/preview-icons.txt")
    val output = generatedIconsDir
    inputs.file(list)
    outputs.dir(output)
    doLast {
        val members = list.asFile.readLines()
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .map { name ->
                name.split('.', '-', '_').filter { it.isNotEmpty() }
                    .joinToString("") { part -> part.replaceFirstChar { it.uppercaseChar() } }
            }
            .distinct()
            .sorted()
        val source = buildString {
            appendLine("package com.sdds.preview.compose.generated")
            appendLine()
            appendLine("import com.sdds.icons.compose.SddsIcons")
            members.forEach { appendLine("import com.sdds.icons.compose.$it") }
            appendLine("import com.sdds.preview.compose.PreviewIconRegistry")
            appendLine()
            appendLine("/** Сгенерировано из `src/icons/preview-icons.txt`: иконки, доступные Compose preview по имени. */")
            appendLine("internal object GeneratedPreviewIcons {")
            appendLine("    val all: PreviewIconRegistry = PreviewIconRegistry(")
            appendLine("        mapOf(")
            members.forEach { appendLine("            \"$it\" to { SddsIcons.$it },") }
            appendLine("        ),")
            appendLine("    )")
            appendLine("}")
        }
        val directory = output.get().asFile
        directory.mkdirs()
        File(directory, "GeneratedPreviewIcons.kt").writeText(source)
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
            kotlin.srcDir(generatePreviewIcons.map { generatedIconsDir.get().asFile })
        }
        commonMain.dependencies {
            implementation(project(":preview-contract"))
            implementation(project(":preview-sdk-compose"))
            implementation(project(":sandbox-core"))
            implementation(project(":uikit-compose-fixtures"))
            implementation("sdds-core:icons-compose")
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
