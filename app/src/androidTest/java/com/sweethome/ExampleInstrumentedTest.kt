package com.sweethome

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.sweethome", appContext.packageName)
    }

    @Test
    fun testPlural() {
        assertEquals("Пустая корзина", getStringFromQuantity(0))
        assertEquals("Корзина 1 элемент", getStringFromQuantity(1))
        assertEquals("Корзина 2 элемента", getStringFromQuantity(2))
        assertEquals("Корзина 5 элементов", getStringFromQuantity(5))

    }

    private fun getStringFromQuantity(count: Int): String {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        return context.resources.getQuantityString(
            R.plurals.a_cart_button,
            count,
            count
        )
    }
}