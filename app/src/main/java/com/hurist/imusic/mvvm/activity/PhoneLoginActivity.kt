package com.hurist.imusic.mvvm.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.hurist.imusic.R
import com.hurist.imusic.mvvm.viewmodel.PhoneLoginViewModel

import kotlinx.android.synthetic.main.activity_phone_login.*

class PhoneLoginActivity : AppCompatActivity() {

    private var step = 0
    private val viewModel: PhoneLoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_login)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel.phone.observe(this, Observer {
            input.setText(it)
        })

        button.setOnClickListener {
        }
    }

}
