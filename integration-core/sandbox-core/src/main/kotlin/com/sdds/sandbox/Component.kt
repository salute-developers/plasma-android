package com.sdds.sandbox

/**
 * Базовый интерфейс для всех компонентов.
 * @property key Уникальный ключ компонента
 * @property styleProviders провайдеры стиля
 * @property name Название компонента
 * @property defaultAppearance Внешний вид по умолчанию
 */
open class Component<P : StyleProvider<*>>(
    val key: ComponentKey,
    val styleProviders: Map<String, P>,
    val name: String = key.value,
    val defaultAppearance: String = styleProviders.keys.firstOrNull().orEmpty(),
) {
    constructor(
        key: ComponentKey,
        styleProvider: P,
    ) : this(key, mapOf(key.value to styleProvider))
}

/**
 * Группа компонентов для организации и категоризации в интерфейсе сторибука.
 *
 * Позволяет логически объединять связанные компоненты (например, все кнопки
 * или все поля ввода) для удобной навигации по библиотеке компонентов.
 *
 * @param displayName Отображаемое название группы в пользовательском интерфейсе
 * @param ordinal Порядковый номер группы для сортировки при отображении
 */
data class ComponentGroup(
    val displayName: String,
    val ordinal: Int,
)

/**
 * Ключ для идентификации компонентов.
 *
 * @param value Уникальное значение ключа.
 * @param core Базовый тип компонента.
 * @param group группа, к которой принадлежит компонент
 */
@Suppress("UnsafeOptInUsageError")
data class ComponentKey(
    val value: String,
    val group: ComponentGroup = value.group(),
) {

    private constructor(
        key: CoreComponentName,
    ) : this(key.displayName, key.group())

    /**
     * Набор предопределенных ключей для компонентов.
     */
    @Suppress("UndocumentedPublicProperty")
    companion object {

        val Avatar = ComponentKey(CoreComponentName.AVATAR)
        val AvatarGroup = ComponentKey(CoreComponentName.AVATAR_GROUP)

        val Badge = ComponentKey(CoreComponentName.BADGE)
        val IconBadge = ComponentKey(CoreComponentName.ICON_BADGE)

        val BottomSheet = ComponentKey(CoreComponentName.BOTTOMSHEET)

        val BasicButton = ComponentKey(CoreComponentName.BASIC_BUTTON)
        val IconButton = ComponentKey(CoreComponentName.ICON_BUTTON)
        val LinkButton = ComponentKey(CoreComponentName.LINK_BUTTON)

        val Card = ComponentKey(CoreComponentName.CARD)

        val Cell = ComponentKey(CoreComponentName.CELL)

        val CheckBox = ComponentKey(CoreComponentName.CHECKBOX)
        val CheckBoxGroup = ComponentKey(CoreComponentName.CHECKBOX_GROUP)

        val Chip = ComponentKey(CoreComponentName.CHIP)
        val ChipGroup = ComponentKey(CoreComponentName.CHIP_GROUP)

        val Counter = ComponentKey(CoreComponentName.COUNTER)
        val Divider = ComponentKey(CoreComponentName.DIVIDER)
        val Indicator = ComponentKey(CoreComponentName.INDICATOR)
        val Flow = ComponentKey(CoreComponentName.FLOW)
        val NavigationDrawer = ComponentKey(CoreComponentName.NAVIGATION_DRAWER)
        val ProgressBar = ComponentKey(CoreComponentName.PROGRESS)
        val CircularProgressBar = ComponentKey(CoreComponentName.CIRCULAR_PROGRESS)

        val RadioBox = ComponentKey(CoreComponentName.RADIOBOX)
        val RadioBoxGroup = ComponentKey(CoreComponentName.RADIOBOX_GROUP)

        val Segment = ComponentKey(CoreComponentName.SEGMENT)
        val SegmentItem = ComponentKey(CoreComponentName.SEGMENT_ITEM)
        val Select = ComponentKey(CoreComponentName.SELECT)

        val Switch = ComponentKey(CoreComponentName.SWITCH)

        val TextField = ComponentKey(CoreComponentName.TEXT_FIELD)
        val TextArea = ComponentKey(CoreComponentName.TEXT_AREA)
        val Popover = ComponentKey(CoreComponentName.POPOVER)
        val Tooltip = ComponentKey(CoreComponentName.TOOLTIP)
        val Overlay = ComponentKey(CoreComponentName.OVERLAY)
        val Toast = ComponentKey(CoreComponentName.TOAST)
        val Modal = ComponentKey(CoreComponentName.MODAL)
        val Note = ComponentKey(CoreComponentName.NOTE)
        val NoteCompact = ComponentKey(CoreComponentName.NOTE_COMPACT)
        val Notification = ComponentKey(CoreComponentName.NOTIFICATION)
        val NotificationContent = ComponentKey(CoreComponentName.NOTIFICATION_CONTENT)
        val RectSkeleton = ComponentKey(CoreComponentName.RECT_SKELETON)
        val Spinner = ComponentKey(CoreComponentName.SPINNER)
        val List = ComponentKey(CoreComponentName.LIST)
        val ListItem = ComponentKey(CoreComponentName.LIST_ITEM)
        val DropdownMenu = ComponentKey(CoreComponentName.DROPDOWN_MENU)
        val TextSkeleton = ComponentKey(CoreComponentName.TEXT_SKELETON)
        val Accordion = ComponentKey(CoreComponentName.ACCORDION)
        val AccordionItem = ComponentKey(CoreComponentName.ACCORDION_ITEM)
        val Wheel = ComponentKey(CoreComponentName.WHEEL)
        val ScrollBar = ComponentKey(CoreComponentName.SCROLL_BAR)
        val Slider = ComponentKey(CoreComponentName.SLIDER)
        val Image = ComponentKey(CoreComponentName.IMAGE)
        val ButtonGroup = ComponentKey(CoreComponentName.BUTTON_GROUP)
        val TabBar = ComponentKey(CoreComponentName.TAB_BAR)
        val TabBarItem = ComponentKey(CoreComponentName.TAB_BAR_ITEM)
        val Loader = ComponentKey(CoreComponentName.LOADER)
        val CodeInput = ComponentKey(CoreComponentName.CODE_INPUT)
        val CodeField = ComponentKey(CoreComponentName.CODE_FIELD)
        val Drawer = ComponentKey(CoreComponentName.DRAWER)
        val Tabs = ComponentKey(CoreComponentName.TABS)
        val TabItem = ComponentKey(CoreComponentName.TAB_ITEM)
        val IconTabItem = ComponentKey(CoreComponentName.ICON_TAB_ITEM)
        val IconTabs = ComponentKey(CoreComponentName.ICON_TABS)
        val Toolbar = ComponentKey(CoreComponentName.TOOL_BAR)
        val NavigationBar = ComponentKey(CoreComponentName.NAVIGATION_BAR)
        val CollapsingNavigationBar = ComponentKey(CoreComponentName.COLLAPSING_NAVIGATION_BAR)
        val PaginationDots = ComponentKey(CoreComponentName.PAGINATION_DOTS)
        val Mask = ComponentKey(CoreComponentName.MASK)
        val Carousel = ComponentKey(CoreComponentName.CAROUSEL)
        val Autocomplete = ComponentKey(CoreComponentName.AUTOCOMPLETE)
        val DropdownEmptyState = ComponentKey(CoreComponentName.DROPDOWN_EMPTY_STATE)
        val File = ComponentKey(CoreComponentName.FILE)
        val FormItem = ComponentKey(CoreComponentName.FORM_ITEM)
        val Editable = ComponentKey(CoreComponentName.EDITABLE)
    }
}

