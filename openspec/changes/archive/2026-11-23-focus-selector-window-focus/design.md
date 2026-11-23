## Context

`com.sdds.uikit.Button` и другие View-компоненты с `HasFocusSelector` визуализируют фокус через **три независимых механизма**, и ни один из них не учитывает фокус окна:

1. **Фон/текст** — ColorStateList и селекторы, генерируемые в `tokens/*`, матчатся строго на `android:state_focused="true"` (например `serv_color_checkable_border.xml`, десятки вхождений в `tokens/*/.../color/*.xml`).
2. **Рамка-селектор** — программный `foreground` (`internal/focusselector/SelectorDrawable.kt`, `AnimatedSelectorDrawable.kt`); в `onStateChange` проверяется `state.contains(android.R.attr.state_focused)`.
3. **Scale** — `FocusScaleAnimationHelper.animateFocusChange` вызывается **только** из `Button.onFocusChanged`; при потере window focus `onFocusChanged` не дёргается → масштаб залипает.

`state_window_focused`/`onWindowFocusChanged`/`hasWindowFocus` во всём `sdds-core` отсутствуют (проверено grep'ом).

Ключ к решению — поведение платформы (`android.view.View`, проверено по исходникам SDK android-35):

- `onWindowFocusChanged(hasWindowFocus)` безусловно вызывает `refreshDrawableState()`, даже когда view focus не менялся.
- `onCreateDrawableState()` каждый раз пересобирает массив состояний и включает в него `state_focused` **независимо** от window focus.
- `drawableStateChanged()` сам раскидывает пересобранный массив в background/foreground/`stateListAnimator` и в текст.

То есть событий навешивать не нужно — точка вмешательства одна: `onCreateDrawableState`.

Важное уточнение про формат состояния (проверено по AOSP `android.util.StateSet`): генерируемый массив содержит **только положительные id включённых состояний** (`set = new int[Integer.bitCount(i)]`, для невзведённых битов запись не кладётся). Минусы живут в другом массиве — в спецификаторе селектора (`StateListDrawable`: `state_focused="false"` → `stateSpec = -state_focused`), и матчер (`StateSet.stateSetMatches`) трактует минус в спецификаторе как «положительного id **не должно быть** в state-массиве». Следовательно, «снять фокус» — это **удалить** `+state_focused` из state-массива (отсутствие == false), а не инвертировать его в минус.

## Goals / Non-Goals

**Goals:**
- Дать потребителю opt-in возможность заставлять фокусные визуализации гаснуть, когда окно теряет фокус (открылась чужая overlay/fullscreen активити), и возвращать их при возврате фокуса окна.
- Реализовать это в **одной общей точке** (drawable-state вью), которую уже читают все три механизма, — без правок токенов и Theme Builder.
- Не изменить поведение ни одного текущего приложения (default `false`).

**Non-Goals:**
- Токены (`tokens/*`) и Theme Builder — не трогаем: механизм работает ниже, на уровне state-массива.
- Compose (`sdds-core/uikit-compose`) — не трогаем; проблема специфична для View-подхода.
- EditText-семейство (`DecoratedFieldBox`, `MaskedEditText`, TextField) — в v1 под флаг **не** заводим: у них window focus влияет на курсор/подсветку ввода, нужна отдельная проработка.
- Автоматическое глобальное включение — нет, только opt-in.

## Decisions

### 1. Opt-in атрибут `sd_fsWindowFocusResponsive`, default `false`
Поведение по умолчанию остаётся прежним. Включение — строкой в теме (`<item name="sd_fsWindowFocusResponsive">true</item>`) или точечно (`app:sd_fsWindowFocusResponsive="true"`). Это исключает breaking-изменение внешнего вида и даёт аварийный откат.
*Альтернатива*: включить глобально. Отклонено — меняет вид всех текущих потребителей без их согласия.

### 2. Операция — удалить `+state_focused`, а не инвертировать
State-массив вью positive-only. Значимый сигнал «не в фокусе» — **отсутствие** `+state_focused`. Инверсия в `-state_focused` была бы инертна: матчер ищет в state-массиве только положительные id (для `-X` в спецификаторе проверяет отсутствие `+X`), поэтому брошенный минус на результат не влияет, а `contains(state_focused)` в `SelectorDrawable` продолжал бы видеть положительную запись, если её не удалить.
```kotlin
// internal/focusselector/WindowFocusState.kt
internal fun IntArray.withoutFocusedIfWindowUnfocused(view: View): IntArray {
    if (view.isInEditMode || view.hasWindowFocus()) return this
    if (indexOf(android.R.attr.state_focused) < 0) return this
    return filter { it != 0 && it != android.R.attr.state_focused }.toIntArray()
}
```
Возвращаем **новый** массив, чтобы не мутировать возможный общий кэш `StateSet`.

*Альтернатива, отклонена*: править все генерируемые селекторы в `tokens/*`, добавляя `state_window_focused="true"`. Громоздко, затрагивает Theme Builder и регенерацию, дублирует логику в каждом токене.

### 3. Единый хелпер + по override на компонент
Общего базового класса у компонентов нет (`Button` → `AppCompatButton`, layouts → свои `ViewGroup` и т.д.), `onCreateDrawableState` — метод `View`, делегатом не накрывается. Поэтому: общий `internal`-хелпер (п.2) и в каждом компоненте override, возвращающий очищенный массив при включённом флаге:
```kotlin
override fun onCreateDrawableState(extraSpace: Int): IntArray {
    val drawableState = super.onCreateDrawableState(extraSpace + 4)
    // ... существующие mergeDrawableStates ...
    return if (settings.windowFocusResponsive)
        drawableState.withoutFocusedIfWindowUnfocused(this)
    else drawableState
}
```
Для `Button`/`Chip`/др., где `onCreateDrawableState` уже переопределён — одна строка перед `return`. Где не переопределён — добавляется override.

### 4. Scale — отдельный override `onWindowFocusChanged`
Scale не привязан к state-массиву, поэтому на него удаление `+state_focused` не влияет. Добавляем:
```kotlin
override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
    super.onWindowFocusChanged(hasWindowFocus)
    if (settings.windowFocusResponsive) updateFocusSelector(this, isFocused && hasWindowFocus)
}
```
При возврате фокуса окна `isFocused && hasWindowFocus` восстанавливает и scale, и (заодно) инвалидацию бордера.

### 5. Бордеры не трогаем
`SelectorDrawable.onStateChange`/`AnimatedSelectorDrawable` уже проверяют `contains(state_focused)` → после удаления записи автоматически гаснут; `AnimatedSelectorDrawable.stop()` ещё и снимает бесконечный `ValueAnimator` с работающего в фоне окна (бонус к батарее).

### 6. Защита превью и скриншотов
Для неattachенного вью `hasWindowFocus() == false` → без guard'а фокусные состояния перестали бы отрисовываться в Paparazzi/редакторе. Guard `view.isInEditMode` покрывает layout-превью; скриншот-доки бегут с флагом по умолчанию `false` и подавления не видят.

### 7. `FocusSelectorSettings` — additive-поле
Поле добавляется в конец конструктора data class со значением по умолчанию `false`, читаемым в `fromAttrs`. Существующие вызовы конструктора с именованными аргументами не ломаются; позиционные — проверим при `apiDump`.

## Risks / Trade-offs

- **[Риск] `binary-compatibility-validator`** упадёт на новом публичном поле `FocusSelectorSettings`. → Смягчение: `./gradlew :sdds-core:uikit:apiDump` и ревью `api/uikit.api` (зафиксировано в tasks).
- **[Риск] Превью/скриншоты подавляют фокус** из-за `hasWindowFocus()==false` у detach-вью. → Смягчение: флаг по умолчанию `false` + `isInEditMode`-guard; при форсированном фокусе в golden-тестах — включать поведение точечно, не глобально.
- **[Риск] Прочие потребители `getDrawableState()`, которые сами матчат `state_focused`** (кастомные stateListAnimator/свои drawable в приложениях) тоже начнут видеть «не сфокусировано». → Это и естьdesired-семантика флага; документируем в KDoc атрибута.
- **[Trade-off] Правки дублируются по ~13 компонентам** (нет общего base). → Осознанно: механический, локальный и легко ревьюится паттерн; единый хелдер концентрирует всю неочевидную логику.
- **[Trade-off] В v1 не покрываем EditText-семейство.** → Окно с полем ввода всё ещё может показывать «липкий» фокус; вынесено осознанно, т.к. у ввода своя семантика window focus.

## Open Questions

- Финальное имя атрибута (`sd_fsWindowFocusResponsive`?) — сверить с немингом команды.
- Нужен ли в последующих версиях аналог для Compose (`uikit-compose`) и для EditText-семейства — пока вне скоупа.
- Значение по умолчанию: оставляем `false`; пересмотреть с дизайном, если решим, что «ТВ-корректное» поведение стоит делать дефолтным для новых минор-версий.
