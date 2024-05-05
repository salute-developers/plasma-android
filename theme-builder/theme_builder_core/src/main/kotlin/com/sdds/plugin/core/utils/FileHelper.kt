package com.sdds.plugin.core.utils

import java.io.File
import java.io.FileWriter
import java.io.Writer

/**
 * Утилиты для файлов
 */
object FileHelper {
    /**
     * Возвращает экземпляр [FileWriter] для текущего файла
     */
    fun File.fileWriter(): Writer = FileWriter(this)
}
