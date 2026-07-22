## Context

Первая модель контракта смешивала renderer instruction с историей вычисления
данных DS Builder. Это создавало десятки сущностей без подтверждённых consumers.

## Decisions

### 1. Контракт является готовой инструкцией renderer

Assembler разрешает references, adjustments, dependencies и variations до отправки
payload. Wire contract содержит только effective state.

### 2. v1 использует только полные payload

Каждое изменение отправляет новый `PreviewPayload`. Patch вводится отдельным change,
когда измерения подтвердят необходимость incremental transport.

### 3. Theme является map нормализованных значений

Token source, selector, provenance и tenant metadata не нужны renderer. Token ID
является ключом, тип задаётся discriminator конкретного `TokenValue`.

### 4. Component содержит effective properties

Component передаёт ID, выбранные variation styles и JSON properties. Combination,
state source, reuse и dependency graph остаются внутри assembler.

### 5. Lifecycle ограничен результатом request

Transport отвечает за соединение и disposal. Contract описывает только success или
failure, коррелированные по `requestId`.

### 6. Plugin manifest не входит в Preview Protocol v1

Manifest проектируется вместе с plugin loader, artifact security и deployment model.

## Validation

- JSON Schema Draft 2020-12 для payload и result.
- Kotlin/schema round trip canonical fixtures.
- Semantic check поддерживаемой integer protocol version.
- KMP allTests, Detekt и Spotless.
