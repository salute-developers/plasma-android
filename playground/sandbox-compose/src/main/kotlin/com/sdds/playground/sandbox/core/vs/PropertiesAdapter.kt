package com.sdds.playground.sandbox.core.vs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.sdds.playground.sandbox.databinding.LayoutSwitchPropertyItemBinding
import com.sdds.playground.sandbox.databinding.LayoutValuePropertyItemBinding

/**
 * [RecyclerView.Adapter] для списка свойств компонентов
 * @author Малышев Александр on 01.08.2024
 */
internal class PropertiesAdapter : RecyclerView.Adapter<PropertiesAdapter.PropertyHolder<Property<*>>>() {

    private val properties = mutableListOf<Property<*>>()

    private var interactionListener: InteractionListener? = null

    /**
     * Слушатель взаимодействий со списком свойств
     */
    fun interface InteractionListener {

        /**
         * Выбор свойства [property]
         */
        fun onSelect(property: Property<*>)
    }

    /**
     * Обновляет список свойств
     * @param properties новый список свойств
     */
    fun updateProperties(properties: List<Property<*>>) {
        val diffCallback = PropertiesDiffUtilCallback(this.properties, properties)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.properties.clear()
        this.properties.addAll(properties)
        diffResult.dispatchUpdatesTo(this)
    }

    /**
     * Устанавливает слушатель взаимодействий [interactionListener]
     * @see InteractionListener
     */
    fun setInteractionListener(interactionListener: InteractionListener?) {
        this.interactionListener = interactionListener
    }

    override fun getItemViewType(position: Int): Int {
        return ViewHolderFactory.getItemViewType(properties[position])
    }

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertyHolder<Property<*>> {
        return ViewHolderFactory.createHolder(parent, viewType) as PropertyHolder<Property<*>>
    }

    override fun getItemCount(): Int = properties.size

    override fun onBindViewHolder(holder: PropertyHolder<Property<*>>, position: Int) {
        val property = properties[position]
        holder.bind(property, interactionListener)
    }

    override fun onViewRecycled(holder: PropertyHolder<Property<*>>) {
        super.onViewRecycled(holder)
        holder.unbind()
    }

    abstract class PropertyHolder<in T : Property<*>>(itemView: View) : RecyclerView.ViewHolder(itemView) {

        open fun bind(property: T, interactionListener: InteractionListener?) {
            itemView.setOnClickListener { interactionListener?.onSelect(property) }
        }

        open fun unbind() {
            itemView.setOnClickListener(null)
        }
    }

    class SingleChoicePropertyHolder(
        private val binding: LayoutValuePropertyItemBinding,
    ) : PropertyHolder<Property.SingleChoiceProperty>(binding.root) {

        override fun bind(property: Property.SingleChoiceProperty, interactionListener: InteractionListener?) {
            super.bind(property, interactionListener)
            binding.apply {
                propertyName.text = property.name
                propertyValue.text = property.value
            }
        }
    }

    class StringPropertyHolder(
        private val binding: LayoutValuePropertyItemBinding,
    ) : PropertyHolder<Property.StringProperty>(binding.root) {

        override fun bind(property: Property.StringProperty, interactionListener: InteractionListener?) {
            super.bind(property, interactionListener)
            binding.apply {
                propertyName.text = property.name
                propertyValue.text = property.value
                root.setOnClickListener { interactionListener?.onSelect(property) }
            }
        }
    }

    class IntPropertyHolder(
        private val binding: LayoutValuePropertyItemBinding,
    ) : PropertyHolder<Property.IntProperty>(binding.root) {

        override fun bind(property: Property.IntProperty, interactionListener: InteractionListener?) {
            super.bind(property, interactionListener)
            binding.apply {
                propertyName.text = property.name
                propertyValue.text = property.value.toString()
                root.setOnClickListener { interactionListener?.onSelect(property) }
            }
        }
    }

    class SwitchPropertyHolder(
        private val binding: LayoutSwitchPropertyItemBinding,
    ) : PropertyHolder<Property.BooleanProperty>(binding.root) {

        override fun bind(property: Property.BooleanProperty, interactionListener: InteractionListener?) {
            super.bind(property, interactionListener)
            binding.apply {
                propertyName.text = property.name
                propertySwitch.isChecked = property.value
                root.setOnClickListener { interactionListener?.onSelect(property) }
            }
        }
    }
}

private class PropertiesDiffUtilCallback(
    private val old: List<Property<*>>,
    private val new: List<Property<*>>,
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = old.size

    override fun getNewListSize(): Int = new.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return old[oldItemPosition].name == new[newItemPosition].name
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return old[oldItemPosition] == new[newItemPosition]
    }
}

private object ViewHolderFactory {

    const val VIEW_TYPE_SINGLE_CHOICE_PROPERTY = 1
    const val VIEW_TYPE_STRING_PROPERTY = 2
    const val VIEW_TYPE_INT_PROPERTY = 3
    const val VIEW_TYPE_SWITCH_PROPERTY = 4

    fun getItemViewType(property: Property<*>): Int {
        return when (property) {
            is Property.BooleanProperty -> VIEW_TYPE_SWITCH_PROPERTY
            is Property.IntProperty -> VIEW_TYPE_INT_PROPERTY
            is Property.SingleChoiceProperty -> VIEW_TYPE_SINGLE_CHOICE_PROPERTY
            is Property.StringProperty -> VIEW_TYPE_STRING_PROPERTY
        }
    }

    fun createHolder(parent: ViewGroup, viewType: Int): PropertiesAdapter.PropertyHolder<*> =
        when (viewType) {
            VIEW_TYPE_SINGLE_CHOICE_PROPERTY -> PropertiesAdapter.SingleChoicePropertyHolder(
                LayoutValuePropertyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            )

            VIEW_TYPE_STRING_PROPERTY -> PropertiesAdapter.StringPropertyHolder(
                LayoutValuePropertyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            )

            VIEW_TYPE_INT_PROPERTY -> PropertiesAdapter.IntPropertyHolder(
                LayoutValuePropertyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            )

            VIEW_TYPE_SWITCH_PROPERTY -> PropertiesAdapter.SwitchPropertyHolder(
                LayoutSwitchPropertyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            )

            else -> throw IllegalArgumentException("Unknown viewType = $viewType")
        }
}
