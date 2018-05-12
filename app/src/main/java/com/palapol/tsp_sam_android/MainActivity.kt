package com.palapol.tsp_sam_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.palapol.tsp_sam_android.student_activity.StudentActivity
import com.palapol.tsp_sam_android.teacher_activity.TeacherActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            login_btn -> {
                when {
                    username.text.toString() == "1" -> {
                        Toast.makeText(this, "Going to student activity",Toast.LENGTH_LONG).show()
                        startActivity(Intent(this, StudentActivity::class.java))
                    }
                    username.text.toString() == "2" -> {
                        Toast.makeText(this, "Going to teacher activity",Toast.LENGTH_LONG).show()
                        startActivity(Intent(this, TeacherActivity::class.java))
                    }
                    else -> Toast.makeText(this, "Something went wrong!",Toast.LENGTH_LONG).show()
                }
            }
        }
    }

}
