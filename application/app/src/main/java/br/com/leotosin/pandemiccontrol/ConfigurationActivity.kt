package br.com.leotosin.pandemiccontrol

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import br.com.leotosin.pandemiccontrol.setting.Configuration

class ConfigurationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuration)

        val counter : TextView = findViewById(R.id.currentCounting)
        val counting = this.getStoredCounting()
        counter.text = counting
    }

    fun save(view : View)
    {
        val counter : TextView = findViewById(R.id.currentCounting)
        val counting = (counter.text.toString().toInt()).toString()
        this.updateCounting(counting)
    }

    private fun updateCounting(counting :String)
    {
        val preferences : SharedPreferences = getSharedPreferences(
                Configuration.CONFIG_FILE,
                0
        )
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(Configuration.STORED_COUNTING, counting)
        editor.commit()
    }

    private fun getStoredCounting() :String?
    {
        val preferences : SharedPreferences = getSharedPreferences(
                Configuration.CONFIG_FILE,
                0
        )
        return preferences.getString(
                Configuration.STORED_COUNTING,
                getString(R.string.startCounting)
        )
    }
}