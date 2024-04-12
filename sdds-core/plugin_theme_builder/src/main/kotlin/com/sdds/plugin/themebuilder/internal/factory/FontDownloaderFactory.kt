package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.download.DefaultFileDownloader
import com.sdds.plugin.themebuilder.internal.download.FontDownloader
import com.sdds.plugin.themebuilder.internal.download.FontDownloaderWithCache

/**
 * Фабрика загрузчика шрифтов [FontDownloader]
 */
internal class FontDownloaderFactory {
    fun create(): FontDownloader = FontDownloaderWithCache(fileDownloader = DefaultFileDownloader())
}
