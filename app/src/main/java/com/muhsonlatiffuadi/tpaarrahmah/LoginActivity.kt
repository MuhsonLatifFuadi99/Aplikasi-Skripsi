package com.muhsonlatiffuadi.tpaarrahmah

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhsonlatiffuadi.tpaarrahmah.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var sharedPreferences: SharedPreferences
    private var status : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//    onLoading(false)
//    btLogin.setOnClickListener {
//        doLogin(etUsername.text.toString(), etPassword.text.toString())
//    }
//
//    }
//
//    fun doLogin(username: String, password: String) {
//        onLoading(true)
//        RetrofitClient.endpoint.loginGuru(username, password)
//            .enqueue(object : Callback<ResponseLogin> {
//                override fun onFailure(call: Call<ResponseLogin>, t: Throwable) {
//                    onLoading(false)
//                }
//
//                override fun onResponse(
//                    call: Call<ResponseLogin>,
//                    response: Response<ResponseLogin>
//                ) {
//                    onLoading(false)
//                    if (response.isSuccessful) {
//                        val responseLogin: ResponseLogin? = response.body()
//                        showMessage (responseLogin!!.msg)
//                    }
//                }
//
//            } )
//
//    }
//
//
//    fun onLoading(loading: Boolean) {
//        when (loading) {
//            true -> {
//                progress.visibility = View.VISIBLE
//                btLogin.visibility = View.GONE
//            }
//            false -> {
//                progress.visibility = View.GONE
//                btLogin.visibility = View.VISIBLE
//
//            }
//        }
//
//        fun showMessage(message: String){
//            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
//        }
//}



        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("app",Context.MODE_PRIVATE)

        binding.btLogin.setOnClickListener {
            val user = binding.etUsername.text.toString()
            val pass = binding.etPassword.text.toString()
            if (user.isNullOrEmpty()){
                binding.etUsername.error = "Kosong"
                binding.etUsername.requestFocus()
            }else if(pass.isNullOrEmpty()){
                binding.etPassword.error = "Kosong"
                binding.etPassword.requestFocus()
            }else{
                val input = sharedPreferences.edit()
                input.putBoolean("status",true)
                input.putString("username",user)
                input.putString("password",pass)
                input.commit()

                startActivity(Intent(this@LoginActivity,MenuUtamaActivity::class.java))
                finish()
            }
        }
    }


    override fun onResume() {
        super.onResume()
        status = sharedPreferences.getBoolean("status", false)
        if (status){

            startActivity(Intent(this@LoginActivity,MenuUtamaActivity::class.java))
            finish()
        }
    }
}