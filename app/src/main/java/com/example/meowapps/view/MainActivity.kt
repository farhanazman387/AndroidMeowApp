package com.example.meowapps.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meowapps.R
import com.example.meowapps.databinding.ActivityPetInfoBinding
import com.example.meowapps.viewmodel.PetViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPetInfoBinding
    private val viewModel: PetViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pet_info)
        binding = ActivityPetInfoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel.pet.observe(this){ petInfo ->
            binding.textView.text = "Your Cat is ${petInfo.name}, age ${petInfo.age}";
        }

        binding.saveBtn.setOnClickListener {
            val name = binding.petNameET.text.toString()
            val age = binding.petAgeET.text.toString().toIntOrNull() ?: 0

            viewModel.updatePetData(name,age)
        }

        setContent{
            PetInfoCompose()
        }
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}