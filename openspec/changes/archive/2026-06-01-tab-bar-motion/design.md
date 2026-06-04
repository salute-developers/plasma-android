## Context

В `sdds-core:uikit-compose` компоненты `NavigationDrawer` и `NavigationDrawerItem` уже используют единый motion-подход: визуальные значения в стилях описаны как `StatefulValue<T>`, а runtime-анимация задается через `Motion<...MotionStyle>`. `TabBar` и `TabBarItem` пока используют часть статических значений (`Dp`, `Shape`, `ShadowAppearance`, `TextStyle`) и локальный `InteractionSource`, что ограничивает анимацию переходов между состояниями и расходится с новым API-паттерном.

Изменение остается внутри included build `sdds-core`, модуля `uikit-compose`. Публичные API и KDoc необходимо обновить, потому что меняются style-контракты и добавляются overload-ы компонентов.

## Goals / Non-Goals

**Goals:**
- Привести `TabBarStyle` и `TabBarItemStyle` к StatefulValue-контрактам по аналогии с `NavigationDrawerStyle` и `NavigationDrawerItemStyle`.
- Добавить `TabBarMotionStyle`, `TabBarItemMotionStyle` и функции `rememberTabBarMotion` / `rememberTabBarItemMotion`.
- Добавить новые overload-ы `TabBar` и `TabBarItem`, которые принимают `Motion` и используются старыми overload-ами как implementation path.
- Сохранить source compatibility для существующих вызовов, где возможно, через старые style-свойства, convenience overload-ы builder-ов и делегирование старых функций.
- Deprecate старые свойства `TabBarStyle` и `TabBarItemStyle` для поддержки обратной совместимости, но не удалять их в рамках этого изменения.
- Добавить в `TabBarItemStyle` stateful-смещения `extraOffsetX` и `extraOffsetY` для управления позицией слота `extra`.

**Non-Goals:**
- Не менять архитектуру `Motion`, `StatefulValue` и interaction state source.
- Не добавлять новые состояния TabBar сверх уже используемых selected/interaction-состояний, если они не требуются реализацией.
- Не менять View/XML реализацию TabBar.
- Не переписывать Theme Builder полностью; адаптация генерации возможна только в объеме, нужном для компиляции generated Compose styles.
- Не удалять старые свойства `TabBarStyle` и `TabBarItemStyle`

## Decisions

1. **StatefulValue становится основным контрактом style API без удаления legacy-свойств.**  
   `TabBarStyle` должен получить stateful-эквиваленты для формы, тени и размеров, а `TabBarItemStyle` должен получить stateful-эквиваленты для формы, label text style, цветов и размеров. Старые свойства остаются в публичных interfaces для обратной совместимости, помечаются deprecated и возвращают значение, эквивалентное прежнему статическому контракту. Новая реализация компонента должна использовать stateful-свойства, legacy-свойства нужны только для существующих клиентов. Для удобства builder-ы сохраняют overload-ы со статическими `Shape`, `Dp`, `TextStyle`, `Color`, `Brush` и конвертируют их через `asStatefulValue()` / `asStatefulBrush()`. Альтернатива с удалением старых свойств отклоняется: она ломает downstream код, который читает style properties напрямую.

2. **Цветовые свойства TabBarItem приводятся к brush-based контракту там, где это нужно для motion.**  
   Для совместимости с motion-утилитами и паттерном `NavigationDrawerItem`, color-like свойства должны резолвиться как stateful visual values. Если существующий компонент ожидает `Color`, реализация может использовать brush producer или локальный tint brush; статические `Color` overload-ы builder-а должны остаться. Альтернатива оставить `StatefulValue<Color>` ограничивает поддержку brush-токенов и отличается от новых компонентов.

3. **Новые overload-ы являются основными, старые делегируют.**  
   Для `TabBar` добавляется overload с обязательным `motion: Motion<TabBarMotionStyle>`. Старый overload создает default motion через `rememberTabBarMotion(...)` и вызывает новый. Для `TabBarItem` основной overload должен иметь один обязательный параметр `icon`, слот `labelContent` для label, не раскрывать `interactionSource`, а последним необязательным параметром принимать `motion: Motion<TabBarItemMotionStyle>`. Отдельного `selectedIcon` в новом overload-е не нужно: если caller-у нужна другая иконка для selected-состояния, он подменяет содержимое внутри `icon` слота через `isSelected` или собственное состояние. Старые overload-ы с `defaultIcon`/`selectedIcon` и drawable resources должны адаптировать параметры и делегировать в новый API. Это снижает дублирование логики и оставляет один путь рендеринга.

