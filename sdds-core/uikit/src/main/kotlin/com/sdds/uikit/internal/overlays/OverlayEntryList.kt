package com.sdds.uikit.internal.overlays

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.view.View.MeasureSpec
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.PopupWindow
import androidx.core.view.setPadding
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.getScreenRect
import com.sdds.uikit.overlays.OverlayEntry
import com.sdds.uikit.overlays.OverlayManager
import com.sdds.uikit.overlays.OverlayPosition
import com.sdds.uikit.overlays.getAnimationSpec
import com.sdds.uikit.overlays.isTop
import java.lang.ref.WeakReference
import kotlin.math.max

internal class OverlayAdapter(
    private val itemSpacing: Int,
    private val position: OverlayPosition,
) : ListAdapter<OverlayEntry, OverlayAdapter.ViewHolder>(EntriesDiffUtilCallback) {

    init {
        setHasStableIds(true)
    }

    fun isEmpty(): Boolean {
        return itemCount == 0 || (itemCount == 1 && getItem(0).id == OverlayEntryListView.DUMMY_OVERLAY_ENTRY_ID)
    }

    override fun getItemViewType(position: Int): Int = getItemId(position).toInt()

    override fun getItemId(position: Int): Long {
        return getItem(position).id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FrameLayout(parent.context).apply {
                setPadding(itemSpacing)
                layoutParams = FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                )
            },
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getEntryLayoutParams() = FrameLayout.LayoutParams(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT,
    ).apply {
        gravity = position.toGravity()
    }

    inner class ViewHolder(private val container: ViewGroup) : RecyclerView.ViewHolder(container) {

        fun bind(entry: OverlayEntry) {
            container.removeAllViews()
            container.addView(
                entry.createView(),
                getEntryLayoutParams(),
            )
        }
    }

    private object EntriesDiffUtilCallback : DiffUtil.ItemCallback<OverlayEntry>() {

        override fun areItemsTheSame(oldItem: OverlayEntry, newItem: OverlayEntry): Boolean {
            return oldItem.id == newItem.id
        }

        @Suppress("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: OverlayEntry, newItem: OverlayEntry): Boolean {
            return oldItem == newItem
        }
    }
}

@Suppress("ViewConstructor")
internal class OverlayEntryListView(context: Context, position: OverlayPosition) : RecyclerView(context) {

    private val overlayAdapter: OverlayAdapter = OverlayAdapter(
        context.resources.getDimensionPixelSize(R.dimen.sdds_spacer_2x),
        position,
    )
    private val defaultAnimation = position.getAnimationSpec()

    private var maxMeasuredWidth: Int = 0
    private var maxMeasuredHeight: Int = 0

    private var _listener: Listener? = null
    private val dummyOverlayEntry = createDummyOverlayEntry(context)

    interface Listener {

        fun onEmpty()
    }

    init {
        layoutManager = LinearLayoutManager(context, VERTICAL, position.isTop()).apply {
            stackFromEnd = true
        }
        adapter = overlayAdapter
        overScrollMode = OVER_SCROLL_NEVER
        isFocusable = false
        isClickable = false
        setHasFixedSize(false)
        itemAnimator = OverlayItemAnimator()
        setEmpty()
    }

    fun submitEntries(entries: List<OverlayEntry>) {
        post {
            overlayAdapter.submitList(entries) {
                scrollToPosition(overlayAdapter.itemCount - 1)
            }
        }
    }

    fun clear() {
        overlayAdapter.submitList(emptyList())
        resetMinSize()
        _listener?.onEmpty()
    }

    fun setEmpty() {
        overlayAdapter.submitList(listOf(dummyOverlayEntry))
    }

    fun setListener(listener: Listener) {
        _listener = listener
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        maxMeasuredWidth = max(maxMeasuredWidth, measuredWidth)
        maxMeasuredHeight = max(maxMeasuredHeight, measuredHeight)
        setMeasuredDimension(maxMeasuredWidth, maxMeasuredHeight)
    }

    private fun resetMinSize() {
        maxMeasuredHeight = 0
        maxMeasuredWidth = 0
    }

    private inner class OverlayItemAnimator : DefaultItemAnimator() {
        private val runningRemoveAnimations = mutableSetOf<ViewHolder>()

        override fun animateAdd(holder: ViewHolder): Boolean {
            super.animateAdd(holder)
            val animation = defaultAnimation.enter
            animation(holder.itemView)
            return true
        }

        override fun animateRemove(holder: ViewHolder): Boolean {
            super.animateRemove(holder)
            val animation = defaultAnimation.exit
            animation(holder.itemView)
            return true
        }

        override fun onRemoveStarting(item: ViewHolder) {
            super.onRemoveStarting(item)
            runningRemoveAnimations.add(item)
        }

        override fun onRemoveFinished(item: ViewHolder) {
            super.onRemoveFinished(item)
            runningRemoveAnimations.remove(item)
            if (runningRemoveAnimations.isEmpty() && overlayAdapter.isEmpty()) {
                resetMinSize()
                _listener?.onEmpty()
            }
        }
    }

