package com.sdds.plugin.themebuilder.internal.universal

/**
 * Выводит идентификатор мультиплатформенной иконки (`ImageVector`-property на объекте `SddsIcons`
 * в модуле `icons-compose`) из имени drawable-ресурса.
 *
 * Модуль `icons-compose` генерируется тулом **Valkyrie** из vector XML: имя `ic_add_fill_16.xml`
 * превращается в property `SddsIcons.AddFill16`. Эта утилита воспроизводит правила именования
 * Valkyrie, чтобы генератор стилей мог ссылаться на те же идентификаторы.
 *
 * Правила (по наблюдаемому набору иконок):
 * - имя разбивается на сегменты по разделителям `_`, `-`, `.`, пробел;
 * - первая буква каждого сегмента переводится в верхний регистр;
 * - буква, идущая сразу за цифрой, переводится в верхний регистр
 *   (например `2x2` -> `2X2`, `3d` -> `3D`);
 * - цифры сохраняются как есть, размерные суффиксы (`16`/`24`/`36`) остаются в конце.
 *
 * ВНИМАНИЕ: правила — реплика поведения Valkyrie (вариант A). Возможное расхождение при
 * обновлении Valkyrie снимается валидацией против реального набора имён (см. [IconPropertyMapper]).
 */
internal object ComposeIconName {

    private val separators = setOf('_', '-', '.', ' ')

    /**
     * @param drawableBaseName имя drawable без префикса `ic_` и расширения, например `add_fill_16`
     * @return идентификатор `ImageVector`-property, например `AddFill16`
     */
    fun fromDrawableName(drawableBaseName: String): String {
        val segments = drawableBaseName
            .split { it in separators }
            .filter { it.isNotEmpty() }
        return buildString {
            segments.forEach { segment ->
                append(pascalizeSegment(segment))
            }
        }
    }

    private fun String.split(isSeparator: (Char) -> Boolean): List<String> {
        val result = mutableListOf<String>()
        val current = StringBuilder()
        forEach { ch ->
            if (isSeparator(ch)) {
                result.add(current.toString())
                current.clear()
            } else {
                current.append(ch)
            }
        }
        result.add(current.toString())
        return result
    }

    private fun pascalizeSegment(segment: String): String = buildString {
        var prevIsDigit = false
        segment.forEachIndexed { index, ch ->
            val transformed = when {
                index == 0 && ch.isLetter() -> ch.uppercaseChar()
                prevIsDigit && ch.isLetter() -> ch.uppercaseChar()
                else -> ch
            }
            append(transformed)
            prevIsDigit = ch.isDigit()
        }
    }
}
