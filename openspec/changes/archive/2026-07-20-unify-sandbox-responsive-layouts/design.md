## Context

В `integration-core:sandbox-compose` текущий `MainContent` сначала совмещает `SandboxNavigationPolicy` и ширину окна в `SandboxLayout.Mobile`, `SandboxLayout.Tv` или `SandboxLayout.Desktop`, а затем выбирает три разных composable layout. `DesktopLayout` дополнительно вводит `PersistentDesktopNavigationBreakpoint = 1200.dp`: выше него панель постоянная, ниже отображается отдельная menu button и overlay-панель. `TvLayout` использует focus-driven `Drawer`.

В результате размер экрана и модель ввода образуют одну ось конфигурации. Desktop policy отключает общий mobile layout даже на узком окне, а `ComponentScaffold` вынужден отдельно вычислять large-состояние для desktop и остальных режимов. Публичный `SandboxNavigationPolicy` также позволяет launcher-у принудительно выбрать layout, хотя платформа должна влиять только на поведение панели внутри большого экрана.

Изменение ограничивается `integration-core:sandbox-compose` и вызовами общего root в `tokens/sdds.serv.compose:app`. Token contract, Theme Builder, UIKit `Drawer`, generated integration-код и Gradle conventions не требуют изменений.

## Goals / Non-Goals

**Goals:**

- Иметь ровно два адаптивных layout: `Mobile` и `Large`.
- Выбирать layout только по общему expanded-width breakpoint на всех Compose Multiplatform targets.
- На Android использовать в `Large` существующий focus-driven `Drawer`.
- На iOS/iPad, JVM Desktop, native macOS и Web использовать в `Large` постоянную панель компонентов без `Drawer`.
- Использовать один resolved layout для навигационных переходов, стартового экрана и mobile/large presentation панели свойств компонента.
- Сохранять активный route при resize через общий breakpoint.
- Удалить устаревшие TV/desktop имена и второй desktop breakpoint.

**Non-Goals:**

- Изменение поведения или публичного API `sdds-core:uikit-compose` `Drawer`.
- Определение типа устройства как phone/tablet/TV по Android framework API.
- Динамическая смена режима панели при подключении мыши, клавиатуры или D-pad во время работы приложения.
- Изменение навигационных route, browser history integration, стилей sandbox или ширины существующей navigation panel.
- Миграция остальных token sandbox app-модулей на Compose Multiplatform.

## Decisions

### Layout и режим панели становятся независимыми решениями

`SandboxLayout` будет содержать только `Mobile` и `Large`. Чистый resolver получает признак достижения expanded-width breakpoint и не принимает платформу:

```text
window width ──▶ Mobile | Large
                         │
platform ────────────────┴──▶ Persistent | FocusDriven
```

`MainContent` сначала определяет `SandboxLayout` из текущей ширины `LocalWindowInfo` и общего expanded-width breakpoint. Ширина читается непосредственно как observable Compose state, чтобы resize немедленно переключал layout. Платформенный режим читается только в ветке `Large` и не может принудительно сделать узкое окно большим.

Альтернатива: сохранить `Mobile`, `Tv`, `Desktop`, но заставить все policy учитывать ширину. Отклонено, поскольку тип платформы продолжит ошибочно представляться как layout и останутся условные ветки в `ComponentScaffold`, анимациях и стартовом экране.

### Платформенный default задаётся через internal expect/actual

В common-коде вводится internal-модель `LargeNavigationMode` со значениями `Persistent` и `FocusDriven` и платформенное `expect`-значение режима. Common-код не содержит platform resolver и не принимает флаги вида `isAndroid`: каждый platform source set напрямую задаёт своё actual-значение. Actual mappings:

- `androidMain` → `FocusDriven`;
- `iosMain` → `Persistent`;
- `jvmMain`, `macosMain`, `jsMain`, `wasmJsMain` → `Persistent`.

На iPhone ширина обычно разрешит `Mobile`; при large-размере iOS, включая iPad, применяется постоянная панель. Android large использует focus-driven drawer; включённые в `Drawer` жесты сохраняют возможность touch-взаимодействия, но основной сценарий раскрытия остаётся фокусным.

Публичный `SandboxNavigationPolicy` и соответствующий параметр `SandboxApp`/`SddsServSandboxApp` удаляются. Platform launcher-ы больше не передают `Desktop`; для нового/изменённого common API обновляется KDoc. Это намеренное breaking-изменение недавно добавленного sandbox API, не затрагивающее Android framework types и route integration callback.

Альтернатива: продолжать передавать `Desktop`/`Tv` из launcher-ов. Отклонено, поскольку конфигурация допускает несовместимые комбинации и перекладывает знание стандартного поведения платформы на каждый consumer.

### `LargeLayout` инкапсулирует две реализации панели

`DesktopLayout` и `TvLayout` заменяются одним `LargeLayout(mode, menuItems, content)`:

- `Persistent` строит обычный `Row` из navigation panel и story content;
- `FocusDriven` использует `Drawer(openOnFocus = true, moveContentEnabled = true, overlayEnabled = false, peekOffset = 30.dp)` и сохраняет прежнее размещение content после видимой границы панели. Фон не передаётся во внешний `modifier` Drawer: его surface уже рисует собственный фон, а дополнительный draw-modifier располагается до внутреннего offset и при закрытии остаётся неподвижным поверх properties panel.

Постоянная панель не реализуется через зафиксированный `Drawer`. Текущий `Drawer` остаётся stateful dismissible-компонентом, публикует dismiss semantics и сдвигает, а не автоматически измеряет рядом основной контент. Обычный `Row` точнее описывает постоянную панель, не требует блокировки состояния и не добавляет drawer semantics на desktop/iPad.

