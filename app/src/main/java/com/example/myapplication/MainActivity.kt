package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder as ExpressionBuilder1

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Ac.setOnClickListener {
            binding.inputtext.text = ""
            binding.outputtext.text = ""
        }
        binding.zero.setOnClickListener {
            binding.inputtext.append("0")
        }
        binding.one.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.two.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.three.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.four.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.five.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.six.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.seven.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.eight.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.nine.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.dot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.minus.setOnClickListener {
            binding.inputtext.append("-")
        }
        binding.end.setOnClickListener {
            binding.inputtext.append(")")
        }
        binding.start.setOnClickListener {
            binding.inputtext.append("(")
        }
        binding.plus.setOnClickListener {
            binding.inputtext.append("+")
        }
        binding.divide.setOnClickListener {
            binding.inputtext.append("/")
        }
        binding.mult.setOnClickListener {
            binding.inputtext.append("*")
        }
        binding.equal.setOnClickListener{
        val expression = ExpressionBuilder1(binding.inputtext.text.toString()).build()
        val result = expression.evaluate()
        val longres = result.toLong()
        if (result==longres.toDouble()){
            binding.outputtext.text = longres.toString()
        }
        else{
            binding.outputtext.text = result.toString()
        }
    }
    }
}