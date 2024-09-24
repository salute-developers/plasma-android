package com.sdds.plugin.themebuilder.internal.builder

import java.io.File

/**
 * Билдер kotlin-файлов из ресурсов
 */
internal class KtFileFromResourcesBuilder(private val packageName: String) {

    /**
     * Создает kotlin-файл из файла ресурса
     *
     * @param inputRes путь к файлу ресурса
     * @param outputLocation директория для создания kt-файла
     * @param outputFileName название выходного kt-файла
     */
    fun buildFromResource(
        inputRes: String,
        outputLocation: KtFileBuilder.OutputLocation,
        outputFileName: String,
    ) {
        val headerString = "// $AUTOGEN_COMMENT\npackage $packageName"
        val codeString = getResourceAsString(inputRes)

        when (outputLocation) {
            is KtFileBuilder.OutputLocation.Directory -> {
                File(
                    outputLocation.dir,
                    "${packageName.replace('.', '/')}/$outputFileName.kt",
                )
                    .apply {
                        writeBytes("$headerString\n".toByteArray() + codeString.toByteArray())
                    }
            }

            is KtFileBuilder.OutputLocation.Stream -> outputLocation.stream.writer().use {
                it.write("$headerString\n" + codeString)
            }
        }
    }

    private fun getResourceAsString(path: String): String {
        return this::class.java.classLoader.getResource(path)?.readText().orEmpty()
    }
}
