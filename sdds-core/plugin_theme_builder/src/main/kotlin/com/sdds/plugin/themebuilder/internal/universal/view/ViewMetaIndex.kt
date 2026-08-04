package com.sdds.plugin.themebuilder.internal.universal.view

/**
 * Индекс View-меты по **логическому имени компонента**.
 *
 * API одного компонента может быть описан несколькими `declare-styleable`
 * (основной + вложенные, напр. `Avatar` + `SdAvatarStatus`), поэтому потребителю
 * нужна склейка: свойства и привязки состояний объединяются, идентичность берётся
 * из той записи, где она размечена.
 */
internal class ViewMetaIndex(private val meta: ApiMeta) {

    private val byComponent: Map<String, List<ComponentMeta>> = meta.components
        .flatMap { component -> component.componentNames.map { it to component } }
        .groupBy({ (name, _) -> name }, { (_, entry) -> entry })

    /** Общий словарь состояний модуля: имя состояния → drawable-атрибут. */
    val sharedStates: Map<String, String> get() = meta.sharedStates

    /**
     * Возвращает склеенную мету компонента либо `null`, если компонента нет в мете
     * или у него не размечена идентичность (не переведён на универсальный генератор).
     */
    fun forComponent(componentName: String): MergedComponentMeta? {
        val entries = byComponent[componentName] ?: return null
        val identity = entries.firstNotNullOfOrNull { it.identity[componentName] } ?: return null
        val (subStyleEntries, ownEntries) = entries.partition { it.subStyle != null }
        val params = ownEntries.flatMap { it.params }.distinctBy { it.attrName to it.id }
        return MergedComponentMeta(
            componentName = componentName,
            identity = identity,
            params = params,
            stateSets = entries.flatMap { it.stateSets },
            subStyles = subStyleEntries.map { entry ->
                SubStyleMeta(info = requireNotNull(entry.subStyle), params = entry.params)
            },
        )
    }
}

/**
 * Вложенная семья стилей компонента вместе со своими свойствами.
 *
 * @property info объявление семьи из разметки.
 * @property params свойства, попадающие в стиль вложенной семьи.
 */
internal data class SubStyleMeta(
    val info: SubStyleInfo,
    val params: List<PropertyMeta>,
)

/**
 * Склеенное описание компонента, готовое к генерации.
 *
 * @property componentName логическое имя компонента.
 * @property identity идентичность: сид имён `ColorState`, `defStyleAttr`, родительский стиль.
 * @property params темизируемые свойства из всех `declare-styleable` компонента.
 * @property stateSets наборы привязок состояний из всех `declare-styleable` компонента.
 * @property subStyles вложенные семьи стилей компонента.
 */
internal data class MergedComponentMeta(
    val componentName: String,
    val identity: ComponentIdentity,
    val params: List<PropertyMeta>,
    val stateSets: List<StateSet>,
    val subStyles: List<SubStyleMeta> = emptyList(),
)
