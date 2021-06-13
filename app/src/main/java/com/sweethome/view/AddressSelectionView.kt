package com.sweethome.view

import android.content.Context
import android.util.AttributeSet
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.CheckBox
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.sweethome.R

class AddressSelectionView : ConstraintLayout {
    
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
        findViewById<CheckBox>(R.id.checkbox)
    }

    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(info)
        val node = AccessibilityNodeInfoCompat.wrap(info)
        node.isChecked = findViewById<CheckBox>(R.id.checkbox).isChecked
    }
}