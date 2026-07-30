# Владение `sd_shapeAppearanceAdjustment` задаётся разметкой

## Why

`sd_shapeAppearanceAdjustment` объявлен в styleable `SdShape` парно к `sd_shapeAppearance`
и в стиле встречается один раз — на все формы компонента. Универсальный View-генератор
печатал его для **любого** shape-свойства с ненулевым adjustment, поэтому `ButtonGroup`
(внешняя и внутренняя формы) получал одинаковый `<item>` дважды: `:sdds.serv.view:lintDebug`
падал с 18 ошибками `DuplicateDefinition`, `:plasma.sd.service.view:lintDebug` — с 12.
Рукописные генераторы, которые универсальный заменил, adjustment для этих форм не печатали
вовсе, так что это регрессия, а не согласованный дрейф.

Правило «adjustment только у основного `sd_shapeAppearance`» задачу не решает: `Wheel`
печатал adjustment рядом с `sd_itemSelectorShapeAppearance`, `Switch` — рядом с
`sd_thumbShapeAppearance`/`sd_trackShapeAppearance`. Владелец не выводится из имени
атрибута и должен задаваться разметкой.

Заодно `lint` вскрыл четыре дубля `<attr>` внутри `declare-styleable name="Chip"`:
`android:minWidth`/`android:minHeight`/`android:paddingStart`/`android:paddingEnd` были
размечены дважды, причём вторые ключи (`contentMinWidth`, `contentMinHeight`, `width`,
`startPadding`, `endPadding`) отсутствуют и в конфигах тем, и в легаси-фикстуре.

## What Changes

- В словарь разметки добавляется `sdds:api_shape_adjustment` — булев признак владения
  атрибутом `sd_shapeAppearanceAdjustment`. Дефолт: `true` у основного
  `<prefix>shapeAppearance`, `false` у прочих shape-атрибутов.
- Явное владение проставляется там, где его печатали рукописные генераторы:
  `sd_itemSelectorShapeAppearance` (`Wheel`), `sd_thumbShapeAppearance` и
  `sd_trackShapeAppearance` (`Switch`).
- Попытка напечатать `sd_shapeAppearanceAdjustment` в стиль дважды завершает генерацию
  ошибкой: конфликт разрешается разметкой, а не выводом.
- Из `declare-styleable name="Chip"` удаляются четыре дублирующие записи `<attr>`.
- Гейт полноты разметки дополняется проверкой, что ни одно свойство не потеряло
  владение adjustment относительно легаси-фикстуры.

## Impact

- Затронутые спеки: `view-api-info`, `universal-view-generator`.
- Затронутый код: `build-system/conventions` (модель меты и парсер разметки),
  `sdds-core/plugin_theme_builder` (`PropertyMeta`, `ShapeViewPropertyMapper`,
  `ViewStyleResourceWriter`), разметка `sdds-core/uikit`.
- Три View-темы перегенерированы: минус 220 строк `sd_shapeAppearanceAdjustment` и
  соответствующих `@dimen`. Скриншот-тесты без изменений — лишний adjustment на форму
  не влиял.
