## Why

В `uikit-api-meta.json` свойство `orientation` у разных компонентов имеет разный тип: у ScrollBar и PaginationDots это `value`, а у Slider, Tabs и ToolBar — `integer`. Причина — `android:orientation` является framework-атрибутом без `format` и без собственных `<enum>`, поэтому классификатор не может вывести `value` сам, и в трёх компонентах тип зафиксирован вручную как `integer`. У PaginationDots тип уже `value`, но список `values` пустой, поскольку парсер берёт значения только из дочерних `<enum>`. Потребитель меты (генератор документации/демо) не может единообразно работать с `orientation`.

## What Changes

- В `DeclareStyleableParser` (`build-system/conventions`) добавляется встроенный словарь значений framework-enum атрибутов; для `android:orientation` это `horizontal=0` и `vertical=1`. Словарь применяется, только если значений нет ни у самого атрибута, ни в индексе модуля.
- В `slider_attrs.xml`, `tabs_attrs.xml`, `toolbar_attrs.xml` `sdds:api_type="integer"` на `android:orientation` заменяется на `sdds:api_type="value"`.
- `pagination_dots_attrs.xml` остаётся с `sdds:api_type="value"`; `values` заполняется из встроенного словаря без изменения разметки.
- В итоге все свойства `orientation` в мете (Slider, Tabs, ToolBar, PaginationDots, ScrollBar) имеют тип `value`; у Slider/Tabs/ToolBar/PaginationDots `values = [horizontal=0, vertical=1]`.
- XML-зеркало framework-enum в ресурсах uikit не добавляется: значения живут в коде генератора меты, ресурсы uikit и `R` не затрагиваются. Добавляются unit-тесты приоритета источников значений.
- Divider и FlowLayout не размечаются (вне объёма).

Публичный API компонентов, токены и Gradle-конвенции не меняются; затрагивается только содержимое генерируемой меты `uikit-api-meta.json`.

## Capabilities

### New Capabilities

Нет.

### Modified Capabilities

- `view-api-info`: значения для enum-атрибута без собственных `<enum>` берутся из определения того же атрибута в модуле, а для известных framework-атрибутов (`android:orientation`) — из встроенного словаря генератора; свойства с `sdds:api_type="value"` на таком атрибуте несут эти значения в мете.

## Impact

- **Модули**: `build-system/conventions` (`DeclareStyleableParser` и его unit-тесты), `sdds-core/uikit` (только разметка `sdds:api_type` в `slider_attrs.xml`, `tabs_attrs.xml`, `toolbar_attrs.xml`).
- **Потребители меты**: `sdds-core/plugin_theme_builder` (`UikitApiMetaTask`, `ComponentMeta`) и модули `tokens/*`, читающие `uikit-api-meta.json`, — тип `orientation` меняется с `integer` на `value` у трёх компонентов, добавляются `values`.
- **Риск**: словарь в коде нужно расширять вручную при появлении новых framework-enum атрибутов в разметке; сейчас нужен только `android:orientation`. Ресурсы uikit и рантайм не затрагиваются.
- **Валидация**: `./gradlew :build-system:conventions:test`, сборка `:sdds-core:uikit` с проверкой сгенерированного `uikit-api-meta.json`, `:sdds-core:uikit:lintDebug`, `detektAll`, `spotlessCheck` для `build-system/conventions`.
