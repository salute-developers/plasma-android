package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Annotation
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.SpacingTokenResult
import com.sdds.plugin.themebuilder.internal.token.SpacingToken
import com.sdds.plugin.themebuilder.internal.token.SpacingTokenValue
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.SpacingTokenValidator
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

/**
 * Генератор токенов отступов
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param dimensAggregator агрегатор размеров
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @param namespace пакет проекта
 * @author Малышев Александр on 07.03.2024
 */
internal class SpacingTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val spacingTokenValues: Map<String, SpacingTokenValue>,
    private val dimensionsConfig: DimensionsConfig,
    namespace: String,
) : TokenGenerator<SpacingToken, SpacingTokenResult>(target) {

    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create(SPACING_TOKENS_NAME) }
    private val rootSpacings by unsafeLazy { ktFileBuilder.rootObject(SPACING_TOKENS_NAME, SPACING_TOKENS_DESC) }
    private val rFileImport = ClassName(namespace, "R")

    private val composeTokenDataCollector =
        mutableListOf<SpacingTokenResult.TokenData>()
    private val viewTokenDataCollector =
        mutableListOf<SpacingTokenResult.TokenData>()

    override fun collectResult() = SpacingTokenResult(
        composeTokens = composeTokenDataCollector,
        viewTokens = viewTokenDataCollector,
    )

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        super.generateCompose()
        ktFileBuilder.addImport(KtFileBuilder.TypeDpExtension)
        if (dimensionsConfig.fromResources) {
            ktFileBuilder.addImport(KtFileBuilder.TypeDimensionResource)
            ktFileBuilder.addImport(rFileImport)
        }
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: SpacingToken): Boolean {
        val tokenValue = spacingTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for spacing token ${token.name}. " +
                    "It should be in android_spacing.json.",
            )
        SpacingTokenValidator.validate(tokenValue, token.name)
        val dimenValue = DimenData(
            name = token.xmlName,
            value = tokenValue.value,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(dimenValue)
        viewTokenDataCollector.add(
            SpacingTokenResult.TokenData(
                attrName = SpacingToken.getAttrName(token.name),
                tokenRefName = resourceReferenceProvider.dimen(dimenValue),
                description = token.description,
            ),
        )
        return true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: SpacingToken): Boolean = with(ktFileBuilder) {
        val tokenValue = spacingTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for spacing token ${token.name}. " +
                    "It should be in android_spacing.json.",
            )
        SpacingTokenValidator.validate(tokenValue, token.name)

        if (dimensionsConfig.fromResources) {
            rootSpacings.addSpacingTokenWithResources(token, tokenValue)
        } else {
            rootSpacings.addSpacingToken(token, tokenValue)
        }
        val decapitalizedName = token.ktName.decapitalized()
        composeTokenDataCollector.add(
            SpacingTokenResult.TokenData(
                attrName = decapitalizedName,
                tokenRefName = decapitalizedName,
                description = token.description,
            ),
        )
        return@with true
    }

    private fun TypeSpec.Builder.addSpacingToken(
        token: SpacingToken,
        value: SpacingTokenValue,
    ) = with(ktFileBuilder) {
        val initializer = "${value.value * dimensionsConfig.multiplier}.dp"

        appendProperty(
            token.ktName.decapitalized(),
            KtFileBuilder.TypeDp,
            initializer,
            token.description,
        )
    }

    private fun TypeSpec.Builder.addSpacingTokenWithResources(
        token: SpacingToken,
        value: SpacingTokenValue,
    ) = with(ktFileBuilder) {
        val dimenValue = DimenData(
            name = token.xmlName,
            value = value.value,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(dimenValue)
        val initializer = "dimensionResource(${resourceReferenceProvider.dimenR(dimenValue)})"

        appendProperty(
            name = token.ktName.decapitalized(),
            typeName = KtFileBuilder.TypeDp,
            propGetter = KtFileBuilder.Getter.Annotated(
                annotations = listOf(
                    Annotation(KtFileBuilder.TypeAnnotationComposable),
                    Annotation(KtFileBuilder.TypeAnnotationReadOnlyComposable),
                ),
                body = "return $initializer",
            ),
            description = token.description,
        )
    }

    companion object {
        internal const val SPACING_TOKENS_NAME = "SpacingTokens"
        internal const val SPACING_TOKENS_DESC = "Токены отступов"
    }
}
