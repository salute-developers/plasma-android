package com.sdds.utils.config.codec

import com.sdds.utils.config.codec.internal.CommonConfig
import com.sdds.utils.config.codec.internal.ConfigCodec
import com.sdds.utils.config.codec.internal.NativeConfig
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

private val serializer = Json {
    ignoreUnknownKeys = true
}

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Usage: <input_json_path> <output_dir_path> <mode: encode|decode>")
        return
    }

    val inputPath = args[0]
    val outputPath = args[1]
    val mode = args[2]

    val inputFile = File(inputPath)
    val outputFile = File(outputPath)

    if (!inputFile.exists()) {
        println("Input file does not exist: $inputPath")
        return
    }

    val inputJson = inputFile.readText()

    val outputJson = when (mode.lowercase()) {
        "encode" -> ConfigCodec.encode(serializer.decodeFromString(inputJson)).let {
            serializer.encodeToString<NativeConfig>(it)
        }
        "decode" -> ConfigCodec.decode(serializer.decodeFromString(inputJson)).let {
            serializer.encodeToString<CommonConfig>(it)
        }
        else -> {
            println("Invalid mode: $mode. Use 'encode' or 'decode'.")
            return
        }
    }

    outputFile.parentFile.mkdirs()
    outputFile.writeText(outputJson)
    println("Operation '$mode' completed. Output written to $outputPath")
}
