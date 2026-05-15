## Context

`Card` в `sdds-core/uikit-compose` уже поддерживает расширенную перегрузку с `extra`, `label`, `orientation`, content padding и focus selector settings. Сейчас `label` рендерится отдельным слотом рядом с content: для vertical card через `Column`, для horizontal card через `Row`, а расстояние между content и label задается `CardDimensions.mainAxisGap`.

Для сценария `title + subtitle` нужна новая публичная перегрузка, но без изменения существующих сигнатур. Также текущий `CardStyle` содержит только `labelStyle` и `labelColor`, поэтому title/subtitle нельзя задать через отдельный style contract и Theme Builder. В `CardColors` существующий `backgroundColor` ограничен `InteractiveColor`; его нужно дополнить brush-based stateful API, оставив старое свойство deprecated для совместимости. `labelColor` остается legacy API для старого nullable `label`, а новый title получает отдельный `titleColor`.

## Goals / Non-Goals

**Goals:**
- Добавить overload `Card` с обязательным `title` и опциональным `subtitle` слотом типа `(@Composable () -> Unit)?`.
- Собрать `title` и, при наличии, `subtitle` внутри новой перегрузки в `Column` и передать результат в существующий nullable `label` slot.
- Добавить в `CardStyle` `titleStyle`, stateful subtitle style contract и `StatefulValue<Dp>` для отступа между `title` и `subtitle`.
- Добавить в `CardColors` `titleColor: StatefulValue<Brush>` и `backgroundBrush: StatefulValue<Brush>`, `labelColor` оставить как было, а `backgroundColor` пометить deprecated с replaceWith на `backgroundBrush`.
- Дать builder overloads для `Color`, `InteractiveColor`, `Brush`, `StatefulValue<Brush>`, `TextStyle` и `StatefulValue<TextStyle>` в существующем стиле Card.
- Научить Theme Builder читать subtitle tokens из `CardConfig.kt` и генерировать соответствующие builder calls в `CardComposeVariationGenerator.kt`.
- Сохранить бинарно/исходно совместимые существующие callsite-ы Card и CardStyle builder.

**Non-Goals:**
- Не менять поведение существующей перегрузки `Card` с nullable `label`.
- Не менять View/UIKit реализацию Card.
- Не мигрировать уже сгенерированные token modules вручную.
- Не менять смысл `mainAxisGap`; он остается расстоянием между content и label area.

## Decisions

1. Новая перегрузка будет оберткой над существующей перегрузкой с `label: (@Composable () -> Unit)?`.

   Такой подход сохраняет единую реализацию layout/focus/background/content/extra и снижает риск расхождений между старыми и новыми сценариями. Альтернатива с изменением private `VerticalCard`/`HorizontalCard` под отдельный subtitle slot дала бы больше точек изменения и могла бы незаметно затронуть старый API.

2. `title` и опциональный `subtitle` будут объединяться в `Column` внутри `label` slot.

   Это напрямую соответствует требованию и работает одинаково для vertical/horizontal Card: существующая Card продолжает позиционировать label area относительно content, а новая Column управляет только внутренней вертикальной группой `title + subtitle`, если subtitle передан. Альтернатива с добавлением subtitle в `VerticalCard`/`HorizontalCard` потребовала бы расширять internal функции и дублировать styling logic.

3. Отступ между `title` и `subtitle` должен быть отдельным dimension, например `subtitleGap`, и храниться как `StatefulValue<Dp>`.

   `mainAxisGap` уже отвечает за расстояние между content и label area; переиспользование этого поля поменяло бы существующий визуальный контракт. Stateful dimension позволит в будущем поддержать интерактивные состояния тем же способом, что и другие stateful style values.

4. Цвета title/background должны поддерживать brush-based stateful contract.

   `CardColors` должен получить `titleColor: StatefulValue<Brush>` и `backgroundBrush: StatefulValue<Brush>`. Старый `labelColor: InteractiveColor` остается в интерфейсе без deprecation для старого nullable `label`, а `backgroundColor: InteractiveColor` остается deprecated с миграцией на `backgroundBrush`. Runtime Card должен использовать `backgroundBrush`; новая title/subtitle overload должна использовать `titleColor` для title.

5. Subtitle color должен храниться как `StatefulValue<Brush>`, а builder должен принимать и простые цвета, и brush/stateful варианты.

   `Brush` покрывает solid color и более сложные заливки. Для удобства старта builder overloads должны конвертировать `Color` и `InteractiveColor` в brush-based representation, не требуя от потребителя ручных преобразований.

6. Title/subtitle typography должны иметь отдельные style-поля.

   `labelStyle` остается в `CardStyle`, но deprecated с заменой на `titleStyle`. Для subtitle используется `StatefulValue<TextStyle>` и удобная перегрузка `subtitleStyle(TextStyle)`.

7. Theme Builder должен расширить `CardProperties` nullable полями `subtitleColor`, `subtitleStyle`, `subtitleGap` и учитывать их при merge/generation.

   Nullable поля сохраняют обратную совместимость с существующими token configs. Генератор должен добавлять `.subtitleStyle(...)`, `.colors { subtitleColor(...) }` и `.dimensions { subtitleGap(...) }` только когда соответствующие props заданы.

## Risks / Trade-offs

- [Risk] Новая overload-сигнатура может конфликтовать с существующей overload resolution для callsite-ов с именованным `label`.
  Mitigation: сделать `title` обязательным, `subtitle` опциональным и не менять существующую nullable overload; проверить компиляцией `uikit-compose`.

- [Risk] Конвертация `InteractiveColor` в `StatefulValue<Brush>` может не иметь готового helper API.
  Mitigation: использовать существующие helpers из `interactions`/`graphics.brush`, либо добавить минимальный локальный helper в `uikit-compose`, покрытый compile check.

- [Risk] Theme Builder может генерировать builder calls, которых нет в runtime API.
  Mitigation: сначала добавить runtime builder contract, затем generator calls с теми же именами и focused compile/tests для `plugin_theme_builder`.

- [Risk] Defaults для subtitle style могут неожиданно отличаться от label.
  Mitigation: задать безопасные defaults (`TextStyle.Default`, transparent/black-compatible brush по существующему стилю Card, `0.dp`) и явно проверить сценарий без subtitle tokens.

- [Risk] Deprecated `backgroundColor` сложно корректно получить из произвольного `Brush`.
  Mitigation: оставить существующие builder overloads `backgroundColor(...)` как входные convenience methods, добавить brush overloads с тем же именем, а `labelColor` оставить legacy `InteractiveColor` без deprecation. Для нового title добавить отдельные overloads `titleColor(...)`.
