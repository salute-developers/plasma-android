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

## Copy of the canonical contract

`schemas/v1/preview-payload.schema.json` and `fixtures/v1/shared` are byte-identical copies of
`design-system-builder/backend-kt/preview/contract`. `schemas/v1/DIGEST` records their SHA-256:

- `SchemaContractTest` fails when a file of the copy no longer matches `DIGEST` (a manual edit of the copy);
- the `Preview contract check` workflow compares `DIGEST` with the canonical `CONTRACT.sha256`: a pull request gets a warning,
  `release/*`, `hotfix/*`, `main` and the nightly run fail. The reference is set by the repository variable `DSB_CONTRACT_REF`
  (default `dev`).

Update the copy from a design-system-builder checkout:

```bash
backend-kt/preview/contract/fingerprint.sh --sync-to <plasma-android>/integration-core/preview-contract/src/commonMain/resources
```