4. **MotionStyle описывает только анимируемые визуальные свойства компонента.**  
   `TabBarMotionStyle` должен покрывать фон, divider, shape/shadow/dimensions, которые реально резолвятся через motion в контейнере. `TabBarItemMotionStyle` должен покрывать background, icon, label, label style, shape и dimensions. Defaults должны использовать `noMotion()` или простые transition defaults, как в существующих motion style классах. Альтернатива захардкодить анимации в компоненте отклоняется: это нарушает контракт `MotionStyle`.

5. **Nested styles остаются частью style contract.**  
   `TabBarStyle.tabBarItemStyle` продолжает предоставляться через `LocalTabBarItemStyle`. `TabBarItemStyle` продолжает предоставлять `CounterStyle`, `BadgeStyle` и `IndicatorStyle` для extra-контента. При появлении motion-стилей вложенных компонентов их можно прокидывать через composition locals только если это уже поддерживается соответствующими компонентами.

6. **Смещение extra-слота становится частью `TabBarItemDimensions`.**  
   В `TabBarItemDimensions` нужно добавить `extraOffsetX: StatefulValue<Dp>` и `extraOffsetY: StatefulValue<Dp>`, чтобы `TabBarItem` мог управлять смещением `extra` через стиль и motion context вместо жестко заданного `size.width / 2` и `-size.height / 2`. Builder должен иметь overload-ы для `StatefulValue<Dp>` и `Dp`, а значения по умолчанию должны сохранять текущее визуальное поведение. Альтернатива оставить смещение захардкоженным не подходит, потому что разные дизайн-системы не смогут управлять размещением badge/counter/indicator в extra-слоте.

## Risks / Trade-offs

- **Риск: generated token styles перестанут компилироваться из-за смены типов.** → Сохранить builder overload-ы для статических значений и проверить известные token modules, где создаются `TabBarStyle` и `TabBarItemStyle`.
- **Риск: ambiguity overload-ов `TabBarItem` из-за обязательного `icon` и старых `defaultIcon`/`selectedIcon`.** → Расположить параметры нового overload-а так, чтобы один обязательный `icon` явно отличал новую сигнатуру; старые overload-ы оставить с прежними именами параметров.
- **Риск: brush-based icon/label colors могут потребовать адаптации tint API.** → Использовать уже существующие `LocalTintBrushProducer`/brush helpers там, где это соответствует другим компонентам, либо безопасно получать `Color` только для legacy path.
- **Риск: визуальная регрессия без явного selectedIcon.** → В новом `icon` overload-е selected-состояние должно влиять на стиль и tint, а подмена иконки остается ответственностью caller-а внутри `icon`; старые overload-ы должны сохранять выбор `selectedIcon`/`defaultIcon` при делегировании.
- **Риск: публичный API меняет KDoc и downstream ожидания.** → Обновить KDoc у новых/измененных публичных интерфейсов и функций, валидацию выполнить focused Gradle-командами.
- **Риск: старые style-свойства и новые stateful-свойства могут разойтись.** → В default implementation хранить один источник значения и строить legacy-свойства из соответствующих stateful defaults, а component rendering вести только через новые stateful-свойства.
- **Риск: изменение default extra offset приведет к визуальной регрессии.** → Задать defaults `extraOffsetX` и `extraOffsetY` так, чтобы без кастомизации позиция `extra` совпадала с текущим расчетом.

## Migration Plan

1. Обновить style interfaces/builders и default implementations в `TabBarStyle.kt` и `TabBarItemStyle.kt`, сохранив legacy-свойства как deprecated.
2. Добавить motion style и remember-функции в новый пакет `motion/components/tabbar`.
3. Перевести `TabBar.kt` и `TabBarItem.kt` на резолвинг через `Motion`.
4. Адаптировать старые overload-ы через делегирование и проверить существующие call sites.
5. При необходимости обновить generated/token style call sites или generator templates, чтобы они использовали совместимые builder overload-ы.
6. Проверить `./gradlew :sdds-core:uikit-compose:compileDebugKotlin` или ближайшую доступную compile-задачу модуля, затем сфокусированные проверки для затронутых modules.

Rollback: откатить change в `sdds-core:uikit-compose`; public API additions не требуют миграции данных или runtime state.

## Open Questions

- Нужно ли сразу адаптировать Theme Builder генерацию TabBar motion styles, если текущие token modules создают только static style values?
