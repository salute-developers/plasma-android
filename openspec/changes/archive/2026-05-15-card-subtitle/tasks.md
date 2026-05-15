## 1. sdds-core/uikit-compose API

- [x] 1.1 Расширить `CardStyle` title/subtitle contract: добавить `titleStyle`, stateful subtitle text style, title/subtitle brush-color и subtitle gap dimension с KDoc.
- [x] 1.2 Расширить `CardColors`: вернуть `labelColor` как legacy `InteractiveColor`, добавить `titleColor: StatefulValue<Brush>` и `backgroundBrush: StatefulValue<Brush>`, а `backgroundColor` пометить deprecated с миграцией на `backgroundBrush`.
- [x] 1.3 Обновить `CardStyleBuilder.kt`: добавить builder methods/overloads для subtitle `TextStyle`, `StatefulValue<TextStyle>`, `Color`, `InteractiveColor`, `Brush`, `StatefulValue<Brush>` и stateful/simple subtitle gap.
- [x] 1.4 Обновить `CardColorsBuilder`: добавить brush-based overloads с именами `titleColor`, `backgroundColor` и `subtitleColor`, сохранив legacy `labelColor` color-based methods совместимыми без deprecation.
- [x] 1.5 Добавить defaults в `DefaultCardStyle`, `DefaultCardColors` и `DefaultCardDimensions`, сохранив прежнее поведение существующих Card callsite-ов.
- [x] 1.6 Добавить публичную overload-функцию `Card` с обязательным `title` и опциональным `subtitle`, которая вызывает существующую overload с nullable `label`.
- [x] 1.7 Реализовать внутренний `Column` для `title` и опционального `subtitle`, применив title/subtitle style, color/brush и subtitle gap из `CardStyle` с учетом `interactionSource`.

## 2. sdds-core/plugin_theme_builder

- [x] 2.1 Расширить `CardProperties` в `CardConfig.kt` nullable полями для subtitle color, subtitle typography и subtitle gap.
- [x] 2.2 Обновить merge logic `CardProperties.merge`, чтобы subtitle properties наследовались от parent variation.
- [x] 2.3 Доработать `CardComposeVariationGenerator.kt`: генерировать subtitle typography call, subtitle color call и subtitle gap dimension call только при наличии соответствующих props.
- [x] 2.4 Обновить helper checks генератора (`hasColors`, `hasDimensions`) так, чтобы subtitle props включали нужные builder blocks.

## 3. Документация и совместимость

- [x] 3.1 Обновить KDoc новой overload-функции `Card` и новых style/builder properties.
- [x] 3.2 Проверить, что KDoc/deprecation message для `labelStyle` и `backgroundColor` явно указывает замену на `titleStyle` и `backgroundBrush`, а `labelColor` не deprecated.
- [x] 3.3 Проверить, что существующие API сигнатуры `Card`, `CardStyleBuilder`, `CardColorsBuilder` и `CardDimensionsBuilder` не удалены и не изменены несовместимо.
- [x] 3.4 Проверить, что отсутствие subtitle tokens в старых Card configs не требует изменений в token files.
- [x] 3.5 Добавить sample и документацию для перегрузки `Card` с обязательным `title` и опциональным `subtitle`.

## 4. Валидация

- [x] 4.1 Запустить focused compile/test для `sdds-core/uikit-compose` из корня репозитория.
- [x] 4.2 Запустить focused compile/test для `sdds-core/plugin_theme_builder` из корня репозитория.
- [x] 4.3 При доступности времени запустить релевантные aggregate проверки `./gradlew detektAll` и `./gradlew spotlessApplyAll`.
