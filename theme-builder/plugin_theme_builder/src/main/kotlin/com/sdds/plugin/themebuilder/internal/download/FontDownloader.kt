package com.sdds.plugin.themebuilder.internal.download

import com.sdds.plugin.core.utils.camelToSnakeCase
import com.sdds.plugin.core.utils.fileNameFromUrl
import java.io.File

/**
 * Базовый интерфейс загрузчика шрифтов
 */
internal interface FontDownloader {

    /**
     * Загружает шрифт
     * @param url ссылка на шрифт
     * @param fontDir директория, куда будет загружен шрифт
     * @return [File] файл шрифта
     */
    fun download(url: String, fontDir: File): File
}

/**
 * Загрузчик шрифтов.
 *
 * Перед загрузкой проверяет, была ли загрузка по этому url.
 * Если шрифт по нему уже был загружен, то функция [download] сразу вернет закешированный [File] шрифта.
 * Название файла шрифта формируется из названия файла в url путем его приведения к snake_case и нижнем регистру.
 */
internal class FontDownloaderWithCache(
    private val fileDownloader: FileDownloader,
) : FontDownloader {

    private val downloadedFonts = mutableMapOf<String, File>()

    override fun download(url: String, fontDir: File): File =
        downloadedFonts[url] ?: downloadFont(url, fontDir)

    private fun downloadFont(url: String, fontDir: File): File {
        val fontFileName = url.fontFileNameFromUrl()
        val fontFile = File("${fontDir.path}/$fontFileName")
        fileDownloader.download(url, fontFile)
        downloadedFonts[url] = fontFile
        return fontFile
    }

    private fun String.fontFileNameFromUrl(): String =
        fileNameFromUrl()
            .replace('-', '_')
            .camelToSnakeCase()
}
