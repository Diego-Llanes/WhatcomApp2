package com.example.whatcomapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.whatcomapp.databinding.SignUpPageBinding
import com.example.whatcomapp.databinding.FragmentSecondBinding
import com.example.whatcomapp.databinding.SignInPageBinding


/**
 * A simple [Fragment] subclass.
 * Use the [SignInPage.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignInPage : Fragment() {
    private var _binding: SignInPageBinding? = null
    private val binding get() = binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.sign_in_page, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SignInPage.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SignInPage().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}