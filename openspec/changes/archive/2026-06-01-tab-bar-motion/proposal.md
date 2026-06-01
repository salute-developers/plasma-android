## Why

`TabBar` и `TabBarItem` в `sdds-core:uikit-compose` используют статические значения стилей для формы, размеров, теней и части цветов, из-за чего компонент нельзя согласованно анимировать через механизм `StatefulValue` и `Motion`, уже примененный в `NavigationDrawer`. Нужно привести TabBar к тому же API-подходу, чтобы новые состояния и анимации описывались единообразно в дизайн-системе.

## What Changes

- Перевести `TabBarStyle` на `StatefulValue` для формы, тени и размеров контейнера по аналогии с `NavigationDrawerStyle`.
- Перевести `TabBarItemStyle` на `StatefulValue` для формы, текстового стиля, цветов и размеров item-а по аналогии с `NavigationDrawerItemStyle`.
- Добавить `TabBarMotionStyle` и `TabBarItemMotionStyle` в motion-пакеты `sdds-core:uikit-compose`.
- Добавить перегрузку `TabBar`, где `motion: Motion` является обязательным параметром; существующая перегрузка должна делегировать в новую.
- Добавить перегрузку `TabBarItem` с одним обязательным параметром `icon`, без `interactionSource` в публичной сигнатуре и с последним необязательным параметром `motion: Motion`; существующие перегрузки должны делегировать в новую.
- Сохранить обратную совместимость существующих вызовов `TabBar` и `TabBarItem`, кроме расширения публичного API новыми overload-ами.

## Capabilities

### New Capabilities
- `tab-bar-compose-motion`: Контракт StatefulValue-стилей, motion-стилей и overload-ов для Compose-компонентов `TabBar` и `TabBarItem`.

### Modified Capabilities

## Impact

- Затронут included build `sdds-core`, модуль `uikit-compose`.
- Изменение влияет на публичный Compose API `TabBar`, `TabBarItem`, `TabBarStyle`, `TabBarItemStyle` и добавляет новые motion style API.
- Токены, Gradle conventions и docs generation напрямую не меняются, но token-generated стили могут потребовать адаптации к новым StatefulValue-полям.
- Валидация: сфокусированная сборка/проверка `:sdds-core:uikit-compose` и проверки мест использования TabBar/TabBarItem в integration fixtures и token modules.
