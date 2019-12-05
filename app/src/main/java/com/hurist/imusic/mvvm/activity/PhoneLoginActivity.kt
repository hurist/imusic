package com.hurist.imusic.mvvm.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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

        clear.setOnClickListener {
            input.setText("")
        }

        input.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }

}
