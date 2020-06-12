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
}