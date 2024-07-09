package com.example.test5

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class creditcard : AppCompatActivity() {

/*


    private lateinit var binding: CreditcarddetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CreditcarddetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val textview=binding.cardPreviewName
        binding.cardName.addTextChangedListener(object :TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
           binding.cardPreviewName.setText(s)
            }


        })
    }

*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creditcarddetails)
        val editText =findViewById<EditText>(R.id.card_name)
        val textView=findViewById<TextView>(R.id.card_preview_name)

        val numberr=findViewById<EditText>(R.id.card_number)
        val numberT=findViewById<TextView>(R.id.card_preview_number)

        val datee=findViewById<EditText>(R.id.expiry_date)
        val dateT=findViewById<TextView>(R.id.card_preview_expiry)


        val cvcc=findViewById<EditText>(R.id.cvc)
        val cvcT=findViewById<TextView>(R.id.card_preview_type)

        editText.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().length > 0) {
                    textView.setText(s)
                }
            }
               // textView.setText(s)

        })


        numberr.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().length < 17) {
                    numberT.setText(s)
                }
            }
        })




        datee.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {

                    dateT.setText(s)

            }


        })



    }

}