package com.app.AcademikMobile.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.app.AcademikMobile.MainActivity
import com.app.AcademikMobile.R
import com.app.AcademikMobile.databinding.FragmentHomeBinding
import com.app.akademikapp.ui.main.AdminFragment

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)

        binding.btnMasukMahasiswa.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MahasiswaFragment())
                .addToBackStack(null)
                .commit()
        }

        binding.btnMasukAdmin.setOnClickListener {
            (activity as? MainActivity)?.replaceFragment(AdminFragment())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}