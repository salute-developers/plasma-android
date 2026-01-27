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
    "docsSnippets"("sdds-core:uikit-fixtures:unspecified:docs@jar")
    "testImplementation"("sdds-core:uikit-fixtures")
}