package com.distructs.viewbindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.distructs.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // The binding class will be initialized in the onCreate method
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1st constructor option
        binding = ActivityMainBinding.inflate(layoutInflater)
        // 2nd constructor option
        //binding = ActivityMainBinding.inflate(layoutInflater, null, false)

        // Refers to the 'root' view of the layout file.
        // In this case it points to the constraint layout at the root of "activity_main.xml"
        val view = binding.root

        // We set the content to the 'root' of the binding class
        setContentView(view)

        // We can now reference any views through the binding class
        binding.updateButton.setOnClickListener {
            val randomString = "${(5..1000).random()} items for you!"
            binding.resultTextView.text = randomString
        }
    }
}