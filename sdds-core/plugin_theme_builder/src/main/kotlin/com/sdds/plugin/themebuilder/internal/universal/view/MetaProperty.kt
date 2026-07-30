package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.universal.Color
import com.sdds.plugin.themebuilder.internal.universal.Dimension
import com.sdds.plugin.themebuilder.internal.universal.FloatValue
import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.Stateful
import com.sdds.plugin.themebuilder.internal.universal.Typography
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner

/**
 * Свойство View-генератора, построенное из меты.
 *
 * Содержит XML-атрибут, суффикс имени ресурса и способ достать значение из
 * универсальных props. Это узкий контракт между метой, property mapper'ами,
 * резолвером значений и writer'ом ресурсов; он не зависит от удалённой иерархии
 * View-генераторов.
 */
internal interface ViewProperty<out T : Stateful<*, *>> {
    val attribute: String
    val fileSuffix: String
    fun provide(owner: UniversalPropertyOwner): T?
}

/** Цветовое свойство с отдельным суффиксом имени color/xml-ресурса. */
internal interface ViewColorProperty : ViewProperty<Color> {
    val colorFileSuffix: String
    override val fileSuffix: String get() = colorFileSuffix
}

/**
 * Цветовое свойство: поддерживает градиенты, состояния и цветовые вариации.
 *
 * @param alphaKey ключ конфига с прозрачностью для формы `alpha(<ключ>)`. Альфа
 *  берётся из **тех же** props, что и цвет: у компонента с несколькими видами она
 *  задана внутри вида (напр. `loadingAlpha` у кнопки), и поиск на уровне вариации
 *  её не находит. Отсутствие альфы в props означает, что для этого вида значения
 *  под состоянием нет.
 */
internal class MetaColorProperty(
    val meta: PropertyMeta,
    private val alphaKey: String = "",
) : ViewColorProperty {
    override val attribute: String = meta.attrName
    override val colorFileSuffix: String = meta.resSuffix
    override fun provide(owner: UniversalPropertyOwner): Color? {
        val color = owner.getValue(meta.type, meta.id) as? Color
        return when {
            color == null -> null
            alphaKey.isEmpty() -> color
            else -> (owner.getValue(PropertyType.FLOAT, alphaKey) as? FloatValue)
                ?.let { color.copy(alpha = it.value) }
        }
    }
}

/** Размерное свойство. */
internal class MetaDimensionProperty(
    val meta: PropertyMeta,
) : ViewProperty<Dimension> {
    override val attribute: String = meta.attrName
    override val fileSuffix: String = meta.resSuffix
    override fun provide(owner: UniversalPropertyOwner): Dimension? =
        owner.getValue(meta.type, meta.id) as? Dimension
}

/** Свойство типографики. */
internal class MetaTypographyProperty(
    val meta: PropertyMeta,
) : ViewProperty<Typography> {
    override val attribute: String = meta.attrName
    override val fileSuffix: String = meta.resSuffix
    override fun provide(owner: UniversalPropertyOwner): Typography? =
        owner.getValue(meta.type, meta.id) as? Typography
}

/** Дробное свойство (напр. прозрачность). */
internal class MetaFloatProperty(
    val meta: PropertyMeta,
) : ViewProperty<FloatValue> {
    override val attribute: String = meta.attrName
    override val fileSuffix: String = meta.resSuffix
    override fun provide(owner: UniversalPropertyOwner): FloatValue? =
        owner.getValue(meta.type, meta.id) as? FloatValue
}
