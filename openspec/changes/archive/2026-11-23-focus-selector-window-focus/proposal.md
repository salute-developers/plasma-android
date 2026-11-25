## Why

Пользователь сообщает: при открытии сторонней (overlay/fullscreen) активити поверх экрана, где находится `com.sdds.uikit.Button`, кнопка продолжает отображать фокусное состояние — белый «фокусный» фон, рамку-селектор и увеличение (scale) — одновременно с тем, как фокус уже перехвачен чужой активити. На экране визуально возникает «два фокуса сразу» (скриншот: кнопка «В настройки» подсвечена при открытом окне «Настройки»).

Это штатное поведение платформы, а не баг приложения: **фокус вью и фокус окна — разные сущности**. Когда поверх окна открывается другое окно, забирающее ввод, фреймворк снимает *window focus*, но намеренно оставляет *view focus* неизменным (`View.onWindowFocusChanged`: «your own window will lose focus but the view focus will remain unchanged»). Из-за этого в drawable-state вью по-прежнему присутствует `+state_focused`, и все визуализации фокуса продолжают гореть.

Предлагаемое пользователем решение «добавить в селектор `android:state_window_focused`» по идее верно, но не реализуемо точечно в токенах: фокус в uikit завязан на `state_focused` в трёх независимых механизмах (ColorStateList фона/текста из токенов, программный `foreground`-бордер `SelectorDrawable`, scale-анимация), ни один из которых window focus не учитывает. Править нужно в дизайн-системе и в одной общей точке, а не в генерируемых токенах.

## What Changes

- Вводится **opt-in** режим селектора фокуса «реактивность на фокус окна»: когда он включён, компонент перестаёт сообщать `state_focused`, пока его окно не в фокусе, и вновь начинает сообщать при возврате фокуса окна. За счёт этого все визуализации фокуса гаснут/возвращаются синхронно и без правок токенов.
- Механизм основан на том факте, что drawable-state вью содержит **только положительные id** (присутствие записи = состояние включено, отсутствие = выключено). Достаточно **удалить `+state_focused`** из результата `onCreateDrawableState` при `!hasWindowFocus()` — и селекторы `state_focused="true"` перестанут матчиться, а `state_focused="false"` — начнут.
- Добавляется публичный атрибут `sd_fsWindowFocusResponsive` (по умолчанию `false`), читаемый в `FocusSelectorSettings`.
- Для scale-анимации (она не state-driven) добавляется переопределение `onWindowFocusChanged`, которое сбрасывает/восстанавливает масштаб при потере/возврате фокуса окна.
- `isInEditMode`-guard и проверка `hasWindowFocus()` защищают превью и скриншот-доки от подавления фокусных состояний.
- Скоуп — **только View-система `sdds-core/uikit`**. Токены (`tokens/*`), Theme Builder и Compose (`uikit-compose`) **не затрагиваются**.
- **Нет breaking changes на уровне поведения и исходников**: поведение по умолчанию (`false`) идентично текущему; включается оптом через тему приложения или точечно атрибутом; старый код компилируется без изменений. Исключение — **бинарная совместимость** `FocusSelectorSettings` (см. Impact).

## Capabilities

### New Capabilities
- `window-focus-responsive-selector`: контракт opt-in поведения селектора фокуса компонентов View-системы относительно фокуса окна — способ включения (публичный атрибут), семантика подавления `state_focused` при `!hasWindowFocus()`, согласованность всех визуализаций фокуса (фон/текст/бордер/scale/stateListAnimator), поведение по умолчанию и защита превью.

### Modified Capabilities
*(нет — в `openspec/specs/` нет ранее задокументированной capability, описывающей взаимодействие селектора фокуса с фокусом окна)*

## Impact

- **Публичный API (`sdds-core/uikit`)**:
  - `FocusSelectorSettings` — новое поле `windowFocusResponsive` в конструкторе data class. Это публичный тип → детектируется `binary-compatibility-validator`, нужен `apiDump` и проверка `api/uikit.api`. **Source-совместимо; бинарно несовместимо** для внешних потребителей, напрямую вызывающих конструктор/`copy` `FocusSelectorSettings` (`NoSuchMethodError` без пересборки: у data class меняются дескрипторы конструктора, `copy`/`copy$default`, добавляется `component6`; secondary-конструктор проблему `copy$default` не чинит) — требуется пересборка артефактов, использующих эти API; для 0.x принято.
  - Новый публичный ресурс-атрибут `sd_fsWindowFocusResponsive` в `base_attrs.xml`, добавленный в styleable `SdFocusSelector` (+ в styleable отдельных компонентов для покрытия API-поверхности в IDE-подсказках).
- **Ресурсы**: `sdds-core/uikit/src/main/res/values/base_attrs.xml`; при необходимости `button_attrs.xml` и др. per-component styleable.
- **Компоненты (View)**: все, кто реализует `HasFocusSelector`, — `Button`, `Chip`, `TextView`, `ImageView`, `View`, `FrameLayout`, `LinearLayout`, `ConstraintLayout`, `FlowLayout`, `CellLayout`, `AccordionItemView`, `CardContent`, `DecoratedFieldBox`. Каждый получает override `onCreateDrawableState` (удаление `+state_focused`) и `onWindowFocusChanged` (scale). Общий базовый класс отсутствует → правка механическая, но по компоненту.
- **Внутренний код**: новый `internal`-хелпер удаления `state_focused`; `SelectorDrawable`/`AnimatedSelectorDrawable` **не меняются** (уже проверяют `contains(state_focused)`).
- **Кодогенерация/метрики**: плагин `convention.uikit-api-meta` и themebuilder api-info могут пересобирать мету по новому атрибуту — проверить вывод.
- **Токены / документация / Gradle-конвенции**: не затрагиваются.
- **Тесты**: в `uikit` нет настроенного JVM-тест-саурсета (только `androidTest`/Espresso). Пилотная проверка — через сборку, `apiDump`, detekt/spotless и визуальный контроль в песочнице; при необходимости — точечный Robolectric-тест при согласовании добавления тест-обвязки.
