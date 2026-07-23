## Why

`sdds-core/uikit-compose` сейчас публикуется как Android-only библиотека, хотя значительная часть Compose UIKit не зависит от Android platform API и может быть вынесена в `commonMain`. Миграция на Kotlin Multiplatform нужна, чтобы переиспользовать базовые компоненты SDDS Compose за пределами Android и при этом сохранить существующий Android-артефакт для клиентов.

## What Changes

- Перевести `sdds-core/uikit-compose` на Kotlin Multiplatform в том же модуле, сохранив координату `io.github.salute-developers:sdds-uikit-compose`.
- Добавить структуру source set'ов с `commonMain` для production API и target source set'ами для platform bridge реализаций.
- Сначала выполнить spike совместимости публикации через существующий Android consumer `tokens/sdds.serv.compose/app`: проверить, что Android-клиент продолжает подключать старую координату без перехода на новый artifactId.
- Поднять Compose BOM до `2025.05.01` и привести настройку Compose compiler к Kotlin Compose compiler plugin, совместимому с Kotlin `2.1.10`.
- Вынести все production-компоненты, стили, модели, interactions и motion в `commonMain`, включая компоненты, которые изначально планировались на следующий этап.
- Изолировать `Dialog`, `Popup`, `Window`, `View`, `LocalView`, graphics и resource-dependent поведение за platform bridges в `androidMain` и Skiko source set'ах.
- Заменить AndroidX resource/range annotations в common API на SDDS common annotations с Android actual-реализациями.
- Перенести `@Preview` функции и preview-only зависимости в `androidMain`.
- **BREAKING** не планируется для Android runtime/API клиентов; риск совместимости публикации должен быть подтвержден spike до основной миграции.

## Capabilities

### New Capabilities
- `uikit-compose-multiplatform`: контракт Kotlin Multiplatform-публикации и source set'ов для `sdds-core/uikit-compose` с требованиями к обратной совместимости Android.

### Modified Capabilities

## Impact

- Затронутые included builds: `sdds-core`, `build-system`; косвенно нужно проверить `integration-core`, `tokens` и documentation/demo модули, которые используют `sdds-uikit-compose`.
- Публичный API: затронут, потому что меняются source set'ы, аннотации и publish metadata; Android JVM method descriptors для перенесенных API должны остаться совместимыми.
- Gradle conventions: затронуты, потому что публикация KMP library и настройка Compose compiler должны поддержать `uikit-compose`.
- Зависимости: Compose BOM меняется с `2025.05.00` на `2025.05.01`; старая подмена `androidx.compose.compiler:compiler:1.5.15` не должна использоваться для Compose-компиляции на Kotlin `2.1.10`.
- Генерация документации: потенциально затронута source set layout, KDoc, previews и интеграция API info KSP.
- Публикация: затронута; root KMP publication, Android target publication, Gradle Module Metadata и POM-only поведение должны быть проверены до принятия in-place миграции.
- Дополнительные consumers: `playground/sandbox-integration-test` используется как проверка published artifact/Android runtime variant, потому что он может потреблять `sdds-uikit-compose` как внешний consumer.
