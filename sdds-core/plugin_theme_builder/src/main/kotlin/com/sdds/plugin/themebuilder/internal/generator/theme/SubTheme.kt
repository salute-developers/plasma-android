package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.token.Token

internal enum class SubTheme(val suffix: String, val tag: String) {
    ON_LIGHT("OnLight", "on-light"),
    ON_DARK("OnDark", "on-dark"),
    INVERSE("Inverse", "inverse"),
    DEFAULT("Default", "default"),
}

internal class OverrideToken(val old: Token, val new: Token) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OverrideToken) return false

        if (old.name != other.old.name) return false
        if (new.name != other.new.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = old.name.hashCode()
        result = 31 * result + new.name.hashCode()
        return result
    }
}

internal fun List<Token>.overriddenBySubTheme(): Map<SubTheme, List<OverrideToken>> {
    return TokenSubThemeGroups
        .map { overrideTokens(it) }
        .reduce { acc, map ->
            (acc.keys + map.keys).associateWith {
                acc.getOrDefault(it, emptyList()) + map.getOrDefault(it, emptyList())
            }
        }
}

private val TokenSubThemeGroups = SubTheme.values()
private val SubThemes = SubTheme.values()

private fun List<Token>.overrideTokens(tokenSubThemeGroup: SubTheme): Map<SubTheme, List<OverrideToken>> {
    val sourceTokens = this.filter { it.isSubTheme(tokenSubThemeGroup) }.associateBy { it.name }
    val overrideTokens = this.filter { !it.isSubTheme(tokenSubThemeGroup) }.associateBy { it.name }
    return SubThemes
        .filter { it.shouldOverrideTokens(withSubThemeGroup = tokenSubThemeGroup) }
        .associate { subTheme ->
            val tokens = sourceTokens.mapNotNull { (_, token) ->
                val overrideTokenName = subTheme.getOverrideTokenName(token.name, tokenSubThemeGroup)
                    ?: return@mapNotNull null
                val overrideToken = overrideTokens[overrideTokenName] ?: return@mapNotNull null
                OverrideToken(token, overrideToken)
            }
            subTheme to tokens
        }
}

private fun SubTheme.getOverrideTokenName(tokenName: String, tokenSubThemeGroup: SubTheme): String? {
    val targetSubThemeGroup = if (tokenSubThemeGroup == SubTheme.INVERSE) this.inverse() else this
    if (targetSubThemeGroup == tokenSubThemeGroup) return null
    return tokenName.replace(".${tokenSubThemeGroup.tag}.", ".${targetSubThemeGroup.tag}.")
}

/**
 * Отвечает на вопрос "Может ли подтема [this] переопределить группу токенов [withSubThemeGroup]"
 */
private fun SubTheme.shouldOverrideTokens(withSubThemeGroup: SubTheme): Boolean {
    return when (withSubThemeGroup) {
        // Токены из группы inverse переопределяеются во всех подтемах
        SubTheme.INVERSE -> true
        // Токены из групп on-light и on-dark не переопределяются ни в какой из подтем
        SubTheme.ON_LIGHT,
        SubTheme.ON_DARK,
        -> false
        // Токены из группы default не переопределяются в подтеме Default
        SubTheme.DEFAULT -> this != SubTheme.DEFAULT
    }
}

private fun SubTheme.inverse(): SubTheme {
    return when (this) {
        SubTheme.ON_LIGHT -> SubTheme.ON_DARK
        SubTheme.ON_DARK -> SubTheme.ON_LIGHT
        SubTheme.INVERSE -> SubTheme.DEFAULT
        SubTheme.DEFAULT -> SubTheme.INVERSE
    }
}

private fun Token.isSubTheme(subTheme: SubTheme): Boolean {
    return tags.contains(subTheme.tag)
}
