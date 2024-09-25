package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.drawableXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import java.io.File

/**
 * Генератор drawable для градиентов.
 *
 * @property outputResDir директория с ресурсами
 * @property xmlBuilderFactory фабрика билдера xml-файла
 * @property resourceReferenceProvider провайдер ссылок на ресурсы
 */
internal class GradientDrawableGenerator(
    private val outputResDir: File,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val resourcePrefix: String,
) : SimpleBaseGenerator {

    private val xmlDocumentBuilders = mutableMapOf<String, XmlResourcesDocumentBuilder>()

    /**
     * Добавляет drawable для слоя градиента
     *
     * @param drawableName название drawable
     * @param styleRef ссылка на стиль градиента
     *
     * @return вернет ссылку на drawable
     */
    fun addDrawable(drawableName: String, styleRef: String): String {
        xmlBuilderFactory.create(
            rootAttributes = mapOf(
                "xmlns:app" to "http://schemas.android.com/apk/res-auto",
                SHADER_ATTRIBUTE_NAME to styleRef,
                "class" to DRAWABLE_CLASS,
            ),
            rootElement = "drawable",
        ).apply {
            appendComment("Drawable for $drawableName")
            xmlDocumentBuilders[drawableName] = this
        }

        return resourceReferenceProvider.drawable(drawableName)
    }

    /**
     * Добавляет LayerDrawable для градиента
     *
     * @param drawableName название drawable
     * @param drawableRefs ссылки на дочерние drawable слоев градиента
     *
     * @return вернет ссылку на drawable
     */
    fun addLayerListDrawable(
        drawableName: String,
        drawableRefs: List<String>,
    ): String {
        xmlBuilderFactory.create(
            rootAttributes = mapOf("xmlns:android" to "http://schemas.android.com/apk/res/android"),
            rootElement = "layer-list",
        ).apply {
            appendComment("Drawable for $drawableName")
            drawableRefs.forEach { drawableRef ->
                appendBaseElement(
                    elementName = XmlResourcesDocumentBuilder.ElementName.ITEM.value,
                    attrs = mapOf("android:drawable" to drawableRef),
                )
            }
            xmlDocumentBuilders[drawableName] = this
        }

        return resourceReferenceProvider.drawable(drawableName)
    }

    override fun generate() {
        xmlDocumentBuilders.forEach {
            it.value.build(outputResDir.drawableXmlFile(it.key.withPrefixIfNeed(resourcePrefix)))
        }
    }

    private companion object {
        const val DRAWABLE_CLASS = "com.sdds.uikit.shape.ShapeDrawable"
        const val SHADER_ATTRIBUTE_NAME = "app:sd_shaderAppearance"
    }
}
