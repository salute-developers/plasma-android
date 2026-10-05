## 1. sdds-core/uikit: разметка ресурсов

- [x] 1.1 В `slider_attrs.xml`, `tabs_attrs.xml`, `toolbar_attrs.xml` заменить `sdds:api_type="integer"` на `sdds:api_type="value"` у `android:orientation`
- [x] 1.2 Убедиться, что `pagination_dots_attrs.xml` остаётся с `sdds:api_type="value"` и менять его не требуется

## 2. build-system/conventions: словарь и тесты парсера

- [x] 2.1 Добавить в `DeclareStyleableParser` встроенный словарь `FRAMEWORK_ENUMS` (`android:orientation` → `horizontal=0`, `vertical=1`) и использовать его как fallback после `enumIndex`
- [x] 2.2 Unit-тест: framework-атрибут без своих `<enum>` и без определения в модуле получает значения из словаря
- [x] 2.3 Unit-тесты приоритета: собственные `<enum>` и определение в модуле приоритетнее словаря
- [x] 2.4 Запустить `./gradlew :build-system:conventions:test`

## 3. Проверка uikit и меты

- [x] 3.1 Собрать `./gradlew :sdds-core:uikit:assembleDebug :sdds-core:uikit:generateUikitApiMeta`
- [x] 3.2 Проверить в `sdds-core/uikit/build/generated/viewApiMeta/sdds/api/uikit-api-meta.json`: `orientation` у Slider, Tabs, ToolBar, PaginationDots, ScrollBar имеет тип `value`, у первых четырёх `values` = `horizontal=0`, `vertical=1`, типа `integer` нет
- [x] 3.3 Запустить `./gradlew :sdds-core:uikit:lintDebug` и убедиться в отсутствии новых замечаний
- [x] 3.4 Проверить `plugin_theme_builder` и `tokens/*` на зависимость от типа `integer` у `orientation`; при необходимости поправить потребителей

## 4. Финальная проверка

- [x] 4.1 Запустить `./gradlew detektAll` (spotless для изменённых Kotlin-файлов не перезапускался: `spotlessApplyAll` трогает несвязанные файлы)
- [x] 4.2 Обновить спеку `view-api-info` через архивирование change (`/opsx:archive`) после реализации
