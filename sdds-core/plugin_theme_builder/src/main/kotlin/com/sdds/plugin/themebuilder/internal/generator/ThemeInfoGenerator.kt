package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.GeneratedTokenInfo
import com.sdds.plugin.themebuilder.internal.token.ThemeTokenInfo
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.encodeToStream
import java.io.File

/**
 * Генерирует информацию о снегерированных токенах в теме
 */
internal class ThemeInfoGenerator(
    private val outputDir: File,
) : SimpleBaseGenerator {
    private var themeName: String = ""
    private var themeVersion: String = ""
    private var platform: String = ""
    private val tokens = mutableListOf<GeneratedTokenInfo>()

    fun addResult(result: TokenResult) {
        tokens += result.tokenInfo
    }

    fun setInfo(name: String, version: String, platform: String) {
        themeName = name
        themeVersion = version
        this.platform = platform
    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun generate() {
        val themeTokenInfo = ThemeTokenInfo(
            name = themeName,
            version = themeVersion,
            platform = platform,
            tokens = tokens,
        )
        outputDir.outputStream().use {
            Serializer.configInfo.encodeToStream(themeTokenInfo, it)
        }
    }
}

/**
 * Базовый интерфейс результата сгенерированного токена
 */
internal interface TokenResult {

    /**
     * Информация о сгенерированном токене
     */
    val tokenInfo: List<GeneratedTokenInfo>
}
