package com.example.fragmentos2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.fragmentos2.databinding.ActivityMainBinding
import androidx.fragment.app.FragmentTransaction
import android.view.View


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mostrameElFragmentoDeInicio()
    }

    private fun mostrameElFragmentoDeInicio() {
        //1- hacer fragmento visible
        binding.fragmentContainerView.visibility = View.VISIBLE
        //2- crear variable para manejar
        val fragmento : FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmento.add(R.id.fragmentContainerView, FragmentInicio() )
        fragmento.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.btnAcercaDe -> {
                abrirFragmentoAcercaDe()
            }
        }
        return super.onOptionsItemSelected(item)
    }



    private fun abrirFragmentoAcercaDe() {
        binding.fragmentContainerView.visibility = View.VISIBLE
        val fragmento: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmento.replace(R.id.fragmentContainerView, AcercaDe())
        fragmento.commit()
    }

}