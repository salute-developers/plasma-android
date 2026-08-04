import com.android.build.gradle.LibraryExtension
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import tasks.docs.ExtractCodeSnippetsTask
import tasks.docs.ValidateCoreDocumentationTask
import utils.baseDetektConfigDirPath
import utils.baseDetektConfigPath
import utils.getDocsTemplateDir
import utils.isAndroidLib
import utils.isComposeLib
import utils.withVersionCatalogs


val docsDirPath = "docs"
val coreDocsTemplateDir = getDocsTemplateDir().resolve(
    if (isComposeLib()) "compose-template" else "xml-template",
)

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
    outputKotlinDir.set(layout.buildDirectory.dir("$docsDirPath/assets/examples/kotlin"))
    outputXmlDir.set(layout.buildDirectory.dir("$docsDirPath/assets/examples/xml"))
    outputMeta.set(layout.buildDirectory.file("$docsDirPath/meta/samples.json"))
}

val docsJar = tasks.register<Jar>("docsJar") {
    archiveClassifier.set("docs")

    dependsOn("collectCodeSnippets", "validateCoreDocumentation")

    from(layout.buildDirectory.dir(docsDirPath)) {
        into("META-INF/sdds-docs")
    }
    from(coreDocsTemplateDir) {
        include("structure.json")
        include("docs/**/*.md")
        into("META-INF/sdds-docs")
    }
}

tasks.register<ValidateCoreDocumentationTask>("validateCoreDocumentation") {
    group = "verification"
    description = "Проверяет соответствие structure.json Core markdown-шаблонам"
    structureFile.set(coreDocsTemplateDir.resolve("structure.json"))
    docsDirectory.set(coreDocsTemplateDir.resolve("docs"))
}

val docsVariantAttr: Attribute<String> = Attribute.of("com.sdds.docs.variant", String::class.java)

val docsElements by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.DOCUMENTATION))
        attribute(docsVariantAttr, "templates")
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