    companion object {
        const val DUMMY_OVERLAY_ENTRY_ID = -1L
        fun createDummyOverlayEntry(context: Context) = object : OverlayEntry {
            override val id: Long = DUMMY_OVERLAY_ENTRY_ID
            override val durationMillis: Long? = null
            override fun createView(): View {
                return FrameLayout(context)
            }

            override fun show() = Unit
            override fun hide() = Unit
        }
    }
}

@Suppress("ClickableViewAccessibility")
internal class OverlayEntryList(rootView: View, private val position: OverlayPosition) : OverlayManager {
    private val _timeoutHandle: Handler = Handler(Looper.getMainLooper())
    private val _timeoutActions: MutableMap<Long, Runnable> = mutableMapOf()
    private val anchorViewRef: WeakReference<View> = WeakReference(rootView)
    private val passThroughTouchListener: OnTouchListener = OnTouchListener { v, event ->
        val rView = anchorViewRef.get() ?: return@OnTouchListener false
        val anchorLocation = rView.getScreenRect()
        val listLocation = v.getScreenRect()
        val offsetX = (listLocation.left - anchorLocation.left).toFloat()
        val offsetY = (listLocation.top - anchorLocation.top).toFloat()
        event.offsetLocation(offsetX, offsetY)
        rView.dispatchTouchEvent(event)
    }
    private val overlayEntryListViewListener = object : OverlayEntryListView.Listener {
        override fun onEmpty() {
            popupWindow.dismiss()
        }
    }
    private val overlayEntryListView: OverlayEntryListView = OverlayEntryListView(rootView.context, position).apply {
        setOnTouchListener(passThroughTouchListener)
        setListener(overlayEntryListViewListener)
    }
    private val overlayEntries = mutableListOf<OverlayEntry>()
    private val popupWindow = PopupWindow(
        overlayEntryListView,
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT,
        false,
    ).apply {
        isClippingEnabled = true
        isFocusable = false
        inputMethodMode = PopupWindow.INPUT_METHOD_NOT_NEEDED
        softInputMode = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING
        elevation = 0f
        animationStyle = 0
        isAttachedInDecor = true
    }

    override fun show(overlayEntry: OverlayEntry) {
        overlayEntries.add(overlayEntry)
        overlayEntryListView.submitEntries(overlayEntries.toList())

        showIfNeed()

        val duration = overlayEntry.durationMillis
        if (duration != null) {
            val action = Runnable { remove(overlayEntry.id) }
            _timeoutActions[overlayEntry.id] = action
            _timeoutHandle.postDelayed(action, duration)
        }
    }

    override fun remove(id: Long) {
        overlayEntries.removeIf { it.id == id }
        _timeoutActions.remove(id)?.let { _timeoutHandle.removeCallbacks(it) }
        if (overlayEntries.isNotEmpty()) {
            overlayEntryListView.submitEntries(overlayEntries.toList())
        } else {
            overlayEntryListView.setEmpty()
        }
    }

    override fun clear() {
        overlayEntries.clear()
        overlayEntryListView.clear()
        _timeoutHandle.removeCallbacksAndMessages(null)
        _timeoutActions.clear()
    }

    private fun showIfNeed() {
        val anchorView = anchorViewRef.get() ?: return
        if (popupWindow.isShowing) {
            return
        }

        overlayEntryListView.measure(
            MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
            MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
        )
        popupWindow.showAtLocation(anchorView, position.toGravity(), 0, 0)
    }
}

private fun OverlayPosition.toGravity(): Int = when (this) {
    OverlayPosition.TopStart -> Gravity.TOP or Gravity.START
    OverlayPosition.TopCenter -> Gravity.TOP or Gravity.CENTER_HORIZONTAL
    OverlayPosition.TopEnd -> Gravity.TOP or Gravity.END
    OverlayPosition.CenterStart -> Gravity.CENTER_VERTICAL or Gravity.START
    OverlayPosition.Center -> Gravity.CENTER
    OverlayPosition.CenterEnd -> Gravity.CENTER_VERTICAL or Gravity.END
    OverlayPosition.BottomStart -> Gravity.BOTTOM or Gravity.START
    OverlayPosition.BottomCenter -> Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
    OverlayPosition.BottomEnd -> Gravity.BOTTOM or Gravity.END
}
