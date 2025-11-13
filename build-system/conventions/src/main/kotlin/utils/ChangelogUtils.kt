package utils

import org.commonmark.node.*
import org.commonmark.parser.Parser
import java.text.SimpleDateFormat
import java.util.Date

/**
 * Тип секции файла changelog
 */
enum class ChangelogSectionType {
    /**
     * Функциональные изменения
     */
    CORE,

    /**
     * Изменения в стилях и токенах
     */
    LIB,
}

/**
 * Элемент изменений в changelog.
 *
 * @property text Текст изменения.
 * @property link Ссылка на pull request, если есть.
 * @property id Номер pull request, если есть.
 */
data class ChangelogItem(val text: String, val link: String? = null, val id: Int? = null)

/**
 * Компонент в changelog, содержащий список изменений.
 *
 * @property component Название компонента.
 * @property children Список изменений компонента.
 */
data class ChangelogComponent(val component: String, val children: MutableList<ChangelogItem>)

/**
 * Раздел changelog, сгруппированный по компонентам.
 *
 * @property title Название раздела (обычно соответствует имени библиотеки или модуля).
 * @property components Список компонентов в разделе.
 */
data class ChangelogSection(
    val type: ChangelogSectionType,
    val title: String,
    val components: List<ChangelogComponent>,
)

/**
 * Полный changelog для конкретной версии.
 *
 * @property version Версия библиотеки или приложения.
 * @property sections Список разделов с изменениями.
 * @property date дата релиза
 */
data class Changelog(
    val version: String,
    val sections: List<ChangelogSection>,
    val date: String = getReleaseDate(),
)

/**
 * Данные Changelog для загрузки на S3
 */
data class ChangelogDto(
    val date: String,
    val core: List<ChangelogComponent>?,
    val lib: List<ChangelogComponent>?,
)

/**
 * Преобразует [Changelog] в [ChangelogDto]
 */
fun Changelog.toDto(): ChangelogDto =
    ChangelogDto(
        date = date,
        core = sections.find { it.type == ChangelogSectionType.CORE }?.components,
        lib = sections.find { it.type == ChangelogSectionType.LIB }?.components,
    )

/**
 * Преобразует changelog в формат Markdown.
 *
 * @return Строка в формате Markdown с заголовками, компонентами и изменениями.
 */
fun Changelog.toMarkdown(): String = buildString {
    appendLine()
    appendLine("## $version")
    sections.forEach {
        appendSection(it)
    }
}.trimEnd()

private val ChangelogSection.prettyTitle: String
    get() = when(title) {
        "sdds-uikit", "sdds-uikit-compose" -> "Фукнциональные изменения компонентов"
        else -> "Изменения в стилях"
    }

private fun StringBuilder.appendSection(section: ChangelogSection) {
    if (section.components.isEmpty()) return

    appendLine()
    appendLine("## ${section.prettyTitle}")

    for (component in section.components) {
        appendLine()
        appendLine("### ${component.component}")
        for (item in component.children) {
            val line = buildString {
                append("- ${item.text}")
                if (item.link != null && item.id != null) {
                    append(" [PR](${item.link})")
                }
            }
            appendLine(line)
        }
    }
}

/**
 * Парсит changelog из строки в формате Markdown в структуру [Changelog].
 *
 * @param markdown Исходный текст changelog в формате Markdown.
 * @param version Версия библиотеки.
 * @param tokenLibName Имя библиотеки токенов (для выделения соответствующего раздела).
 * @param coreLibName Имя основной библиотеки (для выделения соответствующего раздела).
 * @return Объект [Changelog] с распарсенными изменениями.
 */
