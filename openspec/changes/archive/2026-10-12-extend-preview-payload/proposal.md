## Why

Preview Protocol v1 в нынешнем виде описывает одну кнопку: состояния словарём «имя → значение», цвета без прозрачности и градиентов, без вложенных стилей, иконок и тени с растяжением. Для Core-компонентов этого недостаточно. Парный change `extend-preview-payload` в репозитории DS Builder вводит расширение протокола на стороне клиента; здесь меняются контракт, SDK и плагин.

## What Changes

- Контракт расширяется в рамках Preview Protocol v1 без повышения номера версии (`PREVIEW_PROTOCOL_VERSION` остаётся 1): v1 не выпускался за пределы разработки.
- Модели: состояния свойства массивом `{when, source}`, `alpha`, источники `styleRef` и `assetRef`, словарь `styles`, токен `gradient`, обязательный `spread` у слоя тени, ресурсы `SVG` и `PNG`, `warnings` в успешном результате.
- SDK: разрешение набора состояний по правилу «больше имён побеждает, при равенстве последняя запись», применение `alpha`, градиент как `Brush`, тень со `spread`, обход графа `styleRef` с кодами `unknown_style_ref` и `style_ref_cycle`.
- Плагин: `BasicButtonPreviewStyleFactory` использует новую модель состояний.
- Схема и общие фикстуры берутся из DS Builder (`backend-kt/preview/contract/schemas/v1`) побайтово; добавляется проверка совпадения с копией.
- **BREAKING**: формат состояний в payload. Затрагивает только клиент DS Builder и плагин, они выпускаются парой.

## Capabilities

### Modified Capabilities

- `preview-contract`: расширенный протокол v1, новые типы токенов, источников и состояний, предупреждения, общие фикстуры.
- `compose-preview-sdk`: разрешение набора состояний, alpha, gradient, spread и графа вложенных стилей.

## Impact

- `integration-core/preview-contract`: `PreviewContract.kt`, схемы и фикстуры `v1`.
- `integration-core/preview-sdk-compose`: `PreparedComposeTheme.kt`, разрешение свойств, обработка предупреждений.
- `integration-core/preview-compose-plugin`: `BasicButtonPreviewStyleFactory.kt`, `preview-plugin.json`.
- Совместимость: номер версии не меняется, поэтому клиент и плагин нужно собирать из согласованных состояний кода.
