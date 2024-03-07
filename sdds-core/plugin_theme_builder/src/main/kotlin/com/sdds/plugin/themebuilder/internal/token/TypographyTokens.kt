package com.sdds.plugin.themebuilder.internal.token

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.gradle.configurationcache.extensions.capitalized

@Serializable
data class TypographyTokensScheme(
    val sizes: List<String>,
    val type: List<String>,
    val screen: List<String>,
)

@Serializable
@SerialName("typography")
data class TypographyToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String
) : Token<TypographyToken.Value>() {

    override val xmlName: String by lazy {
        val nameTokens = name.split(".")
        val nameTokensExcludeScreen = nameTokens.subList(1, nameTokens.size)
        nameTokensExcludeScreen.joinToString("") { it.capitalized() }
    }

    val screenClass: ScreenClass by lazy {
        when(name.split(".").first()) {
            "screen-s" -> ScreenClass.SMALL
            "screen-m" -> ScreenClass.MEDIUM
            "screen-l" -> ScreenClass.LARGE
            else -> ScreenClass.UNKNOWN
        }
    }

    @Serializable
    data class Value(
        val fontFamily: String,
        val fontWeight: Int,
        val fontStyle: String,
        val textSize: Float,
        val letterSpacing: Float,
        val lineHeight: Float,
    ) : TokenValue

    enum class ScreenClass(val value: String) {
        SMALL("screen-s"),
        MEDIUM("screen-m"),
        LARGE("screen-l"),
        UNKNOWN("");

        val isDefault: Boolean get() = this == UNKNOWN || this == MEDIUM
    }
}