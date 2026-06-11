## Context

`sdds-core/plugin_theme_builder` подготавливает входные данные для `GenerateThemeTask` в `ThemeBuilderPlugin`: берет `themeSource`/`themeSources` из extension, скачивает zip-архивы, распаковывает их в `build/theme-builder/theme/<tenant>/`, а затем передает генератору списки tenant suffix и файлов `meta.json`/`android_*.json`.

DSBuilder уже может хранить эти данные локально в модуле в директории `.sdds/`: `.sdds/config.json` содержит tenants, а каждая tenant-директория содержит `meta.json` и `android/android_*.json`. Эти данные соответствуют структуре, которую Theme Builder получает после unzip, поэтому для них не нужен theme zip download.

Основное ограничение: текущие генераторы используют существующую модель `Tenant.Default` и diff non-default tenants относительно default. Это поведение должно остаться неизменным. Новая логика должна жить в прослойке подготовки источников до `GenerateThemeTask`.

## Goals / Non-Goals

**Goals:**
- Добавить resolver, который читает `.sdds/config.json` и извлекает локальные theme sources.
- Использовать локальные `.sdds` sources только как fallback, когда extension не содержит `themeSource`/`themeSources`.
- Преобразовывать tenants из `.sdds/config.json` в legacy-compatible входы для `GenerateThemeTask`.
- Для первого tenant передавать пустой tenant suffix, чтобы он остался `Tenant.Default`.
- Для остальных tenants использовать suffix `alias ?: name`.
- Не скачивать и не распаковывать theme zip для локальных `.sdds` sources.
- Оставить текущий remote/url flow без изменений.

**Non-Goals:**
- Не менять `GenerateThemeTask`.
- Не менять `Tenant`, генераторы токенов, генераторы атрибутов и генераторы тем.
- Не менять DSL `themeBuilder`.
- Не добавлять поддержку локального `componentSource` из `.sdds`.
- Не менять формат token json-файлов.
- Не решать полноценную равноправную multi-tenant генерацию внутри генераторов; первый tenant остается внутренней базой для текущей legacy-модели.

## Decisions

### Resolver вместо логики внутри extension

Создать отдельную прослойку source resolution рядом с `ThemeBuilderPlugin`, например `ThemeSourceResolver`/`SddsThemeSourceReader`. Extension должен отвечать только за DSL-конфигурацию, а не за чтение файлов проекта.

Альтернатива: встроить fallback в `ThemeBuilderExtension.getThemeSources()`. Это хуже, потому что extension не имеет естественной ответственности за filesystem project layout и усложняет тестирование Gradle plugin behavior.

### Local source как новый тип `ThemeBuilderSource`

Расширить sealed class `ThemeBuilderSource` локальным вариантом, например `LocalDirectory`, который содержит tenant-директорию. Remote/url варианты продолжают использовать `NameAndVersion` и `Url`.

Альтернатива: кодировать локальную директорию как `Url` или `NameAndVersion`. Это смешивает разные типы источников и может случайно отправить локальный source в zip download flow.

### Единый resolved path перед регистрацией `GenerateThemeTask`

В `ThemeBuilderPlugin` подготовка должна различать source kind:
- `NameAndVersion`/`Url`: зарегистрировать `fetchTheme*` и `unpackThemeFiles*`, затем читать файлы из `build/theme-builder/theme/<tenantPath>/`.
- `LocalDirectory`: не регистрировать theme fetch/unzip tasks, читать `meta.json` и `android/android_*.json` напрямую из tenant-директории.

`GenerateThemeTask` должен получать те же параметры, что и сейчас: `themeTenants`, `metaFile`, collections файлов токенов и зависимости.

### Правило mapping tenants из `.sdds/config.json`

Для каждого tenant использовать публичное имя `alias ?: name`.

Первый tenant:
- `themeName`/`baseAlias` = `alias ?: name`;
- `themeTenants` получает `""`;
- `metaFile` берется из директории этого tenant;
- файлы токенов берутся из директории этого tenant.

Остальные tenants:
- `themeTenants` получает `alias ?: name`;
- файлы токенов берутся из соответствующих tenant-директорий.

Так сохраняется текущая семантика `Tenant.Default`, а `.sdds/config.json` не обязан содержать специальный default tenant.

### Explicit DSL имеет приоритет

Если пользователь явно задал `themeSource` или `themeSources`, Theme Builder использует существующий flow и не читает `.sdds/config.json` как source. Это сохраняет backward compatibility и делает fallback предсказуемым.

## Risks / Trade-offs

- Порядок tenants в `.sdds/config.json` становится значимым -> зафиксировать это в spec и сообщениях ошибок: первый tenant является внутренней базой для legacy generation semantics.
- `meta.json` берется только от первого tenant -> валидировать наличие `meta.json` у первого tenant; остальные tenants должны быть совместимы с этим meta, как и текущие генераторы ожидают.
- Локальные `.sdds` paths могут быть невалидными или отсутствовать -> resolver должен выдавать понятную ошибку с путем к отсутствующему файлу или директории.
- Palette по-прежнему нужна для ссылок вида `[general.*]` -> текущий `fetchPalette` можно оставить без изменений; этот change запрещает только theme zip download для локальных sources.
- Смешивание remote и local sources внутри одного набора усложняет task dependencies -> resolver должен возвращать source kind для каждого source, а регистрация задач должна добавлять dependencies только для remote/url sources.
- View multi-tenant behavior остается таким же, как сейчас -> это осознанный non-goal, потому что изменение генераторов не входит в scope.

## Migration Plan

Миграция не требуется: существующие модули с явно заданными `themeSource`/`themeSources` продолжают работать как раньше.

Для модулей с `.sdds/config.json` можно будет удалить явную настройку `themeSource`/`themeSources`, оставив остальные параметры `themeBuilder`. После этого `generateTheme` будет читать локальные tenant-директории.

Rollback: вернуть явный `themeSource`/`themeSources` в `themeBuilder` extension или удалить/исправить `.sdds/config.json`.

## Open Questions

- Нужен ли в будущем локальный fallback для `componentSource`, или он должен оставаться отдельной задачей?
- Нужен ли локальный `palette.json` внутри `.sdds` для полностью offline generation, или текущий `paletteUrl`/`fetchPalette` остается достаточным?
