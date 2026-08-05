## Context

В `sdds-core/uikit-compose` уже существует общий контракт `ImageSource`, но ряд публичных style-интерфейсов и style builder-интерфейсов до сих пор задают иконки через `@DrawableRes Int`. Это ограничивает кастомизацию иконок drawable resource ID, хотя рендеринг `Icon(source = ImageSource, ...)` уже умеет работать с более широким источником.

Затрагиваемые style API включают компоненты вроде `AccordionItem`, `Carousel`, `Cell`, `CollapsingNavigationBar`, `Drawer`, `FormItem`, `ListItem`, `NavigationBar`, `Note`, `NoteCompact`, `NotificationContent`, `SelectItem`, `TabItem`, `Tabs` и `Wheel`. Кроме runtime API, изменение затрагивает `sdds-core/api-info-ksp`, потому что сейчас тип параметра `ICON` определяется по `@DrawableRes`, а новый builder API будет принимать `ImageSource`.

## Goals / Non-Goals

**Goals:**
- Добавить `ImageSource` как основной публичный способ задавать иконки в style API `uikit-compose`.
- Сохранить source и binary compatibility для клиентов, которые используют старые `@DrawableRes Int` свойства и builder-методы.
- Перевести внутренний рендеринг компонентов на `ImageSource`, чтобы drawable resource был только одним из вариантов источника.
- Сохранить корректную классификацию иконок в API metadata и документации builder API.
- Обновить KDoc для новых и deprecated публичных API.

**Non-Goals:**
- Удалять старые `@DrawableRes Int` API в рамках этого change.
- Менять Android View `sdds-core/uikit`.
- Добавлять новую библиотеку загрузки изображений или менять контракт `ImageSource`.
- Массово переписывать существующие сгенерированные token styles в репозитории.

## Decisions

### Новые свойства получают суффикс `Source`

Свойства нельзя перегрузить по типу возвращаемого значения, поэтому существующее `val closeIcon: Int?` не может быть заменено на `val closeIcon: ImageSource?` без breaking change. Новые свойства называются по шаблону `<iconName>Source`, например `closeIconSource`, `nextButtonIconSource`, `disclosureIconSource`.

Альтернатива: переименовать старые свойства в `*Res`, а старое имя отдать `ImageSource`. Это лучше выглядит как конечный API, но ломает внешние реализации style-интерфейсов и обращения к свойствам.

### Builder-методы сохраняют имя и получают overload с `ImageSource`

Для функций допустима перегрузка по типу параметра, поэтому новый API использует то же имя, например `closeIcon(closeIcon: ImageSource)`, а старый `closeIcon(@DrawableRes closeIcon: Int)` остается deprecated adapter’ом. Это сохраняет fluent DSL и минимизирует отличие пользовательского кода.

Альтернатива: добавить методы `closeIconSource(ImageSource)`. Это исключает overload ambiguity, но делает DSL менее единообразным и расходится с уже существующими builder-паттернами.

### Старые drawable свойства остаются как source-compatible API

Старые свойства `@DrawableRes Int?` остаются в style-интерфейсах и помечаются `@Deprecated` с `ReplaceWith("*Source")`, где это возможно. Новые свойства должны иметь default getter в интерфейсе, чтобы внешние реализации style-интерфейсов не обязаны были сразу реализовывать новый член.

Common style-код не должен адаптировать drawable id в `ImageSource`: в `commonMain` не используется ни `resourceImageSource`, ни `painterResource` для style-иконок. Deprecated drawable builder-методы остаются source-compatible, но не записывают drawable id в default style state и не сбрасывают соответствующий `*Source`. Deprecated drawable style-свойства вынесены из конструкторов default style и по умолчанию возвращают `null`.

### Рендеринг компонентов читает `ImageSource`

Компоненты должны использовать новые `*Source` свойства и `Icon(source = ...)` вместо прямого чтения drawable style-свойств. Для параметров компонентов, которые пока принимают `@DrawableRes Int?`, существующая runtime-совместимость сохраняется как отдельный component-level путь; style-иконки читаются через `*Source`.

### API metadata распознает `ImageSource` как icon parameter

`api-info-ksp` должен классифицировать параметры builder-методов типа `com.sdds.compose.uikit.ImageSource` как `ParameterType.ICON`. Deprecated drawable overload’ы могут оставаться в коде, но metadata должна отражать актуальный публичный ImageSource API без потери типа иконки.

### Theme Builder генерирует ImageSource для drawable-иконок

`plugin_theme_builder` должен генерировать вызовы вида `.icon(resourceImageSource(com.sdds.icons.R.drawable.ic_...))` и добавлять импорт `com.sdds.compose.uikit.resourceImageSource`. Сам helper `resourceImageSource` является Android API и находится в `androidMain`; common style API его не использует.

## Risks / Trade-offs

- [Risk] Внешние реализации style-интерфейсов могут сломаться из-за нового abstract property. → Mitigation: новые `*Source` свойства добавляются с default getter в интерфейсе.
- [Risk] Deprecated drawable overload попадет в API metadata вместо нового `ImageSource` overload. → Mitigation: обновить KSP-классификацию и проверить generated API info для representative builder’ов.
- [Risk] Overload’ы с nullable параметрами могут быть неоднозначны при вызове `icon(null)`. → Mitigation: не добавлять nullable builder-overload’ы без необходимости; nullable состояние задается отсутствием вызова или отдельной существующей nullable drawable совместимостью там, где она уже есть.
- [Risk] Ручная миграция большого набора компонентов может пропустить runtime usage `painterResource(style.*Icon)`. → Mitigation: использовать `rg` по `@get:DrawableRes`, `painterResource`, `style.*Icon` и добавить targeted compile validation.
- [Risk] Новый `ImageSource` source может быть нестабилен для equality style data class. → Mitigation: не требовать structural equality для содержимого источника; сохранять существующую Compose-модель `ImageSource` как stable fun interface.

## Migration Plan

1. Добавить новые `*Source` свойства и builder-overload’ы в style API `uikit-compose`, старые drawable API пометить deprecated.
2. Обновить default style implementations так, чтобы новый `ImageSource` путь был основным, а старый drawable путь оставался deprecated source-compatible API.
3. Перевести компоненты на чтение `ImageSource` для style-иконок.
4. Обновить `api-info-ksp` для классификации `ImageSource` как `ICON`.
5. Обновить `plugin_theme_builder` для генерации нового API через `resourceImageSource(...)`, сохранив компиляцию старого output.
6. Запустить focused проверки для `sdds-core/uikit-compose`, `sdds-core/api-info-ksp` и representative generated Compose styles.

Rollback: так как старые API не удаляются, откат может быть выполнен удалением новых overload’ов/usage до выпуска. После выпуска откат новых публичных API должен рассматриваться как breaking change.

## Open Questions

- Нужно ли называть новые свойства строго `*Source` во всех случаях, включая уже существующие имена с суффиксом `Res` вроде `closeIconRes`, или для них выбрать `closeIconSource` без `Res`?
