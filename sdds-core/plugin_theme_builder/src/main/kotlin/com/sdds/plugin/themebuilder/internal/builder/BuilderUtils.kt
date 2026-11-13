package com.sdds.plugin.themebuilder.internal.builder

/**
 * Комментарий к сгенерированному файлу
 * @author Малышев Александр on 23.09.2024
 */
const val AUTOGEN_COMMENT = "AUTO-GENERATED. DO NOT MODIFY this file."

/**
 * Правила detekt, подавляемые в сгенерированных файлах токенов и темы.
 *
 * Подавляется только [UndocumentedPublicProperty]: описания публичных свойств берутся из
 * мета-данных дизайн-системы (`meta.json`) и могут быть пустыми, тогда генератор физически
 * не чем печатать KDoc. Классы и функции документируются константами самого генератора,
 * поэтому их правила остаются включёнными.
 */
internal val GENERATED_TOKENS_DOC_SUPPRESSIONS = listOf(
    "UndocumentedPublicProperty",
)
