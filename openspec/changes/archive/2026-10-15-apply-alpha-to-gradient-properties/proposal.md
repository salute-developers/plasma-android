## Why

В Compose-превью `AvatarGroup` круги залиты сплошным градиентом, а текст аватара (`textColor`, тот же градиент) на нём не
виден. В приложении фон аватара полупрозрачный: `backgroundColor(surfaceDefaultAccentGradient.asLayered(0.2f))`. Клиент
начнёт передавать `alpha` значений (парный change `add-component-value-alpha` в `design-system-builder`), но плагин для
токена-градиента его игнорирует: `brushValue` накладывает прозрачность только на `SolidColor`, а градиентную кисть
возвращает без изменений.

## What Changes

- Плагин применяет `alpha` источника к градиенту: кисть строится с множителем прозрачности для каждого цвета стопа.
- Сплошные цвета ведут себя как раньше.
- Предупреждения и контракт payload не меняются.

## Capabilities

### New Capabilities

- `compose-preview-gradient-alpha`: прозрачность градиентного значения свойства в превью.

### Modified Capabilities

Нет.

## Impact

- `integration-core/preview-sdk-compose`: тема (`gradient(id, alpha)`), `resolve`, `brushValue`, тесты.
- Парный change `add-component-value-alpha` в `design-system-builder` (API и клиент).
