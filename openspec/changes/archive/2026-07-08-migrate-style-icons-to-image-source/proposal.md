## Why

В `sdds-core/uikit-compose` часть style API хранит и задает иконки как `@DrawableRes Int`, хотя в UIKit Compose уже есть более общий `ImageSource`, поддерживающий drawable resource, `ImageVector`, `ImageBitmap` и произвольный `Painter`. Из-за этого style-билдеры ограничивают потребителей Android resource ID и мешают использовать один контракт для multiplatform-источников изображений без ручных обходных параметров на уровне компонентов.

## What Changes

- Добавить в style API `sdds-core/uikit-compose` новые свойства для иконок на базе `ImageSource?`.
- Добавить в соответствующие style builder-интерфейсы методы, принимающие `ImageSource`, для настройки тех же иконок.
- Пометить старые свойства и builder-методы с `@DrawableRes Int` как deprecated; deprecated свойства default style возвращают `null`, а deprecated builder-методы остаются source-compatible без записи drawable id в style state.
- Перевести рендеринг style-иконок компонентов на новые `ImageSource`-свойства.
- Обновить распознавание API metadata, чтобы параметры типа `ImageSource` в style builder API классифицировались как иконки.
- Оставить существующий сгенерированный код Theme Builder и клиентский код с `R.drawable.*` source-compatible; генератор переводится на новый API через `resourceImageSource`.
- **BREAKING**: отсутствуют. Существующие публичные `@DrawableRes Int` API не удаляются и продолжают компилироваться.

## Capabilities

### New Capabilities
- `uikit-compose-style-image-sources`: контракт миграции иконок в style API `uikit-compose` с `@DrawableRes Int` на `ImageSource` без поломки обратной совместимости.

### Modified Capabilities
- `style-builder-api-info`: параметры style builder API типа `ImageSource`, представляющие иконки, должны классифицироваться как `ICON` в API metadata.

## Impact

- Affected included builds/modules: `sdds-core/uikit-compose`, `sdds-core/api-info-ksp`, потенциально `sdds-core/plugin_theme_builder` для генерации нового API.
- Public API: да, добавляются новые свойства и builder-методы; старые публичные свойства и методы становятся deprecated, но не удаляются.
- Tokens/generated code: существующие token-модули и sandbox styles, которые вызывают builder-методы с `R.drawable.*`, должны оставаться совместимыми.
- Docs/API generation: затрагивается классификация параметров иконок в `api-info-ksp`.
- Gradle conventions/dependencies: не затрагиваются.
- Validation scope: focused compile/test для `sdds-core:uikit-compose` и `sdds-core:api-info-ksp`, плюс проверка сборки representative generated Compose styles из `tokens` или `integration-core`.
