import com.android.build.gradle.LibraryExtension
import extensions.docs.DocusaurusExtension
import extensions.docs.FixturesExtension
import io.gitlab.arturbosch.detekt.Detekt
import tasks.docs.ExtractCodeSnippetsTask
import tasks.docs.UnzipCodeSnippetsTask
import org.gradle.api.attributes.Attribute
import utils.isAndroidLib

plugins {
    id("convention.android-lib")
    id("convention.docusaurus")
    id("com.google.devtools.ksp")
}

val docsVariantAttr: Attribute<String> = Attribute.of("com.sdds.docs.variant", String::class.java)

val docsPath = "docs"

val extension = extensions.create("fixtures", FixturesExtension::class).apply {
    kotlinSnippetsDir.convention(layout.buildDirectory.dir(docsPath))
    xmlSnippetsDir.convention(layout.buildDirectory.dir(docsPath))
    metaFile.convention(layout.buildDirectory.file("${docsPath}/meta.json"))
}

extensions.configure<DocusaurusExtension>("docusaurus") {
    snippetsDir.set(layout.buildDirectory.dir(docsPath))
}

val collectSnippets = tasks.register<ExtractCodeSnippetsTask>("collectCodeSnippets") {
    group = "documentation"
    description = "Извлекает код внутри codeSnippet/composableCodeSnippet из функций @DocSample"
    if (isAndroidLib()) {
        val namespace = project.extensions.getByType(LibraryExtension::class.java).namespace.orEmpty()
        xmlNamespace.set(namespace)
    }
    outputKotlinDir.set(extension.kotlinSnippetsDir)
    outputXmlDir.set(extension.xmlSnippetsDir)
    outputMeta.set(extension.metaFile)
    dependsOn(unzipSnippets)
}

val unzipSnippets = tasks.register<UnzipCodeSnippetsTask>("unzipCoreSnippets") {
    group = "documentation"
    description = "Извлекает примеры кода core компонентов"

    snippetsOutDir.set(layout.buildDirectory.dir(docsPath))
    docsArtifacts.from(configurations.named("docsSnippets"))
}

tasks.named("docusaurusGenerate").configure {
    dependsOn(collectSnippets)
}

tasks.withType<Detekt>().configureEach {
    exclude("**/*Samples.kt")
}

val docsSnippets by configurations.creating {
    isCanBeResolved = true
    isCanBeConsumed = false
    description = "Артефакты с примерами кода"
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
        attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category.DOCUMENTATION))
        attribute(docsVariantAttr, "snippets")
    }
}

afterEvaluate {
    ksp {
        arg("packageName", project.extensions.getByType(LibraryExtension::class.java).namespace.orEmpty())
    }
}

dependencies {
    "implementation"("sdds-core:docs")
    ksp("sdds-core:docs-ksp")
}