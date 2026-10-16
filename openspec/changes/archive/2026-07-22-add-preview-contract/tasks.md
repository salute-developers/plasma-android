## 1. Модуль

- [x] 1.1 Создать publishable KMP-модуль `:preview-contract` с serialization.
- [x] 1.2 Зарегистрировать модуль и публиковать versioned resources.

## 2. Минимальный Preview Protocol v1

- [x] 2.1 Реализовать payload, platform, effective theme/component/example/surface.
- [x] 2.2 Реализовать typed color/dimension/shape/shadow/typography values.
- [x] 2.3 Реализовать коррелированные success/failure results.
- [x] 2.4 Добавить проверку integer protocol version.

## 3. Schemas и tests

- [x] 3.1 Добавить Draft 2020-12 schemas payload/result и fixtures.
- [x] 3.2 Добавить schema validation и Kotlin round-trip tests.
- [x] 3.3 Проверить runtime-neutral dependency/API surface и resources packaging.

## 4. Документация и проверки

- [x] 4.1 Добавить русский KDoc и README с renderer-ready boundary.
- [x] 4.2 Выполнить `:preview-contract:allTests`, Detekt и Spotless.
- [x] 4.3 Выполнить репозиторные `testAll` и `detektAll`, зафиксировав unrelated failures.

  Результат: `testAll` успешен. `detektAll` остановился на 9 существующих
  `UndocumentedPublicProperty` в generated-файле
  `tokens/plasma.homeds.compose/.../CustomTypography.kt`; Detekt нового модуля
  успешен.
