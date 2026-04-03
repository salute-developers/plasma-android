import extensions.docs.DocusaurusExtension
import org.gradle.kotlin.dsl.dependencies

plugins {
    id("convention.documentation")
}

extensions.configure<DocusaurusExtension>("docusaurus") {
    components.set(layout.projectDirectory.file("../config-info-view-system.json"))
}

dependencies {
    "implementation"("sdds-core:docs-views")
    "docsSnippets"("integration-core:uikit-fixtures:unspecified:docs@jar")
    "testImplementation"("integration-core:uikit-fixtures")
}