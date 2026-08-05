## 1. Разметка и модель меты

- [x] 1.1 Удалить из `declare-styleable name="Chip"` четыре дублирующие записи `<attr>` (`android:minWidth`/`android:minHeight`/`android:paddingStart`/`android:paddingEnd`), ключи которых отсутствуют в конфигах тем и в легаси-фикстуре
- [x] 1.2 Добавить `shapeAdjustment` в producer-модель `PropertyMeta` (`build-system/conventions`) и в consumer-модель (`plugin_theme_builder`)
- [x] 1.3 Читать `sdds:api_shape_adjustment` в `DeclareStyleableParser`: дефолт `true` для `<prefix>shapeAppearance`, `false` для прочих shape-атрибутов; ошибка на не-shape свойстве и на значении вне `true`/`false`
- [x] 1.4 Проставить явное владение там, где adjustment печатали рукописные генераторы: `sd_itemSelectorShapeAppearance` (`Wheel`), `sd_thumbShapeAppearance` и `sd_trackShapeAppearance` (`Switch`)

## 2. Генерация

- [x] 2.1 `ShapeViewPropertyMapper` передаёт adjustment только для свойства-владельца
- [x] 2.2 `ViewStyleResourceWriter` падает с `ThemeBuilderException`, если стиль уже содержит `sd_shapeAppearanceAdjustment`

## 3. Тесты

- [x] 3.1 `MarkupVocabularyTest`: дефолтный владелец, явное владение, ошибка на не-shape свойстве, ошибка на недопустимом значении
- [x] 3.2 `MarkupCoverageTest`: гейт «разметка не отняла adjustment у свойств, которым его печатали рукописные генераторы»
- [x] 3.3 `UniversalViewEmissionTest`: не-владелец adjustment не печатает; два владельца в одном стиле → ошибка

## 4. Перегенерация и проверка

- [x] 4.1 Полный цикл `cleanTheme` + `generateTheme` + `generateComponents` для трёх View-тем
- [x] 4.2 Diff по темам содержит только удаление `sd_shapeAppearanceAdjustment` и осиротевших `@dimen` (220 строк)
- [x] 4.3 `lintDebug` зелёный на `uikit` и трёх View-темах
- [x] 4.4 Скриншот-тесты трёх View-тем зелёные
- [x] 4.5 Документация словаря разметки (`VIEW_STYLE_GENERATOR.md`) описывает новое слово и новую ошибку генерации
