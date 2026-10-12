## 1. Контракт

- [ ] 1.1 Скопировать расширенную схему payload и общие фикстуры из DS Builder в `preview-contract/src/commonMain/resources/{schemas,fixtures}/v1`, добавить дайджест
- [ ] 1.2 Обновить модели `PreviewContract.kt` под расширенную схему (`PREVIEW_PROTOCOL_VERSION` остаётся 1)
- [ ] 1.3 Тесты: round trip, общие фикстуры `valid` и `invalid`, проверка совпадения с дайджестом

## 2. SDK

- [ ] 2.1 Реализовать выбор записи `states` по набору активных состояний с unit-тестами
- [ ] 2.2 Реализовать применение `alpha`, gradient `Brush` и `spread` тени в `PreparedComposeTheme`
- [ ] 2.3 Реализовать валидатор графа `styleRef` и `assetRef` с кодами ошибок
- [ ] 2.4 Реализовать `warnings` в `PreviewResult.Success`

## 3. Плагин

- [ ] 3.1 Обновить `BasicButtonPreviewStyleFactory` под новую модель состояний
- [ ] 3.2 Wasm-проверка полного рендера Button по расширенному payload

## 4. Проверки

- [ ] 4.1 `./gradlew testAll detektAll spotlessApplyAll` для затронутых модулей
- [ ] 4.2 Независимое ревью
- [ ] 4.3 [внешняя проверка] Собрать zip плагина и проверить его вместе с клиентом DS Builder в браузере
