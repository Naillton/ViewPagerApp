package com.example.viewpagerapp.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerapp.MainActivity
import com.example.viewpagerapp.fragments.FragmentOne
import com.example.viewpagerapp.fragments.FragmentThree
import com.example.viewpagerapp.fragments.FragmentTwo

// criando classe que receber como parametro a activity principal do projeto
// onde a classe adaptadora recebe como tipo o estado do fragmento
class MyAdapter(mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {
    // atributos
    // definimos o tamanho dos fragmentos pela quantidade de fragments criadas
    private val Fragments_Size = 3

    //methods
    // o metodo getItemCount ira retornar a nossa quantidade de fragments
    override fun getItemCount(): Int {
        return this.Fragments_Size
    }

    // o metodo createFragment cria nossos fragmentos atraves de sua posicao
    // usamos o when para especificar qual fragment devemos criar atraves da posicao
    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
        }
        return Fragment()
    }
}