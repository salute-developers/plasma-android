package com.sdds.plugin.themebuilder

import java.io.Serializable

/**
 * Конфиг префикса ресурсов
 *
 * @property resourcePrefix префикс ресурсов
 * @property shouldGenerateResPrefixStyle флаг, указывающий на необходимость генерировать стиль с названием префикса.
 */
data class ResourcePrefixConfig(
    val resourcePrefix: String,
    val shouldGenerateResPrefixStyle: Boolean,
) : Serializable