private enum class CoreComponentGroup(val displayName: String) {
    DATA_DISPLAY("Data Display"),
    DATA_ENTRY("Data Entry"),
    NAVIGATION("Navigation"),
    OVERLAY("Overlay"),
    LAYOUT("Layout"),
}

private enum class CoreComponentName(displayName: String? = null) {
    AVATAR,
    AVATAR_GROUP,

    BADGE,
    ICON_BADGE,

    BOTTOMSHEET,

    BASIC_BUTTON,
    ICON_BUTTON,
    LINK_BUTTON,
    BUTTON_GROUP,

    CARD,

    CELL,

    CHECKBOX,
    CHECKBOX_GROUP,

    CHIP,
    CHIP_GROUP,

    COUNTER,

    DIVIDER,

    FLOW,

    INDICATOR,

    NAVIGATION_DRAWER,

    PROGRESS,
    CIRCULAR_PROGRESS,

    RADIOBOX,
    RADIOBOX_GROUP,

    SEGMENT,
    SEGMENT_ITEM,
    SELECT,

    SWITCH,

    TEXT_FIELD,
    TEXT_AREA,
    POPOVER,
    TOOLTIP,
    OVERLAY,
    TOAST,
    MODAL,
    NOTE,
    NOTE_COMPACT,
    NOTIFICATION,
    NOTIFICATION_CONTENT,
    RECT_SKELETON,
    SPINNER,
    LIST,
    LIST_ITEM,
    DROPDOWN_MENU,
    TEXT_SKELETON,
    ACCORDION,
    ACCORDION_ITEM,
    WHEEL,
    SCROLL_BAR,
    SLIDER,
    IMAGE,
    TAB_BAR,
    TAB_BAR_ITEM,
    LOADER,
    CODE_INPUT,
    CODE_FIELD,
    DRAWER,
    TABS,
    TAB_ITEM,
    ICON_TAB_ITEM,
    ICON_TABS,
    NAVIGATION_BAR,
    COLLAPSING_NAVIGATION_BAR,
    PAGINATION_DOTS,
    TOOL_BAR,
    MASK,
    CAROUSEL,
    AUTOCOMPLETE,
    DROPDOWN_EMPTY_STATE,
    FILE,
    FORM_ITEM,
    EDITABLE,
    ;

