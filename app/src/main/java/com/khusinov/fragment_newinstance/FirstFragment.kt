package com.khusinov.fragment_newinstance

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_first, container, false)

        root.button.setOnClickListener {
            val str = root.edittext.text.toString()

            val secondFragment = SecondFragment.newInstance(str)

            fragmentManager?.beginTransaction()
                ?.replace(R.id.container, secondFragment)
                ?.addToBackStack("first")
                ?.commit()
        }

        return root
    }

}