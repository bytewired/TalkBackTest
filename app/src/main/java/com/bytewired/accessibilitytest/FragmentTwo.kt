package com.bytewired.accessibilitytest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_two, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ViewCompat.setAccessibilityPaneTitle(view, "")
        view.findViewById<Button>(R.id.continueButton).setOnClickListener {
            (requireActivity() as MainActivity).goToFragmentThree()
        }
    }
}