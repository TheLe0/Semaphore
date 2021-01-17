package br.com.leotosin.pandemiccontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increaseOne(view: View)
    {
        var counter : TextView = findViewById(R.id.countingField)
        counter.text = (counter.text.toString().toInt() + 1).toString()
    }

    fun decreaseOne(view: View)
    {
        var counter : TextView = findViewById(R.id.countingField)
        counter.text = (counter.text.toString().toInt() - 1).toString()
    }

    fun reset(view: View)
    {
        var counter : TextView = findViewById(R.id.countingField)
        counter.text = getString(R.string.startCounting)
    }
}