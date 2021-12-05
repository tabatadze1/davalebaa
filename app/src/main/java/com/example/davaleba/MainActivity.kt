package com.example.davaleba


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class LoginActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmPassword: EditText
    private lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()





        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)
        edtConfirmPassword = findViewById(R.id.edt_confirmpassword)
        btnSignUp = findViewById(R.id.btnSignup)

        btnSignUp.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()
            val confirmpassword = edtConfirmPassword.text.toString()

            if (email.isEmpty() && !email.contains("@")){
                edtEmail.error = "აუცილებელია ველის შევსება"
                return@setOnClickListener
            }else if (password.isEmpty()) {
                edtPassword.error = "აუცილებელია ველის შევსება"
                return@setOnClickListener
            }else if (password.length <= (9)) {
                Toast.makeText(this, "პაროლი უნდა შეიცავდეს 9 სიმბოლოს", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else if (!password.contains("1") and !password.contains("2") and !password.contains("3")
                and !password.contains("4") and !password.contains("5") and !password.contains("6")
                and !password.contains("7") and !password.contains("8") and !password.contains("9")
                and !password.contains("0")){
                Toast.makeText(this, "პაროლი უნდა შეიცავდეს მინიმუმ 1 ციფრს", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else if (confirmpassword.isEmpty()) {
                edtConfirmPassword.error = "აუცილებელია ველის შევსება"
                return@setOnClickListener
            }else if (confirmpassword != password) {
                Toast.makeText(this, "პაროლები არ ემთხვევა ერთმანეთს", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                Toast.makeText(this, "თქვენ დარეგისტრირდით", Toast.LENGTH_SHORT).show()
            }



        }

    }


}