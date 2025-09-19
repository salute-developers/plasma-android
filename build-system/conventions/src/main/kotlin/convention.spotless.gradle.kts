import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.gradle.spotless.SpotlessPlugin
import utils.isSandboxIntegrationModule
import utils.withVersionCatalogs

apply<SpotlessPlugin>()

configure<SpotlessExtension> {
    format("misc") {
        target("*.gradle", "*.md", ".gitignore")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    kotlin {
        target("**/*.kt")
        targetExclude("**/build/**", "**/buildSrc/**", "**/.*")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
        val maxLineLengthValue = if (project.isSandboxIntegrationModule()) {
            "disabled"
        } else {
            120
        }
        withVersionCatalogs {
            ktlint(versions.staticAnalysis.ktlint.get())
                .editorConfigOverride(
                    mapOf(
                        "ktlint_standard_kdoc-wrapping" to "disabled",
                        "ktlint_standard_class-naming" to "disabled",
                        "ktlint_standard_comment-wrapping" to "disabled",
                        "ktlint_standard_package-name" to "disabled",
                        "ktlint_standard_enum-entry-name-case" to "disabled",
                        "ktlint_standard_filename" to "disabled",
                        "max_line_length" to maxLineLengthValue,
                    ),
                )
        }
    }

    kotlinGradle {
        target("**/*.gradle.kts", "*.gradle.kts")
        targetExclude("**/build/**")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }
}