fun parseTokenLibChangelog(markdown: String, version: String, tokenLibName: String, coreLibName: String): Changelog {
    val parser = Parser.builder().build()
    val document = parser.parse(markdown)

    var currentSection: String? = null
    var currentComponent: String? = null
    val contentBuffer = mutableListOf<String>()
    var collectingContent = false

    val coreChangelog = mutableListOf<ChangelogComponent>()
    val libChangelog = mutableListOf<ChangelogComponent>()

    fun addItemToComponent(text: String, linkInfo: Pair<String, Int>?) {
        val curComponent = currentComponent ?: return
        val curSection = currentSection ?: return
        val sectionList = when {
            isCoreSection(curSection, coreLibName) -> coreChangelog
            isLibSection(curSection, tokenLibName) -> libChangelog
            else -> return
        }

        val component = sectionList
            .find { it.component == curComponent }
            ?: ChangelogComponent(curComponent, mutableListOf())
                .also { sectionList.add(it) }

        val item = ChangelogItem(
            text.trim(),
            link = linkInfo?.first,
            id = linkInfo?.second?.takeIf { it != -1 }
        )
        component.children.add(item)
    }

    fun finishCurrentItem(linkInfo: Pair<String, Int>? = null) {
        if (contentBuffer.isNotEmpty()) {
            val text = contentBuffer.joinToString("\n\n")
            addItemToComponent(text, linkInfo)
            contentBuffer.clear()
            collectingContent = false
        }
    }

    var node = document.firstChild
    while (node != null) {
        when (node) {
            is Heading -> {
                finishCurrentItem()
                val text = extractText(node)
                val includeSection = isCoreSection(text, coreLibName) || isLibSection(text, tokenLibName)
                if (node.level == 2) {
                    currentSection = text.takeIf { includeSection }
                    currentComponent = null
                } else if (node.level == 3) {
                    currentComponent = text
                }
            }

            is BulletList -> {
                var item = node.firstChild
                while (item is ListItem) {
                    val para = item.firstChild as? Paragraph
                    para?.let {
                        contentBuffer.add(extractText(it))
                        collectingContent = true
                    }
                    item = item.next
                }
            }

            is Paragraph -> {
                val linkInfo = extractLink(node)
                if (linkInfo != null) {
                    finishCurrentItem(linkInfo)
                } else if (collectingContent) {
                    val text = extractText(node)
                    if (text.isNotBlank()) {
                        contentBuffer.add(text)
                    }
                }
            }
        }
        node = node.next
    }
    return Changelog(
        version,
        listOf(
            ChangelogSection(ChangelogSectionType.CORE, coreLibName, coreChangelog),
            ChangelogSection(ChangelogSectionType.LIB, tokenLibName, libChangelog)
        )
    )
}

private fun isCoreSection(heading: String, coreName: String): Boolean {
    return heading == coreName
}

private fun isLibSection(heading: String, libName: String): Boolean {
    return heading == libName
}

private fun extractText(node: Node?): String {
    val sb = StringBuilder()
    node?.accept(object : AbstractVisitor() {
        override fun visit(text: Text) {
            sb.append(text.literal)
        }

        override fun visit(strongEmphasis: StrongEmphasis) {
            sb.append("**")
            visitChildren(strongEmphasis)
            sb.append("**")
        }

        override fun visit(code: Code) {
            sb.append("`").append(code.literal).append("`")
        }

        override fun visit(link: Link) {
            visitChildren(link)
        }

        override fun visitChildren(parent: Node) {
            var child = parent.firstChild
            while (child != null) {
                sb.append(extractText(child))
                child = child.next
            }
        }
    })
    return sb.toString()
}

private fun extractLink(paragraph: Paragraph): Pair<String, Int>? {
    var child = paragraph.firstChild
    while (child != null) {
        if (child is Link && extractText(child.firstChild).trim() == "PR") {
            val link = child as Link
            val match = Regex("/(\\d+)$").find(link.destination)
            val id = match?.groupValues?.get(1)?.toIntOrNull()
            return link.destination to (id ?: -1)
        }
        child = child.next
    }
    return null
}

@Suppress("SimpleDateFormat")
private val DateFormat = SimpleDateFormat("yyyy-MM-dd")

private fun getReleaseDate(): String {
    return DateFormat.format(Date())
}