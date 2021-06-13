package com.sweethome.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import com.sweethome.R

class CartButton : FrameLayout {

    lateinit var label: TextView

    var itemsCount: Int
        get() {
            return label.text.toString().toIntOrNull() ?: 0
        }
        set(value) {
            label.text = value.toString()
            contentDescription =
                context.resources.getQuantityString(R.plurals.a_cart_button, value, value)
            if (value == 0) label.visibility = View.GONE
        }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onFinishInflate() {
        super.onFinishInflate()
        label = findViewById(R.id.cart_items_count)
    }

    override fun getAccessibilityClassName(): CharSequence {
        return Button::class.java.name
    }

}