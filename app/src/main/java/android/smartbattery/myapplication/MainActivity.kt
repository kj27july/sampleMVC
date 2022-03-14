package android.smartbattery.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.smartbattery.myapplication.model.AppVersionModel
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var appVersion:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        appVersion = findViewById(R.id.version)
        setVersionOnUI()
    }

    private fun setVersionOnUI() {
        appVersion.text =AppVersionModel.getAppVersionName()
    }
}