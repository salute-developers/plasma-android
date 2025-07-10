# Package com.sdds.uikit

## Modal

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
Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  

Ниже приведен пример реализации и использования ModalFragment.  
где style - ресурс оверлэй стиля Modal.

```kotlin
val context = requireContext()
val trigger = Button(context).apply {
    id = R.id.popover_trigger
    text = "Show Modal"
    setOnClickListener {
        val fragmentManager = context.findActivity<FragmentActivity>()?.supportFragmentManager
            ?: return@setOnClickListener
        modal(style).show(fragmentManager, "")
    }
}

fun modal(
    style: Int? = null,
): ModalFragment {
    return SimpleModalFragment.newInstance(style)
}

internal class SimpleModalFragment : ModalFragment() {
    private val modalStyle: Int? by lazy { arguments?.getInt(BUNDLE_MODAL_STYLE) }
     override fun onCreateModalOptions(): ModalOptions {
        return ModalOptions.Builder()
            .style(modalStyle)
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

        const val BUNDLE_MODAL_STYLE = "SimpleModalFragment_style"

        fun newInstance(style: Int?): SimpleModalFragment {
            return SimpleModalFragment().apply {
                arguments = bundleOf(
                    BUNDLE_MODAL_STYLE to style,
                )
            }
        }
    }
}
```
