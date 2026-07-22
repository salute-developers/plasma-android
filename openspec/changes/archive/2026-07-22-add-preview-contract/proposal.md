## Why

DS Builder и Preview Host нужен небольшой стабильный wire boundary для передачи
готовой инструкции renderer. Контракт не должен дублировать внутренние модели
assembler или заранее проектировать patch/plugin infrastructure.

## What Changes

- Добавляется publishable KMP-модуль `integration-core/preview-contract`.
- Preview Protocol v1 содержит полный `PreviewPayload` и простой `PreviewResult`.
- Payload передаёт platform, effective theme values, component configuration,
  runtime example props и необязательный surface.
- JSON Schema являются source of truth и публикуются с canonical fixtures.
- Patch, provenance, dependency graph, plugin manifest и asset resolver исключены
  из v1.

## Capabilities

### New Capabilities

- `preview-contract`: минимальный language-neutral renderer-ready Preview Protocol.

## Impact

- Новый artifact `io.github.salute-developers:preview-contract`.
- Зависимость только от `kotlinx.serialization`.
- Будущий assembler обязан передавать уже вычисленные effective values.
