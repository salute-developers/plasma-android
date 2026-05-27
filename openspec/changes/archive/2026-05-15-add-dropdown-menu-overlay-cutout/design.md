## Context

`DropdownMenu` в `sdds-core/uikit-compose` строится поверх `BasePopover`, который рендерит контент в `Popup`. Геометрия trigger уже передаётся через `TriggerInfo`, а затемнение и dismiss по tap уже реализованы в других компонентах библиотеки, например через `Overlay`, `CutoutState` и `EdgeToEdgeDialog`.

Для вырезов в compose-дереве уже существует механизм `CutoutState`, рассчитанный на связку `cutoutTarget` и `cutout` в рамках одного composable-subtree. Из обсуждения выбран путь с отдельным `ModalDropdownMenu`, который живёт внутри `EdgeToEdgeDialog`: overlay и cutout рисуются в dialog-контейнере, а сам dropdown рендерится поверх него через обычный `DropdownMenu` внутри того же dialog-окна.

Изменение затрагивает несколько модулей: core Compose API в `sdds-core/uikit-compose`, генерацию compose-стилей в `sdds-core/plugin_theme_builder`, docs/fixtures/testcases в `integration-core` и сгенерированные token-style обёртки для `DropdownMenu`.

## Goals / Non-Goals

**Goals:**
- Добавить новый API `ModalDropdownMenu` для modal-сценария dropdown, не меняя текущее поведение существующих callsite `DropdownMenu`.
- Обеспечить dismiss по tap на overlay.
- Сохранить визуальную незатемнённость trigger через вырез точной формы.
- Переиспользовать существующий механизм `CutoutState`, а не вводить отдельную систему вырезов.
- Пропустить `OverlayStyle` через `DropdownMenuStyle`, чтобы overlay стилизовался как часть стиля компонента.
- Сохранить source compatibility существующих публичных overload `DropdownMenu(...)` и `popoverTrigger(triggerInfo)`.

**Non-Goals:**
- Не менять generic публичный API `Popover`, если этого можно избежать внутренней доработкой `BasePopover`.
- Не добавлять overlay в Android View реализацию `DropdownMenu` в рамках этого change.
- Не менять default-оформление existing token styles, кроме безопасного добавления `overlayStyle` с дефолтом.
- Не вводить отдельную конфигурацию cutout padding/shape вне `TriggerInfo`, если для сценария достаточно `Shape`.

## Decisions

### 1. Overlay-сценарий выносится в новый публичный API `ModalDropdownMenu`

Существующие overload `DropdownMenu(...)` оканчиваются обязательной `content`-лямбдой и уже завязаны на поведение обычного popover. Вместо добавления runtime-флага в текущий API modal-сценарий выносится в отдельный `ModalDropdownMenu`, а базовый `DropdownMenu` сохраняет прежнюю семантику.

Альтернативы:
- Добавить `overlayEnabled` в overload `DropdownMenu`: отклонено как усложнение API и источник неоднозначной геометрии popup/overlay.
- Вынести `overlayEnabled` в `DropdownMenuStyle`: отклонено, потому что это runtime-поведение, а не только styling concern.

### 2. Overlay рендерится в `EdgeToEdgeDialog`, а меню показывается внутри него

`ModalDropdownMenu` открывает edge-to-edge dialog. Внутри dialog overlay и cutout живут в полноэкранном контейнере с устойчивой системой координат, а dropdown контент показывается поверх overlay через обычный popup-механизм `DropdownMenu`, уже в контексте dialog root.

При этом `EdgeToEdgeDialog` не должен использовать `WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS`. В modal-сценарии этот флаг приводил к тому, что popup positioning внутри `BasePopover` получал аномально большой `windowSize`, из-за чего `PopoverPlacementMode.Loose` ошибочно считал, что для `End`/`Start` размещения всегда хватает места, и fallback-перерасчёт не срабатывал. Удаление этого флага сохраняет edge-to-edge поведение dialog и возвращает корректные bounds для popup positioning.

