## 1. Публичный API и ресурсы (`sdds-core:uikit`)

- [x] 1.1 Добавить `<attr name="sd_fsWindowFocusResponsive" format="boolean"/>` в `res/values/base_attrs.xml` и включить его в `<declare-styleable name="SdFocusSelector">`
- [x] 1.2 Per-component styleable намеренно НЕ дополнены: в них перечислены только визуальные `sd_fs*` параметры, а тумблеры (`sd_fsEnabled`, `sd_fsScaleEnabled`, `sd_fsDuplicateParentState`) там отсутствуют — новый тумблер следует той же конвенции; чтение идёт через `SdFocusSelector`, XML-атрибут работает во всех тегах
- [x] 1.3 Добавить поле `windowFocusResponsive: Boolean = false` в конец конструктора data class `FocusSelectorSettings`
- [x] 1.4 В `FocusSelectorSettings.fromAttrs(...)` прочитать `R.styleable.SdFocusSelector_sd_fsWindowFocusResponsive` со значением по умолчанию `false`
- [x] 1.5 Добавить KDoc на новый атрибут/поле (XML-комментарий в `base_attrs.xml` + `@property` в `FocusSelectorSettings`): эффект подавления `state_focused` при `!hasWindowFocus()`, влияние на собственные матчеры потребителя, исключение EditText

## 2. Ядро механизма (`internal/focusselector`)

- [x] 2.1 Создать `internal`-хелпер `IntArray.withoutFocusedIfWindowUnfocused(view)` (`WindowFocusState.kt`) — `isInEditMode`/`hasWindowFocus` guard, удаление `+state_focused` (и padding-нулей) с возвратом НОВОГО массива (кэш `StateSet` не мутируется)
- [x] 2.2 `SelectorDrawable.onStateChange`/`AnimatedSelectorDrawable` не менялись — `contains(state_focused)` корректно отрабатывает на фильтрованном массиве; анимированный бордер останавливает `ValueAnimator` через существующий `stop()`

## 3. Пилот — `Button`

- [x] 3.1 В `Button.onCreateDrawableState` перед `return` возвращать `drawableState.withoutFocusedIfWindowUnfocused(this)` при `isAttachedToWindow && settings.windowFocusResponsive` (guard `isAttachedToWindow` обязателен: `View`-конструктор при `android:background` в стиле виртуально вызывает `onCreateDrawableState` до создания делегата — прямой доступ к `settings` вызвал бы NPE)
- [x] 3.2 Добавить `Button.onWindowFocusChanged` → при включённом флаге и `isFocused` вызывать `updateFocusSelector(this, hasWindowFocus)` (scale + инвалидация бордера)

## 4. Остальные компоненты с `HasFocusSelector`

- [x] 4.1 Применить тот же паттерн (`onCreateDrawableState` + `onWindowFocusChanged`) к `Chip`, `TextView`, `ImageView`, `View`
- [x] 4.2 Применить к контейнерам `FrameLayout`, `LinearLayout`, `ConstraintLayout`, `FlowLayout`, `CellLayout`
- [x] 4.3 Применить к составным `AccordionItemView`, `CardContent` (правки во внутреннем `Wrapper`, который держит фокус и foreground)
- [x] 4.4 НЕ применять к EditText-семейству (`DecoratedFieldBox`, `MaskedEditText`, `TextField*`) — решение зафиксировано в KDoc `windowFocusResponsive`; зафиксировано здесь
- [x] 4.5 Сверено: везде флаг читается из `settings` делегата, default `false` нигде не инвертирован

## 5. Публичный API — совместимость

- [x] 5.1 `apiDump` выполнен; baseline `api/uikit.api` НЕ обновлялся: закоммиченный baseline устарел ещё до изменений (в нём только `BuildConfig`/`ViewState`, см. коммит 271fd1199) — полная перегенерация дала бы ~4150 строк нерелевантного дифа. Решение по baseline — отдельный chore вне этого change
- [x] 5.2 `apiCheck` — проверено, что падает и на чистом HEAD (тот же устаревший baseline); к данному change отношения не имеет
- [x] 5.3 `generateUikitApiMeta` прогнан успешно: новый атрибут в `uikit-api-meta.json` отсутствует — корректно, мета собирает только `sdds:api_*`-аннотированные component-styleable, `SdFocusSelector` в них не входит

## 6. Тесты

- [ ] 6.1 JVM-тест-обвязки в `uikit` нет и её добавление не согласовано — Robolectric-тест не заводился (отказ по условию задачи)
- [x] 6.2 Покрытие поведением через сборку + визуальную проверку (п.7); покрытие явно отметить в описании PR

## 7. Визуальная проверка и валидация (`sdds-core:uikit` + песочница)

- [x] 7.1 Проверено вручную временным стендом в `tokens/plasma-stards-view/app` (две кнопки — контрольная и с `app:sd_fsWindowFocusResponsive="true"`, каждая открывает translucent overlay-активити): у кнопки с флагом фон/рамка/scale гаснут под overlay и возвращаются по Back. Стенд удалён, в дерево не попал
- [x] 7.2 Проверено тем же стендом: кнопка с флагом по умолчанию (`false`) под overlay сохраняет фокусную подсветку — поведение идентично историческому, скриншоты документации и превью не затрагиваются
- [x] 7.3 `./gradlew :sdds-core:uikit:detekt` — пройдено
- [x] 7.4 `./gradlew :sdds-core:uikit:spotlessCheck` — пройдено (форматирование не потребовалось)
- [x] 7.5 `:sdds-core:uikit:testDebugUnitTest` — не может выполниться в этой среде (нет сети для `androidx.test:monitor`), тестов нет; `:sdds-core:uikit:assembleDebug` — BUILD SUCCESSFUL
- [x] 7.6 `./gradlew testAll` прогнан локально — все зелёное (регрессов в затронутых brand-модулях нет)

## 8. Документация

- [ ] 8.1 Пользовательской документации по View-фокус-селектору в репозитории не найдено (доки генерируются из api-meta аннотаций, куда атрибуты `SdFocusSelector` не входят). Описание атрибута размещено в XML-комментарии (видно в IDE) и KDoc `FocusSelectorSettings`. Завести страницу в consumer-портале — отдельная задача вне репозитория (или через `sdds:api_*`-аннотации в follow-up)
