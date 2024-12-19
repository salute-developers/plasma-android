package com.sdds.playground.sandbox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sdds.playground.sandbox.activities.compose.SandboxActivityCompose
import com.sdds.playground.sandbox.activities.vs.SandboxActivity

/**
 * Стартовая Активити демо-приложения
 */
class MainSandboxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sandbox)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.bView).setOnClickListener {
            startActivity(Intent(this, SandboxActivity::class.java))
        }

        findViewById<Button>(R.id.bCompose).setOnClickListener {
            startActivity(Intent(this, SandboxActivityCompose::class.java))
        }
    }
}
