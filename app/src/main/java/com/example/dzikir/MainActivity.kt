package com.example.dzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val crdTasbih: CardView = findViewById(R.id.crd_tasbih)
        crdTasbih.setOnClickListener(this)

        val crdPagi: CardView = findViewById(R.id.crd_pagi)
        crdPagi.setOnClickListener(this)

        val crdPetang: CardView = findViewById(R.id.crd_petang)
        crdPetang.setOnClickListener(this)

        val crdDoa: CardView = findViewById(R.id.crd_doa)
        crdDoa.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v?.id){
            R.id.crd_tasbih -> {
                val moveTasbih = Intent(this@MainActivity, TasbihActivity::class.java)
                startActivity(moveTasbih)
            }

            R.id.crd_pagi ->{
                val movePagi = Intent(this@MainActivity, PagiActivity::class.java)
                startActivity(movePagi)
            }

            R.id.crd_petang -> {
                val movePetang = Intent(this@MainActivity, PetangActivity::class.java)
                startActivity(movePetang)
            }
            R.id.crd_doa -> {
                val moveDoa = Intent(this@MainActivity, DoaActivity::class.java)
                startActivity(moveDoa)
            }
        }
    }
}