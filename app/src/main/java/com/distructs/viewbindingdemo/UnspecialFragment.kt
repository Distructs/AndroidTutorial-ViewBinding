package com.distructs.viewbindingdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.distructs.viewbindingdemo.databinding.FragmentUnspecialBinding

class UnspecialFragment : Fragment() {
    private var _binding: FragmentUnspecialBinding? = null

    // NOTE: This property is only valid between onCreateView and onDestroyView
    // See [https://developer.android.com/guide/fragments/lifecycle] for an overview
    // on the lifecycle of fragments
    private val binding: FragmentUnspecialBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUnspecialBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // You can safely reference your views here!
        binding.mTextView.text = "I am a special text in an unspecial fragment \uD83E\uDD72"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}