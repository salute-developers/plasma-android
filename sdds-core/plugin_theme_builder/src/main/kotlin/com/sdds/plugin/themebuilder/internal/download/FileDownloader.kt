package com.sdds.plugin.themebuilder.internal.download

import java.io.File
import java.net.URL

/**
 * Загружает файлы
 */
internal interface FileDownloader {

    /**
     * Загружает файл по ссылке [url] в файл [File]
     */
    fun download(url: String, file: File)
}

/**
 * Базовый загрузчик файлов
 */
internal class DefaultFileDownloader : FileDownloader {

    override fun download(url: String, file: File) {
        runCatching { URL(url).readBytes() }
            .onSuccess { fontContent ->
                file.writeBytes(fontContent)
            }.onFailure {
                println("Can't download file by url:$url \n$it")
                throw it
            }
    }
}
