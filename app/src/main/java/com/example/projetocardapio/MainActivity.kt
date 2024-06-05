package com.example.projetocardapio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import com.example.projetocardapio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var total: Double = 0.0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcular.setOnClickListener(this)
        binding.confirmarpedido.setOnClickListener(this)

        binding.opcao1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 42
            } else {
                total -= 42
            }

        }
        binding.opcao2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 30
            } else {
                total -= 30
            }

        }
        binding.opcao3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 19
            } else {
                total -= 19
            }

        }
        binding.opcao4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 29
            } else {
                total -= 29
            }

        }
        binding.opcao5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 9
            } else {
                total -= 9
            }

        }
        binding.opcao6.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 7
            } else {
                total -= 7
            }

        }
        binding.opcao7.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 6
            } else {
                total -= 6
            }

        }
        binding.opcao8.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 4.50
            } else {
                total -= 4.50
            }

        }
        binding.opcao9.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 2.50
            } else {
                total -= 2.50
            }

        }
        binding.opcao10.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 5
            } else {
                total -= 5
            }

        }
        binding.opcao11.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 3.50
            } else {
                total -= 3.50
            }

        }
        binding.opcao12.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 4.50
            } else {
                total -= 4.50
            }

        }
        binding.opcao13.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 4.50
            } else {
                total -= 4.50
            }

        }
        binding.opcao14.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 1
            } else {
                total -= 1
            }

        }
        binding.opcao15.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 1.50
            } else {
                total -= 1.50
            }

        }
        binding.opcao16.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                total += 2.50
            } else {
                total -= 2.50
            }

        }


    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.calcular -> calcular()
            R.id.confirmarpedido -> confirmarpedido()
        }
    }


    private fun calcular() {
        if (total > 0) {
            var textNew = "R$ %.2f".format(total)
            binding.mudarpreco.text = textNew
        } else {
            binding.mudarpreco.text = "R$ 0,00"
            Toast.makeText(
                this,
                "Você precisa selecionar algum pedido para calcular",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun confirmarpedido() {
        if (total == 0.0) {
            Toast.makeText(this, "Você precisa selecionar o pedido antes", Toast.LENGTH_SHORT)
                .show()
        } else {
            calcular()
            Toast.makeText(this, "Pedido confirmado com sucesso!", Toast.LENGTH_SHORT).show()
        }
    }


}