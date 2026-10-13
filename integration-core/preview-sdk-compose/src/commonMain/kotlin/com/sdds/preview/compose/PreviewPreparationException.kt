package com.sdds.preview.compose

/** Ошибка подготовки preview со стабильным кодом Preview Protocol. */
public class PreviewPreparationException(
    /** Стабильный код ошибки. */ public val code: String,
    message: String,
    /** Путь к проблемному полю. */ public val path: String? = null,
) : IllegalStateException(message)
