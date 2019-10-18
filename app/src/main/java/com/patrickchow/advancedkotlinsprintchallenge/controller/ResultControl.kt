package com.patrickchow.advancedkotlinsprintchallenge.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.patrickchow.advancedkotlinsprintchallenge.R

// Extends BaseControl which is a child of Controller
class ResultControl : BaseControl(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_result, container, false)

        return view
    }

}