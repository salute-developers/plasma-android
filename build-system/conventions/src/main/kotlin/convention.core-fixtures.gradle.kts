import com.android.build.gradle.LibraryExtension
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import tasks.docs.ExtractCodeSnippetsTask
import utils.baseDetektConfigDirPath
import utils.baseDetektConfigPath
import utils.isAndroidLib
import utils.withVersionCatalogs


val docsDirPath = "docs"

val kotlinCompilerDependencies = configurations.create("kotlinCompilerDependencies")

dependencies {
    withVersionCatalogs {
        add(kotlinCompilerDependencies.name, base.kotlin.compiler.embeddable)
    }
}

val kotlinCompilerClassPath = configurations.create("kotlinCompilerClassPath") {
    extendsFrom(kotlinCompilerDependencies)
}

tasks.register<ExtractCodeSnippetsTask>("collectCodeSnippets") {
    group = "documentation"
    description = "Извлекает код внутри codeSnippet/composableCodeSnippet из функций @DocSample"
    kotlinCompiler.from(kotlinCompilerClassPath)
    if (isAndroidLib()) {
        val namespace = project.extensions.getByType(LibraryExtension::class.java).namespace.orEmpty()
        xmlNamespace.set(namespace)
    }
    outputKotlinDir.set(layout.buildDirectory.dir(docsDirPath))
    outputXmlDir.set(layout.buildDirectory.dir(docsDirPath))
    outputMeta.set(layout.buildDirectory.file("$docsDirPath/meta.json"))
}

val docsJar = tasks.register<Jar>("docsJar") {
    archiveClassifier.set("docs")

    dependsOn("collectCodeSnippets")

    from(layout.buildDirectory.dir(docsDirPath)) {
        into("META-INF/sdds-docs")
    }
}

val docsVariantAttr: Attribute<String> = Attribute.of("com.sdds.docs.variant", String::class.java)

val docsElements by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.DOCUMENTATION))
        attribute(docsVariantAttr, "snippets")
    }

    outgoing.artifact(docsJar)
}

afterEvaluate {
    extensions.configure<PublishingExtension>("publishing") {
        publications {
            publications.withType<MavenPublication> {
                artifact(tasks.named("docsJar"))
            }
        }
    }
}

tasks.withType<Detekt>().configureEach {
    exclude("**/*Samples.kt")
}

configure<DetektExtension> {
    val integrationConfig = "${project.baseDetektConfigDirPath()}/integration-config.yml"

    if (file(integrationConfig).exists()) {
        config = files(project.baseDetektConfigPath(), integrationConfig)
    }
}