package com.example.checkboxlach
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder
class MainActivity : AppCompatActivity() {
    lateinit var rollo: CheckBox
    lateinit var soup: CheckBox
    lateinit var burgier: CheckBox
    lateinit var spaghetti: CheckBox
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        rollo = findViewById(R.id.checkBox1)
        soup = findViewById(R.id.checkBox2)
        burgier = findViewById(R.id.checkBox3)
        spaghetti = findViewById(R.id.checkBox4)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items")
            if (rollo.isChecked) {
                result.append("\nRollo 7USD")
                totalAmount += 7
            }
            if (soup.isChecked) {
                result.append("\nTomato soup 4USD")
                totalAmount += 4
            }
            if (spaghetti.isChecked) {
                result.append("\nspaghetti bolonese 6USD")
                totalAmount += 6
            }
            if (burgier.isChecked) {
                result.append("\nBurgier 8USD")
                totalAmount += 8
            }
            result.append("\nTotal: " + totalAmount + "USD")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}