# Compose Preview SDK

Экспериментальный KMP SDK преобразует renderer-ready `PreviewPayload` в Compose-значения.
MVP поддерживает theme tokens, runtime TTF/OTF fonts и общие contracts style factories.
UIKit-specific BasicButton assembly находится в `integration-core:preview-compose-plugin`.

В модуль намеренно не входят универсальная генерация style factories, Gradle tooling plugin,
manifest/distribution и browser host bridge.