    val displayName: String = displayName ?: this.name
        .split("_")
        .joinToString("") { parts ->
            parts.lowercase().replaceFirstChar { it.uppercase() }
        }
}

private fun String.group(): ComponentGroup {
    return CoreComponentName.valueOf(this).group()
}

@Suppress("LongMethod")
private fun CoreComponentName.group(): ComponentGroup {
    return when (this) {
        CoreComponentName.ACCORDION,
        CoreComponentName.ACCORDION_ITEM,
        CoreComponentName.AVATAR,
        CoreComponentName.AVATAR_GROUP,
        CoreComponentName.BADGE,
        CoreComponentName.ICON_BADGE,
        CoreComponentName.CARD,
        CoreComponentName.COUNTER,
        CoreComponentName.CELL,
        CoreComponentName.CHIP,
        CoreComponentName.CHIP_GROUP,
        CoreComponentName.DIVIDER,
        CoreComponentName.IMAGE,
        CoreComponentName.INDICATOR,
        CoreComponentName.LIST,
        CoreComponentName.LIST_ITEM,
        CoreComponentName.RECT_SKELETON,
        CoreComponentName.SPINNER,
        CoreComponentName.TEXT_SKELETON,
        CoreComponentName.LOADER,
        CoreComponentName.PROGRESS,
        CoreComponentName.CIRCULAR_PROGRESS,
        CoreComponentName.NOTE,
        CoreComponentName.NOTE_COMPACT,
        CoreComponentName.PAGINATION_DOTS,
        CoreComponentName.DROPDOWN_EMPTY_STATE,
        -> CoreComponentGroup.DATA_DISPLAY

        CoreComponentName.BASIC_BUTTON,
        CoreComponentName.ICON_BUTTON,
        CoreComponentName.LINK_BUTTON,
        CoreComponentName.BUTTON_GROUP,
        CoreComponentName.CHECKBOX,
        CoreComponentName.CHECKBOX_GROUP,
        CoreComponentName.CODE_INPUT,
        CoreComponentName.CODE_FIELD,
        CoreComponentName.RADIOBOX,
        CoreComponentName.RADIOBOX_GROUP,
        CoreComponentName.TEXT_FIELD,
        CoreComponentName.TEXT_AREA,
        CoreComponentName.SEGMENT,
        CoreComponentName.SEGMENT_ITEM,
        CoreComponentName.SELECT,
        CoreComponentName.SWITCH,
        CoreComponentName.WHEEL,
        CoreComponentName.MASK,
        CoreComponentName.AUTOCOMPLETE,
        CoreComponentName.SLIDER,
        CoreComponentName.FILE,
        CoreComponentName.FORM_ITEM,
        CoreComponentName.EDITABLE,
        -> CoreComponentGroup.DATA_ENTRY

        CoreComponentName.DROPDOWN_MENU,
        CoreComponentName.NAVIGATION_DRAWER,
        CoreComponentName.SCROLL_BAR,
        CoreComponentName.TABS,
        CoreComponentName.TAB_ITEM,
        CoreComponentName.ICON_TAB_ITEM,
        CoreComponentName.ICON_TABS,
        CoreComponentName.TAB_BAR,
        CoreComponentName.TAB_BAR_ITEM,
        CoreComponentName.CAROUSEL,
        -> CoreComponentGroup.NAVIGATION

        CoreComponentName.DRAWER,
        CoreComponentName.BOTTOMSHEET,
        CoreComponentName.NOTIFICATION,
        CoreComponentName.NOTIFICATION_CONTENT,
        CoreComponentName.POPOVER,
        CoreComponentName.MODAL,
        CoreComponentName.TOOLTIP,
        CoreComponentName.TOAST,
        CoreComponentName.OVERLAY,
        CoreComponentName.TOOL_BAR,
        -> CoreComponentGroup.OVERLAY

        CoreComponentName.NAVIGATION_BAR,
        CoreComponentName.COLLAPSING_NAVIGATION_BAR,
        -> CoreComponentGroup.NAVIGATION

        CoreComponentName.FLOW -> CoreComponentGroup.LAYOUT
    }.let { ComponentGroup(it.displayName, it.ordinal) }
}
