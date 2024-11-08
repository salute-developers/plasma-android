package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
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

    private val fileSpecBuilder by unsafeLazy {
        FileSpec.builder(packageName, fileName)
            .addFileComment(AUTOGEN_COMMENT)
    }

    private val rootTypeBuilders = mutableListOf<TypeSpec.Builder>()
    private val rootPropBuilders = mutableListOf<PropertySpec.Builder>()
    private val rootFunBuilders = mutableListOf<FunSpec.Builder>()

    /**
     * Создает kotlin class в корне файла.
     *
     * @param name имя класса
     * @param modifiers модификаторы класса
     * @param annotation аннотация класса
     * @param primaryConstructor первичный конструктор
     * @param secondaryConstructors список вторичных конструкторов
     * @param superType тип, от которого наследуется класс
     *
     * @return [TypeSpec.Builder]
     */
    fun rootClass(
        name: String,
        modifiers: List<Modifier>? = null,
        annotation: ClassName? = null,
        primaryConstructor: Constructor.Primary? = null,
        secondaryConstructors: List<Constructor.Secondary>? = null,
        superType: TypeName? = null,
        description: String? = null,
    ) = TypeSpec.classBuilder(name).apply {
        annotation?.let(::addAnnotation)
        modifiers?.toKModifiers()?.let(::addModifiers)
        primaryConstructor?.let { addPrimaryConstructor(it) }
        secondaryConstructors?.let { addSecondaryConstructors(it) }
        superType?.let { superclass(it) }
        description?.let(::addKdoc)
        rootTypeBuilders.add(this)
    }

    /**
     * Создает kotlin объект с именем [name] в корне файла.
     * @return [TypeSpec.Builder]
     */
    fun rootObject(name: String) = TypeSpec.objectBuilder(name).also(rootTypeBuilders::add)

    /**
     * Создает val свойство в корне файла.
     *
     * @param name имя свойства
     * @param typeName тип свойства
     * @param parameterizedType типовой аргумент
     * @param initializer инициализатор свойства
     */
    fun appendRootVal(
        name: String,
        typeName: ClassName,
        parameterizedType: ClassName? = null,
        initializer: String? = null,
        modifiers: List<Modifier>? = null,
    ) {
        val type = if (parameterizedType != null) {
            typeName.parameterizedBy(parameterizedType)
        } else {
            typeName
        }
        PropertySpec.builder(name, type).apply {
            initializer?.let(::initializer)
            modifiers?.toKModifiers()?.let(::addModifiers)
            rootPropBuilders.add(this)
        }
    }

    /**
     * Создает функцию в корне файла.
     *
     * @param name название функции
     * @param params параметры функции
     * @param modifiers список модификаторов
     * @param body тело функции
     * @param returnType возвращаемый тип функции
     */
    fun appendRootFun(
        name: String,
        params: List<FunParameter>? = null,
        modifiers: List<Modifier>? = null,
        body: List<String>? = null,
        returnType: TypeName? = null,
        receiver: TypeName? = null,
        description: String? = null,
        annotation: ClassName? = null,
    ) {
        appendFun(
            name = name,
            params = params,
            modifiers = modifiers,
            body = body,
            returnType = returnType,
            receiver = receiver,
            description = description,
            annotation = annotation,
        )
            .also(rootFunBuilders::add)
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
    ) = appendPropertyInternal(
        name = name,
        typeName = typeName.asTypeName(),
        initializer = initializer,
        description = description,
        rootObject = this,
    )

    /**
     * Добавляет kotlin свойство.
     *
     * @param name название
     * @param typeName тип свойства
     * @param initializer иницализатор
     * @param description описание (документация)
     * @param isMutable тип свойства (val/var)
     * @param setter сеттер свойства
     * @param delegate делегат
     *
     * @return [TypeSpec.Builder]
     */
    fun TypeSpec.Builder.appendProperty(
        name: String,
        typeName: TypeName,
        initializer: String? = null,
        description: String? = null,
        modifiers: List<Modifier>? = null,
        isMutable: Boolean = false,
        setter: Setter? = null,
        propGetter: Getter? = null,
        delegate: String? = null,
    ) = appendPropertyInternal(
        name = name,
        typeName = typeName,
        initializer = initializer,
        description = description,
        rootObject = this,
        modifiers = modifiers?.toKModifiers(),
        isMutable = isMutable,
        setter = setter,
        getter = propGetter,
        delegate = delegate,
    )

    /**
     * Добавляет функцию.
     *
     * @param name название функции
     * @param params параметры функции
     * @param modifiers список модификаторов
     * @param body тело функции
     * @param returnType возвращаемый тип функции
     *
     * @return [TypeSpec.Builder]
     */
    fun TypeSpec.Builder.appendFun(
        name: String,
        params: List<FunParameter>? = null,
        modifiers: List<Modifier>? = null,
        body: List<String>? = null,
        receiver: TypeName? = null,
        returnType: TypeName? = null,
        description: String? = null,
    ) = appendFun(
        name = name,
        params = params,
        modifiers = modifiers,
        body = body,
        receiver = receiver,
        returnType = returnType,
        description = description,
        rootObject = this,
    )

    /**
     * Добавляет импорт класса [className]
     */
    fun addImport(className: ClassName) {
        fileSpecBuilder.addImport(className, "")
    }

    /**
     * Добавляет импорты [names] с пакетом [packageName]
     */
    fun addImport(packageName: String, names: List<String>) {
        fileSpecBuilder.addImport(packageName, names)
    }

    /**
     * Добавляет аннотацию Suppress для генерируемого файла
     * c подавлением ппредупреждения [warningName]
     */
    fun addSuppressAnnotation(warningName: String) {
        fileSpecBuilder.addAnnotation(
            AnnotationSpec.builder(Suppress::class)
                .addMember("%S", warningName)
                .useSiteTarget(AnnotationSpec.UseSiteTarget.FILE)
                .build(),
        )
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

    internal fun getInternalClassType(className: String, classPackage: String = packageName) =
        ClassName(classPackage, listOf(className)).also(::addImport)

    private fun TypeSpec.Builder.addPrimaryConstructor(
        primaryConstructor: Constructor.Primary,
    ): TypeSpec.Builder {
        val spec = primaryConstructor(
            FunSpec.constructorBuilder().apply {
                primaryConstructor.parameters?.let { addParameters(it.toParameterSpecs()) }
                primaryConstructor.modifiers?.let { addModifiers(it.toKModifiers()) }
            }.build(),
        )
        val properties = primaryConstructor.parameters?.filter { it.asProperty }
        return if (properties.isNullOrEmpty()) {
            spec
        } else {
            spec.addProperties(properties.toConstructorProperties())
        }
    }

    private fun TypeSpec.Builder.addSecondaryConstructors(constructors: List<Constructor.Secondary>) {
        constructors.forEach { addSecondaryConstructor(it) }
    }

    private fun TypeSpec.Builder.addSecondaryConstructor(
        constructor: Constructor.Secondary,
    ): TypeSpec.Builder {
        val spec = addFunction(
            FunSpec.constructorBuilder().apply {
                constructor.parameters?.let { addParameters(it.toParameterSpecs()) }
                constructor.modifiers?.let { addModifiers(it.toKModifiers()) }
                constructor.thisConstructorCallParams?.let { callThisConstructor(it.joinToString()) }
            }
                .build(),
        )
        val properties = constructor.parameters?.filter { it.asProperty }
        return if (properties.isNullOrEmpty()) {
            spec
        } else {
            spec.addProperties(properties.toConstructorProperties())
        }
    }

    private fun appendPropertyInternal(
        name: String,
        typeName: TypeName,
        initializer: String? = null,
        description: String? = null,
        rootObject: TypeSpec.Builder? = null,
        modifiers: List<KModifier>? = null,
        isMutable: Boolean = false,
        setter: Setter? = null,
        getter: Getter? = null,
        delegate: String? = null,
    ) {
        if (typeName is ClassName) addImport(typeName)
        val spec = PropertySpec.builder(
            name,
            typeName,
        )
        spec.mutable(isMutable)
        modifiers?.let(spec::addModifiers)
        initializer?.let(spec::initializer)
        description?.let(spec::addKdoc)
        setter?.let { spec.setter(it.toFunSpec()) }
        getter?.let { spec.getter(it.toFunSpec()) }
        delegate?.let(spec::delegate)

        val prop = spec.build()
        rootObject?.addProperty(prop)
            ?: fileSpecBuilder.addProperty(prop)
    }

    private fun appendFun(
        name: String,
        params: List<FunParameter>? = null,
        modifiers: List<Modifier>? = null,
        body: List<String>? = null,
        returnType: TypeName? = null,
        receiver: TypeName? = null,
        description: String? = null,
        rootObject: TypeSpec.Builder? = null,
        annotation: ClassName? = null,
    ): FunSpec.Builder {
        return FunSpec.builder(name).apply {
            modifiers?.let { addModifiers(it.toKModifiers()) }
            annotation?.let(::addAnnotation)
            params?.let { resolvedParams ->
                addParameters(resolvedParams.toParameterSpecs())
            }
            body?.forEach(::addCode)
            returnType?.let(::returns)
            receiver?.let(this::receiver)
            description?.let(::addKdoc)
            rootObject?.addFunction(this.build())
        }
    }

    private fun build(): FileSpec {
        buildRoots()
        return fileSpecBuilder
            .indent(DEFAULT_FILE_INDENT)
            .build()
    }

    private fun buildRoots() {
        rootTypeBuilders.forEach { fileSpecBuilder.addType(it.build()) }
        rootPropBuilders.forEach { fileSpecBuilder.addProperty(it.build()) }
        rootFunBuilders.forEach { fileSpecBuilder.addFunction(it.build()) }
    }

    private fun List<Modifier>.toKModifiers(): List<KModifier> =
        map {
            when (it) {
                Modifier.INTERNAL -> KModifier.INTERNAL
                Modifier.ABSTRACT -> KModifier.ABSTRACT
                Modifier.OVERRIDE -> KModifier.OVERRIDE
                Modifier.PRIVATE -> KModifier.PRIVATE
                Modifier.DATA -> KModifier.DATA
                Modifier.INFIX -> KModifier.INFIX
            }
        }

    private fun Setter.toFunSpec(): FunSpec {
        val builder = FunSpec.setterBuilder()
        when (this) {
            is Setter.Empty -> modifiers?.let { builder.addModifiers(it.toKModifiers()) }
        }
        return builder.build()
    }

    private fun Getter.toFunSpec(): FunSpec {
        val builder = FunSpec.getterBuilder()
        when (this) {
            is Getter.Empty -> modifiers?.let { builder.addModifiers(it.toKModifiers()) }
            is Getter.Annotated -> {
                modifiers?.let { builder.addModifiers(it.toKModifiers()) }
                annotations?.let { annotationList ->
                    annotationList.forEach { builder.addAnnotation(it) }
                }
                body?.let { builder.addCode(it) }
            }
        }
        return builder.build()
    }

    private fun List<FunParameter>.toParameterSpecs(): List<ParameterSpec> =
        map { it.toParameterSpec() }

    private fun List<FunParameter>.toConstructorProperties(): List<PropertySpec> =
        map { it.toConstructorProperty() }

    private fun FunParameter.toParameterSpec() =
        ParameterSpec.builder(name = name, type = type).apply {
            defValue?.let(::defaultValue)
        }.build()

    private fun FunParameter.toConstructorProperty() =
        PropertySpec.builder(name = name, type = type).apply {
            initializer(name)
            this@toConstructorProperty.modifiers?.let { addModifiers(it.toKModifiers()) }
        }.build()

    /**
     * Конструктор класса
     */
    internal sealed class Constructor {
        data class Primary(
            val parameters: List<FunParameter>? = null,
            val modifiers: List<Modifier>? = null,
        ) : Constructor()

        data class Secondary(
            val parameters: List<FunParameter>? = null,
            val modifiers: List<Modifier>? = null,
            val thisConstructorCallParams: List<String>? = null,
        ) : Constructor()
    }

    /**
     * Kotlin модифкаторы
     */
    internal enum class Modifier {
        ABSTRACT,
        PRIVATE,
        INTERNAL,
        OVERRIDE,
        DATA,
        INFIX,
    }

    /**
     * Параметр функции или конструктора
     */
    internal data class FunParameter(
        val name: String,
        val type: TypeName,
        val defValue: String? = null,
        val asProperty: Boolean = false,
        val modifiers: List<Modifier>? = null,
    )

    /**
     * Kotlin геттер
     */
    internal sealed class Getter {

        /**
         * Пустой геттер с опциональными модификаторами [modifiers]
         */
        data class Empty(val modifiers: List<Modifier>? = null) : Getter()

        /**
         * Геттер
         */
        data class Annotated(
            val annotations: List<ClassName>? = null,
            val modifiers: List<Modifier>? = null,
            val body: String? = null,
        ) : Getter()
    }

    /**
     * Kotlin сеттер
     */
    internal sealed class Setter {

        /**
         * Пустой сеттер с опциональными модификаторами [modifiers]
         */
        data class Empty(val modifiers: List<Modifier>? = null) : Setter()
    }

    sealed class OutputLocation {
        class Directory(val dir: File) : OutputLocation()

        class Stream(val stream: ByteArrayOutputStream) : OutputLocation()
    }

    companion object {
        internal const val DEFAULT_FILE_INDENT = "    "

        val TypeString = String::class.asClassName()
        val TypeFloat = Float::class.asClassName()
        val TypeInt = Int::class.asClassName()
        val TypeFloatArray = FloatArray::class.asClassName()
        val TypeIntArray = IntArray::class.asClassName()
        val TypeContext = ClassName("android.content", "Context")
        val TypeModifier = ClassName("androidx.compose.ui", "Modifier")
        val TypeColor = ClassName("androidx.compose.ui.graphics", listOf("Color"))
        val TypeShaderBrush = ClassName("androidx.compose.ui.graphics", listOf("ShaderBrush"))
        val TypeBrush = ClassName("androidx.compose.ui.graphics", listOf("Brush"))
        val TypeListOfShaderBrush = List::class.asClassName().parameterizedBy(TypeShaderBrush)
        val TypeListOfBrush = List::class.asClassName().parameterizedBy(TypeBrush)
        val TypeTextStyle = ClassName("androidx.compose.ui.text", listOf("TextStyle"))
        val TypeFont = ClassName("androidx.compose.ui.text.font", "Font")
        val TypeFontWeight = ClassName("androidx.compose.ui.text.font", "FontWeight")
        val TypeFontStyle = ClassName("androidx.compose.ui.text.font", "FontStyle")
        val TypeFontFamily = ClassName("androidx.compose.ui.text.font", "FontFamily")
        val TypeLineHeightStyle = ClassName("androidx.compose.ui.text.style", "LineHeightStyle")
        val TypePlatformTextStyle = ClassName("androidx.compose.ui.text", "PlatformTextStyle")
        val TypeSp = ClassName("androidx.compose.ui.unit", "sp")
        val TypeDp = ClassName("androidx.compose.ui.unit", "Dp")
        val TypeDpExtension = ClassName("androidx.compose.ui.unit", "dp")
        val TypeListOfColors = List::class.asClassName().parameterizedBy(TypeColor)
        val TypeMapOfColors = Map::class.asClassName().parameterizedBy(TypeString, TypeColor)
        val TypeMapOfListOfShaderBrush = Map::class.asClassName().parameterizedBy(TypeString, TypeListOfShaderBrush)
        val TypeMutableMapOfColors = ClassName(
            "kotlin.collections",
            "MutableMap",
        ).parameterizedBy(TypeString, TypeColor)
        val TypeMutableMapOfListOfShaderBrush =
            ClassName("kotlin.collections", "MutableMap")
                .parameterizedBy(TypeString, TypeListOfShaderBrush)
        val TypeRoundRectShape =
            ClassName("androidx.compose.foundation.shape", listOf("RoundedCornerShape"))
        val TypeCornerBasedShape =
            ClassName("androidx.compose.foundation.shape", listOf("CornerBasedShape"))
        val TypeCornerSize = ClassName("androidx.compose.foundation.shape", listOf("CornerSize"))
        val TypeAnnotationImmutable = ClassName("androidx.compose.runtime", listOf("Immutable"))
        val TypeAnnotationComposable = ClassName("androidx.compose.runtime", listOf("Composable"))
        val TypeAnnotationReadOnlyComposable = ClassName("androidx.compose.runtime", listOf("ReadOnlyComposable"))
        val TypeProvidableCompositionLocal =
            ClassName("androidx.compose.runtime", listOf("ProvidableCompositionLocal"))

        fun getLambdaType(annotation: ClassName? = null, receiver: ClassName? = null): TypeName {
            val lambdaType = LambdaTypeName.get(
                receiver = receiver,
                returnType = Unit::class.asClassName(),
            )
            return annotation?.let {
                lambdaType.copy(annotations = listOf(AnnotationSpec.builder(it).build()))
            } ?: lambdaType
        }

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

        fun createFunCall(funName: String, parameters: List<String>): String {
            return buildString {
                append(funName)
                if (parameters.size > 1) {
                    appendReproducibleNewLine("(")
                    parameters.forEach {
                        append(DEFAULT_FILE_INDENT)
                        append(it)
                        appendReproducibleNewLine(",")
                    }
                } else {
                    append("(")
                    parameters.forEach {
                        append(it)
                    }
                }
                append(")")
            }
        }
    }
}
