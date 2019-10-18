package com.patrickchow.advancedkotlinsprintchallenge.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler
import com.patrickchow.advancedkotlinsprintchallenge.R
import kotlinx.android.synthetic.main.controller_multiply.view.*


// Extends BaseControl which is a child of Controller
class MultiplyControl :BaseControl(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_multiply, container, false)

        view.btn_multiply.setOnClickListener {

            //Makes it so that the view transitions to Result Control
            router.pushController(RouterTransaction.with(ResultControl())
                //Gives the transition a horizontal slide animation going from MultiplyControl to ResultControl
                .pushChangeHandler(HorizontalChangeHandler())
                //Gives the transition a horizontal slide when going backwards.
                .popChangeHandler(HorizontalChangeHandler()))
        }

        return view
    }

}