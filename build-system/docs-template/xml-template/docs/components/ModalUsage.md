---
title: Modal
---

Модальное окно — это всплывающее окно, появляющееся поверх текущей страницы и блокирующее доступ к основному содержимому страницы.  
Для создания модального окна необходимо реализовать наследника ModalFragment, отображение которого осуществляется  
через DialogFragment(). Конфигурирование осуществляется через ModalOptions.

## Стиль Modal

Существует заранее сконфигурированный стиль. Так же можно настроить стиль самостоятельно.  
Для создания стиля Modal предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_background|цвет фона Notification|color,reference|
|sd_shapeAppearance|форма скругления углов|reference|
|sd_shadowAppearance|стиль тени|reference|
|sd_closeIcon|иконка закрытия|reference|
|sd_closeIconTint|цвет иконки|color|
|sd_closeIconSize|размер иконки|dimension|
|sd_closeIconContentPadding|отступ иконки|dimension|

Для изменения размера (ширины/высоты), паддингов применяются стандартные атрибуты android.  
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](../theme/ShapeAppearance.md#sd_shapeappearance).  

Ниже приведен пример реализации и использования ModalFragment.  
где style - ресурс оверлэй стиля Modal.

```kotlin
fun showModal() {
    SimpleModalFragment.newInstance()
        .show(getSupportFragmentManager())
}


internal class SimpleModalFragment : ModalFragment() {
     override fun onCreateModalOptions(): ModalOptions {
        return ModalOptions.Builder()
            .style(R.style.AppModalStyle)
            .width(300.dp)
            .dimBackground(true)
            .hasClose(true)
            .build()
    }
    override fun getContentView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return TextView(requireContext()).apply {
            text = "Modal"
        }
    }
    internal companion object {

        fun newInstance(): SimpleModalFragment {
            return SimpleModalFragment()
        }
    }
}
```
