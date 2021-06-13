package com.sweethome.view

import android.content.Context
import android.util.AttributeSet
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat

class AddToCartButton : androidx.appcompat.widget.AppCompatButton {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(info)
//        info.addAction(
//            AccessibilityNodeInfo.AccessibilityAction(
//                AccessibilityNodeInfo.ACTION_CLICK,
//                "Добавить в корзину"
//            )
//        )
//        val node = AccessibilityNodeInfoCompat.wrap(info)
//        node.roleDescription = "Добавлено в корзину"
    }

}