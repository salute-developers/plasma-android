## 1. integration-core: platform и layout model

- [x] 1.1 Свести internal `SandboxLayout` к значениям `Mobile` и `Large` и заменить policy-based resolver чистым выбором по достижению expanded-width breakpoint.
- [x] 1.2 Добавить internal `LargeNavigationMode` (`Persistent`, `FocusDriven`) и `expect`/`actual` mapping: Android — `FocusDriven`, iOS/JVM/macOS/JS/Wasm — `Persistent`.
- [x] 1.3 Обновить common unit tests: оба результата size resolver и включение slide transitions только для `Mobile`; удалить проверки desktop breakpoint и `Mobile`/`Tv`/`Desktop` policy.
- [x] 1.4 Удалить из common-кода `resolveLargeNavigationMode(isAndroid)` и задавать `platformLargeNavigationMode` напрямую в каждом platform actual без platform-флагов в common API.
  Android actual напрямую задаёт `FocusDriven`, iOS/JVM/macOS/JS/Wasm actual — `Persistent`; expect/actual mapping проверен успешным `:integration-core:sandbox-compose:allTests` для всех target-ов.

## 2. integration-core: Large navigation UI

- [x] 2.1 Заменить `DesktopLayout` и `TvLayout` единым `LargeLayout`, использующим `Row` для `Persistent` и существующий focus-driven `Drawer` для `FocusDriven`.
- [x] 2.2 Сохранить в Android large drawer focus-open, жесты, отсутствие overlay и узкий peek; не добавлять неподвижный внешний background, перекрывающий properties panel после внутреннего offset Drawer.
- [x] 2.3 Переименовать `NavigationViewTv` в `NavigationViewLarge`, удалить неиспользуемый параметр `focusable` и обновить все ссылки без изменения стилей и selected-route поведения.
- [x] 2.4 Удалить `PersistentDesktopNavigationBreakpoint`, desktop menu-button/overlay реализацию и helpers `isPersistentDesktopNavigation*`; проверить поиском отсутствие legacy `DesktopLayout`/`TvLayout`/`NavigationViewTv` символов.
- [x] 2.5 В Large Android choice property editor задать явный D-pad focus-переход Down с back-кнопки на текущий выбранный вариант, чтобы переход выполнялся одним нажатием без дополнительного Left.
  Реализован явный `focusProperties.down` с back-кнопки на `FocusRequester` текущего выбранного варианта; Android unit и JVM tests проходят, runtime-поведение на TV подтверждено пользователем.

## 3. integration-core: единое адаптивное поведение

- [x] 3.1 Обновить `MainContent`: выбирать `MobileLayout`/`LargeLayout` только по размеру, передавать platform mode только в `LargeLayout` и сохранять один remembered `NavHostController` при resize.
- [x] 3.2 Привязать показ первой story на start destination и navigation transitions к `Large`/`Mobile`, не к платформенному режиму панели.
- [x] 3.3 Упростить `ComponentScaffold` до прямого выбора `MobileScaffold`/`LargeScaffold` из `LocalSandboxLayout` без повторного чтения ширины и desktop-specific breakpoint.
- [x] 3.4 Добавить focused test или воспроизводимый smoke test перехода через expanded breakpoint с сохранением active route и согласованным переключением navigation/property presentation.
- [x] 3.5 Добавить в Mobile component story явную focusable/clickable кнопку назад, переиспользовать кнопку из large property editor, приоритизировать возврат `PropertyEditor → PropertiesList → ComponentList` для явной и системной кнопок через disposable nested handler и покрыть условия common unit-тестами.
  Реализованы общий back-dispatcher, disposable handler редактора свойств, вложенный Compose `BackHandler` для системного back и common unit-тесты порядка обработки. Runtime-проверка подтвердила корректный возврат `PropertyEditor → PropertiesList → ComponentList` как по явной, так и по системной кнопке назад.

## 4. integration-core и tokens: public API и launcher-ы

- [x] 4.1 Удалить `SandboxNavigationPolicy` и его параметр из `SandboxApp`, сохранив `navigationIntegration`; обновить KDoc common root с описанием size- и platform-driven поведения.
- [x] 4.2 Удалить параметр policy из `SddsServSandboxApp` и вызовы `SandboxNavigationPolicy.Desktop`/соответствующие imports из JVM, native macOS, JS и Wasm launcher-ов.
- [x] 4.3 Обновить `tokens/sdds.serv.compose/app/README.md`: описать общий `Mobile` для узких окон, постоянную large-панель на iPad/desktop/Web и focus-driven large drawer на Android.
- [x] 4.4 Проверить по репозиторию отсутствие ссылок на удалённый `SandboxNavigationPolicy` и при необходимости мигрировать остальные явные consumers common sandbox API.

## 5. Проверка всех target-ов

- [x] 5.1 Из корня выполнить focused tests `./gradlew :integration-core:sandbox-compose:allTests` и устранить ошибки resolver/layout tests.
- [x] 5.2 Из корня собрать Android и JVM pilot variants, iOS framework и native macOS executable; отдельно зафиксировать успешно проверенные Kotlin targets.
- [x] 5.3 Из корня выполнить `./gradlew :tokens:sdds.serv.compose:app:wasmJsBrowserDistribution :tokens:sdds.serv.compose:app:jsBrowserDistribution` и проверить обе Web-сборки.
- [x] 5.4 Вручную проверить: Android large focus/touch drawer; iPhone/узкий iOS mobile; iPad large persistent panel без drawer; JVM/macOS/Web mobile при узком окне и persistent panel при expanded; сохранение active route при resize.
  Web/Wasm проверен при resize `1440 → 600 → 1440`: presentation переключается `Large → Mobile → Large`, active route `#Avatar` сохраняется. Android/iOS/iPad и desktop runtime требуют доступного устройства, симулятора или GUI-сессии.
  Android TV проверен: узкий peek остаётся, properties panel полностью отображается сразу после него, D-pad Drawer корректно выглядит в открытом и закрытом состояниях. Причиной перекрытия был внешний background Drawer: внутренний content уезжал на offset, а draw-слой шириной `menuWidth` оставался на месте. Лишний background удалён.
  Native macOS startup smoke test пройден на пересобранном `.app`: приложение оставалось запущенным более 10 секунд и было остановлено вручную. Крэш возникал при стартовом переходе `Mobile → Large`: один remembered `NavController` повторно подключался к новому внутреннему `ViewModelStoreOwner`. Владелец состояния поднят выше layout-веток и сохраняется между ними. Полная ручная проверка resize/navigation подтверждена пользователем.
- [x] 5.5 Выполнить `./gradlew spotlessApplyAll detektAll` из корня и проверить, что изменения не затронули tokens, Theme Builder output или generated integration-код.
