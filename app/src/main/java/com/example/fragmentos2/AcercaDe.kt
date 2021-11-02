package com.example.fragmentos2

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentos2.databinding.FragmentAcercaDeBinding
import com.example.fragmentos2.databinding.FragmentInicioBinding


class AcercaDe : Fragment() {

    private var _binding: FragmentAcercaDeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAcercaDeBinding.inflate(inflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)
        binding.btnCalificar.setOnClickListener { abrirPlayStore() }
    }

    private fun abrirPlayStore() {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.orugga.correoandroid&hl=es_AR&gl=US")))
        /*val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(
                "https://play.google.com/store/apps/details?id=com.orugga.correoandroid&hl=es_AR&gl=US")
            setPackage("com.android.vending")
        }
        startActivity(intent)
        */
    }

}