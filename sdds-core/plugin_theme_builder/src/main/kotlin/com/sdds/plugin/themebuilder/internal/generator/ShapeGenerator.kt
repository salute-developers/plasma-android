package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shapesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File

/**
 * Генератор токенов форм
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param dimensAggregator агрегатор размеров
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @author Малышев Александр on 07.03.2024
 */
internal class ShapeGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : TokenGenerator<Token<ShapeTokenValue>>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ShapeTokens") }
    private val rootRoundShapes by unsafeLazy { ktFileBuilder.rootObject("RoundShapeTokens") }
    private var needCreateStyle: Boolean = true

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        super.generateViewSystem()
        xmlDocumentBuilder.build(outputResDir.shapesXmlFile())
    }

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        super.generateCompose()
        ktFileBuilder.addImport(KtFileBuilder.TypeDpExtension)
        ktFileBuilder.addImport(KtFileBuilder.TypeCornerSize)
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: Token<ShapeTokenValue>): Boolean = with(xmlDocumentBuilder) {
        val roundedShapeToken = token as? RoundedShapeToken ?: return@with false
        val tokenValue = roundedShapeToken.value ?: return@with false
        val cornerSize = DimenData(
            name = "${roundedShapeToken.name.techToSnakeCase()}_corner_size",
            value = tokenValue.cornerRadius,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(cornerSize)
        if (needCreateStyle) {
            needCreateStyle = false
            appendStyle("Shape")
            appendStyle("Shape.Round") {
                appendElement(ElementName.ITEM, "cornerFamily", "rounded", usePrefix = false)
            }
        }
        appendComment(roundedShapeToken.description)
        appendStyle("Shape.${roundedShapeToken.xmlName}") {
            appendElement(
                ElementName.ITEM,
                "cornerSize",
                resourceReferenceProvider.dimen(cornerSize),
                usePrefix = false,
            )
        }
        return@with true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: Token<ShapeTokenValue>): Boolean = with(ktFileBuilder) {
        val roundedShapeToken = token as? RoundedShapeToken ?: return@with false
        val tokenValue = roundedShapeToken.value ?: return@with false

        val value = "${tokenValue.cornerRadius}.dp"
        val initializer = KtFileBuilder.createConstructorCall(
            "RoundedCornerShape",
            "CornerSize($value)",
        )
        rootRoundShapes.appendProperty(token.ktName, KtFileBuilder.TypeRoundRectShape, initializer, token.description)
        return@with true
    }
}
