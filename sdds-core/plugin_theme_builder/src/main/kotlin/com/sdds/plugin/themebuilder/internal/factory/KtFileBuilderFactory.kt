package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder

/**
 * Фабрика для [KtFileBuilder]
 * @param packageResolver менеджер внутренних пакетов themeBuilder
 * @author Малышев Александр on 07.03.2024
 */
internal class KtFileBuilderFactory(private val packageResolver: PackageResolver) {

    /**
     * Создает [KtFileBuilder]
     */
    fun create(
        fileName: String,
        targetPackage: TargetPackage = TargetPackage.TOKENS,
    ): KtFileBuilder =
        KtFileBuilder(
            packageName = packageResolver.getPackage(targetPackage),
            fileName = fileName,
        )
}
