package nacc.sergey.testforrentateam.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nacc.sergey.testforrentateam.R

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}