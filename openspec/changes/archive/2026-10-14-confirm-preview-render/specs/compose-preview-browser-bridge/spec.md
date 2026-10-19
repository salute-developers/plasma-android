## ADDED Requirements

### Requirement: Успех сообщается после отрисовки содержимого

Plugin SHALL отправлять `PreviewResult.Success` только после того, как содержимое payload
скомпоновано и нарисовано. Ошибки подготовки и применения состояния SHALL отправляться сразу.
Неподтверждённый успех SHALL вытесняться следующим payload результатом `superseded`.

#### Scenario: Содержимое нарисовано

- **WHEN** plugin применил состояние рендера и Compose нарисовал новое содержимое
- **THEN** plugin MUST отправить `success` для этого `requestId`.

#### Scenario: Кадр не состоялся

- **WHEN** исключение в layout или draw остановило Compose после применения состояния
- **THEN** plugin MUST NOT отправлять `success` для этого `requestId`.

#### Scenario: Новый payload до подтверждения

- **WHEN** приходит новый payload, пока успех предыдущего не подтверждён
- **THEN** plugin MUST отправить `failure` с кодом `superseded` для предыдущего `requestId`.

### Requirement: Сбой плагина сообщается хосту

Необработанная ошибка или отклонённый promise в странице plugin SHALL завершать ожидающие запросы
результатом `failure` с кодом `render_crashed`. Последующие payload MUST получать `failure` с кодом
`plugin_crashed`, пока iframe не перезагружен.

#### Scenario: Ошибка в странице

- **WHEN** страница получает необработанную ошибку, пока запрос ожидает результата
- **THEN** plugin MUST отправить `failure` с кодом `render_crashed` для этого запроса.

#### Scenario: Payload после сбоя

- **WHEN** хост отправляет payload в уже остановленный plugin
- **THEN** plugin MUST ответить `failure` с кодом `plugin_crashed` без попытки рендера.

### Requirement: Отказ до рендера доставляется хосту

Browser bridge SHALL отправлять хосту сообщением `sdds.preview.result` любой `failure`, найденный до передачи payload в Kotlin (нечитаемый payload, отсутствующий `requestId`, остановленный plugin), а не только возвращать его значением вызова.

#### Scenario: Нечитаемый payload

- **WHEN** хост отправляет payload, который нельзя разобрать
- **THEN** plugin MUST отправить хосту `failure` с кодом `invalid_payload`.
