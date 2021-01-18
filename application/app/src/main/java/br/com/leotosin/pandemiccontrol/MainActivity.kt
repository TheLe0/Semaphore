package br.com.leotosin.pandemiccontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings :FloatingActionButton = findViewById(R.id.settingsButton)
        settings.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }

    fun increaseOne(view: View)
    {
        val counter : TextView = findViewById(R.id.countingField)
        counter.text = (counter.text.toString().toInt() + 1).toString()
    }

    fun decreaseOne(view: View)
    {
        val counter : TextView = findViewById(R.id.countingField)
        counter.text = (counter.text.toString().toInt() - 1).toString()
    }

    fun reset(view: View)
    {
        val counter : TextView = findViewById(R.id.countingField)
        counter.text = getString(R.string.startCounting)
    }
}