Альтернатива: использовать один `Drawer` с изначально открытым состоянием и отключёнными жестами. Отклонено из-за несоответствующей accessibility-семантики, возможности закрывающих state transitions и более сложного расчёта ширины content.

### Общий navigation view получает нейтральное имя

`NavigationViewTv` переименовывается в `NavigationViewLarge`, поскольку он используется и постоянной панелью desktop/iPad. Платформенная интерактивность принадлежит контейнеру `LargeLayout`, а не списку пунктов. Неиспользуемый параметр `focusable` удаляется; кликабельные элементы сохраняют Compose focus/click semantics.

Альтернатива: оставить TV-имя как implementation detail. Отклонено, потому что оно закрепляет уже удалённую модель из трёх layout и усложняет дальнейшую поддержку.

### Все зависимые представления используют один resolved layout

`LocalSandboxLayout` предоставляет только `Mobile` или `Large`. На его основе:

- slide transitions включаются только в `Mobile`;
- стартовый route показывает список компонентов в `Mobile` и первую story в `Large`;
- Mobile story показывает явную кнопку назад, использующую тот же internal back button, что и header редактора свойств. Кнопка обращается к remembered back-dispatcher: активный вложенный property editor первым регистрирует переход к полному списку свойств, а при отсутствии вложенного handler выполняется `NavHostController.popBackStack()` к списку компонентов. Вложенный Compose `BackHandler` направляет системный back в тот же dispatcher и имеет приоритет над системным handler `NavHost` только пока открыт редактор;
- `ComponentScaffold` выбирает `MobileScaffold` или `LargeScaffold` напрямую, без повторного чтения ширины окна;
- удаляются `PersistentDesktopNavigationBreakpoint`, `isPersistentDesktopNavigation()` и `isPersistentDesktopNavigationWindow()`.

`NavHostController` остаётся remembered выше layout-ветки. Resize меняет presentation, но не создаёт новый controller и не сбрасывает active route. Persistent implementation не помещает `NavHost` в `Drawer`, что также сохраняет безопасную композицию для Kotlin/Native Apple targets.

Альтернатива: оставить независимое вычисление large-состояния в `ComponentScaffold`. Отклонено, поскольку разные части одного экрана могут разойтись на границе breakpoint или при последующих изменениях правил.

## Risks / Trade-offs

- [Удаление `SandboxNavigationPolicy` ломает source compatibility для consumers, передающих `Tv` или `Desktop`] → Обновить все repo call sites, KDoc и README; явно отметить breaking change и проверить поиском отсутствие старых символов.
- [Android tablet может использовать touch без активного D-pad focus] → Сохранить gestures у focus-driven `Drawer` и проверить как focus, так и touch-open сценарий на large Android.
- [Draw-modifier на внешнем Android Drawer может не следовать за внутренним offset панели] → Не добавлять внешний background; использовать фон Drawer surface и проверить отсутствие неподвижной области поверх properties panel в закрытом состоянии.
- [Переключение `Mobile`/`Large` может пересоздать часть composition] → Держать `NavHostController` и selected route выше layout-ветки и покрыть resolver/route-preservation focused test или smoke test.
- [Platform actual может быть пропущен для одного из KMP targets] → Добавить actual для каждого target hierarchy source set и выполнить compile/link для Android, iOS, JVM, macOS, JS и Wasm.
- [Постоянные navigation и properties panels уменьшают preview на iPad у самого expanded breakpoint] → Использовать существующую ширину панели и общий large breakpoint, затем визуально проверить минимальный iPad large-размер; не вводить скрытый второй breakpoint.
- [На desktop/Web в Mobile нет системного back gesture] → Всегда показывать focusable/clickable back button на component story независимо от таргета и скрывать его на стартовом списке.
- [Вложенный back handler может пережить property editor или story] → Регистрировать его через `DisposableEffect` только для Mobile `PropertyEditor` и удалять при смене content state или disposal story.
- [Системный back может быть перехвачен `NavHost` раньше вложенного редактора] → Размещать enabled `BackHandler` внутри Mobile property editor и направлять его в тот же disposable dispatcher; после возврата к списку свойств handler автоматически отключается.
- [Пространственный focus-search в large Android property editor может потребовать диагонального D-pad перехода от back-кнопки к вариантам] → Для choice editor явно связать направление Down back-кнопки с `FocusRequester` текущего выбранного варианта.
- [Переименование internal composable создаёт механический churn] → Ограничить изменение `integration-core:sandbox-compose` и не затрагивать публичные UIKit-компоненты.

## Migration Plan

1. Добавить `LargeNavigationMode` и actual mappings для всех targets, покрыть mapping/resolver unit tests.
2. Свести `SandboxLayout` к `Mobile`/`Large`, обновить `MainContent`, transitions, start presentation и `ComponentScaffold`.
3. Создать `LargeLayout` с `Persistent` и `FocusDriven`, переименовать общий navigation view и удалить `DesktopLayout`/`TvLayout` и desktop breakpoint helpers.
4. Удалить `SandboxNavigationPolicy` из common API и аргументы из SddsServ platform launcher-ов; обновить KDoc/README при наличии упоминаний.
5. Выполнить focused common tests и target-specific compilation, затем вручную проверить Android focus/touch, iPad persistent navigation, desktop/Web resize и сохранение route.

Rollback выполняется возвратом `SandboxNavigationPolicy`, трёх значений `SandboxLayout` и отдельных `DesktopLayout`/`TvLayout`; миграции данных или артефактов хранения нет.

## Open Questions

Нет. Для large iOS/iPad, desktop и Web выбрана постоянная панель; для large Android выбран focus-driven `Drawer`.
