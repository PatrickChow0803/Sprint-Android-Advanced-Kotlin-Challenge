package com.patrickchow.advancedkotlinsprintchallenge.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.patrickchow.advancedkotlinsprintchallenge.MainActivity
import com.patrickchow.advancedkotlinsprintchallenge.R
import kotlinx.android.synthetic.main.controller_result.view.*

// Extends BaseControl which is a child of Controller
class ResultControl : Controller {

    constructor() : super()
    constructor(args: Bundle?) : super(args) {
        args?.getInt(MainActivity.BUNDLE_KEY)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
            val view = inflater.inflate(R.layout.controller_result, container, false)

            val result = args.getInt(MainActivity.BUNDLE_KEY)

            view.tv_result_top_left.text = result.toString()

            return view
        }

}