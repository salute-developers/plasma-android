## Why

Компонент `Card` в `sdds-core/uikit-compose` сейчас не имеет типового сценария с двумя строками заголовочного контента, поэтому потребители вынуждены вручную собирать `label` и `subtitle` и самостоятельно поддерживать отступы и стили. Из-за этого поведение и внешний вид subtitle нельзя централизованно задавать через `CardStyle` и Theme Builder.

## What Changes

- Добавить публичную Compose-перегрузку `Card` с обязательным слотом `title` и опциональным слотом `subtitle` типа `(@Composable () -> Unit)?`.
- Реализовать новую перегрузку через существующую перегрузку с необязательным `label`, передавая в нее `Column` с `title`, `subtitle` при наличии и style-driven отступом между ними.
- Расширить `CardStyle` title/subtitle-стилями: `titleStyle`, `subtitleStyles: StatefulValue<TextStyle>`, `titleColor: StatefulValue<Brush>`, `subtitleBrush: StatefulValue<Brush>` и dimension для отступа между title и subtitle.
- В `CardStyle` задепрекейтить `labelStyle` в пользу `titleStyle`; в `CardColors` вернуть `labelColor` как legacy `InteractiveColor`, сохранить deprecation только для `backgroundColor` в пользу `backgroundBrush`.
- Добавить в builder `CardStyle` удобные overloads для title/subtitle color/brush/text style, включая `Color`, `InteractiveColor`, `Brush` и `TextStyle`, без изменения существующего API.
- Доработать генерацию стилей в `sdds-core/plugin_theme_builder` для `CardConfig.kt` и `CardComposeVariationGenerator.kt`, чтобы subtitle tokens попадали в сгенерированный Compose style.
- Не удалять и не менять сигнатуры существующих API, чтобы сохранить обратную совместимость.

## Capabilities

### New Capabilities
- `card-subtitle`: Описывает поддержку subtitle slot и subtitle styling contract для Compose `Card` и генерации стилей карточки.

### Modified Capabilities
- Нет.

## Impact

- Затрагивает included build `sdds-core`.
- Публичный API `sdds-core/uikit-compose` расширяется новой overload-функцией `Card` и новыми свойствами/builder overloads в `CardStyle`; `CardColors.labelColor` остается legacy color API без deprecation, а `CardColors.backgroundColor` остается доступным deprecated с миграцией на brush-based API.
- Затрагивается Theme Builder в `sdds-core/plugin_theme_builder`: конфигурация `CardConfig.kt` и Compose generator `CardComposeVariationGenerator.kt`.
- Затрагиваются samples/docs для Compose Card, чтобы отразить сценарий `title` с опциональным `subtitle`.
- Tokens и Gradle conventions напрямую не меняются, но генерация token-based Compose styles должна поддержать новые subtitle-поля.
- Валидация должна включать focused build/test для `sdds-core` и, при возможности, проверки генерации/компиляции затронутых Compose модулей.
