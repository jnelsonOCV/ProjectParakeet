package com.testing.test.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.testing.test.R
import org.w3c.dom.Text

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    lateinit var switch: Switch
    lateinit var switchText : TextView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        switchText = root.findViewById(R.id.switch_label)
        switch = root.findViewById(R.id.switch_view)
        switch.setOnCheckedChangeListener { _: CompoundButton, isChecked: Boolean ->
            switchText.text =  if (isChecked) "On" else "Off"
        }
        return root
    }

    fun performAddition(num1: Int, num2: Int) : Int {
        return 0
    }
}
