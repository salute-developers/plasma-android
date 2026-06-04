## 1. sdds-core:uikit-compose styles

- [x] 1.1 Перевести `TabBarStyle` на `StatefulValue` для shape, shadow и dimensions, сохранив старые публичные свойства как deprecated для обратной совместимости.
- [x] 1.2 Перевести `TabBarColors` на stateful brush-compatible контракт для color-like значений и сохранить старые публичные свойства и совместимые overload-ы для `Color`, `Brush` и существующих interactive inputs.
- [x] 1.3 Перевести `TabBarItemStyle` на `StatefulValue` для shape, label style, colors и dimensions, сохранив старые публичные свойства как deprecated и nested styles для `Counter`, `Badge` и `Indicator`.
- [x] 1.4 Добавить в `TabBarItemDimensions` поля `extraOffsetX: StatefulValue<Dp>` и `extraOffsetY: StatefulValue<Dp>` с builder overload-ами для `StatefulValue<Dp>` и `Dp`.
- [x] 1.5 Задать defaults для `extraOffsetX` и `extraOffsetY`, которые сохраняют текущее размещение extra-слота.
- [x] 1.6 Обновить KDoc публичных style interfaces/builders в `TabBarStyle.kt` и `TabBarItemStyle.kt`.

## 2. sdds-core:uikit-compose motion styles

- [x] 2.1 Создать `TabBarMotionStyle`, builder, composition local и default no-motion значения в пакете `motion/components/tabbar`.
- [x] 2.2 Создать `TabBarItemMotionStyle`, builder, composition local и default no-motion значения в пакете `motion/components/tabbar`.
- [x] 2.3 Добавить `rememberTabBarMotion` и `rememberTabBarItemMotion` с использованием существующего `Motion` / `MotionContext` подхода.
- [x] 2.4 Покрыть motion properties всеми visual values, которые `TabBar` и `TabBarItem` резолвят через motion, включая `extraOffsetX` и `extraOffsetY`.

## 3. sdds-core:uikit-compose components

- [x] 3.1 Добавить основной overload `TabBar` с обязательным `motion: Motion<TabBarMotionStyle>` и перевести рендеринг контейнера на `get*AsState` / `MotionContext`.
- [x] 3.2 Обновить старый overload `TabBar`, чтобы он создавал default motion и делегировал в motion-based overload.
- [x] 3.3 Добавить основной overload `TabBarItem` с единственным обязательным параметром `icon`, опциональным слотом `labelContent`, без публичного `interactionSource`, без отдельного `selectedIcon` и с последним необязательным `motion: Motion<TabBarItemMotionStyle>`.
- [x] 3.4 Перевести рендеринг `TabBarItem` на stateful style values, selected state и motion-based value resolution.
- [x] 3.5 Обновить старые overload-ы `TabBarItem` с composable icons и drawable resource icons, чтобы они делегировали в новый overload, подменяли selected/default icon внутри `icon` слота и сохраняли прежнее поведение.
- [x] 3.6 Перевести позиционирование extra-слота в `TabBarItem` на `extraOffsetX` и `extraOffsetY` из `TabBarItemStyle.dimensions`.
- [x] 3.7 Обновить KDoc новых и измененных overload-ов `TabBar` и `TabBarItem`.

## 4. Совместимость и generated call sites

- [x] 4.1 Проверить существующие usages `TabBarStyle.builder()` и `TabBarItemStyle.builder()` в `tokens` и `integration-core`.
- [x] 4.2 Проверить прямые чтения старых style properties и убедиться, что они остаются source-compatible.
- [x] 4.3 Адаптировать call sites или Theme Builder templates только там, где смена style-контрактов ломает компиляцию.
- [x] 4.4 Убедиться, что уже измененные пользователем файлы в рабочем дереве не перезаписываются без необходимости.

## 5. Валидация

- [x] 5.1 Запустить сфокусированную compile-проверку для `sdds-core:uikit-compose` из корня репозитория.
- [x] 5.2 Запустить форматирование или lint/check задачи, применимые к затронутым Kotlin-файлам.
- [x] 5.3 Проверить, что existing calls `TabBar` и `TabBarItem` продолжают компилироваться и используют новый implementation path.
