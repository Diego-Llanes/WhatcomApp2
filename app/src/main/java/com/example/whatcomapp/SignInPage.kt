package com.example.whatcomapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.whatcomapp.databinding.FragmentSecondBinding
import com.example.whatcomapp.databinding.SignInPageBinding



class SignInPage : Fragment() {
    private var _binding: SignInPageBinding? = null
    private val binding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SignInPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    //TODO : add onViewCreated method for navigation

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}