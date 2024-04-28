package com.example.reverse_array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    private lateinit var displayButton: Button
    private lateinit var editText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton = findViewById<Button>(R.id.addButton)
        displayButton = findViewById<Button>(R.id.displayButton)
        editText = findViewById<EditText>(R.id.editText)
        resultTextView = findViewById<TextView>(R.id.resultTextView)

        val array = ArrayList<String>()

        addButton.setOnClickListener {
            val input = editText.text.toString()
            if (input.isNotEmpty()) {
                array.add(input)
                editText.text.clear()
            }
        }

        displayButton.setOnClickListener {
            var index = array.size - 1
            var reversedArray = ""

            while (index >= 0) {
                reversedArray += "${array[index]} "
                index--
            }

            resultTextView.text = "Reversed Array: $reversedArray"
        }
    }
}
