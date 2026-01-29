import extensions.docs.DocusaurusExtension

plugins {
    id("convention.documentation")
    id("convention.compose")
}

extensions.configure<DocusaurusExtension>("docusaurus") {
    components.set(layout.projectDirectory.file("../config-info-compose.json"))

}

dependencies {
    "docsSnippets"("sdds-core:uikit-compose-fixtures:unspecified:docs@jar")
    "implementation"("sdds-core:docs-compose")
    "testImplementation"("sdds-core:uikit-compose-fixtures")
}