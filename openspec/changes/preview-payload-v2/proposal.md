## Why

Preview Protocol v1 описывает одну кнопку: состояния словарём «имя → значение», цвета без прозрачности и градиентов, без вложенных стилей, иконок и тени с растяжением. Для Core-компонентов этого недостаточно. Парный change `preview-payload-v2` в репозитории DS Builder вводит протокол v2 на стороне клиента; здесь меняются контракт, SDK и плагин.

## What Changes

- Контракт переходит на Preview Protocol **v2**, `PREVIEW_PROTOCOL_VERSION = 2`; версия 1 удаляется (схемы `payload`, `result`, `component-description-result` и фикстуры переезжают в `v2`).
- Модели: состояния свойства массивом `{when, source}`, `alpha`, источники `styleRef` и `assetRef`, словарь `styles`, токен `gradient`, обязательный `spread` у слоя тени, ресурсы `SVG` и `PNG`, `warnings` в успешном результате.
- SDK: разрешение набора состояний по правилу «больше имён побеждает, при равенстве последняя запись», применение `alpha`, градиент как `Brush`, тень со `spread`, обход графа `styleRef` с кодами `unknown_style_ref` и `style_ref_cycle`.
- Плагин: `preview-plugin.json` объявляет `protocolVersion: 2`; `BasicButtonPreviewStyleFactory` использует новую модель состояний.
- Схема и общие фикстуры берутся из DS Builder (`backend-kt/preview/contract/schemas/v2`) побайтово; добавляется проверка совпадения с копией.
- **BREAKING**: формат payload и версия протокола. Затрагивает только клиент DS Builder и плагин, они выпускаются парой.

## Capabilities

### Modified Capabilities

- `preview-contract`: протокол v2, новые типы токенов, источников и состояний, предупреждения, общие фикстуры.
- `compose-preview-sdk`: разрешение набора состояний, alpha, gradient, spread и графа вложенных стилей.
- `preview-component-description`: схема результата описания компонента входит в набор схем v2.

## Impact

- `integration-core/preview-contract`: `PreviewContract.kt`, схемы и фикстуры `v2`, константа версии.
- `integration-core/preview-sdk-compose`: `PreparedComposeTheme.kt`, разрешение свойств, обработка предупреждений.
- `integration-core/preview-compose-plugin`: `BasicButtonPreviewStyleFactory.kt`, `preview-plugin.json`.
- Совместимость: плагин версии 1 клиент DS Builder v2 отклоняет, и наоборот.