Альтернативы:
- Рисовать overlay внутри обычного `Popup` базового `DropdownMenu`: отклонено из-за нестабильной геометрии и сложностей с coordinate spaces.
- Перестроить `DropdownMenu` без `Popup`: отклонено как излишне инвазивное.

### 3. Вырез под trigger строится через `CutoutState` и proxy Box

В dialog-контейнере создаётся локальный `CutoutState`. Overlay помечается `cutoutTarget`, а невидимый proxy `Box` позиционируется по `TriggerInfo.positionInScreen` относительно dialog root и регистрируется через `Modifier.cutout(shape = triggerInfo.shape, ...)`. Это позволяет переиспользовать существующую механику clear-выреза и избежать дублирования сложной draw-логики.

Альтернативы:
- Рисовать вырез напрямую по `TriggerInfo` без `CutoutState`: отклонено, потому что в проекте уже есть готовый механизм для вырезов.
- Требовать размещать реальный trigger в одном subtree с overlay: отклонено, потому что это ломает существующую модель использования `DropdownMenu`.

### 4. `TriggerInfo` расширяется shape-параметром, а `popoverTrigger` получает новый overload

Для точного совпадения формы выреза с trigger нужно передавать не только размер и позицию, но и `Shape`. В `TriggerInfo` добавляется shape с безопасным default, а к существующему `Modifier.popoverTrigger(triggerInfo)` добавляется новый overload `Modifier.popoverTrigger(triggerInfo, shape = ...)`. Старый overload остаётся и использует default shape.

Альтернативы:
- Отдельный modifier только для cutout shape: отклонено как избыточное усложнение API.
- Хранить в `TriggerInfo` абстрактный `CutoutSpec`: отклонено, пока достаточно стандартного `Shape`.

### 5. `DropdownMenuStyle` получает `overlayStyle`, и это изменение проходит через theme builder

В библиотеке уже есть паттерн `overlayStyle` в `ModalStyle` и `ModalBottomSheetStyle`. `DropdownMenuStyle` будет расширен аналогичным свойством и builder-методом. Это позволит не завязываться на `LocalOverlayStyle` при стилизации dropdown-specific overlay.

Из-за расширения публичного style interface нужно обновить `plugin_theme_builder` для compose dropdown-menu style generation и убедиться, что generated token wrappers продолжают собираться с безопасным default `OverlayStyle.builder().style()`.

### 6. Публичные docs и KDoc обновляются вместе с API

Изменение затрагивает публичные API `DropdownMenu`, `TriggerInfo`, `Modifier.popoverTrigger(...)` и документацию dropdown/overlay usage. Поэтому изменение должно включать KDoc для новых параметров и обновление fixtures/docs, чтобы новое поведение было отражено в generated docs.

## Risks / Trade-offs

- [Риск] Координаты proxy trigger внутри dialog могут не совпасть с реальным trigger из-за различий coordinate space. → Митигация: использовать `TriggerInfo.positionInScreen` и вычислять локальный offset относительно dialog root.
- [Риск] Добавление `shape` в `TriggerInfo` расширяет публичный API и требует аккуратного default. → Митигация: сохранить старый overload `popoverTrigger(triggerInfo)` и использовать безопасный default shape.
- [Риск] Расширение `DropdownMenuStyle` заденет generated compose styles в `tokens`. → Митигация: обновить `plugin_theme_builder` и валидировать compile/token modules.
- [Риск] Overlay/dialog может повлиять на dismiss semantics и z-order popup. → Митигация: dropdown показывается в том же dialog-контексте, а dismiss остаётся на overlay-контейнере.
- [Риск] Решение затрагивает несколько included builds. → Митигация: держать реализацию узкой по объёму и ограничить её `uikit-compose` + только необходимыми обновлениями генерации/fixtures/tests.
