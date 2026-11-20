package com.sdds.plugin.themebuilder.internal.tenant

import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue

/**
 * Дополняет диф типографики подтенанта стилями, которые ссылаются на переопределённые им
 * семейства шрифтов.
 *
 * Диф стилей ([tenantDiff]) обычно вычисляют как `tenantToDefaultDiff` и складывают в объект
 * токенов подтенанта только реально отличающиеся стили. Но стиль может быть идентичен дефолту
 * по всем полям (включая [TypographyTokenValue.fontFamilyRef]) и при этом резолвиться в другое
 * начертание: если подтенант переопределил семейство, на которое этот стиль ссылается.
 * Такой стиль обязан попасть в объект токенов подтенанта — иначе тема подтянет дефолтный стиль
 * со ссылкой на `FontTokens`, а не на `FontTokens<tenant>`.
 *
 * @param defaultTypography полные значения токенов типографики дефолтного тенанта.
 * @param tenantDiff уже вычисленный диф стилей подтенанта относительно дефолта.
 * @param overriddenFontFamilies имена семейств, переопределённых подтенантом (ключи дифа шрифтов).
 * Имя семейства в ссылке берётся по последнему сегменту [TypographyTokenValue.fontFamilyRef]
 * (`fontFamily.<name>` -> `<name>`).
 */
internal fun fontDependentTypographyDiff(
    defaultTypography: Map<String, TypographyTokenValue>,
    tenantDiff: Map<String, TypographyTokenValue>,
    overriddenFontFamilies: Set<String>,
): Map<String, TypographyTokenValue> {
    if (overriddenFontFamilies.isEmpty()) return tenantDiff
    val dependent = defaultTypography
        .filterKeys { it !in tenantDiff }
        .filterValues { it.fontFamilyRef.substringAfterLast('.') in overriddenFontFamilies }
    return tenantDiff + dependent
}
