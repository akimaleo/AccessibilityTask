package com.sweethome.view

import android.content.Context
import android.util.AttributeSet
import android.widget.CheckBox
import androidx.constraintlayout.widget.ConstraintLayout
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

    init {

    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        findViewById<CheckBox>(R.id.checkbox)

    }
}