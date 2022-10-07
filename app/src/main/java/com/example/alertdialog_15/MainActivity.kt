package com.example.alertdialog_15

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //createSimpleDialog()
        createMultiSimpleChoiceDialog()
    }

    private fun createSimpleDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog")
        builder.setMessage("This is My first Alert Dialog?")

        builder.setNeutralButton("Info") { _, _ ->
            textViewInfo.text = "Information is temporarily unavailable"
        }

        builder.setNegativeButton("No") { _, _ ->
            textViewInfo.text = "The answer is wrong"
        }

        builder.setPositiveButton("Yes") { _, _ ->
            textViewInfo.text = "The answer is correct"
        }

        builder.show()
    }

    private fun createMultiSimpleChoiceDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("What do you want to be in the future?")

        builder.setMultiChoiceItems(R.array.multi_item, null) { _, _, _ ->

        }

        builder.setNegativeButton("No") { _, _ ->

        }

        builder.setPositiveButton("Yes") { _, _ ->
            textViewInfo.text = "So be it!!!"
        }

        builder.show()
    }
}