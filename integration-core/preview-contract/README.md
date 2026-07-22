# Preview Contract

Kotlin Multiplatform artifact `io.github.salute-developers:preview-contract`
описывает минимальную renderer-ready инструкцию DS Builder Preview Protocol v1.
Модуль не зависит от Compose, Android UI, renderer или `sandbox-*`.

## Модель

`PreviewPayload` содержит только данные, необходимые для одного полного render:
platform, effective theme values, effective component configuration, runtime example
props и необязательный surface. Ответ представлен `PreviewResult.Success` или
`PreviewResult.Failure`.

Assembler обязан до отправки payload разрешить palette references, применить
platform adjustments, вычислить effective properties и раскрыть dependencies/reuse.
Эта история вычисления не является частью wire contract.

Incremental patches, plugin manifests, asset loading и расширенная диагностика не
входят в v1. Они должны проектироваться отдельными контрактами при появлении
соответствующих runtime consumers.

## Source of truth

JSON Schema Draft 2020-12 в `src/commonMain/resources/schemas/v1` является source
of truth. Canonical fixtures публикуются рядом со schemas. Kotlin-модели
`com.sdds.preview.contract` проверяются schema/serialization round-trip tests.
