## 1. Разметка ресурсов (`sdds-core/uikit`)

- [x] 1.1 Ввести namespace `xmlns:sdds="http://schemas.sdds.ru/android/sdds"` и разметить пилотный `declare-styleable` (`Button`): `sdds:api_info`, `sdds:api_name` на расходящихся attr, `sdds:api_type` на неоднозначных `reference`, переименование `<enum>` где нужно
- [x] 1.2 Разметить кастомные состояния реального компонента с ColorState (`Avatar`/`SdAvatarStatus`): `sdds:api_state="AvatarStatus"` / `sdds:api_state_kind="scoped"` / `sdds:api_name` на `sd_status_active`/`sd_status_inactive`. Проверено вживую end-to-end. Находка: `StateInfo.ordinal` = порядок в state-styleable (active=0/inactive=1), тогда как рантайм-ordinal берётся из enum `sd_status` (none=0/active=1/inactive=2) — авторитетный ordinal лежит в enum-value, stateSet join по `configName`. См. отчёт ниже / [[uikit-api-meta-avatar-colorstate]]
- [x] 1.3 Добавить README/KDoc-документацию по namespace `sdds` и словарю атрибутов (`api_info`/`api_name`/`api_type`/`api_package`/`api_builder_fun`/`api_state`/`api_state_kind`)

## 2. Модель и парсер (`build-system/conventions`)

- [x] 2.1 Реализовать модель `ComponentMeta` (+ `PropertyMeta`, `StateSet`, `StateInfo`) отдельно от compose-`ComposeComponentMeta` (producer — plain data class + Gson; consumer в `plugin_theme_builder` — `@Serializable`)
- [x] 2.2 Реализовать чистый (без Gradle-типов) класс парсера: первый проход — глобальный индекс `attr → format` по всем `values/*.xml`; второй — обход размеченных `declare-styleable`
- [x] 2.3 Реализовать вычисление `id` (авто-strip `sd_` / `sdds:api_name`) и классификацию типа (`sdds:api_type` → `format` → keyword-эвристика; `enum` → `value` со значениями `(name, value, configName)`)
- [x] 2.4 Реализовать сборку наборов состояний: разбор кастомных состояний с флейвором (`android`/`shared`/`scoped`) и детерминированным порядком (ordinal); отбрасывание `android:*` и неразмеченных attr

## 3. Gradle-задача генерации (`build-system/conventions`)

- [x] 3.1 Реализовать Gradle-задачу, вызывающую парсер и сериализующую результат в `sdds/api/uikit-api-meta.json`; объявить входы/выходы для инкрементальности; пустой массив при отсутствии разметки
- [x] 3.2 Добавить convention-плагин, регистрирующий задачу на `uikit`, и обеспечить упаковку `uikit-api-meta.json` в ресурсы/AAR модуля `uikit`
- [x] 3.3 Добавить KDoc на публичную задачу и convention-плагин

## 4. Чтение меты (`sdds-core/plugin_theme_builder`)

- [x] 4.1 Реализовать `UikitApiMetaTask` (зеркало `UikitComposeApiMetaTask`): поиск `uikit-api-meta.json` в ZIP-артефактах classpath, десериализация в `List<ComponentMeta>`, запись выходного файла; пустой список при отсутствии
- [x] 4.2 Прокинуть регистрацию/конфигурацию `UikitApiMetaTask` в `ThemeBuilderPlugin` по образцу `readUikitComposeApiMeta` (без включения View-генерации в этот change)

## 5. Обязательное тестовое покрытие

- [x] 5.1 Тесты именования: авто-strip `sd_valuePadding` → `valuePadding`; переопределение через `sdds:api_name` (`conventions/DeclareStyleableParserTest`)
- [x] 5.2 Тест cross-file резолва `format` через глобальный индекс (styleable ссылается на attr без `format`)
- [x] 5.3 Тесты `sdds:api_info="A,B"` → два компонента; классификация типов; переименование `<enum>` → `configName`
- [x] 5.4 Тест фильтрации: `android:*` и непомеченные/непопадающие attr исключены из меты
- [x] 5.5 Тест наборов состояний: корректный флейвор (`android`/`shared`/`scoped`), стабильный порядок/ordinal
- [x] 5.6 Тест сериализации: round-trip producer-JSON → consumer `ComponentMeta`, форвард-совместимость по неизвестным ключам (`plugin_theme_builder/ViewComponentMetaTest`)

## 6. Валидация (из корня репозитория)

- [x] 6.1 `./gradlew :build-system:conventions:test` — обязательные unit-тесты парсера зелёные
- [x] 6.2 `./gradlew :sdds-core:uikit:assemble` — aapt2 не падает на размеченных ресурсах; `uikit-api-meta.json` присутствует в AAR
- [x] 6.3 `./gradlew :sdds-core:plugin_theme_builder:test` + `:playground:theme-builder:readUikitApiMeta` — `UikitApiMetaTask` корректно читает мету из classpath end-to-end (24 параметра `Button`)
- [x] 6.4 `spotlessApply` + `detekt` для нового кода в `plugin_theme_builder` зелёные (`conventions` — без detekt/spotless)
