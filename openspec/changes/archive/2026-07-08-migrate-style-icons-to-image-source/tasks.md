## 1. Инвентаризация API `sdds-core/uikit-compose`

- [x] 1.1 Найти все style-свойства и style builder-методы с `@DrawableRes Int` в `sdds-core/uikit-compose`, относящиеся к иконкам.
- [x] 1.2 Зафиксировать список затрагиваемых компонентов и текущих мест рендеринга, где используются `painterResource(style.*Icon)` или drawable style-свойства.
- [x] 1.3 Проверить существующие helper’ы `ImageSource` и `resourceImageSource` на пригодность для всех мигрируемых style API.

## 2. Public API `sdds-core/uikit-compose`

- [x] 2.1 Добавить `ImageSource?` свойства с суффиксом `Source` в затронутые style-интерфейсы с default getter для совместимости внешних реализаций.
- [x] 2.2 Добавить overload’ы style builder-методов, принимающие `ImageSource`, для всех мигрируемых иконок.
- [x] 2.3 Пометить старые drawable style-свойства и builder-методы `@Deprecated` с корректными `ReplaceWith` и KDoc.
- [x] 2.4 Обновить default style implementations так, чтобы deprecated drawable builder API оставался source-compatible, не записывал drawable id в style state, а deprecated drawable style-свойства по умолчанию возвращали `null`.
- [x] 2.5 Проверить nullable/non-nullable сигнатуры builder-методов и избежать неоднозначных вызовов вроде `icon(null)`.

## 3. Runtime rendering `sdds-core/uikit-compose`

- [x] 3.1 Перевести компоненты на чтение новых `*Source` style-свойств при рендеринге style-иконок.
- [x] 3.2 Сохранить приоритет существующих параметров компонентов над style-значениями там, где компоненты уже принимают drawable resource или `Painter`.
- [x] 3.3 Убедиться, что style-иконки рендерятся через `ImageSource`, а drawable id адаптируются в конечных Android styles генератором.
- [x] 3.4 Удалить прямые обращения к deprecated drawable style-свойствам из внутреннего runtime-кода, кроме compatibility fallback.

## 4. API metadata и Theme Builder

- [x] 4.1 Обновить `sdds-core/api-info-ksp`, чтобы параметры типа `com.sdds.compose.uikit.ImageSource` классифицировались как `ParameterType.ICON`.
- [x] 4.2 Проверить `api-info-ksp` на builder с `ImageSource` icon overload и deprecated drawable overload; отдельный test source set в модуле отсутствует, покрыто compile/detekt.
- [x] 4.3 Решить по месту реализации, переводить ли `sdds-core/plugin_theme_builder` на генерацию `resourceImageSource(R.drawable.*)` в рамках этого change.
- [x] 4.4 Theme Builder переводится на генерацию `resourceImageSource(R.drawable.*)` и импорт `resourceImageSource`.
- [x] 4.5 Проверить, что existing generated style code с `R.drawable.*` продолжает компилироваться через deprecated overload’ы.

## 5. Документация и KDoc

- [x] 5.1 Обновить KDoc новых `ImageSource` style-свойств и builder-методов.
- [x] 5.2 Обновить KDoc deprecated drawable API с понятным migration path на `ImageSource`.
- [x] 5.3 Проверить docs-facing API metadata для representative style builder’ов с иконками.

## 6. Валидация

- [x] 6.1 Запустить focused compile/test для `sdds-core/uikit-compose` через root `./gradlew`.
- [x] 6.2 Запустить focused compile/test для `sdds-core/api-info-ksp` через root `./gradlew`.
- [x] 6.3 Собрать representative generated Compose styles из `tokens` или `integration-core`, которые используют drawable icon builder API.
- [x] 6.4 Запустить релевантные detekt/spotless проверки для измененных модулей или зафиксировать причину, если проверка недоступна локально.
- [x] 6.5 Проверить `openspec status --change "migrate-style-icons-to-image-source"` и убедиться, что все apply-required artifacts готовы.
