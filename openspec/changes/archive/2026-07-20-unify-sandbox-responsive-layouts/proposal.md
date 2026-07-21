## Why

Текущий Compose Multiplatform sandbox смешивает размер окна и модель взаимодействия: `Mobile`, `Tv` и `Desktop` представлены как разные layout, а desktop дополнительно использует собственный breakpoint. Из-за этого одинаковый размер окна может давать разную структуру экрана на разных таргетах, а узкое desktop-окно не переходит в общий mobile-сценарий.

## What Changes

- Оставить в sandbox только два адаптивных layout: `Mobile` для окон ниже общего large-порога и `Large` для окон, достигших этого порога, независимо от таргета.
- Перенести платформенные различия внутрь `Large`: Android использует focus-driven `Drawer`, а iOS/iPad, JVM Desktop, native macOS и Web показывают постоянную панель компонентов.
- На iPhone и других узких окнах использовать `Mobile`; на iPad с large-окном использовать постоянную панель без `Drawer`.
- Удалить отдельный desktop breakpoint и explicit-menu вариант узкого `DesktopLayout`; узкое desktop/web-окно должно использовать общий `MobileLayout`.
- Связать mobile/large presentation component story, стартовый экран и навигационные анимации с единым resolved layout, а не с TV/desktop policy.
- Добавить явную кнопку возврата со story на список компонентов в `Mobile`, чтобы навигация назад не зависела от системного жеста Android/iOS и была доступна на desktop/Web при узком окне.
- **BREAKING**: заменить публичный `SandboxNavigationPolicy`, который одновременно кодирует платформу и layout, платформенно определяемой стратегией large-навигации; обновить launcher-ы пилотного `tokens/sdds.serv.compose/app`.

## Capabilities

### New Capabilities

Нет.

### Modified Capabilities

- `sandbox-compose-multiplatform`: изменить требования к адаптивному выбору layout и платформенному поведению панели навигации на Android, iOS/iPad, desktop и Web.

## Impact

- Affected modules: `integration-core:sandbox-compose` и platform launcher-ы `tokens/sdds.serv.compose:app`.
- Public API: изменится common-конфигурация `SandboxApp`/`SddsServSandboxApp`; `SandboxNavigationPolicy` будет удалён или заменён без Android framework types в common API.
- UI behavior: desktop/web при узком окне перейдут на общий mobile flow с явной кнопкой возврата со story; iPad large будет иметь постоянную панель; Android large сохранит focus-driven drawer.
- Dependencies: новые зависимости не требуются; Compose `Drawer`, Navigation и window-size API остаются существующими.
- Tokens, Theme Builder, generated integration-код, docs generation и Gradle conventions не меняются.
- Validation: common unit tests выбора layout/режима навигации, focused compilation Android/iOS/JVM/native macOS/JS/Wasm и ручная проверка resize, active route, focus drawer и постоянной панели.
