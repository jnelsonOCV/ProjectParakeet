package com.testing.test

import com.testing.test.ui.home.HomeFragment
import org.junit.Test

class HomeSwitchUnitTest {
    @Test
    fun switch_isOff() {
        val homeFrag = HomeFragment()
        if (homeFrag.view != null && !homeFrag.switch.isChecked) {
            assert(homeFrag.switchText.text.toString() == "Off")
        }
    }

    @Test
    fun switch_isOn() {
        val homeFrag = HomeFragment()
        if (homeFrag.view != null) {
            homeFrag.switch.isChecked = true
            assert(homeFrag.switchText.text.toString() == "On")
        }
    }

    @Test
    fun performAddition_Nominal() {
        val num1 = 5
        val num2 = 13
        val expected = num1 + num2
        val actual = HomeFragment().performAddition(num1, num2)
        assert(actual == expected)
    }
}