package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import org.gradle.kotlin.dsl.support.appendReproducibleNewLine
import java.io.ByteArrayOutputStream
import java.io.File
import kotlin.reflect.KClass

/**
 * Делегат для построения kt файлов
 * @param packageName название пакета, куда будет сохранен файл
 * @param fileName название файла
 * @author Малышев Александр on 13.03.2024
 */
internal class KtFileBuilder(
    private val packageName: String,
    private val fileName: String,
) {

    private val fileSpecBuilder by unsafeLazy { FileSpec.builder(packageName, fileName) }
    private val roots = mutableListOf<TypeSpec.Builder>()

    /**
     * Создает kotlin объект с именем [name] в корне файла
     * @return [TypeSpec.Builder]
     */
    fun rootObject(name: String): TypeSpec.Builder {
        return TypeSpec.objectBuilder(name).also {
            roots.add(it)
        }
    }

    /**
     * Добавляет kotlin свойство с именем [name], типом [typeName], инициализатором [initializer]
     * и описанием (документацией) [description]
     * @return [TypeSpec.Builder]
     */
    fun TypeSpec.Builder.appendProperty(
        name: String,
        typeName: KClass<*>,
        initializer: String? = null,
        description: String? = null,
    ) = appendProperty(name, typeName.asTypeName(), initializer, description, this)

    /**
     * Добавляет kotlin свойство с именем [name], типом [typeName], инициализатором [initializer]
     * и описанием (документацией) [description]
     * @return [TypeSpec.Builder]
     */
    fun TypeSpec.Builder.appendProperty(
        name: String,
        typeName: TypeName,
        initializer: String? = null,
        description: String? = null,
    ) = appendProperty(name, typeName, initializer, description, this)

    /**
     * Добавляет импорт класса [className]
     */
    fun addImport(className: ClassName) {
        fileSpecBuilder.addImport(className, "")
    }

    /**
     * Сохраняет файл в директорию [output]
     */
    fun build(output: OutputLocation) {
        val file = build()
        when (output) {
            is OutputLocation.Directory -> file.writeTo(output.dir)
            is OutputLocation.Stream -> output.stream.writer().use {
                file.writeTo(it)
            }
        }
    }

    private fun appendProperty(
        name: String,
        typeName: TypeName,
        initializer: String? = null,
        description: String? = null,
        rootObject: TypeSpec.Builder? = null,
    ) {
        if (typeName is ClassName) addImport(typeName)
        var spec = PropertySpec.builder(
            name,
            typeName,
        )
        if (initializer != null) {
            spec = spec.initializer(initializer)
        }
        if (description != null) {
            spec = spec.addKdoc(description)
        }
        val prop = spec.build()
        rootObject?.addProperty(prop)
            ?: fileSpecBuilder.addProperty(prop)
    }

    private fun build(): FileSpec {
        roots.forEach { fileSpecBuilder.addType(it.build()) }
        return fileSpecBuilder
            .indent(DEFAULT_FILE_INDENT)
            .build()
    }

    sealed class OutputLocation {
        class Directory(val dir: File) : OutputLocation()

        class Stream(val stream: ByteArrayOutputStream) : OutputLocation()
    }

    companion object {
        private const val DEFAULT_FILE_INDENT = "    "
        val TypeColor = ClassName("androidx.compose.ui.graphics", listOf("Color"))
        val TypeTextStyle = ClassName("androidx.compose.ui.text", listOf("TextStyle"))
        val TypeFontWeight = ClassName("androidx.compose.ui.text.font", "FontWeight")
        val TypeSp = ClassName("androidx.compose.ui.unit", "sp")
        val TypeDp = ClassName("androidx.compose.ui.unit", "Dp")
        val TypeDpExtension = ClassName("androidx.compose.ui.unit", "dp")
        val TypeListOfColors = List::class.asClassName().parameterizedBy(TypeColor)
        val TypeRoundRectShape = ClassName("androidx.compose.foundation.shape", listOf("RoundedCornerShape"))
        val TypeCornerSize = ClassName("androidx.compose.foundation.shape", listOf("CornerSize"))

        /**
         * Добавляет kotlin объект с названием [name], описанием [description]
         * и содержанием [content] в текущий тип [TypeSpec].
         */
        fun TypeSpec.Builder.appendObject(
            name: String,
            description: String? = null,
            content: TypeSpec.Builder.() -> Unit,
        ) {
            addType(
                TypeSpec.objectBuilder(name)
                    .also { builder ->
                        if (description != null) builder.addKdoc(description)
                    }
                    .apply(content)
                    .build(),
            )
        }

        /**
         * Создает строку - вызов конструктора с именем [constructorName]
         * и инициализаторами [initializers]
         */
        fun createConstructorCall(
            constructorName: String,
            vararg initializers: String,
        ): String {
            return buildString {
                append(constructorName)
                if (initializers.size > 1) {
                    appendReproducibleNewLine("(")
                    initializers.forEach {
                        append(DEFAULT_FILE_INDENT)
                        append(it)
                        appendReproducibleNewLine(",")
                    }
                } else {
                    append("(")
                    initializers.forEach {
                        append(it)
                    }
                }
                append(")")
            }
        }
    }
}
