## Context

`uikit-api-meta.json` генерируется `DeclareStyleableParser` (`build-system/conventions`, `tasks/viewapi`). Тип свойства определяется приоритетом: `sdds:api_type` → `format` → эвристика по имени; `value` выводится из `format="enum"`. Значения (`values`) берутся из дочерних `<enum>` атрибута, а если их нет — из `enumIndex` (`buildEnumIndex`), построенного по ресурсам модуля по имени атрибута.

`android:orientation` — framework-атрибут: внутри `declare-styleable` он указан без `format` и без `<enum>`, а в модуле нигде не определён. Поэтому:
- Slider, Tabs, ToolBar размечены `sdds:api_type="integer"` вручную → `type=integer`, `values=[]`;
- PaginationDots размечен `value`, но индексу не из чего взять значения → `values=[]`;
- ScrollBar использует собственный `sd_orientation` с `format="enum"` → корректный `value` со значениями.

## Goals / Non-Goals

**Goals:**
- Все свойства `orientation` в мете имеют тип `value` и непустой `values` (`horizontal=0`, `vertical=1`).
- Не менять ресурсы uikit и `R` ради нужд генератора меты.

**Non-Goals:**
- Разметка Divider (`format="dimension"`) и FlowLayout — вне объёма.
- Словарь всех framework-enum атрибутов: добавляется только `android:orientation`.
- Изменение рантайм-поведения компонентов.

## Decisions

**1. Значения framework-enum зашиты в парсере (`FRAMEWORK_ENUMS`), а не в ресурсах uikit.**
В `DeclareStyleableParser` добавляется словарь `имя атрибута → EnumDefinition`; для `android:orientation` — `horizontal=0`, `vertical=1`. Это платформенный контракт, который не принадлежит дизайн-системе, поэтому дублировать его в ресурсах uikit в виде XML-зеркала не нужно.

*Альтернатива (отвергнута):* определить `<attr name="android:orientation">` с `<enum>` в `values/*.xml` uikit, чтобы значения подхватил `enumIndex`. Спайк показал, что aapt2 это принимает, но решение размазывает платформенные значения по ресурсам библиотеки и создаёт зеркало, которое может разойтись с framework.

**2. Приоритет источников значений.**
Собственные `<enum>` атрибута → определение в индексе модуля (`enumIndex`) → встроенный словарь → пусто. Так явная разметка модуля всегда может переопределить встроенное значение, а словарь работает только как fallback.

**3. `sdds:api_type="value"` остаётся явным на каждом `android:orientation`.**
Без `format` классификатор не выведет `value` сам (эвристика по имени для `orientation` не сработает), поэтому явная разметка сохраняется; меняется только `integer` → `value` у Slider, Tabs, ToolBar.

## Risks / Trade-offs

- [Словарь в коде нужно дополнять при появлении новых framework-enum атрибутов в разметке] → пустой `values` у `value`-свойства виден в мете; словарь расширяется одной записью, на каждую запись нужен тест.
- [Значения в словаре могут разойтись с framework] → `horizontal=0`, `vertical=1` — стабильный контракт `android.R.attr.orientation`; рантайм компонентов читает значение через `getInt` из framework-атрибута и от словаря не зависит.
- [Потребители меты ждали `integer` у Slider/Tabs/ToolBar] → `plugin_theme_builder` не использует `orientation`; тип `value` — штатный.

## Migration Plan

Миграции нет: мета пересобирается при сборке `uikit`. Откат — возврат `sdds:api_type="integer"` и удаление записи из `FRAMEWORK_ENUMS`.

## Validation

- `./gradlew :build-system:conventions:test`
- `./gradlew :sdds-core:uikit:assembleDebug :sdds-core:uikit:generateUikitApiMeta :sdds-core:uikit:lintDebug`, проверка `build/generated/viewApiMeta/sdds/api/uikit-api-meta.json`
- `./gradlew detektAll` и `spotlessCheck` для `build-system/conventions`
